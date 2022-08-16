abstract class Decorator implements StringSource {
    private StringSource source;

    public Decorator(StringSource source) {
        this.source = source;
    }

    @Override
    public String next() {
        return source.next();
    }
}
