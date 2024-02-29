public class Recursion {
    int num;
    Recursion(int number){};
    int Recursion(int number){
        this.num = number;
        if(this.num <= 1){
            return 1;
        }
        else
            return this.num*Recursion(this.num - 1);
    }
    public static void main(String[] args){
        Recursion r1 = new Recursion(5);
        System.out.println(r1.Recursion(5));
    }

}
