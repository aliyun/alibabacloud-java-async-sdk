// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClusterSummary} extends {@link TeaModel}
 *
 * <p>ClusterSummary</p>
 */
public class ClusterSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterState")
    private String clusterState;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EmrDefaultRole")
    private String emrDefaultRole;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("ReadyTime")
    private Long readyTime;

    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("StateChangeReason")
    private ClusterStateChangeReason stateChangeReason;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tag > tags;

    private ClusterSummary(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterState = builder.clusterState;
        this.clusterType = builder.clusterType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.emrDefaultRole = builder.emrDefaultRole;
        this.endTime = builder.endTime;
        this.expireTime = builder.expireTime;
        this.paymentType = builder.paymentType;
        this.readyTime = builder.readyTime;
        this.releaseVersion = builder.releaseVersion;
        this.resourceGroupId = builder.resourceGroupId;
        this.stateChangeReason = builder.stateChangeReason;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterSummary create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterState
     */
    public String getClusterState() {
        return this.clusterState;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return emrDefaultRole
     */
    public String getEmrDefaultRole() {
        return this.emrDefaultRole;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return readyTime
     */
    public Long getReadyTime() {
        return this.readyTime;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return stateChangeReason
     */
    public ClusterStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private String clusterState; 
        private String clusterType; 
        private Long createTime; 
        private String description; 
        private String emrDefaultRole; 
        private Long endTime; 
        private Long expireTime; 
        private String paymentType; 
        private Long readyTime; 
        private String releaseVersion; 
        private String resourceGroupId; 
        private ClusterStateChangeReason stateChangeReason; 
        private java.util.List < Tag > tags; 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 集群名称。
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * 集群状态。取值范围：
         * <p>
         * - STARTING：启动中。
         * - START_FAILED：启动失败。
         * - BOOTSTRAPPING：引导操作初始化。
         * - RUNNING：运行中。
         * - TERMINATING：终止中。
         * - TERMINATED：已终止。
         * - TERMINATED_WITH_ERRORS：发生异常导致终止。
         * - TERMINATE_FAILED：终止失败。
         */
        public Builder clusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        /**
         * 集群类型。取值范围：
         * <p>
         * - DATALAKE：新版数据湖。
         * - OLAP：数据分析。
         * - DATAFLOW：实时数据流。
         * - DATASERVING：数据服务。
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * 创建时间。
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EMR服务角色。
         */
        public Builder emrDefaultRole(String emrDefaultRole) {
            this.emrDefaultRole = emrDefaultRole;
            return this;
        }

        /**
         * 删除时间。
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 过期时间。
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * 付费类型。取值范围：
         * <p>
         * - PayAsYouGo：后付费。
         * - Subscription：预付费。
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 可用时间。
         */
        public Builder readyTime(Long readyTime) {
            this.readyTime = readyTime;
            return this;
        }

        /**
         * EMR发行版。
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * 资源组ID。
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 失败原因。
         */
        public Builder stateChangeReason(ClusterStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }

        /**
         * 标签列表。
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        public ClusterSummary build() {
            return new ClusterSummary(this);
        } 

    } 

}
