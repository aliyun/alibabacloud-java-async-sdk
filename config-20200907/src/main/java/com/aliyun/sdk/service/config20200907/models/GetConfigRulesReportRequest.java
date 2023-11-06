// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigRulesReportRequest} extends {@link RequestModel}
 *
 * <p>GetConfigRulesReportRequest</p>
 */
public class GetConfigRulesReportRequest extends Request {
    @Query
    @NameInMap("ReportId")
    private String reportId;

    private GetConfigRulesReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRulesReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<GetConfigRulesReportRequest, Builder> {
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigRulesReportRequest request) {
            super(request);
            this.reportId = request.reportId;
        } 

        /**
         * The ID of the compliance evaluation report.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetConfigRulesReportRequest build() {
            return new GetConfigRulesReportRequest(this);
        } 

    } 

}
