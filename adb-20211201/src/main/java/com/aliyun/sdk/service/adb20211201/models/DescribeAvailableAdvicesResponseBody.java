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

            /**
             * AdviceDate.
             */
            public Builder adviceDate(String adviceDate) {
                this.adviceDate = adviceDate;
                return this;
            }

            /**
             * AdviceId.
             */
            public Builder adviceId(String adviceId) {
                this.adviceId = adviceId;
                return this;
            }

            /**
             * AdviceType.
             */
            public Builder adviceType(String adviceType) {
                this.adviceType = adviceType;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
