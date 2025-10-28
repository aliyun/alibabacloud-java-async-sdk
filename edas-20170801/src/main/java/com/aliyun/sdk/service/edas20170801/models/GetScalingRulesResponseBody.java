// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetScalingRulesResponseBody</p>
 */
public class GetScalingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetScalingRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-***********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the scaling rule was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1574251601785</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetScalingRulesResponseBody build() {
            return new GetScalingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetScalingRulesResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InstNum")
        private Integer instNum;

        @com.aliyun.core.annotation.NameInMap("LoadNum")
        private Integer loadNum;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("MultiAzPolicy")
        private String multiAzPolicy;

        @com.aliyun.core.annotation.NameInMap("ResourceFrom")
        private String resourceFrom;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private Integer rt;

        @com.aliyun.core.annotation.NameInMap("SpecId")
        private String specId;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private Integer templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private String vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(Rule model) {
                this.appId = model.appId;
                this.cond = model.cond;
                this.cpu = model.cpu;
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.enable = model.enable;
                this.groupId = model.groupId;
                this.instNum = model.instNum;
                this.loadNum = model.loadNum;
                this.metricType = model.metricType;
                this.mode = model.mode;
                this.multiAzPolicy = model.multiAzPolicy;
                this.resourceFrom = model.resourceFrom;
                this.rt = model.rt;
                this.specId = model.specId;
                this.step = model.step;
                this.templateId = model.templateId;
                this.templateVersion = model.templateVersion;
                this.updateTime = model.updateTime;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>33e39be9-3e5f-*********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The relationship among the conditions that trigger the scaling rule.</p>
             * <ul>
             * <li>OR: one of the conditions</li>
             * <li>AND: all conditions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OR</p>
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * <p>The minimum CPU utilization that triggers the scaling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the scaling rule was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1574251601801</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The duration of the scaling rule. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1574251601</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether scale-ins or scale-outs are allowed. Valid values:</p>
             * <ul>
             * <li>true: Scale-ins or scale-outs are allowed.</li>
             * <li>false: Scale-ins or scale-outs are disallowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The ID of the instance group to which the application is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>d8bb9d60-91b5-4cdf-<strong><strong>-</strong></strong>********</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The maximum number of instances in the group when a scale-out is performed, or the minimum number of instances in the group when a scale-in is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder instNum(Integer instNum) {
                this.instNum = instNum;
                return this;
            }

            /**
             * <p>The system load that triggers the scaling rule. The system load is evaluated based on the number of processes that are being executed by CPUs and the number of processes that wait to be executed by CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder loadNum(Integer loadNum) {
                this.loadNum = loadNum;
                return this;
            }

            /**
             * <p>The type of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>HSF</p>
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * <p>The type of the scaling rule. Valid values:</p>
             * <ul>
             * <li>SCALE_IN: scale-in rules</li>
             * <li>SCALE_OUT: scale-out rules</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SCALE_OUT</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The policy of auto scaling across multiple zones. Valid values:</p>
             * <ul>
             * <li>PRIORITY: The vSwitch that is first selected has the highest priority.</li>
             * <li>BALANCE: This policy evenly distributes instances across zones in which the vSwitches reside.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * <p>The source of the instance that you want to add during a scale-out. Valid values:</p>
             * <ul>
             * <li>NEW: Elastic resources are used.</li>
             * <li>AVAILABLE: The existing resources are used.</li>
             * <li>AVAILABLE_FIRST: The existing resources are used first.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder resourceFrom(String resourceFrom) {
                this.resourceFrom = resourceFrom;
                return this;
            }

            /**
             * <p>The service latency that triggers the scaling rule. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rt(Integer rt) {
                this.rt = rt;
                return this;
            }

            /**
             * <p>The ID of the specification.</p>
             * 
             * <strong>example:</strong>
             * <p>03f493c0-xxxx-xxxx-xxxx-12e85cadeb41</p>
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * <p>The number of instances that are added during each scale-out or removed during each scale-in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * <p>The ID of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-bp1xxxxn73pxxxxf83l</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The version of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>1143542</p>
             */
            public Builder templateVersion(Integer templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The time when the scaling rule was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1574251601785</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches. The IDs of multiple vSwitches are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-mxxxxkxxxx4xxxxwbionj</p>
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9b246z******</p>
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
    /**
     * 
     * {@link GetScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetScalingRulesResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

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
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<Rule> rule; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.rule = model.rule;
            } 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetScalingRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("OversoldFactor")
        private Integer oversoldFactor;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private RuleList ruleList;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterType = model.clusterType;
                this.oversoldFactor = model.oversoldFactor;
                this.ruleList = model.ruleList;
                this.updateTime = model.updateTime;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li>0: regular Docker cluster</li>
             * <li>1: Swarm cluster (deprecated)</li>
             * <li>2: Elastic Compute Service (ECS) cluster</li>
             * <li>3: self-managed Kubernetes cluster in EDAS</li>
             * <li>4: cluster in which Pandora automatically registers applications</li>
             * <li>5: Container Service for Kubernetes (ACK) clusters</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The overcommit ratio supported by a Docker cluster. Valid values:</p>
             * <ul>
             * <li>1: 1:1, which means that resources are not overcommitted.</li>
             * <li>2: 1:2, which means that resources are overcommitted by 1:2.</li>
             * <li>4: 1:4, which means that resources are overcommitted by 1:4.</li>
             * <li>8: 1:8, which means that resources are overcommitted by 1:8.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder oversoldFactor(Integer oversoldFactor) {
                this.oversoldFactor = oversoldFactor;
                return this;
            }

            /**
             * <p>The array data of the scaling rule.</p>
             */
            public Builder ruleList(RuleList ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * <p>The time when the scaling rule was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1574251601785</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9b246z******</p>
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
