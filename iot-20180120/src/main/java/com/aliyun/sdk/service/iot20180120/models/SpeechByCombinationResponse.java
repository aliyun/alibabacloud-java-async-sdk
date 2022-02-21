// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SpeechByCombinationResponse} extends {@link TeaModel}
 *
 * <p>SpeechByCombinationResponse</p>
 */
public class SpeechByCombinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SpeechByCombinationResponseBody body;

    private SpeechByCombinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SpeechByCombinationResponse create() {
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
    public SpeechByCombinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SpeechByCombinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SpeechByCombinationResponseBody body);

        @Override
        SpeechByCombinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SpeechByCombinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SpeechByCombinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SpeechByCombinationResponse response) {
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
        public Builder body(SpeechByCombinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SpeechByCombinationResponse build() {
            return new SpeechByCombinationResponse(this);
        } 

    } 

}
