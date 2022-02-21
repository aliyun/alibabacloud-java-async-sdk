// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppEnvResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppEnvResponse</p>
 */
public class DeleteAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppEnvResponseBody body;

    private DeleteAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppEnvResponse create() {
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
    public DeleteAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppEnvResponseBody body);

        @Override
        DeleteAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppEnvResponse response) {
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
        public Builder body(DeleteAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppEnvResponse build() {
            return new DeleteAppEnvResponse(this);
        } 

    } 

}
