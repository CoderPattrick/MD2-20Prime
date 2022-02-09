public class Print20Prime {
    public static void main(String[] args) {
int cnt =0;
int n = 1;
while (cnt<20){
    if(checkPrime(n)){
        System.out.print(n+" ");
        cnt++;
    }
    n++;
}
    }
    public static boolean checkPrime(int x){
        if(x<=1){
            return false;
        }
        if(x<=3){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0){
                return false;
            }
        }
        return true;

    }
}
