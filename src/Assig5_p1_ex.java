import javax.swing.*;
import java.awt.*;

public class Assig5_p1_ex {
    // static for the 57 icons and their corresponding labels
    // normally we would not have a separate label for each card, but
    // if we want to display all at once using labels, we need to.

    static final int NUM_CARD_IMAGES = 57; // 52 + 4 jokers + 1 back-of-card image
    static Icon[] icon = new ImageIcon[NUM_CARD_IMAGES];

    static void loadCardIcons() {
        // build filenames: "AC.gif", "2C.gif", "3C.gif", "TC.gif", ...
        // SHORT loop.  For each file name, read it in and use it to
        // instantiate each of the 57 Icons in the icon[] array.
    }

    // turns 0 - 13 into "A", "2", "3", ... "Q", "K", "X"
    static String turnIntIntoCardValue(int k) {
        // an idea for a helper method (do it differently if you wish)
        return "";
    }

    // turns 0 - 3 into "C", "D", "H", "S"
    static String turnIntIntoCardSuit(int j) {
        // possible helper method (do it differently if you wish)
        return "";
    }

    // simple main throw all JLabels out there for the world to see
    public static void main(String[] args) {
        int k;

        // prepare the image icon array
        loadCardIcons();

        // establish main frame in which program will run
        JFrame frmMyWindow = new JFrame("Card Room");
        frmMyWindow.setSize(1150, 650);
        frmMyWindow.setLocationRelativeTo(null);
        frmMyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set up layout which will control placement of buttons, etc.
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 5, 20);
        frmMyWindow.setLayout(layout);

        // prepare the image label array
        JLabel[] labels = new JLabel[NUM_CARD_IMAGES];
        for (k = 0; k < NUM_CARD_IMAGES; k++)
            labels[k] = new JLabel(icon[k]);

        // place your 3 controls into frame
        for (k = 0; k < NUM_CARD_IMAGES; k++)
            frmMyWindow.add(labels[k]);

        // show everything to the user
        frmMyWindow.setVisible(true);
    }
}
