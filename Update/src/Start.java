import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 
import javax.swing.*;
 
public class Start extends JFrame{
    int rightSum=0;
    CreateArithmetic createArithmeticnew=new CreateArithmetic();
    private JPanel panel1=new JPanel();
    private JLabel label=new JLabel();
    //private JLabel panel4=new JPanel();
    JTextField text=new JTextField(10);
    ArrayList<String> list=new ArrayList<String>();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      JFrame frame=new  Start();
      frame.setTitle("Сѧ��������ѵ��С����");
      frame.setSize(400,200);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
    public Start()
    {
        setLayout(new GridLayout(4,2,5,5));
        addAnswer();
        JPanel panel2=new JPanel();
        //panel2.setSize(10,100);
        panel2.add(new JLabel("������𰸣�"));
        panel2.add(text);
        this.add(panel2);
 //----------------------------------------�ύ�𰸰�ť���趨--------------------------
        JButton buttonSubmit=new JButton("�ύ��");
        buttonSubmit.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int size=list.size();
                int errorSum=size-rightSum;
                JFrame resultFrame=new JFrame();
                resultFrame.setTitle("������");
                resultFrame.setSize(500,500);
                resultFrame.setLocationRelativeTo(null);
                resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                resultFrame.setVisible(true);
                JPanel panel=new JPanel();
                Font font = new Font(Font.DIALOG, Font.PLAIN, 20);
                panel.add(new JLabel("���������� "+size+" "+"��ȷ����"+rightSum+" "+" ���յ÷֣�"+rightSum*5));
                setLayout(new GridLayout(100,1,5,5));
                for(int i=0;i<size;i++){
                    panel.add(new JLabel(list.get(i)));
                }
                resultFrame.add(panel);
            }});
 //-------------------------------------��һ��𰸰�ť���趨-------------------------------------------------------
        JButton buttonNext=new JButton("��һ��");
        buttonNext.addActionListener(new ActionListener() {//����ʱ�������
           public void actionPerformed(ActionEvent e) {
               String question=label.getText();
               double result=Double.parseDouble(text.getText());
               String ifRight="";
               if(createArithmeticnew.result==result){
                 ifRight="��ȷ";
                 rightSum++;
               }else{
                   ifRight="����";
               }
               String message=question+"�� "+"��Ĵ𰸣�"+result+"�� "+"��ȷ�𰸣� "+createArithmeticnew.result+"�� ״̬�� "+ifRight;
               list.add(message);
               text.setText("");
               String answer=createArithmeticnew.creat();
                label.setText(answer);
               }
              });
 //---------------------------------------����-------------------------
         
        JButton buttonInteger = new JButton("����");
        buttonNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}
		});
 //--------------------------------����---------------------------------
        JButton buttonFenshu = new JButton("����");
        buttonNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}
		});
   //-------------------------��������ť�����------------------------------     
        JPanel panel3=new JPanel();
        //button.setSize(10,10);
       
        panel3.add(buttonFenshu);
        panel3.add(buttonInteger);
        add(panel3);
        
        JPanel panel4 = new JPanel();
        panel3.add(buttonNext);
        panel3.add(buttonSubmit);
        add(panel4);
    //------------------------------------------------
    }

    public void addAnswer(){
        //System.out.println("hah");
        //panel1.setSize(0,50);
        Font font = new Font(Font.DIALOG, Font.PLAIN, 20);
        label.setFont(font);
        String answer=createArithmeticnew.creat();
        label.setText(answer);
        panel1.add(label);
     
        add(panel1);
    }
}