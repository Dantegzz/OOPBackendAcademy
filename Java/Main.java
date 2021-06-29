class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        UberX uberX = new UberX("SPA202", new Account("Dante Gonzalez", "GOG3455"), "Volkswagen", "Jetta");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("SSP2345", new Account("Luis Perez", "LGP345"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger = 3;
        car2.printDataCar();*/
    }
}