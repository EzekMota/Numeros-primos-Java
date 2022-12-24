public class Main
{
public static boolean isPrime(int x) {
if (x <= 1) {return false;}
for (int i = 2; i*i<=x; i++) {
if (x % i == 0) {return false;}
}
return true;
}
public static void main(String[] args) {
for(int p = 0; p < 1000; p++){
if(isPrime(p)){
System.out.println(p);
}
}
}
}
