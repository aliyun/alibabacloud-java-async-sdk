// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowMetricResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowMetricResponse</p>
 */
public class DescribeFlowMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowMetricResponseBody body;

    private DescribeFlowMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowMetricResponse create() {
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
    public DescribeFlowMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowMetricResponseBody body);

        @Override
        DescribeFlowMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowMetricResponse response) {
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
        public Builder body(DescribeFlowMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowMetricResponse build() {
            return new DescribeFlowMetricResponse(this);
        } 

    } 

}
