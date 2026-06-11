// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link CreatePromptRequest} extends {@link RequestModel}
 *
 * <p>CreatePromptRequest</p>
 */
public class CreatePromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizTags")
    private String bizTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitMsg")
    private String commitMsg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVersion")
    private String targetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Variables")
    private String variables;

    private CreatePromptRequest(Builder builder) {
        super(builder);
        this.bizTags = builder.bizTags;
        this.commitMsg = builder.commitMsg;
        this.description = builder.description;
        this.namespaceId = builder.namespaceId;
        this.promptKey = builder.promptKey;
        this.targetVersion = builder.targetVersion;
        this.template = builder.template;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePromptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTags
     */
    public String getBizTags() {
        return this.bizTags;
    }

    /**
     * @return commitMsg
     */
    public String getCommitMsg() {
        return this.commitMsg;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return promptKey
     */
    public String getPromptKey() {
        return this.promptKey;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return variables
     */
    public String getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<CreatePromptRequest, Builder> {
        private String bizTags; 
        private String commitMsg; 
        private String description; 
        private String namespaceId; 
        private String promptKey; 
        private String targetVersion; 
        private String template; 
        private String variables; 

        private Builder() {
            super();
        } 

        private Builder(CreatePromptRequest request) {
            super(request);
            this.bizTags = request.bizTags;
            this.commitMsg = request.commitMsg;
            this.description = request.description;
            this.namespaceId = request.namespaceId;
            this.promptKey = request.promptKey;
            this.targetVersion = request.targetVersion;
            this.template = request.template;
            this.variables = request.variables;
        } 

        /**
         * BizTags.
         */
        public Builder bizTags(String bizTags) {
            this.putQueryParameter("BizTags", bizTags);
            this.bizTags = bizTags;
            return this;
        }

        /**
         * CommitMsg.
         */
        public Builder commitMsg(String commitMsg) {
            this.putQueryParameter("CommitMsg", commitMsg);
            this.commitMsg = commitMsg;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-qa</p>
         */
        public Builder promptKey(String promptKey) {
            this.putQueryParameter("PromptKey", promptKey);
            this.promptKey = promptKey;
            return this;
        }

        /**
         * TargetVersion.
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一个客服助手，请回答：{question}</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(String variables) {
            this.putQueryParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public CreatePromptRequest build() {
            return new CreatePromptRequest(this);
        } 

    } 

}
