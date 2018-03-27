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
      frame.setTitle("小学四则运算训练小程序");
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
        panel2.add(new JLabel("请输入答案："));
        panel2.add(text);
        this.add(panel2);
 //----------------------------------------提交答案按钮的设定--------------------------
        JButton buttonSubmit=new JButton("提交答案");
        buttonSubmit.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int size=list.size();
                int errorSum=size-rightSum;
                JFrame resultFrame=new JFrame();
                resultFrame.setTitle("运算结果");
                resultFrame.setSize(500,500);
                resultFrame.setLocationRelativeTo(null);
                resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                resultFrame.setVisible(true);
                JPanel panel=new JPanel();
                Font font = new Font(Font.DIALOG, Font.PLAIN, 20);
                panel.add(new JLabel("做题总数： "+size+" "+"正确数："+rightSum+" "+" 最终得分："+rightSum*5));
                setLayout(new GridLayout(100,1,5,5));
                for(int i=0;i<size;i++){
                    panel.add(new JLabel(list.get(i)));
                }
                resultFrame.add(panel);
            }});
 //-------------------------------------下一题答案按钮的设定-------------------------------------------------------
        JButton buttonNext=new JButton("下一题");
        buttonNext.addActionListener(new ActionListener() {//定义时间监听器
           public void actionPerformed(ActionEvent e) {
               String question=label.getText();
               double result=Double.parseDouble(text.getText());
               String ifRight="";
               if(createArithmeticnew.result==result){
                 ifRight="正确";
                 rightSum++;
               }else{
                   ifRight="错误";
               }
               String message=question+"， "+"你的答案："+result+"， "+"正确答案： "+createArithmeticnew.result+"， 状态： "+ifRight;
               list.add(message);
               text.setText("");
               String answer=createArithmeticnew.creat();
                label.setText(answer);
               }
              });
 //---------------------------------------整数-------------------------
         
        JButton buttonInteger = new JButton("整数");
        buttonNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}
		});
 //--------------------------------分数---------------------------------
        JButton buttonFenshu = new JButton("分数");
        buttonNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}
		});
   //-------------------------对两个按钮的添加------------------------------     
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