// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RotateSecretResponse} extends {@link TeaModel}
 *
 * <p>RotateSecretResponse</p>
 */
public class RotateSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RotateSecretResponseBody body;

    private RotateSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RotateSecretResponse create() {
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
    public RotateSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RotateSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RotateSecretResponseBody body);

        @Override
        RotateSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RotateSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RotateSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RotateSecretResponse response) {
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
        public Builder body(RotateSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RotateSecretResponse build() {
            return new RotateSecretResponse(this);
        } 

    } 

}
