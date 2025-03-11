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
 * {@link DescribeDrdsShardingDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsShardingDbsResponseBody</p>
 */
public class DescribeDrdsShardingDbsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShardingDbs")
    private ShardingDbs shardingDbs;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeDrdsShardingDbsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.shardingDbs = builder.shardingDbs;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsShardingDbsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shardingDbs
     */
    public ShardingDbs getShardingDbs() {
        return this.shardingDbs;
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
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private ShardingDbs shardingDbs; 
        private Boolean success; 
        private String total; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of database shards returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>509BDE17-505A-4B3B-854D-30D3F092502F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of returned database shards.</p>
         */
        public Builder shardingDbs(ShardingDbs shardingDbs) {
            this.shardingDbs = shardingDbs;
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
         * <p>The number of returned database shards.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsShardingDbsResponseBody build() {
            return new DescribeDrdsShardingDbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsShardingDbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsShardingDbsResponseBody</p>
     */
    public static class ShardingDb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockingTimeout")
        private Integer blockingTimeout;

        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
        private String connectionProperties;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbStatus")
        private String dbStatus;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IdleTimeOut")
        private Integer idleTimeOut;

        @com.aliyun.core.annotation.NameInMap("MaxPoolSize")
        private Integer maxPoolSize;

        @com.aliyun.core.annotation.NameInMap("MinPoolSize")
        private Integer minPoolSize;

        @com.aliyun.core.annotation.NameInMap("PreparedStatementCacheSize")
        private Integer preparedStatementCacheSize;

        @com.aliyun.core.annotation.NameInMap("ShardingDbName")
        private String shardingDbName;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private ShardingDb(Builder builder) {
            this.blockingTimeout = builder.blockingTimeout;
            this.connectUrl = builder.connectUrl;
            this.connectionProperties = builder.connectionProperties;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbStatus = builder.dbStatus;
            this.dbType = builder.dbType;
            this.groupName = builder.groupName;
            this.idleTimeOut = builder.idleTimeOut;
            this.maxPoolSize = builder.maxPoolSize;
            this.minPoolSize = builder.minPoolSize;
            this.preparedStatementCacheSize = builder.preparedStatementCacheSize;
            this.shardingDbName = builder.shardingDbName;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardingDb create() {
            return builder().build();
        }

        /**
         * @return blockingTimeout
         */
        public Integer getBlockingTimeout() {
            return this.blockingTimeout;
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
        }

        /**
         * @return connectionProperties
         */
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return dbStatus
         */
        public String getDbStatus() {
            return this.dbStatus;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return idleTimeOut
         */
        public Integer getIdleTimeOut() {
            return this.idleTimeOut;
        }

        /**
         * @return maxPoolSize
         */
        public Integer getMaxPoolSize() {
            return this.maxPoolSize;
        }

        /**
         * @return minPoolSize
         */
        public Integer getMinPoolSize() {
            return this.minPoolSize;
        }

        /**
         * @return preparedStatementCacheSize
         */
        public Integer getPreparedStatementCacheSize() {
            return this.preparedStatementCacheSize;
        }

        /**
         * @return shardingDbName
         */
        public String getShardingDbName() {
            return this.shardingDbName;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Integer blockingTimeout; 
            private String connectUrl; 
            private String connectionProperties; 
            private String dbInstanceId; 
            private String dbStatus; 
            private String dbType; 
            private String groupName; 
            private Integer idleTimeOut; 
            private Integer maxPoolSize; 
            private Integer minPoolSize; 
            private Integer preparedStatementCacheSize; 
            private String shardingDbName; 
            private String userName; 

            /**
             * <p>The timeout period for a transaction to wait for the release of the data lock.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder blockingTimeout(Integer blockingTimeout) {
                this.blockingTimeout = blockingTimeout;
                return this;
            }

            /**
             * <p>The URL that is used to access the Apsara RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100.100.64.100:11569</p>
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * <p>The properties of the connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>connectTimeout=3000;autoReconnect=true;failOverReadOnly=false;socketTimeout=900000;rewriteBatchedStatements=true;characterEncoding=utf8</p>
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * <p>The ID of the Apsara RDS for MySQL instance that is used as the storage of the database shard.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1hjzn0yv5j2****</p>
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>The status of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder dbStatus(String dbStatus) {
                this.dbStatus = dbStatus;
                return this;
            }

            /**
             * <p>The engine of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The name of group on which the database shard is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMP1_1568171495522SABE_KUP4_0000</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The timeout period of an idle connection.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder idleTimeOut(Integer idleTimeOut) {
                this.idleTimeOut = idleTimeOut;
                return this;
            }

            /**
             * <p>The maximum size of the connection pool.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxPoolSize(Integer maxPoolSize) {
                this.maxPoolSize = maxPoolSize;
                return this;
            }

            /**
             * <p>The minimum size of the connection pool.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minPoolSize(Integer minPoolSize) {
                this.minPoolSize = minPoolSize;
                return this;
            }

            /**
             * <p>The size of cache for the returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder preparedStatementCacheSize(Integer preparedStatementCacheSize) {
                this.preparedStatementCacheSize = preparedStatementCacheSize;
                return this;
            }

            /**
             * <p>The name of the database shard.</p>
             * 
             * <strong>example:</strong>
             * <p>temp1_zhk1_0000</p>
             */
            public Builder shardingDbName(String shardingDbName) {
                this.shardingDbName = shardingDbName;
                return this;
            }

            /**
             * <p>The username that is used to connect to the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pg284mi8</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ShardingDb build() {
                return new ShardingDb(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsShardingDbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsShardingDbsResponseBody</p>
     */
    public static class ShardingDbs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardingDb")
        private java.util.List<ShardingDb> shardingDb;

        private ShardingDbs(Builder builder) {
            this.shardingDb = builder.shardingDb;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardingDbs create() {
            return builder().build();
        }

        /**
         * @return shardingDb
         */
        public java.util.List<ShardingDb> getShardingDb() {
            return this.shardingDb;
        }

        public static final class Builder {
            private java.util.List<ShardingDb> shardingDb; 

            /**
             * ShardingDb.
             */
            public Builder shardingDb(java.util.List<ShardingDb> shardingDb) {
                this.shardingDb = shardingDb;
                return this;
            }

            public ShardingDbs build() {
                return new ShardingDbs(this);
            } 

        } 

    }
}
