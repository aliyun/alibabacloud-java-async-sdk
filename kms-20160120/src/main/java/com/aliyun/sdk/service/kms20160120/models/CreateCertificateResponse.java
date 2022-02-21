// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateResponse} extends {@link TeaModel}
 *
 * <p>CreateCertificateResponse</p>
 */
public class CreateCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCertificateResponseBody body;

    private CreateCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCertificateResponse create() {
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
    public CreateCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCertificateResponseBody body);

        @Override
        CreateCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCertificateResponse response) {
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
        public Builder body(CreateCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCertificateResponse build() {
            return new CreateCertificateResponse(this);
        } 

    } 

}
