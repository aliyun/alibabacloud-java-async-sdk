// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerlessJobsResponse} extends {@link TeaModel}
 *
 * <p>DescribeServerlessJobsResponse</p>
 */
public class DescribeServerlessJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServerlessJobsResponseBody body;

    private DescribeServerlessJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServerlessJobsResponse create() {
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
    public DescribeServerlessJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServerlessJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServerlessJobsResponseBody body);

        @Override
        DescribeServerlessJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServerlessJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServerlessJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServerlessJobsResponse response) {
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
        public Builder body(DescribeServerlessJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServerlessJobsResponse build() {
            return new DescribeServerlessJobsResponse(this);
        } 

    } 

}
