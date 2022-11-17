package Tugas2OOPChallenge.VehicleCar;

public class UserCar {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Car mobil = new Car();
        HondaJazz honda = new HondaJazz();
        ToyotaFortuner toyota = new ToyotaFortuner();
        SuzukiKatana suzuki = new SuzukiKatana();

        kendaraan.belokKanan("Kanan");
        kendaraan.belokKiri("Kiri");

        mobil.belokKanan("Kanan");
        mobil.belokKiri("Kiri");

        honda.belokKanan("Kanan");
        honda.belokKiri("Kiri");

        toyota.belokKanan("Kanan");
        toyota.belokKiri("Kiri");

        suzuki.belokKanan("Kanan");
        suzuki.belokKiri("Kiri");
    }
}

class Vehicle {
    int roda = 0;

    public void belokKanan(String blkkanan) {
        System.out.println("Kendaraan berbelok ke " + blkkanan);
    }

    public void belokKiri(String blkkiri) {
        System.out.println("Kendaraan berbelok ke " + blkkiri);
    }
}

class Car extends Vehicle {
    int roda = 4;
    int tangki = 1;

    public void belokKanan(String blkkanan) {
        System.out.println("Kendaraan berbelok ke " + blkkanan);
    }

    public void belokKiri(String blkkiri) {
        System.out.println("Kendaraan berbelok ke " + blkkiri);
    }
}

class HondaJazz extends Car {
    int roda = 4;
    int tangki = 2;

    public void belokKanan(String blkkanan) {
        System.out.println("Kendaraan berbelok ke " + blkkanan);
    }

    public void belokKiri(String blkkiri) {
        System.out.println("Kendaraan berbelok ke " + blkkiri);
    }
}

class ToyotaFortuner extends Car {
    int roda = 4;
    int tangki = 3;

    public void belokKanan(String blkkanan) {
        System.out.println("Kendaraan berbelok ke " + blkkanan);
    }

    public void belokKiri(String blkkiri) {
        System.out.println("Kendaraan berbelok ke " + blkkiri);
    }
}

class SuzukiKatana extends Car {

    int roda = 4;
    int tangki = 4;

    public void belokKanan(String blkkanan) {
        System.out.println("Kendaraan berbelok ke " + blkkanan);
    }

    public void belokKiri(String blkkiri) {
        System.out.println("Kendaraan berbelok ke " + blkkiri);
    }
}
