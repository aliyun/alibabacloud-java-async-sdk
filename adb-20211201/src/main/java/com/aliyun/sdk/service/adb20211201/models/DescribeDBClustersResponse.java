// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBClustersResponse</p>
 */
public class DescribeDBClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBClustersResponseBody body;

    private DescribeDBClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBClustersResponse create() {
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
    public DescribeDBClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBClustersResponseBody body);

        @Override
        DescribeDBClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBClustersResponse response) {
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
        public Builder body(DescribeDBClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBClustersResponse build() {
            return new DescribeDBClustersResponse(this);
        } 

    } 

}
