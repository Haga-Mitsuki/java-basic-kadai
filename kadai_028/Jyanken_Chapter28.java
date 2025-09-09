package kadai_028;

import java.util.Scanner;
import java.util.HashMap;

public class Jyanken_Chapter28 {
    // 自分の手を入力する
    public String getMyChoice() {
        Scanner sc = new Scanner(System.in);
        String myChoice = "";

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            myChoice = sc.nextLine();

            // 入力チェック
            if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
                break; // 正しい入力ならループ終了
            } else {
                System.out.println("⚠️ 入力が間違っています。r, s, p のいずれかを入力してください。");
            }
        }

        sc.close(); // Scannerを閉じる
        return myChoice;
    }

    // 相手の手を乱数で決める
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3); // 0〜2
        return hands[index];
    }

    // 勝負処理
    public void playGame(String myChoice, String enemyChoice) {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myChoice) + 
                           ", 対戦相手の手は" + handMap.get(enemyChoice));

        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && enemyChoice.equals("s")) ||
            (myChoice.equals("s") && enemyChoice.equals("p")) ||
            (myChoice.equals("p") && enemyChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
