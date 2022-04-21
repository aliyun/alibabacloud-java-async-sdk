// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebHostingCertificateResponse} extends {@link TeaModel}
 *
 * <p>DeleteWebHostingCertificateResponse</p>
 */
public class DeleteWebHostingCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWebHostingCertificateResponseBody body;

    private DeleteWebHostingCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWebHostingCertificateResponse create() {
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
    public DeleteWebHostingCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWebHostingCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWebHostingCertificateResponseBody body);

        @Override
        DeleteWebHostingCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWebHostingCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWebHostingCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWebHostingCertificateResponse response) {
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
        public Builder body(DeleteWebHostingCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWebHostingCertificateResponse build() {
            return new DeleteWebHostingCertificateResponse(this);
        } 

    } 

}
