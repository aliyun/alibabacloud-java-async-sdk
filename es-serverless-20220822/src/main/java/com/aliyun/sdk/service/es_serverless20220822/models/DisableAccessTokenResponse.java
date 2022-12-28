// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAccessTokenResponse} extends {@link TeaModel}
 *
 * <p>DisableAccessTokenResponse</p>
 */
public class DisableAccessTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableAccessTokenResponseBody body;

    private DisableAccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableAccessTokenResponse create() {
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
    public DisableAccessTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableAccessTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableAccessTokenResponseBody body);

        @Override
        DisableAccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableAccessTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableAccessTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableAccessTokenResponse response) {
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
        public Builder body(DisableAccessTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableAccessTokenResponse build() {
            return new DisableAccessTokenResponse(this);
        } 

    } 

}
