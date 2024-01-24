// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBroadcastTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBroadcastTablesResponseBody</p>
 */
public class DescribeBroadcastTablesResponseBody extends TeaModel {
    @NameInMap("IsShard")
    private Boolean isShard;

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
        private Boolean isShard; 
        private java.util.List < List> list; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Indicates whether the database is sharded.
         */
        public Builder isShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }

        /**
         * Indicates information about broadcast tables.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * Indicates the page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Indicates the number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates the ID of the request.
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
         * Indicates the total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeBroadcastTablesResponseBody build() {
            return new DescribeBroadcastTablesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Broadcast")
        private Boolean broadcast;

        @NameInMap("BroadcastType")
        private String broadcastType;

        @NameInMap("DbInstType")
        private Integer dbInstType;

        @NameInMap("IsShard")
        private Boolean isShard;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Table")
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
             * Indicates whether a table is a broadcast table.
             */
            public Builder broadcast(Boolean broadcast) {
                this.broadcast = broadcast;
                return this;
            }

            /**
             * Indicates the type of the broadcast table. Valid values:
             * <p>
             * 
             * *   **1**: multi-write mode
             * *   **2**: synchronous mode
             */
            public Builder broadcastType(String broadcastType) {
                this.broadcastType = broadcastType;
                return this;
            }

            /**
             * Indicates the storage type of the database. Valid values:
             * <p>
             * 
             * *   **0**: RDS
             * *   **4**: PolarDB
             */
            public Builder dbInstType(Integer dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * Indicates whether the broadcast table was sharded.
             */
            public Builder isShard(Boolean isShard) {
                this.isShard = isShard;
                return this;
            }

            /**
             * Indicates the activation state of the broadcast table. Valid values:
             * <p>
             * 
             * *   **1**: The broadcast table is activated.
             * *   **2**: The broadcast table is being activated.
             * *   **3**: An exception occurs when the broadcast table is being activated.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates the name of the table.
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
