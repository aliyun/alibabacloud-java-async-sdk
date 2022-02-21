// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAsyncTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeAsyncTasksResponse</p>
 */
public class DescribeAsyncTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAsyncTasksResponseBody body;

    private DescribeAsyncTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAsyncTasksResponse create() {
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
    public DescribeAsyncTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAsyncTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAsyncTasksResponseBody body);

        @Override
        DescribeAsyncTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAsyncTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAsyncTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAsyncTasksResponse response) {
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
        public Builder body(DescribeAsyncTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAsyncTasksResponse build() {
            return new DescribeAsyncTasksResponse(this);
        } 

    } 

}
