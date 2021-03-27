/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redouan.calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author redu2
 */
public class PanelPrincipal extends JPanel implements MouseListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;

    // Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents() {
        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos el área de texto
        areaTexto = new JTextArea(10, 50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        //Añadimos el daemon de escuha para la botonera
        for (int i = 0; i < botonera.grupoBotones.length; i++) {

            botonera.grupoBotones[i].addMouseListener(this);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == botonera.grupoBotones[0]) {

            areaTexto.setText(areaTexto.getText() + "0");

        } else if (e.getSource() == botonera.grupoBotones[1]) {

            areaTexto.setText(areaTexto.getText() + "1");

        } else if (e.getSource() == botonera.grupoBotones[2]) {

            areaTexto.setText(areaTexto.getText() + "2");

        } else if (e.getSource() == botonera.grupoBotones[3]) {

            areaTexto.setText(areaTexto.getText() + "3");

        } else if (e.getSource() == botonera.grupoBotones[4]) {

            areaTexto.setText(areaTexto.getText() + "4");

        } else if (e.getSource() == botonera.grupoBotones[5]) {

            areaTexto.setText(areaTexto.getText() + "5");

        } else if (e.getSource() == botonera.grupoBotones[6]) {

            areaTexto.setText(areaTexto.getText() + "6");

        } else if (e.getSource() == botonera.grupoBotones[7]) {

            areaTexto.setText(areaTexto.getText() + "7");

        } else if (e.getSource() == botonera.grupoBotones[8]) {

            areaTexto.setText(areaTexto.getText() + "8");

        } else if (e.getSource() == botonera.grupoBotones[9]) {

            areaTexto.setText(areaTexto.getText() + "9");

        } else if (e.getSource() == botonera.grupoBotones[10]) {

            areaTexto.setText(areaTexto.getText() + "+");

        } else if (e.getSource() == botonera.grupoBotones[11]) {

            areaTexto.setText(areaTexto.getText() + "-");

        } else if (e.getSource() == botonera.grupoBotones[12]) {

            areaTexto.setText(areaTexto.getText() + "*");

        } else if (e.getSource() == botonera.grupoBotones[13]) {

            areaTexto.setText(areaTexto.getText() + "/");

        } else if (e.getSource() == botonera.grupoBotones[14]) {

            areaTexto.setText(areaTexto.getText() + "=");

        } else if (e.getSource() == botonera.grupoBotones[15]) {

            if(areaTexto.getText().length() > 0){
                
                String subcadena = areaTexto.getText().substring(0, areaTexto.getText().length()-1);
                areaTexto.setText(subcadena);
            }

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
