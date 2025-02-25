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
 * {@link DescribeIspFlushCacheInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribeIspFlushCacheInstancesResponse</p>
 */
public class DescribeIspFlushCacheInstancesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeIspFlushCacheInstancesResponseBody body;

    private DescribeIspFlushCacheInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeIspFlushCacheInstancesResponse create() {
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
    public DescribeIspFlushCacheInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIspFlushCacheInstancesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeIspFlushCacheInstancesResponseBody body);

        @Override
        DescribeIspFlushCacheInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIspFlushCacheInstancesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeIspFlushCacheInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIspFlushCacheInstancesResponse response) {
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
        public Builder body(DescribeIspFlushCacheInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIspFlushCacheInstancesResponse build() {
            return new DescribeIspFlushCacheInstancesResponse(this);
        } 

    } 

}
