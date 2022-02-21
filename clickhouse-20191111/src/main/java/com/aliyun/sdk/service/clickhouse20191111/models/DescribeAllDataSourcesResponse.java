// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllDataSourcesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAllDataSourcesResponse</p>
 */
public class DescribeAllDataSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAllDataSourcesResponseBody body;

    private DescribeAllDataSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAllDataSourcesResponse create() {
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
    public DescribeAllDataSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAllDataSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAllDataSourcesResponseBody body);

        @Override
        DescribeAllDataSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAllDataSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAllDataSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAllDataSourcesResponse response) {
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
        public Builder body(DescribeAllDataSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAllDataSourcesResponse build() {
            return new DescribeAllDataSourcesResponse(this);
        } 

    } 

}
