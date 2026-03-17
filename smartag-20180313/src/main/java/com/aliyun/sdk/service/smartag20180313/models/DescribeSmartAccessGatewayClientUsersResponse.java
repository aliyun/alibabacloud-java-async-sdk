// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSmartAccessGatewayClientUsersResponse} extends {@link TeaModel}
 *
 * <p>DescribeSmartAccessGatewayClientUsersResponse</p>
 */
public class DescribeSmartAccessGatewayClientUsersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSmartAccessGatewayClientUsersResponseBody body;

    private DescribeSmartAccessGatewayClientUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSmartAccessGatewayClientUsersResponse create() {
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
    public DescribeSmartAccessGatewayClientUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSmartAccessGatewayClientUsersResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSmartAccessGatewayClientUsersResponseBody body);

        @Override
        DescribeSmartAccessGatewayClientUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSmartAccessGatewayClientUsersResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeSmartAccessGatewayClientUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSmartAccessGatewayClientUsersResponse response) {
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
        public Builder body(DescribeSmartAccessGatewayClientUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSmartAccessGatewayClientUsersResponse build() {
            return new DescribeSmartAccessGatewayClientUsersResponse(this);
        } 

    } 

}
