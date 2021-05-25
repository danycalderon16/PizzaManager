package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import forms.FormContarDinero;
import javax.swing.JOptionPane;
import modelos.ContarDinero;
import subInterfaz.GenerarCorteCaja;

public class ControladorContarDinero implements ActionListener {

    private FormContarDinero vista;
    private ContarDinero modelo;

    public ControladorContarDinero(FormContarDinero vista, ContarDinero modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnConfirmar.addActionListener(this);
        this.vista.btnCalcular.addActionListener(this);
        this.vista.menos1000.addActionListener(this);
        this.vista.mas1000.addActionListener(this);
        this.vista.menos500.addActionListener(this);
        this.vista.mas500.addActionListener(this);
        this.vista.menos200.addActionListener(this);
        this.vista.mas200.addActionListener(this);
        this.vista.menos100.addActionListener(this);
        this.vista.mas100.addActionListener(this);
        this.vista.menos50.addActionListener(this);
        this.vista.mas50.addActionListener(this);
        this.vista.menos20b.addActionListener(this);
        this.vista.mas20b.addActionListener(this);
        this.vista.menos20.addActionListener(this);
        this.vista.mas20.addActionListener(this);
        this.vista.menos10.addActionListener(this);
        this.vista.mas10.addActionListener(this);
        this.vista.menos5.addActionListener(this);
        this.vista.mas5.addActionListener(this);
        this.vista.menos2.addActionListener(this);
        this.vista.mas2.addActionListener(this);
        this.vista.menos1.addActionListener(this);
        this.vista.mas1.addActionListener(this);
        this.vista.menos050.addActionListener(this);
        this.vista.mas050.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Aperturar Caja");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.menos1000) {
            if (this.modelo.getBilleteMil() > 0) {
                this.modelo.setBilleteMil(this.modelo.getBilleteMil() - 1);
            }
            vista.billeteMil.setText(modelo.getBilleteMil() + "");
        }
        if (e.getSource() == vista.mas1000) {
            this.modelo.setBilleteMil(this.modelo.getBilleteMil() + 1);
            vista.billeteMil.setText(modelo.getBilleteMil() + "");
        }

        if (e.getSource() == vista.mas500) {
            this.modelo.setBilleteQuinientos(this.modelo.getBilleteQuinientos() + 1);
            vista.billeteQui.setText(modelo.getBilleteQuinientos() + "");
        }
        if (e.getSource() == vista.menos500) {
            if (this.modelo.getBilleteQuinientos() > 0) {
                this.modelo.setBilleteQuinientos(this.modelo.getBilleteQuinientos() - 1);
            }
            vista.billeteQui.setText(modelo.getBilleteQuinientos() + "");
        }

        if (e.getSource() == vista.mas200) {
            this.modelo.setBilleteDoscientso(this.modelo.getBilleteDoscientso() + 1);
            vista.billeteDoscientos.setText(modelo.getBilleteDoscientso() + "");
        }
        if (e.getSource() == vista.menos200) {
            if (this.modelo.getBilleteDoscientso() > 0) {
                this.modelo.setBilleteDoscientso(this.modelo.getBilleteDoscientso() - 1);
            }
            vista.billeteDoscientos.setText(modelo.getBilleteDoscientso() + "");
        }

        if (e.getSource() == vista.mas100) {
            this.modelo.setBilleteCien(this.modelo.getBilleteCien() + 1);
            vista.billeteCien.setText(modelo.getBilleteCien() + "");
        }
        if (e.getSource() == vista.menos100) {
            if (this.modelo.getBilleteCien() > 0) {
                this.modelo.setBilleteCien(this.modelo.getBilleteCien() - 1);
            }
            vista.billeteCien.setText(modelo.getBilleteCien() + "");
        }

        if (e.getSource() == vista.mas50) {
            this.modelo.setBilleteCincuenta(this.modelo.getBilleteCincuenta() + 1);
            vista.billeteCincuenta.setText(modelo.getBilleteCincuenta() + "");
        }
        if (e.getSource() == vista.menos50) {
            if (this.modelo.getBilleteCincuenta() > 0) {
                this.modelo.setBilleteCincuenta(this.modelo.getBilleteCincuenta() - 1);
            }
            vista.billeteCincuenta.setText(modelo.getBilleteCincuenta() + "");
        }

        if (e.getSource() == vista.mas20b) {
            this.modelo.setBilleteVeinte(this.modelo.getBilleteVeinte() + 1);
            vista.billeteVeinteB.setText(modelo.getBilleteVeinte() + "");
        }
        if (e.getSource() == vista.menos20b) {
            if (this.modelo.getBilleteVeinte() > 0) {
                this.modelo.setBilleteVeinte(this.modelo.getBilleteVeinte() - 1);
            }
            vista.billeteVeinteB.setText(modelo.getBilleteVeinte() + "");
        }

