// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppliedAdvicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppliedAdvicesResponseBody</p>
 */
public class DescribeAppliedAdvicesResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAppliedAdvicesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppliedAdvicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The queried suggestions.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned. The value is an integer that is greater than or equal to 0. Default value: 0.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAppliedAdvicesResponseBody build() {
            return new DescribeAppliedAdvicesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AdviceId")
        private String adviceId;

        @NameInMap("Benefit")
        private String benefit;

        @NameInMap("BuildSQL")
        private String buildSQL;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("RollbackSQL")
        private String rollbackSQL;

        @NameInMap("SQL")
        private String SQL;

        @NameInMap("SubmitStatus")
        private String submitStatus;

        @NameInMap("SubmitTime")
        private String submitTime;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Items(Builder builder) {
            this.adviceId = builder.adviceId;
            this.benefit = builder.benefit;
            this.buildSQL = builder.buildSQL;
            this.jobStatus = builder.jobStatus;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.rollbackSQL = builder.rollbackSQL;
            this.SQL = builder.SQL;
            this.submitStatus = builder.submitStatus;
            this.submitTime = builder.submitTime;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return adviceId
         */
        public String getAdviceId() {
            return this.adviceId;
        }

        /**
         * @return benefit
         */
        public String getBenefit() {
            return this.benefit;
        }

        /**
         * @return buildSQL
         */
        public String getBuildSQL() {
            return this.buildSQL;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
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
         * @return rollbackSQL
         */
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        /**
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        /**
         * @return submitStatus
         */
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String adviceId; 
            private String benefit; 
            private String buildSQL; 
            private String jobStatus; 
            private Long pageNumber; 
            private Long pageSize; 
            private String rollbackSQL; 
            private String SQL; 
            private String submitStatus; 
            private String submitTime; 
            private Long totalCount; 

            /**
             * The suggestion ID.
             */
            public Builder adviceId(String adviceId) {
                this.adviceId = adviceId;
                return this;
            }

            /**
             * The benefit of the suggestion.
             */
            public Builder benefit(String benefit) {
                this.benefit = benefit;
                return this;
            }

            /**
             * The SQL statement that is used to execute the BUILD job.
             */
            public Builder buildSQL(String buildSQL) {
                this.buildSQL = buildSQL;
                return this;
            }

            /**
             * The state of the suggestion execution job. Valid values:
             * <p>
             * 
             * *   **SUCCEED**
             * *   **FAILED**
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * The page number. Pages start from 1. Default value: 1.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page. Valid values:
             * <p>
             * 
             * *   **30** (default)
             * *   **50**
             * *   **100**
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The SQL statement that is used to roll back the suggestion.
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * The SQL statement that is used to apply the suggestion.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * The submission state of the suggestion. Valid values:
             * <p>
             * 
             * *   **SUCCEED**
             * *   **FAILED**
             */
            public Builder submitStatus(String submitStatus) {
                this.submitStatus = submitStatus;
                return this;
            }

            /**
             * The time when the suggestion was submitted. The time follows the ISO 8601 standard in the yyMMddHHmm format. The time is displayed in UTC.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * The total number of entries returned. Minimum value: 0. Default value: 0.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
