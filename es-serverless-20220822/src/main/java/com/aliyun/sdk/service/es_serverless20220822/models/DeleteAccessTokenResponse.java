// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessTokenResponse} extends {@link TeaModel}
 *
 * <p>DeleteAccessTokenResponse</p>
 */
public class DeleteAccessTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAccessTokenResponseBody body;

    private DeleteAccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAccessTokenResponse create() {
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
    public DeleteAccessTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAccessTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAccessTokenResponseBody body);

        @Override
        DeleteAccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAccessTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAccessTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAccessTokenResponse response) {
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
        public Builder body(DeleteAccessTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAccessTokenResponse build() {
            return new DeleteAccessTokenResponse(this);
        } 

    } 

}