        if (e.getSource() == vista.mas20) {
            this.modelo.setMonedaVeinte(this.modelo.getMonedaVeinte() + 1);
            vista.monedaVeinteM.setText(modelo.getMonedaVeinte() + "");
        }
        if (e.getSource() == vista.menos20) {
            if (this.modelo.getMonedaVeinte() > 0) {
                this.modelo.setMonedaVeinte(this.modelo.getMonedaVeinte() - 1);
            }
            vista.monedaVeinteM.setText(modelo.getMonedaVeinte() + "");
        }
        if (e.getSource() == vista.mas10) {
            this.modelo.setMonedaDiez(this.modelo.getMonedaDiez() + 1);
            vista.monedaDiez.setText(modelo.getMonedaDiez() + "");
        }
        if (e.getSource() == vista.menos10) {
            if (this.modelo.getMonedaDiez() > 0) {
                this.modelo.setMonedaDiez(this.modelo.getMonedaDiez() - 1);
            }
            vista.monedaDiez.setText(modelo.getMonedaDiez() + "");
        }

        if (e.getSource() == vista.mas5) {
            this.modelo.setMonedaCinco(this.modelo.getMonedaCinco() + 1);
            vista.monedaCinco.setText(modelo.getMonedaCinco() + "");
        }
        if (e.getSource() == vista.menos5) {
            if (this.modelo.getMonedaCinco() > 0) {
                this.modelo.setMonedaCinco(this.modelo.getMonedaCinco() - 1);
            }
            vista.monedaCinco.setText(modelo.getMonedaCinco() + "");
        }

        if (e.getSource() == vista.mas2) {
            this.modelo.setMonedaDos(this.modelo.getMonedaDos() + 1);
            vista.monedaDos.setText(modelo.getMonedaDos() + "");
        }
        if (e.getSource() == vista.menos2) {
            if (this.modelo.getMonedaDos() > 0) {
                this.modelo.setMonedaDos(this.modelo.getMonedaDos() - 1);
            }
            vista.monedaDos.setText(modelo.getMonedaDos() + "");
        }

        if (e.getSource() == vista.mas1) {
            this.modelo.setMonedaPeso(this.modelo.getMonedaPeso() + 1);
            vista.monedaPeso.setText(modelo.getMonedaPeso() + "");
        }
        if (e.getSource() == vista.menos1) {
            if (this.modelo.getMonedaPeso() > 0) {
                this.modelo.setMonedaPeso(this.modelo.getMonedaPeso() - 1);
            }
            vista.monedaPeso.setText(modelo.getMonedaPeso() + "");
        }

        if (e.getSource() == vista.mas050) {
            this.modelo.setMonedaCincuentaCen(this.modelo.getMonedaCincuentaCen() + 1);
            vista.monedaCincuentaCent.setText(modelo.getMonedaCincuentaCen() + "");
        }
        if (e.getSource() == vista.menos050) {
            if (this.modelo.getMonedaCincuentaCen() > 0) {
                this.modelo.setMonedaCincuentaCen(this.modelo.getMonedaCincuentaCen() - 1);
            }
            vista.monedaCincuentaCent.setText(modelo.getMonedaCincuentaCen() + "");
        }

        if (e.getSource() == vista.btnCalcular) {
            sumar();
        }

        if (e.getSource() == vista.btnConfirmar) {
            confirmar();
        }
    }

    private void sumar() {
        modelo.setBilleteMil(Integer.parseInt(vista.billeteMil.getText()));
        modelo.setBilleteQuinientos(Integer.parseInt(vista.billeteQui.getText()));
        modelo.setBilleteDoscientso(Integer.parseInt(vista.billeteDoscientos.getText()));
        modelo.setBilleteCien(Integer.parseInt(vista.billeteQui.getText()));
        modelo.setBilleteCincuenta(Integer.parseInt(vista.billeteCincuenta.getText()));
        modelo.setBilleteVeinte(Integer.parseInt(vista.billeteVeinteB.getText()));

        modelo.setMonedaVeinte(Integer.parseInt(vista.monedaVeinteM.getText()));
        modelo.setMonedaDiez(Integer.parseInt(vista.monedaDiez.getText()));
        modelo.setMonedaCinco(Integer.parseInt(vista.monedaCinco.getText()));
        modelo.setMonedaDos(Integer.parseInt(vista.monedaDos.getText()));
        modelo.setMonedaPeso(Integer.parseInt(vista.monedaPeso.getText()));
        modelo.setMonedaCincuentaCen(Integer.parseInt(vista.monedaCincuentaCent.getText()));

        modelo.sumar();

        vista.btnConfirmar.setEnabled(true);

        vista.cantidad.setText("$" + modelo.getApertura());

    }

    private void confirmar() {
        if (modelo.getApertura() > 0) {
            GenerarCorteCaja.lbDinero.setText(modelo.getApertura()+"");
            vista.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese el monto");
        }
    }
}
