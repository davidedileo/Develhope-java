//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Auto auto = new Auto(1368,"CW189PD","Delta","Lancia");
        System.out.println("La cilindrata dell'auto è: " + auto.getCilindrata());
        System.out.println("La targa dell'auto è: " + auto.getTarga());
        System.out.println("Il modello dell'auto è: " + auto.getModello());
        System.out.println("La marca dell'auto è: " + auto.getMarca());
    }
}