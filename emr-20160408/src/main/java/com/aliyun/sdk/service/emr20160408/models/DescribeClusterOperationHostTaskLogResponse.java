// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterOperationHostTaskLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterOperationHostTaskLogResponse</p>
 */
public class DescribeClusterOperationHostTaskLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterOperationHostTaskLogResponseBody body;

    private DescribeClusterOperationHostTaskLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterOperationHostTaskLogResponse create() {
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
    public DescribeClusterOperationHostTaskLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterOperationHostTaskLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterOperationHostTaskLogResponseBody body);

        @Override
        DescribeClusterOperationHostTaskLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterOperationHostTaskLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterOperationHostTaskLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterOperationHostTaskLogResponse response) {
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
        public Builder body(DescribeClusterOperationHostTaskLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterOperationHostTaskLogResponse build() {
            return new DescribeClusterOperationHostTaskLogResponse(this);
        } 

    } 

}
