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
 * {@link CreatePromptVersionRequest} extends {@link RequestModel}
 *
 * <p>CreatePromptVersionRequest</p>
 */
public class CreatePromptVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BasedOnVersion")
    private String basedOnVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitMsg")
    private String commitMsg;

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
    private String template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Variables")
    private String variables;

    private CreatePromptVersionRequest(Builder builder) {
        super(builder);
        this.basedOnVersion = builder.basedOnVersion;
        this.commitMsg = builder.commitMsg;
        this.namespaceId = builder.namespaceId;
        this.promptKey = builder.promptKey;
        this.targetVersion = builder.targetVersion;
        this.template = builder.template;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePromptVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basedOnVersion
     */
    public String getBasedOnVersion() {
        return this.basedOnVersion;
    }

    /**
     * @return commitMsg
     */
    public String getCommitMsg() {
        return this.commitMsg;
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

    public static final class Builder extends Request.Builder<CreatePromptVersionRequest, Builder> {
        private String basedOnVersion; 
        private String commitMsg; 
        private String namespaceId; 
        private String promptKey; 
        private String targetVersion; 
        private String template; 
        private String variables; 

        private Builder() {
            super();
        } 

        private Builder(CreatePromptVersionRequest request) {
            super(request);
            this.basedOnVersion = request.basedOnVersion;
            this.commitMsg = request.commitMsg;
            this.namespaceId = request.namespaceId;
            this.promptKey = request.promptKey;
            this.targetVersion = request.targetVersion;
            this.template = request.template;
            this.variables = request.variables;
        } 

        /**
         * <p>Fork from this version. Either this parameter or Template must be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        public Builder basedOnVersion(String basedOnVersion) {
            this.putQueryParameter("BasedOnVersion", basedOnVersion);
            this.basedOnVersion = basedOnVersion;
            return this;
        }

        /**
         * <p>Commit message.</p>
         * 
         * <strong>example:</strong>
         * <p>初始版本</p>
         */
        public Builder commitMsg(String commitMsg) {
            this.putQueryParameter("CommitMsg", commitMsg);
            this.commitMsg = commitMsg;
            return this;
        }

        /**
         * <p>Workspace ID.</p>
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
         * <p>Unique identifier of the prompt.</p>
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
         * <p>Draft version number. If not specified, the version number is automatically incremented.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.2</p>
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        /**
         * <p>Prompt template content. Either this parameter or BasedOnVersion must be specified.</p>
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
         * <p>Variable definitions in a JSON array string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;defaultValue&quot;:&quot;Hello&quot;}]</p>
         */
        public Builder variables(String variables) {
            this.putQueryParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public CreatePromptVersionRequest build() {
            return new CreatePromptVersionRequest(this);
        } 

    } 

}
