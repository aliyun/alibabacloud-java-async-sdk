// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudBenchTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudBenchTasksResponse</p>
 */
public class DescribeCloudBenchTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudBenchTasksResponseBody body;

    private DescribeCloudBenchTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudBenchTasksResponse create() {
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
    public DescribeCloudBenchTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudBenchTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudBenchTasksResponseBody body);

        @Override
        DescribeCloudBenchTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudBenchTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudBenchTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudBenchTasksResponse response) {
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
        public Builder body(DescribeCloudBenchTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudBenchTasksResponse build() {
            return new DescribeCloudBenchTasksResponse(this);
        } 

    } 

}
