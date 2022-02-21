// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveClientIdFromOIDCProviderResponse} extends {@link TeaModel}
 *
 * <p>RemoveClientIdFromOIDCProviderResponse</p>
 */
public class RemoveClientIdFromOIDCProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveClientIdFromOIDCProviderResponseBody body;

    private RemoveClientIdFromOIDCProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveClientIdFromOIDCProviderResponse create() {
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
    public RemoveClientIdFromOIDCProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveClientIdFromOIDCProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveClientIdFromOIDCProviderResponseBody body);

        @Override
        RemoveClientIdFromOIDCProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveClientIdFromOIDCProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveClientIdFromOIDCProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveClientIdFromOIDCProviderResponse response) {
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
        public Builder body(RemoveClientIdFromOIDCProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveClientIdFromOIDCProviderResponse build() {
            return new RemoveClientIdFromOIDCProviderResponse(this);
        } 

    } 

}
