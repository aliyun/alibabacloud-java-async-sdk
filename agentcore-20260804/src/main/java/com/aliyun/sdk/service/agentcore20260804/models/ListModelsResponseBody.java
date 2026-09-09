// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelsResponseBody</p>
 */
public class ListModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListModelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListModelsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code. A value of SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of models.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of results per page. Valid values: 0 to 100. If this parameter is not set or set to 0, the default value 10 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The message of the request processing result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token. Pass the token returned from the previous query. An empty response indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWw6MTA</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of resources that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelsResponseBody build() {
            return new ListModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audio")
        private Boolean audio;

        @com.aliyun.core.annotation.NameInMap("document")
        private Boolean document;

        @com.aliyun.core.annotation.NameInMap("multiToolCall")
        private Boolean multiToolCall;

        @com.aliyun.core.annotation.NameInMap("reasoning")
        private Boolean reasoning;

        @com.aliyun.core.annotation.NameInMap("streamToolCall")
        private Boolean streamToolCall;

        @com.aliyun.core.annotation.NameInMap("toolCall")
        private Boolean toolCall;

        @com.aliyun.core.annotation.NameInMap("video")
        private Boolean video;

        @com.aliyun.core.annotation.NameInMap("vision")
        private Boolean vision;

        private Capabilities(Builder builder) {
            this.audio = builder.audio;
            this.document = builder.document;
            this.multiToolCall = builder.multiToolCall;
            this.reasoning = builder.reasoning;
            this.streamToolCall = builder.streamToolCall;
            this.toolCall = builder.toolCall;
            this.video = builder.video;
            this.vision = builder.vision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Boolean getAudio() {
            return this.audio;
        }

        /**
         * @return document
         */
        public Boolean getDocument() {
            return this.document;
        }

        /**
         * @return multiToolCall
         */
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        /**
         * @return reasoning
         */
        public Boolean getReasoning() {
            return this.reasoning;
        }

        /**
         * @return streamToolCall
         */
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        /**
         * @return toolCall
         */
        public Boolean getToolCall() {
            return this.toolCall;
        }

        /**
         * @return video
         */
        public Boolean getVideo() {
            return this.video;
        }

        /**
         * @return vision
         */
        public Boolean getVision() {
            return this.vision;
        }

        public static final class Builder {
            private Boolean audio; 
            private Boolean document; 
            private Boolean multiToolCall; 
            private Boolean reasoning; 
            private Boolean streamToolCall; 
            private Boolean toolCall; 
            private Boolean video; 
            private Boolean vision; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.audio = model.audio;
                this.document = model.document;
                this.multiToolCall = model.multiToolCall;
                this.reasoning = model.reasoning;
                this.streamToolCall = model.streamToolCall;
                this.toolCall = model.toolCall;
                this.video = model.video;
                this.vision = model.vision;
            } 

            /**
             * <p>Indicates whether the model supports audio input or output.</p>
             */
            public Builder audio(Boolean audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>Indicates whether the model supports document input.</p>
             */
            public Builder document(Boolean document) {
                this.document = document;
                return this;
            }

            /**
             * <p>Indicates whether the model supports invoking multiple tools in a single response.</p>
             */
            public Builder multiToolCall(Boolean multiToolCall) {
                this.multiToolCall = multiToolCall;
                return this;
            }

            /**
             * <p>Indicates whether the model supports reasoning capabilities.</p>
             */
            public Builder reasoning(Boolean reasoning) {
                this.reasoning = reasoning;
                return this;
            }

            /**
             * <p>Indicates whether the model supports streaming tool calling.</p>
             */
            public Builder streamToolCall(Boolean streamToolCall) {
                this.streamToolCall = streamToolCall;
                return this;
            }

            /**
             * <p>Indicates whether the model supports tool calling.</p>
             */
            public Builder toolCall(Boolean toolCall) {
                this.toolCall = toolCall;
                return this;
            }

            /**
             * <p>Indicates whether the model supports video input.</p>
             */
            public Builder video(Boolean video) {
                this.video = video;
                return this;
            }

            /**
             * <p>Indicates whether the model supports image input.</p>
             */
            public Builder vision(Boolean vision) {
                this.vision = vision;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilities")
        private Capabilities capabilities;

        @com.aliyun.core.annotation.NameInMap("connectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("contextSize")
        private Long contextSize;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Long maxTokens;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Items(Builder builder) {
            this.capabilities = builder.capabilities;
            this.connectionId = builder.connectionId;
            this.contextSize = builder.contextSize;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.maxTokens = builder.maxTokens;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return capabilities
         */
        public Capabilities getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return contextSize
         */
        public Long getContextSize() {
            return this.contextSize;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maxTokens
         */
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Capabilities capabilities; 
            private String connectionId; 
            private Long contextSize; 
            private String createdAt; 
            private String description; 
            private Long maxTokens; 
            private String modelId; 
            private String modelName; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.capabilities = model.capabilities;
                this.connectionId = model.connectionId;
                this.contextSize = model.contextSize;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.maxTokens = model.maxTokens;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The model capability configuration.</p>
             */
            public Builder capabilities(Capabilities capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>The model connection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mc-1</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>The model context window size, in tokens. The value must be a positive integer.</p>
             * 
             * <strong>example:</strong>
             * <p>128000</p>
             */
            public Builder contextSize(Long contextSize) {
                this.contextSize = contextSize;
                return this;
            }

            /**
             * <p>The time when the resource was created, in RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-09T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The model description. Maximum length: 255 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The maximum number of output tokens supported by the model in a single generation.</p>
             * 
             * <strong>example:</strong>
             * <p>131072</p>
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>model-1</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The upstream model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The time when the resource was last updated, in RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-09T00:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
