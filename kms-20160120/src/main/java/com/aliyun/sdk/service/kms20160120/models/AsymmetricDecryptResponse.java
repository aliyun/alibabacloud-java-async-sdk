// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricDecryptResponse} extends {@link TeaModel}
 *
 * <p>AsymmetricDecryptResponse</p>
 */
public class AsymmetricDecryptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AsymmetricDecryptResponseBody body;

    private AsymmetricDecryptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AsymmetricDecryptResponse create() {
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
    public AsymmetricDecryptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AsymmetricDecryptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AsymmetricDecryptResponseBody body);

        @Override
        AsymmetricDecryptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AsymmetricDecryptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AsymmetricDecryptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AsymmetricDecryptResponse response) {
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
        public Builder body(AsymmetricDecryptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AsymmetricDecryptResponse build() {
            return new AsymmetricDecryptResponse(this);
        } 

    } 

}
