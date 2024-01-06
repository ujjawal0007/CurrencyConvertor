import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        float dollar,rupee;

        dollar = Float.parseFloat(JOptionPane.showInputDialog("Amount in Dollar"));

        rupee = (float) (dollar*83.19);

        JOptionPane.showMessageDialog(null,"Amount in Rupee : ₹" + rupee);

    }
}