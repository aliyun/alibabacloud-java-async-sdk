// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretResponse} extends {@link TeaModel}
 *
 * <p>DeleteSecretResponse</p>
 */
public class DeleteSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSecretResponseBody body;

    private DeleteSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSecretResponse create() {
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
    public DeleteSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSecretResponseBody body);

        @Override
        DeleteSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSecretResponse response) {
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
        public Builder body(DeleteSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSecretResponse build() {
            return new DeleteSecretResponse(this);
        } 

    } 

}
