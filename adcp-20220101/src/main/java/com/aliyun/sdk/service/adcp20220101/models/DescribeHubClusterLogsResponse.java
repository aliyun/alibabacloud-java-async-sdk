// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClusterLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeHubClusterLogsResponse</p>
 */
public class DescribeHubClusterLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHubClusterLogsResponseBody body;

    private DescribeHubClusterLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHubClusterLogsResponse create() {
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
    public DescribeHubClusterLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHubClusterLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHubClusterLogsResponseBody body);

        @Override
        DescribeHubClusterLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHubClusterLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHubClusterLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHubClusterLogsResponse response) {
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
        public Builder body(DescribeHubClusterLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHubClusterLogsResponse build() {
            return new DescribeHubClusterLogsResponse(this);
        } 

    } 

}
