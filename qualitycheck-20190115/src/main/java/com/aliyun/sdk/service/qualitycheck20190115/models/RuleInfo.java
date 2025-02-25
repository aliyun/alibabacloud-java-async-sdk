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
    private Integer scoreNum;

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
        private Integer scoreNum; 
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

        /**
         * AutoReview.
         */
        public Builder autoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }

        /**
         * BusinessCategoryNameList.
         */
        public Builder businessCategoryNameList(java.util.List<String> businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }

        /**
         * CheckType.
         */
        public Builder checkType(Long checkType) {
            this.checkType = checkType;
            return this;
        }

        /**
         * Comments.
         */
        public Builder comments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(Integer configType) {
            this.configType = configType;
            return this;
        }

        /**
         * CreateEmpName.
         */
        public Builder createEmpName(String createEmpName) {
            this.createEmpName = createEmpName;
            return this;
        }

        /**
         * CreateEmpid.
         */
        public Builder createEmpid(String createEmpid) {
            this.createEmpid = createEmpid;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Deny.
         */
        public Builder deny(Integer deny) {
            this.deny = deny;
            return this;
        }

        /**
         * Dialogues.
         */
        public Builder dialogues(java.util.List<RuleTestDialogue> dialogues) {
            this.dialogues = dialogues;
            return this;
        }

        /**
         * Effective.
         */
        public Builder effective(Integer effective) {
            this.effective = effective;
            return this;
        }

        /**
         * EffectiveEndTime.
         */
        public Builder effectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * EffectiveStartTime.
         */
        public Builder effectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ExternalProperty.
         */
        public Builder externalProperty(Integer externalProperty) {
            this.externalProperty = externalProperty;
            return this;
        }

        /**
         * FullCycle.
         */
        public Builder fullCycle(Integer fullCycle) {
            this.fullCycle = fullCycle;
            return this;
        }

        /**
         * GraphFlow.
         */
        public Builder graphFlow(Object graphFlow) {
            this.graphFlow = graphFlow;
            return this;
        }

        /**
         * IsDelete.
         */
        public Builder isDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }

        /**
         * IsOnline.
         */
        public Builder isOnline(Integer isOnline) {
            this.isOnline = isOnline;
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
         * LastUpdateEmpName.
         */
        public Builder lastUpdateEmpName(String lastUpdateEmpName) {
            this.lastUpdateEmpName = lastUpdateEmpName;
            return this;
        }

        /**
         * LastUpdateEmpid.
         */
        public Builder lastUpdateEmpid(String lastUpdateEmpid) {
            this.lastUpdateEmpid = lastUpdateEmpid;
            return this;
        }

        /**
         * LastUpdateTime.
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * Meet.
         */
        public Builder meet(Integer meet) {
            this.meet = meet;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(Integer modifyType) {
            this.modifyType = modifyType;
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
         * OperationMode.
         */
        public Builder operationMode(Integer operationMode) {
            this.operationMode = operationMode;
            return this;
        }

        /**
         * QualityCheckType.
         */
        public Builder qualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }

        /**
         * Rid.
         */
        public Builder rid(String rid) {
            this.rid = rid;
            return this;
        }

        /**
         * RuleCategoryName.
         */
        public Builder ruleCategoryName(String ruleCategoryName) {
            this.ruleCategoryName = ruleCategoryName;
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
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * SchemeCheckType.
         */
        public Builder schemeCheckType(SchemeCheckType schemeCheckType) {
            this.schemeCheckType = schemeCheckType;
            return this;
        }

        /**
         * SchemeId.
         */
        public Builder schemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }

        /**
         * SchemeName.
         */
        public Builder schemeName(String schemeName) {
            this.schemeName = schemeName;
            return this;
        }

        /**
         * SchemeRuleMappingId.
         */
        public Builder schemeRuleMappingId(Long schemeRuleMappingId) {
            this.schemeRuleMappingId = schemeRuleMappingId;
            return this;
        }

        /**
         * ScoreDeleted.
         */
        public Builder scoreDeleted(Boolean scoreDeleted) {
            this.scoreDeleted = scoreDeleted;
            return this;
        }

        /**
         * ScoreId.
         */
        public Builder scoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }

        /**
         * ScoreName.
         */
        public Builder scoreName(String scoreName) {
            this.scoreName = scoreName;
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
         * ScoreSubId.
         */
        public Builder scoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }

        /**
         * ScoreSubName.
         */
        public Builder scoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
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
         * SortIndex.
         */
        public Builder sortIndex(Integer sortIndex) {
            this.sortIndex = sortIndex;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * TaskFlowId.
         */
        public Builder taskFlowId(Long taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }

        /**
         * TaskFlowType.
         */
        public Builder taskFlowType(Integer taskFlowType) {
            this.taskFlowType = taskFlowType;
            return this;
        }

        /**
         * Triggers.
         */
        public Builder triggers(java.util.List<String> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public RuleInfo build() {
            return new RuleInfo(this);
        } 

    } 

}
