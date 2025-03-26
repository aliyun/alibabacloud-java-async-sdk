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
 * {@link ExecuteTextbookAssistantStartConversationRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTextbookAssistantStartConversationRequest</p>
 */
public class ExecuteTextbookAssistantStartConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("articleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String articleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenario;

    private ExecuteTextbookAssistantStartConversationRequest(Builder builder) {
        super(builder);
        this.articleId = builder.articleId;
        this.authToken = builder.authToken;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantStartConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articleId
     */
    public String getArticleId() {
        return this.articleId;
    }

    /**
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<ExecuteTextbookAssistantStartConversationRequest, Builder> {
        private String articleId; 
        private String authToken; 
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTextbookAssistantStartConversationRequest request) {
            super(request);
            this.articleId = request.articleId;
            this.authToken = request.authToken;
            this.scenario = request.scenario;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0c05700d4d9411efbe6e0c42a106bb02</p>
         */
        public Builder articleId(String articleId) {
            this.putBodyParameter("articleId", articleId);
            this.articleId = articleId;
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
         * <p>SYNC</p>
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public ExecuteTextbookAssistantStartConversationRequest build() {
            return new ExecuteTextbookAssistantStartConversationRequest(this);
        } 

    } 

}
