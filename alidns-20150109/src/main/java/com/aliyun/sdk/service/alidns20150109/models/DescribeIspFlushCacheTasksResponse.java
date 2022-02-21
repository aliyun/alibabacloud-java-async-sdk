// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIspFlushCacheTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeIspFlushCacheTasksResponse</p>
 */
public class DescribeIspFlushCacheTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIspFlushCacheTasksResponseBody body;

    private DescribeIspFlushCacheTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIspFlushCacheTasksResponse create() {
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
    public DescribeIspFlushCacheTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIspFlushCacheTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIspFlushCacheTasksResponseBody body);

        @Override
        DescribeIspFlushCacheTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIspFlushCacheTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIspFlushCacheTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIspFlushCacheTasksResponse response) {
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
        public Builder body(DescribeIspFlushCacheTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIspFlushCacheTasksResponse build() {
            return new DescribeIspFlushCacheTasksResponse(this);
        } 

    } 

}
