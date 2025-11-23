
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class calculator extends JFrame implements ActionListener {

    private JTextField num1f,num2f,resultf;
    private JButton add,sub;


    public calculator() {
        setTitle("java simple calculator");
        setSize(500, 600);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);


        JLabel num1 = new JLabel("Number1");
        num1.setSize(150, 50);
        num1.setLocation(50, 70);
        num1.setFont(new Font("Arial", Font.BOLD, 26));

        contentPane.add(num1);

        num1f = new JTextField();
        num1f.setSize(150, 50);
        num1f.setLocation(180, 70);
        num1f.setFont(new Font("Arial", Font.BOLD, 26));

        contentPane.add(num1f);


        JLabel num2 = new JLabel("Number2");
        num2.setSize(150, 50);
        num2.setLocation(50, 170);
        num2.setFont(new Font("Arial", Font.BOLD, 26));

        contentPane.add(num2);


        num2f = new JTextField();
        num2f.setSize(150, 50);
        num2f.setLocation(180, 170);
        num2f.setFont(new Font("Arial", Font.BOLD, 26));

        contentPane.add(num2f);


        JLabel result = new JLabel("Result");
        result.setSize(200, 50);
        result.setLocation(50, 270);
        result.setFont(new Font("Arial", Font.BOLD, 26));
        contentPane.add(result);


        resultf = new JTextField();
        resultf.setSize(150, 50);
        resultf.setLocation(180, 270);
        resultf.setFont(new Font("Arial", Font.BOLD, 26));
        contentPane.add(resultf);

        add = new JButton("ADD");
        add.setSize(200, 50);
        add.setLocation(50, 370);
        add.setFont(new Font("Arial", Font.BOLD, 26));
        contentPane.add(add);
        add.addActionListener(this);

        sub = new JButton("SUB");
        sub.setSize(200, 50);
        sub.setLocation(50, 470);
        sub.setFont(new Font("Arial", Font.BOLD, 26));
        contentPane.add(sub);
        sub.addActionListener(this);


    }

        public void actionPerformed(ActionEvent e) {
            try {
                double n1 = Double.parseDouble(num1f.getText());
                double n2 = Double.parseDouble(num2f.getText());

                double result = 0;

                if(e.getSource() == add){
                    result = n1+n2;

                }else if(e.getSource() == sub){
                    result = n1-n2;

                }
                resultf.setText(String.valueOf(result));



            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!");


            }

            }






    }

