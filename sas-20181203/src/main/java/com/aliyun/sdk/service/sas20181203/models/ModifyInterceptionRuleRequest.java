// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInterceptionRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyInterceptionRuleRequest</p>
 */
public class ModifyInterceptionRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstTarget")
    private java.util.Map < String, ? > dstTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterceptType")
    private Integer interceptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderIndex")
    private Long orderIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSwitch")
    private Integer ruleSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcTarget")
    private java.util.Map < String, ? > srcTarget;

    private ModifyInterceptionRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dstTarget = builder.dstTarget;
        this.interceptType = builder.interceptType;
        this.orderIndex = builder.orderIndex;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleSwitch = builder.ruleSwitch;
        this.srcTarget = builder.srcTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInterceptionRuleRequest create() {
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
     * @return dstTarget
     */
    public java.util.Map < String, ? > getDstTarget() {
        return this.dstTarget;
    }

    /**
     * @return interceptType
     */
    public Integer getInterceptType() {
        return this.interceptType;
    }

    /**
     * @return orderIndex
     */
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
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
     * @return srcTarget
     */
    public java.util.Map < String, ? > getSrcTarget() {
        return this.srcTarget;
    }

    public static final class Builder extends Request.Builder<ModifyInterceptionRuleRequest, Builder> {
        private String clusterId; 
        private java.util.Map < String, ? > dstTarget; 
        private Integer interceptType; 
        private Long orderIndex; 
        private Long ruleId; 
        private String ruleName; 
        private Integer ruleSwitch; 
        private java.util.Map < String, ? > srcTarget; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInterceptionRuleRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dstTarget = request.dstTarget;
            this.interceptType = request.interceptType;
            this.orderIndex = request.orderIndex;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleSwitch = request.ruleSwitch;
            this.srcTarget = request.srcTarget;
        } 

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c17ef568f81884cdab402decd5fcd****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The destination objects of the rule. The following parameters are included:</p>
         * <ul>
         * <li>targetId: the ID of the destination object. You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the ID.</li>
         * <li>ports: the destination port ranges.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;targetId&quot;:600069,&quot;ports&quot;:[&quot;80/8088&quot;]}</p>
         */
        public Builder dstTarget(java.util.Map < String, ? > dstTarget) {
            String dstTargetShrink = shrink(dstTarget, "DstTarget", "json");
            this.putQueryParameter("DstTarget", dstTargetShrink);
            this.dstTarget = dstTarget;
            return this;
        }

        /**
         * <p>The interception mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: block</li>
         * <li><strong>2</strong>: alert</li>
         * <li><strong>3</strong>: allow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interceptType(Integer interceptType) {
            this.putQueryParameter("InterceptType", interceptType);
            this.interceptType = interceptType;
            return this;
        }

        /**
         * <p>The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderIndex(Long orderIndex) {
            this.putQueryParameter("OrderIndex", orderIndex);
            this.orderIndex = orderIndex;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500018</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tetsRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Specifies whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * <p>The source object of the rule. The following parameters are included:</p>
         * <ul>
         * <li>targetId: the ID of the source object. You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;targetId&quot;:400989}</p>
         */
        public Builder srcTarget(java.util.Map < String, ? > srcTarget) {
            String srcTargetShrink = shrink(srcTarget, "SrcTarget", "json");
            this.putQueryParameter("SrcTarget", srcTargetShrink);
            this.srcTarget = srcTarget;
            return this;
        }

        @Override
        public ModifyInterceptionRuleRequest build() {
            return new ModifyInterceptionRuleRequest(this);
        } 

    } 

}
