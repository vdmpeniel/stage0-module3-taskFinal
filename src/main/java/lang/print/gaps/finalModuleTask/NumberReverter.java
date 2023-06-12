package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.println(Integer.valueOf(new StringBuilder(String.valueOf(number)).reverse().toString()));

    }
}
