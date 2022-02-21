// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterDashboardResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterDashboardResponse</p>
 */
public class DescribeClusterDashboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterDashboardResponseBody body;

    private DescribeClusterDashboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterDashboardResponse create() {
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
    public DescribeClusterDashboardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterDashboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterDashboardResponseBody body);

        @Override
        DescribeClusterDashboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterDashboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterDashboardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterDashboardResponse response) {
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
        public Builder body(DescribeClusterDashboardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterDashboardResponse build() {
            return new DescribeClusterDashboardResponse(this);
        } 

    } 

}
