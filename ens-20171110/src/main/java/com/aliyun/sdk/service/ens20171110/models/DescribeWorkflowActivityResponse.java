// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowActivityResponse} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowActivityResponse</p>
 */
public class DescribeWorkflowActivityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWorkflowActivityResponseBody body;

    private DescribeWorkflowActivityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWorkflowActivityResponse create() {
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
    public DescribeWorkflowActivityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWorkflowActivityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWorkflowActivityResponseBody body);

        @Override
        DescribeWorkflowActivityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWorkflowActivityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWorkflowActivityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWorkflowActivityResponse response) {
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
        public Builder body(DescribeWorkflowActivityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWorkflowActivityResponse build() {
            return new DescribeWorkflowActivityResponse(this);
        } 

    } 

}
