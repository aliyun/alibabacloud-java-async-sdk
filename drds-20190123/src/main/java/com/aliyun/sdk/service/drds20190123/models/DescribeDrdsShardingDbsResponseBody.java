// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsShardingDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsShardingDbsResponseBody</p>
 */
public class DescribeDrdsShardingDbsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShardingDbs")
    private ShardingDbs shardingDbs;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
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
         * ShardingDbs.
         */
        public Builder shardingDbs(ShardingDbs shardingDbs) {
            this.shardingDbs = shardingDbs;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsShardingDbsResponseBody build() {
            return new DescribeDrdsShardingDbsResponseBody(this);
        } 

    } 

    public static class ShardingDb extends TeaModel {
        @NameInMap("BlockingTimeout")
        private Integer blockingTimeout;

        @NameInMap("ConnectUrl")
        private String connectUrl;

        @NameInMap("ConnectionProperties")
        private String connectionProperties;

        @NameInMap("DbInstanceId")
        private String dbInstanceId;

        @NameInMap("DbStatus")
        private String dbStatus;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("IdleTimeOut")
        private Integer idleTimeOut;

        @NameInMap("MaxPoolSize")
        private Integer maxPoolSize;

        @NameInMap("MinPoolSize")
        private Integer minPoolSize;

        @NameInMap("PreparedStatementCacheSize")
        private Integer preparedStatementCacheSize;

        @NameInMap("ShardingDbName")
        private String shardingDbName;

        @NameInMap("UserName")
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
             * BlockingTimeout.
             */
            public Builder blockingTimeout(Integer blockingTimeout) {
                this.blockingTimeout = blockingTimeout;
                return this;
            }

            /**
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * ConnectionProperties.
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * DbStatus.
             */
            public Builder dbStatus(String dbStatus) {
                this.dbStatus = dbStatus;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IdleTimeOut.
             */
            public Builder idleTimeOut(Integer idleTimeOut) {
                this.idleTimeOut = idleTimeOut;
                return this;
            }

            /**
             * MaxPoolSize.
             */
            public Builder maxPoolSize(Integer maxPoolSize) {
                this.maxPoolSize = maxPoolSize;
                return this;
            }

            /**
             * MinPoolSize.
             */
            public Builder minPoolSize(Integer minPoolSize) {
                this.minPoolSize = minPoolSize;
                return this;
            }

            /**
             * PreparedStatementCacheSize.
             */
            public Builder preparedStatementCacheSize(Integer preparedStatementCacheSize) {
                this.preparedStatementCacheSize = preparedStatementCacheSize;
                return this;
            }

            /**
             * ShardingDbName.
             */
            public Builder shardingDbName(String shardingDbName) {
                this.shardingDbName = shardingDbName;
                return this;
            }

            /**
             * UserName.
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
    public static class ShardingDbs extends TeaModel {
        @NameInMap("ShardingDb")
        private java.util.List < ShardingDb> shardingDb;

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
        public java.util.List < ShardingDb> getShardingDb() {
            return this.shardingDb;
        }

        public static final class Builder {
            private java.util.List < ShardingDb> shardingDb; 

            /**
             * ShardingDb.
             */
            public Builder shardingDb(java.util.List < ShardingDb> shardingDb) {
                this.shardingDb = shardingDb;
                return this;
            }

            public ShardingDbs build() {
                return new ShardingDbs(this);
            } 

        } 

    }
}
