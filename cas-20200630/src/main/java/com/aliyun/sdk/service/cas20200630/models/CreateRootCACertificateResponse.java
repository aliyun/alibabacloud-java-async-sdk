// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRootCACertificateResponse} extends {@link TeaModel}
 *
 * <p>CreateRootCACertificateResponse</p>
 */
public class CreateRootCACertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRootCACertificateResponseBody body;

    private CreateRootCACertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRootCACertificateResponse create() {
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
    public CreateRootCACertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRootCACertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRootCACertificateResponseBody body);

        @Override
        CreateRootCACertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRootCACertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRootCACertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRootCACertificateResponse response) {
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
        public Builder body(CreateRootCACertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRootCACertificateResponse build() {
            return new CreateRootCACertificateResponse(this);
        } 

    } 

}
