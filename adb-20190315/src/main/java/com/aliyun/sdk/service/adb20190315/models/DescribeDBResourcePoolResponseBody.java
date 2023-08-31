// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBResourcePoolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourcePoolResponseBody</p>
 */
public class DescribeDBResourcePoolResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("PoolsInfo")
    private java.util.List < PoolsInfo> poolsInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBResourcePoolResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.poolsInfo = builder.poolsInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBResourcePoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return poolsInfo
     */
    public java.util.List < PoolsInfo> getPoolsInfo() {
        return this.poolsInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List < PoolsInfo> poolsInfo; 
        private String requestId; 

        /**
         * The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Details of the resource group.
         */
        public Builder poolsInfo(java.util.List < PoolsInfo> poolsInfo) {
            this.poolsInfo = poolsInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBResourcePoolResponseBody build() {
            return new DescribeDBResourcePoolResponseBody(this);
        } 

    } 

    public static class PoolsInfo extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("NodeNum")
        private Integer nodeNum;

        @NameInMap("PoolName")
        private String poolName;

        @NameInMap("PoolUsers")
        private String poolUsers;

        @NameInMap("QueryType")
        private String queryType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private PoolsInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.nodeNum = builder.nodeNum;
            this.poolName = builder.poolName;
            this.poolUsers = builder.poolUsers;
            this.queryType = builder.queryType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PoolsInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return poolName
         */
        public String getPoolName() {
            return this.poolName;
        }

        /**
         * @return poolUsers
         */
        public String getPoolUsers() {
            return this.poolUsers;
        }

        /**
         * @return queryType
         */
        public String getQueryType() {
            return this.queryType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private Integer nodeNum; 
            private String poolName; 
            private String poolUsers; 
            private String queryType; 
            private String updateTime; 

            /**
             * The time when the resource group was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of nodes.
             * <p>
             * 
             * >  Each node consumes 16 cores and 64 GB memory.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * The database accounts that are associated with the resource group.
             */
            public Builder poolUsers(String poolUsers) {
                this.poolUsers = poolUsers;
                return this;
            }

            /**
             * The mode in which SQL statements are executed.
             * <p>
             * 
             * *   **batch**
             * *   **interactive**
             * 
             * >  For more information, see [Query execution modes](~~189502~~).
             */
            public Builder queryType(String queryType) {
                this.queryType = queryType;
                return this;
            }

            /**
             * The time when the resource group was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PoolsInfo build() {
                return new PoolsInfo(this);
            } 

        } 

    }
}
