// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterConnectionResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterConnectionResponse</p>
 */
public class DescribeClusterConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterConnectionResponseBody body;

    private DescribeClusterConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterConnectionResponse create() {
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
    public DescribeClusterConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterConnectionResponseBody body);

        @Override
        DescribeClusterConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterConnectionResponse response) {
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
        public Builder body(DescribeClusterConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterConnectionResponse build() {
            return new DescribeClusterConnectionResponse(this);
        } 

    } 

}
