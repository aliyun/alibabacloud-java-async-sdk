// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomCertificateResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomCertificateResponse</p>
 */
public class CreateCustomCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomCertificateResponseBody body;

    private CreateCustomCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomCertificateResponse create() {
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
    public CreateCustomCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomCertificateResponseBody body);

        @Override
        CreateCustomCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomCertificateResponse response) {
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
        public Builder body(CreateCustomCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomCertificateResponse build() {
            return new CreateCustomCertificateResponse(this);
        } 

    } 

}
