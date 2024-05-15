// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MarkResult} extends {@link TeaModel}
 *
 * <p>MarkResult</p>
 */
public class MarkResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsNeedVoteJudge")
    private Boolean isNeedVoteJudge;

    @com.aliyun.core.annotation.NameInMap("MarkResult")
    private String markResult;

    @com.aliyun.core.annotation.NameInMap("MarkResultId")
    private String markResultId;

    @com.aliyun.core.annotation.NameInMap("MarkTime")
    private String markTime;

    @com.aliyun.core.annotation.NameInMap("MarkTitle")
    private String markTitle;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private String progress;

    @com.aliyun.core.annotation.NameInMap("QuestionId")
    private String questionId;

    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.NameInMap("UserMarkResultId")
    private String userMarkResultId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private MarkResult(Builder builder) {
        this.isNeedVoteJudge = builder.isNeedVoteJudge;
        this.markResult = builder.markResult;
        this.markResultId = builder.markResultId;
        this.markTime = builder.markTime;
        this.markTitle = builder.markTitle;
        this.progress = builder.progress;
        this.questionId = builder.questionId;
        this.resultType = builder.resultType;
        this.userMarkResultId = builder.userMarkResultId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkResult create() {
        return builder().build();
    }

    /**
     * @return isNeedVoteJudge
     */
    public Boolean getIsNeedVoteJudge() {
        return this.isNeedVoteJudge;
    }

    /**
     * @return markResult
     */
    public String getMarkResult() {
        return this.markResult;
    }

    /**
     * @return markResultId
     */
    public String getMarkResultId() {
        return this.markResultId;
    }

    /**
     * @return markTime
     */
    public String getMarkTime() {
        return this.markTime;
    }

    /**
     * @return markTitle
     */
    public String getMarkTitle() {
        return this.markTitle;
    }

    /**
     * @return progress
     */
    public String getProgress() {
        return this.progress;
    }

    /**
     * @return questionId
     */
    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return userMarkResultId
     */
    public String getUserMarkResultId() {
        return this.userMarkResultId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Boolean isNeedVoteJudge; 
        private String markResult; 
        private String markResultId; 
        private String markTime; 
        private String markTitle; 
        private String progress; 
        private String questionId; 
        private String resultType; 
        private String userMarkResultId; 
        private String version; 

        /**
         * IsNeedVoteJudge.
         */
        public Builder isNeedVoteJudge(Boolean isNeedVoteJudge) {
            this.isNeedVoteJudge = isNeedVoteJudge;
            return this;
        }

        /**
         * MarkResult.
         */
        public Builder markResult(String markResult) {
            this.markResult = markResult;
            return this;
        }

        /**
         * MarkResultId.
         */
        public Builder markResultId(String markResultId) {
            this.markResultId = markResultId;
            return this;
        }

        /**
         * MarkTime.
         */
        public Builder markTime(String markTime) {
            this.markTime = markTime;
            return this;
        }

        /**
         * MarkTitle.
         */
        public Builder markTitle(String markTitle) {
            this.markTitle = markTitle;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(String progress) {
            this.progress = progress;
            return this;
        }

        /**
         * QuestionId.
         */
        public Builder questionId(String questionId) {
            this.questionId = questionId;
            return this;
        }

        /**
         * ResultType.
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * UserMarkResultId.
         */
        public Builder userMarkResultId(String userMarkResultId) {
            this.userMarkResultId = userMarkResultId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public MarkResult build() {
            return new MarkResult(this);
        } 

    } 

}
