// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeSparkSQLDiagnosisListResponse} extends {@link TeaModel}
 *
 * <p>DescribeSparkSQLDiagnosisListResponse</p>
 */
public class DescribeSparkSQLDiagnosisListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSparkSQLDiagnosisListResponseBody body;

    private DescribeSparkSQLDiagnosisListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSparkSQLDiagnosisListResponse create() {
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
    public DescribeSparkSQLDiagnosisListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSparkSQLDiagnosisListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSparkSQLDiagnosisListResponseBody body);

        @Override
        DescribeSparkSQLDiagnosisListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSparkSQLDiagnosisListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeSparkSQLDiagnosisListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSparkSQLDiagnosisListResponse response) {
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
        public Builder body(DescribeSparkSQLDiagnosisListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSparkSQLDiagnosisListResponse build() {
            return new DescribeSparkSQLDiagnosisListResponse(this);
        } 

    } 

}
