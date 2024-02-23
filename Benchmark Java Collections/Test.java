
public class Test {
    public static void main(String[] args) {
        //add
        String ANSI_PENCIL = "\u001b[38;2;253;182;0m";
        String ANSI_RED = "\u001b[38;5;147m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        System.out.println(ANSI_GREEN);
        System.out.println("*****************  "+"Add"+"  *****************");
        System.out.println(ANSI_RESET);
        
        System.out.print(ANSI_PENCIL);
        System.out.printf("%-15s%-20s%-10s\n", "Collection", "Method", "Mean Run Time (ns)");
        System.out.print(ANSI_RED);
        HashSetUtil.evalAdd();
        TreeSetUtil.evalAdd();
        LinkedHashSetUtil.evalAdd();
        ArrayListUtil.evalAdd();
        LinkedListUtil.evalAdd();
        ArrayDequeUtil.evalAdd();
        PriorityQueueUtil.evalAdd();
        HashMapUtil.evalAdd();
        TreeMapUtil.evalAdd();
        LinkedHashedMapUtil.evalAdd();
        System.out.print(ANSI_RESET);


        //contain
        System.out.println(ANSI_GREEN);
        System.out.println("*****************  "+"Contain"+"  *****************");
        System.out.println(ANSI_RESET);
        
        System.out.print(ANSI_PENCIL);
        System.out.printf("%-15s%-20s%-10s\n", "Collection", "Method", "Mean Run Time (ns)");
        System.out.print(ANSI_RED);
        HashSetUtil.evalContain();
        TreeSetUtil.evalContain();
        LinkedHashSetUtil.evalContain();
        ArrayListUtil.evalContain();
        LinkedListUtil.evalContain();
        ArrayDequeUtil.evalContain();
        PriorityQueueUtil.evalContain();
        HashMapUtil.evalContain();
        TreeMapUtil.evalContain();
        LinkedHashedMapUtil.evalContain();
        System.out.print(ANSI_RESET);


        //remove
        System.out.println(ANSI_GREEN);
        System.out.println("*****************  "+"Remove"+"  *****************");
        System.out.println(ANSI_RESET);
        
        System.out.print(ANSI_PENCIL);
        System.out.printf("%-15s%-20s%-10s\n", "Collection", "Method", "Mean Run Time (ns)");
        System.out.print(ANSI_RED);
        HashSetUtil.evalRemove();
        TreeSetUtil.evalRemove();
        LinkedHashSetUtil.evalRemove();
        ArrayListUtil.evalRemove();
        LinkedListUtil.evalRemove();
        ArrayDequeUtil.evalRemove();
        PriorityQueueUtil.evalRemove();
        HashMapUtil.evalRemove();
        TreeMapUtil.evalRemove();
        LinkedHashedMapUtil.evalRemove();
        System.out.print(ANSI_RESET);


         //clear
         System.out.println(ANSI_GREEN);
         System.out.println("*****************  "+"Clear"+"  *****************");
         System.out.println(ANSI_RESET);
         
         System.out.print(ANSI_PENCIL);
         System.out.printf("%-15s%-20s%-10s\n", "Collection", "Method", "Mean Run Time (ns)");
         System.out.print(ANSI_RED);
         HashSetUtil.evalClear();
         TreeSetUtil.evalClear();
         LinkedHashSetUtil.evalClear();
         ArrayListUtil.evalClear();
         LinkedListUtil.evalClear();
         ArrayDequeUtil.evalClear();
         PriorityQueueUtil.evalClear();
         HashMapUtil.evalClear();
         TreeMapUtil.evalClear();
         LinkedHashedMapUtil.evalClear();
         System.out.print(ANSI_RESET);
    }
}
