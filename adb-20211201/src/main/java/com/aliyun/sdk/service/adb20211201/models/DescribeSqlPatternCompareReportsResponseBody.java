// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeSqlPatternCompareReportsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlPatternCompareReportsResponseBody</p>
 */
public class DescribeSqlPatternCompareReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSqlPatternCompareReportsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlPatternCompareReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSqlPatternCompareReportsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of reports on the current page. An empty array is returned if no reports match the conditions.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of rows per page used in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. An empty value indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>djE6Mjo1MA</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number used in this query. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page used in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A1B2C3D-4E5F-6789-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of reports that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSqlPatternCompareReportsResponseBody build() {
            return new DescribeSqlPatternCompareReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlPatternCompareReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlPatternCompareReportsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancelAvailable")
        private Boolean cancelAvailable;

        @com.aliyun.core.annotation.NameInMap("CompareEndTime")
        private String compareEndTime;

        @com.aliyun.core.annotation.NameInMap("CompareStartTime")
        private String compareStartTime;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("DetailEnabled")
        private Boolean detailEnabled;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private Long reportId;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private String reportType;

        @com.aliyun.core.annotation.NameInMap("ReportTypeName")
        private String reportTypeName;

        @com.aliyun.core.annotation.NameInMap("RowNumber")
        private Integer rowNumber;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.cancelAvailable = builder.cancelAvailable;
            this.compareEndTime = builder.compareEndTime;
            this.compareStartTime = builder.compareStartTime;
            this.createdAt = builder.createdAt;
            this.detailEnabled = builder.detailEnabled;
            this.endTime = builder.endTime;
            this.reportId = builder.reportId;
            this.reportType = builder.reportType;
            this.reportTypeName = builder.reportTypeName;
            this.rowNumber = builder.rowNumber;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cancelAvailable
         */
        public Boolean getCancelAvailable() {
            return this.cancelAvailable;
        }

        /**
         * @return compareEndTime
         */
        public String getCompareEndTime() {
            return this.compareEndTime;
        }

        /**
         * @return compareStartTime
         */
        public String getCompareStartTime() {
            return this.compareStartTime;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return detailEnabled
         */
        public Boolean getDetailEnabled() {
            return this.detailEnabled;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return reportId
         */
        public Long getReportId() {
            return this.reportId;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        /**
         * @return reportTypeName
         */
        public String getReportTypeName() {
            return this.reportTypeName;
        }

        /**
         * @return rowNumber
         */
        public Integer getRowNumber() {
            return this.rowNumber;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean cancelAvailable; 
            private String compareEndTime; 
            private String compareStartTime; 
            private String createdAt; 
            private Boolean detailEnabled; 
            private String endTime; 
            private Long reportId; 
            private String reportType; 
            private String reportTypeName; 
            private Integer rowNumber; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cancelAvailable = model.cancelAvailable;
                this.compareEndTime = model.compareEndTime;
                this.compareStartTime = model.compareStartTime;
                this.createdAt = model.createdAt;
                this.detailEnabled = model.detailEnabled;
                this.endTime = model.endTime;
                this.reportId = model.reportId;
                this.reportType = model.reportType;
                this.reportTypeName = model.reportTypeName;
                this.rowNumber = model.rowNumber;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>Indicates whether the report can be canceled. The value is true when the report is in the PENDING or RUNNING state.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cancelAvailable(Boolean cancelAvailable) {
                this.cancelAvailable = cancelAvailable;
                return this;
            }

            /**
             * <p>The end time of time range 2. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-08T01:00Z</p>
             */
            public Builder compareEndTime(String compareEndTime) {
                this.compareEndTime = compareEndTime;
                return this;
            }

            /**
             * <p>The start time of time range 2. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-08T00:00Z</p>
             */
            public Builder compareStartTime(String compareStartTime) {
                this.compareStartTime = compareStartTime;
                return this;
            }

            /**
             * <p>The time when the report was created. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-08T01:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Indicates whether report details can be queried. The value is true when the report is in the SUCCESS state.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder detailEnabled(Boolean detailEnabled) {
                this.detailEnabled = detailEnabled;
                return this;
            }

            /**
             * <p>The end time of time range 1. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07T01:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the SQL Pattern comparison report.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder reportId(Long reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The report type. Valid values:</p>
             * <ul>
             * <li><code>NEW</code>: new patterns.</li>
             * <li><code>CHANGED</code>: patterns with increased metrics.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHANGED</p>
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * <p>The name of the report type.</p>
             * 
             * <strong>example:</strong>
             * <p>Changed Pattern Comparison Report</p>
             */
            public Builder reportTypeName(String reportTypeName) {
                this.reportTypeName = reportTypeName;
                return this;
            }

            /**
             * <p>The sequence number in the current sorted result. The value starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rowNumber(Integer rowNumber) {
                this.rowNumber = rowNumber;
                return this;
            }

            /**
             * <p>The start time of time range 1. The time is in the yyyy-MM-ddTHH:mmZ UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07T00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The report status. Valid values:</p>
             * <ul>
             * <li><code>PENDING</code>: waiting to be generated.</li>
             * <li><code>RUNNING</code>: being generated.</li>
             * <li><code>SUCCESS</code>: generated.</li>
             * <li><code>FAILED</code>: failed to be generated.</li>
             * <li><code>CANCELED</code>: canceled.</li>
             * <li><code>EXPIRED</code>: expired.</li>
             * </ul>
             * <blockquote>
             * <p>The current list returns only reports in the <code>PENDING</code>, <code>RUNNING</code>, or <code>SUCCESS</code> state.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
