// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link StartQuotaUtilizationReportResponse} extends {@link TeaModel}
 *
 * <p>StartQuotaUtilizationReportResponse</p>
 */
public class StartQuotaUtilizationReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StartQuotaUtilizationReportResponseBody body;

    private StartQuotaUtilizationReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StartQuotaUtilizationReportResponse create() {
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
    public StartQuotaUtilizationReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartQuotaUtilizationReportResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(StartQuotaUtilizationReportResponseBody body);

        @Override
        StartQuotaUtilizationReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartQuotaUtilizationReportResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private StartQuotaUtilizationReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartQuotaUtilizationReportResponse response) {
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
        public Builder body(StartQuotaUtilizationReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartQuotaUtilizationReportResponse build() {
            return new StartQuotaUtilizationReportResponse(this);
        } 

    } 

}
