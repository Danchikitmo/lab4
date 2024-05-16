public class Fluff extends Entity implements AbleToComeUp{
    public Fluff(){
        super("Пух");
    }

    public void comeUp(){
        System.out.println(this.getName() + " подошел к Кристоферу Робину обнялся с ним и рассказал, в чем дело");
    }

    public void comeIn(){
        System.out.println(this.getName() + " вошел в дом");
    }

    public void saysAbout(){
        System.out.println(this.getName() + " рассказал Кенге зачем он пришел");
    }
}
