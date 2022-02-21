// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainCertificateResponse} extends {@link TeaModel}
 *
 * <p>ApplyAntChainCertificateResponse</p>
 */
public class ApplyAntChainCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyAntChainCertificateResponseBody body;

    private ApplyAntChainCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyAntChainCertificateResponse create() {
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
    public ApplyAntChainCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyAntChainCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyAntChainCertificateResponseBody body);

        @Override
        ApplyAntChainCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyAntChainCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyAntChainCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyAntChainCertificateResponse response) {
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
        public Builder body(ApplyAntChainCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyAntChainCertificateResponse build() {
            return new ApplyAntChainCertificateResponse(this);
        } 

    } 

}
