// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricVerifyResponse} extends {@link TeaModel}
 *
 * <p>AsymmetricVerifyResponse</p>
 */
public class AsymmetricVerifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AsymmetricVerifyResponseBody body;

    private AsymmetricVerifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AsymmetricVerifyResponse create() {
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
    public AsymmetricVerifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AsymmetricVerifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AsymmetricVerifyResponseBody body);

        @Override
        AsymmetricVerifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AsymmetricVerifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AsymmetricVerifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AsymmetricVerifyResponse response) {
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
        public Builder body(AsymmetricVerifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AsymmetricVerifyResponse build() {
            return new AsymmetricVerifyResponse(this);
        } 

    } 

}
