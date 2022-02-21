// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushSpeechResponse} extends {@link TeaModel}
 *
 * <p>PushSpeechResponse</p>
 */
public class PushSpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushSpeechResponseBody body;

    private PushSpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushSpeechResponse create() {
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
    public PushSpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushSpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushSpeechResponseBody body);

        @Override
        PushSpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushSpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushSpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushSpeechResponse response) {
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
        public Builder body(PushSpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushSpeechResponse build() {
            return new PushSpeechResponse(this);
        } 

    } 

}
