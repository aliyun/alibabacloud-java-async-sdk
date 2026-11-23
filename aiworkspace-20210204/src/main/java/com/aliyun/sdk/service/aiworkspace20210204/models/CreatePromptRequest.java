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
 * {@link CreatePromptRequest} extends {@link RequestModel}
 *
 * <p>CreatePromptRequest</p>
 */
public class CreatePromptRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

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
    @com.aliyun.core.annotation.NameInMap("PromptName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreatePromptRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.description = builder.description;
        this.frameworkContent = builder.frameworkContent;
        this.frameworkType = builder.frameworkType;
        this.promptName = builder.promptName;
        this.workspaceId = builder.workspaceId;
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
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
     * @return promptName
     */
    public String getPromptName() {
        return this.promptName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreatePromptRequest, Builder> {
        private String accessibility; 
        private String description; 
        private String frameworkContent; 
        private String frameworkType; 
        private String promptName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePromptRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.description = request.description;
            this.frameworkContent = request.frameworkContent;
            this.frameworkType = request.frameworkType;
            this.promptName = request.promptName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the workspace. Valid values:</p>
         * <ul>
         * <li>PRIVATE (default): Visible only to you and administrators in this workspace.</li>
         * <li>PUBLIC: Visible to all users in this workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The description of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an information extraction prompt for autonomous driving highway scenarios, focusing on extracting information such as lanes and weather</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The content of the prompt framework.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;context&quot;:&quot;You are an experienced driver with ten years of driving experience. Please analyze and evaluate the following image scenario.&quot;,
         *   &quot;inputData&quot;:&quot;{
         *     \&quot;Reflective tape\&quot;: \&quot;Usually yellow or alternating yellow and black, attached to permanent protruding obstacles such as wall corners to remind drivers to avoid them.\&quot;,
         *     \&quot;Parking lock\&quot;: \&quot;Also known as a parking space lock, it prevents the parking space from being occupied when raised. If a parking lock is present, be sure to output whether it is in the raised or lowered state.\&quot;,
         *   }&quot;
         * }</p>
         */
        public Builder frameworkContent(String frameworkContent) {
            this.putBodyParameter("FrameworkContent", frameworkContent);
            this.frameworkContent = frameworkContent;
            return this;
        }

        /**
         * <p>The prompt optimization template.</p>
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
         * <p>The name of the prompt.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Autonomous driving highway information extraction</p>
         */
        public Builder promptName(String promptName) {
            this.putBodyParameter("PromptName", promptName);
            this.promptName = promptName;
            return this;
        }

        /**
         * <p>The workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>796**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreatePromptRequest build() {
            return new CreatePromptRequest(this);
        } 

    } 

}
