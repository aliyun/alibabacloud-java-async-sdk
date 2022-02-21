// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterTokensResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterTokensResponse</p>
 */
public class DescribeClusterTokensResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DescribeClusterTokensResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static DescribeClusterTokensResponse create() {
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

    public interface Builder extends Response.Builder<DescribeClusterTokensResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DescribeClusterTokensResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterTokensResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterTokensResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DescribeClusterTokensResponse build() {
            return new DescribeClusterTokensResponse(this);
        } 

    } 

}
