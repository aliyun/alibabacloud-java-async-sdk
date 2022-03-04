// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowsResponse} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowsResponse</p>
 */
public class DescribeWorkflowsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWorkflowsResponseBody body;

    private DescribeWorkflowsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWorkflowsResponse create() {
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
    public DescribeWorkflowsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWorkflowsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWorkflowsResponseBody body);

        @Override
        DescribeWorkflowsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWorkflowsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWorkflowsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWorkflowsResponse response) {
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
        public Builder body(DescribeWorkflowsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWorkflowsResponse build() {
            return new DescribeWorkflowsResponse(this);
        } 

    } 

}
