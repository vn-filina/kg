import ru.vsu.cs.design.g12.filina_v_d.task1.DrawPanel;

import javax.swing.*;

public class FrameMain extends javax.swing.JDialog {
    private javax.swing.JPanel contentPane;
    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonCancel;
    private JPanel paintAreaPanel;
    private DrawPanel dp;

    public FrameMain() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        dp = new DrawPanel();
        paintAreaPanel.add(dp);
    }

    public static void main(String[] args) {
        FrameMain dialog = new FrameMain();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}