// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerSpecResponse} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerSpecResponse</p>
 */
public class DescribeLoadBalancerSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLoadBalancerSpecResponseBody body;

    private DescribeLoadBalancerSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLoadBalancerSpecResponse create() {
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
    public DescribeLoadBalancerSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLoadBalancerSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLoadBalancerSpecResponseBody body);

        @Override
        DescribeLoadBalancerSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLoadBalancerSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLoadBalancerSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLoadBalancerSpecResponse response) {
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
        public Builder body(DescribeLoadBalancerSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLoadBalancerSpecResponse build() {
            return new DescribeLoadBalancerSpecResponse(this);
        } 

    } 

}
