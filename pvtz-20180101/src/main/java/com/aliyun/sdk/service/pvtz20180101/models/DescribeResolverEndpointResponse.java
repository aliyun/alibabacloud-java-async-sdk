// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverEndpointResponse} extends {@link TeaModel}
 *
 * <p>DescribeResolverEndpointResponse</p>
 */
public class DescribeResolverEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResolverEndpointResponseBody body;

    private DescribeResolverEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResolverEndpointResponse create() {
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
    public DescribeResolverEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResolverEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResolverEndpointResponseBody body);

        @Override
        DescribeResolverEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResolverEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResolverEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResolverEndpointResponse response) {
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
        public Builder body(DescribeResolverEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResolverEndpointResponse build() {
            return new DescribeResolverEndpointResponse(this);
        } 

    } 

}
