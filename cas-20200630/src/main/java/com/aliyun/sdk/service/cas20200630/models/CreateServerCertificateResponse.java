// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServerCertificateResponse} extends {@link TeaModel}
 *
 * <p>CreateServerCertificateResponse</p>
 */
public class CreateServerCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServerCertificateResponseBody body;

    private CreateServerCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServerCertificateResponse create() {
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
    public CreateServerCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServerCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServerCertificateResponseBody body);

        @Override
        CreateServerCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServerCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServerCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServerCertificateResponse response) {
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
        public Builder body(CreateServerCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServerCertificateResponse build() {
            return new CreateServerCertificateResponse(this);
        } 

    } 

}
