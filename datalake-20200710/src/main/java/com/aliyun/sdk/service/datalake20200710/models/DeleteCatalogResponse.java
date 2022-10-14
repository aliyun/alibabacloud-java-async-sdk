// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCatalogResponse} extends {@link TeaModel}
 *
 * <p>DeleteCatalogResponse</p>
 */
public class DeleteCatalogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCatalogResponseBody body;

    private DeleteCatalogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCatalogResponse create() {
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
    public DeleteCatalogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCatalogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCatalogResponseBody body);

        @Override
        DeleteCatalogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCatalogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCatalogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCatalogResponse response) {
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
        public Builder body(DeleteCatalogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCatalogResponse build() {
            return new DeleteCatalogResponse(this);
        } 

    } 

}
