public class Heels extends Entity implements AbleToComeUp1{
    public Heels(){
        super("Пятачек");
    }

    public void comeUp1(){
        System.out.println(this.getName() + " подошел к " + name + " обнялся с ним и рассказал, в чем дело");
    }

    public static class ComeInClass extends Heels{
        public void comeIn1(String status) throws BrokenLegException {
            if (status == "good"){
                System.out.println(this.getName() + " вошел в дом");
            } else{
                throw new BrokenLegException("Сломал ногу");
            }


        }
    }


    public void loc_class(){
        class SaysAboutClass{
            Heels heels = new Heels();
            public void saysAbout(){
                System.out.println(heels.getName() + " рассказал Кенге зачем он пришел");
            }
        }

        SaysAboutClass saysAboutClass = new SaysAboutClass();
        saysAboutClass.saysAbout();

    }
}
