public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Not args provided");
            System.exit(-1);
        }
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}