// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterceptionRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateInterceptionRuleRequest</p>
 */
public class CreateInterceptionRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstTargetList")
    private java.util.Map < String, ? > dstTargetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterceptType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long interceptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ruleSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcTarget")
    private java.util.Map < String, ? > srcTarget;

    private CreateInterceptionRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.dstTargetList = builder.dstTargetList;
        this.interceptType = builder.interceptType;
        this.orderIndex = builder.orderIndex;
        this.ruleName = builder.ruleName;
        this.ruleSwitch = builder.ruleSwitch;
        this.ruleType = builder.ruleType;
        this.srcTarget = builder.srcTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInterceptionRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return dstTargetList
     */
    public java.util.Map < String, ? > getDstTargetList() {
        return this.dstTargetList;
    }

    /**
     * @return interceptType
     */
    public Long getInterceptType() {
        return this.interceptType;
    }

    /**
     * @return orderIndex
     */
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleSwitch
     */
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return srcTarget
     */
    public java.util.Map < String, ? > getSrcTarget() {
        return this.srcTarget;
    }

    public static final class Builder extends Request.Builder<CreateInterceptionRuleRequest, Builder> {
        private String clusterId; 
        private String clusterName; 
        private java.util.Map < String, ? > dstTargetList; 
        private Long interceptType; 
        private Long orderIndex; 
        private String ruleName; 
        private Integer ruleSwitch; 
        private String ruleType; 
        private java.util.Map < String, ? > srcTarget; 

        private Builder() {
            super();
        } 

        private Builder(CreateInterceptionRuleRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.dstTargetList = request.dstTargetList;
            this.interceptType = request.interceptType;
            this.orderIndex = request.orderIndex;
            this.ruleName = request.ruleName;
            this.ruleSwitch = request.ruleSwitch;
            this.ruleType = request.ruleType;
            this.srcTarget = request.srcTarget;
        } 

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The information about the destination network object. The value of this parameter contains the following fields:
         * <p>
         * 
         * *   targetId: the ID of the destination network object. You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to query the ID.
         * *   ports: the destination port ranges.
         */
        public Builder dstTargetList(java.util.Map < String, ? > dstTargetList) {
            String dstTargetListShrink = shrink(dstTargetList, "DstTargetList", "json");
            this.putQueryParameter("DstTargetList", dstTargetListShrink);
            this.dstTargetList = dstTargetList;
            return this;
        }

        /**
         * The action on traffic. Valid values:
         * <p>
         * 
         * *   **1**: blocks traffic.
         * *   **2**: allows traffic and generates alerts.
         * *   **3**: allows traffic and does not generate alerts.
         */
        public Builder interceptType(Long interceptType) {
            this.putQueryParameter("InterceptType", interceptType);
            this.interceptType = interceptType;
            return this;
        }

        /**
         * The priority of the defense rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.
         */
        public Builder orderIndex(Long orderIndex) {
            this.putQueryParameter("OrderIndex", orderIndex);
            this.orderIndex = orderIndex;
            return this;
        }

        /**
         * The name of the defense rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Specifies the status of the defense rule. Valid values:
         * <p>
         * 
         * *   **0**: disables the rule.
         * *   **1**: enables the rule.
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * The type of the defense rule. Valid values:
         * <p>
         * 
         * *   customize: custom rule
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The source network object. The value of this parameter contains the following field:
         * <p>
         * 
         * *   targetId: the ID of the source network object. You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to query the ID.
         */
        public Builder srcTarget(java.util.Map < String, ? > srcTarget) {
            String srcTargetShrink = shrink(srcTarget, "SrcTarget", "json");
            this.putQueryParameter("SrcTarget", srcTargetShrink);
            this.srcTarget = srcTarget;
            return this;
        }

        @Override
        public CreateInterceptionRuleRequest build() {
            return new CreateInterceptionRuleRequest(this);
        } 

    } 

}
