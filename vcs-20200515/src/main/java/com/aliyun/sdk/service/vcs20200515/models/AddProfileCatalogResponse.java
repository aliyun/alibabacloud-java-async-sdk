// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProfileCatalogResponse} extends {@link TeaModel}
 *
 * <p>AddProfileCatalogResponse</p>
 */
public class AddProfileCatalogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddProfileCatalogResponseBody body;

    private AddProfileCatalogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddProfileCatalogResponse create() {
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
    public AddProfileCatalogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddProfileCatalogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddProfileCatalogResponseBody body);

        @Override
        AddProfileCatalogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddProfileCatalogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddProfileCatalogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddProfileCatalogResponse response) {
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
        public Builder body(AddProfileCatalogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddProfileCatalogResponse build() {
            return new AddProfileCatalogResponse(this);
        } 

    } 

}
