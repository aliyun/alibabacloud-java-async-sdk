// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTablesResponseBody</p>
 */
public class DescribeTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
    public java.util.List<List> getList() {
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
        private java.util.List<List> list; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * <p>The list of returned tables.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of tables returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>83AC3D7E-461C-4D87-8ACD-6CC295******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned tables.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeTablesResponseBody build() {
            return new DescribeTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTablesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowFullTableScan")
        private Boolean allowFullTableScan;

        @com.aliyun.core.annotation.NameInMap("Broadcast")
        private Boolean broadcast;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private Integer dbInstType;

        @com.aliyun.core.annotation.NameInMap("IsLocked")
        private Boolean isLocked;

        @com.aliyun.core.annotation.NameInMap("IsShard")
        private Boolean isShard;

        @com.aliyun.core.annotation.NameInMap("ShardKey")
        private String shardKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Table")
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
             * <p>Indicates whether full table scanning is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowFullTableScan(Boolean allowFullTableScan) {
                this.allowFullTableScan = allowFullTableScan;
                return this;
            }

            /**
             * <p>Indicates whether the table is a replicated table.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder broadcast(Boolean broadcast) {
                this.broadcast = broadcast;
                return this;
            }

            /**
             * <p>The type of the PolarDB-X 1.0 instance. Valid values:</p>
             * <ul>
             * <li>0: The instance is a dedicated instance.</li>
             * <li>1: The instance is a shard instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dbInstType(Integer dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * <p>Indicates whether the table is locked.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isLocked(Boolean isLocked) {
                this.isLocked = isLocked;
                return this;
            }

            /**
             * <p>Indicates whether the table is sharded.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isShard(Boolean isShard) {
                this.isShard = isShard;
                return this;
            }

            /**
             * <p>The shard key of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder shardKey(String shardKey) {
                this.shardKey = shardKey;
                return this;
            }

            /**
             * <p>Indicates whether sharding tasks are performed on the table. Valid values:</p>
             * <ul>
             * <li>0: No sharding task is performed on the table.</li>
             * <li>1: Sharding tasks are performed on the table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
