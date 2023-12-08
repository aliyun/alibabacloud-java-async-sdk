// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdbMySqlTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlTablesResponse</p>
 */
public class DescribeAdbMySqlTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAdbMySqlTablesResponseBody body;

    private DescribeAdbMySqlTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAdbMySqlTablesResponse create() {
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
    public DescribeAdbMySqlTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdbMySqlTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAdbMySqlTablesResponseBody body);

        @Override
        DescribeAdbMySqlTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdbMySqlTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAdbMySqlTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdbMySqlTablesResponse response) {
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
        public Builder body(DescribeAdbMySqlTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdbMySqlTablesResponse build() {
            return new DescribeAdbMySqlTablesResponse(this);
        } 

    } 

}
