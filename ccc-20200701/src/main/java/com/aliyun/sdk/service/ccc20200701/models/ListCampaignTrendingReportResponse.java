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
 * {@link ListCampaignTrendingReportResponse} extends {@link TeaModel}
 *
 * <p>ListCampaignTrendingReportResponse</p>
 */
public class ListCampaignTrendingReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListCampaignTrendingReportResponseBody body;

    private ListCampaignTrendingReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListCampaignTrendingReportResponse create() {
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
    public ListCampaignTrendingReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCampaignTrendingReportResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListCampaignTrendingReportResponseBody body);

        @Override
        ListCampaignTrendingReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCampaignTrendingReportResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListCampaignTrendingReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCampaignTrendingReportResponse response) {
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
        public Builder body(ListCampaignTrendingReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCampaignTrendingReportResponse build() {
            return new ListCampaignTrendingReportResponse(this);
        } 

    } 

}
