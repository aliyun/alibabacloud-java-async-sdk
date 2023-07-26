// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GraphFlowNode} extends {@link TeaModel}
 *
 * <p>GraphFlowNode</p>
 */
public class GraphFlowNode extends TeaModel {
    @NameInMap("Conditions")
    private java.util.List < ConditionBasicInfo > conditions;

    @NameInMap("Content")
    private String content;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Index")
    private Integer index;

    @NameInMap("Name")
    private String name;

    @NameInMap("NextNodes")
    private java.util.List < NextNodes> nextNodes;

    @NameInMap("NodeType")
    private String nodeType;

    @NameInMap("Properties")
    private Properties properties;

    @NameInMap("Rid")
    private Long rid;

    @NameInMap("UseConditions")
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

    /**
     * @return conditions
     */
    public java.util.List < ConditionBasicInfo > getConditions() {
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
    public java.util.List < NextNodes> getNextNodes() {
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
        private java.util.List < ConditionBasicInfo > conditions; 
        private String content; 
        private Long id; 
        private Integer index; 
        private String name; 
        private java.util.List < NextNodes> nextNodes; 
        private String nodeType; 
        private Properties properties; 
        private Long rid; 
        private Boolean useConditions; 

        /**
         * Conditions.
         */
        public Builder conditions(java.util.List < ConditionBasicInfo > conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
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
         * Index.
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NextNodes.
         */
        public Builder nextNodes(java.util.List < NextNodes> nextNodes) {
            this.nextNodes = nextNodes;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(Properties properties) {
            this.properties = properties;
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
         * UseConditions.
         */
        public Builder useConditions(Boolean useConditions) {
            this.useConditions = useConditions;
            return this;
        }

        public GraphFlowNode build() {
            return new GraphFlowNode(this);
        } 

    } 

    public static class NextNodes extends TeaModel {
        @NameInMap("CheckType")
        private Integer checkType;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Lambda")
        private String lambda;

        @NameInMap("Name")
        private String name;

        @NameInMap("NextNodeId")
        private Long nextNodeId;

        @NameInMap("Triggers")
        private java.util.List < String > triggers;

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
        public java.util.List < String > getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer checkType; 
            private Integer index; 
            private String lambda; 
            private String name; 
            private Long nextNodeId; 
            private java.util.List < String > triggers; 

            /**
             * CheckType.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Lambda.
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NextNodeId.
             */
            public Builder nextNodeId(Long nextNodeId) {
                this.nextNodeId = nextNodeId;
                return this;
            }

            /**
             * Triggers.
             */
            public Builder triggers(java.util.List < String > triggers) {
                this.triggers = triggers;
                return this;
            }

            public NextNodes build() {
                return new NextNodes(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("AutoReview")
        private Integer autoReview;

        @NameInMap("BranchJudge")
        private Boolean branchJudge;

        @NameInMap("CheckMoreSize")
        private Integer checkMoreSize;

        @NameInMap("CheckType")
        private Integer checkType;

        @NameInMap("Lambda")
        private String lambda;

        @NameInMap("Role")
        private String role;

        @NameInMap("RuleScoreType")
        private Integer ruleScoreType;

        @NameInMap("SayType")
        private String sayType;

        @NameInMap("ScoreNum")
        private Integer scoreNum;

        @NameInMap("ScoreNumType")
        private Integer scoreNumType;

        @NameInMap("ScoreRuleHitType")
        private Integer scoreRuleHitType;

        @NameInMap("ScoreType")
        private Integer scoreType;

        @NameInMap("Triggers")
        private java.util.List < String > triggers;

        @NameInMap("Type")
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
        public java.util.List < String > getTriggers() {
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
            private java.util.List < String > triggers; 
            private String type; 

            /**
             * AutoReview.
             */
            public Builder autoReview(Integer autoReview) {
                this.autoReview = autoReview;
                return this;
            }

            /**
             * BranchJudge.
             */
            public Builder branchJudge(Boolean branchJudge) {
                this.branchJudge = branchJudge;
                return this;
            }

            /**
             * CheckMoreSize.
             */
            public Builder checkMoreSize(Integer checkMoreSize) {
                this.checkMoreSize = checkMoreSize;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * Lambda.
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * RuleScoreType.
             */
            public Builder ruleScoreType(Integer ruleScoreType) {
                this.ruleScoreType = ruleScoreType;
                return this;
            }

            /**
             * SayType.
             */
            public Builder sayType(String sayType) {
                this.sayType = sayType;
                return this;
            }

            /**
             * ScoreNum.
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * ScoreNumType.
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * ScoreRuleHitType.
             */
            public Builder scoreRuleHitType(Integer scoreRuleHitType) {
                this.scoreRuleHitType = scoreRuleHitType;
                return this;
            }

            /**
             * ScoreType.
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * Triggers.
             */
            public Builder triggers(java.util.List < String > triggers) {
                this.triggers = triggers;
                return this;
            }

            /**
             * Type.
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
