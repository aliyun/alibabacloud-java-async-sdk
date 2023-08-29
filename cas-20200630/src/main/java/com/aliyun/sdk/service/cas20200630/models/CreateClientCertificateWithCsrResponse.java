// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientCertificateWithCsrResponse} extends {@link TeaModel}
 *
 * <p>CreateClientCertificateWithCsrResponse</p>
 */
public class CreateClientCertificateWithCsrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClientCertificateWithCsrResponseBody body;

    private CreateClientCertificateWithCsrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClientCertificateWithCsrResponse create() {
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
    public CreateClientCertificateWithCsrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClientCertificateWithCsrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClientCertificateWithCsrResponseBody body);

        @Override
        CreateClientCertificateWithCsrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClientCertificateWithCsrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClientCertificateWithCsrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClientCertificateWithCsrResponse response) {
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
        public Builder body(CreateClientCertificateWithCsrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClientCertificateWithCsrResponse build() {
            return new CreateClientCertificateWithCsrResponse(this);
        } 

    } 

}
