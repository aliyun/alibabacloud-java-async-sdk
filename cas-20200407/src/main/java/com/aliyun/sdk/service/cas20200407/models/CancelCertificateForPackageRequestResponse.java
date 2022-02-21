// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCertificateForPackageRequestResponse} extends {@link TeaModel}
 *
 * <p>CancelCertificateForPackageRequestResponse</p>
 */
public class CancelCertificateForPackageRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelCertificateForPackageRequestResponseBody body;

    private CancelCertificateForPackageRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelCertificateForPackageRequestResponse create() {
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
    public CancelCertificateForPackageRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelCertificateForPackageRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelCertificateForPackageRequestResponseBody body);

        @Override
        CancelCertificateForPackageRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelCertificateForPackageRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelCertificateForPackageRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelCertificateForPackageRequestResponse response) {
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
        public Builder body(CancelCertificateForPackageRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelCertificateForPackageRequestResponse build() {
            return new CancelCertificateForPackageRequestResponse(this);
        } 

    } 

}
