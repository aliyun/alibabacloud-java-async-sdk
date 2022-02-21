// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeToolExecutionHistoriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeNodeToolExecutionHistoriesResponse</p>
 */
public class DescribeNodeToolExecutionHistoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNodeToolExecutionHistoriesResponseBody body;

    private DescribeNodeToolExecutionHistoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNodeToolExecutionHistoriesResponse create() {
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
    public DescribeNodeToolExecutionHistoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNodeToolExecutionHistoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNodeToolExecutionHistoriesResponseBody body);

        @Override
        DescribeNodeToolExecutionHistoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNodeToolExecutionHistoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNodeToolExecutionHistoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNodeToolExecutionHistoriesResponse response) {
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
        public Builder body(DescribeNodeToolExecutionHistoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNodeToolExecutionHistoriesResponse build() {
            return new DescribeNodeToolExecutionHistoriesResponse(this);
        } 

    } 

}
