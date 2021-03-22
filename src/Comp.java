public class Comp {
    public static boolean comprobarInt(String n){
        int nem;
        try{
            nem=Integer.parseInt(n);
            if(nem>=0 || nem<=0){
                return true;
            }else{
                return false;
            }
        }catch(Exception a){
            throw new trollException("RECUERDE");
        }finally {
            return false;
        }
    }
}
