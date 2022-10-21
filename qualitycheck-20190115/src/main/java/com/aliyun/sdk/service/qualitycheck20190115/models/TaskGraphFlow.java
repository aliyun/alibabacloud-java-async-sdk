// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskGraphFlow} extends {@link TeaModel}
 *
 * <p>TaskGraphFlow</p>
 */
public class TaskGraphFlow extends TeaModel {
    @NameInMap("FlowRuleScoreType")
    private Integer flowRuleScoreType;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Nodes")
    private java.util.List < GraphFlowNode > nodes;

    @NameInMap("Rid")
    private Long rid;

    @NameInMap("RuleName")
    private String ruleName;

    @NameInMap("ShowProperties")
    private String showProperties;

    @NameInMap("SkipWhenFirstSessionNodeMiss")
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
         * 流程计分逻辑设置
         */
        public Builder flowRuleScoreType(Integer flowRuleScoreType) {
            this.flowRuleScoreType = flowRuleScoreType;
            return this;
        }

        /**
         * 流程画布id
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 流程所有节点
         */
        public Builder nodes(java.util.List < GraphFlowNode > nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * 规则ID
         */
        public Builder rid(Long rid) {
            this.rid = rid;
            return this;
        }

        /**
         * 规则名称
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * 前端展示使用
         */
        public Builder showProperties(String showProperties) {
            this.showProperties = showProperties;
            return this;
        }

        /**
         * 首个对话节点未命中则跳过
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
