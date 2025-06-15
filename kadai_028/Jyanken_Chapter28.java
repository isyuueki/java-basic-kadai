package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public String getMyChoice() {
        System.out.println("じゃんけんの手を入力してください (r: グー, s: チョキ, p: パー): ");
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("r") && !input.equals("s") && !input.equals("p")) {
            System.out.println("無効な入力です。r, s, p のいずれかを入力してください: ");
            input = scanner.nextLine().toLowerCase();
        }
        return input;
    }

    public String getRandom() {
        String[] hands = { "r", "s", "p" };
        int index = (int) Math.floor(random.nextDouble() * 3);
        return hands[index];
    }

    public void playGame(String myChoice, String opponentChoice) {
        Map<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手: " + handMap.get(myChoice));
        System.out.println("相手の手: " + handMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです。");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                (myChoice.equals("s") && opponentChoice.equals("p")) ||
                (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです。");
        } else {
            System.out.println("自分の負けです。");
        }
    }
}
