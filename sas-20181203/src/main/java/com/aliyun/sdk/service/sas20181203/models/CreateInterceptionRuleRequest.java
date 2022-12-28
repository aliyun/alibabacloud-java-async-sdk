// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterceptionRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateInterceptionRuleRequest</p>
 */
public class CreateInterceptionRuleRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    @Validation(required = true)
    private String clusterName;

    @Query
    @NameInMap("DstTargetList")
    private java.util.Map < String, ? > dstTargetList;

    @Query
    @NameInMap("InterceptType")
    @Validation(required = true)
    private Long interceptType;

    @Query
    @NameInMap("OrderIndex")
    @Validation(required = true)
    private Long orderIndex;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("RuleSwitch")
    @Validation(required = true)
    private Integer ruleSwitch;

    @Query
    @NameInMap("RuleType")
    private String ruleType;

    @Query
    @NameInMap("SrcTarget")
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * DstTargetList.
         */
        public Builder dstTargetList(java.util.Map < String, ? > dstTargetList) {
            String dstTargetListShrink = shrink(dstTargetList, "DstTargetList", "json");
            this.putQueryParameter("DstTargetList", dstTargetListShrink);
            this.dstTargetList = dstTargetList;
            return this;
        }

        /**
         * InterceptType.
         */
        public Builder interceptType(Long interceptType) {
            this.putQueryParameter("InterceptType", interceptType);
            this.interceptType = interceptType;
            return this;
        }

        /**
         * OrderIndex.
         */
        public Builder orderIndex(Long orderIndex) {
            this.putQueryParameter("OrderIndex", orderIndex);
            this.orderIndex = orderIndex;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleSwitch.
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * SrcTarget.
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
