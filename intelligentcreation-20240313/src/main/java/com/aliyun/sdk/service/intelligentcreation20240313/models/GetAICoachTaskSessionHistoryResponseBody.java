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
 * {@link GetAICoachTaskSessionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICoachTaskSessionHistoryResponseBody</p>
 */
public class GetAICoachTaskSessionHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conversationList")
    private java.util.List<ConversationList> conversationList;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("pauseDuration")
    private Long pauseDuration;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scriptName")
    private String scriptName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private GetAICoachTaskSessionHistoryResponseBody(Builder builder) {
        this.conversationList = builder.conversationList;
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.pauseDuration = builder.pauseDuration;
        this.requestId = builder.requestId;
        this.scriptName = builder.scriptName;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.total = builder.total;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachTaskSessionHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return conversationList
     */
    public java.util.List<ConversationList> getConversationList() {
        return this.conversationList;
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
     * @return pauseDuration
     */
    public Long getPauseDuration() {
        return this.pauseDuration;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private java.util.List<ConversationList> conversationList; 
        private Long duration; 
        private String endTime; 
        private Long pauseDuration; 
        private String requestId; 
        private String scriptName; 
        private String startTime; 
        private String status; 
        private Integer total; 
        private String uid; 

        /**
         * conversationList.
         */
        public Builder conversationList(java.util.List<ConversationList> conversationList) {
            this.conversationList = conversationList;
            return this;
        }

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
         * pauseDuration.
         */
        public Builder pauseDuration(Long pauseDuration) {
            this.pauseDuration = pauseDuration;
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
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetAICoachTaskSessionHistoryResponseBody build() {
            return new GetAICoachTaskSessionHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAICoachTaskSessionHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachTaskSessionHistoryResponseBody</p>
     */
    public static class ConversationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audioUrl")
        private String audioUrl;

        @com.aliyun.core.annotation.NameInMap("evaluationFeedback")
        private String evaluationFeedback;

        @com.aliyun.core.annotation.NameInMap("evaluationResult")
        private String evaluationResult;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("recordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private ConversationList(Builder builder) {
            this.audioUrl = builder.audioUrl;
            this.evaluationFeedback = builder.evaluationFeedback;
            this.evaluationResult = builder.evaluationResult;
            this.message = builder.message;
            this.recordId = builder.recordId;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationList create() {
            return builder().build();
        }

        /**
         * @return audioUrl
         */
        public String getAudioUrl() {
            return this.audioUrl;
        }

        /**
         * @return evaluationFeedback
         */
        public String getEvaluationFeedback() {
            return this.evaluationFeedback;
        }

        /**
         * @return evaluationResult
         */
        public String getEvaluationResult() {
            return this.evaluationResult;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String audioUrl; 
            private String evaluationFeedback; 
            private String evaluationResult; 
            private String message; 
            private String recordId; 
            private String role; 

            /**
             * audioUrl.
             */
            public Builder audioUrl(String audioUrl) {
                this.audioUrl = audioUrl;
                return this;
            }

            /**
             * evaluationFeedback.
             */
            public Builder evaluationFeedback(String evaluationFeedback) {
                this.evaluationFeedback = evaluationFeedback;
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
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * recordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public ConversationList build() {
                return new ConversationList(this);
            } 

        } 

    }
}
