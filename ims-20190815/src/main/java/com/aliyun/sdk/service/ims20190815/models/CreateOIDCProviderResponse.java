// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOIDCProviderResponse} extends {@link TeaModel}
 *
 * <p>CreateOIDCProviderResponse</p>
 */
public class CreateOIDCProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOIDCProviderResponseBody body;

    private CreateOIDCProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOIDCProviderResponse create() {
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
    public CreateOIDCProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOIDCProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOIDCProviderResponseBody body);

        @Override
        CreateOIDCProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOIDCProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOIDCProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOIDCProviderResponse response) {
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
        public Builder body(CreateOIDCProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOIDCProviderResponse build() {
            return new CreateOIDCProviderResponse(this);
        } 

    } 

}
