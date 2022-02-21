// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConfigResponse</p>
 */
public class DescribeDBClusterConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBClusterConfigResponseBody body;

    private DescribeDBClusterConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBClusterConfigResponse create() {
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
    public DescribeDBClusterConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBClusterConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBClusterConfigResponseBody body);

        @Override
        DescribeDBClusterConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBClusterConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBClusterConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBClusterConfigResponse response) {
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
        public Builder body(DescribeDBClusterConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBClusterConfigResponse build() {
            return new DescribeDBClusterConfigResponse(this);
        } 

    } 

}
