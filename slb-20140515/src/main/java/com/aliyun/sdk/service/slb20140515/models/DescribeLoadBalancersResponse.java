// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancersResponse} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancersResponse</p>
 */
public class DescribeLoadBalancersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLoadBalancersResponseBody body;

    private DescribeLoadBalancersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLoadBalancersResponse create() {
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
    public DescribeLoadBalancersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLoadBalancersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLoadBalancersResponseBody body);

        @Override
        DescribeLoadBalancersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLoadBalancersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLoadBalancersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLoadBalancersResponse response) {
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
        public Builder body(DescribeLoadBalancersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLoadBalancersResponse build() {
            return new DescribeLoadBalancersResponse(this);
        } 

    } 

}
