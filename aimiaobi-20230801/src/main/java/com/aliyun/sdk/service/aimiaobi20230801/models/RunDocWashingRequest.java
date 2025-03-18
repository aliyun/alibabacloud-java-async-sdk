// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunDocWashingRequest} extends {@link RequestModel}
 *
 * <p>RunDocWashingRequest</p>
 */
public class RunDocWashingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String referenceContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WordNumber")
    private Integer wordNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingTypeName")
    private String writingTypeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingTypeRefDoc")
    private String writingTypeRefDoc;

    private RunDocWashingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.prompt = builder.prompt;
        this.referenceContent = builder.referenceContent;
        this.sessionId = builder.sessionId;
        this.topic = builder.topic;
        this.wordNumber = builder.wordNumber;
        this.workspaceId = builder.workspaceId;
        this.writingTypeName = builder.writingTypeName;
        this.writingTypeRefDoc = builder.writingTypeRefDoc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocWashingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return referenceContent
     */
    public String getReferenceContent() {
        return this.referenceContent;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return wordNumber
     */
    public Integer getWordNumber() {
        return this.wordNumber;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return writingTypeName
     */
    public String getWritingTypeName() {
        return this.writingTypeName;
    }

    /**
     * @return writingTypeRefDoc
     */
    public String getWritingTypeRefDoc() {
        return this.writingTypeRefDoc;
    }

    public static final class Builder extends Request.Builder<RunDocWashingRequest, Builder> {
        private String regionId; 
        private String prompt; 
        private String referenceContent; 
        private String sessionId; 
        private String topic; 
        private Integer wordNumber; 
        private String workspaceId; 
        private String writingTypeName; 
        private String writingTypeRefDoc; 

        private Builder() {
            super();
        } 

        private Builder(RunDocWashingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.prompt = request.prompt;
            this.referenceContent = request.referenceContent;
            this.sessionId = request.sessionId;
            this.topic = request.topic;
            this.wordNumber = request.wordNumber;
            this.workspaceId = request.workspaceId;
            this.writingTypeName = request.writingTypeName;
            this.writingTypeRefDoc = request.writingTypeRefDoc;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder referenceContent(String referenceContent) {
            this.putBodyParameter("ReferenceContent", referenceContent);
            this.referenceContent = referenceContent;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * WordNumber.
         */
        public Builder wordNumber(Integer wordNumber) {
            this.putBodyParameter("WordNumber", wordNumber);
            this.wordNumber = wordNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2setzb9x4ewsd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WritingTypeName.
         */
        public Builder writingTypeName(String writingTypeName) {
            this.putBodyParameter("WritingTypeName", writingTypeName);
            this.writingTypeName = writingTypeName;
            return this;
        }

        /**
         * WritingTypeRefDoc.
         */
        public Builder writingTypeRefDoc(String writingTypeRefDoc) {
            this.putBodyParameter("WritingTypeRefDoc", writingTypeRefDoc);
            this.writingTypeRefDoc = writingTypeRefDoc;
            return this;
        }

        @Override
        public RunDocWashingRequest build() {
            return new RunDocWashingRequest(this);
        } 

    } 

}
