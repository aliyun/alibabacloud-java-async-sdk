// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSPerformanceResponse} extends {@link TeaModel}
 *
 * <p>DescribeRDSPerformanceResponse</p>
 */
public class DescribeRDSPerformanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRDSPerformanceResponseBody body;

    private DescribeRDSPerformanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRDSPerformanceResponse create() {
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
    public DescribeRDSPerformanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRDSPerformanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRDSPerformanceResponseBody body);

        @Override
        DescribeRDSPerformanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRDSPerformanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRDSPerformanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRDSPerformanceResponse response) {
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
        public Builder body(DescribeRDSPerformanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRDSPerformanceResponse build() {
            return new DescribeRDSPerformanceResponse(this);
        } 

    } 

}
