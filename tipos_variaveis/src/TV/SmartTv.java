package tv;
// TV tem as características: ligada(boolean), canal(int) e volume(int)
// TV poderá ligar e desligar e assim mudar o estado ligada
// TV aumentará e diminuirá o volume sempre em + 1 ou -1
// TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
public class SmartTv {
    boolean ligada = false;
    int canal = 1; 
    int volume = 15;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal ++;
    }

    public void diminuirCanal() {
        canal --;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
