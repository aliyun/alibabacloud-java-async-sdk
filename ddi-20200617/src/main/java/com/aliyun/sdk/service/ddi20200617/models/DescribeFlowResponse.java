// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowResponse</p>
 */
public class DescribeFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowResponseBody body;

    private DescribeFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowResponse create() {
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
    public DescribeFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowResponseBody body);

        @Override
        DescribeFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowResponse response) {
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
        public Builder body(DescribeFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowResponse build() {
            return new DescribeFlowResponse(this);
        } 

    } 

}
