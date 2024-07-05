// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsDomainSnapshotDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainSnapshotDataResponse</p>
 */
public class DescribeVsDomainSnapshotDataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeVsDomainSnapshotDataResponseBody body;

    private DescribeVsDomainSnapshotDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeVsDomainSnapshotDataResponse create() {
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
    public DescribeVsDomainSnapshotDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVsDomainSnapshotDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeVsDomainSnapshotDataResponseBody body);

        @Override
        DescribeVsDomainSnapshotDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVsDomainSnapshotDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeVsDomainSnapshotDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVsDomainSnapshotDataResponse response) {
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
        public Builder body(DescribeVsDomainSnapshotDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVsDomainSnapshotDataResponse build() {
            return new DescribeVsDomainSnapshotDataResponse(this);
        } 

    } 

}
