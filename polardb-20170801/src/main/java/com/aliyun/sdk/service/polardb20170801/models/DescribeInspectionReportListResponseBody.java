// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeInspectionReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInspectionReportListResponseBody</p>
 */
public class DescribeInspectionReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("ReportItems")
    private java.util.List<ReportItems> reportItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Integer score;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInspectionReportListResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reportItems = builder.reportItems;
        this.requestId = builder.requestId;
        this.score = builder.score;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionReportListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reportItems
     */
    public java.util.List<ReportItems> getReportItems() {
        return this.reportItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return this.score;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<ReportItems> reportItems; 
        private String requestId; 
        private Integer score; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeInspectionReportListResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.reportItems = model.reportItems;
            this.requestId = model.requestId;
            this.score = model.score;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of inspection reports.</p>
         */
        public Builder reportItems(java.util.List<ReportItems> reportItems) {
            this.reportItems = reportItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The score returned by the inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder score(Integer score) {
            this.score = score;
            return this;
        }

        /**
         * <p>The total number of reports that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInspectionReportListResponseBody build() {
            return new DescribeInspectionReportListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInspectionReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInspectionReportListResponseBody</p>
     */
    public static class SubItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Long critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        private Long info;

        @com.aliyun.core.annotation.NameInMap("Normal")
        private Long normal;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private Long warning;

        private SubItems(Builder builder) {
            this.critical = builder.critical;
            this.info = builder.info;
            this.normal = builder.normal;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubItems create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Long getCritical() {
            return this.critical;
        }

        /**
         * @return info
         */
        public Long getInfo() {
            return this.info;
        }

        /**
         * @return normal
         */
        public Long getNormal() {
            return this.normal;
        }

        /**
         * @return warning
         */
        public Long getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private Long critical; 
            private Long info; 
            private Long normal; 
            private Long warning; 

            private Builder() {
            } 

            private Builder(SubItems model) {
                this.critical = model.critical;
                this.info = model.info;
                this.normal = model.normal;
                this.warning = model.warning;
            } 

            /**
             * <p>The number of check items at the Critical level.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder critical(Long critical) {
                this.critical = critical;
                return this;
            }

            /**
             * <p>The number of check items at the Info level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder info(Long info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The number of check items at the Normal level.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder normal(Long normal) {
                this.normal = normal;
                return this;
            }

            /**
             * <p>The number of check items at the Warning level.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder warning(Long warning) {
                this.warning = warning;
                return this;
            }

            public SubItems build() {
                return new SubItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInspectionReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInspectionReportListResponseBody</p>
     */
    public static class ReportItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("Latest")
        private String latest;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReportDescription")
        private String reportDescription;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("ReportScore")
        private Long reportScore;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private String reportStatus;

        @com.aliyun.core.annotation.NameInMap("ReportSummary")
        private String reportSummary;

        @com.aliyun.core.annotation.NameInMap("ReportTime")
        private String reportTime;

        @com.aliyun.core.annotation.NameInMap("SubItems")
        private java.util.List<SubItems> subItems;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private ReportItems(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.latest = builder.latest;
            this.regionId = builder.regionId;
            this.reportDescription = builder.reportDescription;
            this.reportId = builder.reportId;
            this.reportScore = builder.reportScore;
            this.reportStatus = builder.reportStatus;
            this.reportSummary = builder.reportSummary;
            this.reportTime = builder.reportTime;
            this.subItems = builder.subItems;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportItems create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return latest
         */
        public String getLatest() {
            return this.latest;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reportDescription
         */
        public String getReportDescription() {
            return this.reportDescription;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportScore
         */
        public Long getReportScore() {
            return this.reportScore;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        /**
         * @return reportSummary
         */
        public String getReportSummary() {
            return this.reportSummary;
        }

        /**
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
        }

        /**
         * @return subItems
         */
        public java.util.List<SubItems> getSubItems() {
            return this.subItems;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String latest; 
            private String regionId; 
            private String reportDescription; 
            private String reportId; 
            private Long reportScore; 
            private String reportStatus; 
            private String reportSummary; 
            private String reportTime; 
            private java.util.List<SubItems> subItems; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(ReportItems model) {
                this.DBClusterId = model.DBClusterId;
                this.latest = model.latest;
                this.regionId = model.regionId;
                this.reportDescription = model.reportDescription;
                this.reportId = model.reportId;
                this.reportScore = model.reportScore;
                this.reportStatus = model.reportStatus;
                this.reportSummary = model.reportSummary;
                this.reportTime = model.reportTime;
                this.subItems = model.subItems;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The ID of the inspected PolarDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-**************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>Indicates whether this is the latest inspection report. The value is returned as a string.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder latest(String latest) {
                this.latest = latest;
                return this;
            }

            /**
             * <p>The region ID of the inspected cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The detailed description of the inspection report.</p>
             * 
             * <strong>example:</strong>
             * <p>No critical risks were found in this inspection</p>
             */
            public Builder reportDescription(String reportDescription) {
                this.reportDescription = reportDescription;
                return this;
            }

            /**
             * <p>The ID of the inspection report.</p>
             * 
             * <strong>example:</strong>
             * <p>report-001</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The score of the inspection report.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder reportScore(Long reportScore) {
                this.reportScore = reportScore;
                return this;
            }

            /**
             * <p>The status of the inspection report.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The summary of the inspection report.</p>
             * 
             * <strong>example:</strong>
             * <p>The instance is running normally</p>
             */
            public Builder reportSummary(String reportSummary) {
                this.reportSummary = reportSummary;
                return this;
            }

            /**
             * <p>The time when the inspection report was generated. The time is in the yyyy-MM-dd HH:mm:ss format and is in the UTC+8 time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05 16:00:00</p>
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * <p>The number of check items categorized by inspection result level.</p>
             */
            public Builder subItems(java.util.List<SubItems> subItems) {
                this.subItems = subItems;
                return this;
            }

            /**
             * <p>The ID of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-001</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ReportItems build() {
                return new ReportItems(this);
            } 

        } 

    }
}
