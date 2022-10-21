// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RuleInfo} extends {@link TeaModel}
 *
 * <p>RuleInfo</p>
 */
public class RuleInfo extends TeaModel {
    @NameInMap("AutoReview")
    private Integer autoReview;

    @NameInMap("BusinessCategoryNameList")
    private java.util.List < String > businessCategoryNameList;

    @NameInMap("CheckType")
    private Long checkType;

    @NameInMap("Comments")
    private String comments;

    @NameInMap("ConfigType")
    private Integer configType;

    @NameInMap("CreateEmpName")
    private String createEmpName;

    @NameInMap("CreateEmpid")
    private String createEmpid;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Deny")
    private Integer deny;

    @NameInMap("Dialogues")
    private java.util.List < RuleTestDialogue > dialogues;

    @NameInMap("Effective")
    private Integer effective;

    @NameInMap("EffectiveEndTime")
    private String effectiveEndTime;

    @NameInMap("EffectiveStartTime")
    private String effectiveStartTime;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("ExternalProperty")
    private Integer externalProperty;

    @NameInMap("FullCycle")
    private Integer fullCycle;

    @NameInMap("GraphFlow")
    private Object graphFlow;

    @NameInMap("IsDelete")
    private Integer isDelete;

    @NameInMap("IsOnline")
    private Integer isOnline;

    @NameInMap("Lambda")
    private String lambda;

    @NameInMap("LastUpdateEmpName")
    private String lastUpdateEmpName;

    @NameInMap("LastUpdateEmpid")
    private String lastUpdateEmpid;

    @NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @NameInMap("Level")
    private Integer level;

    @NameInMap("Meet")
    private Integer meet;

    @NameInMap("ModifyType")
    private Integer modifyType;

    @NameInMap("Name")
    private String name;

    @NameInMap("OperationMode")
    private Integer operationMode;

    @NameInMap("QualityCheckType")
    private Integer qualityCheckType;

    @NameInMap("Rid")
    private String rid;

    @NameInMap("RuleCategoryName")
    private String ruleCategoryName;

    @NameInMap("RuleScoreType")
    private Integer ruleScoreType;

    @NameInMap("RuleType")
    private Integer ruleType;

    @NameInMap("SchemeCheckType")
    private SchemeCheckType schemeCheckType;

    @NameInMap("SchemeId")
    private Long schemeId;

    @NameInMap("SchemeName")
    private String schemeName;

    @NameInMap("SchemeRuleMappingId")
    private Long schemeRuleMappingId;

    @NameInMap("ScoreDeleted")
    private Boolean scoreDeleted;

    @NameInMap("ScoreId")
    private Long scoreId;

    @NameInMap("ScoreName")
    private String scoreName;

    @NameInMap("ScoreNum")
    private Integer scoreNum;

    @NameInMap("ScoreNumType")
    private Integer scoreNumType;

    @NameInMap("ScoreRuleHitType")
    private Integer scoreRuleHitType;

    @NameInMap("ScoreSubId")
    private Long scoreSubId;

    @NameInMap("ScoreSubName")
    private String scoreSubName;

    @NameInMap("ScoreType")
    private Integer scoreType;

    @NameInMap("SortIndex")
    private Integer sortIndex;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("TargetType")
    private Integer targetType;

    @NameInMap("TaskFlowId")
    private Long taskFlowId;

    @NameInMap("TaskFlowType")
    private Integer taskFlowType;

    @NameInMap("Triggers")
    private java.util.List < String > triggers;

    @NameInMap("Type")
    private Integer type;

