// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientCertificateResponse} extends {@link TeaModel}
 *
 * <p>CreateClientCertificateResponse</p>
 */
public class CreateClientCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClientCertificateResponseBody body;

    private CreateClientCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClientCertificateResponse create() {
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
    public CreateClientCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClientCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClientCertificateResponseBody body);

        @Override
        CreateClientCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClientCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClientCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClientCertificateResponse response) {
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
        public Builder body(CreateClientCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClientCertificateResponse build() {
            return new CreateClientCertificateResponse(this);
        } 

    } 

}
