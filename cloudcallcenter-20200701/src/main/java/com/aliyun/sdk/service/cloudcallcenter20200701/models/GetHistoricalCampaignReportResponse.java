// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoricalCampaignReportResponse} extends {@link TeaModel}
 *
 * <p>GetHistoricalCampaignReportResponse</p>
 */
public class GetHistoricalCampaignReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHistoricalCampaignReportResponseBody body;

    private GetHistoricalCampaignReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public GetHistoricalCampaignReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistoricalCampaignReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHistoricalCampaignReportResponseBody body);

        @Override
        GetHistoricalCampaignReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistoricalCampaignReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHistoricalCampaignReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistoricalCampaignReportResponse response) {
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
