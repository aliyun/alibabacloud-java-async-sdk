// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeTasksResponse</p>
 */
public class DescribeTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTasksResponseBody body;

    private DescribeTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTasksResponse create() {
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
    public DescribeTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTasksResponseBody body);

        @Override
        DescribeTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTasksResponse response) {
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
        public Builder body(DescribeTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTasksResponse build() {
            return new DescribeTasksResponse(this);
        } 

    } 

}
