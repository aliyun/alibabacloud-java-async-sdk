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
 * {@link GetModelConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelConnectionResponseBody</p>
 */
public class GetModelConnectionResponseBody extends TeaModel {
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

    private GetModelConnectionResponseBody(Builder builder) {
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

    public static GetModelConnectionResponseBody create() {
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

        private Builder(GetModelConnectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetModelConnectionResponseBody build() {
            return new GetModelConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelConnectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyCount")
        private Integer apiKeyCount;

        @com.aliyun.core.annotation.NameInMap("apiKeys")
        private java.util.List<String> apiKeys;

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

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

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
            this.apiKeys = builder.apiKeys;
            this.connectionId = builder.connectionId;
            this.createdAt = builder.createdAt;
            this.credentialConfigured = builder.credentialConfigured;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.providerType = builder.providerType;
            this.regionId = builder.regionId;
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
         * @return apiKeys
         */
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private java.util.List<String> apiKeys; 
            private String connectionId; 
            private String createdAt; 
            private Boolean credentialConfigured; 
            private String description; 
            private String endpoint; 
            private String name; 
            private String protocol; 
            private String providerType; 
            private String regionId; 
            private String status; 
            private String statusReason; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKeyCount = model.apiKeyCount;
                this.apiKeys = model.apiKeys;
                this.connectionId = model.connectionId;
                this.createdAt = model.createdAt;
                this.credentialConfigured = model.credentialConfigured;
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.name = model.name;
                this.protocol = model.protocol;
                this.providerType = model.providerType;
                this.regionId = model.regionId;
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
             * apiKeys.
             */
            public Builder apiKeys(java.util.List<String> apiKeys) {
                this.apiKeys = apiKeys;
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
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
