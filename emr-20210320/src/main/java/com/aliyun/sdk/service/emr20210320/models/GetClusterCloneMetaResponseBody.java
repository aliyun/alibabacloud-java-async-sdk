// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterCloneMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterCloneMetaResponseBody</p>
 */
public class GetClusterCloneMetaResponseBody extends TeaModel {
    @NameInMap("ClusterCloneMeta")
    private ClusterCloneMeta clusterCloneMeta;

    @NameInMap("RequestId")
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
         * ClusterCloneMeta.
         */
        public Builder clusterCloneMeta(ClusterCloneMeta clusterCloneMeta) {
            this.clusterCloneMeta = clusterCloneMeta;
            return this;
        }

        /**
         * 请求ID。
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
        @NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @NameInMap("MinCapacity")
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
             * 最大值
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * 最小值
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
        @NameInMap("ActivityType")
        private String activityType;

        @NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @NameInMap("MetricsTrigger")
        private MetricsTrigger metricsTrigger;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("TimeTrigger")
        private TimeTrigger timeTrigger;

        @NameInMap("TriggerType")
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
             * 伸缩类型。取值范围：
             * <p>
             * - SCALE_OUT：扩容
             * - SCALE_IN：缩容
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * 调整值。需要为正数，代表需要扩容或者缩容的实例数量。
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * 按照负载伸缩描述。
             */
            public Builder metricsTrigger(MetricsTrigger metricsTrigger) {
                this.metricsTrigger = metricsTrigger;
                return this;
            }

            /**
             * 弹性伸缩规则名称。
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * 按照时间伸缩描述。
             */
            public Builder timeTrigger(TimeTrigger timeTrigger) {
                this.timeTrigger = timeTrigger;
                return this;
            }

            /**
             * 伸缩规则类型。取值范围：
             * <p>
             * - TIME_TRIGGER: 按时间伸缩。
             * - METRICS_TRIGGER: 按负载伸缩。
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
    public static class ScalingPolicyDTOS extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Constraints")
        private Constraints constraints;

        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("ScalingPolicyId")
        private String scalingPolicyId;

        @NameInMap("ScalingRules")
        private java.util.List < ScalingRules> scalingRules;

        private ScalingPolicyDTOS(Builder builder) {
            this.clusterId = builder.clusterId;
            this.constraints = builder.constraints;
            this.nodeGroupId = builder.nodeGroupId;
            this.scalingPolicyId = builder.scalingPolicyId;
            this.scalingRules = builder.scalingRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingPolicyDTOS create() {
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
             * 集群ID。
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 最大最小值约束
             */
            public Builder constraints(Constraints constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * 节点组ID。
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * 伸缩策略ID。
             */
            public Builder scalingPolicyId(String scalingPolicyId) {
                this.scalingPolicyId = scalingPolicyId;
                return this;
            }

            /**
             * 伸缩规则列表
             */
            public Builder scalingRules(java.util.List < ScalingRules> scalingRules) {
                this.scalingRules = scalingRules;
                return this;
            }

            public ScalingPolicyDTOS build() {
                return new ScalingPolicyDTOS(this);
            } 

        } 

    }
    public static class ClusterCloneMeta extends TeaModel {
        @NameInMap("ApplicationConfigs")
        private java.util.List < ApplicationConfig > applicationConfigs;

        @NameInMap("Applications")
        private java.util.List < Application > applications;

        @NameInMap("BootstrapScripts")
        private java.util.List < Script > bootstrapScripts;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterState")
        private String clusterState;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("EmrDefaultRole")
        private String emrDefaultRole;

        @NameInMap("ExistCloneConfig")
        private Boolean existCloneConfig;

        @NameInMap("MetaStoreType")
        private String metaStoreType;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("NodeAttributes")
        private NodeAttributes nodeAttributes;

        @NameInMap("NodeGroups")
        private java.util.List < NodeGroup > nodeGroups;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReleaseVersion")
        private String releaseVersion;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ScalingPolicyDTOS")
        private java.util.List < ScalingPolicyDTOS> scalingPolicyDTOS;

        @NameInMap("SecurityMode")
        private String securityMode;

        @NameInMap("SubscriptionConfig")
        private SubscriptionConfig subscriptionConfig;

        @NameInMap("Tags")
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
            this.metaStoreType = builder.metaStoreType;
            this.networkType = builder.networkType;
            this.nodeAttributes = builder.nodeAttributes;
            this.nodeGroups = builder.nodeGroups;
            this.paymentType = builder.paymentType;
            this.regionId = builder.regionId;
            this.releaseVersion = builder.releaseVersion;
            this.resourceGroupId = builder.resourceGroupId;
            this.scalingPolicyDTOS = builder.scalingPolicyDTOS;
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
         * @return metaStoreType
         */
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
         * @return scalingPolicyDTOS
         */
        public java.util.List < ScalingPolicyDTOS> getScalingPolicyDTOS() {
            return this.scalingPolicyDTOS;
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
            private String metaStoreType; 
            private String networkType; 
            private NodeAttributes nodeAttributes; 
            private java.util.List < NodeGroup > nodeGroups; 
            private String paymentType; 
            private String regionId; 
            private String releaseVersion; 
            private String resourceGroupId; 
            private java.util.List < ScalingPolicyDTOS> scalingPolicyDTOS; 
            private String securityMode; 
            private SubscriptionConfig subscriptionConfig; 
            private java.util.List < Tag > tags; 

            /**
             * 创建集群时的服务配置项。创建集群时需要记录用户传入的配置项参数key，返回集群最新的配置项值。
             */
            public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
                this.applicationConfigs = applicationConfigs;
                return this;
            }

            /**
             * 集群应用。
             */
            public Builder applications(java.util.List < Application > applications) {
                this.applications = applications;
                return this;
            }

            /**
             * BootstrapScripts.
             */
            public Builder bootstrapScripts(java.util.List < Script > bootstrapScripts) {
                this.bootstrapScripts = bootstrapScripts;
                return this;
            }

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
             * 部署模式。
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
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
             * ExistCloneConfig.
             */
            public Builder existCloneConfig(Boolean existCloneConfig) {
                this.existCloneConfig = existCloneConfig;
                return this;
            }

            /**
             * 元数据类型。
             */
            public Builder metaStoreType(String metaStoreType) {
                this.metaStoreType = metaStoreType;
                return this;
            }

            /**
             * 网络类型。
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * NodeGroups.
             */
            public Builder nodeGroups(java.util.List < NodeGroup > nodeGroups) {
                this.nodeGroups = nodeGroups;
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
             * ScalingPolicyDTOS.
             */
            public Builder scalingPolicyDTOS(java.util.List < ScalingPolicyDTOS> scalingPolicyDTOS) {
                this.scalingPolicyDTOS = scalingPolicyDTOS;
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
             * 预付费配置。
             */
            public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
                this.subscriptionConfig = subscriptionConfig;
                return this;
            }

            /**
             * Tags.
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
