// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Cluster} extends {@link TeaModel}
 *
 * <p>Cluster</p>
 */
public class Cluster extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("ClusterState")
    private String clusterState;

    @NameInMap("ClusterType")
    private String clusterType;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("DeployMode")
    private String deployMode;

    @NameInMap("EmrDefaultRole")
    private String emrDefaultRole;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("NodeAttributes")
    private NodeAttributes nodeAttributes;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("ReadyTime")
    private Long readyTime;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("ReleaseVersion")
    private String releaseVersion;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SecurityMode")
    private String securityMode;

    @NameInMap("StateChangeReason")
    private ClusterStateChangeReason stateChangeReason;

    @NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @NameInMap("Tags")
    private java.util.List < Tag > tags;

    private Cluster(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterState = builder.clusterState;
        this.clusterType = builder.clusterType;
        this.createTime = builder.createTime;
        this.deployMode = builder.deployMode;
        this.emrDefaultRole = builder.emrDefaultRole;
        this.endTime = builder.endTime;
        this.expireTime = builder.expireTime;
        this.nodeAttributes = builder.nodeAttributes;
        this.paymentType = builder.paymentType;
        this.readyTime = builder.readyTime;
        this.regionId = builder.regionId;
        this.releaseVersion = builder.releaseVersion;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityMode = builder.securityMode;
        this.stateChangeReason = builder.stateChangeReason;
        this.subscriptionConfig = builder.subscriptionConfig;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Cluster create() {
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
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
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
     * @return nodeAttributes
     */
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return securityMode
     */
    public String getSecurityMode() {
        return this.securityMode;
    }

    /**
     * @return stateChangeReason
     */
    public ClusterStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * @return subscriptionConfig
     */
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
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
        private String deployMode; 
        private String emrDefaultRole; 
        private Long endTime; 
        private Long expireTime; 
        private NodeAttributes nodeAttributes; 
        private String paymentType; 
        private Long readyTime; 
        private String regionId; 
        private String releaseVersion; 
        private String resourceGroupId; 
        private String securityMode; 
        private ClusterStateChangeReason stateChangeReason; 
        private SubscriptionConfig subscriptionConfig; 
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
         * 集群状态。
         */
        public Builder clusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        /**
         * 集群类型。
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
         * 部署模式。
         */
        public Builder deployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }

        /**
         * EMR默认角色。
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
         * 节点属性。
         */
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * 付费类型。
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
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * Kerberos安全模式。
         */
        public Builder securityMode(String securityMode) {
            this.securityMode = securityMode;
            return this;
        }

        /**
         * StateChangeReason.
         */
        public Builder stateChangeReason(ClusterStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }

        /**
         * 预付费配置。
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * 集群标签。
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        public Cluster build() {
            return new Cluster(this);
        } 

    } 

}
