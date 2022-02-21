// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProfileCatalogResponse} extends {@link TeaModel}
 *
 * <p>DeleteProfileCatalogResponse</p>
 */
public class DeleteProfileCatalogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProfileCatalogResponseBody body;

    private DeleteProfileCatalogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProfileCatalogResponse create() {
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
    public DeleteProfileCatalogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProfileCatalogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProfileCatalogResponseBody body);

        @Override
        DeleteProfileCatalogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProfileCatalogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProfileCatalogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProfileCatalogResponse response) {
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
        public Builder body(DeleteProfileCatalogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProfileCatalogResponse build() {
            return new DeleteProfileCatalogResponse(this);
        } 

    } 

}
