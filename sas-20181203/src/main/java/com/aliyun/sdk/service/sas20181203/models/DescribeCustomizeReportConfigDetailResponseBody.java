// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizeReportConfigDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizeReportConfigDetailResponseBody</p>
 */
public class DescribeCustomizeReportConfigDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChartIds")
    private String chartIds;

    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Integer isDefault;

    @com.aliyun.core.annotation.NameInMap("PinnedTime")
    private Long pinnedTime;

    @com.aliyun.core.annotation.NameInMap("Recipients")
    private String recipients;

    @com.aliyun.core.annotation.NameInMap("ReportDays")
    private Integer reportDays;

    @com.aliyun.core.annotation.NameInMap("ReportEndDate")
    private String reportEndDate;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.NameInMap("ReportLang")
    private String reportLang;

    @com.aliyun.core.annotation.NameInMap("ReportSendType")
    private String reportSendType;

    @com.aliyun.core.annotation.NameInMap("ReportStartDate")
    private String reportStartDate;

    @com.aliyun.core.annotation.NameInMap("ReportStatus")
    private String reportStatus;

    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SendEndTime")
    private String sendEndTime;

    @com.aliyun.core.annotation.NameInMap("SendPeriodDays")
    private Integer sendPeriodDays;

    @com.aliyun.core.annotation.NameInMap("SendPeriodType")
    private String sendPeriodType;

    @com.aliyun.core.annotation.NameInMap("SendStartTime")
    private String sendStartTime;

    @com.aliyun.core.annotation.NameInMap("SendTime")
    private String sendTime;

    @com.aliyun.core.annotation.NameInMap("TargetGroups")
    private String targetGroups;

    @com.aliyun.core.annotation.NameInMap("TargetUids")
    private String targetUids;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private DescribeCustomizeReportConfigDetailResponseBody(Builder builder) {
        this.chartIds = builder.chartIds;
        this.groupType = builder.groupType;
        this.isDefault = builder.isDefault;
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
        this.requestId = builder.requestId;
        this.sendEndTime = builder.sendEndTime;
        this.sendPeriodDays = builder.sendPeriodDays;
        this.sendPeriodType = builder.sendPeriodType;
        this.sendStartTime = builder.sendStartTime;
        this.sendTime = builder.sendTime;
        this.targetGroups = builder.targetGroups;
        this.targetUids = builder.targetUids;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeReportConfigDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return chartIds
     */
    public String getChartIds() {
        return this.chartIds;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return isDefault
     */
    public Integer getIsDefault() {
        return this.isDefault;
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
    public String getReportSendType() {
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
    public String getReportStatus() {
        return this.reportStatus;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return sendTime
     */
    public String getSendTime() {
        return this.sendTime;
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

    public static final class Builder {
        private String chartIds; 
        private String groupType; 
        private Integer isDefault; 
        private Long pinnedTime; 
        private String recipients; 
        private Integer reportDays; 
        private String reportEndDate; 
        private Long reportId; 
        private String reportLang; 
        private String reportSendType; 
        private String reportStartDate; 
        private String reportStatus; 
        private String reportType; 
        private String requestId; 
        private String sendEndTime; 
        private Integer sendPeriodDays; 
        private String sendPeriodType; 
        private String sendStartTime; 
        private String sendTime; 
        private String targetGroups; 
        private String targetUids; 
        private String title; 

        /**
         * The ID of the chart that is included in the report. Multiple IDs are separated by commas (,).
         */
        public Builder chartIds(String chartIds) {
            this.chartIds = chartIds;
            return this;
        }

        /**
         * The grouping type. Valid values:
         * <p>
         * 
         * *   **ALIYUN_RG**
         * *   **SAS_GROUP**
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * Indicates whether the report is the default report. Valid values:
         * <p>
         * 
         * *   **0**: no.
         * *   **1**: yes.
         */
        public Builder isDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * The time when the report is pinned.
         */
        public Builder pinnedTime(Long pinnedTime) {
            this.pinnedTime = pinnedTime;
            return this;
        }

        /**
         * The email address of the recipient. Multiple email addresses are separated by commas (,).
         */
        public Builder recipients(String recipients) {
            this.recipients = recipients;
            return this;
        }

        /**
         * The most recent days for report statistics.
         */
        public Builder reportDays(Integer reportDays) {
            this.reportDays = reportDays;
            return this;
        }

        /**
         * The end date on which the report is sent.
         */
        public Builder reportEndDate(String reportEndDate) {
            this.reportEndDate = reportEndDate;
            return this;
        }

        /**
         * The ID of the report.
         */
        public Builder reportId(Long reportId) {
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
        public Builder reportSendType(String reportSendType) {
            this.reportSendType = reportSendType;
            return this;
        }

        /**
         * The start date on which the report is sent.
         */
        public Builder reportStartDate(String reportStartDate) {
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
        public Builder reportStatus(String reportStatus) {
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
         * *   **3**: report whose statistics are collected in a custom time range.
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The end time at which the report is sent. The value is in the HH:mm:ss format.
         */
        public Builder sendEndTime(String sendEndTime) {
            this.sendEndTime = sendEndTime;
            return this;
        }

        /**
         * The exact day within the sending period.
         */
        public Builder sendPeriodDays(Integer sendPeriodDays) {
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
         */
        public Builder sendPeriodType(String sendPeriodType) {
            this.sendPeriodType = sendPeriodType;
            return this;
        }

        /**
         * The start time at which the report is sent. The value is in the HH:mm:ss format.
         */
        public Builder sendStartTime(String sendStartTime) {
            this.sendStartTime = sendStartTime;
            return this;
        }

        /**
         * The time at which the report is sent. The value is in the HH:mm:ss format.
         */
        public Builder sendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }

        /**
         * The groups.
         */
        public Builder targetGroups(String targetGroups) {
            this.targetGroups = targetGroups;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account. Multiple IDs are separated by commas (,).
         */
        public Builder targetUids(String targetUids) {
            this.targetUids = targetUids;
            return this;
        }

        /**
         * The title of the report.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public DescribeCustomizeReportConfigDetailResponseBody build() {
            return new DescribeCustomizeReportConfigDetailResponseBody(this);
        } 

    } 

}
