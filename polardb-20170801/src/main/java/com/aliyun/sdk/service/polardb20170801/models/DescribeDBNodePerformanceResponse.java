// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBNodePerformanceResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBNodePerformanceResponse</p>
 */
public class DescribeDBNodePerformanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBNodePerformanceResponseBody body;

    private DescribeDBNodePerformanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBNodePerformanceResponse create() {
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
    public DescribeDBNodePerformanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBNodePerformanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBNodePerformanceResponseBody body);

        @Override
        DescribeDBNodePerformanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBNodePerformanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBNodePerformanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBNodePerformanceResponse response) {
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
        public Builder body(DescribeDBNodePerformanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBNodePerformanceResponse build() {
            return new DescribeDBNodePerformanceResponse(this);
        } 

    } 

}
