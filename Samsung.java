
package pkginterface;


public class Samsung implements Phone{

    private int volume ;
    private boolean power;
    
    public Samsung (){
        this.volume = 40;
        this.power = false;
    }
    
    @Override
    public void powerOn() {
        if(power){
            System.out.println("--SmartPhone Sudah Menyala--");
        } else{
            power = true;
            System.out.println(" -------SAMSUNG-------");
            System.out.println("--Powered By Android--");
            System.out.println("------Android 11------");
        }
    }

    @Override
    public void powerOff() {
        if(power){
           power = false;
            System.out.println("---Smartphone Dimatikan---");
        } else {}
    }

    @Override
    public void volumeUp() {
        if(power){
            if (volume == MAX_VOLUME) {
                System.out.println("Volume penuh = 100");
            } else {
                volume+=10;
                System.out.println("volume sekarang "+ volume);
            }
        } else{
            System.out.println("Smartphone sedang Off");
        }
    }

    @Override
    public void volumeDown() {
        if(power){
            if (volume == MIN_VOLUME) {
                System.out.println("Volume sekarang = 0");
            } else {
                volume-=10;
                System.out.println("volume sekarang "+ volume);
            }
        } else{
            System.out.println("Smartphone sedang Off");
        }
    }
    
}
