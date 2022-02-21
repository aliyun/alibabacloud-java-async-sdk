// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRefreshTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeRefreshTasksResponse</p>
 */
public class DescribeRefreshTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRefreshTasksResponseBody body;

    private DescribeRefreshTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRefreshTasksResponse create() {
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
    public DescribeRefreshTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRefreshTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRefreshTasksResponseBody body);

        @Override
        DescribeRefreshTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRefreshTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRefreshTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRefreshTasksResponse response) {
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
        public Builder body(DescribeRefreshTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRefreshTasksResponse build() {
            return new DescribeRefreshTasksResponse(this);
        } 

    } 

}
