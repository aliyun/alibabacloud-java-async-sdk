// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateConfigRulesReportRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateConfigRulesReportRequest</p>
 */
public class GetAggregateConfigRulesReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    private GetAggregateConfigRulesReportRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRulesReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<GetAggregateConfigRulesReportRequest, Builder> {
        private String aggregatorId; 
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateConfigRulesReportRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.reportId = request.reportId;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
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
        public GetAggregateConfigRulesReportRequest build() {
            return new GetAggregateConfigRulesReportRequest(this);
        } 

    } 

}
