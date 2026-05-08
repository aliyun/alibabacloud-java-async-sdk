// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateContextRequest} extends {@link RequestModel}
 *
 * <p>UpdateContextRequest</p>
 */
public class UpdateContextRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String contextId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("experience")
    private java.util.Map<String, ?> experience;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("payload")
    private java.util.Map<String, ?> payload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerCondition")
    private String triggerCondition;

    private UpdateContextRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.contextStoreName = builder.contextStoreName;
        this.contextId = builder.contextId;
        this.content = builder.content;
        this.experience = builder.experience;
        this.metadata = builder.metadata;
        this.payload = builder.payload;
        this.triggerCondition = builder.triggerCondition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return contextId
     */
    public String getContextId() {
        return this.contextId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return experience
     */
    public java.util.Map<String, ?> getExperience() {
        return this.experience;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return payload
     */
    public java.util.Map<String, ?> getPayload() {
        return this.payload;
    }

    /**
     * @return triggerCondition
     */
    public String getTriggerCondition() {
        return this.triggerCondition;
    }

    public static final class Builder extends Request.Builder<UpdateContextRequest, Builder> {
        private String workspace; 
        private String contextStoreName; 
        private String contextId; 
        private String content; 
        private java.util.Map<String, ?> experience; 
        private java.util.Map<String, ?> metadata; 
        private java.util.Map<String, ?> payload; 
        private String triggerCondition; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContextRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.contextStoreName = request.contextStoreName;
            this.contextId = request.contextId;
            this.content = request.content;
            this.experience = request.experience;
            this.metadata = request.metadata;
            this.payload = request.payload;
            this.triggerCondition = request.triggerCondition;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>897294a7-67a4-4f60-976c-e136edc5f97e</p>
         */
        public Builder contextId(String contextId) {
            this.putPathParameter("contextId", contextId);
            this.contextId = contextId;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * experience.
         */
        public Builder experience(java.util.Map<String, ?> experience) {
            this.putBodyParameter("experience", experience);
            this.experience = experience;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * payload.
         */
        public Builder payload(java.util.Map<String, ?> payload) {
            this.putBodyParameter("payload", payload);
            this.payload = payload;
            return this;
        }

        /**
         * triggerCondition.
         */
        public Builder triggerCondition(String triggerCondition) {
            this.putBodyParameter("triggerCondition", triggerCondition);
            this.triggerCondition = triggerCondition;
            return this;
        }

        @Override
        public UpdateContextRequest build() {
            return new UpdateContextRequest(this);
        } 

    } 

}
