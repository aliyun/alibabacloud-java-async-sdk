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
 * {@link DescribeAvailableAdvicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableAdvicesResponseBody</p>
 */
public class DescribeAvailableAdvicesResponseBody extends TeaModel {
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

    private DescribeAvailableAdvicesResponseBody(Builder builder) {
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

    public static DescribeAvailableAdvicesResponseBody create() {
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

        private Builder() {
        } 

        private Builder(DescribeAvailableAdvicesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.schemaTableNames = model.schemaTableNames;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried suggestions.</p>
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
         * <li><strong>30</strong> (default)</li>
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
         * <p>96A55627-28E9-5E47-B8F6-D786BE551349</p>
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
         * <p>10192</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAvailableAdvicesResponseBody build() {
            return new DescribeAvailableAdvicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableAdvicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableAdvicesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdviceDate")
        private String adviceDate;

        @com.aliyun.core.annotation.NameInMap("AdviceId")
        private String adviceId;

        @com.aliyun.core.annotation.NameInMap("AdviceType")
        private String adviceType;

        @com.aliyun.core.annotation.NameInMap("Benefit")
        private String benefit;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("SQL")
        private String SQL;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Items(Builder builder) {
            this.adviceDate = builder.adviceDate;
            this.adviceId = builder.adviceId;
            this.adviceType = builder.adviceType;
            this.benefit = builder.benefit;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.reason = builder.reason;
            this.SQL = builder.SQL;
            this.schemaName = builder.schemaName;
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
         * @return adviceDate
         */
        public String getAdviceDate() {
            return this.adviceDate;
        }

        /**
         * @return adviceId
         */
        public String getAdviceId() {
            return this.adviceId;
        }

        /**
         * @return adviceType
         */
        public String getAdviceType() {
            return this.adviceType;
        }

        /**
         * @return benefit
         */
        public String getBenefit() {
            return this.benefit;
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
            private String adviceDate; 
            private String adviceId; 
            private String adviceType; 
            private String benefit; 
            private Long pageNumber; 
            private Long pageSize; 
            private String reason; 
            private String SQL; 
            private String schemaName; 
            private String tableName; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.adviceDate = model.adviceDate;
                this.adviceId = model.adviceId;
                this.adviceType = model.adviceType;
                this.benefit = model.benefit;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.reason = model.reason;
                this.SQL = model.SQL;
                this.schemaName = model.schemaName;
                this.tableName = model.tableName;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The date when the suggestion is generated. The date is in the yyyyMMdd format.</p>
             * 
             * <strong>example:</strong>
             * <p>20221124</p>
             */
            public Builder adviceDate(String adviceDate) {
                this.adviceDate = adviceDate;
                return this;
            }

            /**
             * <p>The suggestion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dcd04135-0925-4aed-a5a7-e7d92cb1****</p>
             */
            public Builder adviceId(String adviceId) {
                this.adviceId = adviceId;
                return this;
            }

            /**
             * <p>The type of the suggestion. Valid values:</p>
             * <ul>
             * <li><strong>INDEX</strong>: index optimization.</li>
             * <li><strong>TIERING</strong>: hot and cold data optimization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INDEX</p>
             */
            public Builder adviceType(String adviceType) {
                this.adviceType = adviceType;
                return this;
            }

            /**
             * <p>The benefit of the suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4 GB of storage saved</p>
             */
            public Builder benefit(String benefit) {
                this.benefit = benefit;
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
             * <li><strong>30</strong> (default)</li>
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
             * <p>The reason why the suggestion was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>Unused for 15 days, historical usage less than 1%</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10192</p>
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
