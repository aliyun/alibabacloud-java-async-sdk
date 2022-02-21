// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBProxyEndpointResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyEndpointResponse</p>
 */
public class DescribeDBProxyEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBProxyEndpointResponseBody body;

    private DescribeDBProxyEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBProxyEndpointResponse create() {
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
    public DescribeDBProxyEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBProxyEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBProxyEndpointResponseBody body);

        @Override
        DescribeDBProxyEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBProxyEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBProxyEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBProxyEndpointResponse response) {
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
        public Builder body(DescribeDBProxyEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBProxyEndpointResponse build() {
            return new DescribeDBProxyEndpointResponse(this);
        } 

    } 

}
