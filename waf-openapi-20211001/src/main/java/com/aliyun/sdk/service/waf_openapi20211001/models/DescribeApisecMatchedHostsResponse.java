// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecMatchedHostsResponse} extends {@link TeaModel}
 *
 * <p>DescribeApisecMatchedHostsResponse</p>
 */
public class DescribeApisecMatchedHostsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeApisecMatchedHostsResponseBody body;

    private DescribeApisecMatchedHostsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeApisecMatchedHostsResponse create() {
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
    public DescribeApisecMatchedHostsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApisecMatchedHostsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeApisecMatchedHostsResponseBody body);

        @Override
        DescribeApisecMatchedHostsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApisecMatchedHostsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeApisecMatchedHostsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApisecMatchedHostsResponse response) {
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
        public Builder body(DescribeApisecMatchedHostsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApisecMatchedHostsResponse build() {
            return new DescribeApisecMatchedHostsResponse(this);
        } 

    } 

}
