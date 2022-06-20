// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowNodeInstanceResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowNodeInstanceResponse</p>
 */
public class DescribeFlowNodeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowNodeInstanceResponseBody body;

    private DescribeFlowNodeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowNodeInstanceResponse create() {
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
    public DescribeFlowNodeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowNodeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowNodeInstanceResponseBody body);

        @Override
        DescribeFlowNodeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowNodeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowNodeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowNodeInstanceResponse response) {
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
        public Builder body(DescribeFlowNodeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowNodeInstanceResponse build() {
            return new DescribeFlowNodeInstanceResponse(this);
        } 

    } 

}
