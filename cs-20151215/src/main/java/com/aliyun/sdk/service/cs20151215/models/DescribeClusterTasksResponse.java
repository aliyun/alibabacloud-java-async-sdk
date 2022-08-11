// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterTasksResponse</p>
 */
public class DescribeClusterTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterTasksResponseBody body;

    private DescribeClusterTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterTasksResponse create() {
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
    public DescribeClusterTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterTasksResponseBody body);

        @Override
        DescribeClusterTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterTasksResponse response) {
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
        public Builder body(DescribeClusterTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterTasksResponse build() {
            return new DescribeClusterTasksResponse(this);
        } 

    } 

}
