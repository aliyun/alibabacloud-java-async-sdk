// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecommendTaskPageListResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecommendTaskPageListResponse</p>
 */
public class DescribeRecommendTaskPageListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeRecommendTaskPageListResponseBody body;

    private DescribeRecommendTaskPageListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeRecommendTaskPageListResponse create() {
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
    public DescribeRecommendTaskPageListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecommendTaskPageListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeRecommendTaskPageListResponseBody body);

        @Override
        DescribeRecommendTaskPageListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecommendTaskPageListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeRecommendTaskPageListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecommendTaskPageListResponse response) {
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
        public Builder body(DescribeRecommendTaskPageListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecommendTaskPageListResponse build() {
            return new DescribeRecommendTaskPageListResponse(this);
        } 

    } 

}
