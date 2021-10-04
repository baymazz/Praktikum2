import javax.swing.JOptionPane;

public class HandsOn2_1 {
     public static void main (String[] args) {
        String name, hours,pay;
        name = JOptionPane.showInputDialog("What is your name? ");
        if(name == null || (name != null && ("".equals(name))))
        { System.exit(0);}
        hours = JOptionPane.showInputDialog("How many hours did you work this week?");
        if(hours == null || (hours != null && ("".equals(hours))))
        { System.exit(0);}
        pay = JOptionPane.showInputDialog("What is your hourly pay rate?");
        if(pay == null || (pay != null && ("".equals(pay))))
        { System.exit(0);}
        double numhours = Double.parseDouble(hours);
        double numpay = Double.parseDouble(pay);
        JOptionPane.showMessageDialog(null, "Hello " + name + ". " 
        + String.format ("Your gross pay is $%.1f" , numhours * numpay ));
 
    }
 
}