public class RunnerClass
{
    public static void main(String[] args)
    {
        int[ ] values = {6, 2, 1, 7, 12, 5};

        // Rewrite this loop as a for each loop and run to confirm
        for (int value: values) {
            if (value % 2 == 0) {
                System.out.println(value + " is even!");
            }
        }
    }
}
