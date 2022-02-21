// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePrivateKeySignResponse} extends {@link TeaModel}
 *
 * <p>CertificatePrivateKeySignResponse</p>
 */
public class CertificatePrivateKeySignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CertificatePrivateKeySignResponseBody body;

    private CertificatePrivateKeySignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CertificatePrivateKeySignResponse create() {
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
    public CertificatePrivateKeySignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CertificatePrivateKeySignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CertificatePrivateKeySignResponseBody body);

        @Override
        CertificatePrivateKeySignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CertificatePrivateKeySignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CertificatePrivateKeySignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CertificatePrivateKeySignResponse response) {
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
        public Builder body(CertificatePrivateKeySignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CertificatePrivateKeySignResponse build() {
            return new CertificatePrivateKeySignResponse(this);
        } 

    } 

}
