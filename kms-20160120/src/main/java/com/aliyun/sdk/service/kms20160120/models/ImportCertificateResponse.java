// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportCertificateResponse} extends {@link TeaModel}
 *
 * <p>ImportCertificateResponse</p>
 */
public class ImportCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportCertificateResponseBody body;

    private ImportCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportCertificateResponse create() {
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
    public ImportCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportCertificateResponseBody body);

        @Override
        ImportCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportCertificateResponse response) {
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
        public Builder body(ImportCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportCertificateResponse build() {
            return new ImportCertificateResponse(this);
        } 

    } 

}
