package com.shpp.p2p.cs.asvidlo.assignment7;

/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import com.shpp.cs.a.simple.SimpleProgram;

import java.awt.event.*;
import javax.swing.*;

public class NameSurfer extends SimpleProgram implements NameSurferConstants {

    private NameSurferGraph display = new NameSurferGraph();

    /**
     * This method has the responsibility for reading in the data base
     * and initializing the interactors at the top of the window.
     */
    public void init() {
        this.add(this.display);
        this.add(new JLabel("Name:"), "North");
        JTextField nameField = new JTextField(30);
        this.add(nameField, "North");
        this.add(new JButton("Graph"), "North");
        this.add(new JButton("Clear"), "North");
        this.addActionListeners();

    }

    /* Method: actionPerformed(e) */

    /**
     * This class is responsible for detecting when the buttons are
     * clicked, so you will have to define a method to respond to
     * button actions.
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Clear")) {
            this.display.clear();
        }
//        else if (e.getActionCommand().equals("Save Matrix")) {
//            this.saveMatrix();
//        } else if (e.getActionCommand().equals("Load Matrix")) {
//            this.loadMatrix();
    }
}
