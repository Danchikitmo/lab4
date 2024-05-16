import java.lang.reflect.Field;

public class Main{
    public static void main(String[] args) {
        System.out.println(System.getenv("FILE_PATH"));
        Tigra tigra = new Tigra();
        tigra.jump();

        Robin robin = new Robin();
        Robin.InHomeClass inHomeObject = robin.new InHomeClass();
        inHomeObject.inHome();

        AbleToComeUp1 justComeUp = new AbleToComeUp1(){
            @Override
            public void comeUp1() throws BrokenLegException {
                Robin robin = new Robin();
                String approached = null;
                try {
                    Field field = robin.getClass().getDeclaredField("approached");
                    field.setAccessible(true);
                    approached = (String) field.get(robin);
                } catch (NoSuchFieldException | IllegalAccessException e){
                    e.printStackTrace();
                };
                System.out.println("Пятачок подошел к " + approached + ", обнялся с ним и рассказал, в чем дело");
            }
        };

        tigra.rush();

        Fluff fluff = new Fluff();
        fluff.comeUp();

        Heels heels = new Heels();
        justComeUp.comeUp1();

        Fluff fluff1 = new Fluff();
        fluff1.comeIn();

        Heels.ComeInClass comeInClass = new Heels.ComeInClass();
        comeInClass.comeIn1("bad");

        Tigra tigra1 = new Tigra();
        tigra1.comeIn2();

        Chit chit = new Chit();
        chit.sayFluff();

        Chit chit1 = new Chit();
        chit1.sayHeels();

        Chit chit2 = new Chit();
        chit2.sayTigra();

        Fluff fluff2 = new Fluff();
        fluff2.saysAbout();

        heels.loc_class();

        try {
            Tigra tigra2 = new Tigra();
            tigra2.saysAbout();
        } catch (LostVoiceException e){
            System.err.println(e.getMessage());
            System.exit(0);
        }


        Kengi kengi = new Kengi();
        kengi.says(Adjectives.ласково);

        try {
            Tigra tigra3 = new Tigra();
            tigra3.lookBuffet();
        } catch (LostVoiceException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }


        Kengi kengi1 = new Kengi();
        kengi1.understand();
        }

    }
