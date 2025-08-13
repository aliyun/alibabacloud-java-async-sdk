// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeAnalysisConditionFavoriteListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAnalysisConditionFavoriteListResponse</p>
 */
public class DescribeAnalysisConditionFavoriteListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAnalysisConditionFavoriteListResponseBody body;

    private DescribeAnalysisConditionFavoriteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAnalysisConditionFavoriteListResponse create() {
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
    public DescribeAnalysisConditionFavoriteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAnalysisConditionFavoriteListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAnalysisConditionFavoriteListResponseBody body);

        @Override
        DescribeAnalysisConditionFavoriteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAnalysisConditionFavoriteListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeAnalysisConditionFavoriteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAnalysisConditionFavoriteListResponse response) {
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
        public Builder body(DescribeAnalysisConditionFavoriteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAnalysisConditionFavoriteListResponse build() {
            return new DescribeAnalysisConditionFavoriteListResponse(this);
        } 

    } 

}
