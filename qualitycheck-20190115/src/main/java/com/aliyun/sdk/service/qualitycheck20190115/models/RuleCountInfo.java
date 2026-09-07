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
 * {@link RuleCountInfo} extends {@link TeaModel}
 *
 * <p>RuleCountInfo</p>
 */
public class RuleCountInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoReview")
    private Integer autoReview;

    @com.aliyun.core.annotation.NameInMap("BusinessCategoryBasicInfoList")
    private java.util.List<BusinessCategoryBasicInfo> businessCategoryBasicInfoList;

    @com.aliyun.core.annotation.NameInMap("BusinessCategoryNameList")
    private java.util.List<String> businessCategoryNameList;

    @com.aliyun.core.annotation.NameInMap("BusinessRange")
    private java.util.List<Integer> businessRange;

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
     * @return businessCategoryBasicInfoList
     */
    public java.util.List<BusinessCategoryBasicInfo> getBusinessCategoryBasicInfoList() {
        return this.businessCategoryBasicInfoList;
    }

    /**
     * @return businessCategoryNameList
     */
    public java.util.List<String> getBusinessCategoryNameList() {
        return this.businessCategoryNameList;
    }

    /**
     * @return businessRange
     */
    public java.util.List<Integer> getBusinessRange() {
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
        private java.util.List<BusinessCategoryBasicInfo> businessCategoryBasicInfoList; 
        private java.util.List<String> businessCategoryNameList; 
        private java.util.List<Integer> businessRange; 
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

        private Builder() {
        } 

        private Builder(RuleCountInfo model) {
            this.autoReview = model.autoReview;
            this.businessCategoryBasicInfoList = model.businessCategoryBasicInfoList;
            this.businessCategoryNameList = model.businessCategoryNameList;
            this.businessRange = model.businessRange;
            this.checkNumber = model.checkNumber;
            this.comments = model.comments;
            this.createEmpName = model.createEmpName;
            this.createEmpid = model.createEmpid;
            this.createTime = model.createTime;
            this.deny = model.deny;
            this.effective = model.effective;
            this.effectiveEndTime = model.effectiveEndTime;
            this.effectiveStartTime = model.effectiveStartTime;
            this.endTime = model.endTime;
            this.fullCycle = model.fullCycle;
            this.graphFlow = model.graphFlow;
            this.hitNumber = model.hitNumber;
            this.hitRate = model.hitRate;
            this.hitRealViolationRate = model.hitRealViolationRate;
            this.isDelete = model.isDelete;
            this.isSelect = model.isSelect;
            this.jobName = model.jobName;
            this.lastUpdateEmpName = model.lastUpdateEmpName;
            this.lastUpdateEmpid = model.lastUpdateEmpid;
            this.lastUpdateTime = model.lastUpdateTime;
            this.name = model.name;
            this.operationMode = model.operationMode;
            this.preReviewNumber = model.preReviewNumber;
            this.problemNumber = model.problemNumber;
            this.qualityCheckType = model.qualityCheckType;
            this.realViolationNumber = model.realViolationNumber;
            this.reviewAccuracyRate = model.reviewAccuracyRate;
            this.reviewNumber = model.reviewNumber;
            this.reviewRate = model.reviewRate;
            this.reviewStatusName = model.reviewStatusName;
            this.rid = model.rid;
            this.ruleScoreSingleType = model.ruleScoreSingleType;
            this.ruleScoreType = model.ruleScoreType;
            this.ruleType = model.ruleType;
            this.scoreSubId = model.scoreSubId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.targetType = model.targetType;
            this.type = model.type;
            this.typeName = model.typeName;
            this.unReviewNumber = model.unReviewNumber;
            this.userGroup = model.userGroup;
        } 

        /**
         * <p>The review option.</p>
         * <ul>
         * <li><p>1: Manual review</p>
         * </li>
         * <li><p>3: Automatic review</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }

        /**
         * <p>A list of basic information about business categories.</p>
         */
        public Builder businessCategoryBasicInfoList(java.util.List<BusinessCategoryBasicInfo> businessCategoryBasicInfoList) {
            this.businessCategoryBasicInfoList = businessCategoryBasicInfoList;
            return this;
        }

        /**
         * <p>A list of business category names.</p>
         */
        public Builder businessCategoryNameList(java.util.List<String> businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }

        /**
         * <p>The business scope.</p>
         */
        public Builder businessRange(java.util.List<Integer> businessRange) {
            this.businessRange = businessRange;
            return this;
        }

        /**
         * <p>The number of checked sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder checkNumber(Long checkNumber) {
            this.checkNumber = checkNumber;
            return this;
        }

        /**
         * <p>The comments.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        public Builder comments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
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
         * <p>1615133575000</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>You can set this parameter to 1 to reject rule edits, or to 0 or null to allow rule edits.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deny(Integer deny) {
            this.deny = deny;
            return this;
        }

        /**
         * <p>Indicates if the rule is active. \<code>0\\</code>: No. \<code>1\\</code>: Yes.</p>
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
         * <p>1662685868850</p>
         */
        public Builder effectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * <p>The effective start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1662685868850</p>
         */
        public Builder effectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1650092585176</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Indicates if the rule is active for the entire lifecycle. \<code>0\\</code>: No. \<code>1\\</code>: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fullCycle(Integer fullCycle) {
            this.fullCycle = fullCycle;
            return this;
        }

        /**
         * <p>The flow canvas, in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>较复杂，忽略</p>
         */
        public Builder graphFlow(Object graphFlow) {
            this.graphFlow = graphFlow;
            return this;
        }

        /**
         * <p>The number of hit sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hitNumber(Long hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }

        /**
         * <p>The hit rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hitRate(Float hitRate) {
            this.hitRate = hitRate;
            return this;
        }

        /**
         * <p>The hit rate of actual violations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hitRealViolationRate(Float hitRealViolationRate) {
            this.hitRealViolationRate = hitRealViolationRate;
            return this;
        }

        /**
         * <p>Indicates if the rule is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }

        /**
         * <p>Indicates if the rule is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSelect(Boolean isSelect) {
            this.isSelect = isSelect;
            return this;
        }

        /**
         * <p>The scheduled task name.</p>
         * 
         * <strong>example:</strong>
         * <p>job-1-20221012-105943</p>
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The name of the user who last updated the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder lastUpdateEmpName(String lastUpdateEmpName) {
            this.lastUpdateEmpName = lastUpdateEmpName;
            return this;
        }

        /**
         * <p>The employee ID of the user who last updated the rule.</p>
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
         * <p>1648200901000</p>
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>0801转封装测试</p>
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
         * <p>The number of items pending review.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder preReviewNumber(Long preReviewNumber) {
            this.preReviewNumber = preReviewNumber;
            return this;
        }

        /**
         * <p>The number of problems found.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder problemNumber(Long problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }

        /**
         * <p>The quality check type.</p>
         * <ul>
         * <li><p>0: Offline</p>
         * </li>
         * <li><p>1: Real-time</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder qualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }

        /**
         * <p>The number of actual violations after review.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder realViolationNumber(Integer realViolationNumber) {
            this.realViolationNumber = realViolationNumber;
            return this;
        }

        /**
         * <p>The review accuracy rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewAccuracyRate(Float reviewAccuracyRate) {
            this.reviewAccuracyRate = reviewAccuracyRate;
            return this;
        }

        /**
         * <p>The number of reviewed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewNumber(Long reviewNumber) {
            this.reviewNumber = reviewNumber;
            return this;
        }

        /**
         * <p>The review rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewRate(Float reviewRate) {
            this.reviewRate = reviewRate;
            return this;
        }

        /**
         * <p>The review status name.</p>
         * 
         * <strong>example:</strong>
         * <p>通过</p>
         */
        public Builder reviewStatusName(String reviewStatusName) {
            this.reviewStatusName = reviewStatusName;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder rid(Long rid) {
            this.rid = rid;
            return this;
        }

        /**
         * <p>The scoring type. \<code>8\\</code>: No score is set.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleScoreSingleType(Integer ruleScoreSingleType) {
            this.ruleScoreSingleType = ruleScoreSingleType;
            return this;
        }

        /**
         * <p>Specifies if a score is calculated.</p>
         * <ul>
         * <li><p>1: No</p>
         * </li>
         * <li><p>3: Yes</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }

        /**
         * <p>The rule origin. For example, a built-in rule or a user-created rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.ruleType = ruleType;
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
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1662685868850</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the rule.</p>
         * <ul>
         * <li><p>0: Pending</p>
         * </li>
         * <li><p>1: Active</p>
         * </li>
         * <li><p>2: Expired</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The rule category.</p>
         * <ul>
         * <li><p>10: Standard</p>
         * </li>
         * <li><p>11: Flow-based</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder targetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The type name.</p>
         * 
         * <strong>example:</strong>
         * <p>全部类别</p>
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            return this;
        }

        /**
         * <p>The number of unreviewed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unReviewNumber(Long unReviewNumber) {
            this.unReviewNumber = unReviewNumber;
            return this;
        }

        /**
         * <p>The user group.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
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
