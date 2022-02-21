// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpeechVoiceResponse} extends {@link TeaModel}
 *
 * <p>GetSpeechVoiceResponse</p>
 */
public class GetSpeechVoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSpeechVoiceResponseBody body;

    private GetSpeechVoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSpeechVoiceResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public GetSpeechVoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSpeechVoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSpeechVoiceResponseBody body);

        @Override
        GetSpeechVoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSpeechVoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSpeechVoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSpeechVoiceResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetSpeechVoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSpeechVoiceResponse build() {
            return new GetSpeechVoiceResponse(this);
        } 

    } 

}
