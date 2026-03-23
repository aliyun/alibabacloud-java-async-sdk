// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateApplicationPromptRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationPromptRequest</p>
 */
public class CreateApplicationPromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptValue;

    private CreateApplicationPromptRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.promptName = builder.promptName;
        this.promptType = builder.promptType;
        this.promptValue = builder.promptValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationPromptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return promptName
     */
    public String getPromptName() {
        return this.promptName;
    }

    /**
     * @return promptType
     */
    public String getPromptType() {
        return this.promptType;
    }

    /**
     * @return promptValue
     */
    public String getPromptValue() {
        return this.promptValue;
    }

    public static final class Builder extends Request.Builder<CreateApplicationPromptRequest, Builder> {
        private String applicationId; 
        private String promptName; 
        private String promptType; 
        private String promptValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationPromptRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.promptName = request.promptName;
            this.promptType = request.promptType;
            this.promptValue = request.promptValue;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_prompt</p>
         */
        public Builder promptName(String promptName) {
            this.putQueryParameter("PromptName", promptName);
            this.promptName = promptName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONVERSATION_SUMMERY
         * SEMANTIC_MEMORY
         * MEMORY_ANSWER_PROMPT
         * USER_MEMORY_EXTRACTION_PROMPT
         * AGENT_MEMORY_EXTRACTION_PROMPT
         * PROCEDURAL_MEMORY_SYSTEM_PROMPT
         * RETRIEVE_NODES_PROMPT
         * EXTRACT_RELATIONS_PROMPT
         * UPDATE_GRAPH_PROMPT
         * DELETE_RELATIONS_SYSTEM_PROMPT</p>
         */
        public Builder promptType(String promptType) {
            this.putQueryParameter("PromptType", promptType);
            this.promptType = promptType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prompt content</p>
         */
        public Builder promptValue(String promptValue) {
            this.putQueryParameter("PromptValue", promptValue);
            this.promptValue = promptValue;
            return this;
        }

        @Override
        public CreateApplicationPromptRequest build() {
            return new CreateApplicationPromptRequest(this);
        } 

    } 

}
