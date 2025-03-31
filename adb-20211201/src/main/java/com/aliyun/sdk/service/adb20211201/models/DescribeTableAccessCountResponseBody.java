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
 * {@link DescribeTableAccessCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableAccessCountResponseBody</p>
 */
public class DescribeTableAccessCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTableAccessCountResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableAccessCountResponseBody create() {
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTableAccessCountResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried tables.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B7D627B-DA23-572D-AD71-256F64698B7D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTableAccessCountResponseBody build() {
            return new DescribeTableAccessCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTableAccessCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTableAccessCountResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessCount")
        private String accessCount;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("ReportDate")
        private String reportDate;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableSchema")
        private String tableSchema;

        private Items(Builder builder) {
            this.accessCount = builder.accessCount;
            this.instanceName = builder.instanceName;
            this.reportDate = builder.reportDate;
            this.tableName = builder.tableName;
            this.tableSchema = builder.tableSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accessCount
         */
        public String getAccessCount() {
            return this.accessCount;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return reportDate
         */
        public String getReportDate() {
            return this.reportDate;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableSchema
         */
        public String getTableSchema() {
            return this.tableSchema;
        }

        public static final class Builder {
            private String accessCount; 
            private String instanceName; 
            private String reportDate; 
            private String tableName; 
            private String tableSchema; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accessCount = model.accessCount;
                this.instanceName = model.instanceName;
                this.reportDate = model.reportDate;
                this.tableName = model.tableName;
                this.tableSchema = model.tableSchema;
            } 

            /**
             * <p>The number of accesses to the table.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder accessCount(String accessCount) {
                this.accessCount = accessCount;
                return this;
            }

            /**
             * <p>The ID of the cluster to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-2ze627uzpkh8a8****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The date when the table was accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-26</p>
             */
            public Builder reportDate(String reportDate) {
                this.reportDate = reportDate;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMER</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The database to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>tpch</p>
             */
            public Builder tableSchema(String tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
