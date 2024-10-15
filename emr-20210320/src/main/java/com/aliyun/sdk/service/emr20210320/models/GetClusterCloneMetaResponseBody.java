// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The metadata of the cluster that you want to clone.</p>
         */
        public Builder clusterCloneMeta(ClusterCloneMeta clusterCloneMeta) {
            this.clusterCloneMeta = clusterCloneMeta;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterCloneMetaResponseBody build() {
            return new GetClusterCloneMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterCloneMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterCloneMetaResponseBody</p>
     */
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
             * <p>The maximum number of nodes in the node group. Default value: 2000.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of nodes in the node group. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
    /**
     * 
     * {@link GetClusterCloneMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterCloneMetaResponseBody</p>
     */
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
             * <p>The scaling type. This parameter is required. Valid values:</p>
             * <ul>
             * <li>SCALE_OUT</li>
             * <li>SCALE_IN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SCALE_OUT</p>
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * <p>The adjustment value of the auto scaling rule. This parameter is required. The parameter value must be a positive integer, which indicates the number of instances to be added or removed.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * <p>The description of load-based scaling.</p>
             */
            public Builder metricsTrigger(MetricsTrigger metricsTrigger) {
                this.metricsTrigger = metricsTrigger;
                return this;
            }

            /**
             * <p>The name of the auto scaling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>scaling-out-memory</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The description of time-based scaling.</p>
             */
            public Builder timeTrigger(TimeTrigger timeTrigger) {
                this.timeTrigger = timeTrigger;
                return this;
            }

            /**
             * <p>The trigger mode of the auto scaling rule. This parameter is required. Valid values:</p>
             * <ul>
             * <li>TIME_TRIGGER: time-based scaling.</li>
             * <li>METRICS_TRIGGER: load-based scaling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TIME_TRIGGER</p>
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
    /**
     * 
     * {@link GetClusterCloneMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterCloneMetaResponseBody</p>
     */
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
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-b933c5aac8fe****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The maximum and minimum number of nodes in the node group.</p>
             */
            public Builder constraints(Constraints constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * <p>The node group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-869471354ecd****</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The ID of the auto scaling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>asp-asduwe23znl***</p>
             */
            public Builder scalingPolicyId(String scalingPolicyId) {
                this.scalingPolicyId = scalingPolicyId;
                return this;
            }

            /**
             * <p>The list of auto scaling rules.</p>
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
    /**
     * 
     * {@link GetClusterCloneMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterCloneMetaResponseBody</p>
     */
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
             * <p>The modified configuration items.</p>
             */
            public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
                this.applicationConfigs = applicationConfigs;
                return this;
            }

            /**
             * <p>The services deployed in the cluster.</p>
             */
            public Builder applications(java.util.List < Application > applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The bootstrap actions. Number of elements in the array: 1 to 10.</p>
             */
            public Builder bootstrapScripts(java.util.List < Script > bootstrapScripts) {
                this.bootstrapScripts = bootstrapScripts;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-b933c5aac7f7****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>emrtest</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>STARTING</li>
             * <li>START_FAILED</li>
             * <li>BOOTSTRAPPING</li>
             * <li>RUNNING</li>
             * <li>TERMINATING</li>
             * <li>TERMINATED</li>
             * <li>TERMINATED_WITH_ERRORS</li>
             * <li>TERMINATE_FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * <p>The cluster type. Valid values:</p>
             * <ul>
             * <li>DATALAKE</li>
             * <li>OLAP</li>
             * <li>DATAFLOW</li>
             * <li>DATASERVING</li>
             * <li>CUSTOM</li>
             * <li>HADOOP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATALAKE</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The deployment mode of master nodes in the cluster. Valid values:</p>
             * <ul>
             * <li>NORMAL: regular mode.</li>
             * <li>HA: high availability mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HA</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The EMR service role.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunEMRDefaultRole</p>
             */
            public Builder emrDefaultRole(String emrDefaultRole) {
                this.emrDefaultRole = emrDefaultRole;
                return this;
            }

            /**
             * <p>Indicates whether the service configurations of a Hadoop cluster that you made during cluster creation can be cloned. Valid values:</p>
             * <ul>
             * <li>False</li>
             * <li>True</li>
             * </ul>
             */
            public Builder existCloneConfig(Boolean existCloneConfig) {
                this.existCloneConfig = existCloneConfig;
                return this;
            }

            /**
             * <p>The attributes of the node.</p>
             */
            public Builder nodeAttributes(NodeAttributes nodeAttributes) {
                this.nodeAttributes = nodeAttributes;
                return this;
            }

            /**
             * <p>The node groups. Number of elements in the array: 1 to 100.</p>
             */
            public Builder nodeGroups(java.util.List < NodeGroup > nodeGroups) {
                this.nodeGroups = nodeGroups;
                return this;
            }

            /**
             * <p>The billing method of the cluster. Valid values:</p>
             * <ul>
             * <li>PayAsYouGo</li>
             * <li>Subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The EMR version.</p>
             * 
             * <strong>example:</strong>
             * <p>EMR-5.6.0</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzabjyop****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The auto scaling policies of each node group in the cluster.</p>
             */
            public Builder scalingPolicies(java.util.List < ScalingPolicies> scalingPolicies) {
                this.scalingPolicies = scalingPolicies;
                return this;
            }

            /**
             * <p>The security mode of the cluster. Valid values:</p>
             * <ul>
             * <li>NORMAL: regular mode. Kerberos is not enabled.</li>
             * <li>KERBEROS: Kerberos mode. Kerberos is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder securityMode(String securityMode) {
                this.securityMode = securityMode;
                return this;
            }

            /**
             * <p>The subscription configurations.</p>
             */
            public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
                this.subscriptionConfig = subscriptionConfig;
                return this;
            }

            /**
             * <p>The list of tags.</p>
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
