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
         * <p>The queried applied optimization suggestions.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong>(Default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>84489769-3065-5A28-A4CB-977CD426F1C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the table in the DatabaseName.TableName format.</p>
         */
        public Builder schemaTableNames(java.util.List<String> schemaTableNames) {
            this.schemaTableNames = schemaTableNames;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The suggestion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7417db9c-914d-43f3-a123-4d0e448f****</p>
             */
            public Builder adviceId(String adviceId) {
                this.adviceId = adviceId;
                return this;
            }

            /**
             * <p>The benefit of the suggestion.</p>
             */
            public Builder benefit(String benefit) {
                this.benefit = benefit;
                return this;
            }

            /**
             * <p>The SQL statement that is used to execute the BUILD job.</p>
             * 
             * <strong>example:</strong>
             * <p>build table <code>schema1</code>.<code>table1</code></p>
             */
            public Builder buildSQL(String buildSQL) {
                this.buildSQL = buildSQL;
                return this;
            }

            /**
             * <p>The status of the suggestion execution job. Valid values:</p>
             * <ul>
             * <li><strong>SUCCEED</strong></li>
             * <li><strong>FAILED</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The page number. Pages start from page 1. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Valid values:</p>
             * <ul>
             * <li><strong>30</strong>(Default)</li>
             * <li><strong>50</strong></li>
             * <li><strong>100</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The SQL statement that is used to roll back the suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>alter table <code>schema1</code>.<code>table1</code> add key col1_1_idx(col1)</p>
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * <p>The SQL statement that is used to apply the suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>alter table <code>schema1</code>.<code>table1</code> drop key col1_1_idx</p>
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_demo</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The submission status of the suggestion. Valid values:</p>
             * <ul>
             * <li><strong>SUCCEED</strong></li>
             * <li><strong>FAILED</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder submitStatus(String submitStatus) {
                this.submitStatus = submitStatus;
                return this;
            }

            /**
             * <p>The time when the suggestion was submitted. The time follows the ISO 8601 standard in the yyMMddHHmm format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2208131600</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
