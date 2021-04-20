package Clases;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import dao.component.BDRelacionalTarjetaDAO;
import dao.to.TarjetaTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author nikol
 */
public class LectorDeTarjetas {

    public static String codTarjeta;

    private static PanamaHitek_Arduino ino = new PanamaHitek_Arduino();

    private static final SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (ino.isMessageAvailable()) {
                    //Se imprime el mensaje recibido en la consola
                    System.out.println(ino.printMessage());
                    codTarjeta = ino.printMessage();
                }
            } catch (SerialPortException ex) {
                Logger.getLogger(LectorDeTarjetas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoException ex) {
                Logger.getLogger(LectorDeTarjetas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    };

    /**
     * @roseuid 5DD198310363
     */
    public LectorDeTarjetas() {

    }

    public static String getCodTarjeta() {
        return codTarjeta;
    }

    public static void setCodTarjeta(String codTarjeta) {
        LectorDeTarjetas.codTarjeta = codTarjeta;
    }

    /**
     * @roseuid 5DD17B0900BF
     */
    
//1B908E0

    /**
     * @roseuid 5DD17B1A0380
     */
//    public static void main(String args[]) {
//
//        try {
//            ino.arduinoRX("COM8", 9600, listener);
//        } catch (ArduinoException | SerialPortException ex) {
//            Logger.getLogger(LectorDeTarjetas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//  }
}
