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
 * {@link DescribeAppliedAdvicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppliedAdvicesResponseBody</p>
 */
public class DescribeAppliedAdvicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchemaTableNames")
    private java.util.List<String> schemaTableNames;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAppliedAdvicesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.schemaTableNames = builder.schemaTableNames;
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
    public java.util.List<Items> getItems() {
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
     * @return schemaTableNames
     */
    public java.util.List<String> getSchemaTableNames() {
        return this.schemaTableNames;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<String> schemaTableNames; 
        private Long totalCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SchemaTableNames.
         */
        public Builder schemaTableNames(java.util.List<String> schemaTableNames) {
            this.schemaTableNames = schemaTableNames;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAppliedAdvicesResponseBody build() {
            return new DescribeAppliedAdvicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppliedAdvicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppliedAdvicesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdviceId")
        private String adviceId;

        @com.aliyun.core.annotation.NameInMap("Benefit")
        private String benefit;

        @com.aliyun.core.annotation.NameInMap("BuildSQL")
        private String buildSQL;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("RollbackSQL")
        private String rollbackSQL;

        @com.aliyun.core.annotation.NameInMap("SQL")
        private String SQL;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SubmitStatus")
        private String submitStatus;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
            this.schemaName = builder.schemaName;
            this.submitStatus = builder.submitStatus;
            this.submitTime = builder.submitTime;
            this.tableName = builder.tableName;
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
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
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
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
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
            private String schemaName; 
            private String submitStatus; 
            private String submitTime; 
            private String tableName; 
            private Long totalCount; 

            /**
             * AdviceId.
             */
            public Builder adviceId(String adviceId) {
                this.adviceId = adviceId;
                return this;
            }

            /**
             * Benefit.
             */
            public Builder benefit(String benefit) {
                this.benefit = benefit;
                return this;
            }

            /**
             * BuildSQL.
             */
            public Builder buildSQL(String buildSQL) {
                this.buildSQL = buildSQL;
                return this;
            }

            /**
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
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
             * RollbackSQL.
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * SQL.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * SubmitStatus.
             */
            public Builder submitStatus(String submitStatus) {
                this.submitStatus = submitStatus;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TotalCount.
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
