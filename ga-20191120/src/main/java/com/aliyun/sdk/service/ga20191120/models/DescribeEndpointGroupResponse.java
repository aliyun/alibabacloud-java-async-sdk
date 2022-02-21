// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndpointGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribeEndpointGroupResponse</p>
 */
public class DescribeEndpointGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEndpointGroupResponseBody body;

    private DescribeEndpointGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEndpointGroupResponse create() {
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
    public DescribeEndpointGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEndpointGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEndpointGroupResponseBody body);

        @Override
        DescribeEndpointGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEndpointGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEndpointGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEndpointGroupResponse response) {
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
        public Builder body(DescribeEndpointGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEndpointGroupResponse build() {
            return new DescribeEndpointGroupResponse(this);
        } 

    } 

}
