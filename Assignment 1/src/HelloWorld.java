public class HelloWorld {

    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name + "!");
        }
        else {
            System.out.println("Hello whoever you are!  (Please make sure you enter you name next time)");
        }
    }

}
