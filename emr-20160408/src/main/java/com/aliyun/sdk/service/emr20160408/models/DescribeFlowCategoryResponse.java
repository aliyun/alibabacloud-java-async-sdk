// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowCategoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowCategoryResponse</p>
 */
public class DescribeFlowCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowCategoryResponseBody body;

    private DescribeFlowCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowCategoryResponse create() {
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
    public DescribeFlowCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowCategoryResponseBody body);

        @Override
        DescribeFlowCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowCategoryResponse response) {
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
        public Builder body(DescribeFlowCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowCategoryResponse build() {
            return new DescribeFlowCategoryResponse(this);
        } 

    } 

}
