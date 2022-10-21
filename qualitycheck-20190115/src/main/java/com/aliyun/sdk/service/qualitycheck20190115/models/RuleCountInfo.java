// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RuleCountInfo} extends {@link TeaModel}
 *
 * <p>RuleCountInfo</p>
 */
public class RuleCountInfo extends TeaModel {
    @NameInMap("AutoReview")
    private Integer autoReview;

    @NameInMap("BusinessCategoryBasicInfoList")
    private java.util.List < BusinessCategoryBasicInfo > businessCategoryBasicInfoList;

    @NameInMap("BusinessCategoryNameList")
    private java.util.List < String > businessCategoryNameList;

    @NameInMap("BusinessRange")
    private java.util.List < Integer > businessRange;

    @NameInMap("CheckNumber")
    private Long checkNumber;

    @NameInMap("Comments")
    private String comments;

    @NameInMap("CreateEmpName")
    private String createEmpName;

    @NameInMap("CreateEmpid")
    private String createEmpid;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Deny")
    private Integer deny;

    @NameInMap("Effective")
    private Integer effective;

    @NameInMap("EffectiveEndTime")
    private String effectiveEndTime;

    @NameInMap("EffectiveStartTime")
    private String effectiveStartTime;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("FullCycle")
    private Integer fullCycle;

    @NameInMap("GraphFlow")
    private Object graphFlow;

    @NameInMap("HitNumber")
    private Long hitNumber;

    @NameInMap("HitRate")
    private Float hitRate;

    @NameInMap("HitRealViolationRate")
    private Float hitRealViolationRate;

    @NameInMap("IsDelete")
    private Integer isDelete;

    @NameInMap("IsSelect")
    private Boolean isSelect;

    @NameInMap("JobName")
    private String jobName;

    @NameInMap("LastUpdateEmpName")
    private String lastUpdateEmpName;

    @NameInMap("LastUpdateEmpid")
    private String lastUpdateEmpid;

    @NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("OperationMode")
    private Integer operationMode;

    @NameInMap("PreReviewNumber")
    private Long preReviewNumber;

    @NameInMap("ProblemNumber")
    private Long problemNumber;

    @NameInMap("QualityCheckType")
    private Integer qualityCheckType;

    @NameInMap("RealViolationNumber")
    private Integer realViolationNumber;

    @NameInMap("ReviewAccuracyRate")
    private Float reviewAccuracyRate;

    @NameInMap("ReviewNumber")
    private Long reviewNumber;

    @NameInMap("ReviewRate")
    private Float reviewRate;

    @NameInMap("ReviewStatusName")
    private String reviewStatusName;

    @NameInMap("Rid")
    private Long rid;

    @NameInMap("RuleScoreSingleType")
    private Integer ruleScoreSingleType;

    @NameInMap("RuleScoreType")
    private Integer ruleScoreType;

    @NameInMap("RuleType")
    private Integer ruleType;

    @NameInMap("ScoreSubId")
    private Long scoreSubId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("TargetType")
    private Integer targetType;

    @NameInMap("Type")
    private Integer type;

    @NameInMap("TypeName")
    private String typeName;

    @NameInMap("UnReviewNumber")
    private Long unReviewNumber;

    @NameInMap("UserGroup")
    private String userGroup;

