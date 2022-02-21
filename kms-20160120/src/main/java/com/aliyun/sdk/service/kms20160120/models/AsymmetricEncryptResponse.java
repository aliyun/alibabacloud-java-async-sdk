// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricEncryptResponse} extends {@link TeaModel}
 *
 * <p>AsymmetricEncryptResponse</p>
 */
public class AsymmetricEncryptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AsymmetricEncryptResponseBody body;

    private AsymmetricEncryptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AsymmetricEncryptResponse create() {
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
    public AsymmetricEncryptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AsymmetricEncryptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AsymmetricEncryptResponseBody body);

        @Override
        AsymmetricEncryptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AsymmetricEncryptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AsymmetricEncryptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AsymmetricEncryptResponse response) {
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
        public Builder body(AsymmetricEncryptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AsymmetricEncryptResponse build() {
            return new AsymmetricEncryptResponse(this);
        } 

    } 

}
