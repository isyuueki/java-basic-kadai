package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    HashMap<String, String> dict = new HashMap<String, String>();

    public Dictionary_Chapter21() {
        dict.putAll(new HashMap<String, String>() {
            {
                put("apple", "りんご");
                put("peach", "桃");
                put("banana", "バナナ");
                put("lemon", "レモン");
                put("pear", "梨");
                put("kiwi", "キウィ");
                put("strawberry", "いちご");
                put("grape", "ぶどう");
                put("muscat", "マスカット");
                put("cherry", "さくらんぼ");
            }
        });
    }

    public void lookupWords(String[] words) {
        for (String word : words) {
            System.out.println("単語: " + word);
            if (dict.containsKey(word)) {
                System.out.println("意味: " + dict.get(word));
            } else {
                System.out.println("辞書に存在していない単語です。");
            }
            System.out.println(); // 空行で区切る
        }
    }
}
