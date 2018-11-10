package eu.wisdom.jokeslib;

/**
 * A class tha provides random joke Strings via its static method "getRandomJoke"
 */
public final class Joker {

    private static String[] jokes = {
            // Jokes Source: http://www.short-funny.com/
            "i think your in a pit,oh am dreaming lol",
            "Am in love with all my jokes hahahahahahahah",
            "Judge: “Why did you steal the car?” \n" +
                    " \n" +
                    " Man: “I had to get to work.”\n" +
                    " \n" +
                    " Judge: “Why didn’t you take the bus?”\n" +
                    " \n" +
                    " Man: I don’t have a driver’s license for the bus.",
            "A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 bus.”\n" +
                    "\n" +
                    "The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.”",
            "Can a kangaroo jump higher than a house?\" +\"\\n\" + \"Of course, a house doesn't jump at all",
            "cook and donot eat....",
            "I'm not lazy. I'm just naturally a very relaxed person.",
            "feel like sleeping the whole day dear",
            "Stressed is just desserts spelled backwards.",
            "i love kotlin and she hates me .",
            "funny ladies tend to have plenty dates",
            "I've been single for so many years I believe I will soon become an album.",
            "I feel slapping a military man,you knw wat i want",
            "All my life I thought air was for free. That was until I bought a bag of peanuts.",
            "A man was invited to a wedding. When he reached the hotel, he found two doors written on them:\n" +
                    " \n" +
                    " 1. Bride's relatives\n" +
                    " 2. Groom's relatives\n" +
                    " \n" +
                    " He entered the groom's door and..",
            "Kunle stole a goat, he was arrested and taken to court.\n" +
                    " \n" +
                    " JUDGE: Gentleman, are you guilty or not guilty?\n" +
                    " \n" +
                    " KUNLE: My Lord, I’m not guilty.\n" +
                    " \n" +
                    " JUDGE: How come you were arrested...",
            "When People say they can't see anything good in you... \n" +
                    " \n" +
                    " Hug them and say, \"Life is difficult for the BLIND!\""
    };

    /**
     * This class should not be instantiated
     */
    private Joker(){}

    /**
     * Method that generates a random integer number for a given range
     * @param min Minimum number in range
     * @param max Maximum number in range
     * @return integer number between min and max range
     */
    private static int getRandomNumberInRange(int min, int max){
        return (int)(Math.random() * (max-min) + min);
    }

    /**
     * This method fetches randomly one of the available jokes
     * @return String containing a random joke
     */
    public static String getRandomJoke(){
        return jokes[getRandomNumberInRange(0, jokes.length-1)];
    }
}
