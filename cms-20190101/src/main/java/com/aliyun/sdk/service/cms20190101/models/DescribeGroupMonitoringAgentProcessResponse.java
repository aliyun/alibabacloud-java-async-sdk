// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupMonitoringAgentProcessResponse} extends {@link TeaModel}
 *
 * <p>DescribeGroupMonitoringAgentProcessResponse</p>
 */
public class DescribeGroupMonitoringAgentProcessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGroupMonitoringAgentProcessResponseBody body;

    private DescribeGroupMonitoringAgentProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGroupMonitoringAgentProcessResponse create() {
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
    public DescribeGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGroupMonitoringAgentProcessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGroupMonitoringAgentProcessResponseBody body);

        @Override
        DescribeGroupMonitoringAgentProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGroupMonitoringAgentProcessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGroupMonitoringAgentProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGroupMonitoringAgentProcessResponse response) {
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
        public Builder body(DescribeGroupMonitoringAgentProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGroupMonitoringAgentProcessResponse build() {
            return new DescribeGroupMonitoringAgentProcessResponse(this);
        } 

    } 

}
