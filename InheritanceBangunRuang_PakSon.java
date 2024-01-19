package inheritancebangunruang_pakson;

public class InheritanceBangunRuang_PakSon {

    
    public static void main(String[] args) {
        BangunRuang BangunRuang = new BangunRuang();
        
        bola Bola = new bola();
        Bola.r = 2.0;
        
        balok Balok = new balok();
        Balok.l = 12.0;
        Balok.p = 9.0;
        
        LimasSegitiga LimasSegitiga = new LimasSegitiga();
        LimasSegitiga.a = 10.0;
        LimasSegitiga.t = 15.0;
        LimasSegitiga.tLimas = 17.0;
        
        tabung Tabung = new tabung();
        Tabung.r = 14.0;
        Tabung.t = 20.0;
        
        BangunRuang.LuasPermukaan();
        BangunRuang.Volume();
        
        Bola.Volume();
        Bola.LuasPermukaan();
        
        Balok.Volume();
        Balok.LuasPermukaan();
        
        Tabung.Volume();
        Tabung.LuasPermukaan();
        
        LimasSegitiga.Volume();
        LimasSegitiga.LuasPermukaan();
    }
    }
