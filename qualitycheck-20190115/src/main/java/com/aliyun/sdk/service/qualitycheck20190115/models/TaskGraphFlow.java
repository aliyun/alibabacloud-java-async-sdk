// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TaskGraphFlow} extends {@link TeaModel}
 *
 * <p>TaskGraphFlow</p>
 */
public class TaskGraphFlow extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowRuleScoreType")
    private Integer flowRuleScoreType;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List < GraphFlowNode > nodes;

    @com.aliyun.core.annotation.NameInMap("Rid")
    private Long rid;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("ShowProperties")
    private String showProperties;

    @com.aliyun.core.annotation.NameInMap("SkipWhenFirstSessionNodeMiss")
    private Boolean skipWhenFirstSessionNodeMiss;

    private TaskGraphFlow(Builder builder) {
        this.flowRuleScoreType = builder.flowRuleScoreType;
        this.id = builder.id;
        this.nodes = builder.nodes;
        this.rid = builder.rid;
        this.ruleName = builder.ruleName;
        this.showProperties = builder.showProperties;
        this.skipWhenFirstSessionNodeMiss = builder.skipWhenFirstSessionNodeMiss;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskGraphFlow create() {
        return builder().build();
    }

    /**
     * @return flowRuleScoreType
     */
    public Integer getFlowRuleScoreType() {
        return this.flowRuleScoreType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return nodes
     */
    public java.util.List < GraphFlowNode > getNodes() {
        return this.nodes;
    }

    /**
     * @return rid
     */
    public Long getRid() {
        return this.rid;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return showProperties
     */
    public String getShowProperties() {
        return this.showProperties;
    }

    /**
     * @return skipWhenFirstSessionNodeMiss
     */
    public Boolean getSkipWhenFirstSessionNodeMiss() {
        return this.skipWhenFirstSessionNodeMiss;
    }

    public static final class Builder {
        private Integer flowRuleScoreType; 
        private Long id; 
        private java.util.List < GraphFlowNode > nodes; 
        private Long rid; 
        private String ruleName; 
        private String showProperties; 
        private Boolean skipWhenFirstSessionNodeMiss; 

        /**
         * FlowRuleScoreType.
         */
        public Builder flowRuleScoreType(Integer flowRuleScoreType) {
            this.flowRuleScoreType = flowRuleScoreType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < GraphFlowNode > nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * Rid.
         */
        public Builder rid(Long rid) {
            this.rid = rid;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * ShowProperties.
         */
        public Builder showProperties(String showProperties) {
            this.showProperties = showProperties;
            return this;
        }

        /**
         * SkipWhenFirstSessionNodeMiss.
         */
        public Builder skipWhenFirstSessionNodeMiss(Boolean skipWhenFirstSessionNodeMiss) {
            this.skipWhenFirstSessionNodeMiss = skipWhenFirstSessionNodeMiss;
            return this;
        }

        public TaskGraphFlow build() {
            return new TaskGraphFlow(this);
        } 

    } 

}
