// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecDataCheckDownloadReportResponse} extends {@link TeaModel}
 *
 * <p>ExecDataCheckDownloadReportResponse</p>
 */
public class ExecDataCheckDownloadReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExecDataCheckDownloadReportResponseBody body;

    private ExecDataCheckDownloadReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExecDataCheckDownloadReportResponse create() {
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
    public ExecDataCheckDownloadReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecDataCheckDownloadReportResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExecDataCheckDownloadReportResponseBody body);

        @Override
        ExecDataCheckDownloadReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecDataCheckDownloadReportResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ExecDataCheckDownloadReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecDataCheckDownloadReportResponse response) {
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
        public Builder body(ExecDataCheckDownloadReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecDataCheckDownloadReportResponse build() {
            return new ExecDataCheckDownloadReportResponse(this);
        } 

    } 

}
