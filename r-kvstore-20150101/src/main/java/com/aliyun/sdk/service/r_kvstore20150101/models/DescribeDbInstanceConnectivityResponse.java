// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeDbInstanceConnectivityResponse} extends {@link TeaModel}
 *
 * <p>DescribeDbInstanceConnectivityResponse</p>
 */
public class DescribeDbInstanceConnectivityResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeDbInstanceConnectivityResponseBody body;

    private DescribeDbInstanceConnectivityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeDbInstanceConnectivityResponse create() {
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
    public DescribeDbInstanceConnectivityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDbInstanceConnectivityResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeDbInstanceConnectivityResponseBody body);

        @Override
        DescribeDbInstanceConnectivityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDbInstanceConnectivityResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeDbInstanceConnectivityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDbInstanceConnectivityResponse response) {
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
        public Builder body(DescribeDbInstanceConnectivityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDbInstanceConnectivityResponse build() {
            return new DescribeDbInstanceConnectivityResponse(this);
        } 

    } 

}
