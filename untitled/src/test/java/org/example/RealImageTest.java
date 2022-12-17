package org.example;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RealImageTest {
    @Test
    public void ImageTest() {
        String filename = "photo.img";
        MyImage img = new RealImage(filename);
        MyImage imgProxy = new ImageProxy();

        ImageIcon icon = imgProxy.getImageIcon(filename);
        System.out.println("Icon: " + icon);
        assertEquals("photo.img", icon.toString());

        JFrame frame = imgProxy.getFrame();
        System.out.println("Frame: " + frame);
        String fr = "javax.swing.JFrame[frame0,0,0,136x39,hidden,layout=java.awt.BorderLayout,title=,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,120x0,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]";
        assertEquals(fr, frame.toString());

        JLabel label = imgProxy.getJLabel(icon);
        System.out.println("Label: " + label);
        String lb = "javax.swing.JLabel[,0,0,120x0,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=javax.swing.ImageIcon@610f7aa,disabledIcon=,horizontalAlignment=CENTER,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=,verticalAlignment=CENTER,verticalTextPosition=CENTER]";
        assertEquals(lb, label.toString());
    }

}