// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentInstancesResponseBody</p>
 */
public class ListComponentInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentInstances")
    private java.util.List < ComponentInstances> componentInstances;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListComponentInstancesResponseBody(Builder builder) {
        this.componentInstances = builder.componentInstances;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentInstances
     */
    public java.util.List < ComponentInstances> getComponentInstances() {
        return this.componentInstances;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ComponentInstances> componentInstances; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ComponentInstances.
         */
        public Builder componentInstances(java.util.List < ComponentInstances> componentInstances) {
            this.componentInstances = componentInstances;
            return this;
        }

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListComponentInstancesResponseBody build() {
            return new ListComponentInstancesResponseBody(this);
        } 

    } 

    public static class ComponentInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("BizState")
        private String bizState;

        @com.aliyun.core.annotation.NameInMap("CommissionState")
        private String commissionState;

        @com.aliyun.core.annotation.NameInMap("ComponentInstanceState")
        private String componentInstanceState;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DesiredState")
        private String desiredState;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private ComponentInstances(Builder builder) {
            this.applicationName = builder.applicationName;
            this.bizState = builder.bizState;
            this.commissionState = builder.commissionState;
            this.componentInstanceState = builder.componentInstanceState;
            this.componentName = builder.componentName;
            this.createTime = builder.createTime;
            this.desiredState = builder.desiredState;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInstances create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return bizState
         */
        public String getBizState() {
            return this.bizState;
        }

        /**
         * @return commissionState
         */
        public String getCommissionState() {
            return this.commissionState;
        }

        /**
         * @return componentInstanceState
         */
        public String getComponentInstanceState() {
            return this.componentInstanceState;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return desiredState
         */
        public String getDesiredState() {
            return this.desiredState;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String applicationName; 
            private String bizState; 
            private String commissionState; 
            private String componentInstanceState; 
            private String componentName; 
            private Long createTime; 
            private String desiredState; 
            private String nodeId; 
            private String nodeName; 

            /**
             * 应用名称。
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * 组件服务状态，取值如下：
             * <p>
             * - active：主服务
             * - standby：备用服务。
             */
            public Builder bizState(String bizState) {
                this.bizState = bizState;
                return this;
            }

            /**
             * Commission状态，取值如下：
             * <p>
             * - COMMISSIONED：已上线
             * - COMMISSIONING：上线中
             * - DECOMMISSIONED：已下线
             * - DECOMMISSIONINPROGRESS：下线进程中
             * - DECOMMISSIONFAILED：下线失败
             * - INSERVICE：服务中
             * - UNKNOWN：未知状态。
             * <p>
             */
            public Builder commissionState(String commissionState) {
                this.commissionState = commissionState;
                return this;
            }

            /**
             * 组件实例操作状态，取值如下：
             * <p>
             * - WAITING：等待中
             * - INSTALLING：安装中
             * - INSTALLED：已安装
             * - INSTALL_FAILED：安装失败
             * - STARTING：启动中
             * - STARTED：已启动
             * - START_FAILED：启动失败
             * - STOPPING：停止中
             * - STOPPED：已停止
             * - STOP_FAILED：停止失败
             */
            public Builder componentInstanceState(String componentInstanceState) {
                this.componentInstanceState = componentInstanceState;
                return this;
            }

            /**
             * 组件名称。
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * 安装时间戳。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 期望状态，取值如下：
             * <p>
             * - WAITING：等待中
             * - INSTALLING：安装中
             * - INSTALLED：已安装
             * - INSTALL_FAILED：安装失败
             * - STARTING：启动中
             * - STARTED：已启动
             * - START_FAILED：启动失败
             * - STOPPING：停止中
             * - STOPPED：已停止
             * - STOP_FAILED：停止失败。
             */
            public Builder desiredState(String desiredState) {
                this.desiredState = desiredState;
                return this;
            }

            /**
             * 节点ID。
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 节点名称。
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public ComponentInstances build() {
                return new ComponentInstances(this);
            } 

        } 

    }
}
