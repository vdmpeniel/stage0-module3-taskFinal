package lang.print.gaps.finalModuleTask;


public class DigitsSumCalculator {



    private void digitSum2(int number){
        int length = 10000;
        int sum = 0;
        do{
            length /= 10;
            sum += number / length;
            number = number % length;
        } while(length > 1);
        System.out.println(sum);
    }

    public void calculateSum(int number) {
        digitSum2(number);
    }
}