    @NameInMap("Weight")
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
    public java.util.List < String > getBusinessCategoryNameList() {
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
    public java.util.List < RuleTestDialogue > getDialogues() {
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
    public java.util.List < String > getTriggers() {
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
        private java.util.List < String > businessCategoryNameList; 
        private Long checkType; 
        private String comments; 
        private Integer configType; 
        private String createEmpName; 
        private String createEmpid; 
        private String createTime; 
        private Integer deny; 
        private java.util.List < RuleTestDialogue > dialogues; 
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
        private java.util.List < String > triggers; 
        private Integer type; 
        private String weight; 

        /**
         * 审核选项 1 不自动审核 3 自动审核 //4.0 协议兼容使用
         */
        public Builder autoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }

        /**
         * 业务名称列表
         */
        public Builder businessCategoryNameList(java.util.List < String > businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }

        /**
         * 0-服务规范性检测 1-服务态度检测 2-服务专业性检测 3-客户态度检测  4-服务流程正确性检测
         */
        public Builder checkType(Long checkType) {
            this.checkType = checkType;
            return this;
        }

        /**
         * 备注
         */
        public Builder comments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
         * 配置类型：1：简单条件配置，2：高级配置，默认1 //4.0协议专用
         */
        public Builder configType(Integer configType) {
            this.configType = configType;
            return this;
        }

        /**
         * 创建人姓名
         */
        public Builder createEmpName(String createEmpName) {
            this.createEmpName = createEmpName;
            return this;
        }

        /**
         * 创建人工号
         */
        public Builder createEmpid(String createEmpid) {
            this.createEmpid = createEmpid;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 1拒绝编辑规则，0/null可以编辑规则
         */
        public Builder deny(Integer deny) {
            this.deny = deny;
            return this;
        }

        /**
         * 测试文案
         */
        public Builder dialogues(java.util.List < RuleTestDialogue > dialogues) {
            this.dialogues = dialogues;
            return this;
        }

        /**
         * 是否生效：0否，1是
         */
        public Builder effective(Integer effective) {
            this.effective = effective;
            return this;
        }

        /**
         * 生效结束时间
         */
        public Builder effectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * 生效开始时间
         */
        public Builder effectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 外部属性
         */
        public Builder externalProperty(Integer externalProperty) {
            this.externalProperty = externalProperty;
            return this;
        }

        /**
         * 是否为全生命周期生效，0否，1是
         */
        public Builder fullCycle(Integer fullCycle) {
            this.fullCycle = fullCycle;
            return this;
        }

        /**
         * 图流程画布
         */
        public Builder graphFlow(Object graphFlow) {
            this.graphFlow = graphFlow;
            return this;
        }

        /**
         * 是否已删除
         */
        public Builder isDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }

        /**
         * 是否在线
         */
        public Builder isOnline(Integer isOnline) {
            this.isOnline = isOnline;
            return this;
        }

        /**
         * 形如a&&b的条件表达式
         */
        public Builder lambda(String lambda) {
            this.lambda = lambda;
            return this;
        }

        /**
         * 最后更新人姓名
         */
        public Builder lastUpdateEmpName(String lastUpdateEmpName) {
            this.lastUpdateEmpName = lastUpdateEmpName;
            return this;
        }

        /**
         * 最后更新人工号
         */
        public Builder lastUpdateEmpid(String lastUpdateEmpid) {
            this.lastUpdateEmpid = lastUpdateEmpid;
            return this;
        }

        /**
         * 最后更新时间
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * 规则级别：0 重度违规 1 中度违规 2 轻度违规
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * 是否满足
         */
        public Builder meet(Integer meet) {
            this.meet = meet;
            return this;
        }

        /**
         * 在质检方案中是否已修改
         */
        public Builder modifyType(Integer modifyType) {
            this.modifyType = modifyType;
            return this;
        }

        /**
         * 规则名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 操作模式
         */
        public Builder operationMode(Integer operationMode) {
            this.operationMode = operationMode;
            return this;
        }

        /**
         * 质检类型：0 离线质检，1 实时质检 //4.0逻辑兼容使用
         */
        public Builder qualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }

        /**
         * 规则ID
         */
        public Builder rid(String rid) {
            this.rid = rid;
            return this;
        }

        /**
         * 规则类别名称
         */
        public Builder ruleCategoryName(String ruleCategoryName) {
            this.ruleCategoryName = ruleCategoryName;
            return this;
        }

        /**
         * 是否计分 1不计分 3计分 //4.0 协议兼容使用
         */
        public Builder ruleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }

        /**
         * 0：默认；1：用户创建 //4.0逻辑兼容使用
         */
        public Builder ruleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * 质检维度对象
         */
        public Builder schemeCheckType(SchemeCheckType schemeCheckType) {
            this.schemeCheckType = schemeCheckType;
            return this;
        }

        /**
         * 所属质检方案Id
         */
        public Builder schemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }

        /**
         * 质检方案名称
         */
        public Builder schemeName(String schemeName) {
            this.schemeName = schemeName;
            return this;
        }

        /**
         * 质检方案与规则映射ID
         */
        public Builder schemeRuleMappingId(Long schemeRuleMappingId) {
            this.schemeRuleMappingId = schemeRuleMappingId;
            return this;
        }

        /**
         * 评分项是否删除，用于删除时显示置灰
         */
        public Builder scoreDeleted(Boolean scoreDeleted) {
            this.scoreDeleted = scoreDeleted;
            return this;
        }

        /**
         * 评分大项ID
         */
        public Builder scoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }

        /**
         * 评分大项名称
         */
        public Builder scoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }

        /**
         * 分数num
         */
        public Builder scoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }

        /**
         * 0-触发规则后加减分 1-触发规则后一次性得分 //4.0协议专用
         */
        public Builder scoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }

        /**
         * 0-命中节点时计分
         */
        public Builder scoreRuleHitType(Integer scoreRuleHitType) {
            this.scoreRuleHitType = scoreRuleHitType;
            return this;
        }

        /**
         * 小项id
         */
        public Builder scoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }

        /**
         * 评分小项
         */
        public Builder scoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }

        /**
         * 加分或者减分
         */
        public Builder scoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }

        /**
         * 质检维度内的排序
         */
        public Builder sortIndex(Integer sortIndex) {
            this.sortIndex = sortIndex;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * 规则状态
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 规则类别：10：质检方案-通用规则；11：质检方案-流程规则 //4.0协议专用
         */
        public Builder targetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * 流程画布ID
         */
        public Builder taskFlowId(Long taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }

        /**
         * 流程图类型-已废弃-默认-1
         */
        public Builder taskFlowType(Integer taskFlowType) {
            this.taskFlowType = taskFlowType;
            return this;
        }

        /**
         * 关注的条件列表
         */
        public Builder triggers(java.util.List < String > triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * RuleCategory，2舆情监控，3业务类  //4.0 逻辑兼容使用
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 权重
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
