// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePatternPerformanceResponse} extends {@link TeaModel}
 *
 * <p>DescribePatternPerformanceResponse</p>
 */
public class DescribePatternPerformanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePatternPerformanceResponseBody body;

    private DescribePatternPerformanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePatternPerformanceResponse create() {
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
    public DescribePatternPerformanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePatternPerformanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePatternPerformanceResponseBody body);

        @Override
        DescribePatternPerformanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePatternPerformanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePatternPerformanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePatternPerformanceResponse response) {
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
        public Builder body(DescribePatternPerformanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePatternPerformanceResponse build() {
            return new DescribePatternPerformanceResponse(this);
        } 

    } 

}
