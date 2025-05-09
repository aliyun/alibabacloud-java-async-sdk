// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetHistoricalCampaignReportResponse} extends {@link TeaModel}
 *
 * <p>GetHistoricalCampaignReportResponse</p>
 */
public class GetHistoricalCampaignReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetHistoricalCampaignReportResponseBody body;

    private GetHistoricalCampaignReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetHistoricalCampaignReportResponse create() {
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
    public GetHistoricalCampaignReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistoricalCampaignReportResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetHistoricalCampaignReportResponseBody body);

        @Override
        GetHistoricalCampaignReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistoricalCampaignReportResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetHistoricalCampaignReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistoricalCampaignReportResponse response) {
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
        public Builder body(GetHistoricalCampaignReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistoricalCampaignReportResponse build() {
            return new GetHistoricalCampaignReportResponse(this);
        } 

    } 

}
