// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetCdnDomainServerCertificateResponse} extends {@link TeaModel}
 *
 * <p>BatchSetCdnDomainServerCertificateResponse</p>
 */
public class BatchSetCdnDomainServerCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchSetCdnDomainServerCertificateResponseBody body;

    private BatchSetCdnDomainServerCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchSetCdnDomainServerCertificateResponse create() {
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
    public BatchSetCdnDomainServerCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchSetCdnDomainServerCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchSetCdnDomainServerCertificateResponseBody body);

        @Override
        BatchSetCdnDomainServerCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchSetCdnDomainServerCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchSetCdnDomainServerCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchSetCdnDomainServerCertificateResponse response) {
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
        public Builder body(BatchSetCdnDomainServerCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchSetCdnDomainServerCertificateResponse build() {
            return new BatchSetCdnDomainServerCertificateResponse(this);
        } 

    } 

}
