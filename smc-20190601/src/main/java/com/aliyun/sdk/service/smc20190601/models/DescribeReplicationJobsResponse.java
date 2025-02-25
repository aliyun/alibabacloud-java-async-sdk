// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeReplicationJobsResponse} extends {@link TeaModel}
 *
 * <p>DescribeReplicationJobsResponse</p>
 */
public class DescribeReplicationJobsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeReplicationJobsResponseBody body;

    private DescribeReplicationJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeReplicationJobsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public DescribeReplicationJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReplicationJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeReplicationJobsResponseBody body);

        @Override
        DescribeReplicationJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReplicationJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeReplicationJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReplicationJobsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(DescribeReplicationJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReplicationJobsResponse build() {
            return new DescribeReplicationJobsResponse(this);
        } 

    } 

}
