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
 * {@link DescribeCustomizeReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizeReportListResponseBody</p>
 */
public class DescribeCustomizeReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportList")
    private java.util.List<ReportList> reportList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportList
     */
    public java.util.List<ReportList> getReportList() {
        return this.reportList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ReportList> reportList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCustomizeReportListResponseBody model) {
            this.reportList = model.reportList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The reports.</p>
         */
        public Builder reportList(java.util.List<ReportList> reportList) {
            this.reportList = reportList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9FBC6E47-7508-58C9-9E76-528E118CB1CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomizeReportListResponseBody build() {
            return new DescribeCustomizeReportListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomizeReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomizeReportListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ReportList model) {
                this.isDefault = model.isDefault;
                this.pinnedTime = model.pinnedTime;
                this.reportDays = model.reportDays;
                this.reportEndDate = model.reportEndDate;
                this.reportId = model.reportId;
                this.reportStartDate = model.reportStartDate;
                this.reportStatus = model.reportStatus;
                this.reportType = model.reportType;
                this.reportVersion = model.reportVersion;
                this.title = model.title;
            } 

            /**
             * <p>Indicates whether the report is the default report. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The timestamp when the report is pinned. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1721836800000</p>
             */
            public Builder pinnedTime(Long pinnedTime) {
                this.pinnedTime = pinnedTime;
                return this;
            }

            /**
             * <p>The most recent days for report statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder reportDays(Integer reportDays) {
                this.reportDays = reportDays;
                return this;
            }

            /**
             * <p>The end date on which the report is sent. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1721923199999</p>
             */
            public Builder reportEndDate(Long reportEndDate) {
                this.reportEndDate = reportEndDate;
                return this;
            }

            /**
             * <p>The ID of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reportId(Long reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The start date on which the report is sent. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1721836800000</p>
             */
            public Builder reportStartDate(Long reportStartDate) {
                this.reportStartDate = reportStartDate;
                return this;
            }

            /**
             * <p>The state of the report. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The type of the report. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: daily report</li>
             * <li><strong>1</strong>: weekly report</li>
             * <li><strong>2</strong>: monthly report</li>
             * <li><strong>3</strong>: report whose statistics are collected in a custom time range</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reportType(Integer reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * <p>The report version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder reportVersion(String reportVersion) {
                this.reportVersion = reportVersion;
                return this;
            }

            /**
             * <p>The name of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
