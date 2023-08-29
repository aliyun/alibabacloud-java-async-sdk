// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificatePrivateKeyResponse} extends {@link TeaModel}
 *
 * <p>DescribeCertificatePrivateKeyResponse</p>
 */
public class DescribeCertificatePrivateKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCertificatePrivateKeyResponseBody body;

    private DescribeCertificatePrivateKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCertificatePrivateKeyResponse create() {
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
    public DescribeCertificatePrivateKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCertificatePrivateKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCertificatePrivateKeyResponseBody body);

        @Override
        DescribeCertificatePrivateKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCertificatePrivateKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCertificatePrivateKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCertificatePrivateKeyResponse response) {
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
        public Builder body(DescribeCertificatePrivateKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCertificatePrivateKeyResponse build() {
            return new DescribeCertificatePrivateKeyResponse(this);
        } 

    } 

}
