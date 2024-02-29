public class Recursion {
    int num;

    Recursion(){};

    //nhan 1 so nguyen
    Recursion(int number){};

    //tra ve ket qua de quy
    int Recursion(int number){
        this.num = number;
        if(this.num <= 1){
            return 1;
        }
        else
            return this.num*Recursion(this.num - 1);
    }

}
