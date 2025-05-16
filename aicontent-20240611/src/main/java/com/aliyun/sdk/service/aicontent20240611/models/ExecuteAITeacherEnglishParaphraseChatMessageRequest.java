// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteAITeacherEnglishParaphraseChatMessageRequest} extends {@link RequestModel}
 *
 * <p>ExecuteAITeacherEnglishParaphraseChatMessageRequest</p>
 */
public class ExecuteAITeacherEnglishParaphraseChatMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatId")
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grade")
    private Long grade;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("questionId")
    private String questionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("questionInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String questionInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("responseMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String responseMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userAnswer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAnswer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ExecuteAITeacherEnglishParaphraseChatMessageRequest(Builder builder) {
        super(builder);
        this.chatId = builder.chatId;
        this.content = builder.content;
        this.grade = builder.grade;
        this.questionId = builder.questionId;
        this.questionInfo = builder.questionInfo;
        this.responseMode = builder.responseMode;
        this.userAnswer = builder.userAnswer;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAITeacherEnglishParaphraseChatMessageRequest create() {
        return builder().build();
    }

@Override
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return grade
     */
    public Long getGrade() {
        return this.grade;
    }

    /**
     * @return questionId
     */
    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * @return questionInfo
     */
    public String getQuestionInfo() {
        return this.questionInfo;
    }

    /**
     * @return responseMode
     */
    public String getResponseMode() {
        return this.responseMode;
    }

    /**
     * @return userAnswer
     */
    public String getUserAnswer() {
        return this.userAnswer;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ExecuteAITeacherEnglishParaphraseChatMessageRequest, Builder> {
        private String chatId; 
        private String content; 
        private Long grade; 
        private String questionId; 
        private String questionInfo; 
        private String responseMode; 
        private String userAnswer; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteAITeacherEnglishParaphraseChatMessageRequest request) {
            super(request);
            this.chatId = request.chatId;
            this.content = request.content;
            this.grade = request.grade;
            this.questionId = request.questionId;
            this.questionInfo = request.questionInfo;
            this.responseMode = request.responseMode;
            this.userAnswer = request.userAnswer;
            this.userId = request.userId;
        } 

        /**
         * chatId.
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("chatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>How much is this?</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * grade.
         */
        public Builder grade(Long grade) {
            this.putBodyParameter("grade", grade);
            this.grade = grade;
            return this;
        }

        /**
         * questionId.
         */
        public Builder questionId(String questionId) {
            this.putBodyParameter("questionId", questionId);
            this.questionId = questionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>How to inquire about the price</p>
         */
        public Builder questionInfo(String questionInfo) {
            this.putBodyParameter("questionInfo", questionInfo);
            this.questionInfo = questionInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sreaming</p>
         */
        public Builder responseMode(String responseMode) {
            this.putBodyParameter("responseMode", responseMode);
            this.responseMode = responseMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>How much is this?</p>
         */
        public Builder userAnswer(String userAnswer) {
            this.putBodyParameter("userAnswer", userAnswer);
            this.userAnswer = userAnswer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ExecuteAITeacherEnglishParaphraseChatMessageRequest build() {
            return new ExecuteAITeacherEnglishParaphraseChatMessageRequest(this);
        } 

    } 

}
