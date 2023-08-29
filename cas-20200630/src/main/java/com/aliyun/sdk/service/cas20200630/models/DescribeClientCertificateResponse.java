// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientCertificateResponse} extends {@link TeaModel}
 *
 * <p>DescribeClientCertificateResponse</p>
 */
public class DescribeClientCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClientCertificateResponseBody body;

    private DescribeClientCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClientCertificateResponse create() {
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
    public DescribeClientCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClientCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClientCertificateResponseBody body);

        @Override
        DescribeClientCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClientCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClientCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClientCertificateResponse response) {
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
        public Builder body(DescribeClientCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClientCertificateResponse build() {
            return new DescribeClientCertificateResponse(this);
        } 

    } 

}
