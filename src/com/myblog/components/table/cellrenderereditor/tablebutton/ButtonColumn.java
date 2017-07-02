package com.myblog.components.table.cellrenderereditor.tablebutton;

import java.awt.Component;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

class ButtonColumn extends AbstractCellEditor implements
		TableCellRenderer, TableCellEditor {
	private static final long serialVersionUID = 2916164448455857517L;
	JButton renderButton;
	JButton editButton;
	String text;

	ButtonColumn() {
		renderButton = new JButton();
		editButton = new JButton();
		editButton.setFocusPainted(false);
	}

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if (hasFocus) {
			renderButton.setForeground(table.getForeground());
			renderButton
					.setBackground(UIManager.getColor("Button.background "));
		} else if (isSelected) {
			renderButton.setForeground(table.getSelectionForeground());
			renderButton.setBackground(table.getSelectionBackground());
		} else {
			renderButton.setForeground(table.getForeground());
			renderButton
					.setBackground(UIManager.getColor("Button.background "));
		}

		renderButton.setText((value == null) ? " " : value.toString());
		return renderButton;
	}

	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		text = (value == null) ? " " : value.toString();
		editButton.setText(text);
		return editButton;
	}

	public Object getCellEditorValue() {
		return text;
	}
}