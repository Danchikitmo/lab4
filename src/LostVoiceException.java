import java.io.IOException;

public class LostVoiceException extends IOException{
    public LostVoiceException(String message){
        super(message);
    }
}
