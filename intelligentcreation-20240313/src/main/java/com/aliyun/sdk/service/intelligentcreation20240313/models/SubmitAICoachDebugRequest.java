// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link SubmitAICoachDebugRequest} extends {@link RequestModel}
 *
 * <p>SubmitAICoachDebugRequest</p>
 */
public class SubmitAICoachDebugRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataId")
    private String dataId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataType")
    private Long dataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deductionRule")
    private DeductionRule deductionRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueList")
    private java.util.List<DialogueList> dialogueList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expressiveness")
    private Expressiveness expressiveness;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("point")
    private Point point;

    private SubmitAICoachDebugRequest(Builder builder) {
        super(builder);
        this.dataId = builder.dataId;
        this.dataType = builder.dataType;
        this.deductionRule = builder.deductionRule;
        this.dialogueList = builder.dialogueList;
        this.expressiveness = builder.expressiveness;
        this.point = builder.point;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAICoachDebugRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return dataType
     */
    public Long getDataType() {
        return this.dataType;
    }

    /**
     * @return deductionRule
     */
    public DeductionRule getDeductionRule() {
        return this.deductionRule;
    }

    /**
     * @return dialogueList
     */
    public java.util.List<DialogueList> getDialogueList() {
        return this.dialogueList;
    }

    /**
     * @return expressiveness
     */
    public Expressiveness getExpressiveness() {
        return this.expressiveness;
    }

    /**
     * @return point
     */
    public Point getPoint() {
        return this.point;
    }

    public static final class Builder extends Request.Builder<SubmitAICoachDebugRequest, Builder> {
        private String dataId; 
        private Long dataType; 
        private DeductionRule deductionRule; 
        private java.util.List<DialogueList> dialogueList; 
        private Expressiveness expressiveness; 
        private Point point; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAICoachDebugRequest request) {
            super(request);
            this.dataId = request.dataId;
            this.dataType = request.dataType;
            this.deductionRule = request.deductionRule;
            this.dialogueList = request.dialogueList;
            this.expressiveness = request.expressiveness;
            this.point = request.point;
        } 

        /**
         * dataId.
         */
        public Builder dataId(String dataId) {
            this.putBodyParameter("dataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(Long dataType) {
            this.putBodyParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * deductionRule.
         */
        public Builder deductionRule(DeductionRule deductionRule) {
            this.putBodyParameter("deductionRule", deductionRule);
            this.deductionRule = deductionRule;
            return this;
        }

        /**
         * dialogueList.
         */
        public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
            this.putBodyParameter("dialogueList", dialogueList);
            this.dialogueList = dialogueList;
            return this;
        }

        /**
         * expressiveness.
         */
        public Builder expressiveness(Expressiveness expressiveness) {
            this.putBodyParameter("expressiveness", expressiveness);
            this.expressiveness = expressiveness;
            return this;
        }

        /**
         * point.
         */
        public Builder point(Point point) {
            this.putBodyParameter("point", point);
            this.point = point;
            return this;
        }

        @Override
        public SubmitAICoachDebugRequest build() {
            return new SubmitAICoachDebugRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class DeductionRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deductionRuleId")
        private String deductionRuleId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("punishmentTypes")
        private java.util.List<String> punishmentTypes;

        @com.aliyun.core.annotation.NameInMap("ruleValue")
        private String ruleValue;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private DeductionRule(Builder builder) {
            this.deductionRuleId = builder.deductionRuleId;
            this.description = builder.description;
            this.punishmentTypes = builder.punishmentTypes;
            this.ruleValue = builder.ruleValue;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeductionRule create() {
            return builder().build();
        }

        /**
         * @return deductionRuleId
         */
        public String getDeductionRuleId() {
            return this.deductionRuleId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return punishmentTypes
         */
        public java.util.List<String> getPunishmentTypes() {
            return this.punishmentTypes;
        }

        /**
         * @return ruleValue
         */
        public String getRuleValue() {
            return this.ruleValue;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String deductionRuleId; 
            private String description; 
            private java.util.List<String> punishmentTypes; 
            private String ruleValue; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(DeductionRule model) {
                this.deductionRuleId = model.deductionRuleId;
                this.description = model.description;
                this.punishmentTypes = model.punishmentTypes;
                this.ruleValue = model.ruleValue;
                this.weight = model.weight;
            } 

            /**
             * deductionRuleId.
             */
            public Builder deductionRuleId(String deductionRuleId) {
                this.deductionRuleId = deductionRuleId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * punishmentTypes.
             */
            public Builder punishmentTypes(java.util.List<String> punishmentTypes) {
                this.punishmentTypes = punishmentTypes;
                return this;
            }

            /**
             * ruleValue.
             */
            public Builder ruleValue(String ruleValue) {
                this.ruleValue = ruleValue;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public DeductionRule build() {
                return new DeductionRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private DialogueList(Builder builder) {
            this.message = builder.message;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String message; 
            private String role; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.message = model.message;
                this.role = model.role;
            } 

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class Expressiveness extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("expressivenessId")
        private String expressivenessId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("rule")
        private String rule;

        private Expressiveness(Builder builder) {
            this.desc = builder.desc;
            this.expressivenessId = builder.expressivenessId;
            this.name = builder.name;
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expressiveness create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return expressivenessId
         */
        public String getExpressivenessId() {
            return this.expressivenessId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        public static final class Builder {
            private String desc; 
            private String expressivenessId; 
            private String name; 
            private String rule; 

            private Builder() {
            } 

            private Builder(Expressiveness model) {
                this.desc = model.desc;
                this.expressivenessId = model.expressivenessId;
                this.name = model.name;
                this.rule = model.rule;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * expressivenessId.
             */
            public Builder expressivenessId(String expressivenessId) {
                this.expressivenessId = expressivenessId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            public Expressiveness build() {
                return new Expressiveness(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class KeywordValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Long weight;

        private KeywordValues(Builder builder) {
            this.name = builder.name;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordValues create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String name; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(KeywordValues model) {
                this.name = model.name;
                this.weight = model.weight;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public KeywordValues build() {
                return new KeywordValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class ScoringRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ScoringRules(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoringRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(ScoringRules model) {
                this.name = model.name;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ScoringRules build() {
                return new ScoringRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class AnswerValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerName")
        private String answerName;

        @com.aliyun.core.annotation.NameInMap("answerWeight")
        private Long answerWeight;

        @com.aliyun.core.annotation.NameInMap("keywordValues")
        private java.util.List<KeywordValues> keywordValues;

        @com.aliyun.core.annotation.NameInMap("keywordWeight")
        private Long keywordWeight;

        @com.aliyun.core.annotation.NameInMap("scoringRules")
        private java.util.List<ScoringRules> scoringRules;

        private AnswerValues(Builder builder) {
            this.answerName = builder.answerName;
            this.answerWeight = builder.answerWeight;
            this.keywordValues = builder.keywordValues;
            this.keywordWeight = builder.keywordWeight;
            this.scoringRules = builder.scoringRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerValues create() {
            return builder().build();
        }

        /**
         * @return answerName
         */
        public String getAnswerName() {
            return this.answerName;
        }

        /**
         * @return answerWeight
         */
        public Long getAnswerWeight() {
            return this.answerWeight;
        }

        /**
         * @return keywordValues
         */
        public java.util.List<KeywordValues> getKeywordValues() {
            return this.keywordValues;
        }

        /**
         * @return keywordWeight
         */
        public Long getKeywordWeight() {
            return this.keywordWeight;
        }

        /**
         * @return scoringRules
         */
        public java.util.List<ScoringRules> getScoringRules() {
            return this.scoringRules;
        }

        public static final class Builder {
            private String answerName; 
            private Long answerWeight; 
            private java.util.List<KeywordValues> keywordValues; 
            private Long keywordWeight; 
            private java.util.List<ScoringRules> scoringRules; 

            private Builder() {
            } 

            private Builder(AnswerValues model) {
                this.answerName = model.answerName;
                this.answerWeight = model.answerWeight;
                this.keywordValues = model.keywordValues;
                this.keywordWeight = model.keywordWeight;
                this.scoringRules = model.scoringRules;
            } 

            /**
             * answerName.
             */
            public Builder answerName(String answerName) {
                this.answerName = answerName;
                return this;
            }

            /**
             * answerWeight.
             */
            public Builder answerWeight(Long answerWeight) {
                this.answerWeight = answerWeight;
                return this;
            }

            /**
             * keywordValues.
             */
            public Builder keywordValues(java.util.List<KeywordValues> keywordValues) {
                this.keywordValues = keywordValues;
                return this;
            }

            /**
             * keywordWeight.
             */
            public Builder keywordWeight(Long keywordWeight) {
                this.keywordWeight = keywordWeight;
                return this;
            }

            /**
             * scoringRules.
             */
            public Builder scoringRules(java.util.List<ScoringRules> scoringRules) {
                this.scoringRules = scoringRules;
                return this;
            }

            public AnswerValues build() {
                return new AnswerValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class AnswerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerValues")
        private java.util.List<AnswerValues> answerValues;

        @com.aliyun.core.annotation.NameInMap("enabledKeyword")
        private Boolean enabledKeyword;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("operators")
        private String operators;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("score")
        private Long score;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Long weight;

        private AnswerList(Builder builder) {
            this.answerValues = builder.answerValues;
            this.enabledKeyword = builder.enabledKeyword;
            this.nameList = builder.nameList;
            this.operators = builder.operators;
            this.parameters = builder.parameters;
            this.score = builder.score;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerList create() {
            return builder().build();
        }

        /**
         * @return answerValues
         */
        public java.util.List<AnswerValues> getAnswerValues() {
            return this.answerValues;
        }

        /**
         * @return enabledKeyword
         */
        public Boolean getEnabledKeyword() {
            return this.enabledKeyword;
        }

        /**
         * @return nameList
         */
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        /**
         * @return operators
         */
        public String getOperators() {
            return this.operators;
        }

        /**
         * @return parameters
         */
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return score
         */
        public Long getScore() {
            return this.score;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private java.util.List<AnswerValues> answerValues; 
            private Boolean enabledKeyword; 
            private java.util.List<String> nameList; 
            private String operators; 
            private java.util.List<Parameters> parameters; 
            private Long score; 
            private String type; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(AnswerList model) {
                this.answerValues = model.answerValues;
                this.enabledKeyword = model.enabledKeyword;
                this.nameList = model.nameList;
                this.operators = model.operators;
                this.parameters = model.parameters;
                this.score = model.score;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * answerValues.
             */
            public Builder answerValues(java.util.List<AnswerValues> answerValues) {
                this.answerValues = answerValues;
                return this;
            }

            /**
             * enabledKeyword.
             */
            public Builder enabledKeyword(Boolean enabledKeyword) {
                this.enabledKeyword = enabledKeyword;
                return this;
            }

            /**
             * nameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * operators.
             */
            public Builder operators(String operators) {
                this.operators = operators;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Long score) {
                this.score = score;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public AnswerList build() {
                return new AnswerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAICoachDebugRequest} extends {@link TeaModel}
     *
     * <p>SubmitAICoachDebugRequest</p>
     */
    public static class Point extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerList")
        private java.util.List<AnswerList> answerList;

        @com.aliyun.core.annotation.NameInMap("knowledgeList")
        private java.util.List<String> knowledgeList;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("questionSample")
        private String questionSample;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Long weight;

        private Point(Builder builder) {
            this.answerList = builder.answerList;
            this.knowledgeList = builder.knowledgeList;
            this.name = builder.name;
            this.questionSample = builder.questionSample;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Point create() {
            return builder().build();
        }

        /**
         * @return answerList
         */
        public java.util.List<AnswerList> getAnswerList() {
            return this.answerList;
        }

        /**
         * @return knowledgeList
         */
        public java.util.List<String> getKnowledgeList() {
            return this.knowledgeList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return questionSample
         */
        public String getQuestionSample() {
            return this.questionSample;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private java.util.List<AnswerList> answerList; 
            private java.util.List<String> knowledgeList; 
            private String name; 
            private String questionSample; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(Point model) {
                this.answerList = model.answerList;
                this.knowledgeList = model.knowledgeList;
                this.name = model.name;
                this.questionSample = model.questionSample;
                this.weight = model.weight;
            } 

            /**
             * answerList.
             */
            public Builder answerList(java.util.List<AnswerList> answerList) {
                this.answerList = answerList;
                return this;
            }

            /**
             * knowledgeList.
             */
            public Builder knowledgeList(java.util.List<String> knowledgeList) {
                this.knowledgeList = knowledgeList;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * questionSample.
             */
            public Builder questionSample(String questionSample) {
                this.questionSample = questionSample;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public Point build() {
                return new Point(this);
            } 

        } 

    }
}
