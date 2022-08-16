public class ReverseDecorator extends Decorator {

    public ReverseDecorator(StringSource source) {
        super(source);
    }

    @Override
    public String next() {
        String original = super.next();
        return decorate(original);
    }

    private String decorate(String source) {
        StringBuilder newString = new StringBuilder(source);
        newString.reverse();
        return newString.toString();
    }
}
