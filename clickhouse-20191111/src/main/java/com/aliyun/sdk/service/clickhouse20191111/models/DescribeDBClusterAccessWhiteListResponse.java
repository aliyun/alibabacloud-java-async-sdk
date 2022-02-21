// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAccessWhiteListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAccessWhiteListResponse</p>
 */
public class DescribeDBClusterAccessWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBClusterAccessWhiteListResponseBody body;

    private DescribeDBClusterAccessWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBClusterAccessWhiteListResponse create() {
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
    public DescribeDBClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBClusterAccessWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBClusterAccessWhiteListResponseBody body);

        @Override
        DescribeDBClusterAccessWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBClusterAccessWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBClusterAccessWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBClusterAccessWhiteListResponse response) {
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
        public Builder body(DescribeDBClusterAccessWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBClusterAccessWhiteListResponse build() {
            return new DescribeDBClusterAccessWhiteListResponse(this);
        } 

    } 

}
