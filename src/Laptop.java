public class Laptop {
    private IProcessor processor;
    public Laptop(IProcessor processor)
    {
        this.processor=processor;
    }
    void showProcessor()
    {
        processor.show();
    }
}
