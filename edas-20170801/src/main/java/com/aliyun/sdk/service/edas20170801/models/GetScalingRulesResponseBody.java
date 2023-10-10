// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetScalingRulesResponseBody</p>
 */
public class GetScalingRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpdateTime")
    private Long updateTime;

    private GetScalingRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScalingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Long updateTime; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the scaling rule was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetScalingRulesResponseBody build() {
            return new GetScalingRulesResponseBody(this);
        } 

    } 

    public static class Rule extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Cond")
        private String cond;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("InstNum")
        private Integer instNum;

        @NameInMap("LoadNum")
        private Integer loadNum;

        @NameInMap("MetricType")
        private String metricType;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("MultiAzPolicy")
        private String multiAzPolicy;

        @NameInMap("ResourceFrom")
        private String resourceFrom;

        @NameInMap("Rt")
        private Integer rt;

        @NameInMap("SpecId")
        private String specId;

        @NameInMap("Step")
        private Integer step;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateVersion")
        private Integer templateVersion;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VSwitchIds")
        private String vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        private Rule(Builder builder) {
            this.appId = builder.appId;
            this.cond = builder.cond;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.enable = builder.enable;
            this.groupId = builder.groupId;
            this.instNum = builder.instNum;
            this.loadNum = builder.loadNum;
            this.metricType = builder.metricType;
            this.mode = builder.mode;
            this.multiAzPolicy = builder.multiAzPolicy;
            this.resourceFrom = builder.resourceFrom;
            this.rt = builder.rt;
            this.specId = builder.specId;
            this.step = builder.step;
            this.templateId = builder.templateId;
            this.templateVersion = builder.templateVersion;
            this.updateTime = builder.updateTime;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return instNum
         */
        public Integer getInstNum() {
            return this.instNum;
        }

        /**
         * @return loadNum
         */
        public Integer getLoadNum() {
            return this.loadNum;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return multiAzPolicy
         */
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        /**
         * @return resourceFrom
         */
        public String getResourceFrom() {
            return this.resourceFrom;
        }

        /**
         * @return rt
         */
        public Integer getRt() {
            return this.rt;
        }

        /**
         * @return specId
         */
        public String getSpecId() {
            return this.specId;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateVersion
         */
        public Integer getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vSwitchIds
         */
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String appId; 
            private String cond; 
            private Integer cpu; 
            private Long createTime; 
            private Integer duration; 
            private Boolean enable; 
            private String groupId; 
            private Integer instNum; 
            private Integer loadNum; 
            private String metricType; 
            private String mode; 
            private String multiAzPolicy; 
            private String resourceFrom; 
            private Integer rt; 
            private String specId; 
            private Integer step; 
            private String templateId; 
            private Integer templateVersion; 
            private Long updateTime; 
            private String vSwitchIds; 
            private String vpcId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The relationship among the conditions that trigger the scaling rule.
             * <p>
             * 
             * *   OR: one of the conditions
             * *   AND: all conditions
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * The minimum CPU utilization that triggers the scaling rule.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the scaling rule was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The duration of the scaling rule. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Indicates whether scale-ins or scale-outs are allowed. Valid values:
             * <p>
             * 
             * *   true: Scale-ins or scale-outs are allowed.
             * *   false: Scale-ins or scale-outs are disallowed.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The ID of the instance group to which the application is deployed.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The maximum number of instances in the group when a scale-out is performed, or the minimum number of instances in the group when a scale-in is performed.
             */
            public Builder instNum(Integer instNum) {
                this.instNum = instNum;
                return this;
            }

            /**
             * The system load that triggers the scaling rule. The system load is evaluated based on the number of processes that are being executed by CPUs and the number of processes that wait to be executed by CPUs.
             */
            public Builder loadNum(Integer loadNum) {
                this.loadNum = loadNum;
                return this;
            }

            /**
             * The type of the metric.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * The type of the scaling rule. Valid values:
             * <p>
             * 
             * *   SCALE_IN: scale-in rules
             * *   SCALE_OUT: scale-out rules
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The policy of auto scaling across multiple zones. Valid values:
             * <p>
             * 
             * *   PRIORITY: The vSwitch that is first selected has the highest priority.
             * *   BALANCE: This policy evenly distributes instances across zones in which the vSwitches reside.
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * The source of the instance that you want to add during a scale-out. Valid values:
             * <p>
             * 
             * *   NEW: Elastic resources are used.
             * *   AVAILABLE: The existing resources are used.
             * *   AVAILABLE_FIRST: The existing resources are used first.
             */
            public Builder resourceFrom(String resourceFrom) {
                this.resourceFrom = resourceFrom;
                return this;
            }

            /**
             * The service latency that triggers the scaling rule. Unit: milliseconds.
             */
            public Builder rt(Integer rt) {
                this.rt = rt;
                return this;
            }

            /**
             * The ID of the specification.
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * The number of instances that are added during each scale-out or removed during each scale-in.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * The ID of the launch template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The version of the launch template.
             */
            public Builder templateVersion(Integer templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The time when the scaling rule was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The IDs of the vSwitches. The IDs of multiple vSwitches are separated by commas (,).
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @NameInMap("Rule")
        private java.util.List < Rule> rule;

        private RuleList(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List < Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < Rule> rule) {
                this.rule = rule;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ClusterType")
        private Integer clusterType;

        @NameInMap("OversoldFactor")
        private Integer oversoldFactor;

        @NameInMap("RuleList")
        private RuleList ruleList;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.clusterType = builder.clusterType;
            this.oversoldFactor = builder.oversoldFactor;
            this.ruleList = builder.ruleList;
            this.updateTime = builder.updateTime;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return oversoldFactor
         */
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        /**
         * @return ruleList
         */
        public RuleList getRuleList() {
            return this.ruleList;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer clusterType; 
            private Integer oversoldFactor; 
            private RuleList ruleList; 
            private Long updateTime; 
            private String vpcId; 

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   0: regular Docker cluster
             * *   1: Swarm cluster (deprecated)
             * *   2: Elastic Compute Service (ECS) cluster
             * *   3: self-managed Kubernetes cluster in EDAS
             * *   4: cluster in which Pandora automatically registers applications
             * *   5: Container Service for Kubernetes (ACK) clusters
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The overcommit ratio supported by a Docker cluster. Valid values:
             * <p>
             * 
             * *   1: 1:1, which means that resources are not overcommitted.
             * *   2: 1:2, which means that resources are overcommitted by 1:2.
             * *   4: 1:4, which means that resources are overcommitted by 1:4.
             * *   8: 1:8, which means that resources are overcommitted by 1:8.
             */
            public Builder oversoldFactor(Integer oversoldFactor) {
                this.oversoldFactor = oversoldFactor;
                return this;
            }

            /**
             * The array data of the scaling rule.
             */
            public Builder ruleList(RuleList ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * The time when the scaling rule was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
