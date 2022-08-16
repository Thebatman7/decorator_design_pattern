public class HeartStarDecorator extends Decorator {

    public HeartStarDecorator(StringSource source) {
        super(source);
    }

    @Override
    public String next() {
        String original = super.next();
        return decorate(original);
    }

    private String decorate(String sentence) {
        String decoratedString = sentence.replaceAll("\\.", "\u2665");
        decoratedString = decoratedString.replaceAll("\\,", "\u2605");
        return decoratedString;
    }
}
