public class Tigra extends Entity{
    public Tigra(){
        super("Тигра");
    }
    public void jump(){
        System.out.println(this.getName() + " тем временем весело прыгал впереди, поминутно возвращаясь, чтобы спросить: \"Сюда идти?\"");
    }
    public void rush(){
        System.out.println(this.getName() + " бросился со всех ног к нему");
    }
    public void comeIn2(){
        System.out.println(this.getName() + " вошел в дом");
    }

    public void saysAbout() throws LostVoiceException {
        System.out.println(this.getName() + " рассказал Кенге зачем он пришел");
    }

    public void lookBuffet() throws LostVoiceException {

        System.out.println("\"Ну что ж, милый " + this.getName() + " загляни в мой буфет и посмотри-- что тебе там понравится\"");
    }
}
