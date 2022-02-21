// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeToolExecutionHistoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeNodeToolExecutionHistoryResponse</p>
 */
public class DescribeNodeToolExecutionHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNodeToolExecutionHistoryResponseBody body;

    private DescribeNodeToolExecutionHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNodeToolExecutionHistoryResponse create() {
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
    public DescribeNodeToolExecutionHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNodeToolExecutionHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNodeToolExecutionHistoryResponseBody body);

        @Override
        DescribeNodeToolExecutionHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNodeToolExecutionHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNodeToolExecutionHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNodeToolExecutionHistoryResponse response) {
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
        public Builder body(DescribeNodeToolExecutionHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNodeToolExecutionHistoryResponse build() {
            return new DescribeNodeToolExecutionHistoryResponse(this);
        } 

    } 

}
