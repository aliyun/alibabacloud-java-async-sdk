// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeWatchTasksResponse</p>
 */
public class DescribeWatchTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWatchTasksResponseBody body;

    private DescribeWatchTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWatchTasksResponse create() {
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
    public DescribeWatchTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWatchTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWatchTasksResponseBody body);

        @Override
        DescribeWatchTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWatchTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWatchTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWatchTasksResponse response) {
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
        public Builder body(DescribeWatchTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWatchTasksResponse build() {
            return new DescribeWatchTasksResponse(this);
        } 

    } 

}
