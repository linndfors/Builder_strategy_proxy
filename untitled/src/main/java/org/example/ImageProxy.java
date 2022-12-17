package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

public class ImageProxy implements MyImage{
    @Setter @Getter
    private String fileName;

    @Override
    public JFrame getFrame() {
        RealImage img = new RealImage(fileName);
        return img.getFrame();
    }

    @Override
    public ImageIcon getImageIcon(String filename) {
        RealImage img = new RealImage(filename);
        return img.getImageIcon(filename);
    }

    @Override
    public JLabel getJLabel(ImageIcon icon) {
        RealImage img = new RealImage(fileName);
        return img.getJLabel(icon);
    }
    @Override
    public void display() {
        RealImage img = new RealImage(fileName);
        JFrame frame = img.getFrame();
        frame.setVisible(true);
    }
}
