// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnCertificateDetailByIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnCertificateDetailByIdResponse</p>
 */
public class DescribeCdnCertificateDetailByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnCertificateDetailByIdResponseBody body;

    private DescribeCdnCertificateDetailByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnCertificateDetailByIdResponse create() {
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
    public DescribeCdnCertificateDetailByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnCertificateDetailByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnCertificateDetailByIdResponseBody body);

        @Override
        DescribeCdnCertificateDetailByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnCertificateDetailByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnCertificateDetailByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnCertificateDetailByIdResponse response) {
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
        public Builder body(DescribeCdnCertificateDetailByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnCertificateDetailByIdResponse build() {
            return new DescribeCdnCertificateDetailByIdResponse(this);
        } 

    } 

}
