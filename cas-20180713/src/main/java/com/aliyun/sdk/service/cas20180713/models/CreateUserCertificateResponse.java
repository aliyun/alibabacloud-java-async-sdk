// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserCertificateResponse} extends {@link TeaModel}
 *
 * <p>CreateUserCertificateResponse</p>
 */
public class CreateUserCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserCertificateResponseBody body;

    private CreateUserCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserCertificateResponse create() {
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
    public CreateUserCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserCertificateResponseBody body);

        @Override
        CreateUserCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserCertificateResponse response) {
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
        public Builder body(CreateUserCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserCertificateResponse build() {
            return new CreateUserCertificateResponse(this);
        } 

    } 

}
