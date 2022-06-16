// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppEnvironmentResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppEnvironmentResponse</p>
 */
public class DeleteAppEnvironmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppEnvironmentResponseBody body;

    private DeleteAppEnvironmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppEnvironmentResponse create() {
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
    public DeleteAppEnvironmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppEnvironmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppEnvironmentResponseBody body);

        @Override
        DeleteAppEnvironmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppEnvironmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppEnvironmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppEnvironmentResponse response) {
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
        public Builder body(DeleteAppEnvironmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppEnvironmentResponse build() {
            return new DeleteAppEnvironmentResponse(this);
        } 

    } 

}
