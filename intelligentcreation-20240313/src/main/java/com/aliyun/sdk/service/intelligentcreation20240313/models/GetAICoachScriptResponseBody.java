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
 * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICoachScriptResponseBody</p>
 */
public class GetAICoachScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appendQuestionFlag")
    private Boolean appendQuestionFlag;

    @com.aliyun.core.annotation.NameInMap("assessmentScope")
    private String assessmentScope;

    @com.aliyun.core.annotation.NameInMap("checkCheatConfig")
    private CheckCheatConfig checkCheatConfig;

    @com.aliyun.core.annotation.NameInMap("closingRemarks")
    private String closingRemarks;

    @com.aliyun.core.annotation.NameInMap("completeStrategy")
    private CompleteStrategy completeStrategy;

    @com.aliyun.core.annotation.NameInMap("coverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.NameInMap("dialogueInputTextLimit")
    private Integer dialogueInputTextLimit;

    @com.aliyun.core.annotation.NameInMap("dialogueTextFlag")
    private Boolean dialogueTextFlag;

    @com.aliyun.core.annotation.NameInMap("dialogueTipFlag")
    private Boolean dialogueTipFlag;

    @com.aliyun.core.annotation.NameInMap("dialogueVoiceLimit")
    private Integer dialogueVoiceLimit;

    @com.aliyun.core.annotation.NameInMap("evaluateReportFlag")
    private Boolean evaluateReportFlag;

    @com.aliyun.core.annotation.NameInMap("expressiveness")
    private java.util.Map<String, Integer> expressiveness;

    @com.aliyun.core.annotation.NameInMap("expressivenessList")
    private java.util.List<ExpressivenessList> expressivenessList;

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

    @com.aliyun.core.annotation.NameInMap("interactionInputTypes")
    private java.util.List<String> interactionInputTypes;

    @com.aliyun.core.annotation.NameInMap("interactionType")
    private Integer interactionType;

    @com.aliyun.core.annotation.NameInMap("introduce")
    private String introduce;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("openingRemarks")
    private String openingRemarks;

    @com.aliyun.core.annotation.NameInMap("orderAckFlag")
    private Boolean orderAckFlag;

    @com.aliyun.core.annotation.NameInMap("pointDeductionRuleList")
    private java.util.List<PointDeductionRuleList> pointDeductionRuleList;

    @com.aliyun.core.annotation.NameInMap("points")
    private java.util.List<Points> points;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

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

    @com.aliyun.core.annotation.NameInMap("studentThinkTimeLimit")
    private Integer studentThinkTimeLimit;

    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("weights")
    private Weights weights;

    private GetAICoachScriptResponseBody(Builder builder) {
        this.appendQuestionFlag = builder.appendQuestionFlag;
        this.assessmentScope = builder.assessmentScope;
        this.checkCheatConfig = builder.checkCheatConfig;
        this.closingRemarks = builder.closingRemarks;
        this.completeStrategy = builder.completeStrategy;
        this.coverUrl = builder.coverUrl;
        this.dialogueInputTextLimit = builder.dialogueInputTextLimit;
        this.dialogueTextFlag = builder.dialogueTextFlag;
        this.dialogueTipFlag = builder.dialogueTipFlag;
        this.dialogueVoiceLimit = builder.dialogueVoiceLimit;
        this.evaluateReportFlag = builder.evaluateReportFlag;
        this.expressiveness = builder.expressiveness;
        this.expressivenessList = builder.expressivenessList;
        this.gifDynamicUrl = builder.gifDynamicUrl;
        this.gifStaticUrl = builder.gifStaticUrl;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.initiator = builder.initiator;
        this.interactionInputTypes = builder.interactionInputTypes;
        this.interactionType = builder.interactionType;
        this.introduce = builder.introduce;
        this.name = builder.name;
        this.openingRemarks = builder.openingRemarks;
        this.orderAckFlag = builder.orderAckFlag;
        this.pointDeductionRuleList = builder.pointDeductionRuleList;
        this.points = builder.points;
        this.requestId = builder.requestId;
        this.sampleDialogueList = builder.sampleDialogueList;
        this.scoreConfig = builder.scoreConfig;
        this.scriptRecordId = builder.scriptRecordId;
        this.sparringTipContent = builder.sparringTipContent;
        this.sparringTipTitle = builder.sparringTipTitle;
        this.status = builder.status;
        this.studentThinkTimeFlag = builder.studentThinkTimeFlag;
        this.studentThinkTimeLimit = builder.studentThinkTimeLimit;
        this.type = builder.type;
        this.weights = builder.weights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachScriptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appendQuestionFlag
     */
    public Boolean getAppendQuestionFlag() {
        return this.appendQuestionFlag;
    }

    /**
     * @return assessmentScope
     */
    public String getAssessmentScope() {
        return this.assessmentScope;
    }

    /**
     * @return checkCheatConfig
     */
    public CheckCheatConfig getCheckCheatConfig() {
        return this.checkCheatConfig;
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
     * @return dialogueInputTextLimit
     */
    public Integer getDialogueInputTextLimit() {
        return this.dialogueInputTextLimit;
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
     * @return dialogueVoiceLimit
     */
    public Integer getDialogueVoiceLimit() {
        return this.dialogueVoiceLimit;
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
    public java.util.Map<String, Integer> getExpressiveness() {
        return this.expressiveness;
    }

    /**
     * @return expressivenessList
     */
    public java.util.List<ExpressivenessList> getExpressivenessList() {
        return this.expressivenessList;
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
     * @return interactionInputTypes
     */
    public java.util.List<String> getInteractionInputTypes() {
        return this.interactionInputTypes;
    }

    /**
     * @return interactionType
     */
    public Integer getInteractionType() {
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
     * @return pointDeductionRuleList
     */
    public java.util.List<PointDeductionRuleList> getPointDeductionRuleList() {
        return this.pointDeductionRuleList;
    }

    /**
     * @return points
     */
    public java.util.List<Points> getPoints() {
        return this.points;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return studentThinkTimeLimit
     */
    public Integer getStudentThinkTimeLimit() {
        return this.studentThinkTimeLimit;
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
        private Boolean appendQuestionFlag; 
        private String assessmentScope; 
        private CheckCheatConfig checkCheatConfig; 
        private String closingRemarks; 
        private CompleteStrategy completeStrategy; 
        private String coverUrl; 
        private Integer dialogueInputTextLimit; 
        private Boolean dialogueTextFlag; 
        private Boolean dialogueTipFlag; 
        private Integer dialogueVoiceLimit; 
        private Boolean evaluateReportFlag; 
        private java.util.Map<String, Integer> expressiveness; 
        private java.util.List<ExpressivenessList> expressivenessList; 
        private String gifDynamicUrl; 
        private String gifStaticUrl; 
        private String gmtCreate; 
        private String gmtModified; 
        private String initiator; 
        private java.util.List<String> interactionInputTypes; 
        private Integer interactionType; 
        private String introduce; 
        private String name; 
        private String openingRemarks; 
        private Boolean orderAckFlag; 
        private java.util.List<PointDeductionRuleList> pointDeductionRuleList; 
        private java.util.List<Points> points; 
        private String requestId; 
        private java.util.List<SampleDialogueList> sampleDialogueList; 
        private ScoreConfig scoreConfig; 
        private String scriptRecordId; 
        private String sparringTipContent; 
        private String sparringTipTitle; 
        private Integer status; 
        private Boolean studentThinkTimeFlag; 
        private Integer studentThinkTimeLimit; 
        private Integer type; 
        private Weights weights; 

        private Builder() {
        } 

        private Builder(GetAICoachScriptResponseBody model) {
            this.appendQuestionFlag = model.appendQuestionFlag;
            this.assessmentScope = model.assessmentScope;
            this.checkCheatConfig = model.checkCheatConfig;
            this.closingRemarks = model.closingRemarks;
            this.completeStrategy = model.completeStrategy;
            this.coverUrl = model.coverUrl;
            this.dialogueInputTextLimit = model.dialogueInputTextLimit;
            this.dialogueTextFlag = model.dialogueTextFlag;
            this.dialogueTipFlag = model.dialogueTipFlag;
            this.dialogueVoiceLimit = model.dialogueVoiceLimit;
            this.evaluateReportFlag = model.evaluateReportFlag;
            this.expressiveness = model.expressiveness;
            this.expressivenessList = model.expressivenessList;
            this.gifDynamicUrl = model.gifDynamicUrl;
            this.gifStaticUrl = model.gifStaticUrl;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.initiator = model.initiator;
            this.interactionInputTypes = model.interactionInputTypes;
            this.interactionType = model.interactionType;
            this.introduce = model.introduce;
            this.name = model.name;
            this.openingRemarks = model.openingRemarks;
            this.orderAckFlag = model.orderAckFlag;
            this.pointDeductionRuleList = model.pointDeductionRuleList;
            this.points = model.points;
            this.requestId = model.requestId;
            this.sampleDialogueList = model.sampleDialogueList;
            this.scoreConfig = model.scoreConfig;
            this.scriptRecordId = model.scriptRecordId;
            this.sparringTipContent = model.sparringTipContent;
            this.sparringTipTitle = model.sparringTipTitle;
            this.status = model.status;
            this.studentThinkTimeFlag = model.studentThinkTimeFlag;
            this.studentThinkTimeLimit = model.studentThinkTimeLimit;
            this.type = model.type;
            this.weights = model.weights;
        } 

        /**
         * appendQuestionFlag.
         */
        public Builder appendQuestionFlag(Boolean appendQuestionFlag) {
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
         * checkCheatConfig.
         */
        public Builder checkCheatConfig(CheckCheatConfig checkCheatConfig) {
            this.checkCheatConfig = checkCheatConfig;
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
         * dialogueInputTextLimit.
         */
        public Builder dialogueInputTextLimit(Integer dialogueInputTextLimit) {
            this.dialogueInputTextLimit = dialogueInputTextLimit;
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
         * dialogueVoiceLimit.
         */
        public Builder dialogueVoiceLimit(Integer dialogueVoiceLimit) {
            this.dialogueVoiceLimit = dialogueVoiceLimit;
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
        public Builder expressiveness(java.util.Map<String, Integer> expressiveness) {
            this.expressiveness = expressiveness;
            return this;
        }

        /**
         * expressivenessList.
         */
        public Builder expressivenessList(java.util.List<ExpressivenessList> expressivenessList) {
            this.expressivenessList = expressivenessList;
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
         * interactionInputTypes.
         */
        public Builder interactionInputTypes(java.util.List<String> interactionInputTypes) {
            this.interactionInputTypes = interactionInputTypes;
            return this;
        }

        /**
         * interactionType.
         */
        public Builder interactionType(Integer interactionType) {
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
         * pointDeductionRuleList.
         */
        public Builder pointDeductionRuleList(java.util.List<PointDeductionRuleList> pointDeductionRuleList) {
            this.pointDeductionRuleList = pointDeductionRuleList;
            return this;
        }

        /**
         * points.
         */
        public Builder points(java.util.List<Points> points) {
            this.points = points;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * studentThinkTimeLimit.
         */
        public Builder studentThinkTimeLimit(Integer studentThinkTimeLimit) {
            this.studentThinkTimeLimit = studentThinkTimeLimit;
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

        public GetAICoachScriptResponseBody build() {
            return new GetAICoachScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class CheckCheatConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkImage")
        private Boolean checkImage;

        @com.aliyun.core.annotation.NameInMap("checkVoice")
        private Boolean checkVoice;

        private CheckCheatConfig(Builder builder) {
            this.checkImage = builder.checkImage;
            this.checkVoice = builder.checkVoice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCheatConfig create() {
            return builder().build();
        }

        /**
         * @return checkImage
         */
        public Boolean getCheckImage() {
            return this.checkImage;
        }

        /**
         * @return checkVoice
         */
        public Boolean getCheckVoice() {
            return this.checkVoice;
        }

        public static final class Builder {
            private Boolean checkImage; 
            private Boolean checkVoice; 

            private Builder() {
            } 

            private Builder(CheckCheatConfig model) {
                this.checkImage = model.checkImage;
                this.checkVoice = model.checkVoice;
            } 

            /**
             * checkImage.
             */
            public Builder checkImage(Boolean checkImage) {
                this.checkImage = checkImage;
                return this;
            }

            /**
             * checkVoice.
             */
            public Builder checkVoice(Boolean checkVoice) {
                this.checkVoice = checkVoice;
                return this;
            }

            public CheckCheatConfig build() {
                return new CheckCheatConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class CompleteStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("abnormalQuitSessionExpired")
        private Integer abnormalQuitSessionExpired;

        @com.aliyun.core.annotation.NameInMap("abnormalQuitSessionExpiredFlag")
        private Boolean abnormalQuitSessionExpiredFlag;

        @com.aliyun.core.annotation.NameInMap("clickCompleteAutoEnd")
        private Boolean clickCompleteAutoEnd;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("durationFlag")
        private Boolean durationFlag;

        @com.aliyun.core.annotation.NameInMap("fullCoverageAutoEnd")
        private Boolean fullCoverageAutoEnd;

        private CompleteStrategy(Builder builder) {
            this.abnormalQuitSessionExpired = builder.abnormalQuitSessionExpired;
            this.abnormalQuitSessionExpiredFlag = builder.abnormalQuitSessionExpiredFlag;
            this.clickCompleteAutoEnd = builder.clickCompleteAutoEnd;
            this.duration = builder.duration;
            this.durationFlag = builder.durationFlag;
            this.fullCoverageAutoEnd = builder.fullCoverageAutoEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompleteStrategy create() {
            return builder().build();
        }

        /**
         * @return abnormalQuitSessionExpired
         */
        public Integer getAbnormalQuitSessionExpired() {
            return this.abnormalQuitSessionExpired;
        }

        /**
         * @return abnormalQuitSessionExpiredFlag
         */
        public Boolean getAbnormalQuitSessionExpiredFlag() {
            return this.abnormalQuitSessionExpiredFlag;
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
         * @return durationFlag
         */
        public Boolean getDurationFlag() {
            return this.durationFlag;
        }

        /**
         * @return fullCoverageAutoEnd
         */
        public Boolean getFullCoverageAutoEnd() {
            return this.fullCoverageAutoEnd;
        }

        public static final class Builder {
            private Integer abnormalQuitSessionExpired; 
            private Boolean abnormalQuitSessionExpiredFlag; 
            private Boolean clickCompleteAutoEnd; 
            private Integer duration; 
            private Boolean durationFlag; 
            private Boolean fullCoverageAutoEnd; 

            private Builder() {
            } 

            private Builder(CompleteStrategy model) {
                this.abnormalQuitSessionExpired = model.abnormalQuitSessionExpired;
                this.abnormalQuitSessionExpiredFlag = model.abnormalQuitSessionExpiredFlag;
                this.clickCompleteAutoEnd = model.clickCompleteAutoEnd;
                this.duration = model.duration;
                this.durationFlag = model.durationFlag;
                this.fullCoverageAutoEnd = model.fullCoverageAutoEnd;
            } 

            /**
             * abnormalQuitSessionExpired.
             */
            public Builder abnormalQuitSessionExpired(Integer abnormalQuitSessionExpired) {
                this.abnormalQuitSessionExpired = abnormalQuitSessionExpired;
                return this;
            }

            /**
             * abnormalQuitSessionExpiredFlag.
             */
            public Builder abnormalQuitSessionExpiredFlag(Boolean abnormalQuitSessionExpiredFlag) {
                this.abnormalQuitSessionExpiredFlag = abnormalQuitSessionExpiredFlag;
                return this;
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
             * durationFlag.
             */
            public Builder durationFlag(Boolean durationFlag) {
                this.durationFlag = durationFlag;
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class ExpressivenessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("expressivenessId")
        private String expressivenessId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private ExpressivenessList(Builder builder) {
            this.desc = builder.desc;
            this.enabled = builder.enabled;
            this.expressivenessId = builder.expressivenessId;
            this.name = builder.name;
            this.rule = builder.rule;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressivenessList create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String desc; 
            private Boolean enabled; 
            private String expressivenessId; 
            private String name; 
            private String rule; 
            private String type; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(ExpressivenessList model) {
                this.desc = model.desc;
                this.enabled = model.enabled;
                this.expressivenessId = model.expressivenessId;
                this.name = model.name;
                this.rule = model.rule;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
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
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ExpressivenessList build() {
                return new ExpressivenessList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class PointDeductionRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("punishmentTypes")
        private java.util.List<String> punishmentTypes;

        @com.aliyun.core.annotation.NameInMap("ruleValue")
        private String ruleValue;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private PointDeductionRuleList(Builder builder) {
            this.description = builder.description;
            this.punishmentTypes = builder.punishmentTypes;
            this.ruleValue = builder.ruleValue;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PointDeductionRuleList create() {
            return builder().build();
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
            private String description; 
            private java.util.List<String> punishmentTypes; 
            private String ruleValue; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(PointDeductionRuleList model) {
                this.description = model.description;
                this.punishmentTypes = model.punishmentTypes;
                this.ruleValue = model.ruleValue;
                this.weight = model.weight;
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

            public PointDeductionRuleList build() {
                return new PointDeductionRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class KeywordValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

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
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String name; 
            private Integer weight; 

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
            public Builder weight(Integer weight) {
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class AnswerValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerName")
        private String answerName;

        @com.aliyun.core.annotation.NameInMap("answerWeight")
        private Integer answerWeight;

        @com.aliyun.core.annotation.NameInMap("keywordValues")
        private java.util.List<KeywordValues> keywordValues;

        @com.aliyun.core.annotation.NameInMap("keywordWeight")
        private Integer keywordWeight;

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
        public Integer getAnswerWeight() {
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
        public Integer getKeywordWeight() {
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
            private Integer answerWeight; 
            private java.util.List<KeywordValues> keywordValues; 
            private Integer keywordWeight; 
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
            public Builder answerWeight(Integer answerWeight) {
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
            public Builder keywordWeight(Integer keywordWeight) {
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class AnswerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerValues")
        private java.util.List<AnswerValues> answerValues;

        @com.aliyun.core.annotation.NameInMap("enabledKeyword")
        private Boolean enabledKeyword;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("operators")
        private String operators;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private AnswerList(Builder builder) {
            this.answerValues = builder.answerValues;
            this.enabledKeyword = builder.enabledKeyword;
            this.name = builder.name;
            this.nameList = builder.nameList;
            this.operators = builder.operators;
            this.parameters = builder.parameters;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private java.util.List<AnswerValues> answerValues; 
            private Boolean enabledKeyword; 
            private String name; 
            private java.util.List<String> nameList; 
            private String operators; 
            private java.util.List<Parameters> parameters; 
            private String type; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(AnswerList model) {
                this.answerValues = model.answerValues;
                this.enabledKeyword = model.enabledKeyword;
                this.name = model.name;
                this.nameList = model.nameList;
                this.operators = model.operators;
                this.parameters = model.parameters;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerList")
        private java.util.List<AnswerList> answerList;

        @com.aliyun.core.annotation.NameInMap("knowledgeList")
        private java.util.List<String> knowledgeList;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pointId")
        private String pointId;

        @com.aliyun.core.annotation.NameInMap("questionDescription")
        private String questionDescription;

        @com.aliyun.core.annotation.NameInMap("sortNo")
        private Integer sortNo;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private Points(Builder builder) {
            this.answerList = builder.answerList;
            this.knowledgeList = builder.knowledgeList;
            this.name = builder.name;
            this.pointId = builder.pointId;
            this.questionDescription = builder.questionDescription;
            this.sortNo = builder.sortNo;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
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
         * @return pointId
         */
        public String getPointId() {
            return this.pointId;
        }

        /**
         * @return questionDescription
         */
        public String getQuestionDescription() {
            return this.questionDescription;
        }

        /**
         * @return sortNo
         */
        public Integer getSortNo() {
            return this.sortNo;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private java.util.List<AnswerList> answerList; 
            private java.util.List<String> knowledgeList; 
            private String name; 
            private String pointId; 
            private String questionDescription; 
            private Integer sortNo; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Points model) {
                this.answerList = model.answerList;
                this.knowledgeList = model.knowledgeList;
                this.name = model.name;
                this.pointId = model.pointId;
                this.questionDescription = model.questionDescription;
                this.sortNo = model.sortNo;
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
             * pointId.
             */
            public Builder pointId(String pointId) {
                this.pointId = pointId;
                return this;
            }

            /**
             * questionDescription.
             */
            public Builder questionDescription(String questionDescription) {
                this.questionDescription = questionDescription;
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
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class ScoreConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("levelEnabled")
        private Boolean levelEnabled;

        @com.aliyun.core.annotation.NameInMap("levels")
        private java.util.List<Levels> levels;

        @com.aliyun.core.annotation.NameInMap("passScore")
        private String passScore;

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
        public String getPassScore() {
            return this.passScore;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Boolean levelEnabled; 
            private java.util.List<Levels> levels; 
            private String passScore; 

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
            public Builder passScore(String passScore) {
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
     * {@link GetAICoachScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachScriptResponseBody</p>
     */
    public static class Weights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("abilityEvaluation")
        private Integer abilityEvaluation;

        @com.aliyun.core.annotation.NameInMap("abilityEvaluationEnabled")
        private Boolean abilityEvaluationEnabled;

        @com.aliyun.core.annotation.NameInMap("assessmentPoint")
        private Integer assessmentPoint;

        @com.aliyun.core.annotation.NameInMap("assessmentPointEnabled")
        private Boolean assessmentPointEnabled;

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
            this.abilityEvaluation = builder.abilityEvaluation;
            this.abilityEvaluationEnabled = builder.abilityEvaluationEnabled;
            this.assessmentPoint = builder.assessmentPoint;
            this.assessmentPointEnabled = builder.assessmentPointEnabled;
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
         * @return abilityEvaluation
         */
        public Integer getAbilityEvaluation() {
            return this.abilityEvaluation;
        }

        /**
         * @return abilityEvaluationEnabled
         */
        public Boolean getAbilityEvaluationEnabled() {
            return this.abilityEvaluationEnabled;
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
            private Integer abilityEvaluation; 
            private Boolean abilityEvaluationEnabled; 
            private Integer assessmentPoint; 
            private Boolean assessmentPointEnabled; 
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
                this.abilityEvaluation = model.abilityEvaluation;
                this.abilityEvaluationEnabled = model.abilityEvaluationEnabled;
                this.assessmentPoint = model.assessmentPoint;
                this.assessmentPointEnabled = model.assessmentPointEnabled;
                this.expressiveness = model.expressiveness;
                this.expressivenessEnabled = model.expressivenessEnabled;
                this.pointDeductionRule = model.pointDeductionRule;
                this.pointDeductionRuleEnabled = model.pointDeductionRuleEnabled;
                this.similarPronunciationScoringEnabled = model.similarPronunciationScoringEnabled;
                this.standard = model.standard;
                this.standardEnabled = model.standardEnabled;
            } 

            /**
             * abilityEvaluation.
             */
            public Builder abilityEvaluation(Integer abilityEvaluation) {
                this.abilityEvaluation = abilityEvaluation;
                return this;
            }

            /**
             * abilityEvaluationEnabled.
             */
            public Builder abilityEvaluationEnabled(Boolean abilityEvaluationEnabled) {
                this.abilityEvaluationEnabled = abilityEvaluationEnabled;
                return this;
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
}
