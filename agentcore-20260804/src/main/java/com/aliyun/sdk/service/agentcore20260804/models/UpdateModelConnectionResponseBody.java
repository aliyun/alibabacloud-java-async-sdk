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
 * {@link UpdateModelConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateModelConnectionResponseBody</p>
 */
public class UpdateModelConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateModelConnectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelConnectionResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateModelConnectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. The value SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The updated model connection information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public UpdateModelConnectionResponseBody build() {
            return new UpdateModelConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateModelConnectionResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
            this.apiKeyCount = builder.apiKeyCount;
            this.connectionId = builder.connectionId;
            this.createdAt = builder.createdAt;
            this.credentialConfigured = builder.credentialConfigured;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
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

        public static Data create() {
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
            private String name; 
            private String protocol; 
            private String providerType; 
            private String status; 
            private String statusReason; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKeyCount = model.apiKeyCount;
                this.connectionId = model.connectionId;
                this.createdAt = model.createdAt;
                this.credentialConfigured = model.credentialConfigured;
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.name = model.name;
                this.protocol = model.protocol;
                this.providerType = model.providerType;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The number of API keys configured in the model connection.</p>
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
             * <p>The description of the model connection. The description can be up to 255 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The absolute HTTP or HTTPS address of the upstream model service. The address can be up to 1024 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
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
             * <p>The model invocation protocol. Currently, only OpenAI/v1 is supported. If not specified in Settings when the model connection is created, this default value is used.</p>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
