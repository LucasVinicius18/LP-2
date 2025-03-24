import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame{
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;

    public LabelFrame(){
        super("IFMT");
        setLayout(new FlowLayout());
        label1 = new JLabel(" ");
        label1.setToolTipText("  ");
        add(label1);

        Icon bug = new ImageIcon(getClass().getResource("ifmt.png"));
        label2 = new JLabel(" ", bug, SwingConstants.CENTER);
        add(label2);

        label3 = new JLabel();
        //label3.setIcon(bug);//
        label3.setText("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText(" LOGO IFMT ");
        add(label3);
    }
}