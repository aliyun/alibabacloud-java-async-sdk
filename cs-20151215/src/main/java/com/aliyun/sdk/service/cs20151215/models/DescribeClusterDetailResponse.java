// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterDetailResponse</p>
 */
public class DescribeClusterDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterDetailResponseBody body;

    private DescribeClusterDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterDetailResponse create() {
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
    public DescribeClusterDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterDetailResponseBody body);

        @Override
        DescribeClusterDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterDetailResponse response) {
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
        public Builder body(DescribeClusterDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterDetailResponse build() {
            return new DescribeClusterDetailResponse(this);
        } 

    } 

}
