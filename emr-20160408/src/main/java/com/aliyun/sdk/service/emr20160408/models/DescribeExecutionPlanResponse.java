// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExecutionPlanResponse} extends {@link TeaModel}
 *
 * <p>DescribeExecutionPlanResponse</p>
 */
public class DescribeExecutionPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExecutionPlanResponseBody body;

    private DescribeExecutionPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExecutionPlanResponse create() {
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
    public DescribeExecutionPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExecutionPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExecutionPlanResponseBody body);

        @Override
        DescribeExecutionPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExecutionPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExecutionPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExecutionPlanResponse response) {
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
        public Builder body(DescribeExecutionPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExecutionPlanResponse build() {
            return new DescribeExecutionPlanResponse(this);
        } 

    } 

}
