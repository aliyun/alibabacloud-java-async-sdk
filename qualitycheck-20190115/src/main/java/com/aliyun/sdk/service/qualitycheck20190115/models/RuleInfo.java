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
 * {@link RuleInfo} extends {@link TeaModel}
 *
 * <p>RuleInfo</p>
 */
public class RuleInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoReview")
    private Integer autoReview;

    @com.aliyun.core.annotation.NameInMap("BusinessCategoryNameList")
    private java.util.List<String> businessCategoryNameList;

    @com.aliyun.core.annotation.NameInMap("CheckType")
    private Long checkType;

    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private Integer configType;

    @com.aliyun.core.annotation.NameInMap("CreateEmpName")
    private String createEmpName;

    @com.aliyun.core.annotation.NameInMap("CreateEmpid")
    private String createEmpid;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Deny")
    private Integer deny;

    @com.aliyun.core.annotation.NameInMap("Dialogues")
    private java.util.List<RuleTestDialogue> dialogues;

    @com.aliyun.core.annotation.NameInMap("Effective")
    private Integer effective;

    @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
    private String effectiveEndTime;

    @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
    private String effectiveStartTime;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ExternalProperty")
    private Integer externalProperty;

    @com.aliyun.core.annotation.NameInMap("FullCycle")
    private Integer fullCycle;

    @com.aliyun.core.annotation.NameInMap("GraphFlow")
    private Object graphFlow;

    @com.aliyun.core.annotation.NameInMap("IsDelete")
    private Integer isDelete;

    @com.aliyun.core.annotation.NameInMap("IsOnline")
    private Integer isOnline;

    @com.aliyun.core.annotation.NameInMap("Lambda")
    private String lambda;

    @com.aliyun.core.annotation.NameInMap("LastUpdateEmpName")
    private String lastUpdateEmpName;

    @com.aliyun.core.annotation.NameInMap("LastUpdateEmpid")
    private String lastUpdateEmpid;

    @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("Meet")
    private Integer meet;

    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private Integer modifyType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OperationMode")
    private Integer operationMode;

    @com.aliyun.core.annotation.NameInMap("PreqRule")
    private PreqRule preqRule;

    @com.aliyun.core.annotation.NameInMap("QualityCheckType")
    private Integer qualityCheckType;

    @com.aliyun.core.annotation.NameInMap("Rid")
    private String rid;

    @com.aliyun.core.annotation.NameInMap("RuleCategoryName")
    private String ruleCategoryName;

    @com.aliyun.core.annotation.NameInMap("RuleScoreType")
    private Integer ruleScoreType;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.NameInMap("SchemeCheckType")
    private SchemeCheckType schemeCheckType;

    @com.aliyun.core.annotation.NameInMap("SchemeId")
    private Long schemeId;

    @com.aliyun.core.annotation.NameInMap("SchemeName")
    private String schemeName;

    @com.aliyun.core.annotation.NameInMap("SchemeRuleMappingId")
    private Long schemeRuleMappingId;

    @com.aliyun.core.annotation.NameInMap("ScoreDeleted")
    private Boolean scoreDeleted;

    @com.aliyun.core.annotation.NameInMap("ScoreId")
    private Long scoreId;

    @com.aliyun.core.annotation.NameInMap("ScoreName")
    private String scoreName;

    @com.aliyun.core.annotation.NameInMap("ScoreNum")
    private Float scoreNum;

    @com.aliyun.core.annotation.NameInMap("ScoreNumType")
    private Integer scoreNumType;

    @com.aliyun.core.annotation.NameInMap("ScoreRuleHitType")
    private Integer scoreRuleHitType;

    @com.aliyun.core.annotation.NameInMap("ScoreSubId")
    private Long scoreSubId;

    @com.aliyun.core.annotation.NameInMap("ScoreSubName")
    private String scoreSubName;

    @com.aliyun.core.annotation.NameInMap("ScoreType")
    private Integer scoreType;

    @com.aliyun.core.annotation.NameInMap("SortIndex")
    private Integer sortIndex;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("TargetType")
    private Integer targetType;

    @com.aliyun.core.annotation.NameInMap("TaskFlowId")
    private Long taskFlowId;

    @com.aliyun.core.annotation.NameInMap("TaskFlowType")
    private Integer taskFlowType;

    @com.aliyun.core.annotation.NameInMap("Triggers")
    private java.util.List<String> triggers;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private String weight;

    private RuleInfo(Builder builder) {
        this.autoReview = builder.autoReview;
        this.businessCategoryNameList = builder.businessCategoryNameList;
        this.checkType = builder.checkType;
        this.comments = builder.comments;
        this.configType = builder.configType;
        this.createEmpName = builder.createEmpName;
        this.createEmpid = builder.createEmpid;
        this.createTime = builder.createTime;
        this.deny = builder.deny;
        this.dialogues = builder.dialogues;
        this.effective = builder.effective;
        this.effectiveEndTime = builder.effectiveEndTime;
        this.effectiveStartTime = builder.effectiveStartTime;
        this.endTime = builder.endTime;
        this.externalProperty = builder.externalProperty;
        this.fullCycle = builder.fullCycle;
        this.graphFlow = builder.graphFlow;
        this.isDelete = builder.isDelete;
        this.isOnline = builder.isOnline;
        this.lambda = builder.lambda;
        this.lastUpdateEmpName = builder.lastUpdateEmpName;
        this.lastUpdateEmpid = builder.lastUpdateEmpid;
        this.lastUpdateTime = builder.lastUpdateTime;
        this.level = builder.level;
        this.meet = builder.meet;
        this.modifyType = builder.modifyType;
        this.name = builder.name;
        this.operationMode = builder.operationMode;
        this.preqRule = builder.preqRule;
        this.qualityCheckType = builder.qualityCheckType;
        this.rid = builder.rid;
        this.ruleCategoryName = builder.ruleCategoryName;
        this.ruleScoreType = builder.ruleScoreType;
        this.ruleType = builder.ruleType;
        this.schemeCheckType = builder.schemeCheckType;
        this.schemeId = builder.schemeId;
        this.schemeName = builder.schemeName;
        this.schemeRuleMappingId = builder.schemeRuleMappingId;
        this.scoreDeleted = builder.scoreDeleted;
        this.scoreId = builder.scoreId;
        this.scoreName = builder.scoreName;
        this.scoreNum = builder.scoreNum;
        this.scoreNumType = builder.scoreNumType;
        this.scoreRuleHitType = builder.scoreRuleHitType;
        this.scoreSubId = builder.scoreSubId;
        this.scoreSubName = builder.scoreSubName;
        this.scoreType = builder.scoreType;
        this.sortIndex = builder.sortIndex;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.targetType = builder.targetType;
        this.taskFlowId = builder.taskFlowId;
        this.taskFlowType = builder.taskFlowType;
        this.triggers = builder.triggers;
        this.type = builder.type;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RuleInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoReview
     */
    public Integer getAutoReview() {
        return this.autoReview;
    }

    /**
     * @return businessCategoryNameList
     */
    public java.util.List<String> getBusinessCategoryNameList() {
        return this.businessCategoryNameList;
    }

    /**
     * @return checkType
     */
    public Long getCheckType() {
        return this.checkType;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return configType
     */
    public Integer getConfigType() {
        return this.configType;
    }

    /**
     * @return createEmpName
     */
    public String getCreateEmpName() {
        return this.createEmpName;
    }

    /**
     * @return createEmpid
     */
    public String getCreateEmpid() {
        return this.createEmpid;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deny
     */
    public Integer getDeny() {
        return this.deny;
    }

    /**
     * @return dialogues
     */
    public java.util.List<RuleTestDialogue> getDialogues() {
        return this.dialogues;
    }

    /**
     * @return effective
     */
    public Integer getEffective() {
        return this.effective;
    }

    /**
     * @return effectiveEndTime
     */
    public String getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    /**
     * @return effectiveStartTime
     */
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return externalProperty
     */
    public Integer getExternalProperty() {
        return this.externalProperty;
    }

    /**
     * @return fullCycle
     */
    public Integer getFullCycle() {
        return this.fullCycle;
    }

    /**
     * @return graphFlow
     */
    public Object getGraphFlow() {
        return this.graphFlow;
    }

    /**
     * @return isDelete
     */
    public Integer getIsDelete() {
        return this.isDelete;
    }

    /**
     * @return isOnline
     */
    public Integer getIsOnline() {
        return this.isOnline;
    }

    /**
     * @return lambda
     */
    public String getLambda() {
        return this.lambda;
    }

    /**
     * @return lastUpdateEmpName
     */
    public String getLastUpdateEmpName() {
        return this.lastUpdateEmpName;
    }

    /**
     * @return lastUpdateEmpid
     */
    public String getLastUpdateEmpid() {
        return this.lastUpdateEmpid;
    }

    /**
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return meet
     */
    public Integer getMeet() {
        return this.meet;
    }

    /**
     * @return modifyType
     */
    public Integer getModifyType() {
        return this.modifyType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operationMode
     */
    public Integer getOperationMode() {
        return this.operationMode;
    }

    /**
     * @return preqRule
     */
    public PreqRule getPreqRule() {
        return this.preqRule;
    }

    /**
     * @return qualityCheckType
     */
    public Integer getQualityCheckType() {
        return this.qualityCheckType;
    }

    /**
     * @return rid
     */
    public String getRid() {
        return this.rid;
    }

    /**
     * @return ruleCategoryName
     */
    public String getRuleCategoryName() {
        return this.ruleCategoryName;
    }

    /**
     * @return ruleScoreType
     */
    public Integer getRuleScoreType() {
        return this.ruleScoreType;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return schemeCheckType
     */
    public SchemeCheckType getSchemeCheckType() {
        return this.schemeCheckType;
    }

    /**
     * @return schemeId
     */
    public Long getSchemeId() {
        return this.schemeId;
    }

    /**
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return schemeRuleMappingId
     */
    public Long getSchemeRuleMappingId() {
        return this.schemeRuleMappingId;
    }

    /**
     * @return scoreDeleted
     */
    public Boolean getScoreDeleted() {
        return this.scoreDeleted;
    }

    /**
     * @return scoreId
     */
    public Long getScoreId() {
        return this.scoreId;
    }

    /**
     * @return scoreName
     */
    public String getScoreName() {
        return this.scoreName;
    }

    /**
     * @return scoreNum
     */
    public Float getScoreNum() {
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
     * @return scoreSubId
     */
    public Long getScoreSubId() {
        return this.scoreSubId;
    }

    /**
     * @return scoreSubName
     */
    public String getScoreSubName() {
        return this.scoreSubName;
    }

    /**
     * @return scoreType
     */
    public Integer getScoreType() {
        return this.scoreType;
    }

    /**
     * @return sortIndex
     */
    public Integer getSortIndex() {
        return this.sortIndex;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return targetType
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    /**
     * @return taskFlowId
     */
    public Long getTaskFlowId() {
        return this.taskFlowId;
    }

    /**
     * @return taskFlowType
     */
    public Integer getTaskFlowType() {
        return this.taskFlowType;
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
    public Integer getType() {
        return this.type;
    }

    /**
     * @return weight
     */
    public String getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private Integer autoReview; 
        private java.util.List<String> businessCategoryNameList; 
        private Long checkType; 
        private String comments; 
        private Integer configType; 
        private String createEmpName; 
        private String createEmpid; 
        private String createTime; 
        private Integer deny; 
        private java.util.List<RuleTestDialogue> dialogues; 
        private Integer effective; 
        private String effectiveEndTime; 
        private String effectiveStartTime; 
        private String endTime; 
        private Integer externalProperty; 
        private Integer fullCycle; 
        private Object graphFlow; 
        private Integer isDelete; 
        private Integer isOnline; 
        private String lambda; 
        private String lastUpdateEmpName; 
        private String lastUpdateEmpid; 
        private String lastUpdateTime; 
        private Integer level; 
        private Integer meet; 
        private Integer modifyType; 
        private String name; 
        private Integer operationMode; 
        private PreqRule preqRule; 
        private Integer qualityCheckType; 
        private String rid; 
        private String ruleCategoryName; 
        private Integer ruleScoreType; 
        private Integer ruleType; 
        private SchemeCheckType schemeCheckType; 
        private Long schemeId; 
        private String schemeName; 
        private Long schemeRuleMappingId; 
        private Boolean scoreDeleted; 
        private Long scoreId; 
        private String scoreName; 
        private Float scoreNum; 
        private Integer scoreNumType; 
        private Integer scoreRuleHitType; 
        private Long scoreSubId; 
        private String scoreSubName; 
        private Integer scoreType; 
        private Integer sortIndex; 
        private String startTime; 
        private Integer status; 
        private Integer targetType; 
        private Long taskFlowId; 
        private Integer taskFlowType; 
        private java.util.List<String> triggers; 
        private Integer type; 
        private String weight; 

        private Builder() {
        } 

        private Builder(RuleInfo model) {
            this.autoReview = model.autoReview;
            this.businessCategoryNameList = model.businessCategoryNameList;
            this.checkType = model.checkType;
            this.comments = model.comments;
            this.configType = model.configType;
            this.createEmpName = model.createEmpName;
            this.createEmpid = model.createEmpid;
            this.createTime = model.createTime;
            this.deny = model.deny;
            this.dialogues = model.dialogues;
            this.effective = model.effective;
            this.effectiveEndTime = model.effectiveEndTime;
            this.effectiveStartTime = model.effectiveStartTime;
            this.endTime = model.endTime;
            this.externalProperty = model.externalProperty;
            this.fullCycle = model.fullCycle;
            this.graphFlow = model.graphFlow;
            this.isDelete = model.isDelete;
            this.isOnline = model.isOnline;
            this.lambda = model.lambda;
            this.lastUpdateEmpName = model.lastUpdateEmpName;
            this.lastUpdateEmpid = model.lastUpdateEmpid;
            this.lastUpdateTime = model.lastUpdateTime;
            this.level = model.level;
            this.meet = model.meet;
            this.modifyType = model.modifyType;
            this.name = model.name;
            this.operationMode = model.operationMode;
            this.preqRule = model.preqRule;
            this.qualityCheckType = model.qualityCheckType;
            this.rid = model.rid;
            this.ruleCategoryName = model.ruleCategoryName;
            this.ruleScoreType = model.ruleScoreType;
            this.ruleType = model.ruleType;
            this.schemeCheckType = model.schemeCheckType;
            this.schemeId = model.schemeId;
            this.schemeName = model.schemeName;
            this.schemeRuleMappingId = model.schemeRuleMappingId;
            this.scoreDeleted = model.scoreDeleted;
            this.scoreId = model.scoreId;
            this.scoreName = model.scoreName;
            this.scoreNum = model.scoreNum;
            this.scoreNumType = model.scoreNumType;
            this.scoreRuleHitType = model.scoreRuleHitType;
            this.scoreSubId = model.scoreSubId;
            this.scoreSubName = model.scoreSubName;
            this.scoreType = model.scoreType;
            this.sortIndex = model.sortIndex;
            this.startTime = model.startTime;
            this.status = model.status;
            this.targetType = model.targetType;
            this.taskFlowId = model.taskFlowId;
            this.taskFlowType = model.taskFlowType;
            this.triggers = model.triggers;
            this.type = model.type;
            this.weight = model.weight;
        } 

        /**
         * <p>The review option. Valid values: 1: no automatic review. 3: automatic review. This field is used for 4.0 protocol compatibility.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }

        /**
         * <p>The list of business category names.</p>
         */
        public Builder businessCategoryNameList(java.util.List<String> businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }

        /**
         * <p>The check type. Valid values: 0: Service standard check. 1: Service attitude check. 2: Service professionalism check. 3: Customer attitude check. 4: Service process correctness check.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder checkType(Long checkType) {
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The comments.</p>
         * 
         * <strong>example:</strong>
         * <p>Violation</p>
         */
        public Builder comments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
         * <p>The configuration type. This parameter is dedicated to the version 4.0 protocol. Valid values: 1: Simple condition configuration. 2: Advanced configuration. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder configType(Integer configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder createEmpName(String createEmpName) {
            this.createEmpName = createEmpName;
            return this;
        }

        /**
         * <p>The employee ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder createEmpid(String createEmpid) {
            this.createEmpid = createEmpid;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1641277321000</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The edit permission. Valid values: 1: Editing is denied. 0 or null: Editing is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deny(Integer deny) {
            this.deny = deny;
            return this;
        }

        /**
         * <p>The test script.</p>
         */
        public Builder dialogues(java.util.List<RuleTestDialogue> dialogues) {
            this.dialogues = dialogues;
            return this;
        }

        /**
         * <p>The effective status. Valid values: 0: Not effective. 1: Effective.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder effective(Integer effective) {
            this.effective = effective;
            return this;
        }

        /**
         * <p>The effective end time.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationMode</p>
         */
        public Builder effectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * <p>The effective start time.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationMode</p>
         */
        public Builder effectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1641277321000</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The external property.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder externalProperty(Integer externalProperty) {
            this.externalProperty = externalProperty;
            return this;
        }

        /**
         * <p>The full lifecycle effective status. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fullCycle(Integer fullCycle) {
            this.fullCycle = fullCycle;
            return this;
        }

        /**
         * <p>The graph flow canvas.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder graphFlow(Object graphFlow) {
            this.graphFlow = graphFlow;
            return this;
        }

        /**
         * <p>The deletion status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }

        /**
         * <p>The online status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isOnline(Integer isOnline) {
            this.isOnline = isOnline;
            return this;
        }

        /**
         * <p>The conditional expression, such as a&amp;&amp;b.</p>
         * 
         * <strong>example:</strong>
         * <p>a&amp;&amp;b</p>
         */
        public Builder lambda(String lambda) {
            this.lambda = lambda;
            return this;
        }

        /**
         * <p>The name of the last updater.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder lastUpdateEmpName(String lastUpdateEmpName) {
            this.lastUpdateEmpName = lastUpdateEmpName;
            return this;
        }

        /**
         * <p>The employee ID of the last updater.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder lastUpdateEmpid(String lastUpdateEmpid) {
            this.lastUpdateEmpid = lastUpdateEmpid;
            return this;
        }

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1641277321000</p>
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * <p>The rule level. Valid values: 0: Severe violation. 1: Moderate violation. 2: Minor violation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The fulfillment status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder meet(Integer meet) {
            this.meet = meet;
            return this;
        }

        /**
         * <p>Specifies whether the rule is modified in the quality inspection scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modifyType(Integer modifyType) {
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Greeting rule</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The operation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder operationMode(Integer operationMode) {
            this.operationMode = operationMode;
            return this;
        }

        /**
         * <p>The prerequisite rule.</p>
         */
        public Builder preqRule(PreqRule preqRule) {
            this.preqRule = preqRule;
            return this;
        }

        /**
         * <p>The quality check type. This parameter is used for compatibility with version 4.0 logic. Valid values: 0: Offline quality check. 1: Real-time quality check.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder qualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rid(String rid) {
            this.rid = rid;
            return this;
        }

        /**
         * <p>The rule category name.</p>
         * 
         * <strong>example:</strong>
         * <p>Positive rule</p>
         */
        public Builder ruleCategoryName(String ruleCategoryName) {
            this.ruleCategoryName = ruleCategoryName;
            return this;
        }

        /**
         * <p>Specifies whether to calculate the score. Valid values: 1: no scoring. 3: scoring. This field is used for 4.0 protocol compatibility.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder ruleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }

        /**
         * <p>The rule type. Valid values: 0: default. 1: user-created. This field is used for 4.0 logic compatibility.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The quality check dimension object.</p>
         */
        public Builder schemeCheckType(SchemeCheckType schemeCheckType) {
            this.schemeCheckType = schemeCheckType;
            return this;
        }

        /**
         * <p>The ID of the associated quality check scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder schemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }

        /**
         * <p>The name of the quality check scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>General scheme</p>
         */
        public Builder schemeName(String schemeName) {
            this.schemeName = schemeName;
            return this;
        }

        /**
         * <p>The mapping ID between the quality check scheme and the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder schemeRuleMappingId(Long schemeRuleMappingId) {
            this.schemeRuleMappingId = schemeRuleMappingId;
            return this;
        }

        /**
         * <p>The deletion status of the scoring item, which is used to gray out the item when it is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scoreDeleted(Boolean scoreDeleted) {
            this.scoreDeleted = scoreDeleted;
            return this;
        }

        /**
         * <p>The score category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }

        /**
         * <p>The name of the main scoring item.</p>
         * 
         * <strong>example:</strong>
         * <p>Violation</p>
         */
        public Builder scoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }

        /**
         * <p>The score value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scoreNum(Float scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }

        /**
         * <p>The score calculation type. This parameter is dedicated to the version 4.0 protocol. Valid values: 0: Add or deduct points after the rule is triggered. 1: Award a one-time score after the rule is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }

        /**
         * <p>The score rule hit type. Valid values: 0: Score is calculated when a node is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder scoreRuleHitType(Integer scoreRuleHitType) {
            this.scoreRuleHitType = scoreRuleHitType;
            return this;
        }

        /**
         * <p>The sub-item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }

        /**
         * <p>The sub-scoring item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }

        /**
         * <p>The score adjustment type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }

        /**
         * <p>The sort order within the quality inspection dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sortIndex(Integer sortIndex) {
            this.sortIndex = sortIndex;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1641277321000</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The rule category. This parameter is dedicated to the version 4.0 protocol. Valid values: 10: General rule for quality check scheme. 11: Process rule for quality check scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder targetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The flow canvas ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        public Builder taskFlowId(Long taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The task flow type. Default value: -1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskFlowType(Integer taskFlowType) {
            this.taskFlowType = taskFlowType;
            return this;
        }

        /**
         * <p>The list of trigger conditions.</p>
         */
        public Builder triggers(java.util.List<String> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * <p>The rule category. Valid values: 2: public opinion monitoring. 3: business. This field is used for 4.0 logic compatibility.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public RuleInfo build() {
            return new RuleInfo(this);
        } 

    } 

    /**
     * 
     * {@link RuleInfo} extends {@link TeaModel}
     *
     * <p>RuleInfo</p>
     */
    public static class PreqRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        private PreqRule(Builder builder) {
            this.rid = builder.rid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreqRule create() {
            return builder().build();
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        public static final class Builder {
            private String rid; 

            private Builder() {
            } 

            private Builder(PreqRule model) {
                this.rid = model.rid;
            } 

            /**
             * <p>The prerequisite rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            public PreqRule build() {
                return new PreqRule(this);
            } 

        } 

    }
}
