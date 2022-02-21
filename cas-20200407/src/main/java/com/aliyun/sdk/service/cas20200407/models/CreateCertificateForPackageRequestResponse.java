// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateForPackageRequestResponse} extends {@link TeaModel}
 *
 * <p>CreateCertificateForPackageRequestResponse</p>
 */
public class CreateCertificateForPackageRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCertificateForPackageRequestResponseBody body;

    private CreateCertificateForPackageRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCertificateForPackageRequestResponse create() {
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
    public CreateCertificateForPackageRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCertificateForPackageRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCertificateForPackageRequestResponseBody body);

        @Override
        CreateCertificateForPackageRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCertificateForPackageRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCertificateForPackageRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCertificateForPackageRequestResponse response) {
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
        public Builder body(CreateCertificateForPackageRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCertificateForPackageRequestResponse build() {
            return new CreateCertificateForPackageRequestResponse(this);
        } 

    } 

}
