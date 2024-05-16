import java.io.FileNotFoundException;

public class Chit extends Entity{
    public Chit(){
        super("Крошка Ру");
    }

    public void sayFluff(){
        System.out.println(this.getName() + " сказала: \"Здравствуй, Пух\"");
    }

    public void sayHeels(){
        System.out.println(this.getName() + " сказала: \"Здравствуй, Пятачок\"");
    }

    public void sayTigra(){
        System.out.println(this.getName() + " сказала: \"Здравствуй, Тигра\" (два раза, потому что это очень забавно звучало и, кроме того, он ведь никогда еще так не здоровался)");
    }


}
