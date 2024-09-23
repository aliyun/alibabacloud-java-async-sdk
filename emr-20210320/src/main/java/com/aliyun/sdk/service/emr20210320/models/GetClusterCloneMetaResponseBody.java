// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterCloneMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterCloneMetaResponseBody</p>
 */
public class GetClusterCloneMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterCloneMeta")
    private ClusterCloneMeta clusterCloneMeta;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClusterCloneMetaResponseBody(Builder builder) {
        this.clusterCloneMeta = builder.clusterCloneMeta;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterCloneMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterCloneMeta
     */
    public ClusterCloneMeta getClusterCloneMeta() {
        return this.clusterCloneMeta;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterCloneMeta clusterCloneMeta; 
        private String requestId; 

        /**
         * The metadata of the cluster that you want to clone.
         */
        public Builder clusterCloneMeta(ClusterCloneMeta clusterCloneMeta) {
            this.clusterCloneMeta = clusterCloneMeta;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterCloneMetaResponseBody build() {
            return new GetClusterCloneMetaResponseBody(this);
        } 

    } 

    public static class Constraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Integer minCapacity;

        private Constraints(Builder builder) {
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Constraints create() {
            return builder().build();
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return minCapacity
         */
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Integer maxCapacity; 
            private Integer minCapacity; 

            /**
             * The maximum number of nodes in the node group. Default value: 2000.
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * The minimum number of nodes in the node group. Default value: 0.
             */
            public Builder minCapacity(Integer minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public Constraints build() {
                return new Constraints(this);
            } 

        } 

    }
    public static class ScalingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityType")
        private String activityType;

        @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @com.aliyun.core.annotation.NameInMap("MetricsTrigger")
        private MetricsTrigger metricsTrigger;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TimeTrigger")
        private TimeTrigger timeTrigger;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private ScalingRules(Builder builder) {
            this.activityType = builder.activityType;
            this.adjustmentValue = builder.adjustmentValue;
            this.metricsTrigger = builder.metricsTrigger;
            this.ruleName = builder.ruleName;
            this.timeTrigger = builder.timeTrigger;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRules create() {
            return builder().build();
        }

        /**
         * @return activityType
         */
        public String getActivityType() {
            return this.activityType;
        }

        /**
         * @return adjustmentValue
         */
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        /**
         * @return metricsTrigger
         */
        public MetricsTrigger getMetricsTrigger() {
            return this.metricsTrigger;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return timeTrigger
         */
        public TimeTrigger getTimeTrigger() {
            return this.timeTrigger;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String activityType; 
            private Integer adjustmentValue; 
            private MetricsTrigger metricsTrigger; 
            private String ruleName; 
            private TimeTrigger timeTrigger; 
            private String triggerType; 

            /**
             * The scaling type. This parameter is required. Valid values:
             * <p>
             * 
             * *   SCALE_OUT
             * *   SCALE_IN
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * The adjustment value of the auto scaling rule. This parameter is required. The parameter value must be a positive integer, which indicates the number of instances to be added or removed.
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * The description of load-based scaling.
             */
            public Builder metricsTrigger(MetricsTrigger metricsTrigger) {
                this.metricsTrigger = metricsTrigger;
                return this;
            }

            /**
             * The name of the auto scaling rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The description of time-based scaling.
             */
            public Builder timeTrigger(TimeTrigger timeTrigger) {
                this.timeTrigger = timeTrigger;
                return this;
            }

            /**
             * The trigger mode of the auto scaling rule. This parameter is required. Valid values:
             * <p>
             * 
             * *   TIME_TRIGGER: time-based scaling.
             * *   METRICS_TRIGGER: load-based scaling.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public ScalingRules build() {
                return new ScalingRules(this);
            } 

        } 

    }
    public static class ScalingPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Constraints")
        private Constraints constraints;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingPolicyId")
        private String scalingPolicyId;

        @com.aliyun.core.annotation.NameInMap("ScalingRules")
        private java.util.List < ScalingRules> scalingRules;

        private ScalingPolicies(Builder builder) {
            this.clusterId = builder.clusterId;
            this.constraints = builder.constraints;
            this.nodeGroupId = builder.nodeGroupId;
            this.scalingPolicyId = builder.scalingPolicyId;
            this.scalingRules = builder.scalingRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingPolicies create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return constraints
         */
        public Constraints getConstraints() {
            return this.constraints;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return scalingPolicyId
         */
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        /**
         * @return scalingRules
         */
        public java.util.List < ScalingRules> getScalingRules() {
            return this.scalingRules;
        }

        public static final class Builder {
            private String clusterId; 
            private Constraints constraints; 
            private String nodeGroupId; 
            private String scalingPolicyId; 
            private java.util.List < ScalingRules> scalingRules; 

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The maximum and minimum number of nodes in the node group.
             */
            public Builder constraints(Constraints constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * The node group ID.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * The ID of the auto scaling policy.
             */
            public Builder scalingPolicyId(String scalingPolicyId) {
                this.scalingPolicyId = scalingPolicyId;
                return this;
            }

            /**
             * The list of auto scaling rules.
             */
            public Builder scalingRules(java.util.List < ScalingRules> scalingRules) {
                this.scalingRules = scalingRules;
                return this;
            }

            public ScalingPolicies build() {
                return new ScalingPolicies(this);
            } 

        } 

    }
    public static class ClusterCloneMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
        private java.util.List < ApplicationConfig > applicationConfigs;

        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List < Application > applications;

        @com.aliyun.core.annotation.NameInMap("BootstrapScripts")
        private java.util.List < Script > bootstrapScripts;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterState")
        private String clusterState;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("EmrDefaultRole")
        private String emrDefaultRole;

        @com.aliyun.core.annotation.NameInMap("ExistCloneConfig")
        private Boolean existCloneConfig;

        @com.aliyun.core.annotation.NameInMap("NodeAttributes")
        private NodeAttributes nodeAttributes;

        @com.aliyun.core.annotation.NameInMap("NodeGroups")
        private java.util.List < NodeGroup > nodeGroups;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingPolicies")
        private java.util.List < ScalingPolicies> scalingPolicies;

        @com.aliyun.core.annotation.NameInMap("SecurityMode")
        private String securityMode;

        @com.aliyun.core.annotation.NameInMap("SubscriptionConfig")
        private SubscriptionConfig subscriptionConfig;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tag > tags;

        private ClusterCloneMeta(Builder builder) {
            this.applicationConfigs = builder.applicationConfigs;
            this.applications = builder.applications;
            this.bootstrapScripts = builder.bootstrapScripts;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterState = builder.clusterState;
            this.clusterType = builder.clusterType;
            this.deployMode = builder.deployMode;
            this.emrDefaultRole = builder.emrDefaultRole;
            this.existCloneConfig = builder.existCloneConfig;
            this.nodeAttributes = builder.nodeAttributes;
            this.nodeGroups = builder.nodeGroups;
            this.paymentType = builder.paymentType;
            this.regionId = builder.regionId;
            this.releaseVersion = builder.releaseVersion;
            this.resourceGroupId = builder.resourceGroupId;
            this.scalingPolicies = builder.scalingPolicies;
            this.securityMode = builder.securityMode;
            this.subscriptionConfig = builder.subscriptionConfig;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterCloneMeta create() {
            return builder().build();
        }

        /**
         * @return applicationConfigs
         */
        public java.util.List < ApplicationConfig > getApplicationConfigs() {
            return this.applicationConfigs;
        }

        /**
         * @return applications
         */
        public java.util.List < Application > getApplications() {
            return this.applications;
        }

        /**
         * @return bootstrapScripts
         */
        public java.util.List < Script > getBootstrapScripts() {
            return this.bootstrapScripts;
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
         * @return existCloneConfig
         */
        public Boolean getExistCloneConfig() {
            return this.existCloneConfig;
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
        public java.util.List < NodeGroup > getNodeGroups() {
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
        public java.util.List < ScalingPolicies> getScalingPolicies() {
            return this.scalingPolicies;
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
        public java.util.List < Tag > getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < ApplicationConfig > applicationConfigs; 
            private java.util.List < Application > applications; 
            private java.util.List < Script > bootstrapScripts; 
            private String clusterId; 
            private String clusterName; 
            private String clusterState; 
            private String clusterType; 
            private String deployMode; 
            private String emrDefaultRole; 
            private Boolean existCloneConfig; 
            private NodeAttributes nodeAttributes; 
            private java.util.List < NodeGroup > nodeGroups; 
            private String paymentType; 
            private String regionId; 
            private String releaseVersion; 
            private String resourceGroupId; 
            private java.util.List < ScalingPolicies> scalingPolicies; 
            private String securityMode; 
            private SubscriptionConfig subscriptionConfig; 
            private java.util.List < Tag > tags; 

            /**
             * The modified configuration items.
             */
            public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
                this.applicationConfigs = applicationConfigs;
                return this;
            }

            /**
             * The services deployed in the cluster.
             */
            public Builder applications(java.util.List < Application > applications) {
                this.applications = applications;
                return this;
            }

            /**
             * The bootstrap actions. Number of elements in the array: 1 to 10.
             */
            public Builder bootstrapScripts(java.util.List < Script > bootstrapScripts) {
                this.bootstrapScripts = bootstrapScripts;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   STARTING
             * *   START_FAILED
             * *   BOOTSTRAPPING
             * *   RUNNING
             * *   TERMINATING
             * *   TERMINATED
             * *   TERMINATED_WITH_ERRORS
             * *   TERMINATE_FAILED
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * The cluster type. Valid values:
             * <p>
             * 
             * *   DATALAKE
             * *   OLAP
             * *   DATAFLOW
             * *   DATASERVING
             * *   CUSTOM
             * *   HADOOP
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The deployment mode of master nodes in the cluster. Valid values:
             * <p>
             * 
             * *   NORMAL: regular mode.
             * *   HA: high availability mode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * The EMR service role.
             */
            public Builder emrDefaultRole(String emrDefaultRole) {
                this.emrDefaultRole = emrDefaultRole;
                return this;
            }

            /**
             * Indicates whether the service configurations of a Hadoop cluster that you made during cluster creation can be cloned. Valid values:
             * <p>
             * 
             * *   False
             * *   True
             */
            public Builder existCloneConfig(Boolean existCloneConfig) {
                this.existCloneConfig = existCloneConfig;
                return this;
            }

            /**
             * The attributes of the node.
             */
            public Builder nodeAttributes(NodeAttributes nodeAttributes) {
                this.nodeAttributes = nodeAttributes;
                return this;
            }

            /**
             * The node groups. Number of elements in the array: 1 to 100.
             */
            public Builder nodeGroups(java.util.List < NodeGroup > nodeGroups) {
                this.nodeGroups = nodeGroups;
                return this;
            }

            /**
             * The billing method of the cluster. Valid values:
             * <p>
             * 
             * *   PayAsYouGo
             * *   Subscription
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The EMR version.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The auto scaling policies of each node group in the cluster.
             */
            public Builder scalingPolicies(java.util.List < ScalingPolicies> scalingPolicies) {
                this.scalingPolicies = scalingPolicies;
                return this;
            }

            /**
             * The security mode of the cluster. Valid values:
             * <p>
             * 
             * *   NORMAL: regular mode. Kerberos is not enabled.
             * *   KERBEROS: Kerberos mode. Kerberos is enabled.
             */
            public Builder securityMode(String securityMode) {
                this.securityMode = securityMode;
                return this;
            }

            /**
             * The subscription configurations.
             */
            public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
                this.subscriptionConfig = subscriptionConfig;
                return this;
            }

            /**
             * The list of tags.
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            public ClusterCloneMeta build() {
                return new ClusterCloneMeta(this);
            } 

        } 

    }
}
