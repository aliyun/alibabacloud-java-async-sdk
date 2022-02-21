// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceConfigHistoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterServiceConfigHistoryResponse</p>
 */
public class DescribeClusterServiceConfigHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterServiceConfigHistoryResponseBody body;

    private DescribeClusterServiceConfigHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterServiceConfigHistoryResponse create() {
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
    public DescribeClusterServiceConfigHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterServiceConfigHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterServiceConfigHistoryResponseBody body);

        @Override
        DescribeClusterServiceConfigHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterServiceConfigHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterServiceConfigHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterServiceConfigHistoryResponse response) {
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
        public Builder body(DescribeClusterServiceConfigHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterServiceConfigHistoryResponse build() {
            return new DescribeClusterServiceConfigHistoryResponse(this);
        } 

    } 

}
