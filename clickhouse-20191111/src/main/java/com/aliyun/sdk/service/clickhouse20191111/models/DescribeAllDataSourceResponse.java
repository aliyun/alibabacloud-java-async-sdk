// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllDataSourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeAllDataSourceResponse</p>
 */
public class DescribeAllDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAllDataSourceResponseBody body;

    private DescribeAllDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAllDataSourceResponse create() {
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
    public DescribeAllDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAllDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAllDataSourceResponseBody body);

        @Override
        DescribeAllDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAllDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAllDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAllDataSourceResponse response) {
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
        public Builder body(DescribeAllDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAllDataSourceResponse build() {
            return new DescribeAllDataSourceResponse(this);
        } 

    } 

}
