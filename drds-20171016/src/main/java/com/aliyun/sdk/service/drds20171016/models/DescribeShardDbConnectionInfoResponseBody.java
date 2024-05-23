// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardDbConnectionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShardDbConnectionInfoResponseBody</p>
 */
public class DescribeShardDbConnectionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionInfo")
    private ConnectionInfo connectionInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeShardDbConnectionInfoResponseBody(Builder builder) {
        this.connectionInfo = builder.connectionInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShardDbConnectionInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionInfo
     */
    public ConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
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

    public static final class Builder {
        private ConnectionInfo connectionInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * ConnectionInfo.
         */
        public Builder connectionInfo(ConnectionInfo connectionInfo) {
            this.connectionInfo = connectionInfo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeShardDbConnectionInfoResponseBody build() {
            return new DescribeShardDbConnectionInfoResponseBody(this);
        } 

    } 

    public static class ConnectionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceUrl")
        private String instanceUrl;

        @com.aliyun.core.annotation.NameInMap("blockingTimeout")
        private Integer blockingTimeout;

        @com.aliyun.core.annotation.NameInMap("connectionProperties")
        private String connectionProperties;

        @com.aliyun.core.annotation.NameInMap("dbStatus")
        private String dbStatus;

        @com.aliyun.core.annotation.NameInMap("dbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("idleTimeOut")
        private Integer idleTimeOut;

        @com.aliyun.core.annotation.NameInMap("maxPoolSize")
        private Integer maxPoolSize;

        @com.aliyun.core.annotation.NameInMap("minPoolSize")
        private Integer minPoolSize;

        @com.aliyun.core.annotation.NameInMap("preparedStatementCacheSize")
        private Integer preparedStatementCacheSize;

        @com.aliyun.core.annotation.NameInMap("subDbName")
        private String subDbName;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private ConnectionInfo(Builder builder) {
            this.instanceName = builder.instanceName;
            this.instanceUrl = builder.instanceUrl;
            this.blockingTimeout = builder.blockingTimeout;
            this.connectionProperties = builder.connectionProperties;
            this.dbStatus = builder.dbStatus;
            this.dbType = builder.dbType;
            this.idleTimeOut = builder.idleTimeOut;
            this.maxPoolSize = builder.maxPoolSize;
            this.minPoolSize = builder.minPoolSize;
            this.preparedStatementCacheSize = builder.preparedStatementCacheSize;
            this.subDbName = builder.subDbName;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionInfo create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceUrl
         */
        public String getInstanceUrl() {
            return this.instanceUrl;
        }

        /**
         * @return blockingTimeout
         */
        public Integer getBlockingTimeout() {
            return this.blockingTimeout;
        }

        /**
         * @return connectionProperties
         */
        public String getConnectionProperties() {
            return this.connectionProperties;
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
         * @return subDbName
         */
        public String getSubDbName() {
            return this.subDbName;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String instanceName; 
            private String instanceUrl; 
            private Integer blockingTimeout; 
            private String connectionProperties; 
            private String dbStatus; 
            private String dbType; 
            private Integer idleTimeOut; 
            private Integer maxPoolSize; 
            private Integer minPoolSize; 
            private Integer preparedStatementCacheSize; 
            private String subDbName; 
            private String userName; 

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceUrl.
             */
            public Builder instanceUrl(String instanceUrl) {
                this.instanceUrl = instanceUrl;
                return this;
            }

            /**
             * blockingTimeout.
             */
            public Builder blockingTimeout(Integer blockingTimeout) {
                this.blockingTimeout = blockingTimeout;
                return this;
            }

            /**
             * connectionProperties.
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * dbStatus.
             */
            public Builder dbStatus(String dbStatus) {
                this.dbStatus = dbStatus;
                return this;
            }

            /**
             * dbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * idleTimeOut.
             */
            public Builder idleTimeOut(Integer idleTimeOut) {
                this.idleTimeOut = idleTimeOut;
                return this;
            }

            /**
             * maxPoolSize.
             */
            public Builder maxPoolSize(Integer maxPoolSize) {
                this.maxPoolSize = maxPoolSize;
                return this;
            }

            /**
             * minPoolSize.
             */
            public Builder minPoolSize(Integer minPoolSize) {
                this.minPoolSize = minPoolSize;
                return this;
            }

            /**
             * preparedStatementCacheSize.
             */
            public Builder preparedStatementCacheSize(Integer preparedStatementCacheSize) {
                this.preparedStatementCacheSize = preparedStatementCacheSize;
                return this;
            }

            /**
             * subDbName.
             */
            public Builder subDbName(String subDbName) {
                this.subDbName = subDbName;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ConnectionInfo build() {
                return new ConnectionInfo(this);
            } 

        } 

    }
}
