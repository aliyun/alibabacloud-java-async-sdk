// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUserAccessTokenResponse} extends {@link TeaModel}
 *
 * <p>GenerateUserAccessTokenResponse</p>
 */
public class GenerateUserAccessTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateUserAccessTokenResponseBody body;

    private GenerateUserAccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateUserAccessTokenResponse create() {
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
    public GenerateUserAccessTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateUserAccessTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateUserAccessTokenResponseBody body);

        @Override
        GenerateUserAccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateUserAccessTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateUserAccessTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateUserAccessTokenResponse response) {
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
        public Builder body(GenerateUserAccessTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateUserAccessTokenResponse build() {
            return new GenerateUserAccessTokenResponse(this);
        } 

    } 

}
