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
 * {@link DescribeBindableSmartAccessGatewaysResponse} extends {@link TeaModel}
 *
 * <p>DescribeBindableSmartAccessGatewaysResponse</p>
 */
public class DescribeBindableSmartAccessGatewaysResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeBindableSmartAccessGatewaysResponseBody body;

    private DescribeBindableSmartAccessGatewaysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeBindableSmartAccessGatewaysResponse create() {
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
    public DescribeBindableSmartAccessGatewaysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBindableSmartAccessGatewaysResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeBindableSmartAccessGatewaysResponseBody body);

        @Override
        DescribeBindableSmartAccessGatewaysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBindableSmartAccessGatewaysResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeBindableSmartAccessGatewaysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBindableSmartAccessGatewaysResponse response) {
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
        public Builder body(DescribeBindableSmartAccessGatewaysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBindableSmartAccessGatewaysResponse build() {
            return new DescribeBindableSmartAccessGatewaysResponse(this);
        } 

    } 

}
