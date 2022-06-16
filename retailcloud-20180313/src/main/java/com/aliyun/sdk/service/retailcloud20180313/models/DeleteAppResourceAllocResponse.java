// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppResourceAllocResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppResourceAllocResponse</p>
 */
public class DeleteAppResourceAllocResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppResourceAllocResponseBody body;

    private DeleteAppResourceAllocResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppResourceAllocResponse create() {
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
    public DeleteAppResourceAllocResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppResourceAllocResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppResourceAllocResponseBody body);

        @Override
        DeleteAppResourceAllocResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppResourceAllocResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppResourceAllocResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppResourceAllocResponse response) {
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
        public Builder body(DeleteAppResourceAllocResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppResourceAllocResponse build() {
            return new DeleteAppResourceAllocResponse(this);
        } 

    } 

}
