package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる単語リスト
        String[] words = {"apple", "banana", "grape", "orange"};

        // 繰り返し処理で検索
        for (String word : words) {
            dictionary.search(word);
        }
    }
}
