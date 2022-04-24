// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBNodesParametersResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBNodesParametersResponse</p>
 */
public class DescribeDBNodesParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBNodesParametersResponseBody body;

    private DescribeDBNodesParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBNodesParametersResponse create() {
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
    public DescribeDBNodesParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBNodesParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBNodesParametersResponseBody body);

        @Override
        DescribeDBNodesParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBNodesParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBNodesParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBNodesParametersResponse response) {
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
        public Builder body(DescribeDBNodesParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBNodesParametersResponse build() {
            return new DescribeDBNodesParametersResponse(this);
        } 

    } 

}
