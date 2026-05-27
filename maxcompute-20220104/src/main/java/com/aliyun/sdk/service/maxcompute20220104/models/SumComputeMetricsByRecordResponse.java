// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link SumComputeMetricsByRecordResponse} extends {@link TeaModel}
 *
 * <p>SumComputeMetricsByRecordResponse</p>
 */
public class SumComputeMetricsByRecordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SumComputeMetricsByRecordResponseBody body;

    private SumComputeMetricsByRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SumComputeMetricsByRecordResponse create() {
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
    public SumComputeMetricsByRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SumComputeMetricsByRecordResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SumComputeMetricsByRecordResponseBody body);

        @Override
        SumComputeMetricsByRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SumComputeMetricsByRecordResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SumComputeMetricsByRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SumComputeMetricsByRecordResponse response) {
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
        public Builder body(SumComputeMetricsByRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SumComputeMetricsByRecordResponse build() {
            return new SumComputeMetricsByRecordResponse(this);
        } 

    } 

}
