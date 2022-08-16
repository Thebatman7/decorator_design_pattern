public class Main {
    public static void main(String[] args) {
       ReynoldsTweets reynoldsTweets = new ReynoldsTweets();
       reynoldsTweets.loadTweets();

        System.out.println(reynoldsTweets.next());
        System.out.println(reynoldsTweets.next());
        System.out.println(reynoldsTweets.next());
        System.out.println(reynoldsTweets.next());

        System.out.println();

        PoemReader poemReader = new PoemReader();
        poemReader.loadPoem();

        System.out.println(poemReader.next());
        System.out.println(poemReader.next());
        System.out.println(poemReader.next());
        System.out.println(poemReader.next());
        System.out.println(poemReader.next());
        System.out.println(poemReader.next());

        System.out.println();

        NoSpaceDecorator noSpaceDecorator = new NoSpaceDecorator(reynoldsTweets);
        System.out.println(noSpaceDecorator.next());

        HeartStarDecorator heartStarDecorator = new HeartStarDecorator(noSpaceDecorator);

        System.out.println(heartStarDecorator.next());

        ReverseDecorator reverseDecorator = new ReverseDecorator(reynoldsTweets);
        System.out.println(reverseDecorator.next());

        HeartStarDecorator poemDecorator = new HeartStarDecorator(poemReader);
        System.out.println(poemDecorator.next());
    }
}
