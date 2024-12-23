// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link Cluster} extends {@link TeaModel}
 *
 * <p>Cluster</p>
 */
public class Cluster extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EmrDefaultRole")
    private String emrDefaultRole;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("NodeAttributes")
    private NodeAttributes nodeAttributes;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("ReadyTime")
    private Long readyTime;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityMode")
    private String securityMode;

    @com.aliyun.core.annotation.NameInMap("StateChangeReason")
    private ClusterStateChangeReason stateChangeReason;

    @com.aliyun.core.annotation.NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tag> tags;

    private Cluster(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterState = builder.clusterState;
        this.clusterType = builder.clusterType;
        this.createTime = builder.createTime;
        this.deletionProtection = builder.deletionProtection;
        this.deployMode = builder.deployMode;
        this.description = builder.description;
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
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
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
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private String clusterState; 
        private String clusterType; 
        private Long createTime; 
        private Boolean deletionProtection; 
        private String deployMode; 
        private String description; 
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
        private java.util.List<Tag> tags; 

        /**
         * <p>集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>集群名称。</p>
         * 
         * <strong>example:</strong>
         * <p>emrtest</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>集群状态。</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder clusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        /**
         * <p>集群类型。</p>
         * 
         * <strong>example:</strong>
         * <p>DATALAKE</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>创建时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DeletionProtection.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>部署模式。</p>
         * 
         * <strong>example:</strong>
         * <p>HA</p>
         */
        public Builder deployMode(String deployMode) {
            this.deployMode = deployMode;
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
         * <p>EMR默认角色。</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunEMRDefaultRole</p>
         */
        public Builder emrDefaultRole(String emrDefaultRole) {
            this.emrDefaultRole = emrDefaultRole;
            return this;
        }

        /**
         * <p>删除时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>过期时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>节点属性。</p>
         */
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * <p>付费类型。</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>可用时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder readyTime(Long readyTime) {
            this.readyTime = readyTime;
            return this;
        }

        /**
         * <p>地域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>EMR发行版。</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-5.3.0</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>资源组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzabjyop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Kerberos安全模式。</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
         * <p>预付费配置。</p>
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * <p>集群标签。</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public Cluster build() {
            return new Cluster(this);
        } 

    } 

}
