package com.sy.snack; /**
 * Created by Administrator on 2017/7/27.
 */

import javax.swing.JFrame;


public class greedySnackMain extends JFrame {
    snackWin snackwin;
    static final int Width = 800, Height = 600, LocX = 200, LocY = 80;

    public greedySnackMain() {
        snackwin = new snackWin();
        add(snackwin);
        this.setSize(Width, Height);
        this.setVisible(true);
        this.setLocation(LocX, LocY);
        //snackwin.requestFocus();
    }

    public static void main(String[] args) {
        new greedySnackMain();
    }
}