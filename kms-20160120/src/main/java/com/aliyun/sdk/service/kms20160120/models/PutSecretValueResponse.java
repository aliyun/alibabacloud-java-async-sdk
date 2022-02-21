// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutSecretValueResponse} extends {@link TeaModel}
 *
 * <p>PutSecretValueResponse</p>
 */
public class PutSecretValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutSecretValueResponseBody body;

    private PutSecretValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutSecretValueResponse create() {
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
    public PutSecretValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutSecretValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutSecretValueResponseBody body);

        @Override
        PutSecretValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutSecretValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutSecretValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutSecretValueResponse response) {
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
        public Builder body(PutSecretValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutSecretValueResponse build() {
            return new PutSecretValueResponse(this);
        } 

    } 

}
