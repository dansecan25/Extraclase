public class DivisionFinEj {
    public static long dividir(int num1, int num2){
        try{
            return num1/num2;
        }catch(ArithmeticException e){
            System.out.println("NO DEBE DIVIDIR ENTRE 0");
        }finally{
            return -1;
        }
    }
}
