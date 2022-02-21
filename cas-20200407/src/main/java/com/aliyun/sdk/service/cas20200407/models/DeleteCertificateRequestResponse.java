// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCertificateRequestResponse} extends {@link TeaModel}
 *
 * <p>DeleteCertificateRequestResponse</p>
 */
public class DeleteCertificateRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCertificateRequestResponseBody body;

    private DeleteCertificateRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCertificateRequestResponse create() {
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
    public DeleteCertificateRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCertificateRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCertificateRequestResponseBody body);

        @Override
        DeleteCertificateRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCertificateRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCertificateRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCertificateRequestResponse response) {
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
        public Builder body(DeleteCertificateRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCertificateRequestResponse build() {
            return new DeleteCertificateRequestResponse(this);
        } 

    } 

}
