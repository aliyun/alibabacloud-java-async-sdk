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
 * {@link ExecuteTextbookAssistantRetryConversationRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTextbookAssistantRetryConversationRequest</p>
 */
public class ExecuteTextbookAssistantRetryConversationRequest extends Request {
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

    private ExecuteTextbookAssistantRetryConversationRequest(Builder builder) {
        super(builder);
        this.assistant = builder.assistant;
        this.authToken = builder.authToken;
        this.chatId = builder.chatId;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantRetryConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ExecuteTextbookAssistantRetryConversationRequest, Builder> {
        private String assistant; 
        private String authToken; 
        private String chatId; 
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTextbookAssistantRetryConversationRequest request) {
            super(request);
            this.assistant = request.assistant;
            this.authToken = request.authToken;
            this.chatId = request.chatId;
            this.scenario = request.scenario;
        } 

        /**
         * <p>The AI assistant\&quot;s message ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6788e0b4b54c5268c1b78638</p>
         */
        public Builder assistant(String assistant) {
            this.putBodyParameter("assistant", assistant);
            this.assistant = assistant;
            return this;
        }

        /**
         * <p>The authorization token. You can obtain this token from the API that provides authorization for the textbook AI assistant feature.</p>
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
         * <p>The conversation ID.</p>
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
         * <p>Specifies the scenario. Valid values: <code>SYNC</code> for synchronized practice and <code>EXPAND</code> for expansion practice.</p>
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
        public ExecuteTextbookAssistantRetryConversationRequest build() {
            return new ExecuteTextbookAssistantRetryConversationRequest(this);
        } 

    } 

}
