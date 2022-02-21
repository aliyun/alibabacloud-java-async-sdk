// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCertificateResponse} extends {@link TeaModel}
 *
 * <p>GetCertificateResponse</p>
 */
public class GetCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCertificateResponseBody body;

    private GetCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCertificateResponse create() {
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
    public GetCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCertificateResponseBody body);

        @Override
        GetCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCertificateResponse response) {
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
        public Builder body(GetCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCertificateResponse build() {
            return new GetCertificateResponse(this);
        } 

    } 

}
