// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeCloudGtmInstanceConfigFullInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmInstanceConfigFullInfoResponse</p>
 */
public class DescribeCloudGtmInstanceConfigFullInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeCloudGtmInstanceConfigFullInfoResponseBody body;

    private DescribeCloudGtmInstanceConfigFullInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeCloudGtmInstanceConfigFullInfoResponse create() {
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
    public DescribeCloudGtmInstanceConfigFullInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudGtmInstanceConfigFullInfoResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeCloudGtmInstanceConfigFullInfoResponseBody body);

        @Override
        DescribeCloudGtmInstanceConfigFullInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudGtmInstanceConfigFullInfoResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeCloudGtmInstanceConfigFullInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudGtmInstanceConfigFullInfoResponse response) {
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
        public Builder body(DescribeCloudGtmInstanceConfigFullInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudGtmInstanceConfigFullInfoResponse build() {
            return new DescribeCloudGtmInstanceConfigFullInfoResponse(this);
        } 

    } 

}
