// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogStoreOfEndpointGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreOfEndpointGroupResponse</p>
 */
public class DescribeLogStoreOfEndpointGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogStoreOfEndpointGroupResponseBody body;

    private DescribeLogStoreOfEndpointGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogStoreOfEndpointGroupResponse create() {
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
    public DescribeLogStoreOfEndpointGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogStoreOfEndpointGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogStoreOfEndpointGroupResponseBody body);

        @Override
        DescribeLogStoreOfEndpointGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogStoreOfEndpointGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogStoreOfEndpointGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogStoreOfEndpointGroupResponse response) {
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
        public Builder body(DescribeLogStoreOfEndpointGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogStoreOfEndpointGroupResponse build() {
            return new DescribeLogStoreOfEndpointGroupResponse(this);
        } 

    } 

}
