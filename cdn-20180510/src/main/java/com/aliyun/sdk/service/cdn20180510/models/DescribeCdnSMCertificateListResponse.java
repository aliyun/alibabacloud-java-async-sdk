// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSMCertificateListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnSMCertificateListResponse</p>
 */
public class DescribeCdnSMCertificateListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnSMCertificateListResponseBody body;

    private DescribeCdnSMCertificateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnSMCertificateListResponse create() {
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
    public DescribeCdnSMCertificateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnSMCertificateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnSMCertificateListResponseBody body);

        @Override
        DescribeCdnSMCertificateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnSMCertificateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnSMCertificateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnSMCertificateListResponse response) {
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
        public Builder body(DescribeCdnSMCertificateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnSMCertificateListResponse build() {
            return new DescribeCdnSMCertificateListResponse(this);
        } 

    } 

}
