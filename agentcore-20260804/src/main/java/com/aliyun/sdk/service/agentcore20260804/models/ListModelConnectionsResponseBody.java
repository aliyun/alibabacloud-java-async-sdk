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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
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
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * modelName.
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
             * apiKeyCount.
             */
            public Builder apiKeyCount(Integer apiKeyCount) {
                this.apiKeyCount = apiKeyCount;
                return this;
            }

            /**
             * connectionId.
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * credentialConfigured.
             */
            public Builder credentialConfigured(Boolean credentialConfigured) {
                this.credentialConfigured = credentialConfigured;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * models.
             */
            public Builder models(java.util.List<Models> models) {
                this.models = models;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * providerType.
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * statusReason.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * workspaceId.
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
