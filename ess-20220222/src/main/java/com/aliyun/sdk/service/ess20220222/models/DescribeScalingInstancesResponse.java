// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribeScalingInstancesResponse</p>
 */
public class DescribeScalingInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingInstancesResponseBody body;

    private DescribeScalingInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingInstancesResponse create() {
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
    public DescribeScalingInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingInstancesResponseBody body);

        @Override
        DescribeScalingInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingInstancesResponse response) {
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
        public Builder body(DescribeScalingInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingInstancesResponse build() {
            return new DescribeScalingInstancesResponse(this);
        } 

    } 

}
