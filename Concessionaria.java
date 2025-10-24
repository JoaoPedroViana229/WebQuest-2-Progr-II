public class Concessionaria {
    public static void main(String[] args) {
        java.util.List<Veiculo> lista = new java.util.ArrayList<>();
        
        Carro c1 = new Carro();
        c1.setPlaca("ABC-1234");
        c1.setMarca("Fiat");
        c1.setModelo("Uno");
        c1.setAno(2015);
        c1.setValor(25000);
        c1.setNumeroPortas(4);
        lista.add(c1);

        Carro c2 = new Carro();
        c2.setPlaca("DEF-5678");
        c2.setMarca("VW");
        c2.setModelo("Gol");
        c2.setAno(2018);
        c2.setValor(35000);
        c2.setNumeroPortas(4);
        lista.add(c2);

        Carro c3 = new Carro();
        c3.setPlaca("GHI-9012");
        c3.setMarca("Toyota");
        c3.setModelo("Corolla");
        c3.setAno(2020);
        c3.setValor(90000);
        c3.setNumeroPortas(4);
        lista.add(c3);

        Moto m1 = new Moto();
        m1.setPlaca("XYZ-5678");
        m1.setMarca("Honda");
        m1.setModelo("CG");
        m1.setAno(2018);
        m1.setValor(8000);
        m1.setCilindradas(125);
        lista.add(m1);

        Moto m2 = new Moto();
        m2.setPlaca("WXY-4567");
        m2.setMarca("Yamaha");
        m2.setModelo("Motocop");
        m2.setAno(2019);
        m2.setValor(12000);
        m2.setCilindradas(250);
        lista.add(m2);

        for (Veiculo v : lista) {
            System.out.println("Placa: " + v.getPlaca());
            System.out.printf("IPVA: " + v.calcularIpva());
            System.out.println("\n---------------");
        }
    }
}