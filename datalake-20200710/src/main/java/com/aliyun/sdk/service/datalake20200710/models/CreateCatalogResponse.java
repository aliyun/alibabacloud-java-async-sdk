// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCatalogResponse} extends {@link TeaModel}
 *
 * <p>CreateCatalogResponse</p>
 */
public class CreateCatalogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCatalogResponseBody body;

    private CreateCatalogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCatalogResponse create() {
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
    public CreateCatalogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCatalogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCatalogResponseBody body);

        @Override
        CreateCatalogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCatalogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCatalogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCatalogResponse response) {
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
        public Builder body(CreateCatalogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCatalogResponse build() {
            return new CreateCatalogResponse(this);
        } 

    } 

}
