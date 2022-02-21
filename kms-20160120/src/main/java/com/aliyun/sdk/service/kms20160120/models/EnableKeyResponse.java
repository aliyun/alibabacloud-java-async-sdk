// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableKeyResponse} extends {@link TeaModel}
 *
 * <p>EnableKeyResponse</p>
 */
public class EnableKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableKeyResponseBody body;

    private EnableKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableKeyResponse create() {
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
    public EnableKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableKeyResponseBody body);

        @Override
        EnableKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableKeyResponse response) {
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
        public Builder body(EnableKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableKeyResponse build() {
            return new EnableKeyResponse(this);
        } 

    } 

}
