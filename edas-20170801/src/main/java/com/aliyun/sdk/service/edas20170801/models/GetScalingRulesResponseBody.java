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
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * InstNum.
             */
            public Builder instNum(Integer instNum) {
                this.instNum = instNum;
                return this;
            }

            /**
             * LoadNum.
             */
            public Builder loadNum(Integer loadNum) {
                this.loadNum = loadNum;
                return this;
            }

            /**
             * MetricType.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * MultiAzPolicy.
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * ResourceFrom.
             */
            public Builder resourceFrom(String resourceFrom) {
                this.resourceFrom = resourceFrom;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(Integer rt) {
                this.rt = rt;
                return this;
            }

            /**
             * SpecId.
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(Integer templateVersion) {
                this.templateVersion = templateVersion;
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
             * VSwitchIds.
             */
            public Builder vSwitchIds(String vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
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
             * <li><p>0: regular Docker cluster</p>
             * </li>
             * <li><p>1: Swarm cluster (deprecated)</p>
             * </li>
             * <li><p>2: Elastic Compute Service (ECS) cluster</p>
             * </li>
             * <li><p>3: self-managed Kubernetes cluster in EDAS</p>
             * </li>
             * <li><p>4: cluster in which Pandora automatically registers applications</p>
             * </li>
             * <li><p>5: Container Service for Kubernetes (ACK) clusters</p>
             * </li>
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
             * <li><p>1: 1:1, which means that resources are not overcommitted.</p>
             * </li>
             * <li><p>2: 1:2, which means that resources are overcommitted by 1:2.</p>
             * </li>
             * <li><p>4: 1:4, which means that resources are overcommitted by 1:4.</p>
             * </li>
             * <li><p>8: 1:8, which means that resources are overcommitted by 1:8.</p>
             * </li>
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
             * RuleList.
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
