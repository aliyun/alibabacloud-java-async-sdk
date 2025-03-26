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
 * {@link ExecuteTextbookAssistantDialogueRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTextbookAssistantDialogueRequest</p>
 */
public class ExecuteTextbookAssistantDialogueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenario;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userMessage;

    private ExecuteTextbookAssistantDialogueRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.chatId = builder.chatId;
        this.scenario = builder.scenario;
        this.userMessage = builder.userMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantDialogueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return userMessage
     */
    public String getUserMessage() {
        return this.userMessage;
    }

    public static final class Builder extends Request.Builder<ExecuteTextbookAssistantDialogueRequest, Builder> {
        private String authToken; 
        private String chatId; 
        private String scenario; 
        private String userMessage; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTextbookAssistantDialogueRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.chatId = request.chatId;
            this.scenario = request.scenario;
            this.userMessage = request.userMessage;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authToken(String authToken) {
            this.putBodyParameter("authToken", authToken);
            this.authToken = authToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("chatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userMessage(String userMessage) {
            this.putBodyParameter("userMessage", userMessage);
            this.userMessage = userMessage;
            return this;
        }

        @Override
        public ExecuteTextbookAssistantDialogueRequest build() {
            return new ExecuteTextbookAssistantDialogueRequest(this);
        } 

    } 

}
