// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExecutionResponse} extends {@link TeaModel}
 *
 * <p>DescribeExecutionResponse</p>
 */
public class DescribeExecutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExecutionResponseBody body;

    private DescribeExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExecutionResponse create() {
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
    public DescribeExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExecutionResponseBody body);

        @Override
        DescribeExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExecutionResponse response) {
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
        public Builder body(DescribeExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExecutionResponse build() {
            return new DescribeExecutionResponse(this);
        } 

    } 

}
