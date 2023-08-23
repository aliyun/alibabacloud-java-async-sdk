// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCampaignTrendingReportResponse} extends {@link TeaModel}
 *
 * <p>ListCampaignTrendingReportResponse</p>
 */
public class ListCampaignTrendingReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCampaignTrendingReportResponseBody body;

    private ListCampaignTrendingReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ListCampaignTrendingReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCampaignTrendingReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCampaignTrendingReportResponseBody body);

        @Override
        ListCampaignTrendingReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCampaignTrendingReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCampaignTrendingReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCampaignTrendingReportResponse response) {
            super(response);
            this.headers = response.headers;
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
