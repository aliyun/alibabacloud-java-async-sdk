// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The ID of the chart that is included in the report. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>BIZ_STAT_QUERY_KEY_ATTACK,CUSTOM_VUL_CVE_LIST,CUSTOM_VUL_SYS_LIST,CUSTOM_VUL_WEBCMS_LIST,CUSTOM_AUTO_BREAKING_PIE,CUSTOM_AK_LEAK_LIST,KEY_HP_TAMPERPROOF,KEY_HP_DEFENCE</p>
         */
        public Builder chartIds(String chartIds) {
            this.chartIds = chartIds;
            return this;
        }

        /**
         * <p>The grouping type. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN_RG</strong></li>
         * <li><strong>SAS_GROUP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SAS_GROUP</p>
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>Indicates whether the report is the default report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The time when the report is pinned.</p>
         * 
         * <strong>example:</strong>
         * <p>1717430400000</p>
         */
        public Builder pinnedTime(Long pinnedTime) {
            this.pinnedTime = pinnedTime;
            return this;
        }

        /**
         * <p>The email address of the recipient. Multiple email addresses are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:PengZheng@eaton.com">PengZheng@eaton.com</a>,<a href="mailto:ZhongJi@Eaton.com">ZhongJi@Eaton.com</a></p>
         */
        public Builder recipients(String recipients) {
            this.recipients = recipients;
            return this;
        }

        /**
         * <p>The most recent days for report statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder reportDays(Integer reportDays) {
            this.reportDays = reportDays;
            return this;
        }

        /**
         * <p>The end date on which the report is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>1720022399999</p>
         */
        public Builder reportEndDate(String reportEndDate) {
            this.reportEndDate = reportEndDate;
            return this;
        }

        /**
         * <p>The ID of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>663434</p>
         */
        public Builder reportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The language of the report. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder reportLang(String reportLang) {
            this.reportLang = reportLang;
            return this;
        }

        /**
         * <p>The time range in which the report is sent. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: 00:00 to 06:00.</li>
         * <li><strong>2</strong>: 06:00 to 12:00.</li>
         * <li><strong>3</strong>: 12:00 to 18:00.</li>
         * <li><strong>4</strong>: 18:00 to 24:00.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder reportSendType(String reportSendType) {
            this.reportSendType = reportSendType;
            return this;
        }

        /**
         * <p>The start date on which the report is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>1717430400000</p>
         */
        public Builder reportStartDate(String reportStartDate) {
            this.reportStartDate = reportStartDate;
            return this;
        }

        /**
         * <p>The status of the report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }

        /**
         * <p>The type of the report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: daily report.</li>
         * <li><strong>1</strong>: weekly report.</li>
         * <li><strong>2</strong>: monthly report.</li>
         * <li><strong>3</strong>: report whose statistics are collected in a custom time range.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>379a9b8f-107b-4630-9e95-2299a1ea****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The end time at which the report is sent. The value is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00:00</p>
         */
        public Builder sendEndTime(String sendEndTime) {
            this.sendEndTime = sendEndTime;
            return this;
        }

        /**
         * <p>The exact day within the sending period.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder sendPeriodDays(Integer sendPeriodDays) {
            this.sendPeriodDays = sendPeriodDays;
            return this;
        }

        /**
         * <p>The interval at which the report is sent. Valid values:</p>
         * <ul>
         * <li><strong>DAY</strong></li>
         * <li><strong>WEEK</strong></li>
         * <li><strong>MONTH</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MONTH</p>
         */
        public Builder sendPeriodType(String sendPeriodType) {
            this.sendPeriodType = sendPeriodType;
            return this;
        }

        /**
         * <p>The start time at which the report is sent. The value is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        public Builder sendStartTime(String sendStartTime) {
            this.sendStartTime = sendStartTime;
            return this;
        }

        /**
         * <p>The time at which the report is sent. The value is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        public Builder sendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }

        /**
         * <p>The groups.</p>
         * 
         * <strong>example:</strong>
         * <p>12125884,12140191</p>
         */
        public Builder targetGroups(String targetGroups) {
            this.targetGroups = targetGroups;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1457515594445744,1600011353839072,1766185894104675,1674080148055995,1627510829033157</p>
         */
        public Builder targetUids(String targetUids) {
            this.targetUids = targetUids;
            return this;
        }

        /**
         * <p>The title of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>marketing report</p>
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
