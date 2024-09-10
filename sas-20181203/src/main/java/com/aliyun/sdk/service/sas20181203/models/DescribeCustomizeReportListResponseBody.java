// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizeReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizeReportListResponseBody</p>
 */
public class DescribeCustomizeReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportList")
    private java.util.List < ReportList> reportList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustomizeReportListResponseBody(Builder builder) {
        this.reportList = builder.reportList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeReportListResponseBody create() {
        return builder().build();
    }

    /**
     * @return reportList
     */
    public java.util.List < ReportList> getReportList() {
        return this.reportList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ReportList> reportList; 
        private String requestId; 

        /**
         * The reports.
         */
        public Builder reportList(java.util.List < ReportList> reportList) {
            this.reportList = reportList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomizeReportListResponseBody build() {
            return new DescribeCustomizeReportListResponseBody(this);
        } 

    } 

    public static class ReportList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("PinnedTime")
        private Long pinnedTime;

        @com.aliyun.core.annotation.NameInMap("ReportDays")
        private Integer reportDays;

        @com.aliyun.core.annotation.NameInMap("ReportEndDate")
        private Long reportEndDate;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private Long reportId;

        @com.aliyun.core.annotation.NameInMap("ReportStartDate")
        private Long reportStartDate;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private String reportStatus;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private Integer reportType;

        @com.aliyun.core.annotation.NameInMap("ReportVersion")
        private String reportVersion;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ReportList(Builder builder) {
            this.isDefault = builder.isDefault;
            this.pinnedTime = builder.pinnedTime;
            this.reportDays = builder.reportDays;
            this.reportEndDate = builder.reportEndDate;
            this.reportId = builder.reportId;
            this.reportStartDate = builder.reportStartDate;
            this.reportStatus = builder.reportStatus;
            this.reportType = builder.reportType;
            this.reportVersion = builder.reportVersion;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportList create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return pinnedTime
         */
        public Long getPinnedTime() {
            return this.pinnedTime;
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
        public Long getReportEndDate() {
            return this.reportEndDate;
        }

        /**
         * @return reportId
         */
        public Long getReportId() {
            return this.reportId;
        }

        /**
         * @return reportStartDate
         */
        public Long getReportStartDate() {
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String isDefault; 
            private Long pinnedTime; 
            private Integer reportDays; 
            private Long reportEndDate; 
            private Long reportId; 
            private Long reportStartDate; 
            private String reportStatus; 
            private Integer reportType; 
            private String reportVersion; 
            private String title; 

            /**
             * Indicates whether the report is the default report. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The timestamp when the report is pinned. Unit: milliseconds.
             */
            public Builder pinnedTime(Long pinnedTime) {
                this.pinnedTime = pinnedTime;
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
             * The end date on which the report is sent. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder reportEndDate(Long reportEndDate) {
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
             * The start date on which the report is sent. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder reportStartDate(Long reportStartDate) {
                this.reportStartDate = reportStartDate;
                return this;
            }

            /**
             * The state of the report. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: enabled
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * The type of the report. Valid values:
             * <p>
             * 
             * *   **0**: daily report
             * *   **1**: weekly report
             * *   **2**: monthly report
             * *   **3**: report whose statistics are collected in a custom time range
             */
            public Builder reportType(Integer reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * The report version.
             */
            public Builder reportVersion(String reportVersion) {
                this.reportVersion = reportVersion;
                return this;
            }

            /**
             * The name of the report.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ReportList build() {
                return new ReportList(this);
            } 

        } 

    }
}
