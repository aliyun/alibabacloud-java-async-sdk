// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetWelcomeTextAndMusicResponse} extends {@link TeaModel}
 *
 * <p>ResetWelcomeTextAndMusicResponse</p>
 */
public class ResetWelcomeTextAndMusicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetWelcomeTextAndMusicResponseBody body;

    private ResetWelcomeTextAndMusicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetWelcomeTextAndMusicResponse create() {
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
    public ResetWelcomeTextAndMusicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetWelcomeTextAndMusicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetWelcomeTextAndMusicResponseBody body);

        @Override
        ResetWelcomeTextAndMusicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetWelcomeTextAndMusicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetWelcomeTextAndMusicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetWelcomeTextAndMusicResponse response) {
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
        public Builder body(ResetWelcomeTextAndMusicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetWelcomeTextAndMusicResponse build() {
            return new ResetWelcomeTextAndMusicResponse(this);
        } 

    } 

}
