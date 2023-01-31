// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAfterAnswerDelayPlaybackResponse} extends {@link TeaModel}
 *
 * <p>GetAfterAnswerDelayPlaybackResponse</p>
 */
public class GetAfterAnswerDelayPlaybackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAfterAnswerDelayPlaybackResponseBody body;

    private GetAfterAnswerDelayPlaybackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAfterAnswerDelayPlaybackResponse create() {
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
    public GetAfterAnswerDelayPlaybackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAfterAnswerDelayPlaybackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAfterAnswerDelayPlaybackResponseBody body);

        @Override
        GetAfterAnswerDelayPlaybackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAfterAnswerDelayPlaybackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAfterAnswerDelayPlaybackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAfterAnswerDelayPlaybackResponse response) {
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
        public Builder body(GetAfterAnswerDelayPlaybackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAfterAnswerDelayPlaybackResponse build() {
            return new GetAfterAnswerDelayPlaybackResponse(this);
        } 

    } 

}
