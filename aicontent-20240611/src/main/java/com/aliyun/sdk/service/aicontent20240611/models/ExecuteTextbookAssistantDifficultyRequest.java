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
 * {@link ExecuteTextbookAssistantDifficultyRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTextbookAssistantDifficultyRequest</p>
 */
public class ExecuteTextbookAssistantDifficultyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistant")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistant;

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

    private ExecuteTextbookAssistantDifficultyRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.assistant = builder.assistant;
        this.authToken = builder.authToken;
        this.chatId = builder.chatId;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantDifficultyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return assistant
     */
    public String getAssistant() {
        return this.assistant;
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

    public static final class Builder extends Request.Builder<ExecuteTextbookAssistantDifficultyRequest, Builder> {
        private String action; 
        private String assistant; 
        private String authToken; 
        private String chatId; 
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTextbookAssistantDifficultyRequest request) {
            super(request);
            this.action = request.action;
            this.assistant = request.assistant;
            this.authToken = request.authToken;
            this.chatId = request.chatId;
            this.scenario = request.scenario;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UP</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6788f4a6b54c5268c1b78a25</p>
         */
        public Builder assistant(String assistant) {
            this.putBodyParameter("assistant", assistant);
            this.assistant = assistant;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
         */
        public Builder authToken(String authToken) {
            this.putBodyParameter("authToken", authToken);
            this.authToken = authToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6788e0b475a4631ffc626722</p>
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
         * <p>SYNC</p>
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public ExecuteTextbookAssistantDifficultyRequest build() {
            return new ExecuteTextbookAssistantDifficultyRequest(this);
        } 

    } 

}
