// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RunAgentRequest} extends {@link RequestModel}
 *
 * <p>RunAgentRequest</p>
 */
public class RunAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("botId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String botId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("useDraft")
    private Boolean useDraft;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionId")
    private String versionId;

    private RunAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.botId = builder.botId;
        this.modelId = builder.modelId;
        this.stream = builder.stream;
        this.threadId = builder.threadId;
        this.useDraft = builder.useDraft;
        this.userContent = builder.userContent;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return botId
     */
    public String getBotId() {
        return this.botId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return useDraft
     */
    public Boolean getUseDraft() {
        return this.useDraft;
    }

    /**
     * @return userContent
     */
    public String getUserContent() {
        return this.userContent;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<RunAgentRequest, Builder> {
        private String workspaceId; 
        private String botId; 
        private String modelId; 
        private Boolean stream; 
        private String threadId; 
        private Boolean useDraft; 
        private String userContent; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(RunAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.botId = request.botId;
            this.modelId = request.modelId;
            this.stream = request.stream;
            this.threadId = request.threadId;
            this.useDraft = request.useDraft;
            this.userContent = request.userContent;
            this.versionId = request.versionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d6zxykawk9</p>
         */
        public Builder botId(String botId) {
            this.putBodyParameter("botId", botId);
            this.botId = botId;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.putBodyParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        /**
         * useDraft.
         */
        public Builder useDraft(Boolean useDraft) {
            this.putBodyParameter("useDraft", useDraft);
            this.useDraft = useDraft;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userContent(String userContent) {
            this.putBodyParameter("userContent", userContent);
            this.userContent = userContent;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public RunAgentRequest build() {
            return new RunAgentRequest(this);
        } 

    } 

}
