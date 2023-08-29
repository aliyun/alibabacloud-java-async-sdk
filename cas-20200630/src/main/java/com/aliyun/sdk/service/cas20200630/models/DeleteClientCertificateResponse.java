// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClientCertificateResponse} extends {@link TeaModel}
 *
 * <p>DeleteClientCertificateResponse</p>
 */
public class DeleteClientCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClientCertificateResponseBody body;

    private DeleteClientCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClientCertificateResponse create() {
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
    public DeleteClientCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClientCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClientCertificateResponseBody body);

        @Override
        DeleteClientCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClientCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClientCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClientCertificateResponse response) {
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
        public Builder body(DeleteClientCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClientCertificateResponse build() {
            return new DeleteClientCertificateResponse(this);
        } 

    } 

}
