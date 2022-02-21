// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCACertificateResponse} extends {@link TeaModel}
 *
 * <p>DeleteCACertificateResponse</p>
 */
public class DeleteCACertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCACertificateResponseBody body;

    private DeleteCACertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCACertificateResponse create() {
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
    public DeleteCACertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCACertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCACertificateResponseBody body);

        @Override
        DeleteCACertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCACertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCACertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCACertificateResponse response) {
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
        public Builder body(DeleteCACertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCACertificateResponse build() {
            return new DeleteCACertificateResponse(this);
        } 

    } 

}
