// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserCertificateExpireCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserCertificateExpireCountResponse</p>
 */
public class DescribeUserCertificateExpireCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserCertificateExpireCountResponseBody body;

    private DescribeUserCertificateExpireCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserCertificateExpireCountResponse create() {
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
    public DescribeUserCertificateExpireCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserCertificateExpireCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserCertificateExpireCountResponseBody body);

        @Override
        DescribeUserCertificateExpireCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserCertificateExpireCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserCertificateExpireCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserCertificateExpireCountResponse response) {
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
        public Builder body(DescribeUserCertificateExpireCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserCertificateExpireCountResponse build() {
            return new DescribeUserCertificateExpireCountResponse(this);
        } 

    } 

}
