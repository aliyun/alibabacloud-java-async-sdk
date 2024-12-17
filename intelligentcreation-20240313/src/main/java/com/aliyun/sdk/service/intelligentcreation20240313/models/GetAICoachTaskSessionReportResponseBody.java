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
 * {@link GetAICoachTaskSessionReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICoachTaskSessionReportResponseBody</p>
 */
public class GetAICoachTaskSessionReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("evaluationResult")
    private String evaluationResult;

    @com.aliyun.core.annotation.NameInMap("feedback")
    private Boolean feedback;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scriptName")
    private String scriptName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private GetAICoachTaskSessionReportResponseBody(Builder builder) {
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.evaluationResult = builder.evaluationResult;
        this.feedback = builder.feedback;
        this.requestId = builder.requestId;
        this.scriptName = builder.scriptName;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachTaskSessionReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return evaluationResult
     */
    public String getEvaluationResult() {
        return this.evaluationResult;
    }

    /**
     * @return feedback
     */
    public Boolean getFeedback() {
        return this.feedback;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
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
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private Long duration; 
        private String endTime; 
        private String evaluationResult; 
        private Boolean feedback; 
        private String requestId; 
        private String scriptName; 
        private String startTime; 
        private String status; 
        private String uid; 

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * evaluationResult.
         */
        public Builder evaluationResult(String evaluationResult) {
            this.evaluationResult = evaluationResult;
            return this;
        }

        /**
         * feedback.
         */
        public Builder feedback(Boolean feedback) {
            this.feedback = feedback;
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
         * scriptName.
         */
        public Builder scriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetAICoachTaskSessionReportResponseBody build() {
            return new GetAICoachTaskSessionReportResponseBody(this);
        } 

    } 

}
