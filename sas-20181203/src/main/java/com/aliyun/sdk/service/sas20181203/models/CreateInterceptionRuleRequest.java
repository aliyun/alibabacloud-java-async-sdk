// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.Map<String, ?> dstTargetList;

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
    private java.util.Map<String, ?> srcTarget;

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
    public java.util.Map<String, ?> getDstTargetList() {
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
    public java.util.Map<String, ?> getSrcTarget() {
        return this.srcTarget;
    }

    public static final class Builder extends Request.Builder<CreateInterceptionRuleRequest, Builder> {
        private String clusterId; 
        private String clusterName; 
        private java.util.Map<String, ?> dstTargetList; 
        private Long interceptType; 
        private Long orderIndex; 
        private String ruleName; 
        private Integer ruleSwitch; 
        private String ruleType; 
        private java.util.Map<String, ?> srcTarget; 

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
         * <p>The ID of the container cluster to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter must be from an ACK cluster. You can call the DescribeClustersV1 operation of Container Service for Kubernetes (ACK) to query existing clusters, or call the CreateCluster operation to create a cluster, and then call the DescribeGroupedContainerInstances operation of Security Center to obtain the ID of a managed cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c35xxxa416</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-test-cnnf</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The list of destination objects. The metric descriptions are as follows:</p>
         * <ul>
         * <li>targetId: The ID of the destination object. You can invoke the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain this parameter.</li>
         * <li>ports: The list of destination port ranges.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;targetId&quot;: 600036,
         *             &quot;ports&quot;: [
         *                   &quot;1/65535&quot;
         *             ]
         *       }
         * ]</p>
         */
        public Builder dstTargetList(java.util.Map<String, ?> dstTargetList) {
            String dstTargetListShrink = shrink(dstTargetList, "DstTargetList", "json");
            this.putQueryParameter("DstTargetList", dstTargetListShrink);
            this.dstTargetList = dstTargetList;
            return this;
        }

        /**
         * <p>The interception mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Block Mode.</li>
         * <li><strong>2</strong>: Alert mode.</li>
         * <li><strong>3</strong>: Allow mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interceptType(Long interceptType) {
            this.putQueryParameter("InterceptType", interceptType);
            this.interceptType = interceptType;
            return this;
        }

        /**
         * <p>The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rule-1</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>customize: user-defined rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The source object. The metric description is as follows:</p>
         * <ul>
         * <li>targetId: The ID of the source object. You can invoke the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;targetId&quot;:301940}</p>
         */
        public Builder srcTarget(java.util.Map<String, ?> srcTarget) {
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
