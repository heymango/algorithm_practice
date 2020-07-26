import java.util.Scanner;

public class A_2018 {
    public static int main(String[] args) {
        int[][] map = new int[401][401];
        Scanner scan = new Scanner(System.in);
        int Xs, Ys, Xh, Yh,T,N;
        Xs = scan.nextInt();
        Ys = scan.nextInt();
        T = scan.nextInt();
        Xh = scan.nextInt();
        Yh = scan.nextInt();
        N = scan.nextInt();
        if(distance(Xs,Ys,Xh,Yh)>T){
            System.out.println(0);
            return 0;
        }
        Xs = Xs-Xh+T;
        Ys = Ys-Yh+T; //목표지점(T,T)


        return Xs;
    }
    public static int distance(int Xs, int Ys, int Xh, int Yh){
        return Math.abs(Xs-Xh)+Math.abs(Ys-Yh);
    }
}
