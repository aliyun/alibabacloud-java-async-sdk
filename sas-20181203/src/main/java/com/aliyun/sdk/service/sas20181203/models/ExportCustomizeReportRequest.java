// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportCustomizeReportRequest} extends {@link RequestModel}
 *
 * <p>ExportCustomizeReportRequest</p>
 */
public class ExportCustomizeReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportId;

    private ExportCustomizeReportRequest(Builder builder) {
        super(builder);
        this.exportType = builder.exportType;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCustomizeReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<ExportCustomizeReportRequest, Builder> {
        private String exportType; 
        private Long reportId; 

        private Builder() {
            super();
        } 

        private Builder(ExportCustomizeReportRequest request) {
            super(request);
            this.exportType = request.exportType;
            this.reportId = request.reportId;
        } 

        /**
         * The type of the security report that you want to export. Valid values:
         * <p>
         * 
         * *   **HTML**
         * *   **PDF**
         * 
         * >  The default value is HTML. PDF is supported only for security reports in version 2.0.0.
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * The ID of the security report.
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
        public ExportCustomizeReportRequest build() {
            return new ExportCustomizeReportRequest(this);
        } 

    } 

}
