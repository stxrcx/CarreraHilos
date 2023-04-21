package Model;

import View.JFrameCarrera;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.concurrent.Semaphore;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * @author Emmanuel
 */
public class Carrera extends Thread {

    private JLabel etiqueta;
    private JFrameCarrera carro;

    public Carrera(JLabel etiqueta, JFrameCarrera carro) {
        this.etiqueta = etiqueta;
        this.carro = carro;
    }
    
    public Icon icono(String path, int width, int height){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, height,java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    @Override
    public void run() {

        int carro1 = 0, carro2 = 0, carro3 = 0, meta = 0;

        Semaphore semaforoCarro1 = new Semaphore(1); //se crea el semaforo
        Semaphore semaforoCarro2 = new Semaphore(1); //se crea el semaforo
        Semaphore semaforoCarro3 = new Semaphore(1); //se crea el semaforo

        while (true) {
            Random rand = new Random();
            int pasosCarro1 = rand.nextInt(21);
            int pasosCarro2 = rand.nextInt(21);
            int pasosCarro3 = rand.nextInt(21);

            try {
                // Se crea latencia
                sleep((int) Math.round(1000 * Math.random() - 0.5));

                carro1 = carro.getCarro1().getLocation().x;
                carro2 = carro.getCarro2().getLocation().x;
                carro3 = carro.getCarro3().getLocation().x;

                meta = carro.getMeta().getLocation().x - 60;

                if (carro1 < meta && carro2 < meta && carro3 < meta) {

                    // Espera a que sea el turno del carro 1
                    semaforoCarro1.acquire();
                    etiqueta.setLocation(etiqueta.getLocation().x + pasosCarro1, etiqueta.getLocation().y);
                    carro1 += pasosCarro1;
                    // Marca el avance del carro 1
                    String pasosC1 = "";
                    for (int i = 0; i < pasosCarro1; i++) {
                        pasosC1 += "-";
                    }
                    // Marca el semáforo del carro 1
                    pasosC1 += "*";
                    String pasosC1actualizados = carro.getP1().getText();
                    pasosC1actualizados += pasosC1;
                    carro.getP1().setText(pasosC1actualizados);
                    //System.out.println(pasosC1actualizados);
                    System.out.println("Carro 1 avanzó " + pasosCarro1 + " pasos.\n");
                    carro.repaint();
                    // Libera el semáforo del carro 1 y adquiere el semáforo del carro 2
                    semaforoCarro1.release(3); //Libera permisos para los hilos que estan en ".acquire()"
                    semaforoCarro2.acquire();

                    etiqueta.setLocation(etiqueta.getLocation().x + pasosCarro2, etiqueta.getLocation().y);
                    carro2 += pasosCarro2;
                    // Marca el avance del carro 2
                    String pasosC2 = "";
                    for (int i = 0; i < pasosCarro2; i++) {
                        pasosC2 += "-";
                    }
                    // Marca el semáforo del carro 2
                    pasosC2 += "*";
                    String pasosC2actualizados = carro.getP2().getText();
                    pasosC2actualizados += pasosC2;
                    carro.getP2().setText(pasosC2actualizados);
                    //System.out.println(pasosC2actualizados);
                    System.out.println("Carro 2 avanzó " + pasosCarro2 + " pasos.\n");
                    carro.repaint();
                    // Libera el semáforo del carro 2 y adquiere el semáforo del carro 3
                    semaforoCarro2.release(3); //Libera permisos para los hilos que estan en ".acquire()"
                    semaforoCarro3.acquire();

                    etiqueta.setLocation(etiqueta.getLocation().x + pasosCarro3, etiqueta.getLocation().y);
                    carro3 += pasosCarro3;
                    String pasosC3 = "";
                    // Marca el avance del carro 3
                    for (int i = 0; i < pasosCarro3; i++) {
                        pasosC3 += "-";
                    }
                    // Marca el semáforo del carro 3
                    pasosC3 += "*";
                    String pasosC3actualizados = carro.getP3().getText();
                    pasosC3actualizados += pasosC3;
                    carro.getP3().setText(pasosC3actualizados);
                    //System.out.println(pasosC3actualizados);
                    System.out.println("Carro 3 avanzó " + pasosCarro3 + " pasos.\n");
                    carro.repaint();
                    // Libera el semáforo del carro 3 y adquiere el semáforo del carro 1
                    semaforoCarro3.release(3); //Libera permisos para los hilos que estan en ".acquire()"
                    semaforoCarro1.acquire();
                } else {
                    break;
                }

            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            // Libera el semáforo del carro 1 al final de cada iteración
            semaforoCarro1.release(3); //Libera permisos para los hilos que estan en ".acquire()"
        }

        if (etiqueta.getLocation().x >= meta) {
            if (carro1 > carro2 && carro1 > carro3) {
                JOptionPane.showMessageDialog(null, "Ganó el carro 1  :D",
                        "Ganador", JOptionPane.PLAIN_MESSAGE, icono("/View/img/auto-antiguo.png", 60,60));
            } else if (carro2 > carro1 && carro2 > carro3) {
                JOptionPane.showMessageDialog(null, "Ganó el carro 2  :D",
                        "Ganador", JOptionPane.PLAIN_MESSAGE, icono("/View/img/carro-viejo (1).png", 60,60));
            } else if (carro3 > carro1 && carro3 > carro2) {
                JOptionPane.showMessageDialog(null, "Ganó el carro 3  :D",
                        "Ganador", JOptionPane.PLAIN_MESSAGE, icono("/View/img/coche.png", 60,60));
            } else {
                JOptionPane.showMessageDialog(null, "Nadie ganó  D:",
                        "Ganador", JOptionPane.PLAIN_MESSAGE, icono("/View/img/sol.png", 60,60));
            }
        }
    }

}
