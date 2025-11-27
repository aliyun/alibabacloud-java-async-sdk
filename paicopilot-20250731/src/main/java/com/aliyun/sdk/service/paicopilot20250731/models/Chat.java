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
 * {@link Chat} extends {@link TeaModel}
 *
 * <p>Chat</p>
 */
public class Chat extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private ChatDetail answer;

    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.NameInMap("ExtraData")
    private String extraData;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("Question")
    private ChatDetail question;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private Chat(Builder builder) {
        this.answer = builder.answer;
        this.chatId = builder.chatId;
        this.extraData = builder.extraData;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModified = builder.gmtModified;
        this.message = builder.message;
        this.ownerId = builder.ownerId;
        this.question = builder.question;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Chat create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public ChatDetail getAnswer() {
        return this.answer;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return extraData
     */
    public String getExtraData() {
        return this.extraData;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return question
     */
    public ChatDetail getQuestion() {
        return this.question;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private ChatDetail answer; 
        private String chatId; 
        private String extraData; 
        private String gmtCreateTime; 
        private String gmtModified; 
        private String message; 
        private String ownerId; 
        private ChatDetail question; 
        private String sessionId; 
        private String status; 
        private String title; 
        private String userId; 

        private Builder() {
        } 

        private Builder(Chat model) {
            this.answer = model.answer;
            this.chatId = model.chatId;
            this.extraData = model.extraData;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModified = model.gmtModified;
            this.message = model.message;
            this.ownerId = model.ownerId;
            this.question = model.question;
            this.sessionId = model.sessionId;
            this.status = model.status;
            this.title = model.title;
            this.userId = model.userId;
        } 

        /**
         * Answer.
         */
        public Builder answer(ChatDetail answer) {
            this.answer = answer;
            return this;
        }

        /**
         * ChatId.
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        /**
         * ExtraData.
         */
        public Builder extraData(String extraData) {
            this.extraData = extraData;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Question.
         */
        public Builder question(ChatDetail question) {
            this.question = question;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Chat build() {
            return new Chat(this);
        } 

    } 

}
