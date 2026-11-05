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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ReportItems.
         */
        public Builder reportItems(java.util.List<ReportItems> reportItems) {
            this.reportItems = reportItems;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Integer score) {
            this.score = score;
            return this;
        }

        /**
         * TotalCount.
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
             * Critical.
             */
            public Builder critical(Long critical) {
                this.critical = critical;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(Long info) {
                this.info = info;
                return this;
            }

            /**
             * Normal.
             */
            public Builder normal(Long normal) {
                this.normal = normal;
                return this;
            }

            /**
             * Warning.
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
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * Latest.
             */
            public Builder latest(String latest) {
                this.latest = latest;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReportDescription.
             */
            public Builder reportDescription(String reportDescription) {
                this.reportDescription = reportDescription;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * ReportScore.
             */
            public Builder reportScore(Long reportScore) {
                this.reportScore = reportScore;
                return this;
            }

            /**
             * ReportStatus.
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * ReportSummary.
             */
            public Builder reportSummary(String reportSummary) {
                this.reportSummary = reportSummary;
                return this;
            }

            /**
             * ReportTime.
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * SubItems.
             */
            public Builder subItems(java.util.List<SubItems> subItems) {
                this.subItems = subItems;
                return this;
            }

            /**
             * TaskId.
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
