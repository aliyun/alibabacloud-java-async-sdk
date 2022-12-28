// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAccessTokenResponse} extends {@link TeaModel}
 *
 * <p>EnableAccessTokenResponse</p>
 */
public class EnableAccessTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableAccessTokenResponseBody body;

    private EnableAccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableAccessTokenResponse create() {
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
    public EnableAccessTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableAccessTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableAccessTokenResponseBody body);

        @Override
        EnableAccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableAccessTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableAccessTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableAccessTokenResponse response) {
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
        public Builder body(EnableAccessTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableAccessTokenResponse build() {
            return new EnableAccessTokenResponse(this);
        } 

    } 

}
