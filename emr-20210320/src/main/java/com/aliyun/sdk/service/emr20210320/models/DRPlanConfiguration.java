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
 * {@link DRPlanConfiguration} extends {@link TeaModel}
 *
 * <p>DRPlanConfiguration</p>
 */
public class DRPlanConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    private java.util.List<ApplicationConfig> applicationConfigs;

    @com.aliyun.core.annotation.NameInMap("Applications")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Application> applications;

    @com.aliyun.core.annotation.NameInMap("BootstrapScripts")
    private java.util.List<Script> bootstrapScripts;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("LogCollectStrategy")
    private String logCollectStrategy;

    @com.aliyun.core.annotation.NameInMap("ManagedScalingPolicy")
    private ManagedScalingPolicy managedScalingPolicy;

    @com.aliyun.core.annotation.NameInMap("NodeAttributes")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeAttributes nodeAttributes;

    @com.aliyun.core.annotation.NameInMap("NodeGroups")
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.NameInMap("SecurityMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityMode;

    @com.aliyun.core.annotation.NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private DRPlanConfiguration(Builder builder) {
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
        this.nodeAttributes = builder.nodeAttributes;
        this.nodeGroups = builder.nodeGroups;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.releaseVersion = builder.releaseVersion;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityMode = builder.securityMode;
        this.subscriptionConfig = builder.subscriptionConfig;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DRPlanConfiguration create() {
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
    public java.util.List<Tags> getTags() {
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
        private NodeAttributes nodeAttributes; 
        private java.util.List<NodeGroupConfig> nodeGroups; 
        private String paymentType; 
        private String regionId; 
        private String releaseVersion; 
        private String resourceGroupId; 
        private String securityMode; 
        private SubscriptionConfig subscriptionConfig; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(DRPlanConfiguration model) {
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
            this.nodeAttributes = model.nodeAttributes;
            this.nodeGroups = model.nodeGroups;
            this.paymentType = model.paymentType;
            this.regionId = model.regionId;
            this.releaseVersion = model.releaseVersion;
            this.resourceGroupId = model.resourceGroupId;
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * DeployMode.
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
         * LogCollectStrategy.
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
        public Builder nodeAttributes(NodeAttributes nodeAttributes) {
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public DRPlanConfiguration build() {
            return new DRPlanConfiguration(this);
        } 

    } 

    /**
     * 
     * {@link DRPlanConfiguration} extends {@link TeaModel}
     *
     * <p>DRPlanConfiguration</p>
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
    /**
     * 
     * {@link DRPlanConfiguration} extends {@link TeaModel}
     *
     * <p>DRPlanConfiguration</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>标签键。必填参数，不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或https://。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>标签值。非必填，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或者https://。</p>
             * 
             * <strong>example:</strong>
             * <p>IT</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
