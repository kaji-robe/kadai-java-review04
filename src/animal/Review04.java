//◆Review04クラス（Review04.java）
//mainメソッドを作成。
//Humanクラスのインスタンスを3つ作成。変数名は tanaka・suzuki・sato。
//名前・年齢・趣味の各情報はコンストラクタで初期化する。
//変数    名前  年齢  趣味
//tanaka    田中 太郎   25  電車
//suzuki    鈴木 次郎   30  野球
//sato  佐藤 花子   20  映画
//3人の各インスタンスで say と think メソッドを実行する。
//各 say と think メソッドの実行順序は下記の通り。
//田中 太郎です。25歳です。
//私は電車について考えています。
//鈴木 次郎です。30歳です。
//私は野球について考えています。
//佐藤 花子です。20歳です。
//私は映画について考えています。

package animal;
public class Review04 {
    public static void main(String[] args) {
        Human tanaka = new Human("田中太郎", 25, "電車");
        Human suzuki = new Human("鈴木次郎", 30, "野球");
        Human satou = new Human("佐藤花子", 20, "映画");

        tanaka.say();
        tanaka.think();
        suzuki.say();
        suzuki.think();
        satou.say();
        satou.think();

    }
}