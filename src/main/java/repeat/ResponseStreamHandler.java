package repeat;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import repeat.handlers.HelpIntentHandler;
import repeat.handlers.LaunchRequestHandler;
import repeat.handlers.QuoteRequestHandler;
import repeat.handlers.SessionEndedRequestHandler;

public class QuotesStreamHandler extends SkillStreamHandler {

    public static final String SKILL_TITLE = "Frases famosas";

    private static Skill getSkill() {
        return Skills
                .standard()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        new QuoteRequestHandler()
                )
                // .withSkillId("your-skill-id")
                .build();
    }

    public QuotesStreamHandler() {
        super(getSkill());
    }
}
