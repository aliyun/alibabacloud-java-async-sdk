// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeUserAlertCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserAlertCountResponse</p>
 */
public class DescribeUserAlertCountResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeUserAlertCountResponseBody body;

    private DescribeUserAlertCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeUserAlertCountResponse create() {
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
    public DescribeUserAlertCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserAlertCountResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeUserAlertCountResponseBody body);

        @Override
        DescribeUserAlertCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserAlertCountResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeUserAlertCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserAlertCountResponse response) {
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
        public Builder body(DescribeUserAlertCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserAlertCountResponse build() {
            return new DescribeUserAlertCountResponse(this);
        } 

    } 

}
