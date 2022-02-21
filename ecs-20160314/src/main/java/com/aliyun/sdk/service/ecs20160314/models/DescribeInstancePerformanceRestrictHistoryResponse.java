// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePerformanceRestrictHistoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstancePerformanceRestrictHistoryResponse</p>
 */
public class DescribeInstancePerformanceRestrictHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstancePerformanceRestrictHistoryResponseBody body;

    private DescribeInstancePerformanceRestrictHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstancePerformanceRestrictHistoryResponse create() {
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
    public DescribeInstancePerformanceRestrictHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstancePerformanceRestrictHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstancePerformanceRestrictHistoryResponseBody body);

        @Override
        DescribeInstancePerformanceRestrictHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstancePerformanceRestrictHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstancePerformanceRestrictHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstancePerformanceRestrictHistoryResponse response) {
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
        public Builder body(DescribeInstancePerformanceRestrictHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstancePerformanceRestrictHistoryResponse build() {
            return new DescribeInstancePerformanceRestrictHistoryResponse(this);
        } 

    } 

}
