// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationResultsResponse} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultsResponse</p>
 */
public class DescribeInvocationResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInvocationResultsResponseBody body;

    private DescribeInvocationResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInvocationResultsResponse create() {
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
    public DescribeInvocationResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInvocationResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInvocationResultsResponseBody body);

        @Override
        DescribeInvocationResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInvocationResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInvocationResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInvocationResultsResponse response) {
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
        public Builder body(DescribeInvocationResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInvocationResultsResponse build() {
            return new DescribeInvocationResultsResponse(this);
        } 

    } 

}
