// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOIDCProviderResponse} extends {@link TeaModel}
 *
 * <p>UpdateOIDCProviderResponse</p>
 */
public class UpdateOIDCProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOIDCProviderResponseBody body;

    private UpdateOIDCProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOIDCProviderResponse create() {
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
    public UpdateOIDCProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOIDCProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOIDCProviderResponseBody body);

        @Override
        UpdateOIDCProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOIDCProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOIDCProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOIDCProviderResponse response) {
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
        public Builder body(UpdateOIDCProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOIDCProviderResponse build() {
            return new UpdateOIDCProviderResponse(this);
        } 

    } 

}
