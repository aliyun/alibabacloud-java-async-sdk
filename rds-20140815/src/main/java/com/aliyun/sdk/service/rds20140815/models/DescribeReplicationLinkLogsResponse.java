// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeReplicationLinkLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeReplicationLinkLogsResponse</p>
 */
public class DescribeReplicationLinkLogsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeReplicationLinkLogsResponseBody body;

    private DescribeReplicationLinkLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeReplicationLinkLogsResponse create() {
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
    public DescribeReplicationLinkLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReplicationLinkLogsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeReplicationLinkLogsResponseBody body);

        @Override
        DescribeReplicationLinkLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReplicationLinkLogsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeReplicationLinkLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReplicationLinkLogsResponse response) {
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
        public Builder body(DescribeReplicationLinkLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReplicationLinkLogsResponse build() {
            return new DescribeReplicationLinkLogsResponse(this);
        } 

    } 

}
