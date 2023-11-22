package classes;

public class CalculoPeso {

    public double pesoIdeal(double altura, String genero) {
        if (genero.equalsIgnoreCase("homem")) {
            return (72.7 * altura) - 58;
        } else {
            return (62.1 * altura) - 44.7;
        }
    }
    public double porcertagemDoPesoIdeal(double altura, String genero, double peso){
        return (1 - pesoIdeal(altura,genero)/peso)*100;
    }
}

