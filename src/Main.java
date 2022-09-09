public class Main {
    public static void main(String[] args) {

        IProcessor processor= new intelProcessor();
        IProcessor processor1=new ryzenProcessor();

        Laptop laptop=new Laptop(processor);
        laptop.showProcessor();


        Laptop laptop1=new Laptop(processor1);
        laptop1.showProcessor();


    }
}
