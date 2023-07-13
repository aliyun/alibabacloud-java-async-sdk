// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentProcessesResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentProcessesResponse</p>
 */
public class DescribeMonitoringAgentProcessesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitoringAgentProcessesResponseBody body;

    private DescribeMonitoringAgentProcessesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitoringAgentProcessesResponse create() {
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
    public DescribeMonitoringAgentProcessesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitoringAgentProcessesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitoringAgentProcessesResponseBody body);

        @Override
        DescribeMonitoringAgentProcessesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitoringAgentProcessesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitoringAgentProcessesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitoringAgentProcessesResponse response) {
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
        public Builder body(DescribeMonitoringAgentProcessesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitoringAgentProcessesResponse build() {
            return new DescribeMonitoringAgentProcessesResponse(this);
        } 

    } 

}
