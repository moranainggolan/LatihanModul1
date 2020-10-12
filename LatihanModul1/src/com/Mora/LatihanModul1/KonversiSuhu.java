package com.Mora.LatihanModul1;

public class KonversiSuhu {

    public float CF(float suhu){
        float total = (suhu * 9 / 5 ) + 32;
        return total ;

    }
    public float FK(float suhu){
        float total = (suhu - 32 ) * 5 / 9 + 273;
        return total;

    }
    public float KR(float suhu) {
        float total = (suhu - 273) * 4 / 5;
        return total;
    }

    public float RC(float suhu) {
        float total = suhu * 5 / 4;
        return total;
    }

}