public class task2 {

    public static void main(String[] args) {

        for (int i=2;i<100;i++){
            if(checkSimple(i))
                System.out.println(i);

    }
}
public static boolean checkSimple(int i){
    if (i<=1)
        return false;
    else if (i <=3)
        return true;
    else if (i%2==0 || i %3 ==0)
        return false;
    int n = 5;
    while (n*n <=i){
        if (i % n ==0 || i % (n+2) == 0)
            return false;
        n=n+6;
    }
    return true;
}
}