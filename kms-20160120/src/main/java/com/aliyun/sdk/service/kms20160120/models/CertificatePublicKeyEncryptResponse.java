// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePublicKeyEncryptResponse} extends {@link TeaModel}
 *
 * <p>CertificatePublicKeyEncryptResponse</p>
 */
public class CertificatePublicKeyEncryptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CertificatePublicKeyEncryptResponseBody body;

    private CertificatePublicKeyEncryptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CertificatePublicKeyEncryptResponse create() {
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
    public CertificatePublicKeyEncryptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CertificatePublicKeyEncryptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CertificatePublicKeyEncryptResponseBody body);

        @Override
        CertificatePublicKeyEncryptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CertificatePublicKeyEncryptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CertificatePublicKeyEncryptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CertificatePublicKeyEncryptResponse response) {
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
        public Builder body(CertificatePublicKeyEncryptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CertificatePublicKeyEncryptResponse build() {
            return new CertificatePublicKeyEncryptResponse(this);
        } 

    } 

}
