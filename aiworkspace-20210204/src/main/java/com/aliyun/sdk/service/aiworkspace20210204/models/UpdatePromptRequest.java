// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link UpdatePromptRequest} extends {@link RequestModel}
 *
 * <p>UpdatePromptRequest</p>
 */
public class UpdatePromptRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PromptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FrameworkContent")
    private String frameworkContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FrameworkType")
    private String frameworkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdatePromptRequest(Builder builder) {
        super(builder);
        this.promptId = builder.promptId;
        this.description = builder.description;
        this.frameworkContent = builder.frameworkContent;
        this.frameworkType = builder.frameworkType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePromptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return promptId
     */
    public String getPromptId() {
        return this.promptId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return frameworkContent
     */
    public String getFrameworkContent() {
        return this.frameworkContent;
    }

    /**
     * @return frameworkType
     */
    public String getFrameworkType() {
        return this.frameworkType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdatePromptRequest, Builder> {
        private String promptId; 
        private String description; 
        private String frameworkContent; 
        private String frameworkType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePromptRequest request) {
            super(request);
            this.promptId = request.promptId;
            this.description = request.description;
            this.frameworkContent = request.frameworkContent;
            this.frameworkType = request.frameworkType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The prompt ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pmt-axbxtc****xxx</p>
         */
        public Builder promptId(String promptId) {
            this.putPathParameter("PromptId", promptId);
            this.promptId = promptId;
            return this;
        }

        /**
         * <p>The description of the prompt.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The content of the prompt.</p>
         */
        public Builder frameworkContent(String frameworkContent) {
            this.putBodyParameter("FrameworkContent", frameworkContent);
            this.frameworkContent = frameworkContent;
            return this;
        }

        /**
         * <p>The prompt template type.</p>
         * 
         * <strong>example:</strong>
         * <p>ICIO</p>
         */
        public Builder frameworkType(String frameworkType) {
            this.putBodyParameter("FrameworkType", frameworkType);
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>302914</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdatePromptRequest build() {
            return new UpdatePromptRequest(this);
        } 

    } 

}
