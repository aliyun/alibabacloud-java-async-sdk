// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RuleCountInfo} extends {@link TeaModel}
 *
 * <p>RuleCountInfo</p>
 */
public class RuleCountInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoReview")
    private Integer autoReview;

    @com.aliyun.core.annotation.NameInMap("BusinessCategoryBasicInfoList")
    private java.util.List < BusinessCategoryBasicInfo > businessCategoryBasicInfoList;

    @com.aliyun.core.annotation.NameInMap("BusinessCategoryNameList")
    private java.util.List < String > businessCategoryNameList;

    @com.aliyun.core.annotation.NameInMap("BusinessRange")
    private java.util.List < Integer > businessRange;

    @com.aliyun.core.annotation.NameInMap("CheckNumber")
    private Long checkNumber;

    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.NameInMap("CreateEmpName")
    private String createEmpName;

    @com.aliyun.core.annotation.NameInMap("CreateEmpid")
    private String createEmpid;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Deny")
    private Integer deny;

    @com.aliyun.core.annotation.NameInMap("Effective")
    private Integer effective;

    @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
    private String effectiveEndTime;

    @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
    private String effectiveStartTime;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FullCycle")
    private Integer fullCycle;

    @com.aliyun.core.annotation.NameInMap("GraphFlow")
    private Object graphFlow;

    @com.aliyun.core.annotation.NameInMap("HitNumber")
    private Long hitNumber;

    @com.aliyun.core.annotation.NameInMap("HitRate")
    private Float hitRate;

    @com.aliyun.core.annotation.NameInMap("HitRealViolationRate")
    private Float hitRealViolationRate;

    @com.aliyun.core.annotation.NameInMap("IsDelete")
    private Integer isDelete;

    @com.aliyun.core.annotation.NameInMap("IsSelect")
    private Boolean isSelect;

    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("LastUpdateEmpName")
    private String lastUpdateEmpName;

    @com.aliyun.core.annotation.NameInMap("LastUpdateEmpid")
    private String lastUpdateEmpid;

    @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OperationMode")
    private Integer operationMode;

    @com.aliyun.core.annotation.NameInMap("PreReviewNumber")
    private Long preReviewNumber;

    @com.aliyun.core.annotation.NameInMap("ProblemNumber")
    private Long problemNumber;

    @com.aliyun.core.annotation.NameInMap("QualityCheckType")
    private Integer qualityCheckType;

    @com.aliyun.core.annotation.NameInMap("RealViolationNumber")
    private Integer realViolationNumber;

    @com.aliyun.core.annotation.NameInMap("ReviewAccuracyRate")
    private Float reviewAccuracyRate;

    @com.aliyun.core.annotation.NameInMap("ReviewNumber")
    private Long reviewNumber;

    @com.aliyun.core.annotation.NameInMap("ReviewRate")
    private Float reviewRate;

    @com.aliyun.core.annotation.NameInMap("ReviewStatusName")
    private String reviewStatusName;

    @com.aliyun.core.annotation.NameInMap("Rid")
    private Long rid;

    @com.aliyun.core.annotation.NameInMap("RuleScoreSingleType")
    private Integer ruleScoreSingleType;

    @com.aliyun.core.annotation.NameInMap("RuleScoreType")
    private Integer ruleScoreType;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.NameInMap("ScoreSubId")
    private Long scoreSubId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("TargetType")
    private Integer targetType;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    @com.aliyun.core.annotation.NameInMap("UnReviewNumber")
    private Long unReviewNumber;

    @com.aliyun.core.annotation.NameInMap("UserGroup")
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
         * AutoReview.
         */
        public Builder autoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }

        /**
         * BusinessCategoryBasicInfoList.
         */
        public Builder businessCategoryBasicInfoList(java.util.List < BusinessCategoryBasicInfo > businessCategoryBasicInfoList) {
            this.businessCategoryBasicInfoList = businessCategoryBasicInfoList;
            return this;
        }

        /**
         * BusinessCategoryNameList.
         */
        public Builder businessCategoryNameList(java.util.List < String > businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }

        /**
         * BusinessRange.
         */
        public Builder businessRange(java.util.List < Integer > businessRange) {
            this.businessRange = businessRange;
            return this;
        }

        /**
         * CheckNumber.
         */
        public Builder checkNumber(Long checkNumber) {
            this.checkNumber = checkNumber;
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
         * HitNumber.
         */
        public Builder hitNumber(Long hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }

        /**
         * HitRate.
         */
        public Builder hitRate(Float hitRate) {
            this.hitRate = hitRate;
            return this;
        }

        /**
         * HitRealViolationRate.
         */
        public Builder hitRealViolationRate(Float hitRealViolationRate) {
            this.hitRealViolationRate = hitRealViolationRate;
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
         * IsSelect.
         */
        public Builder isSelect(Boolean isSelect) {
            this.isSelect = isSelect;
            return this;
        }

        /**
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
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
         * PreReviewNumber.
         */
        public Builder preReviewNumber(Long preReviewNumber) {
            this.preReviewNumber = preReviewNumber;
            return this;
        }

        /**
         * ProblemNumber.
         */
        public Builder problemNumber(Long problemNumber) {
            this.problemNumber = problemNumber;
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
         * RealViolationNumber.
         */
        public Builder realViolationNumber(Integer realViolationNumber) {
            this.realViolationNumber = realViolationNumber;
            return this;
        }

        /**
         * ReviewAccuracyRate.
         */
        public Builder reviewAccuracyRate(Float reviewAccuracyRate) {
            this.reviewAccuracyRate = reviewAccuracyRate;
            return this;
        }

        /**
         * ReviewNumber.
         */
        public Builder reviewNumber(Long reviewNumber) {
            this.reviewNumber = reviewNumber;
            return this;
        }

        /**
         * ReviewRate.
         */
        public Builder reviewRate(Float reviewRate) {
            this.reviewRate = reviewRate;
            return this;
        }

        /**
         * ReviewStatusName.
         */
        public Builder reviewStatusName(String reviewStatusName) {
            this.reviewStatusName = reviewStatusName;
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
         * RuleScoreSingleType.
         */
        public Builder ruleScoreSingleType(Integer ruleScoreSingleType) {
            this.ruleScoreSingleType = ruleScoreSingleType;
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
         * ScoreSubId.
         */
        public Builder scoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
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
         * Type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * TypeName.
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            return this;
        }

        /**
         * UnReviewNumber.
         */
        public Builder unReviewNumber(Long unReviewNumber) {
            this.unReviewNumber = unReviewNumber;
            return this;
        }

        /**
         * UserGroup.
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
