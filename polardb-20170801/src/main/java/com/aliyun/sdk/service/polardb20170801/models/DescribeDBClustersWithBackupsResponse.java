// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClustersWithBackupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBClustersWithBackupsResponse</p>
 */
public class DescribeDBClustersWithBackupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBClustersWithBackupsResponseBody body;

    private DescribeDBClustersWithBackupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBClustersWithBackupsResponse create() {
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
    public DescribeDBClustersWithBackupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBClustersWithBackupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBClustersWithBackupsResponseBody body);

        @Override
        DescribeDBClustersWithBackupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBClustersWithBackupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBClustersWithBackupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBClustersWithBackupsResponse response) {
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
        public Builder body(DescribeDBClustersWithBackupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBClustersWithBackupsResponse build() {
            return new DescribeDBClustersWithBackupsResponse(this);
        } 

    } 

}
