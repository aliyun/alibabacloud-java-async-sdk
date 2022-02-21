// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKeyMaterialResponse} extends {@link TeaModel}
 *
 * <p>DeleteKeyMaterialResponse</p>
 */
public class DeleteKeyMaterialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteKeyMaterialResponseBody body;

    private DeleteKeyMaterialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteKeyMaterialResponse create() {
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
    public DeleteKeyMaterialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteKeyMaterialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteKeyMaterialResponseBody body);

        @Override
        DeleteKeyMaterialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteKeyMaterialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteKeyMaterialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteKeyMaterialResponse response) {
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
        public Builder body(DeleteKeyMaterialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteKeyMaterialResponse build() {
            return new DeleteKeyMaterialResponse(this);
        } 

    } 

}
