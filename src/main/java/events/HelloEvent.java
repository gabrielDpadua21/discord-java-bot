package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] messageSent = event.getMessage().getContentRaw().split(" ");

        if(messageSent[0].equalsIgnoreCase("hi")) {
            if(!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("Hi, " + event.getAuthor().getName()).queue();
            }
        }
    }

}
