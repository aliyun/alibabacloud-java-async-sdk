// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultResponse</p>
 */
public class DescribeInvocationResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInvocationResultResponseBody body;

    private DescribeInvocationResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInvocationResultResponse create() {
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
    public DescribeInvocationResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInvocationResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInvocationResultResponseBody body);

        @Override
        DescribeInvocationResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInvocationResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInvocationResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInvocationResultResponse response) {
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
        public Builder body(DescribeInvocationResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInvocationResultResponse build() {
            return new DescribeInvocationResultResponse(this);
        } 

    } 

}
