// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestDescribeRegionsResponse} extends {@link TeaModel}
 *
 * <p>TestDescribeRegionsResponse</p>
 */
public class TestDescribeRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TestDescribeRegionsResponseBody body;

    private TestDescribeRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TestDescribeRegionsResponse create() {
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
    public TestDescribeRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TestDescribeRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TestDescribeRegionsResponseBody body);

        @Override
        TestDescribeRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TestDescribeRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TestDescribeRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TestDescribeRegionsResponse response) {
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
        public Builder body(TestDescribeRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TestDescribeRegionsResponse build() {
            return new TestDescribeRegionsResponse(this);
        } 

    } 

}
