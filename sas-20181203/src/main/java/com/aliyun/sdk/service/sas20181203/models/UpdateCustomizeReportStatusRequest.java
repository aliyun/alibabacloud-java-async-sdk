// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCustomizeReportStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomizeReportStatusRequest</p>
 */
public class UpdateCustomizeReportStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PinnedTime")
    private Long pinnedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer reportStatus;

    private UpdateCustomizeReportStatusRequest(Builder builder) {
        super(builder);
        this.pinnedTime = builder.pinnedTime;
        this.reportId = builder.reportId;
        this.reportStatus = builder.reportStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomizeReportStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pinnedTime
     */
    public Long getPinnedTime() {
        return this.pinnedTime;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return reportStatus
     */
    public Integer getReportStatus() {
        return this.reportStatus;
    }

    public static final class Builder extends Request.Builder<UpdateCustomizeReportStatusRequest, Builder> {
        private Long pinnedTime; 
        private Long reportId; 
        private Integer reportStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomizeReportStatusRequest request) {
            super(request);
            this.pinnedTime = request.pinnedTime;
            this.reportId = request.reportId;
            this.reportStatus = request.reportStatus;
        } 

        /**
         * <p>The time when the report is pinned. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717430400000</p>
         */
        public Builder pinnedTime(Long pinnedTime) {
            this.putQueryParameter("PinnedTime", pinnedTime);
            this.pinnedTime = pinnedTime;
            return this;
        }

        /**
         * <p>The ID of the report.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The status of the report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportStatus(Integer reportStatus) {
            this.putQueryParameter("ReportStatus", reportStatus);
            this.reportStatus = reportStatus;
            return this;
        }

        @Override
        public UpdateCustomizeReportStatusRequest build() {
            return new UpdateCustomizeReportStatusRequest(this);
        } 

    } 

}
