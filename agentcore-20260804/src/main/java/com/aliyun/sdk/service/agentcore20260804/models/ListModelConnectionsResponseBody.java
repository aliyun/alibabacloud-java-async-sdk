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
 * {@link ListModelConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelConnectionsResponseBody</p>
 */
public class ListModelConnectionsResponseBody extends TeaModel {
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

    private ListModelConnectionsResponseBody(Builder builder) {
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

    public static ListModelConnectionsResponseBody create() {
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

        private Builder(ListModelConnectionsResponseBody model) {
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
         * <p>The list of model connections.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of records per page. Valid values: 0 to 100. If this parameter is not set or is set to 0, the default value 10 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The request processing result message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token. Pass the token returned in the previous query. An empty response indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWwtY29ubmVjdGlvbjoxMA</p>
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

        public ListModelConnectionsResponseBody build() {
            return new ListModelConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelConnectionsResponseBody</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        private Models(Builder builder) {
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
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

        public static final class Builder {
            private String modelId; 
            private String modelName; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.modelId = model.modelId;
                this.modelName = model.modelName;
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

            public Models build() {
                return new Models(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelConnectionsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyCount")
        private Integer apiKeyCount;

        @com.aliyun.core.annotation.NameInMap("connectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("credentialConfigured")
        private Boolean credentialConfigured;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("models")
        private java.util.List<Models> models;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("providerType")
        private String providerType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Items(Builder builder) {
            this.apiKeyCount = builder.apiKeyCount;
            this.connectionId = builder.connectionId;
            this.createdAt = builder.createdAt;
            this.credentialConfigured = builder.credentialConfigured;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.models = builder.models;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.providerType = builder.providerType;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
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
         * @return apiKeyCount
         */
        public Integer getApiKeyCount() {
            return this.apiKeyCount;
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return credentialConfigured
         */
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return models
         */
        public java.util.List<Models> getModels() {
            return this.models;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return providerType
         */
        public String getProviderType() {
            return this.providerType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
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
            private Integer apiKeyCount; 
            private String connectionId; 
            private String createdAt; 
            private Boolean credentialConfigured; 
            private String description; 
            private String endpoint; 
            private java.util.List<Models> models; 
            private String name; 
            private String protocol; 
            private String providerType; 
            private String status; 
            private String statusReason; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apiKeyCount = model.apiKeyCount;
                this.connectionId = model.connectionId;
                this.createdAt = model.createdAt;
                this.credentialConfigured = model.credentialConfigured;
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.models = model.models;
                this.name = model.name;
                this.protocol = model.protocol;
                this.providerType = model.providerType;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The number of API keys configured for the model connection.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiKeyCount(Integer apiKeyCount) {
                this.apiKeyCount = apiKeyCount;
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
             * <p>Indicates whether access credentials have been configured for the model connection.</p>
             */
            public Builder credentialConfigured(Boolean credentialConfigured) {
                this.credentialConfigured = credentialConfigured;
                return this;
            }

            /**
             * <p>The description of the model connection. Maximum length: 255 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The absolute HTTP or HTTPS address of the upstream model service. Maximum length: 1024 characters.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The list of model summaries associated with the model connection.</p>
             */
            public Builder models(java.util.List<Models> models) {
                this.models = models;
                return this;
            }

            /**
             * <p>The model connection name. The name must be 1 to 128 non-whitespace characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The model invocation protocol. Currently only OpenAI/v1 is supported. If not configured in Settings when the model connection is created, this default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAI/v1</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The model provider type.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen</p>
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            /**
             * <p>The resource status.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The failure summary returned when the model connection fails to be published or fails to be deleted but remains in the Deleting state. This value is empty for other states.</p>
             * 
             * <strong>example:</strong>
             * <p>GatewayOperationException</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
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
