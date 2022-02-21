// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAntChainCertificateResponse} extends {@link TeaModel}
 *
 * <p>ResetAntChainCertificateResponse</p>
 */
public class ResetAntChainCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetAntChainCertificateResponseBody body;

    private ResetAntChainCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetAntChainCertificateResponse create() {
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
    public ResetAntChainCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetAntChainCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetAntChainCertificateResponseBody body);

        @Override
        ResetAntChainCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetAntChainCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetAntChainCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetAntChainCertificateResponse response) {
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
        public Builder body(ResetAntChainCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetAntChainCertificateResponse build() {
            return new ResetAntChainCertificateResponse(this);
        } 

    } 

}
