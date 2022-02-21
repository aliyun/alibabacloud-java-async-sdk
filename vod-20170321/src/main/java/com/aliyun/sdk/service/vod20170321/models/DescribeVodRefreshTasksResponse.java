// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodRefreshTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeVodRefreshTasksResponse</p>
 */
public class DescribeVodRefreshTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVodRefreshTasksResponseBody body;

    private DescribeVodRefreshTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVodRefreshTasksResponse create() {
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
    public DescribeVodRefreshTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVodRefreshTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVodRefreshTasksResponseBody body);

        @Override
        DescribeVodRefreshTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVodRefreshTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVodRefreshTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVodRefreshTasksResponse response) {
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
        public Builder body(DescribeVodRefreshTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVodRefreshTasksResponse build() {
            return new DescribeVodRefreshTasksResponse(this);
        } 

    } 

}
