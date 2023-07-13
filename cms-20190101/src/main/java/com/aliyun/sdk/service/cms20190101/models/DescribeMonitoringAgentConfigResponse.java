// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentConfigResponse</p>
 */
public class DescribeMonitoringAgentConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitoringAgentConfigResponseBody body;

    private DescribeMonitoringAgentConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitoringAgentConfigResponse create() {
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
    public DescribeMonitoringAgentConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitoringAgentConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitoringAgentConfigResponseBody body);

        @Override
        DescribeMonitoringAgentConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitoringAgentConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitoringAgentConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitoringAgentConfigResponse response) {
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
        public Builder body(DescribeMonitoringAgentConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitoringAgentConfigResponse build() {
            return new DescribeMonitoringAgentConfigResponse(this);
        } 

    } 

}
