package repeat;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import repeat.handlers.HelpIntentHandler;
import repeat.handlers.LaunchRequestHandler;
import repeat.handlers.RepeatRequestHandler;
import repeat.handlers.SessionEndedRequestHandler;

public class ResponseStreamHandler extends SkillStreamHandler {

    public static final String SKILL_TITLE = "Repite la frase";

    private static Skill getSkill() {
        return Skills
                .standard()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        new RepeatRequestHandler()
                )
                // .withSkillId("your-skill-id")
                .build();
    }

    public ResponseStreamHandler() {
        super(getSkill());
    }
}
