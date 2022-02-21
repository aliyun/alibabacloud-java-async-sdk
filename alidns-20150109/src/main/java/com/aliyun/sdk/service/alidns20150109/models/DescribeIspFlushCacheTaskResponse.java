// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIspFlushCacheTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeIspFlushCacheTaskResponse</p>
 */
public class DescribeIspFlushCacheTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIspFlushCacheTaskResponseBody body;

    private DescribeIspFlushCacheTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIspFlushCacheTaskResponse create() {
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
    public DescribeIspFlushCacheTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIspFlushCacheTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIspFlushCacheTaskResponseBody body);

        @Override
        DescribeIspFlushCacheTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIspFlushCacheTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIspFlushCacheTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIspFlushCacheTaskResponse response) {
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
        public Builder body(DescribeIspFlushCacheTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIspFlushCacheTaskResponse build() {
            return new DescribeIspFlushCacheTaskResponse(this);
        } 

    } 

}
