// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoShowListTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoShowListTasksResponse</p>
 */
public class DescribeAutoShowListTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoShowListTasksResponseBody body;

    private DescribeAutoShowListTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoShowListTasksResponse create() {
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
    public DescribeAutoShowListTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoShowListTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoShowListTasksResponseBody body);

        @Override
        DescribeAutoShowListTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoShowListTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoShowListTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoShowListTasksResponse response) {
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
        public Builder body(DescribeAutoShowListTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoShowListTasksResponse build() {
            return new DescribeAutoShowListTasksResponse(this);
        } 

    } 

}
