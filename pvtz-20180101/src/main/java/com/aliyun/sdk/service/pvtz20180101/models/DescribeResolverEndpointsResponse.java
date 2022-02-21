// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverEndpointsResponse} extends {@link TeaModel}
 *
 * <p>DescribeResolverEndpointsResponse</p>
 */
public class DescribeResolverEndpointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResolverEndpointsResponseBody body;

    private DescribeResolverEndpointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResolverEndpointsResponse create() {
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
    public DescribeResolverEndpointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResolverEndpointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResolverEndpointsResponseBody body);

        @Override
        DescribeResolverEndpointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResolverEndpointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResolverEndpointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResolverEndpointsResponse response) {
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
        public Builder body(DescribeResolverEndpointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResolverEndpointsResponse build() {
            return new DescribeResolverEndpointsResponse(this);
        } 

    } 

}
