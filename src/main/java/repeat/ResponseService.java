package repeat;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Request;

public class ResponseService {

    public static Response getResponse(HandlerInput input) {

        Request request = input.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;

        return new Response(intentRequest.getIntent().getSlots().get("frase").getValue());
    }

}
