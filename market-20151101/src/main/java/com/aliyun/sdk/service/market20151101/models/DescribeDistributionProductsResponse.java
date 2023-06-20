// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDistributionProductsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDistributionProductsResponse</p>
 */
public class DescribeDistributionProductsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDistributionProductsResponseBody body;

    private DescribeDistributionProductsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDistributionProductsResponse create() {
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
    public DescribeDistributionProductsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDistributionProductsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDistributionProductsResponseBody body);

        @Override
        DescribeDistributionProductsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDistributionProductsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDistributionProductsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDistributionProductsResponse response) {
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
        public Builder body(DescribeDistributionProductsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDistributionProductsResponse build() {
            return new DescribeDistributionProductsResponse(this);
        } 

    } 

}
