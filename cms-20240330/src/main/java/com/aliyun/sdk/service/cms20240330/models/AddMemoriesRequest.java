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
 * {@link AddMemoriesRequest} extends {@link RequestModel}
 *
 * <p>AddMemoriesRequest</p>
 */
public class AddMemoriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("asyncMode")
    private Boolean asyncMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customInstructions")
    private String customInstructions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("infer")
    private Boolean infer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private AddMemoriesRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.memoryStoreName = builder.memoryStoreName;
        this.agentId = builder.agentId;
        this.appId = builder.appId;
        this.asyncMode = builder.asyncMode;
        this.customInstructions = builder.customInstructions;
        this.infer = builder.infer;
        this.messages = builder.messages;
        this.metadata = builder.metadata;
        this.runId = builder.runId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMemoriesRequest create() {
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
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return asyncMode
     */
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    /**
     * @return customInstructions
     */
    public String getCustomInstructions() {
        return this.customInstructions;
    }

    /**
     * @return infer
     */
    public Boolean getInfer() {
        return this.infer;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddMemoriesRequest, Builder> {
        private String workspace; 
        private String memoryStoreName; 
        private String agentId; 
        private String appId; 
        private Boolean asyncMode; 
        private String customInstructions; 
        private Boolean infer; 
        private java.util.List<Messages> messages; 
        private java.util.Map<String, ?> metadata; 
        private String runId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddMemoriesRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.memoryStoreName = request.memoryStoreName;
            this.agentId = request.agentId;
            this.appId = request.appId;
            this.asyncMode = request.asyncMode;
            this.customInstructions = request.customInstructions;
            this.infer = request.infer;
            this.messages = request.messages;
            this.metadata = request.metadata;
            this.runId = request.runId;
            this.userId = request.userId;
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
         * <p>test-memory-store</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * asyncMode.
         */
        public Builder asyncMode(Boolean asyncMode) {
            this.putBodyParameter("asyncMode", asyncMode);
            this.asyncMode = asyncMode;
            return this;
        }

        /**
         * customInstructions.
         */
        public Builder customInstructions(String customInstructions) {
            this.putBodyParameter("customInstructions", customInstructions);
            this.customInstructions = customInstructions;
            return this;
        }

        /**
         * infer.
         */
        public Builder infer(Boolean infer) {
            this.putBodyParameter("infer", infer);
            this.infer = infer;
            return this;
        }

        /**
         * messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
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
         * runId.
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddMemoriesRequest build() {
            return new AddMemoriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddMemoriesRequest} extends {@link TeaModel}
     *
     * <p>AddMemoriesRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
