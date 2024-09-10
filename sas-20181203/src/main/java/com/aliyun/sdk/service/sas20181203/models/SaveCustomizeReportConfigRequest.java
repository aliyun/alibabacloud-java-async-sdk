// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveCustomizeReportConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveCustomizeReportConfigRequest</p>
 */
public class SaveCustomizeReportConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PinnedTime")
    private Long pinnedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recipients")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recipients;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportDays")
    private Integer reportDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportEndDate")
    private String reportEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportLang")
    private String reportLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportSendType")
    private Integer reportSendType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportStartDate")
    private String reportStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer reportStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer reportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportVersion")
    private String reportVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendEndTime")
    private String sendEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendPeriodDays")
    private Integer sendPeriodDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendPeriodType")
    private String sendPeriodType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendStartTime")
    private String sendStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetGroups")
    private String targetGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUids")
    private String targetUids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private SaveCustomizeReportConfigRequest(Builder builder) {
        super(builder);
        this.groupType = builder.groupType;
        this.pinnedTime = builder.pinnedTime;
        this.recipients = builder.recipients;
        this.reportDays = builder.reportDays;
        this.reportEndDate = builder.reportEndDate;
        this.reportId = builder.reportId;
        this.reportLang = builder.reportLang;
        this.reportSendType = builder.reportSendType;
        this.reportStartDate = builder.reportStartDate;
        this.reportStatus = builder.reportStatus;
        this.reportType = builder.reportType;
        this.reportVersion = builder.reportVersion;
        this.sendEndTime = builder.sendEndTime;
        this.sendPeriodDays = builder.sendPeriodDays;
        this.sendPeriodType = builder.sendPeriodType;
        this.sendStartTime = builder.sendStartTime;
        this.targetGroups = builder.targetGroups;
        this.targetUids = builder.targetUids;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveCustomizeReportConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return pinnedTime
     */
    public Long getPinnedTime() {
        return this.pinnedTime;
    }

    /**
     * @return recipients
     */
    public String getRecipients() {
        return this.recipients;
    }

    /**
     * @return reportDays
     */
    public Integer getReportDays() {
        return this.reportDays;
    }

    /**
     * @return reportEndDate
     */
    public String getReportEndDate() {
        return this.reportEndDate;
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return reportLang
     */
    public String getReportLang() {
        return this.reportLang;
    }

    /**
     * @return reportSendType
     */
    public Integer getReportSendType() {
        return this.reportSendType;
    }

    /**
     * @return reportStartDate
     */
    public String getReportStartDate() {
        return this.reportStartDate;
    }

    /**
     * @return reportStatus
     */
    public Integer getReportStatus() {
        return this.reportStatus;
    }

    /**
     * @return reportType
     */
    public Integer getReportType() {
        return this.reportType;
    }

    /**
     * @return reportVersion
     */
    public String getReportVersion() {
        return this.reportVersion;
    }

    /**
     * @return sendEndTime
     */
    public String getSendEndTime() {
        return this.sendEndTime;
    }

    /**
     * @return sendPeriodDays
     */
    public Integer getSendPeriodDays() {
        return this.sendPeriodDays;
    }

    /**
     * @return sendPeriodType
     */
    public String getSendPeriodType() {
        return this.sendPeriodType;
    }

    /**
     * @return sendStartTime
     */
    public String getSendStartTime() {
        return this.sendStartTime;
    }

    /**
     * @return targetGroups
     */
    public String getTargetGroups() {
        return this.targetGroups;
    }

    /**
     * @return targetUids
     */
    public String getTargetUids() {
        return this.targetUids;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<SaveCustomizeReportConfigRequest, Builder> {
        private String groupType; 
        private Long pinnedTime; 
        private String recipients; 
        private Integer reportDays; 
        private String reportEndDate; 
        private Long reportId; 
        private String reportLang; 
        private Integer reportSendType; 
        private String reportStartDate; 
        private Integer reportStatus; 
        private Integer reportType; 
        private String reportVersion; 
        private String sendEndTime; 
        private Integer sendPeriodDays; 
        private String sendPeriodType; 
        private String sendStartTime; 
        private String targetGroups; 
        private String targetUids; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(SaveCustomizeReportConfigRequest request) {
            super(request);
            this.groupType = request.groupType;
            this.pinnedTime = request.pinnedTime;
            this.recipients = request.recipients;
            this.reportDays = request.reportDays;
            this.reportEndDate = request.reportEndDate;
            this.reportId = request.reportId;
            this.reportLang = request.reportLang;
            this.reportSendType = request.reportSendType;
            this.reportStartDate = request.reportStartDate;
            this.reportStatus = request.reportStatus;
            this.reportType = request.reportType;
            this.reportVersion = request.reportVersion;
            this.sendEndTime = request.sendEndTime;
            this.sendPeriodDays = request.sendPeriodDays;
            this.sendPeriodType = request.sendPeriodType;
            this.sendStartTime = request.sendStartTime;
            this.targetGroups = request.targetGroups;
            this.targetUids = request.targetUids;
            this.title = request.title;
        } 

        /**
         * The grouping type. Valid values:
         * <p>
         * 
         * *   **ALIYUN_RG**
         * *   **SAS_GROUP**
         * 
         * >  This parameter is supported only in version 2.0.0.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * The time when the report is pinned. Unit: milliseconds.
         * <p>
         * 
         * >  This parameter is supported only in version 2.0.0.
         */
        public Builder pinnedTime(Long pinnedTime) {
            this.putQueryParameter("PinnedTime", pinnedTime);
            this.pinnedTime = pinnedTime;
            return this;
        }

        /**
         * The email address of the recipient. Separate multiple email addresses with commas (,).
         */
        public Builder recipients(String recipients) {
            this.putQueryParameter("Recipients", recipients);
            this.recipients = recipients;
            return this;
        }

        /**
         * The most recent days for report statistics.
         * <p>
         * 
         * >  This parameter is supported only in version 2.0.0.
         */
        public Builder reportDays(Integer reportDays) {
            this.putQueryParameter("ReportDays", reportDays);
            this.reportDays = reportDays;
            return this;
        }

        /**
         * The end date on which the report is sent. The value is in the yyyy-MM-dd format.
         * <p>
         * 
         * >  This parameter is required if the ReportType parameter is set to 3.
         */
        public Builder reportEndDate(String reportEndDate) {
            this.putQueryParameter("ReportEndDate", reportEndDate);
            this.reportEndDate = reportEndDate;
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

        /**
         * The language of the report. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder reportLang(String reportLang) {
            this.putQueryParameter("ReportLang", reportLang);
            this.reportLang = reportLang;
            return this;
        }

        /**
         * The time range in which the report is sent. Valid values:
         * <p>
         * 
         * *   **1**: 00:00 to 06:00.
         * *   **2**: 06:00 to 12:00.
         * *   **3**: 12:00 to 18:00.
         * *   **4**: 18:00 to 24:00.
         */
        public Builder reportSendType(Integer reportSendType) {
            this.putQueryParameter("ReportSendType", reportSendType);
            this.reportSendType = reportSendType;
            return this;
        }

        /**
         * The start date on which the report is sent. The value is in the yyyy-MM-dd format.
         * <p>
         * 
         * >  This parameter is required if the ReportType parameter is set to 3.
         */
        public Builder reportStartDate(String reportStartDate) {
            this.putQueryParameter("ReportStartDate", reportStartDate);
            this.reportStartDate = reportStartDate;
            return this;
        }

        /**
         * The status of the report. Valid values:
         * <p>
         * 
         * *   **0**: disabled.
         * *   **1**: enabled.
         */
        public Builder reportStatus(Integer reportStatus) {
            this.putQueryParameter("ReportStatus", reportStatus);
            this.reportStatus = reportStatus;
            return this;
        }

        /**
         * The type of the report. Valid values:
         * <p>
         * 
         * *   **0**: daily report.
         * *   **1**: weekly report.
         * *   **2**: monthly report.
         * *   **3**: report whose statistics are collected within a custom time range.
         * *   **4**: report of the most recent time range.
         */
        public Builder reportType(Integer reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        /**
         * The version of the report. Valid values:
         * <p>
         * 
         * *   **1.0.0**
         * *   **2.0.0**
         */
        public Builder reportVersion(String reportVersion) {
            this.putQueryParameter("ReportVersion", reportVersion);
            this.reportVersion = reportVersion;
            return this;
        }

        /**
         * The end time at which the report is sent. The value is in the HH:mm:ss format.
         * <p>
         * 
         * >  This parameter is required if the ReportType parameter is set to 0, 1, 2, or 4.
         */
        public Builder sendEndTime(String sendEndTime) {
            this.putQueryParameter("SendEndTime", sendEndTime);
            this.sendEndTime = sendEndTime;
            return this;
        }

        /**
         * The exact day within the sending period.
         * <p>
         * 
         * >  This parameter is supported only in version 2.0.0.
         */
        public Builder sendPeriodDays(Integer sendPeriodDays) {
            this.putQueryParameter("SendPeriodDays", sendPeriodDays);
            this.sendPeriodDays = sendPeriodDays;
            return this;
        }

        /**
         * The interval at which the report is sent. Valid values:
         * <p>
         * 
         * *   **DAY**
         * *   **WEEK**
         * *   **MONTH**
         * 
         * >  This parameter is supported only in version 2.0.0.
         */
        public Builder sendPeriodType(String sendPeriodType) {
            this.putQueryParameter("SendPeriodType", sendPeriodType);
            this.sendPeriodType = sendPeriodType;
            return this;
        }

        /**
         * The start time at which the report is sent. The value is in the HH:mm:ss format.
         * <p>
         * 
         * >  This parameter is required if the ReportType parameter is set to 0, 1, 2, or 4.
         */
        public Builder sendStartTime(String sendStartTime) {
            this.putQueryParameter("SendStartTime", sendStartTime);
            this.sendStartTime = sendStartTime;
            return this;
        }

        /**
         * The groups.
         * <p>
         * 
         * >  This parameter is supported only in version 2.0.0.
         */
        public Builder targetGroups(String targetGroups) {
            this.putQueryParameter("TargetGroups", targetGroups);
            this.targetGroups = targetGroups;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account. Separate multiple IDs with commas (,).
         * <p>
         * 
         * >  This parameter is supported only in version 2.0.0.
         */
        public Builder targetUids(String targetUids) {
            this.putQueryParameter("TargetUids", targetUids);
            this.targetUids = targetUids;
            return this;
        }

        /**
         * The title of the report.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public SaveCustomizeReportConfigRequest build() {
            return new SaveCustomizeReportConfigRequest(this);
        } 

    } 

}
