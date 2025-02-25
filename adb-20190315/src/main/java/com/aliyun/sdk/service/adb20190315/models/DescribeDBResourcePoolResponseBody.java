// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBResourcePoolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourcePoolResponseBody</p>
 */
public class DescribeDBResourcePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("PoolsInfo")
    private java.util.List < PoolsInfo> poolsInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Details of the resource group.</p>
         */
        public Builder poolsInfo(java.util.List < PoolsInfo> poolsInfo) {
            this.poolsInfo = poolsInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBResourcePoolResponseBody build() {
            return new DescribeDBResourcePoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBResourcePoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourcePoolResponseBody</p>
     */
    public static class PoolsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("PoolName")
        private String poolName;

        @com.aliyun.core.annotation.NameInMap("PoolUsers")
        private String poolUsers;

        @com.aliyun.core.annotation.NameInMap("QueryType")
        private String queryType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time when the resource group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-09 16:57:35.241</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * <blockquote>
             * <p> Each node consumes 16 cores and 64 GB memory.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFAULT</p>
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * <p>The database accounts that are associated with the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>testb,testc</p>
             */
            public Builder poolUsers(String poolUsers) {
                this.poolUsers = poolUsers;
                return this;
            }

            /**
             * <p>The mode in which SQL statements are executed.</p>
             * <ul>
             * <li><strong>batch</strong></li>
             * <li><strong>interactive</strong></li>
             * </ul>
             * <blockquote>
             * <p> For more information, see <a href="https://help.aliyun.com/document_detail/189502.html">Query execution modes</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>default_type</p>
             */
            public Builder queryType(String queryType) {
                this.queryType = queryType;
                return this;
            }

            /**
             * <p>The time when the resource group was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-09 16:57:35.241</p>
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
