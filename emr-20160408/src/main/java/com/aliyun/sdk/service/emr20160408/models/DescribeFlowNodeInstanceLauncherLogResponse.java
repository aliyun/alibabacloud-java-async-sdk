// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowNodeInstanceLauncherLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowNodeInstanceLauncherLogResponse</p>
 */
public class DescribeFlowNodeInstanceLauncherLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowNodeInstanceLauncherLogResponseBody body;

    private DescribeFlowNodeInstanceLauncherLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowNodeInstanceLauncherLogResponse create() {
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
    public DescribeFlowNodeInstanceLauncherLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowNodeInstanceLauncherLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowNodeInstanceLauncherLogResponseBody body);

        @Override
        DescribeFlowNodeInstanceLauncherLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowNodeInstanceLauncherLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowNodeInstanceLauncherLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowNodeInstanceLauncherLogResponse response) {
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
        public Builder body(DescribeFlowNodeInstanceLauncherLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowNodeInstanceLauncherLogResponse build() {
            return new DescribeFlowNodeInstanceLauncherLogResponse(this);
        } 

    } 

}
