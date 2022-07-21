// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SpeechBySynthesisResponse} extends {@link TeaModel}
 *
 * <p>SpeechBySynthesisResponse</p>
 */
public class SpeechBySynthesisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SpeechBySynthesisResponseBody body;

    private SpeechBySynthesisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SpeechBySynthesisResponse create() {
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
    public SpeechBySynthesisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SpeechBySynthesisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SpeechBySynthesisResponseBody body);

        @Override
        SpeechBySynthesisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SpeechBySynthesisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SpeechBySynthesisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SpeechBySynthesisResponse response) {
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
        public Builder body(SpeechBySynthesisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SpeechBySynthesisResponse build() {
            return new SpeechBySynthesisResponse(this);
        } 

    } 

}
