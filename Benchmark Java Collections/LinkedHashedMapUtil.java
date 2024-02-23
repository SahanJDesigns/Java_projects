import java.util.LinkedHashMap;
import java.util.Random;

public class LinkedHashedMapUtil {
    public static LinkedHashMap<Integer, Integer> createLinkedHashMap(int length) {
        LinkedHashMap<Integer, Integer> randomLinkedHashMap = new LinkedHashMap<>();
        Random random = new Random();
        for (int j = 0; j < length; ++j) {
            randomLinkedHashMap.put(j, random.nextInt(100000));
        }
        return randomLinkedHashMap;
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
            LinkedHashMap<Integer,Integer> generatedRandomLinkedHashMap = createLinkedHashMap(100000);
            long start_time = System.nanoTime();
            Random random = new Random();
            generatedRandomLinkedHashMap.put(random.nextInt(100000),random.nextInt(100000));
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;

        System.out.printf("%-15s%-20s%-10s\n", "LinkedHashedMap", "Add", meanRunTime);
    }


    public static void evalContain(){
        long[] run_times = new long[100];
        for (int i = 0; i < 100; ++i) {
            LinkedHashMap<Integer,Integer> generatedRandomLinkedHashMap = createLinkedHashMap(100000);
            long start_time = System.nanoTime();
            Random random = new Random();
            generatedRandomLinkedHashMap.containsValue(random.nextInt(100000));
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;

        System.out.printf("%-15s%-20s%-10s\n", "LinkedHashedMap", "Contain", meanRunTime);
    }

    public static void evalRemove(){
        long[] run_times = new long[100];
        for (int i = 0; i < 100; ++i) {
            LinkedHashMap<Integer,Integer> generatedRandomLinkedHashMap = createLinkedHashMap(100000);
            long start_time = System.nanoTime();
            Random random = new Random();
            generatedRandomLinkedHashMap.remove(random.nextInt(100000));
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;

        System.out.printf("%-15s%-20s%-10s\n", "LinkedHashedMap", "Remove", meanRunTime);
    }

    public static void evalClear(){
        long[] run_times = new long[100];
        for (int i = 0; i < 100; ++i) {
            LinkedHashMap<Integer,Integer> generatedRandomLinkedHashMap = createLinkedHashMap(100000);
            long start_time = System.nanoTime();
            generatedRandomLinkedHashMap.clear();
            long end_time = System.nanoTime();
            long run_time = end_time - start_time;
            run_times[i] = run_time;
        }

        long RunTime = avgTime(run_times);

        long meanRunTime = RunTime / run_times.length;
        System.out.printf("%-15s%-20s%-10s\n", "LinkedHashedMap", "Clear", meanRunTime);
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
