import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.*;

class calcuform extends JFrame implements ActionListener, MouseListener
{
    double value1, value2, result; char op;

    JLabel lbl;
    JButton btn1; JButton btn4; JButton btn7; JButton btn0;
    JButton btn2; JButton btn5; JButton btn8; /*Added extra buttons*/
    JButton btn3; JButton btn6; JButton btn9;
    JButton btnDot; JButton btnEq; JButton btnA; JButton btnS; JButton btnD;
    JButton btnM; JButton btnBS; JButton btnCL;

    JPanel panel;
    calcuform()
    {
        super("Calculator");
        this.setSize(267, 390);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font bTahoma = new Font("Tahoma", Font.BOLD, 20);

        Font bVerdana = new Font("Verdana", Font.BOLD, 16);

        panel = new JPanel();
        panel.setLayout(null);

        lbl = new JLabel("");
        lbl.setForeground(Color.WHITE);
        lbl.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        lbl.setBounds(10,20,230,33);
        panel.add(lbl);
        lbl.setBackground(Color.white);
        lbl.setFont(bTahoma);
        panel.setBackground(Color.darkGray);

        btnCL = new JButton("Clear");
        btnCL.setBounds(125,60,113,30);
        btnCL.addActionListener(this);
        btnCL.addMouseListener(this);
        btnCL.setFont(bVerdana);
        panel.add(btnCL);
        btnCL.setBackground(Color.gray);
        btnCL.setForeground(Color.white);
        btnCL.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnCL.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));


        btnBS = new JButton("<---");
        btnBS.setBounds(10,60,110,30);
        btnBS.addActionListener(this);
        btnBS.addMouseListener(this);
        btnBS.setFont(bVerdana);
        panel.add(btnBS);
        btnBS.setBackground(Color.gray);
        btnBS.setForeground(Color.white);
        btnBS.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnBS.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));


        btn7 = new JButton("7");
        //button1.setID(1);
        btn7.setBounds(10,100,50,50);
        btn7.addActionListener(this);
        btn7.addMouseListener(this);
        btn7.setBackground(Color.gray);
        btn7.setForeground(Color.white);
        btn7.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn7.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        btn7.setFont(bTahoma);
        panel.add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(70,100,50,50);
        btn8.addActionListener(this);
        btn8.addMouseListener(this);
        btn8.setBackground(Color.gray);
        btn8.setFont(bTahoma);
        btn8.setForeground(Color.white);
        btn8.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn8.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        panel.add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(130,100,50,50);
        btn9.addActionListener(this);
        btn9.addMouseListener(this);
        btn9.setFont(bTahoma);
        panel.add(btn9);
        btn9.setBackground(Color.gray);
        btn9.setForeground(Color.white);
        btn9.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn9.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        btnM = new JButton("*");
        btnM.setBounds(190,100,50,50);
        btnM.addActionListener(this);
        btnM.addMouseListener(this);
        panel.add(btnM);
        btnM.setBackground(Color.gray);
        btnM.setFont(bTahoma);
        btnM.setForeground(Color.white);
        btnM.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnM.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        /* 4 5 6 / */
        btn4 = new JButton("4");
        btn4.setBounds(10,160,50,50);
        btn4.addActionListener(this);
        btn4.addMouseListener(this);
        panel.add(btn4);
        btn4.setBackground(Color.gray);
        btn4.setFont(bTahoma);
        btn4.setForeground(Color.white);
        btn4.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        btn5 = new JButton("5");
        btn5.setBounds(70,160,50,50);
        btn5.addActionListener(this);
        btn5.addMouseListener(this);
        panel.add(btn5);
        btn5.setBackground(Color.gray);
        btn5.setFont(bTahoma);
        btn5.setForeground(Color.white);
        btn5.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn5.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));


        btn6 = new JButton("6");
        btn6.setBounds(130,160,50,50);
        btn6.addActionListener(this);
        btn6.addMouseListener(this);
        panel.add(btn6);
        btn6.setFont(bTahoma);
        btn6.setBackground(Color.gray);
        btn6.setForeground(Color.white);
        btn6.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn6.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        btnD = new JButton("/");
        btnD.setBounds(190,160,50,50);
        btnD.addActionListener(this);
        btnD.addMouseListener(this);
        panel.add(btnD);
        btnD.setBackground(Color.gray);
        btnD.setForeground(Color.white);
        btnD.setFont(bTahoma);
        btnD.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnD.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        /* 1 2 3 - */
        btn1 = new JButton("1");
        btn1.setBounds(10,220,50,50);
        btn1.addActionListener(this);
        btn1.addMouseListener(this);
        panel.add(btn1);
        btn1.setBackground(Color.gray);
        btn1.setForeground(Color.white);
        btn1.setFont(bTahoma);
        btn1.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));


        btn2 = new JButton("2");
        btn2.setBounds(70,220,50,50);
        btn2.addActionListener(this);
        btn2.addMouseListener(this);
        panel.add(btn2);
        btn2.setFont(bTahoma);
        btn2.setBackground(Color.gray);
        btn2.setForeground(Color.white);
        btn2.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));


        btn3 = new JButton("3");
        btn3.setBounds(130,220,50,50);
        btn3.addActionListener(this);
        btn3.addMouseListener(this);
        panel.add(btn3);
        btn3.setBackground(Color.gray);
        btn3.setFont(bTahoma);
        btn3.setForeground(Color.white);
        btn3.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));


        btnS = new JButton("-");
        btnS.setBounds(190,220,50,50);
        btnS.addActionListener(this);
        btnS.addMouseListener(this);
        panel.add(btnS);
        btnS.setBackground(Color.gray);
        btnS.setForeground(Color.white);
        btnS.setFont(bTahoma);
        btnS.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnS.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        /* 0 . = + */
        btn0 = new JButton("0");
        btn0.setBounds(10,280,50,50);
        btn0.addActionListener(this);
        btn0.addMouseListener(this);
        panel.add(btn0);
        btn0.setBackground(Color.gray);
        btn0.setForeground(Color.white);
        btn0.setFont(bTahoma);
        btn0.setFont(bTahoma);
        btn0.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btn0.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));


        btnDot = new JButton(".");
        btnDot.setBounds(70,280,50,50);
        btnDot.addActionListener(this);
        btnDot.addMouseListener(this);
        panel.add(btnDot);
        btnDot.setBackground(Color.gray);
        btnDot.setFont(bTahoma);
        btnDot.setForeground(Color.white);
        btnDot.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnDot.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        btnEq = new JButton("=");
        btnEq.setBounds(130,280,50,50);
        btnEq.addActionListener(this);
        btnEq.addMouseListener(this);
        panel.add(btnEq);
        btnEq.setBackground(Color.gray);
        btnEq.setForeground(Color.white);
        btnEq.setFont(bTahoma);
        btnEq.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnEq.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        btnA = new JButton("+");
        btnA.setBounds(190,280,50,50);
        btnA.addActionListener(this);
        btnA.addMouseListener(this);
        btnA.setFont(bTahoma);
        panel.add(btnA);
        btnA.setBackground(Color.gray);
        btnA.setForeground(Color.white);
        btnA.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        btnA.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        this.add(panel);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if(str.equals("1"))
        {
            lbl.setText(lbl.getText()+btn1.getText());
        }
        else if(str.equals("2"))
        {
            lbl.setText(lbl.getText()+btn2.getText());
        }
        else if(str.equals("3"))
        {
            lbl.setText(lbl.getText()+btn3.getText());
        }
        else if(str.equals("4"))
        {
            lbl.setText(lbl.getText()+btn4.getText());
        }
        else if(str.equals("5"))
        {
            lbl.setText(lbl.getText()+btn5.getText());
        }
        else if(str.equals("6"))
        {
            lbl.setText(lbl.getText()+btn6.getText());
        }else if(str.equals("7"))
        {
            lbl.setText(lbl.getText()+btn7.getText());
        }
        else if(str.equals("8"))
        {
            lbl.setText(lbl.getText()+btn8.getText());
        }
        else if(str.equals("9"))
        {
            lbl.setText(lbl.getText()+btn9.getText());
        }
        else if(str.equals("0"))
        {
            lbl.setText(lbl.getText()+btn0.getText());
        }else if(str.equals("."))
        {
            lbl.setText(lbl.getText()+btnDot.getText());
        }else if(str.equals("="))
        {
            function Es = new function(lbl.getText());
            result = Es.Result(); String ans = Double.toString(result);
            lbl.setText(ans);
            //label.setText(label.getText()+buttonEq.getText());
        }
        else if(str.equals("+"))
        {
            lbl.setText(lbl.getText()+btnA.getText());
        }else if(str.equals("-"))
        {
            lbl.setText(lbl.getText()+btnS.getText());
        }else if(str.equals("*"))
        {
            lbl.setText(lbl.getText()+btnM.getText());
        }else if(str.equals("/"))
        {
            lbl.setText(lbl.getText()+btnD.getText());
        }else if(str.equals("<---"))
        {
            String temp = lbl.getText(); int len = temp.length();
            temp = temp.substring(0, len-1);
            lbl.setText(temp);
        }else if(str.equals("Clear"))
        {

            lbl.setText("");
        }
        else{}

    }
    public void mouseEntered(MouseEvent me)
    {

    }
    public void mouseExited(MouseEvent me)
    {

    }
    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
}