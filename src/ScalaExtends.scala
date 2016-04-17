object Main extends App{
    new 戦車().パーツ表示();
    new 戦車３８ｔ().パーツ表示();
    new ヘッツァー().パーツ表示();
}

trait 戦車インターフェース {
    var 砲塔:String = "";
    var 砲:String = "";
    var 履帯:String = "";
    def パーツ表示()
}

class 戦車 extends 戦車インターフェース {
    this.砲塔 = "なし";
    this.砲 = "なし";
    this.履帯 = "なし";
    def パーツ表示() {
        println("砲塔は" + this.砲塔);
        println("砲は" + this.砲);
        println("履帯は" + this.履帯);
    }
}

class 戦車３８ｔ extends 戦車 {
    this.砲塔 = "Pz.Kpfw 38(t) Ausf. G";
    this.砲 = "4,7 cm Kw.K. 38 (t) L/43";
    this.履帯 = "Pz.Kpfw 38(t) Ausf. E";
}

class ヘッツァー extends 戦車 {
    this.砲 = "10.5 cm Stu.H. 42 L/28";
    this.砲塔 = "ヘッツァー改装キット";
}