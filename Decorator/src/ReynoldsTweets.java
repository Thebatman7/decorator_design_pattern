import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReynoldsTweets implements StringSource {
    private List<String> funnyTweets = new ArrayList<>();

    @Override
    public String next() {
        Random randomizer = new Random();
        int randomTweet = randomizer.nextInt(funnyTweets.size());
        return funnyTweets.get(randomTweet);
    }

    public void writeTweet() {
        Scanner scanner = new Scanner(System.in);
        String tweet = scanner.nextLine();
        funnyTweets.add(tweet);
    }

    public void loadTweets(){
        String tweet = "No matter which kids book I read to my screaming baby on an airplane, " +
                "the moral of the story is always something about a vasectomy.";
        String tweet1 = "It's important kids eat 5 servings of vegetables daily. " +
                "Even if childhood is just a dress-rehearsal for extraordinary adult suffering.";
        String tweet2 = "No. Put on Spider-Man (from 2002) and tell him it’s Deadpool. " +
                "It’s what I do with my kids. Remember to look him straight in the eye when you lie. Good luck.";
        String tweet3 = "My kids tried to surprise me for my birthday this morning. " +
                "I totally heard them coming and snuck out to start a new life somewhere else.";
        String tweet4 = "Being a Dad isn't just about eating a huge bag of gummy-bears as your wife gives birth." +
                " It means being comfortable with the word hero.";
        String tweet5 = "I'd walk through fire for my daughter. Well not FIRE, because it's dangerous. " +
                "But a super humid room. But not too humid, because my hair.";
        String tweet6 = "My daughter just sneezed into my yawning mouth. Seemed really fucking pleased with herself. " +
                "Joke's on her. She'll have to bury me someday.";
        String tweet7 = "My infant daughter's traumatized for life. 50 Shades of Grey = Worst fucking coloring book ever.";
        String tweet8 = "Went to Disneyland because my daughter's obsessed with Mickey Mouse. " +
                "She was so excited when I got home and told her.";
        String tweet9 = "My daughter's only 6 months old and already drawing. " +
                "I'd hang it on the fridge but honestly, it's absolute garbage.";
        String tweet10 = "Totally caved and tossed my daughter the keys to the car. " +
                "She looked really happy as they bounced off her tiny infant face.";
        String tweet11 = "I can‘t tell if my daughter’s smashing plates all over the kitchen floor or singing the theme song to Paw Patrol.";
        String tweet12 = "Happy birthday to my baby girl! Sad I lost my virginity. But thankful I have a daughter.";
        String tweet13 = "Nothing better than the simple joys of finding 5 bucks in an old pair of pants, " +
                "or discovering my wife and I had a second daughter over a year ago.";
        String tweet14 = "Love writing nursery rhymes for my daughter. Her favorites are," +
                " \"Sunshine-Cuddle-Time!\" and \"Everyone You Know Will Eventually Die.\"";
        String tweet15 = "My daughter loves being buried up to her neck in sand at the beach." +
                " Her little face lights up when I come back to get her the next day.";
        String tweet16 = "My daughter loves being buried up to her neck in sand at the beach." +
                " Her little face lights up when I come back to get her the next day.";
        String tweet17 = "LOVE dressing my daughter in baby clothes. The itsy-bitsy pink pajamas. " +
                "The tiny white socks. The black leather mask. Cuteness overload!";
        String tweet18 = "Nothing better than spending an entire morning staring into my baby daughter's eyes, " +
                "whispering, \"I can't do this\".";
        funnyTweets.add(tweet);
        funnyTweets.add(tweet1);
        funnyTweets.add(tweet2);
        funnyTweets.add(tweet3);
        funnyTweets.add(tweet4);
        funnyTweets.add(tweet5);
        funnyTweets.add(tweet6);
        funnyTweets.add(tweet7);
        funnyTweets.add(tweet8);
        funnyTweets.add(tweet9);
        funnyTweets.add(tweet10);
        funnyTweets.add(tweet11);
        funnyTweets.add(tweet12);
        funnyTweets.add(tweet13);
        funnyTweets.add(tweet14);
        funnyTweets.add(tweet15);
        funnyTweets.add(tweet16);
        funnyTweets.add(tweet17);
        funnyTweets.add(tweet18);
    }

    public void printTweets(){
        for(int i = 0; i < funnyTweets.size(); ++i){
            System.out.println(funnyTweets.get(i));
        }
    }
}
