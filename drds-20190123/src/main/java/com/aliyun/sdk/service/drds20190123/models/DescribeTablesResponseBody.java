// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTablesResponseBody</p>
 */
public class DescribeTablesResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeTablesResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The list of returned tables.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The number of returned pages.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of tables returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned tables.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeTablesResponseBody build() {
            return new DescribeTablesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AllowFullTableScan")
        private Boolean allowFullTableScan;

        @NameInMap("Broadcast")
        private Boolean broadcast;

        @NameInMap("DbInstType")
        private Integer dbInstType;

        @NameInMap("IsLocked")
        private Boolean isLocked;

        @NameInMap("IsShard")
        private Boolean isShard;

        @NameInMap("ShardKey")
        private String shardKey;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Table")
        private String table;

        private List(Builder builder) {
            this.allowFullTableScan = builder.allowFullTableScan;
            this.broadcast = builder.broadcast;
            this.dbInstType = builder.dbInstType;
            this.isLocked = builder.isLocked;
            this.isShard = builder.isShard;
            this.shardKey = builder.shardKey;
            this.status = builder.status;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return allowFullTableScan
         */
        public Boolean getAllowFullTableScan() {
            return this.allowFullTableScan;
        }

        /**
         * @return broadcast
         */
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        /**
         * @return dbInstType
         */
        public Integer getDbInstType() {
            return this.dbInstType;
        }

        /**
         * @return isLocked
         */
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        /**
         * @return isShard
         */
        public Boolean getIsShard() {
            return this.isShard;
        }

        /**
         * @return shardKey
         */
        public String getShardKey() {
            return this.shardKey;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private Boolean allowFullTableScan; 
            private Boolean broadcast; 
            private Integer dbInstType; 
            private Boolean isLocked; 
            private Boolean isShard; 
            private String shardKey; 
            private Integer status; 
            private String table; 

            /**
             * Indicates whether full table scanning is allowed.
             */
            public Builder allowFullTableScan(Boolean allowFullTableScan) {
                this.allowFullTableScan = allowFullTableScan;
                return this;
            }

            /**
             * Indicates whether the table is a replicated table.
             */
            public Builder broadcast(Boolean broadcast) {
                this.broadcast = broadcast;
                return this;
            }

            /**
             * The type of the PolarDB-X 1.0 instance. Valid values:
             * <p>
             * 
             * *   0: The instance is a dedicated instance.
             * *   1: The instance is a shard instance.
             */
            public Builder dbInstType(Integer dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * Indicates whether the table is locked.
             */
            public Builder isLocked(Boolean isLocked) {
                this.isLocked = isLocked;
                return this;
            }

            /**
             * Indicates whether the table is sharded.
             */
            public Builder isShard(Boolean isShard) {
                this.isShard = isShard;
                return this;
            }

            /**
             * The shard key of the table.
             */
            public Builder shardKey(String shardKey) {
                this.shardKey = shardKey;
                return this;
            }

            /**
             * Indicates whether sharding tasks are performed on the table. Valid values:
             * <p>
             * 
             * *   0: No sharding task is performed on the table.
             * *   1: Sharding tasks are performed on the table.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
