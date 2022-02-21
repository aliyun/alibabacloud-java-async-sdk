// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableKeyResponse} extends {@link TeaModel}
 *
 * <p>DisableKeyResponse</p>
 */
public class DisableKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableKeyResponseBody body;

    private DisableKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableKeyResponse create() {
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
    public DisableKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableKeyResponseBody body);

        @Override
        DisableKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableKeyResponse response) {
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
        public Builder body(DisableKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableKeyResponse build() {
            return new DisableKeyResponse(this);
        } 

    } 

}
