package repeat.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.request.Predicates;
import repeat.Response;
import repeat.ResponseService;
import repeat.ResponseStreamHandler;

import java.util.Optional;

public class RepeatRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("RepeatIntent"));
    }

    @Override
    public Optional<com.amazon.ask.model.Response> handle(HandlerInput input) {
        Response r = ResponseService.getResponse(input);

        String speechText = r.getResponse();
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(ResponseStreamHandler.SKILL_TITLE, speechText)
                .withShouldEndSession(true)

                .build();
    }
}
