public class Kengi extends Entity{
    public Kengi(){
        super("Кенги");
    }

    public void says(Adjectives adjectives){
        System.out.println(this.getName() + " очень " + adjectives.ласково + " сказала:");
    }

    public void understand(){
        System.out.println("Ведь " + this.getName() + " сразу поняла, что, хотя с виду Тигра очень большой, он так же нуждается в ласке, как и Крошка Ру.");
    }
}