    private RuleCountInfo(Builder builder) {
        this.autoReview = builder.autoReview;
        this.businessCategoryBasicInfoList = builder.businessCategoryBasicInfoList;
        this.businessCategoryNameList = builder.businessCategoryNameList;
        this.businessRange = builder.businessRange;
        this.checkNumber = builder.checkNumber;
        this.comments = builder.comments;
        this.createEmpName = builder.createEmpName;
        this.createEmpid = builder.createEmpid;
        this.createTime = builder.createTime;
        this.deny = builder.deny;
        this.effective = builder.effective;
        this.effectiveEndTime = builder.effectiveEndTime;
        this.effectiveStartTime = builder.effectiveStartTime;
        this.endTime = builder.endTime;
        this.fullCycle = builder.fullCycle;
        this.graphFlow = builder.graphFlow;
        this.hitNumber = builder.hitNumber;
        this.hitRate = builder.hitRate;
        this.hitRealViolationRate = builder.hitRealViolationRate;
        this.isDelete = builder.isDelete;
        this.isSelect = builder.isSelect;
        this.jobName = builder.jobName;
        this.lastUpdateEmpName = builder.lastUpdateEmpName;
        this.lastUpdateEmpid = builder.lastUpdateEmpid;
        this.lastUpdateTime = builder.lastUpdateTime;
        this.name = builder.name;
        this.operationMode = builder.operationMode;
        this.preReviewNumber = builder.preReviewNumber;
        this.problemNumber = builder.problemNumber;
        this.qualityCheckType = builder.qualityCheckType;
        this.realViolationNumber = builder.realViolationNumber;
        this.reviewAccuracyRate = builder.reviewAccuracyRate;
        this.reviewNumber = builder.reviewNumber;
        this.reviewRate = builder.reviewRate;
        this.reviewStatusName = builder.reviewStatusName;
        this.rid = builder.rid;
        this.ruleScoreSingleType = builder.ruleScoreSingleType;
        this.ruleScoreType = builder.ruleScoreType;
        this.ruleType = builder.ruleType;
        this.scoreSubId = builder.scoreSubId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.targetType = builder.targetType;
        this.type = builder.type;
        this.typeName = builder.typeName;
        this.unReviewNumber = builder.unReviewNumber;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RuleCountInfo create() {
        return builder().build();
    }

    /**
     * @return autoReview
     */
    public Integer getAutoReview() {
        return this.autoReview;
    }

    /**
     * @return businessCategoryBasicInfoList
     */
    public java.util.List < BusinessCategoryBasicInfo > getBusinessCategoryBasicInfoList() {
        return this.businessCategoryBasicInfoList;
    }

    /**
     * @return businessCategoryNameList
     */
    public java.util.List < String > getBusinessCategoryNameList() {
        return this.businessCategoryNameList;
    }

    /**
     * @return businessRange
     */
    public java.util.List < Integer > getBusinessRange() {
        return this.businessRange;
    }

    /**
     * @return checkNumber
     */
    public Long getCheckNumber() {
        return this.checkNumber;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
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
     * @return hitNumber
     */
    public Long getHitNumber() {
        return this.hitNumber;
    }

    /**
     * @return hitRate
     */
    public Float getHitRate() {
        return this.hitRate;
    }

    /**
     * @return hitRealViolationRate
     */
    public Float getHitRealViolationRate() {
        return this.hitRealViolationRate;
    }

    /**
     * @return isDelete
     */
    public Integer getIsDelete() {
        return this.isDelete;
    }

    /**
     * @return isSelect
     */
    public Boolean getIsSelect() {
        return this.isSelect;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
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
     * @return preReviewNumber
     */
    public Long getPreReviewNumber() {
        return this.preReviewNumber;
    }

    /**
     * @return problemNumber
     */
    public Long getProblemNumber() {
        return this.problemNumber;
    }

    /**
     * @return qualityCheckType
     */
    public Integer getQualityCheckType() {
        return this.qualityCheckType;
    }

    /**
     * @return realViolationNumber
     */
    public Integer getRealViolationNumber() {
        return this.realViolationNumber;
    }

    /**
     * @return reviewAccuracyRate
     */
    public Float getReviewAccuracyRate() {
        return this.reviewAccuracyRate;
    }

    /**
     * @return reviewNumber
     */
    public Long getReviewNumber() {
        return this.reviewNumber;
    }

    /**
     * @return reviewRate
     */
    public Float getReviewRate() {
        return this.reviewRate;
    }

    /**
     * @return reviewStatusName
     */
    public String getReviewStatusName() {
        return this.reviewStatusName;
    }

    /**
     * @return rid
     */
    public Long getRid() {
        return this.rid;
    }

    /**
     * @return ruleScoreSingleType
     */
    public Integer getRuleScoreSingleType() {
        return this.ruleScoreSingleType;
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
     * @return scoreSubId
     */
    public Long getScoreSubId() {
        return this.scoreSubId;
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
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @return unReviewNumber
     */
    public Long getUnReviewNumber() {
        return this.unReviewNumber;
    }

    /**
     * @return userGroup
     */
    public String getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder {
        private Integer autoReview; 
        private java.util.List < BusinessCategoryBasicInfo > businessCategoryBasicInfoList; 
        private java.util.List < String > businessCategoryNameList; 
        private java.util.List < Integer > businessRange; 
        private Long checkNumber; 
        private String comments; 
        private String createEmpName; 
        private String createEmpid; 
        private String createTime; 
        private Integer deny; 
        private Integer effective; 
        private String effectiveEndTime; 
        private String effectiveStartTime; 
        private String endTime; 
        private Integer fullCycle; 
        private Object graphFlow; 
        private Long hitNumber; 
        private Float hitRate; 
        private Float hitRealViolationRate; 
        private Integer isDelete; 
        private Boolean isSelect; 
        private String jobName; 
        private String lastUpdateEmpName; 
        private String lastUpdateEmpid; 
        private String lastUpdateTime; 
        private String name; 
        private Integer operationMode; 
        private Long preReviewNumber; 
        private Long problemNumber; 
        private Integer qualityCheckType; 
        private Integer realViolationNumber; 
        private Float reviewAccuracyRate; 
        private Long reviewNumber; 
        private Float reviewRate; 
        private String reviewStatusName; 
        private Long rid; 
        private Integer ruleScoreSingleType; 
        private Integer ruleScoreType; 
        private Integer ruleType; 
        private Long scoreSubId; 
        private String startTime; 
        private Integer status; 
        private Integer targetType; 
        private Integer type; 
        private String typeName; 
        private Long unReviewNumber; 
        private String userGroup; 

        /**
         * 审核选项 1 不自动审核 3 自动审核
         */
        public Builder autoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }

        /**
         * 业务类别基本信息列表
         */
        public Builder businessCategoryBasicInfoList(java.util.List < BusinessCategoryBasicInfo > businessCategoryBasicInfoList) {
            this.businessCategoryBasicInfoList = businessCategoryBasicInfoList;
            return this;
        }

        /**
         * 业务类别名称列表
         */
        public Builder businessCategoryNameList(java.util.List < String > businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }

        /**
         * 业务范围
         */
        public Builder businessRange(java.util.List < Integer > businessRange) {
            this.businessRange = businessRange;
            return this;
        }

        /**
         * 检测会话数
         */
        public Builder checkNumber(Long checkNumber) {
            this.checkNumber = checkNumber;
            return this;
        }

        /**
         * 评论
         */
        public Builder comments(String comments) {
            this.comments = comments;
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
         * 是否为全生命周期生效，0否，1是
         */
        public Builder fullCycle(Integer fullCycle) {
            this.fullCycle = fullCycle;
            return this;
        }

        /**
         * 流程画布
         */
        public Builder graphFlow(Object graphFlow) {
            this.graphFlow = graphFlow;
            return this;
        }

        /**
         * 命中会话量
         */
        public Builder hitNumber(Long hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }

        /**
         * 命中率
         */
        public Builder hitRate(Float hitRate) {
            this.hitRate = hitRate;
            return this;
        }

        /**
         * 命中违规率
         */
        public Builder hitRealViolationRate(Float hitRealViolationRate) {
            this.hitRealViolationRate = hitRealViolationRate;
            return this;
        }

        /**
         * 是否删除
         */
        public Builder isDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }

        /**
         * 是否选择
         */
        public Builder isSelect(Boolean isSelect) {
            this.isSelect = isSelect;
            return this;
        }

        /**
         * 定时任务名称
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
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
         * 待复核数
         */
        public Builder preReviewNumber(Long preReviewNumber) {
            this.preReviewNumber = preReviewNumber;
            return this;
        }

        /**
         * 发现问题数
         */
        public Builder problemNumber(Long problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }

        /**
         * 质检类型：0 离线质检，1 实时质检
         */
        public Builder qualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }

        /**
         * 复核后真实违规的数量
         */
        public Builder realViolationNumber(Integer realViolationNumber) {
            this.realViolationNumber = realViolationNumber;
            return this;
        }

        /**
         * 复核准确率
         */
        public Builder reviewAccuracyRate(Float reviewAccuracyRate) {
            this.reviewAccuracyRate = reviewAccuracyRate;
            return this;
        }

        /**
         * 已复核数
         */
        public Builder reviewNumber(Long reviewNumber) {
            this.reviewNumber = reviewNumber;
            return this;
        }

        /**
         * 复核率
         */
        public Builder reviewRate(Float reviewRate) {
            this.reviewRate = reviewRate;
            return this;
        }

        /**
         * 审核状态名字
         */
        public Builder reviewStatusName(String reviewStatusName) {
            this.reviewStatusName = reviewStatusName;
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
         * -- 8-未设置评分
         */
        public Builder ruleScoreSingleType(Integer ruleScoreSingleType) {
            this.ruleScoreSingleType = ruleScoreSingleType;
            return this;
        }

        /**
         * 是否计分 1不计分 3计分
         */
        public Builder ruleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }

        /**
         * 内置规则Or用户创建规则
         */
        public Builder ruleType(Integer ruleType) {
            this.ruleType = ruleType;
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
         * 开始时间
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * 状态：待生效 / 生效中 / 已失效:  0 / 1 / 2
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 规则种类：10-普通规则，11-流程规则
         */
        public Builder targetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * 规则类型
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 类型名称
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            return this;
        }

        /**
         * 未复核数量
         */
        public Builder unReviewNumber(Long unReviewNumber) {
            this.unReviewNumber = unReviewNumber;
            return this;
        }

        /**
         * 用户组
         */
        public Builder userGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public RuleCountInfo build() {
            return new RuleCountInfo(this);
        } 

    } 

}
