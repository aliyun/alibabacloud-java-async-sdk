// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsCertificateListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVsCertificateListResponse</p>
 */
public class DescribeVsCertificateListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVsCertificateListResponseBody body;

    private DescribeVsCertificateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVsCertificateListResponse create() {
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
    public DescribeVsCertificateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVsCertificateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVsCertificateListResponseBody body);

        @Override
        DescribeVsCertificateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVsCertificateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVsCertificateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVsCertificateListResponse response) {
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
        public Builder body(DescribeVsCertificateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVsCertificateListResponse build() {
            return new DescribeVsCertificateListResponse(this);
        } 

    } 

}
