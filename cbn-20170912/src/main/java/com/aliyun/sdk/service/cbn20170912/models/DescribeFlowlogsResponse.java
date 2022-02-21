// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowlogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowlogsResponse</p>
 */
public class DescribeFlowlogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowlogsResponseBody body;

    private DescribeFlowlogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowlogsResponse create() {
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
    public DescribeFlowlogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowlogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowlogsResponseBody body);

        @Override
        DescribeFlowlogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowlogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowlogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowlogsResponse response) {
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
        public Builder body(DescribeFlowlogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowlogsResponse build() {
            return new DescribeFlowlogsResponse(this);
        } 

    } 

}
