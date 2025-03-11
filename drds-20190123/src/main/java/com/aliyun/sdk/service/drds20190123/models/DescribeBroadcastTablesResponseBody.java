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
 * {@link DescribeBroadcastTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBroadcastTablesResponseBody</p>
 */
public class DescribeBroadcastTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsShard")
    private Boolean isShard;

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

    private DescribeBroadcastTablesResponseBody(Builder builder) {
        this.isShard = builder.isShard;
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

    public static DescribeBroadcastTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return isShard
     */
    public Boolean getIsShard() {
        return this.isShard;
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
        private Boolean isShard; 
        private java.util.List<List> list; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * <p>Indicates whether the database is sharded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }

        /**
         * <p>Indicates information about broadcast tables.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>Indicates the page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Indicates the number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>86E420ED-43F2-4788-A58C-921849******</p>
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
         * <p>Indicates the total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeBroadcastTablesResponseBody build() {
            return new DescribeBroadcastTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBroadcastTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBroadcastTablesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Broadcast")
        private Boolean broadcast;

        @com.aliyun.core.annotation.NameInMap("BroadcastType")
        private String broadcastType;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private Integer dbInstType;

        @com.aliyun.core.annotation.NameInMap("IsShard")
        private Boolean isShard;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        private List(Builder builder) {
            this.broadcast = builder.broadcast;
            this.broadcastType = builder.broadcastType;
            this.dbInstType = builder.dbInstType;
            this.isShard = builder.isShard;
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
         * @return broadcast
         */
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        /**
         * @return broadcastType
         */
        public String getBroadcastType() {
            return this.broadcastType;
        }

        /**
         * @return dbInstType
         */
        public Integer getDbInstType() {
            return this.dbInstType;
        }

        /**
         * @return isShard
         */
        public Boolean getIsShard() {
            return this.isShard;
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
            private Boolean broadcast; 
            private String broadcastType; 
            private Integer dbInstType; 
            private Boolean isShard; 
            private Integer status; 
            private String table; 

            /**
             * <p>Indicates whether a table is a broadcast table.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder broadcast(Boolean broadcast) {
                this.broadcast = broadcast;
                return this;
            }

            /**
             * <p>Indicates the type of the broadcast table. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: multi-write mode</li>
             * <li><strong>2</strong>: synchronous mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder broadcastType(String broadcastType) {
                this.broadcastType = broadcastType;
                return this;
            }

            /**
             * <p>Indicates the storage type of the database. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: RDS</li>
             * <li><strong>4</strong>: PolarDB</li>
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
             * <p>Indicates whether the broadcast table was sharded.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isShard(Boolean isShard) {
                this.isShard = isShard;
                return this;
            }

            /**
             * <p>Indicates the activation state of the broadcast table. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The broadcast table is activated.</li>
             * <li><strong>2</strong>: The broadcast table is being activated.</li>
             * <li><strong>3</strong>: An exception occurs when the broadcast table is being activated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates the name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>nation</p>
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
