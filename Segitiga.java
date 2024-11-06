public class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga(double sisi) {
        this.sisi = sisi;
        
    }

    private double calculateSisi() {
        double setengahAlas = this.alas / 2;
        return Math.sqrt(Math.pow(setengahAlas, 2) + Math.pow(this.tinggi, 2));
        // double setAlasKuadrat = Math.pow(setengahAlas, 2);
        // double tinggiKuadrat = Math.pow(tinggi, 2);
        // double hasil = setAlasKuadrat + tinggiKuadrat;
        // double hasilAkar = Math.sqrt(hasil);
        // return hasilAkar;
    }

    private double calculateTinggi() {
        double setengahAlas = this.alas / 2;
        return Math.sqrt(Math.pow(this.sisi, 2) - Math.pow(setengahAlas, 2));
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        if (tinggi != 0) {
            return tinggi;
        } else {
            return calculateTinggi();
        }
    }

    public double getSisi() {
        if (sisi != 0) {
            return sisi;
        } else {
            return calculateSisi();
        }
    }

    public double getLuas() {
        // return 0.5 * this.alas * this.tinggi;
        if (alas == 0 && tinggi == 0) {
            return (Math.sqrt(sisi) / 4) * Math.pow(sisi, 2);
        } 
        return (1.0 / 2) * alas * this.getTinggi();
        
    }

    public double getKeliling() {
        if (alas == 0 && tinggi == 0) {
            return 3 * sisi;
        } else {
            return 3 * this.getSisi();
        }
        


        
    }
}