package dev.javiersolis.honeywell.printer;

import android.util.Log;

import com.zebra.sdk.comm.BluetoothConnection;
import com.zebra.sdk.comm.Connection;
import com.zebra.sdk.comm.ConnectionException;

public class PrinterHelper {

    /** Converts Bluetooth Address string from 00ABCDEF0102 format => 00:AB:CD:EF:01:02 format
     * @param bluetoothAddr - Bluetooth Address string to convert
     */
    public static String formatBluetoothAddress(String bluetoothAddr)
    {
        //Format MAC address string
        StringBuilder formattedBTAddress = new StringBuilder(bluetoothAddr);
        for (int bluetoothAddrPosition = 2; bluetoothAddrPosition <= formattedBTAddress.length() - 2; bluetoothAddrPosition += 3)
            formattedBTAddress.insert(bluetoothAddrPosition, ":");
        return formattedBTAddress.toString();
    }


    public static void run(String macPrinter, PrinterDataMatrix printerDataMatrix) throws ConnectionException, InterruptedException {
        try {
            macPrinter = formatBluetoothAddress(macPrinter);

            Log.e("p",macPrinter +" --00:0D:70:11:FB:2F--1");
            // Instantiate connection for given Bluetooth&reg; MAC Address.
            Connection thePrinterConn2 = new BluetoothConnection(macPrinter);

            // Initialize

            //->Looper.prepare();

            // Open the connection - physical connection is established here.
            thePrinterConn2.open();

            String zplData = printerDataMatrix.getMatrix();
            /*
            String zplData = "^XA\n" +
                    "\n" +
                    "^FX barcode\n" +
                    "^FO45,100\n" +
                    "^B3N,N,260,Y,N^FD"+cudDetail.getCud()+"^FS\n" +
                    "\n" +
                    "^FX <<<<<<<<<<<<REGION PEDIDO INI<<<<<<<<<<<<<<<<<<<<<\n" +
                    "\n" +
                    "^FX titulo del pedido\n" +
                    "^FO45,400\n" +
                    "^GB767,50,3^FS\n" +
                    "^CF0,35\n" +
                    "^FO370,412^FDPEDIDO^FS\n" +
                    "\n" +
                    "^FX datos del pedido, FB tiene mas opciones\n" +
                    "^FB510,7,12\n" +
                    "^FO45,480\n" +
                    "^CF0,35\n" +
                    "^FDCUD: "+cudDetail.getCud()+"\\&Desc.: "+cudDetail.getSkuDescription()+"\\&Cantidad: "+cudDetail.getCantidad()+"\\&Fecha de envio: "+cudDetail.getDataSend()+"^FS\n" +
                    "\n" +
                    "^FO 560,455\n" +
                    "^BQN,2,10,Q,7\n" +
                    "^FDQA,"+cudDetail.getCud()+"^FS\n" +
                    "\n" +
                    "^FX <<<<<<<<<<<REGION PEDIDO FIN<<<<<<<<<<<<<<<<<<<<<\n" +
                    "\n" +
                    "^FX <<<<<<<<<<<<REGION DEST INI<<<<<<<<<<<<<<<<<<<<<\n" +
                    "\n" +
                    "^FX titulo del destinatario\n" +
                    "^FO45,800\n" +
                    "^GB767,40,3^FS\n" +
                    "^CF0,35\n" +
                    "^FO300,807^FDDESTINATARIO^FS\n" +
                    "\n" +
                    "^FX datos del pedido, FB tiene mas opciones\n" +
                    "^FB800,7,12\n" +
                    "^FO45,870\n" +
                    "^CF0,35\n" +
                    "^FDComprador: "+cudDetail.getDestinatario()+"\\&DNI Cliente: "+cudDetail.getDni()+"\\&Receptor: "+cudDetail.getReceptor()+"\\&DNI Receptor: "+cudDetail.getDniReceptor()+"\\&Telefono: "+cudDetail.getTelefono()+"^FS\n" +
                    "\n" +
                    "^FX <<<<<<<<<<<<REGION DEST FIN<<<<<<<<<<<<<<<<<<<<<\n" +
                    "\n" +
                    "^FX <<<<<<<<<<<<REGION DIRECCION INI<<<<<<<<<<<<<<<<\n" +
                    "^FX titulo del destinatario\n" +
                    "^FO45,1140\n" +
                    "^GB767,40,3^FS\n" +
                    "^CF0,35\n" +
                    "^FO340,1146^FDDIRECCION^FS\n" +
                    "\n" +
                    "^FX datos de la direccion\n" +
                    "^FB760,7,12\n" +
                    "^FO45,1220\n" +
                    "^CF0,35\n" +
                    "^FDDireccion: "+cudDetail.getAddressReference()+"\\&Departamento: "+cudDetail.getDepartamento()+"\\&Provincia: "+cudDetail.getProvinceConsumer()+"\\&Distrito: "+cudDetail.getDistrictConsumer()+"^FS\n" +
                    "\n" +
                    "^FX <<<<<<<<<<<<REGION DIRECCION FIN<<<<<<<<<<<<<<<<\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "^XZ\n" +
                    "\n";

             */

            // Send the data to printer as a byte array.
            thePrinterConn2.write(zplData.getBytes());

            // Make sure the data got to the printer before closing the connection
            Thread.sleep(500);

            // Close the connection to release resources.
            thePrinterConn2.close();

            //->Looper.myLooper().quit();

        } catch (Exception e) {
            // Handle communications error here.
            e.printStackTrace();
            throw e;
        }
    }
}
