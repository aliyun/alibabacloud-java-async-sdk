// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowResponse} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowResponse</p>
 */
public class DescribeWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWorkflowResponseBody body;

    private DescribeWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWorkflowResponse create() {
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
    public DescribeWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWorkflowResponseBody body);

        @Override
        DescribeWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWorkflowResponse response) {
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
        public Builder body(DescribeWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWorkflowResponse build() {
            return new DescribeWorkflowResponse(this);
        } 

    } 

}
