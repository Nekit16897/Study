

public class Main {
    public static void main(String[] args){

        Draw(7);
    }
    public static void Draw(int h){
        int otstup1 =0;
        int otstup2= (h-1)/2-1;
        for (int i = otstup2+1; i>0; i--){
            for (int k = otstup2; k>0; k--){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int b = otstup1; b>0; b--){
                if(i!=1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("_");
                }

            }
            System.out.print("\\");
            otstup2--;
            otstup1+=2;
            System.out.println("");
        }




    }




}

