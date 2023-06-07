// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMonitorAgentStatusesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudMonitorAgentStatusesResponse</p>
 */
public class DescribeCloudMonitorAgentStatusesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudMonitorAgentStatusesResponseBody body;

    private DescribeCloudMonitorAgentStatusesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudMonitorAgentStatusesResponse create() {
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
    public DescribeCloudMonitorAgentStatusesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudMonitorAgentStatusesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudMonitorAgentStatusesResponseBody body);

        @Override
        DescribeCloudMonitorAgentStatusesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudMonitorAgentStatusesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudMonitorAgentStatusesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudMonitorAgentStatusesResponse response) {
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
        public Builder body(DescribeCloudMonitorAgentStatusesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudMonitorAgentStatusesResponse build() {
            return new DescribeCloudMonitorAgentStatusesResponse(this);
        } 

    } 

}
