// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushWelcomeTextAndMusicResponse} extends {@link TeaModel}
 *
 * <p>PushWelcomeTextAndMusicResponse</p>
 */
public class PushWelcomeTextAndMusicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushWelcomeTextAndMusicResponseBody body;

    private PushWelcomeTextAndMusicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushWelcomeTextAndMusicResponse create() {
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
    public PushWelcomeTextAndMusicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushWelcomeTextAndMusicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushWelcomeTextAndMusicResponseBody body);

        @Override
        PushWelcomeTextAndMusicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushWelcomeTextAndMusicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushWelcomeTextAndMusicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushWelcomeTextAndMusicResponse response) {
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
        public Builder body(PushWelcomeTextAndMusicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushWelcomeTextAndMusicResponse build() {
            return new PushWelcomeTextAndMusicResponse(this);
        } 

    } 

}
