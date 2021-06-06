/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JButton;

/**
 *
 * @author Delph
 */
public class TableButton extends JButton{
    
    private int row;

    public TableButton(int row, String text) {
        super(text);
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    
    
}
