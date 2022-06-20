// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowCategoryTreeResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowCategoryTreeResponse</p>
 */
public class DescribeFlowCategoryTreeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowCategoryTreeResponseBody body;

    private DescribeFlowCategoryTreeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowCategoryTreeResponse create() {
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
    public DescribeFlowCategoryTreeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowCategoryTreeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowCategoryTreeResponseBody body);

        @Override
        DescribeFlowCategoryTreeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowCategoryTreeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowCategoryTreeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowCategoryTreeResponse response) {
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
        public Builder body(DescribeFlowCategoryTreeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowCategoryTreeResponse build() {
            return new DescribeFlowCategoryTreeResponse(this);
        } 

    } 

}
