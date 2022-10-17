package zeus;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class main {
    public static JDA sharddMan;
    public static JDABuilder builder;

    public static void main(String[] args) throws LoginException {
        builder = JDABuilder.createDefault("klkmanin");
        builder
            .setStatus(OnlineStatus.IDLE)
            .setActivity(Activity.competing("Mario kart"));
        sharddMan = builder.build();
    }
}
