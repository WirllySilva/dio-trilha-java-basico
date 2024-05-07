public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 2;

    public void ligar() {
        if(ligada == false) {
            System.out.println("Ligando a tv!");
        } else {
            System.out.println("A tv já está ligada!");
        }
        ligada = true;
    }
    public void desligar() {
        if(ligada == false) {
            System.out.println("A tv já está desligada!");
        } else {
            System.out.println("Desligando a tv!");
        }
        ligada = false;
        
    }

    public void aumentarVolume() {
        if(ligada == true) {
            System.out.println("Aumentando volume em +1");
            volume++;
            System.out.println("Volume atual: " + volume);
        } else {
            System.out.println("Não é possível aumentar, tv está desligada!");
        }
    }

    public void diminuirVolume() {
        if(ligada == true & volume>0) {
            System.out.println("Diminuindo volume em -1");
            volume--;
            System.out.println("Volume atual: " + volume);
        } else if(volume==0) {
            System.out.println("Volume mínimo atingido");
        } else {
            System.out.println("Impossível diminuir, a tv está desligada!");
        }
    }

    public void mudarCanal() {
        if(ligada == true) {
            System.out.println("Mudando para o proximo canal");
            canal++;
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Impossivel mudar de canal, tv desligada");
        }
    }

}
