// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataFlowsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataFlowsResponse</p>
 */
public class DescribeDataFlowsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataFlowsResponseBody body;

    private DescribeDataFlowsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataFlowsResponse create() {
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
    public DescribeDataFlowsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataFlowsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataFlowsResponseBody body);

        @Override
        DescribeDataFlowsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataFlowsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataFlowsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataFlowsResponse response) {
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
        public Builder body(DescribeDataFlowsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataFlowsResponse build() {
            return new DescribeDataFlowsResponse(this);
        } 

    } 

}
