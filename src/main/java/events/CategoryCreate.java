package events;

import net.dv8tion.jda.core.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CategoryCreate extends ListenerAdapter {

    public void onCategoryCreate(CategoryCreateEvent event) {

        String name = event.getCategory().getName();

        event.getGuild()
                .getDefaultChannel()
                .sendMessage( "Someone just create an category: " + name)
                .queue();
    }

}
