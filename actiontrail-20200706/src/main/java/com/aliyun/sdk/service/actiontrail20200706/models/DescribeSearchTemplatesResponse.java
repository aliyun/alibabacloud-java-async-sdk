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
 * {@link DescribeSearchTemplatesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSearchTemplatesResponse</p>
 */
public class DescribeSearchTemplatesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSearchTemplatesResponseBody body;

    private DescribeSearchTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSearchTemplatesResponse create() {
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
    public DescribeSearchTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSearchTemplatesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSearchTemplatesResponseBody body);

        @Override
        DescribeSearchTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSearchTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeSearchTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSearchTemplatesResponse response) {
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
        public Builder body(DescribeSearchTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSearchTemplatesResponse build() {
            return new DescribeSearchTemplatesResponse(this);
        } 

    } 

}
