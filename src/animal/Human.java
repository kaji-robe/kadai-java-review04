//◆Humanクラス（Human.java）
//mainメソッドは不要。
//Humanクラスは、Animalクラスを継承し、Thinkableインターフェイスを実装。
//趣味の情報を保管するフィールドを定義、変数名は自由。カプセル化を使用。
//コンストラクタで名前・年齢・趣味の情報を格納する引数を設定。
//名前・年齢・趣味の各変数を引数の情報で初期化する。引数名は自由。
//名前と年齢の初期化は、スーパークラス（Animal）のコンストラクタを利用する。
//thinkメソッドを実装する。趣味のフィールドに入っている文字列を利用して、
//「私は□□について考えています。」と画面に System.out.println()する処理。

package animal;

public class Human extends Animal implements Thinkable{

    // フィールド
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // 引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    // thinkメソッドの実装
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
