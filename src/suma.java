import java.util.Scanner;
public class suma {
    public static void main( String[] args ) {
    	Scanner sc = new Scanner(System.in); 
    	
    	System. out. print( "pon un numero  "  );
    	int uno = sc.nextInt();
    	System. out. print( "pon el segundo numero  "  );
    	int dos = sc.nextInt();
    	int resul1 = uno + dos; 
    	int resul2 = uno - dos ;
    	int resul3 = uno * dos ;
    	int resul4 = uno / dos ;
    	System. out. println( "suma  "+resul1  );
    	System. out. println( "resta  "+resul2  );
    	System. out. println( "multiplicacion  "+resul3  );
    	System. out. println( "division  "+resul4  );
    	//int a = 16, b = 12, c = 0;
    //c = a + b;
    //System. out. println( "La suma de a y b es: " + c );
    
    }
}
