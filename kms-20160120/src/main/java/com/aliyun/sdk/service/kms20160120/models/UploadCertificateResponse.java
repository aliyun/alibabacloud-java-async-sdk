// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadCertificateResponse} extends {@link TeaModel}
 *
 * <p>UploadCertificateResponse</p>
 */
public class UploadCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadCertificateResponseBody body;

    private UploadCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadCertificateResponse create() {
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
    public UploadCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadCertificateResponseBody body);

        @Override
        UploadCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadCertificateResponse response) {
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
        public Builder body(UploadCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadCertificateResponse build() {
            return new UploadCertificateResponse(this);
        } 

    } 

}
