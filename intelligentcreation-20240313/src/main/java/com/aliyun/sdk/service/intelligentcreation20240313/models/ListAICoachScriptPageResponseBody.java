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
 * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListAICoachScriptPageResponseBody</p>
 */
public class ListAICoachScriptPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAICoachScriptPageResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICoachScriptPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List<List> list; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAICoachScriptPageResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.list = model.list;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * list.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAICoachScriptPageResponseBody build() {
            return new ListAICoachScriptPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class CompleteStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clickCompleteAutoEnd")
        private Boolean clickCompleteAutoEnd;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("fullCoverageAutoEnd")
        private Boolean fullCoverageAutoEnd;

        private CompleteStrategy(Builder builder) {
            this.clickCompleteAutoEnd = builder.clickCompleteAutoEnd;
            this.duration = builder.duration;
            this.fullCoverageAutoEnd = builder.fullCoverageAutoEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompleteStrategy create() {
            return builder().build();
        }

        /**
         * @return clickCompleteAutoEnd
         */
        public Boolean getClickCompleteAutoEnd() {
            return this.clickCompleteAutoEnd;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fullCoverageAutoEnd
         */
        public Boolean getFullCoverageAutoEnd() {
            return this.fullCoverageAutoEnd;
        }

        public static final class Builder {
            private Boolean clickCompleteAutoEnd; 
            private Integer duration; 
            private Boolean fullCoverageAutoEnd; 

            private Builder() {
            } 

            private Builder(CompleteStrategy model) {
                this.clickCompleteAutoEnd = model.clickCompleteAutoEnd;
                this.duration = model.duration;
                this.fullCoverageAutoEnd = model.fullCoverageAutoEnd;
            } 

            /**
             * clickCompleteAutoEnd.
             */
            public Builder clickCompleteAutoEnd(Boolean clickCompleteAutoEnd) {
                this.clickCompleteAutoEnd = clickCompleteAutoEnd;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * fullCoverageAutoEnd.
             */
            public Builder fullCoverageAutoEnd(Boolean fullCoverageAutoEnd) {
                this.fullCoverageAutoEnd = fullCoverageAutoEnd;
                return this;
            }

            public CompleteStrategy build() {
                return new CompleteStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assessPoint")
        private String assessPoint;

        @com.aliyun.core.annotation.NameInMap("customContent")
        private String customContent;

        private Parameters(Builder builder) {
            this.assessPoint = builder.assessPoint;
            this.customContent = builder.customContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return assessPoint
         */
        public String getAssessPoint() {
            return this.assessPoint;
        }

        /**
         * @return customContent
         */
        public String getCustomContent() {
            return this.customContent;
        }

        public static final class Builder {
            private String assessPoint; 
            private String customContent; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.assessPoint = model.assessPoint;
                this.customContent = model.customContent;
            } 

            /**
             * assessPoint.
             */
            public Builder assessPoint(String assessPoint) {
                this.assessPoint = assessPoint;
                return this;
            }

            /**
             * customContent.
             */
            public Builder customContent(String customContent) {
                this.customContent = customContent;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class Action extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        private Parameters parameters;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Action(Builder builder) {
            this.parameters = builder.parameters;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Action create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Parameters parameters; 
            private String type; 

            private Builder() {
            } 

            private Builder(Action model) {
                this.parameters = model.parameters;
                this.type = model.type;
            } 

            /**
             * parameters.
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Action build() {
                return new Action(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class MainConditionParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assessPoint")
        private String assessPoint;

        private MainConditionParameters(Builder builder) {
            this.assessPoint = builder.assessPoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainConditionParameters create() {
            return builder().build();
        }

        /**
         * @return assessPoint
         */
        public String getAssessPoint() {
            return this.assessPoint;
        }

        public static final class Builder {
            private String assessPoint; 

            private Builder() {
            } 

            private Builder(MainConditionParameters model) {
                this.assessPoint = model.assessPoint;
            } 

            /**
             * assessPoint.
             */
            public Builder assessPoint(String assessPoint) {
                this.assessPoint = assessPoint;
                return this;
            }

            public MainConditionParameters build() {
                return new MainConditionParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class MainCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        private MainConditionParameters parameters;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private MainCondition(Builder builder) {
            this.parameters = builder.parameters;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainCondition create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public MainConditionParameters getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private MainConditionParameters parameters; 
            private String type; 

            private Builder() {
            } 

            private Builder(MainCondition model) {
                this.parameters = model.parameters;
                this.type = model.type;
            } 

            /**
             * parameters.
             */
            public Builder parameters(MainConditionParameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MainCondition build() {
                return new MainCondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class SubCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SubCondition(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCondition create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(SubCondition model) {
                this.type = model.type;
            } 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SubCondition build() {
                return new SubCondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class CustomReplyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private Action action;

        @com.aliyun.core.annotation.NameInMap("logic")
        private String logic;

        @com.aliyun.core.annotation.NameInMap("mainCondition")
        private MainCondition mainCondition;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("sortNo")
        private Integer sortNo;

        @com.aliyun.core.annotation.NameInMap("subCondition")
        private SubCondition subCondition;

        private CustomReplyRules(Builder builder) {
            this.action = builder.action;
            this.logic = builder.logic;
            this.mainCondition = builder.mainCondition;
            this.priority = builder.priority;
            this.sortNo = builder.sortNo;
            this.subCondition = builder.subCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomReplyRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public Action getAction() {
            return this.action;
        }

        /**
         * @return logic
         */
        public String getLogic() {
            return this.logic;
        }

        /**
         * @return mainCondition
         */
        public MainCondition getMainCondition() {
            return this.mainCondition;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return sortNo
         */
        public Integer getSortNo() {
            return this.sortNo;
        }

        /**
         * @return subCondition
         */
        public SubCondition getSubCondition() {
            return this.subCondition;
        }

        public static final class Builder {
            private Action action; 
            private String logic; 
            private MainCondition mainCondition; 
            private Integer priority; 
            private Integer sortNo; 
            private SubCondition subCondition; 

            private Builder() {
            } 

            private Builder(CustomReplyRules model) {
                this.action = model.action;
                this.logic = model.logic;
                this.mainCondition = model.mainCondition;
                this.priority = model.priority;
                this.sortNo = model.sortNo;
                this.subCondition = model.subCondition;
            } 

            /**
             * action.
             */
            public Builder action(Action action) {
                this.action = action;
                return this;
            }

            /**
             * logic.
             */
            public Builder logic(String logic) {
                this.logic = logic;
                return this;
            }

            /**
             * mainCondition.
             */
            public Builder mainCondition(MainCondition mainCondition) {
                this.mainCondition = mainCondition;
                return this;
            }

            /**
             * priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * sortNo.
             */
            public Builder sortNo(Integer sortNo) {
                this.sortNo = sortNo;
                return this;
            }

            /**
             * subCondition.
             */
            public Builder subCondition(SubCondition subCondition) {
                this.subCondition = subCondition;
                return this;
            }

            public CustomReplyRules build() {
                return new CustomReplyRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class SampleDialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private SampleDialogueList(Builder builder) {
            this.message = builder.message;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SampleDialogueList create() {
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

            private Builder(SampleDialogueList model) {
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

            public SampleDialogueList build() {
                return new SampleDialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class Levels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Levels(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Levels create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private String name; 

            private Builder() {
            } 

            private Builder(Levels model) {
                this.max = model.max;
                this.min = model.min;
                this.name = model.name;
            } 

            /**
             * max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Levels build() {
                return new Levels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class ScoreConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("levelEnabled")
        private Boolean levelEnabled;

        @com.aliyun.core.annotation.NameInMap("levels")
        private java.util.List<Levels> levels;

        @com.aliyun.core.annotation.NameInMap("passScore")
        private Integer passScore;

        private ScoreConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.levelEnabled = builder.levelEnabled;
            this.levels = builder.levels;
            this.passScore = builder.passScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoreConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return levelEnabled
         */
        public Boolean getLevelEnabled() {
            return this.levelEnabled;
        }

        /**
         * @return levels
         */
        public java.util.List<Levels> getLevels() {
            return this.levels;
        }

        /**
         * @return passScore
         */
        public Integer getPassScore() {
            return this.passScore;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Boolean levelEnabled; 
            private java.util.List<Levels> levels; 
            private Integer passScore; 

            private Builder() {
            } 

            private Builder(ScoreConfig model) {
                this.enabled = model.enabled;
                this.levelEnabled = model.levelEnabled;
                this.levels = model.levels;
                this.passScore = model.passScore;
            } 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * levelEnabled.
             */
            public Builder levelEnabled(Boolean levelEnabled) {
                this.levelEnabled = levelEnabled;
                return this;
            }

            /**
             * levels.
             */
            public Builder levels(java.util.List<Levels> levels) {
                this.levels = levels;
                return this;
            }

            /**
             * passScore.
             */
            public Builder passScore(Integer passScore) {
                this.passScore = passScore;
                return this;
            }

            public ScoreConfig build() {
                return new ScoreConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class Weights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assessmentPoint")
        private Integer assessmentPoint;

        @com.aliyun.core.annotation.NameInMap("assessmentPointEnabled")
        private Boolean assessmentPointEnabled;

        @com.aliyun.core.annotation.NameInMap("customReplyRuleEnabled")
        private Boolean customReplyRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("expressiveness")
        private Integer expressiveness;

        @com.aliyun.core.annotation.NameInMap("expressivenessEnabled")
        private Boolean expressivenessEnabled;

        @com.aliyun.core.annotation.NameInMap("pointDeductionRule")
        private Integer pointDeductionRule;

        @com.aliyun.core.annotation.NameInMap("pointDeductionRuleEnabled")
        private Boolean pointDeductionRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("similarPronunciationScoringEnabled")
        private Boolean similarPronunciationScoringEnabled;

        @com.aliyun.core.annotation.NameInMap("standard")
        private Integer standard;

        @com.aliyun.core.annotation.NameInMap("standardEnabled")
        private Boolean standardEnabled;

        private Weights(Builder builder) {
            this.assessmentPoint = builder.assessmentPoint;
            this.assessmentPointEnabled = builder.assessmentPointEnabled;
            this.customReplyRuleEnabled = builder.customReplyRuleEnabled;
            this.expressiveness = builder.expressiveness;
            this.expressivenessEnabled = builder.expressivenessEnabled;
            this.pointDeductionRule = builder.pointDeductionRule;
            this.pointDeductionRuleEnabled = builder.pointDeductionRuleEnabled;
            this.similarPronunciationScoringEnabled = builder.similarPronunciationScoringEnabled;
            this.standard = builder.standard;
            this.standardEnabled = builder.standardEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Weights create() {
            return builder().build();
        }

        /**
         * @return assessmentPoint
         */
        public Integer getAssessmentPoint() {
            return this.assessmentPoint;
        }

        /**
         * @return assessmentPointEnabled
         */
        public Boolean getAssessmentPointEnabled() {
            return this.assessmentPointEnabled;
        }

        /**
         * @return customReplyRuleEnabled
         */
        public Boolean getCustomReplyRuleEnabled() {
            return this.customReplyRuleEnabled;
        }

        /**
         * @return expressiveness
         */
        public Integer getExpressiveness() {
            return this.expressiveness;
        }

        /**
         * @return expressivenessEnabled
         */
        public Boolean getExpressivenessEnabled() {
            return this.expressivenessEnabled;
        }

        /**
         * @return pointDeductionRule
         */
        public Integer getPointDeductionRule() {
            return this.pointDeductionRule;
        }

        /**
         * @return pointDeductionRuleEnabled
         */
        public Boolean getPointDeductionRuleEnabled() {
            return this.pointDeductionRuleEnabled;
        }

        /**
         * @return similarPronunciationScoringEnabled
         */
        public Boolean getSimilarPronunciationScoringEnabled() {
            return this.similarPronunciationScoringEnabled;
        }

        /**
         * @return standard
         */
        public Integer getStandard() {
            return this.standard;
        }

        /**
         * @return standardEnabled
         */
        public Boolean getStandardEnabled() {
            return this.standardEnabled;
        }

        public static final class Builder {
            private Integer assessmentPoint; 
            private Boolean assessmentPointEnabled; 
            private Boolean customReplyRuleEnabled; 
            private Integer expressiveness; 
            private Boolean expressivenessEnabled; 
            private Integer pointDeductionRule; 
            private Boolean pointDeductionRuleEnabled; 
            private Boolean similarPronunciationScoringEnabled; 
            private Integer standard; 
            private Boolean standardEnabled; 

            private Builder() {
            } 

            private Builder(Weights model) {
                this.assessmentPoint = model.assessmentPoint;
                this.assessmentPointEnabled = model.assessmentPointEnabled;
                this.customReplyRuleEnabled = model.customReplyRuleEnabled;
                this.expressiveness = model.expressiveness;
                this.expressivenessEnabled = model.expressivenessEnabled;
                this.pointDeductionRule = model.pointDeductionRule;
                this.pointDeductionRuleEnabled = model.pointDeductionRuleEnabled;
                this.similarPronunciationScoringEnabled = model.similarPronunciationScoringEnabled;
                this.standard = model.standard;
                this.standardEnabled = model.standardEnabled;
            } 

            /**
             * assessmentPoint.
             */
            public Builder assessmentPoint(Integer assessmentPoint) {
                this.assessmentPoint = assessmentPoint;
                return this;
            }

            /**
             * assessmentPointEnabled.
             */
            public Builder assessmentPointEnabled(Boolean assessmentPointEnabled) {
                this.assessmentPointEnabled = assessmentPointEnabled;
                return this;
            }

            /**
             * customReplyRuleEnabled.
             */
            public Builder customReplyRuleEnabled(Boolean customReplyRuleEnabled) {
                this.customReplyRuleEnabled = customReplyRuleEnabled;
                return this;
            }

            /**
             * expressiveness.
             */
            public Builder expressiveness(Integer expressiveness) {
                this.expressiveness = expressiveness;
                return this;
            }

            /**
             * expressivenessEnabled.
             */
            public Builder expressivenessEnabled(Boolean expressivenessEnabled) {
                this.expressivenessEnabled = expressivenessEnabled;
                return this;
            }

            /**
             * pointDeductionRule.
             */
            public Builder pointDeductionRule(Integer pointDeductionRule) {
                this.pointDeductionRule = pointDeductionRule;
                return this;
            }

            /**
             * pointDeductionRuleEnabled.
             */
            public Builder pointDeductionRuleEnabled(Boolean pointDeductionRuleEnabled) {
                this.pointDeductionRuleEnabled = pointDeductionRuleEnabled;
                return this;
            }

            /**
             * similarPronunciationScoringEnabled.
             */
            public Builder similarPronunciationScoringEnabled(Boolean similarPronunciationScoringEnabled) {
                this.similarPronunciationScoringEnabled = similarPronunciationScoringEnabled;
                return this;
            }

            /**
             * standard.
             */
            public Builder standard(Integer standard) {
                this.standard = standard;
                return this;
            }

            /**
             * standardEnabled.
             */
            public Builder standardEnabled(Boolean standardEnabled) {
                this.standardEnabled = standardEnabled;
                return this;
            }

            public Weights build() {
                return new Weights(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appendQuestionFlag")
        private String appendQuestionFlag;

        @com.aliyun.core.annotation.NameInMap("assessmentScope")
        private String assessmentScope;

        @com.aliyun.core.annotation.NameInMap("closingRemarks")
        private String closingRemarks;

        @com.aliyun.core.annotation.NameInMap("completeStrategy")
        private CompleteStrategy completeStrategy;

        @com.aliyun.core.annotation.NameInMap("coverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("customReplyRules")
        private java.util.List<CustomReplyRules> customReplyRules;

        @com.aliyun.core.annotation.NameInMap("dialogueTextFlag")
        private Boolean dialogueTextFlag;

        @com.aliyun.core.annotation.NameInMap("dialogueTipFlag")
        private Boolean dialogueTipFlag;

        @com.aliyun.core.annotation.NameInMap("evaluateReportFlag")
        private Boolean evaluateReportFlag;

        @com.aliyun.core.annotation.NameInMap("expressiveness")
        private java.util.Map<String, String> expressiveness;

        @com.aliyun.core.annotation.NameInMap("gifDynamicUrl")
        private String gifDynamicUrl;

        @com.aliyun.core.annotation.NameInMap("gifStaticUrl")
        private String gifStaticUrl;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("initiator")
        private String initiator;

        @com.aliyun.core.annotation.NameInMap("interactionType")
        private String interactionType;

        @com.aliyun.core.annotation.NameInMap("introduce")
        private String introduce;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("openingRemarks")
        private String openingRemarks;

        @com.aliyun.core.annotation.NameInMap("orderAckFlag")
        private Boolean orderAckFlag;

        @com.aliyun.core.annotation.NameInMap("sampleDialogueList")
        private java.util.List<SampleDialogueList> sampleDialogueList;

        @com.aliyun.core.annotation.NameInMap("scoreConfig")
        private ScoreConfig scoreConfig;

        @com.aliyun.core.annotation.NameInMap("scriptRecordId")
        private String scriptRecordId;

        @com.aliyun.core.annotation.NameInMap("sparringTipContent")
        private String sparringTipContent;

        @com.aliyun.core.annotation.NameInMap("sparringTipTitle")
        private String sparringTipTitle;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("studentThinkTimeFlag")
        private Boolean studentThinkTimeFlag;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("weights")
        private Weights weights;

        private List(Builder builder) {
            this.appendQuestionFlag = builder.appendQuestionFlag;
            this.assessmentScope = builder.assessmentScope;
            this.closingRemarks = builder.closingRemarks;
            this.completeStrategy = builder.completeStrategy;
            this.coverUrl = builder.coverUrl;
            this.customReplyRules = builder.customReplyRules;
            this.dialogueTextFlag = builder.dialogueTextFlag;
            this.dialogueTipFlag = builder.dialogueTipFlag;
            this.evaluateReportFlag = builder.evaluateReportFlag;
            this.expressiveness = builder.expressiveness;
            this.gifDynamicUrl = builder.gifDynamicUrl;
            this.gifStaticUrl = builder.gifStaticUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.initiator = builder.initiator;
            this.interactionType = builder.interactionType;
            this.introduce = builder.introduce;
            this.name = builder.name;
            this.openingRemarks = builder.openingRemarks;
            this.orderAckFlag = builder.orderAckFlag;
            this.sampleDialogueList = builder.sampleDialogueList;
            this.scoreConfig = builder.scoreConfig;
            this.scriptRecordId = builder.scriptRecordId;
            this.sparringTipContent = builder.sparringTipContent;
            this.sparringTipTitle = builder.sparringTipTitle;
            this.status = builder.status;
            this.studentThinkTimeFlag = builder.studentThinkTimeFlag;
            this.type = builder.type;
            this.weights = builder.weights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return appendQuestionFlag
         */
        public String getAppendQuestionFlag() {
            return this.appendQuestionFlag;
        }

        /**
         * @return assessmentScope
         */
        public String getAssessmentScope() {
            return this.assessmentScope;
        }

        /**
         * @return closingRemarks
         */
        public String getClosingRemarks() {
            return this.closingRemarks;
        }

        /**
         * @return completeStrategy
         */
        public CompleteStrategy getCompleteStrategy() {
            return this.completeStrategy;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return customReplyRules
         */
        public java.util.List<CustomReplyRules> getCustomReplyRules() {
            return this.customReplyRules;
        }

        /**
         * @return dialogueTextFlag
         */
        public Boolean getDialogueTextFlag() {
            return this.dialogueTextFlag;
        }

        /**
         * @return dialogueTipFlag
         */
        public Boolean getDialogueTipFlag() {
            return this.dialogueTipFlag;
        }

        /**
         * @return evaluateReportFlag
         */
        public Boolean getEvaluateReportFlag() {
            return this.evaluateReportFlag;
        }

        /**
         * @return expressiveness
         */
        public java.util.Map<String, String> getExpressiveness() {
            return this.expressiveness;
        }

        /**
         * @return gifDynamicUrl
         */
        public String getGifDynamicUrl() {
            return this.gifDynamicUrl;
        }

        /**
         * @return gifStaticUrl
         */
        public String getGifStaticUrl() {
            return this.gifStaticUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return initiator
         */
        public String getInitiator() {
            return this.initiator;
        }

        /**
         * @return interactionType
         */
        public String getInteractionType() {
            return this.interactionType;
        }

        /**
         * @return introduce
         */
        public String getIntroduce() {
            return this.introduce;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return openingRemarks
         */
        public String getOpeningRemarks() {
            return this.openingRemarks;
        }

        /**
         * @return orderAckFlag
         */
        public Boolean getOrderAckFlag() {
            return this.orderAckFlag;
        }

        /**
         * @return sampleDialogueList
         */
        public java.util.List<SampleDialogueList> getSampleDialogueList() {
            return this.sampleDialogueList;
        }

        /**
         * @return scoreConfig
         */
        public ScoreConfig getScoreConfig() {
            return this.scoreConfig;
        }

        /**
         * @return scriptRecordId
         */
        public String getScriptRecordId() {
            return this.scriptRecordId;
        }

        /**
         * @return sparringTipContent
         */
        public String getSparringTipContent() {
            return this.sparringTipContent;
        }

        /**
         * @return sparringTipTitle
         */
        public String getSparringTipTitle() {
            return this.sparringTipTitle;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return studentThinkTimeFlag
         */
        public Boolean getStudentThinkTimeFlag() {
            return this.studentThinkTimeFlag;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return weights
         */
        public Weights getWeights() {
            return this.weights;
        }

        public static final class Builder {
            private String appendQuestionFlag; 
            private String assessmentScope; 
            private String closingRemarks; 
            private CompleteStrategy completeStrategy; 
            private String coverUrl; 
            private java.util.List<CustomReplyRules> customReplyRules; 
            private Boolean dialogueTextFlag; 
            private Boolean dialogueTipFlag; 
            private Boolean evaluateReportFlag; 
            private java.util.Map<String, String> expressiveness; 
            private String gifDynamicUrl; 
            private String gifStaticUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private String initiator; 
            private String interactionType; 
            private String introduce; 
            private String name; 
            private String openingRemarks; 
            private Boolean orderAckFlag; 
            private java.util.List<SampleDialogueList> sampleDialogueList; 
            private ScoreConfig scoreConfig; 
            private String scriptRecordId; 
            private String sparringTipContent; 
            private String sparringTipTitle; 
            private Integer status; 
            private Boolean studentThinkTimeFlag; 
            private Integer type; 
            private Weights weights; 

            private Builder() {
            } 

            private Builder(List model) {
                this.appendQuestionFlag = model.appendQuestionFlag;
                this.assessmentScope = model.assessmentScope;
                this.closingRemarks = model.closingRemarks;
                this.completeStrategy = model.completeStrategy;
                this.coverUrl = model.coverUrl;
                this.customReplyRules = model.customReplyRules;
                this.dialogueTextFlag = model.dialogueTextFlag;
                this.dialogueTipFlag = model.dialogueTipFlag;
                this.evaluateReportFlag = model.evaluateReportFlag;
                this.expressiveness = model.expressiveness;
                this.gifDynamicUrl = model.gifDynamicUrl;
                this.gifStaticUrl = model.gifStaticUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.initiator = model.initiator;
                this.interactionType = model.interactionType;
                this.introduce = model.introduce;
                this.name = model.name;
                this.openingRemarks = model.openingRemarks;
                this.orderAckFlag = model.orderAckFlag;
                this.sampleDialogueList = model.sampleDialogueList;
                this.scoreConfig = model.scoreConfig;
                this.scriptRecordId = model.scriptRecordId;
                this.sparringTipContent = model.sparringTipContent;
                this.sparringTipTitle = model.sparringTipTitle;
                this.status = model.status;
                this.studentThinkTimeFlag = model.studentThinkTimeFlag;
                this.type = model.type;
                this.weights = model.weights;
            } 

            /**
             * appendQuestionFlag.
             */
            public Builder appendQuestionFlag(String appendQuestionFlag) {
                this.appendQuestionFlag = appendQuestionFlag;
                return this;
            }

            /**
             * assessmentScope.
             */
            public Builder assessmentScope(String assessmentScope) {
                this.assessmentScope = assessmentScope;
                return this;
            }

            /**
             * closingRemarks.
             */
            public Builder closingRemarks(String closingRemarks) {
                this.closingRemarks = closingRemarks;
                return this;
            }

            /**
             * completeStrategy.
             */
            public Builder completeStrategy(CompleteStrategy completeStrategy) {
                this.completeStrategy = completeStrategy;
                return this;
            }

            /**
             * coverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * customReplyRules.
             */
            public Builder customReplyRules(java.util.List<CustomReplyRules> customReplyRules) {
                this.customReplyRules = customReplyRules;
                return this;
            }

            /**
             * dialogueTextFlag.
             */
            public Builder dialogueTextFlag(Boolean dialogueTextFlag) {
                this.dialogueTextFlag = dialogueTextFlag;
                return this;
            }

            /**
             * dialogueTipFlag.
             */
            public Builder dialogueTipFlag(Boolean dialogueTipFlag) {
                this.dialogueTipFlag = dialogueTipFlag;
                return this;
            }

            /**
             * evaluateReportFlag.
             */
            public Builder evaluateReportFlag(Boolean evaluateReportFlag) {
                this.evaluateReportFlag = evaluateReportFlag;
                return this;
            }

            /**
             * expressiveness.
             */
            public Builder expressiveness(java.util.Map<String, String> expressiveness) {
                this.expressiveness = expressiveness;
                return this;
            }

            /**
             * gifDynamicUrl.
             */
            public Builder gifDynamicUrl(String gifDynamicUrl) {
                this.gifDynamicUrl = gifDynamicUrl;
                return this;
            }

            /**
             * gifStaticUrl.
             */
            public Builder gifStaticUrl(String gifStaticUrl) {
                this.gifStaticUrl = gifStaticUrl;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * initiator.
             */
            public Builder initiator(String initiator) {
                this.initiator = initiator;
                return this;
            }

            /**
             * interactionType.
             */
            public Builder interactionType(String interactionType) {
                this.interactionType = interactionType;
                return this;
            }

            /**
             * introduce.
             */
            public Builder introduce(String introduce) {
                this.introduce = introduce;
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
             * openingRemarks.
             */
            public Builder openingRemarks(String openingRemarks) {
                this.openingRemarks = openingRemarks;
                return this;
            }

            /**
             * orderAckFlag.
             */
            public Builder orderAckFlag(Boolean orderAckFlag) {
                this.orderAckFlag = orderAckFlag;
                return this;
            }

            /**
             * sampleDialogueList.
             */
            public Builder sampleDialogueList(java.util.List<SampleDialogueList> sampleDialogueList) {
                this.sampleDialogueList = sampleDialogueList;
                return this;
            }

            /**
             * scoreConfig.
             */
            public Builder scoreConfig(ScoreConfig scoreConfig) {
                this.scoreConfig = scoreConfig;
                return this;
            }

            /**
             * scriptRecordId.
             */
            public Builder scriptRecordId(String scriptRecordId) {
                this.scriptRecordId = scriptRecordId;
                return this;
            }

            /**
             * sparringTipContent.
             */
            public Builder sparringTipContent(String sparringTipContent) {
                this.sparringTipContent = sparringTipContent;
                return this;
            }

            /**
             * sparringTipTitle.
             */
            public Builder sparringTipTitle(String sparringTipTitle) {
                this.sparringTipTitle = sparringTipTitle;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * studentThinkTimeFlag.
             */
            public Builder studentThinkTimeFlag(Boolean studentThinkTimeFlag) {
                this.studentThinkTimeFlag = studentThinkTimeFlag;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * weights.
             */
            public Builder weights(Weights weights) {
                this.weights = weights;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
