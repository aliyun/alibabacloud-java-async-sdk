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
    @NameInMap("PoolsInfo")
    private java.util.List < PoolsInfo> poolsInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBResourcePoolResponseBody(Builder builder) {
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
        private java.util.List < PoolsInfo> poolsInfo; 
        private String requestId; 

        /**
         * PoolsInfo.
         */
        public Builder poolsInfo(java.util.List < PoolsInfo> poolsInfo) {
            this.poolsInfo = poolsInfo;
            return this;
        }

        /**
         * RequestId.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * NodeNum.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * PoolName.
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * PoolUsers.
             */
            public Builder poolUsers(String poolUsers) {
                this.poolUsers = poolUsers;
                return this;
            }

            /**
             * QueryType.
             */
            public Builder queryType(String queryType) {
                this.queryType = queryType;
                return this;
            }

            /**
             * UpdateTime.
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
