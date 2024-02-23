import java.util.LinkedList;
import java.util.Random;

public class LinkedListUtil {
    public static LinkedList<Integer> createLinkedList(int length) {
        LinkedList<Integer> randomLinkedList = new LinkedList<>();
        Random random = new Random();
        for (int j = 0; j < length; ++j) {
            randomLinkedList.add(random.nextInt(100000));
        }
        return randomLinkedList;
    }

    public static long avgTime(long[] array){
        long totalRuntime = 0;
        for (long i : array){
            totalRuntime += i;
        }
        return totalRuntime;
    }
    
    public static void evalAdd(){
        long[] run_times = new long[100];
        for (int i = 0; i < 100; ++i) {
            LinkedList<Integer> generatedRandomLinkedList = createLinkedList(100000);
            long start_time = System.nanoTime();
            Random random = new Random();
            generatedRandomLinkedList.add(random.nextInt(100000));
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;

        System.out.printf("%-15s%-20s%-10s\n", "LinkedList", "Add", meanRunTime);
    }


    public static void evalContain(){
        long[] run_times = new long[100];
        for (int i = 0; i < 100; ++i) {
            LinkedList<Integer> generatedRandomLinkedList = createLinkedList(100000);
            long start_time = System.nanoTime();
            Random random = new Random();
            generatedRandomLinkedList.contains(random.nextInt(100000));
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;

        System.out.printf("%-15s%-20s%-10s\n", "LinkedList", "Contain", meanRunTime);
    }
    
    public static void evalRemove(){
        long[] run_times = new long[100];
        for (int i = 0; i < 100; ++i) {
            LinkedList<Integer> generatedRandomLinkedList = createLinkedList(100000);
            long start_time = System.nanoTime();
            Random random = new Random();
            generatedRandomLinkedList.remove(random.nextInt(100000));
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;

        System.out.printf("%-15s%-20s%-10s\n", "LinkedList", "Remove", meanRunTime);
    }

    public static void evalClear(){
        long[] run_times = new long[100];
        for (int i = 0; i < 100; ++i) {
            LinkedList<Integer> generatedRandomLinkedList = createLinkedList(100000);
            long start_time = System.nanoTime();
            generatedRandomLinkedList.clear();
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;

        System.out.printf("%-15s%-20s%-10s\n", "LinkedList", "Clear", meanRunTime);
    }

    public static void main(String a[]){
        String ANSI_PENCIL = "\u001b[38;2;253;182;0m";
        String ANSI_RED = "\u001b[38;5;147m";
        String ANSI_RESET = "\u001B[0m";
    
        System.out.print(ANSI_PENCIL);
        System.out.printf("%-15s%-20s%-10s\n", "Collection", "Method", "Mean Run Time (ns)");
        System.out.print(ANSI_RED);
        evalAdd();
        evalContain();
        evalRemove();
        evalClear();
        System.out.print(ANSI_RESET);
    }
}
