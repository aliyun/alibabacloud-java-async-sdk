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
 * {@link ExecuteTextbookAssistantSseDialogueRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTextbookAssistantSseDialogueRequest</p>
 */
public class ExecuteTextbookAssistantSseDialogueRequest extends Request {
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

    private ExecuteTextbookAssistantSseDialogueRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.chatId = builder.chatId;
        this.scenario = builder.scenario;
        this.userMessage = builder.userMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantSseDialogueRequest create() {
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

    public static final class Builder extends Request.Builder<ExecuteTextbookAssistantSseDialogueRequest, Builder> {
        private String authToken; 
        private String chatId; 
        private String scenario; 
        private String userMessage; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTextbookAssistantSseDialogueRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.chatId = request.chatId;
            this.scenario = request.scenario;
            this.userMessage = request.userMessage;
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
         * <p>67e374acb54c526c95c4fbd4</p>
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
         * <p>EXPAND</p>
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder userMessage(String userMessage) {
            this.putBodyParameter("userMessage", userMessage);
            this.userMessage = userMessage;
            return this;
        }

        @Override
        public ExecuteTextbookAssistantSseDialogueRequest build() {
            return new ExecuteTextbookAssistantSseDialogueRequest(this);
        } 

    } 

}
