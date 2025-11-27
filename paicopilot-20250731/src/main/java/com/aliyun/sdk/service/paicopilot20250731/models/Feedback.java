// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link Feedback} extends {@link TeaModel}
 *
 * <p>Feedback</p>
 */
public class Feedback extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.NameInMap("FeedbackAction")
    private String feedbackAction;

    @com.aliyun.core.annotation.NameInMap("FeedbackId")
    private String feedbackId;

    @com.aliyun.core.annotation.NameInMap("FeedbackMessage")
    private String feedbackMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private Feedback(Builder builder) {
        this.chatId = builder.chatId;
        this.feedbackAction = builder.feedbackAction;
        this.feedbackId = builder.feedbackId;
        this.feedbackMessage = builder.feedbackMessage;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModified = builder.gmtModified;
        this.ownerId = builder.ownerId;
        this.sessionId = builder.sessionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Feedback create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return feedbackAction
     */
    public String getFeedbackAction() {
        return this.feedbackAction;
    }

    /**
     * @return feedbackId
     */
    public String getFeedbackId() {
        return this.feedbackId;
    }

    /**
     * @return feedbackMessage
     */
    public String getFeedbackMessage() {
        return this.feedbackMessage;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String chatId; 
        private String feedbackAction; 
        private String feedbackId; 
        private String feedbackMessage; 
        private String gmtCreateTime; 
        private String gmtModified; 
        private String ownerId; 
        private String sessionId; 
        private String userId; 

        private Builder() {
        } 

        private Builder(Feedback model) {
            this.chatId = model.chatId;
            this.feedbackAction = model.feedbackAction;
            this.feedbackId = model.feedbackId;
            this.feedbackMessage = model.feedbackMessage;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModified = model.gmtModified;
            this.ownerId = model.ownerId;
            this.sessionId = model.sessionId;
            this.userId = model.userId;
        } 

        /**
         * ChatId.
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        /**
         * FeedbackAction.
         */
        public Builder feedbackAction(String feedbackAction) {
            this.feedbackAction = feedbackAction;
            return this;
        }

        /**
         * FeedbackId.
         */
        public Builder feedbackId(String feedbackId) {
            this.feedbackId = feedbackId;
            return this;
        }

        /**
         * FeedbackMessage.
         */
        public Builder feedbackMessage(String feedbackMessage) {
            this.feedbackMessage = feedbackMessage;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Feedback build() {
            return new Feedback(this);
        } 

    } 

}
