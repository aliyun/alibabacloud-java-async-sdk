// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerRelatedGlobalAccelerationInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribeServerRelatedGlobalAccelerationInstancesResponse</p>
 */
public class DescribeServerRelatedGlobalAccelerationInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServerRelatedGlobalAccelerationInstancesResponseBody body;

    private DescribeServerRelatedGlobalAccelerationInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServerRelatedGlobalAccelerationInstancesResponse create() {
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
    public DescribeServerRelatedGlobalAccelerationInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServerRelatedGlobalAccelerationInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServerRelatedGlobalAccelerationInstancesResponseBody body);

        @Override
        DescribeServerRelatedGlobalAccelerationInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServerRelatedGlobalAccelerationInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServerRelatedGlobalAccelerationInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServerRelatedGlobalAccelerationInstancesResponse response) {
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
        public Builder body(DescribeServerRelatedGlobalAccelerationInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServerRelatedGlobalAccelerationInstancesResponse build() {
            return new DescribeServerRelatedGlobalAccelerationInstancesResponse(this);
        } 

    } 

}
