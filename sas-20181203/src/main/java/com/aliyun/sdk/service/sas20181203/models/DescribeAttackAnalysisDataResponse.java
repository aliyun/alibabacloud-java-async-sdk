// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAttackAnalysisDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeAttackAnalysisDataResponse</p>
 */
public class DescribeAttackAnalysisDataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAttackAnalysisDataResponseBody body;

    private DescribeAttackAnalysisDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAttackAnalysisDataResponse create() {
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
    public DescribeAttackAnalysisDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAttackAnalysisDataResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAttackAnalysisDataResponseBody body);

        @Override
        DescribeAttackAnalysisDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAttackAnalysisDataResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeAttackAnalysisDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAttackAnalysisDataResponse response) {
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
        public Builder body(DescribeAttackAnalysisDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAttackAnalysisDataResponse build() {
            return new DescribeAttackAnalysisDataResponse(this);
        } 

    } 

}
