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
 * {@link ExecuteTextbookAssistantGrammarCheckRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTextbookAssistantGrammarCheckRequest</p>
 */
public class ExecuteTextbookAssistantGrammarCheckRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("user")
    @com.aliyun.core.annotation.Validation(required = true)
    private String user;

    private ExecuteTextbookAssistantGrammarCheckRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.chatId = builder.chatId;
        this.scenario = builder.scenario;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantGrammarCheckRequest create() {
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
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<ExecuteTextbookAssistantGrammarCheckRequest, Builder> {
        private String authToken; 
        private String chatId; 
        private String scenario; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTextbookAssistantGrammarCheckRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.chatId = request.chatId;
            this.scenario = request.scenario;
            this.user = request.user;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6788e0b45bdfc807f077a5a1</p>
         */
        public Builder user(String user) {
            this.putBodyParameter("user", user);
            this.user = user;
            return this;
        }

        @Override
        public ExecuteTextbookAssistantGrammarCheckRequest build() {
            return new ExecuteTextbookAssistantGrammarCheckRequest(this);
        } 

    } 

}
