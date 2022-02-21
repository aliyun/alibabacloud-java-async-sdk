// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCertificateInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainCertificateInfoResponse</p>
 */
public class DescribeDomainCertificateInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainCertificateInfoResponseBody body;

    private DescribeDomainCertificateInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainCertificateInfoResponse create() {
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
    public DescribeDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainCertificateInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainCertificateInfoResponseBody body);

        @Override
        DescribeDomainCertificateInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainCertificateInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainCertificateInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainCertificateInfoResponse response) {
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
        public Builder body(DescribeDomainCertificateInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainCertificateInfoResponse build() {
            return new DescribeDomainCertificateInfoResponse(this);
        } 

    } 

}
