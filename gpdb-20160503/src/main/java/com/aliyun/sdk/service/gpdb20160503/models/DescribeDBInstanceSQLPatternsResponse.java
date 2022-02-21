// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSQLPatternsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSQLPatternsResponse</p>
 */
public class DescribeDBInstanceSQLPatternsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBInstanceSQLPatternsResponseBody body;

    private DescribeDBInstanceSQLPatternsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBInstanceSQLPatternsResponse create() {
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
    public DescribeDBInstanceSQLPatternsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBInstanceSQLPatternsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBInstanceSQLPatternsResponseBody body);

        @Override
        DescribeDBInstanceSQLPatternsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBInstanceSQLPatternsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBInstanceSQLPatternsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBInstanceSQLPatternsResponse response) {
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
        public Builder body(DescribeDBInstanceSQLPatternsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBInstanceSQLPatternsResponse build() {
            return new DescribeDBInstanceSQLPatternsResponse(this);
        } 

    } 

}
