// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServerCertificateWithCsrResponse} extends {@link TeaModel}
 *
 * <p>CreateServerCertificateWithCsrResponse</p>
 */
public class CreateServerCertificateWithCsrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServerCertificateWithCsrResponseBody body;

    private CreateServerCertificateWithCsrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServerCertificateWithCsrResponse create() {
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
    public CreateServerCertificateWithCsrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServerCertificateWithCsrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServerCertificateWithCsrResponseBody body);

        @Override
        CreateServerCertificateWithCsrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServerCertificateWithCsrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServerCertificateWithCsrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServerCertificateWithCsrResponse response) {
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
        public Builder body(CreateServerCertificateWithCsrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServerCertificateWithCsrResponse build() {
            return new CreateServerCertificateWithCsrResponse(this);
        } 

    } 

}
