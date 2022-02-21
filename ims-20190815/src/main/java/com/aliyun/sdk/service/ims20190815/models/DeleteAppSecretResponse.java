// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppSecretResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppSecretResponse</p>
 */
public class DeleteAppSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppSecretResponseBody body;

    private DeleteAppSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppSecretResponse create() {
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
    public DeleteAppSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppSecretResponseBody body);

        @Override
        DeleteAppSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppSecretResponse response) {
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
        public Builder body(DeleteAppSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppSecretResponse build() {
            return new DeleteAppSecretResponse(this);
        } 

    } 

}
