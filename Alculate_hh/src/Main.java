import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) {
    	
        printquestions();
    }
    
    private static void printquestions() {
    	int number;
    	int count;
    	System.out.print("��������Ҫ������ϰ�����ݣ�");
    	System.out.print("\n 1��**********����������ϰ**********");
    	System.out.print("\n 2��**********����������ϰ**********\n");
    	Scanner scanner = new Scanner(System.in);
    	number=scanner.nextInt();
    	System.out.print("������������������");
    	Scanner scanner2 = new Scanner(System.in);
    	count = scanner2.nextInt();
    	switch (number) 
    	{
    	case 1:
    		 //˵������ӡ��������������Ŀ�����ѽ��յ�����Ŀ�ַ�������ָ����ʽ�����
    		System.out.print("��ʼ���⣺\n");
            for (int i = 0; i < count; i++) {
                System.out.print( i+1 );
                System.out.print("��" + getQuestion() + "    ");
               /* System.out.print( i+11 );
                System.out.print("��" + getQuestion() + "    ");
                System.out.print( i+21 );
                System.out.println("��" + getQuestion());*/
            }
            break;
    	case 2:
    		System.out.print("��ʼ���⣺");
    		for (int i = 0; i < count; i++)
    		{
                System.out.print( i+1 );
                System.out.print("��" + getfenQuestion() + "    ");
             }
    		//˵������ӡ��������������Ŀ��
    	}
    	
    	
       
    }
    private static String getQuestion() {
        //˵����getQuestion()�õ���Ŀ���������������Ŀ��������Ŀ�ַ�����
        int t = 0;
        String strz = "";    
        
        int x=1+(int)(Math.random()*100);        
        int y=1+(int)(Math.random()*100);    
        int z=1+(int)(Math.random()*100);
        
        if( z<=25 ) {
            strz = "��";
            x = x % 10;
            y = y % 10;
        }
        if( z>25 && z<=50 ) {
            strz = "��";
            y = ( y % 10 ) + 1;//��������Ϊ0
        }
        if( z>50 && z<=75) {
            strz = "+";
            if ((x+y) > 100) {        
                x = x / 2;
                y = y / 2;//�˷���ӽ��������100
            }        
        }
        
        if( z>75 ) {
            strz = "-";
            if( x < y ){
                t = y;
                y = x;
                x = t;//��֤�����Ǵ�����ȥС��
            }
        }            
        
        String strx = String.valueOf( x );
        String stry = String.valueOf( y );

        String ques = " " + strx + strz + stry + "=";
        //��ʽ��ȷ
        if(ques.length()==5)ques = ques + " ";
        if(ques.length()==4)ques = ques + "  ";
        if(ques.length()==3)ques = ques + "   ";
        
        return ques;
    }//getQuestion
    private static String getfenQuestion() 
    { 
    	//˵����getPfQuestion()�õ��������Ŀ��������������������Ŀ�������������Ŀ�ַ�����
    	int t = 0;
    	String strz = "";
    	int x1=1+(int)(Math.random()*10); 
    	int x2=1+(int)(Math.random()*10);
    	//��ĸ
    	int y1=1+(int)(Math.random()*10);
    	int y2=1+(int)(Math.random()*10);
    	//��ĸ
    	if( x2 <= x1 )
    	{ 
    		t = x2;
    		x2 = x1;
    		x1 = t;
    		if( x1 == x2 )
    		{ x1 = x1 - 1;
    		//��֤���ӱȷ�ĸС 
    		} 
    		} 
    	if( y2 <= y1 )
    	{ 
    		t = y2;
    	    y2 = y1;
    	    y1 = t; 
    	    if( y1 == y2 )
    	    {
    	    	y1 = y1 - 1;
    	    	//��֤���ӱȷ�ĸС
    	    	} 
    	    } 
    	int z=1+(int)(Math.random()*100); 
    	if( z<=25 )
    	{ 
    		strz = "��"; 
    		}
    	if( z>25 && z<=50 )
    	{ 
    		strz = "��"; 
    		if( y1 == 0 )
    			y1 = y1 + 1;
    		//�����ķ��Ӳ���Ϊ0�ǲ���
    		}
         if( z>50 && z<=75)
         { 
        	 strz = "+"; 
        	 }
         if( z>75 ) 
         {
        	 strz = "-"; 
        	 if( x1/x2 > y1/y2 )
        	 { 
        		 t = x1;
        		 x1 = y1; 
        		 y1 = t; 
        		 t = x2;
        		 x2 = y2;
        		 y2 = t;
        		 //��֤�����Ǵ�����ȥС��

        	 } 
        	 }
          String strx1 = String.valueOf( x1 ); 
          String strx2 = String.valueOf( x2 );
          String stry1 = String.valueOf( y1 );
         String stry2 = String.valueOf( y2 ); 
         String ques = " " + strx1 + "/" + strx2 + strz + stry1 + "/" + stry2 + "="; 
         return ques; 
         }//getPfQuestion
    		
    	
    }

