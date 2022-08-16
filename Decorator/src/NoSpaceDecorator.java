public class NoSpaceDecorator extends Decorator {

    public NoSpaceDecorator(StringSource source) {
        super(source);
    }

    @Override
    public String next() {
        String original = super.next();
        return decorate(original);
    }

    private String decorate(String sentence) {
        return sentence.replaceAll("\\s", "*");
    }
}


