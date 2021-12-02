public class Main {

    public static void game(String x, String y) {
        String result = "";

        if (x =="rock" && y =="paper"){
            result = "Player 2 win";

        }
        else if (x =="paper" && y =="rock"){
            result = "Player 1 win";
        }

        if(x == "paper" && y == "scissors") {
            result = "Player 2 wins";
        } else if(x == "scissors" && y == "paper") {
            result = "Player 1 wins";
        }

        if(x == "scissors" && y == "rock") {
            result = "Player 2 wins";
        } else if(x == "rock" && y == "scissors") {
            result = "Player 1 wins";
        }

        if(x == y) {
            result = "TIE";
        }

        System.out.println(result);
    }
    public static class game {

        public static void main(String[] args) {

            Main.game("rock", "rock");
            Main.game("rock", "paper");
            Main.game("paper", "rock");
            Main.game("paper", "scissors");
            Main.game("scissors", "scissors");
            Main.game("scissors", "paper");
        }
    }


}