// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAfterAnswerDelayPlaybackResponse} extends {@link TeaModel}
 *
 * <p>SaveAfterAnswerDelayPlaybackResponse</p>
 */
public class SaveAfterAnswerDelayPlaybackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveAfterAnswerDelayPlaybackResponseBody body;

    private SaveAfterAnswerDelayPlaybackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveAfterAnswerDelayPlaybackResponse create() {
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
    public SaveAfterAnswerDelayPlaybackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveAfterAnswerDelayPlaybackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveAfterAnswerDelayPlaybackResponseBody body);

        @Override
        SaveAfterAnswerDelayPlaybackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveAfterAnswerDelayPlaybackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveAfterAnswerDelayPlaybackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveAfterAnswerDelayPlaybackResponse response) {
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
        public Builder body(SaveAfterAnswerDelayPlaybackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveAfterAnswerDelayPlaybackResponse build() {
            return new SaveAfterAnswerDelayPlaybackResponse(this);
        } 

    } 

}
