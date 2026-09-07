// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GraphFlowNode} extends {@link TeaModel}
 *
 * <p>GraphFlowNode</p>
 */
public class GraphFlowNode extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List<ConditionBasicInfo> conditions;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NextNodes")
    private java.util.List<NextNodes> nextNodes;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private Properties properties;

    @com.aliyun.core.annotation.NameInMap("Rid")
    private Long rid;

    @com.aliyun.core.annotation.NameInMap("UseConditions")
    private Boolean useConditions;

    private GraphFlowNode(Builder builder) {
        this.conditions = builder.conditions;
        this.content = builder.content;
        this.id = builder.id;
        this.index = builder.index;
        this.name = builder.name;
        this.nextNodes = builder.nextNodes;
        this.nodeType = builder.nodeType;
        this.properties = builder.properties;
        this.rid = builder.rid;
        this.useConditions = builder.useConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GraphFlowNode create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<ConditionBasicInfo> getConditions() {
        return this.conditions;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextNodes
     */
    public java.util.List<NextNodes> getNextNodes() {
        return this.nextNodes;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return properties
     */
    public Properties getProperties() {
        return this.properties;
    }

    /**
     * @return rid
     */
    public Long getRid() {
        return this.rid;
    }

    /**
     * @return useConditions
     */
    public Boolean getUseConditions() {
        return this.useConditions;
    }

    public static final class Builder {
        private java.util.List<ConditionBasicInfo> conditions; 
        private String content; 
        private Long id; 
        private Integer index; 
        private String name; 
        private java.util.List<NextNodes> nextNodes; 
        private String nodeType; 
        private Properties properties; 
        private Long rid; 
        private Boolean useConditions; 

        private Builder() {
        } 

        private Builder(GraphFlowNode model) {
            this.conditions = model.conditions;
            this.content = model.content;
            this.id = model.id;
            this.index = model.index;
            this.name = model.name;
            this.nextNodes = model.nextNodes;
            this.nodeType = model.nodeType;
            this.properties = model.properties;
            this.rid = model.rid;
            this.useConditions = model.useConditions;
        } 

        /**
         * <p>Operator information.</p>
         */
        public Builder conditions(java.util.List<ConditionBasicInfo> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>Used for frontend display.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Index</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>开始节点</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Child nodes</p>
         */
        public Builder nextNodes(java.util.List<NextNodes> nextNodes) {
            this.nextNodes = nextNodes;
            return this;
        }

        /**
         * <p>Node Type</p>
         * 
         * <strong>example:</strong>
         * <p>startNode</p>
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>Node properties</p>
         */
        public Builder properties(Properties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>Rule ID. \<code>rid\\</code> is empty if the rule is not persisted. If the rule is persisted, \<code>rid\\</code> equals \<code>ID\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rid(Long rid) {
            this.rid = rid;
            return this;
        }

        /**
         * <p>Whether to use operator matching or legacy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useConditions(Boolean useConditions) {
            this.useConditions = useConditions;
            return this;
        }

        public GraphFlowNode build() {
            return new GraphFlowNode(this);
        } 

    } 

    /**
     * 
     * {@link GraphFlowNode} extends {@link TeaModel}
     *
     * <p>GraphFlowNode</p>
     */
    public static class NextNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Lambda")
        private String lambda;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextNodeId")
        private Long nextNodeId;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private java.util.List<String> triggers;

        private NextNodes(Builder builder) {
            this.checkType = builder.checkType;
            this.index = builder.index;
            this.lambda = builder.lambda;
            this.name = builder.name;
            this.nextNodeId = builder.nextNodeId;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextNodes create() {
            return builder().build();
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return lambda
         */
        public String getLambda() {
            return this.lambda;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextNodeId
         */
        public Long getNextNodeId() {
            return this.nextNodeId;
        }

        /**
         * @return triggers
         */
        public java.util.List<String> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer checkType; 
            private Integer index; 
            private String lambda; 
            private String name; 
            private Long nextNodeId; 
            private java.util.List<String> triggers; 

            private Builder() {
            } 

            private Builder(NextNodes model) {
                this.checkType = model.checkType;
                this.index = model.index;
                this.lambda = model.lambda;
                this.name = model.name;
                this.nextNodeId = model.nextNodeId;
                this.triggers = model.triggers;
            } 

            /**
             * <p>Quality check dimension</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>Flow branch priority. A smaller value indicates higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Lambda expression for the next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * <p>Conditional branch name.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Next node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>31533</p>
             */
            public Builder nextNodeId(Long nextNodeId) {
                this.nextNodeId = nextNodeId;
                return this;
            }

            /**
             * <p>Operators to follow.</p>
             */
            public Builder triggers(java.util.List<String> triggers) {
                this.triggers = triggers;
                return this;
            }

            public NextNodes build() {
                return new NextNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GraphFlowNode} extends {@link TeaModel}
     *
     * <p>GraphFlowNode</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReview")
        private Integer autoReview;

        @com.aliyun.core.annotation.NameInMap("BranchJudge")
        private Boolean branchJudge;

        @com.aliyun.core.annotation.NameInMap("CheckMoreSize")
        private Integer checkMoreSize;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("Lambda")
        private String lambda;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("RuleScoreType")
        private Integer ruleScoreType;

        @com.aliyun.core.annotation.NameInMap("SayType")
        private String sayType;

        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreNumType")
        private Integer scoreNumType;

        @com.aliyun.core.annotation.NameInMap("ScoreRuleHitType")
        private Integer scoreRuleHitType;

        @com.aliyun.core.annotation.NameInMap("ScoreType")
        private Integer scoreType;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private java.util.List<String> triggers;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Properties(Builder builder) {
            this.autoReview = builder.autoReview;
            this.branchJudge = builder.branchJudge;
            this.checkMoreSize = builder.checkMoreSize;
            this.checkType = builder.checkType;
            this.lambda = builder.lambda;
            this.role = builder.role;
            this.ruleScoreType = builder.ruleScoreType;
            this.sayType = builder.sayType;
            this.scoreNum = builder.scoreNum;
            this.scoreNumType = builder.scoreNumType;
            this.scoreRuleHitType = builder.scoreRuleHitType;
            this.scoreType = builder.scoreType;
            this.triggers = builder.triggers;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return autoReview
         */
        public Integer getAutoReview() {
            return this.autoReview;
        }

        /**
         * @return branchJudge
         */
        public Boolean getBranchJudge() {
            return this.branchJudge;
        }

        /**
         * @return checkMoreSize
         */
        public Integer getCheckMoreSize() {
            return this.checkMoreSize;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return lambda
         */
        public String getLambda() {
            return this.lambda;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return ruleScoreType
         */
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        /**
         * @return sayType
         */
        public String getSayType() {
            return this.sayType;
        }

        /**
         * @return scoreNum
         */
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        /**
         * @return scoreNumType
         */
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        /**
         * @return scoreRuleHitType
         */
        public Integer getScoreRuleHitType() {
            return this.scoreRuleHitType;
        }

        /**
         * @return scoreType
         */
        public Integer getScoreType() {
            return this.scoreType;
        }

        /**
         * @return triggers
         */
        public java.util.List<String> getTriggers() {
            return this.triggers;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer autoReview; 
            private Boolean branchJudge; 
            private Integer checkMoreSize; 
            private Integer checkType; 
            private String lambda; 
            private String role; 
            private Integer ruleScoreType; 
            private String sayType; 
            private Integer scoreNum; 
            private Integer scoreNumType; 
            private Integer scoreRuleHitType; 
            private Integer scoreType; 
            private java.util.List<String> triggers; 
            private String type; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.autoReview = model.autoReview;
                this.branchJudge = model.branchJudge;
                this.checkMoreSize = model.checkMoreSize;
                this.checkType = model.checkType;
                this.lambda = model.lambda;
                this.role = model.role;
                this.ruleScoreType = model.ruleScoreType;
                this.sayType = model.sayType;
                this.scoreNum = model.scoreNum;
                this.scoreNumType = model.scoreNumType;
                this.scoreRuleHitType = model.scoreRuleHitType;
                this.scoreType = model.scoreType;
                this.triggers = model.triggers;
                this.type = model.type;
            } 

            /**
             * <p>1: Do not auto-review.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoReview(Integer autoReview) {
                this.autoReview = autoReview;
                return this;
            }

            /**
             * <p>Enable branch judgment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder branchJudge(Boolean branchJudge) {
                this.branchJudge = branchJudge;
                return this;
            }

            /**
             * <p>Maximum N sentences to check.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkMoreSize(Integer checkMoreSize) {
                this.checkMoreSize = checkMoreSize;
                return this;
            }

            /**
             * <p>Quality check dimension</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>General operator logic.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * <p>Role when the type is \<code>single\\</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>客户</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Is scored.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleScoreType(Integer ruleScoreType) {
                this.ruleScoreType = ruleScoreType;
                return this;
            }

            /**
             * <p>Indicates expression when the type is \<code>single\\</code>.</p>
             */
            public Builder sayType(String sayType) {
                this.sayType = sayType;
                return this;
            }

            /**
             * <p>Score value</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * <p>0: Add or deduct points after the rule is triggered; 1: Score once after the rule is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * <p>0: Score when the node is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scoreRuleHitType(Integer scoreRuleHitType) {
                this.scoreRuleHitType = scoreRuleHitType;
                return this;
            }

            /**
             * <p>1: Add points; 3: Deduct points; default is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * <p>Operators to follow.</p>
             */
            public Builder triggers(java.util.List<String> triggers) {
                this.triggers = triggers;
                return this;
            }

            /**
             * <p>Property type</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
}
