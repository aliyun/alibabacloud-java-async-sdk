// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneThroughputResponse} extends {@link TeaModel}
 *
 * <p>DescribeSceneThroughputResponse</p>
 */
public class DescribeSceneThroughputResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSceneThroughputResponseBody body;

    private DescribeSceneThroughputResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSceneThroughputResponse create() {
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
    public DescribeSceneThroughputResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSceneThroughputResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSceneThroughputResponseBody body);

        @Override
        DescribeSceneThroughputResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSceneThroughputResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSceneThroughputResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSceneThroughputResponse response) {
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
        public Builder body(DescribeSceneThroughputResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSceneThroughputResponse build() {
            return new DescribeSceneThroughputResponse(this);
        } 

    } 

}
