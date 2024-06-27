// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressionVariableDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeExpressionVariableDetailResponse</p>
 */
public class DescribeExpressionVariableDetailResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeExpressionVariableDetailResponseBody body;

    private DescribeExpressionVariableDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeExpressionVariableDetailResponse create() {
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
    public DescribeExpressionVariableDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExpressionVariableDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeExpressionVariableDetailResponseBody body);

        @Override
        DescribeExpressionVariableDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExpressionVariableDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeExpressionVariableDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExpressionVariableDetailResponse response) {
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
        public Builder body(DescribeExpressionVariableDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExpressionVariableDetailResponse build() {
            return new DescribeExpressionVariableDetailResponse(this);
        } 

    } 

}
