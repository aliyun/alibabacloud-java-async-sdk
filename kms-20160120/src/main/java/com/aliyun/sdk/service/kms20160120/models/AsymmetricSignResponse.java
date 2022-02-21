// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricSignResponse} extends {@link TeaModel}
 *
 * <p>AsymmetricSignResponse</p>
 */
public class AsymmetricSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AsymmetricSignResponseBody body;

    private AsymmetricSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AsymmetricSignResponse create() {
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
    public AsymmetricSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AsymmetricSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AsymmetricSignResponseBody body);

        @Override
        AsymmetricSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AsymmetricSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AsymmetricSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AsymmetricSignResponse response) {
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
        public Builder body(AsymmetricSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AsymmetricSignResponse build() {
            return new AsymmetricSignResponse(this);
        } 

    } 

}
