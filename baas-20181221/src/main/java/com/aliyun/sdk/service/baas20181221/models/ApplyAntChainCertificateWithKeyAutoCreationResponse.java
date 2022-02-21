// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainCertificateWithKeyAutoCreationResponse} extends {@link TeaModel}
 *
 * <p>ApplyAntChainCertificateWithKeyAutoCreationResponse</p>
 */
public class ApplyAntChainCertificateWithKeyAutoCreationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyAntChainCertificateWithKeyAutoCreationResponseBody body;

    private ApplyAntChainCertificateWithKeyAutoCreationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyAntChainCertificateWithKeyAutoCreationResponse create() {
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
    public ApplyAntChainCertificateWithKeyAutoCreationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyAntChainCertificateWithKeyAutoCreationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyAntChainCertificateWithKeyAutoCreationResponseBody body);

        @Override
        ApplyAntChainCertificateWithKeyAutoCreationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyAntChainCertificateWithKeyAutoCreationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyAntChainCertificateWithKeyAutoCreationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyAntChainCertificateWithKeyAutoCreationResponse response) {
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
        public Builder body(ApplyAntChainCertificateWithKeyAutoCreationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyAntChainCertificateWithKeyAutoCreationResponse build() {
            return new ApplyAntChainCertificateWithKeyAutoCreationResponse(this);
        } 

    } 

}
