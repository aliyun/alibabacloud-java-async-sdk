// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetDcdnDomainCertificateResponse} extends {@link TeaModel}
 *
 * <p>BatchSetDcdnDomainCertificateResponse</p>
 */
public class BatchSetDcdnDomainCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchSetDcdnDomainCertificateResponseBody body;

    private BatchSetDcdnDomainCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchSetDcdnDomainCertificateResponse create() {
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
    public BatchSetDcdnDomainCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchSetDcdnDomainCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchSetDcdnDomainCertificateResponseBody body);

        @Override
        BatchSetDcdnDomainCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchSetDcdnDomainCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchSetDcdnDomainCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchSetDcdnDomainCertificateResponse response) {
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
        public Builder body(BatchSetDcdnDomainCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchSetDcdnDomainCertificateResponse build() {
            return new BatchSetDcdnDomainCertificateResponse(this);
        } 

    } 

}
