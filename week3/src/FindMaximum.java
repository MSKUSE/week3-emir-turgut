public class FindMaximum{
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if (num1 == num2){
            System.out.println("Arguments are equal");
        }else if(num1 > num2){
            System.out.println(num1);
        }else{System.out.println(num2);}
    }
}