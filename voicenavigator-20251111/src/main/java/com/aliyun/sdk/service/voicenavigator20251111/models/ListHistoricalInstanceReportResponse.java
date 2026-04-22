// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link ListHistoricalInstanceReportResponse} extends {@link TeaModel}
 *
 * <p>ListHistoricalInstanceReportResponse</p>
 */
public class ListHistoricalInstanceReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListHistoricalInstanceReportResponseBody body;

    private ListHistoricalInstanceReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListHistoricalInstanceReportResponse create() {
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
    public ListHistoricalInstanceReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHistoricalInstanceReportResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListHistoricalInstanceReportResponseBody body);

        @Override
        ListHistoricalInstanceReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHistoricalInstanceReportResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListHistoricalInstanceReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHistoricalInstanceReportResponse response) {
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
        public Builder body(ListHistoricalInstanceReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHistoricalInstanceReportResponse build() {
            return new ListHistoricalInstanceReportResponse(this);
        } 

    } 

}
