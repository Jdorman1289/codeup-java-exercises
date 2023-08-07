
import java.util.Random;

public class ServerNameGenerator {
    public static String generateServerName(String[] adjectives, String[] nouns) {
        Random random = new Random();
        String adjective = adjectives[random.nextInt(adjectives.length)];
        String noun = nouns[random.nextInt(nouns.length)];
        return adjective + "-" + noun;
    }

    public static void main(String[] args) {
        String[] adjectives = {"dedicated", "awesome", "brilliant", "fierce", "glorious", "mighty", "powerful", "stellar", "ultimate", "vibrant"};
        String[] nouns = {"photon", "server", "machine", "system", "network", "database", "firewall", "router", "cloud", "cluster"};

        String serverName = generateServerName(adjectives, nouns);
        System.out.println("Here is your server name:");
        System.out.println(serverName);
    }

}
