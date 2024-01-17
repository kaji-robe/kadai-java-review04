//◆Animalクラス（Animal.java）
//Humanクラスの親となるクラス。mainメソッドは不要。
//氏名を格納するフィールドと年齢を格納するフィールドを定義。変数名は自由でカプセル化。
//コンストラクタに名前・年齢の情報を格納する引数を設定。
//処理内容として名前・年齢の各フィールドを引数の情報で初期化する。引数名は自由。
//say という名前のpublicなメソッドを定義。
//sayメソッド実行で、フィールドに代入された名前と年齢を使って
//「○○です。△△歳です。」と画面に System.out.println() で表示する処理を作成。
//戻り値の指定は不要。

package animal;

public class Animal {
    // フィールド
    private String name;
    private int age;

    // 念のためのコンストラクタ
    public Animal() {
    }

    // 引数ありコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // sayメソッド
    public void say() {
        System.out.println("私の名前は " + name + " です。" + "年齢は" + age + "歳です。");
    }

}
