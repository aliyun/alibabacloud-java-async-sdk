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
 * {@link DRPlanConfigurationDetail} extends {@link TeaModel}
 *
 * <p>DRPlanConfigurationDetail</p>
 */
public class DRPlanConfigurationDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    private java.util.List<ApplicationConfig> applicationConfigs;

    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Application> applications;

    @com.aliyun.core.annotation.NameInMap("BootstrapScripts")
    private java.util.List<Script> bootstrapScripts;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.NameInMap("DeployMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployMode;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("LogCollectStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logCollectStrategy;

    @com.aliyun.core.annotation.NameInMap("ManagedScalingPolicy")
    private ManagedScalingPolicy managedScalingPolicy;

    @com.aliyun.core.annotation.NameInMap("MetaStoreType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metaStoreType;

    @com.aliyun.core.annotation.NameInMap("NodeAttributes")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeAttributes nodeAttributes;

    @com.aliyun.core.annotation.NameInMap("NodeGroups")
    private java.util.List<NodeGroupConfig> nodeGroups;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseVersion;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ScalingPolicies")
    private java.util.List<ScalingPolicy> scalingPolicies;

    @com.aliyun.core.annotation.NameInMap("ScalingTimeZone")
    private String scalingTimeZone;

    @com.aliyun.core.annotation.NameInMap("SecurityMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityMode;

    @com.aliyun.core.annotation.NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tag> tags;

    private DRPlanConfigurationDetail(Builder builder) {
        this.applicationConfigs = builder.applicationConfigs;
        this.applications = builder.applications;
        this.bootstrapScripts = builder.bootstrapScripts;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.deletionProtection = builder.deletionProtection;
        this.deployMode = builder.deployMode;
        this.description = builder.description;
        this.logCollectStrategy = builder.logCollectStrategy;
        this.managedScalingPolicy = builder.managedScalingPolicy;
        this.metaStoreType = builder.metaStoreType;
        this.nodeAttributes = builder.nodeAttributes;
        this.nodeGroups = builder.nodeGroups;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.releaseVersion = builder.releaseVersion;
        this.resourceGroupId = builder.resourceGroupId;
        this.scalingPolicies = builder.scalingPolicies;
        this.scalingTimeZone = builder.scalingTimeZone;
        this.securityMode = builder.securityMode;
        this.subscriptionConfig = builder.subscriptionConfig;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DRPlanConfigurationDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationConfigs
     */
    public java.util.List<ApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    /**
     * @return applications
     */
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    /**
     * @return bootstrapScripts
     */
    public java.util.List<Script> getBootstrapScripts() {
        return this.bootstrapScripts;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
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
     * @return logCollectStrategy
     */
    public String getLogCollectStrategy() {
        return this.logCollectStrategy;
    }

    /**
     * @return managedScalingPolicy
     */
    public ManagedScalingPolicy getManagedScalingPolicy() {
        return this.managedScalingPolicy;
    }

    /**
     * @return metaStoreType
     */
    public String getMetaStoreType() {
        return this.metaStoreType;
    }

    /**
     * @return nodeAttributes
     */
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    /**
     * @return nodeGroups
     */
    public java.util.List<NodeGroupConfig> getNodeGroups() {
        return this.nodeGroups;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
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
     * @return scalingPolicies
     */
    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return this.scalingPolicies;
    }

    /**
     * @return scalingTimeZone
     */
    public String getScalingTimeZone() {
        return this.scalingTimeZone;
    }

    /**
     * @return securityMode
     */
    public String getSecurityMode() {
        return this.securityMode;
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
        private java.util.List<ApplicationConfig> applicationConfigs; 
        private java.util.List<Application> applications; 
        private java.util.List<Script> bootstrapScripts; 
        private String clusterName; 
        private String clusterType; 
        private Boolean deletionProtection; 
        private String deployMode; 
        private String description; 
        private String logCollectStrategy; 
        private ManagedScalingPolicy managedScalingPolicy; 
        private String metaStoreType; 
        private NodeAttributes nodeAttributes; 
        private java.util.List<NodeGroupConfig> nodeGroups; 
        private String paymentType; 
        private String regionId; 
        private String releaseVersion; 
        private String resourceGroupId; 
        private java.util.List<ScalingPolicy> scalingPolicies; 
        private String scalingTimeZone; 
        private String securityMode; 
        private SubscriptionConfig subscriptionConfig; 
        private java.util.List<Tag> tags; 

        private Builder() {
        } 

        private Builder(DRPlanConfigurationDetail model) {
            this.applicationConfigs = model.applicationConfigs;
            this.applications = model.applications;
            this.bootstrapScripts = model.bootstrapScripts;
            this.clusterName = model.clusterName;
            this.clusterType = model.clusterType;
            this.deletionProtection = model.deletionProtection;
            this.deployMode = model.deployMode;
            this.description = model.description;
            this.logCollectStrategy = model.logCollectStrategy;
            this.managedScalingPolicy = model.managedScalingPolicy;
            this.metaStoreType = model.metaStoreType;
            this.nodeAttributes = model.nodeAttributes;
            this.nodeGroups = model.nodeGroups;
            this.paymentType = model.paymentType;
            this.regionId = model.regionId;
            this.releaseVersion = model.releaseVersion;
            this.resourceGroupId = model.resourceGroupId;
            this.scalingPolicies = model.scalingPolicies;
            this.scalingTimeZone = model.scalingTimeZone;
            this.securityMode = model.securityMode;
            this.subscriptionConfig = model.subscriptionConfig;
            this.tags = model.tags;
        } 

        /**
         * ApplicationConfigs.
         */
        public Builder applicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * Applications.
         */
        public Builder applications(java.util.List<Application> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * BootstrapScripts.
         */
        public Builder bootstrapScripts(java.util.List<Script> bootstrapScripts) {
            this.bootstrapScripts = bootstrapScripts;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder logCollectStrategy(String logCollectStrategy) {
            this.logCollectStrategy = logCollectStrategy;
            return this;
        }

        /**
         * ManagedScalingPolicy.
         */
        public Builder managedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
            this.managedScalingPolicy = managedScalingPolicy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * NodeGroups.
         */
        public Builder nodeGroups(java.util.List<NodeGroupConfig> nodeGroups) {
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ScalingPolicies.
         */
        public Builder scalingPolicies(java.util.List<ScalingPolicy> scalingPolicies) {
            this.scalingPolicies = scalingPolicies;
            return this;
        }

        /**
         * ScalingTimeZone.
         */
        public Builder scalingTimeZone(String scalingTimeZone) {
            this.scalingTimeZone = scalingTimeZone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder securityMode(String securityMode) {
            this.securityMode = securityMode;
            return this;
        }

        /**
         * SubscriptionConfig.
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public DRPlanConfigurationDetail build() {
            return new DRPlanConfigurationDetail(this);
        } 

    } 

    /**
     * 
     * {@link DRPlanConfigurationDetail} extends {@link TeaModel}
     *
     * <p>DRPlanConfigurationDetail</p>
     */
    public static class ManagedScalingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Constraints")
        private ManagedScalingConstraints constraints;

        private ManagedScalingPolicy(Builder builder) {
            this.constraints = builder.constraints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedScalingPolicy create() {
            return builder().build();
        }

        /**
         * @return constraints
         */
        public ManagedScalingConstraints getConstraints() {
            return this.constraints;
        }

        public static final class Builder {
            private ManagedScalingConstraints constraints; 

            private Builder() {
            } 

            private Builder(ManagedScalingPolicy model) {
                this.constraints = model.constraints;
            } 

            /**
             * Constraints.
             */
            public Builder constraints(ManagedScalingConstraints constraints) {
                this.constraints = constraints;
                return this;
            }

            public ManagedScalingPolicy build() {
                return new ManagedScalingPolicy(this);
            } 

        } 

    }
}
