// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePrivateKeyDecryptResponse} extends {@link TeaModel}
 *
 * <p>CertificatePrivateKeyDecryptResponse</p>
 */
public class CertificatePrivateKeyDecryptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CertificatePrivateKeyDecryptResponseBody body;

    private CertificatePrivateKeyDecryptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CertificatePrivateKeyDecryptResponse create() {
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
    public CertificatePrivateKeyDecryptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CertificatePrivateKeyDecryptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CertificatePrivateKeyDecryptResponseBody body);

        @Override
        CertificatePrivateKeyDecryptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CertificatePrivateKeyDecryptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CertificatePrivateKeyDecryptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CertificatePrivateKeyDecryptResponse response) {
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
        public Builder body(CertificatePrivateKeyDecryptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CertificatePrivateKeyDecryptResponse build() {
            return new CertificatePrivateKeyDecryptResponse(this);
        } 

    } 

}
