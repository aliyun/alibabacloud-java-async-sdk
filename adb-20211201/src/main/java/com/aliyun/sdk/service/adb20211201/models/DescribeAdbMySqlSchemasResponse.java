// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAdbMySqlSchemasResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlSchemasResponse</p>
 */
public class DescribeAdbMySqlSchemasResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAdbMySqlSchemasResponseBody body;

    private DescribeAdbMySqlSchemasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAdbMySqlSchemasResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeAdbMySqlSchemasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdbMySqlSchemasResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAdbMySqlSchemasResponseBody body);

        @Override
        DescribeAdbMySqlSchemasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdbMySqlSchemasResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeAdbMySqlSchemasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdbMySqlSchemasResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeAdbMySqlSchemasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdbMySqlSchemasResponse build() {
            return new DescribeAdbMySqlSchemasResponse(this);
        } 

    } 

}
