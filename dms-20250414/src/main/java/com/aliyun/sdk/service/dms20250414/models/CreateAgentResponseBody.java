// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgentResponseBody</p>
 */
public class CreateAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateAgentResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateAgentResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The agent information and the automatically issued API key returned after the agent is created.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status code of the request result. A value of success indicates success. A specific error code is returned upon failure.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the request fails. This parameter is empty when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>agentName must not be blank</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The unique ID of the request. You can use this ID for troubleshooting and tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
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

        public CreateAgentResponseBody build() {
            return new CreateAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentResponseBody</p>
     */
    public static class ApiKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsRevoked")
        private Boolean isRevoked;

        @com.aliyun.core.annotation.NameInMap("KeyPrefix")
        private String keyPrefix;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private String lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Secret")
        private String secret;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private ApiKey(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.agentType = builder.agentType;
            this.createdAt = builder.createdAt;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.id = builder.id;
            this.isRevoked = builder.isRevoked;
            this.keyPrefix = builder.keyPrefix;
            this.lastUsedTime = builder.lastUsedTime;
            this.name = builder.name;
            this.secret = builder.secret;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKey create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isRevoked
         */
        public Boolean getIsRevoked() {
            return this.isRevoked;
        }

        /**
         * @return keyPrefix
         */
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        /**
         * @return lastUsedTime
         */
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String agentType; 
            private String createdAt; 
            private String creatorId; 
            private String creatorName; 
            private String description; 
            private String expireTime; 
            private Long id; 
            private Boolean isRevoked; 
            private String keyPrefix; 
            private String lastUsedTime; 
            private String name; 
            private String secret; 
            private String source; 

            private Builder() {
            } 

            private Builder(ApiKey model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.agentType = model.agentType;
                this.createdAt = model.createdAt;
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.id = model.id;
                this.isRevoked = model.isRevoked;
                this.keyPrefix = model.keyPrefix;
                this.lastUsedTime = model.lastUsedTime;
                this.name = model.name;
                this.secret = model.secret;
                this.source = model.source;
            } 

            /**
             * <p>The ID of the agent to which the API key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>agt-1a2b3c4d5e6f</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The name of the agent to which the API key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>order-analysis-agent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The permission inheritance type of the agent to which the API key belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>HUMAN_BOUND</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The time when the API key was created. The value is a time string in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The user ID of the user who created the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>usr-1a2b3c4d</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The name of the user who created the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The description of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>Access Token automatically issued when the Agent is created</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time of the API key. The value is a time string in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-11T14:04:32Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The primary key ID of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the API key has been revoked.</p>
             */
            public Builder isRevoked(Boolean isRevoked) {
                this.isRevoked = isRevoked;
                return this;
            }

            /**
             * <p>The non-sensitive visible prefix of the API key plaintext, used to identify the credential. The plaintext secret is not returned again.</p>
             * 
             * <strong>example:</strong>
             * <p>dms_sk_1a2b</p>
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            /**
             * <p>The time when the API key was last used. The value is a time string in RFC 3339 format. This parameter is empty if the API key has never been used.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-12T09:30:00Z</p>
             */
            public Builder lastUsedTime(String lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>The name of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>order-analysis-agent-default</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The plaintext secret of the API key. This value is returned only once in this creation response. Store it securely. Subsequent API calls do not return the plaintext secret again.</p>
             * 
             * <strong>example:</strong>
             * <p>dms_sk_1a2b3c4d****</p>
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>The credential source. Valid values: console (issued from the console), oauth (issued through the OAuth flow), install_token (issued through the install-and-authenticate flow). The API key automatically issued by this operation is always console.</p>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public ApiKey build() {
                return new ApiKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private ApiKey apiKey;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("CreationType")
        private String creationType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.agentType = builder.agentType;
            this.apiKey = builder.apiKey;
            this.createdAt = builder.createdAt;
            this.creationType = builder.creationType;
            this.description = builder.description;
            this.ownerId = builder.ownerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return apiKey
         */
        public ApiKey getApiKey() {
            return this.apiKey;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return creationType
         */
        public String getCreationType() {
            return this.creationType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String agentType; 
            private ApiKey apiKey; 
            private String createdAt; 
            private String creationType; 
            private String description; 
            private String ownerId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.agentType = model.agentType;
                this.apiKey = model.apiKey;
                this.createdAt = model.createdAt;
                this.creationType = model.creationType;
                this.description = model.description;
                this.ownerId = model.ownerId;
                this.status = model.status;
            } 

            /**
             * <p>The globally unique ID of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agt-1a2b3c4d5e6f</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>order-analysis-agent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The permission inheritance type of the agent. Valid values: HUMAN_BOUND (inherits user permissions), PERMISSION_NARROW (narrows permissions), STANDALONE (operates as an independent identity principal without inheriting permissions from other principals).</p>
             * 
             * <strong>example:</strong>
             * <p>HUMAN_BOUND</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The automatically issued API key for the new agent. The plaintext secret is returned only once in this response.</p>
             */
            public Builder apiKey(ApiKey apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The time when the agent was created. The value is a time string in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The creation method of the agent. Valid values: manual (manually created in the console), auto (automatic creation by the system). Agents created by this operation are always manual.</p>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>The description of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>An agent for querying and analyzing order data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The user ID of the agent owner, which is the current user who initiated the creation request.</p>
             * 
             * <strong>example:</strong>
             * <p>usr-1a2b3c4d</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The status of the agent. Valid values: active (enabled), disabled (disabled), deleted (deleted). A newly created agent is always active.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
