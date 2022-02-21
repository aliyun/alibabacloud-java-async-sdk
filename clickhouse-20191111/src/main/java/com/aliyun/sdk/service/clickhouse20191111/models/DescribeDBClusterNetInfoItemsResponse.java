// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterNetInfoItemsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterNetInfoItemsResponse</p>
 */
public class DescribeDBClusterNetInfoItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBClusterNetInfoItemsResponseBody body;

    private DescribeDBClusterNetInfoItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBClusterNetInfoItemsResponse create() {
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
    public DescribeDBClusterNetInfoItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBClusterNetInfoItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBClusterNetInfoItemsResponseBody body);

        @Override
        DescribeDBClusterNetInfoItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBClusterNetInfoItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBClusterNetInfoItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBClusterNetInfoItemsResponse response) {
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
        public Builder body(DescribeDBClusterNetInfoItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBClusterNetInfoItemsResponse build() {
            return new DescribeDBClusterNetInfoItemsResponse(this);
        } 

    } 

}
