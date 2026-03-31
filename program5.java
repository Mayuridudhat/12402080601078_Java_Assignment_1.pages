class Cricket {
    String team1, team2;

    // Parent Class Constructor
    Cricket(String t1, String t2) {
        team1 = t1;
        team2 = t2;
    }

    void displayTeams() {
        System.out.println("Team 1: " + team1);
        System.out.println("Team 2: " + team2);
    }
}

class Match extends Cricket {
    int score1, score2;

    // Child Class Constructor
    Match(String t1, String t2, int s1, int s2) {
        super(t1, t2); // Calls the parent constructor to initialize team names
        score1 = s1;
        score2 = s2;
    }

    void displayScore() {
        System.out.println(team1 + " Score: " + score1);
        System.out.println(team2 + " Score: " + score2);
    }

    void result() {
        // Fixed the messy duplicate logic here
        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("Match Draw!");
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        // Check if exactly 4 command-line arguments are provided
        if (args.length != 4) {
            System.out.println("Usage: java Program5 <Team1> <Team2> <Score1> <Score2>");
            return;
        }

        // Read from command line arguments
        String team1 = args[0];
        String team2 = args[1];
        int score1 = Integer.parseInt(args[2]);
        int score2 = Integer.parseInt(args[3]);

        // Create the Match object using the inputs
        Match m = new Match(team1, team2, score1, score2);
        
        System.out.println("\n--- Match Details ---");
        m.displayTeams();
        System.out.println("---------------------");
        m.displayScore();
        System.out.println("---------------------");
        m.result();
        System.out.println("---------------------\n");
    }
}