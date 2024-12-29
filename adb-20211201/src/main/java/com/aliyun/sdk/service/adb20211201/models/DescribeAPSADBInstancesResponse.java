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
 * {@link DescribeAPSADBInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAPSADBInstancesResponse</p>
 */
public class DescribeAPSADBInstancesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAPSADBInstancesResponseBody body;

    private DescribeAPSADBInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAPSADBInstancesResponse create() {
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
    public DescribeAPSADBInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAPSADBInstancesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAPSADBInstancesResponseBody body);

        @Override
        DescribeAPSADBInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAPSADBInstancesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeAPSADBInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAPSADBInstancesResponse response) {
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
        public Builder body(DescribeAPSADBInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAPSADBInstancesResponse build() {
            return new DescribeAPSADBInstancesResponse(this);
        } 

    } 

}
