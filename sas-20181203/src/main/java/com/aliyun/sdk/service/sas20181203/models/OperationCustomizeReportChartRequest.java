// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperationCustomizeReportChartRequest} extends {@link RequestModel}
 *
 * <p>OperationCustomizeReportChartRequest</p>
 */
public class OperationCustomizeReportChartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChartIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chartIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportId;

    private OperationCustomizeReportChartRequest(Builder builder) {
        super(builder);
        this.chartIds = builder.chartIds;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationCustomizeReportChartRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chartIds
     */
    public String getChartIds() {
        return this.chartIds;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<OperationCustomizeReportChartRequest, Builder> {
        private String chartIds; 
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(OperationCustomizeReportChartRequest request) {
            super(request);
            this.chartIds = request.chartIds;
            this.reportId = request.reportId;
        } 

        /**
         * The ID of the chart that is included in the report. Separate multiple IDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeChartList](~~DescribeChartList~~) operation to query the ID.
         */
        public Builder chartIds(String chartIds) {
            this.putQueryParameter("ChartIds", chartIds);
            this.chartIds = chartIds;
            return this;
        }

        /**
         * The ID of the report.
         * <p>
         * 
         * >  You can call the [DescribeCustomizeReportList](~~DescribeCustomizeReportList~~) operation to query the ID.
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public OperationCustomizeReportChartRequest build() {
            return new OperationCustomizeReportChartRequest(this);
        } 

    } 

}
