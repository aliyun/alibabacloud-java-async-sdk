// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableAccessCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableAccessCountResponseBody</p>
 */
public class DescribeTableAccessCountResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried tables.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTableAccessCountResponseBody build() {
            return new DescribeTableAccessCountResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AccessCount")
        private String accessCount;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("ReportDate")
        private String reportDate;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TableSchema")
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

            /**
             * The number of accesses to the table.
             */
            public Builder accessCount(String accessCount) {
                this.accessCount = accessCount;
                return this;
            }

            /**
             * The ID of the cluster to which the table belongs.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The date when the table was accessed.
             */
            public Builder reportDate(String reportDate) {
                this.reportDate = reportDate;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The database to which the table belongs.
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
