// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppResponse</p>
 */
public class DeleteAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppResponseBody body;

    private DeleteAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppResponse create() {
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
    public DeleteAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppResponseBody body);

        @Override
        DeleteAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppResponse response) {
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
        public Builder body(DeleteAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppResponse build() {
            return new DeleteAppResponse(this);
        } 

    } 

}
