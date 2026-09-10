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
 * {@link AddContextsRequest} extends {@link RequestModel}
 *
 * <p>AddContextsRequest</p>
 */
public class AddContextsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contextType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memoryType")
    private String memoryType;

    private AddContextsRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.contextStoreName = builder.contextStoreName;
        this.contextType = builder.contextType;
        this.items = builder.items;
        this.memoryType = builder.memoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddContextsRequest create() {
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
     * @return contextType
     */
    public String getContextType() {
        return this.contextType;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return memoryType
     */
    public String getMemoryType() {
        return this.memoryType;
    }

    public static final class Builder extends Request.Builder<AddContextsRequest, Builder> {
        private String workspace; 
        private String contextStoreName; 
        private String contextType; 
        private java.util.List<Items> items; 
        private String memoryType; 

        private Builder() {
            super();
        } 

        private Builder(AddContextsRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.contextStoreName = request.contextStoreName;
            this.contextType = request.contextType;
            this.items = request.items;
            this.memoryType = request.memoryType;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The context store name.</p>
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
         * <p>The context type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        public Builder contextType(String contextType) {
            this.putBodyParameter("contextType", contextType);
            this.contextType = contextType;
            return this;
        }

        /**
         * <p>An array of context items.</p>
         * <p>This parameter is required.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.putBodyParameter("items", items);
            this.items = items;
            return this;
        }

        /**
         * <p>The memory type.</p>
         * 
         * <strong>example:</strong>
         * <p>short</p>
         */
        public Builder memoryType(String memoryType) {
            this.putBodyParameter("memoryType", memoryType);
            this.memoryType = memoryType;
            return this;
        }

        @Override
        public AddContextsRequest build() {
            return new AddContextsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddContextsRequest} extends {@link TeaModel}
     *
     * <p>AddContextsRequest</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("customInstructions")
        private String customInstructions;

        @com.aliyun.core.annotation.NameInMap("experience")
        private java.util.Map<String, ?> experience;

        @com.aliyun.core.annotation.NameInMap("expirationDate")
        private String expirationDate;

        @com.aliyun.core.annotation.NameInMap("immutable")
        private Boolean immutable;

        @com.aliyun.core.annotation.NameInMap("infer")
        private Boolean infer;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List<java.util.Map<String, ?>> messages;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("triggerCondition")
        private String triggerCondition;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Items(Builder builder) {
            this.agentId = builder.agentId;
            this.appId = builder.appId;
            this.categories = builder.categories;
            this.content = builder.content;
            this.customInstructions = builder.customInstructions;
            this.experience = builder.experience;
            this.expirationDate = builder.expirationDate;
            this.immutable = builder.immutable;
            this.infer = builder.infer;
            this.labels = builder.labels;
            this.messages = builder.messages;
            this.metadata = builder.metadata;
            this.runId = builder.runId;
            this.timestamp = builder.timestamp;
            this.triggerCondition = builder.triggerCondition;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return categories
         */
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return customInstructions
         */
        public String getCustomInstructions() {
            return this.customInstructions;
        }

        /**
         * @return experience
         */
        public java.util.Map<String, ?> getExperience() {
            return this.experience;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return immutable
         */
        public Boolean getImmutable() {
            return this.immutable;
        }

        /**
         * @return infer
         */
        public Boolean getInfer() {
            return this.infer;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return messages
         */
        public java.util.List<java.util.Map<String, ?>> getMessages() {
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
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return triggerCondition
         */
        public String getTriggerCondition() {
            return this.triggerCondition;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String appId; 
            private java.util.List<String> categories; 
            private String content; 
            private String customInstructions; 
            private java.util.Map<String, ?> experience; 
            private String expirationDate; 
            private Boolean immutable; 
            private Boolean infer; 
            private java.util.Map<String, String> labels; 
            private java.util.List<java.util.Map<String, ?>> messages; 
            private java.util.Map<String, ?> metadata; 
            private String runId; 
            private Long timestamp; 
            private String triggerCondition; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.agentId = model.agentId;
                this.appId = model.appId;
                this.categories = model.categories;
                this.content = model.content;
                this.customInstructions = model.customInstructions;
                this.experience = model.experience;
                this.expirationDate = model.expirationDate;
                this.immutable = model.immutable;
                this.infer = model.infer;
                this.labels = model.labels;
                this.messages = model.messages;
                this.metadata = model.metadata;
                this.runId = model.runId;
                this.timestamp = model.timestamp;
                this.triggerCondition = model.triggerCondition;
                this.userId = model.userId;
            } 

            /**
             * <p>The unique agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>952730733889060865</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mm_480d961a1b5e4efe84603f4cbc0f</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>A list of categories to apply to the context item.</p>
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The content of the context item.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a conversation assistant.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The custom instructions for processing the context.</p>
             * 
             * <strong>example:</strong>
             * <p>Your custom instructions here</p>
             */
            public Builder customInstructions(String customInstructions) {
                this.customInstructions = customInstructions;
                return this;
            }

            /**
             * <p>An object containing experience information for the context.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;taskType&quot;: &quot;troubleshooting&quot;,
             *     &quot;complexity&quot;: &quot;medium&quot;,
             *     &quot;confidence&quot;: 0.95
             * }</p>
             */
            public Builder experience(java.util.Map<String, ?> experience) {
                this.experience = experience;
                return this;
            }

            /**
             * <p>The expiration timestamp for the context item.</p>
             * 
             * <strong>example:</strong>
             * <p>1731231212334396</p>
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * <p>Specifies whether the context item is immutable. If set to <code>true</code>, the item cannot be changed after it is created. The default value is <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder immutable(Boolean immutable) {
                this.immutable = immutable;
                return this;
            }

            /**
             * <p>Specifies whether to perform inference based on the context. The default value is <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder infer(Boolean infer) {
                this.infer = infer;
                return this;
            }

            /**
             * <p>A map of key-value pairs to apply as labels.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>An array of message objects.</p>
             */
            public Builder messages(java.util.List<java.util.Map<String, ?>> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>Key-value pairs to store as metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>jr-80ded1d6953c64ea</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The timestamp of the context item.</p>
             * 
             * <strong>example:</strong>
             * <p>1774578167</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The condition that triggers the context.</p>
             * 
             * <strong>example:</strong>
             * <p>Identify and troubleshoot SLs issues</p>
             */
            public Builder triggerCondition(String triggerCondition) {
                this.triggerCondition = triggerCondition;
                return this;
            }

            /**
             * <p>The unique user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user_001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
