// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRefreshTaskByIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeRefreshTaskByIdResponse</p>
 */
public class DescribeRefreshTaskByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRefreshTaskByIdResponseBody body;

    private DescribeRefreshTaskByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRefreshTaskByIdResponse create() {
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
    public DescribeRefreshTaskByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRefreshTaskByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRefreshTaskByIdResponseBody body);

        @Override
        DescribeRefreshTaskByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRefreshTaskByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRefreshTaskByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRefreshTaskByIdResponse response) {
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
        public Builder body(DescribeRefreshTaskByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRefreshTaskByIdResponse build() {
            return new DescribeRefreshTaskByIdResponse(this);
        } 

    } 

}
