import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) {
    	
        printquestions();
    }
    
    private static void printquestions() {
    	int number;
    	int count;
    	System.out.print("请输入你要进行练习的内容：");
    	System.out.print("\n 1、**********整数运算练习**********");
    	System.out.print("\n 2、**********分数运算练习**********\n");
    	Scanner scanner = new Scanner(System.in);
    	number=scanner.nextInt();
    	System.out.print("输入您的做题数量：");
    	Scanner scanner2 = new Scanner(System.in);
    	count = scanner2.nextInt();
    	switch (number) 
    	{
    	case 1:
    		 //说明：打印整数四则运算题目，并把接收到的题目字符串按照指定格式输出。
    		System.out.print("开始做题：\n");
            for (int i = 0; i < count; i++) {
                System.out.print( i+1 );
                System.out.print("、" + getQuestion() + "    ");
               /* System.out.print( i+11 );
                System.out.print("、" + getQuestion() + "    ");
                System.out.print( i+21 );
                System.out.println("、" + getQuestion());*/
            }
            break;
    	case 2:
    		System.out.print("开始做题：");
    		for (int i = 0; i < count; i++)
    		{
                System.out.print( i+1 );
                System.out.print("、" + getfenQuestion() + "    ");
             }
    		//说明：打印分数四则运算题目。
    	}
    	
    	
       
    }
    private static String getQuestion() {
        //说明：getQuestion()得到题目函数，随机生成题目，返回题目字符串。
        int t = 0;
        String strz = "";    
        
        int x=1+(int)(Math.random()*100);        
        int y=1+(int)(Math.random()*100);    
        int z=1+(int)(Math.random()*100);
        
        if( z<=25 ) {
            strz = "×";
            x = x % 10;
            y = y % 10;
        }
        if( z>25 && z<=50 ) {
            strz = "÷";
            y = ( y % 10 ) + 1;//除数不能为0
        }
        if( z>50 && z<=75) {
            strz = "+";
            if ((x+y) > 100) {        
                x = x / 2;
                y = y / 2;//乘法相加结果不大于100
            }        
        }
        
        if( z>75 ) {
            strz = "-";
            if( x < y ){
                t = y;
                y = x;
                x = t;//保证减法是大数减去小数
            }
        }            
        
        String strx = String.valueOf( x );
        String stry = String.valueOf( y );

        String ques = " " + strx + strz + stry + "=";
        //格式正确
        if(ques.length()==5)ques = ques + " ";
        if(ques.length()==4)ques = ques + "  ";
        if(ques.length()==3)ques = ques + "   ";
        
        return ques;
    }//getQuestion
    private static String getfenQuestion() 
    { 
    	//说明：getPfQuestion()得到真分数题目函数，随机生成真分数题目，返回真分数题目字符串。
    	int t = 0;
    	String strz = "";
    	int x1=1+(int)(Math.random()*10); 
    	int x2=1+(int)(Math.random()*10);
    	//分母
    	int y1=1+(int)(Math.random()*10);
    	int y2=1+(int)(Math.random()*10);
    	//分母
    	if( x2 <= x1 )
    	{ 
    		t = x2;
    		x2 = x1;
    		x1 = t;
    		if( x1 == x2 )
    		{ x1 = x1 - 1;
    		//保证分子比分母小 
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
    	    	//保证分子比分母小
    	    	} 
    	    } 
    	int z=1+(int)(Math.random()*100); 
    	if( z<=25 )
    	{ 
    		strz = "×"; 
    		}
    	if( z>25 && z<=50 )
    	{ 
    		strz = "÷"; 
    		if( y1 == 0 )
    			y1 = y1 + 1;
    		//除数的分子不能为0是不是
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
        		 //保证减法是大数减去小数

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

