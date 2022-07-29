// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVendorListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVendorListResponse</p>
 */
public class DescribeVendorListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVendorListResponseBody body;

    private DescribeVendorListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVendorListResponse create() {
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
    public DescribeVendorListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVendorListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVendorListResponseBody body);

        @Override
        DescribeVendorListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVendorListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVendorListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVendorListResponse response) {
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
        public Builder body(DescribeVendorListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVendorListResponse build() {
            return new DescribeVendorListResponse(this);
        } 

    } 

}
