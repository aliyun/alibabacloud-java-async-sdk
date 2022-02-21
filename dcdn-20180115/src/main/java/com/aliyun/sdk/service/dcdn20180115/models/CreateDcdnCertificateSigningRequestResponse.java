// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnCertificateSigningRequestResponse} extends {@link TeaModel}
 *
 * <p>CreateDcdnCertificateSigningRequestResponse</p>
 */
public class CreateDcdnCertificateSigningRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDcdnCertificateSigningRequestResponseBody body;

    private CreateDcdnCertificateSigningRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDcdnCertificateSigningRequestResponse create() {
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
    public CreateDcdnCertificateSigningRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDcdnCertificateSigningRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDcdnCertificateSigningRequestResponseBody body);

        @Override
        CreateDcdnCertificateSigningRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDcdnCertificateSigningRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDcdnCertificateSigningRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDcdnCertificateSigningRequestResponse response) {
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
        public Builder body(CreateDcdnCertificateSigningRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDcdnCertificateSigningRequestResponse build() {
            return new CreateDcdnCertificateSigningRequestResponse(this);
        } 

    } 

}
