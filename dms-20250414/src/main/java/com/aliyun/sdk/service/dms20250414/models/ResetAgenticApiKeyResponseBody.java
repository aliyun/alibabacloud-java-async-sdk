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
 * {@link ResetAgenticApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ResetAgenticApiKeyResponseBody</p>
 */
public class ResetAgenticApiKeyResponseBody extends TeaModel {
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

    private ResetAgenticApiKeyResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAgenticApiKeyResponseBody create() {
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

        private Builder(ResetAgenticApiKeyResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The Access Token information returned after a successful reset. The Secret field contains the new plaintext Secret, which is returned only once in this response.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the request fails. You can use this code to programmatically determine the failure type. This value is empty when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCESS_TOKEN_NOT_FOUND</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the request fails. This message helps you locate the issue. This value is empty when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>access token not found: 1024</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The unique request ID, which is used for troubleshooting and log correlation.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6C-2C4DD51BD5E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. A value of true indicates that the reset was successful. A value of false indicates a failure. In this case, check ErrorCode and ErrorMessage to identify the cause.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ResetAgenticApiKeyResponseBody build() {
            return new ResetAgenticApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResetAgenticApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ResetAgenticApiKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Warning")
        private String warning;

        private Data(Builder builder) {
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
            this.warning = builder.warning;
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

        /**
         * @return warning
         */
        public String getWarning() {
            return this.warning;
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
            private String warning; 

            private Builder() {
            } 

            private Builder(Data model) {
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
                this.warning = model.warning;
            } 

            /**
             * <p>The ID of the Agent to which the Access Token belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-7f3c9a2b</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The name of the Agent to which the Access Token belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-data-agent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The type of the Agent to which the Access Token belongs. Valid values:</p>
             * <ul>
             * <li>HUMAN_BOUND: fully inherits the permissions of the associated user.</li>
             * <li>PERMISSION_NARROW: narrows the permissions based on the associated user\&quot;s permission baseline.</li>
             * <li>AGENT_BOUND: inherits the permissions of the parent Agent.</li>
             * <li>STANDALONE: holds permissions as an independent identity principal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STANDALONE</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The time when the Access Token was created, in the yyyy-MM-dd HH:mm:ss format (UTC+8). This value remains unchanged after the reset.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-13 08:00:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The user ID of the Access Token creator.</p>
             * 
             * <strong>example:</strong>
             * <p>27400000000000001</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The display name of the Access Token creator.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The description of the Access Token. This value remains unchanged after the reset.</p>
             * 
             * <strong>example:</strong>
             * <p>Access token used by the data analysis agent</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time of the Access Token, in the yyyy-MM-dd HH:mm:ss format (UTC+8). If ExpireAfterSeconds is specified, the expiration time is recalculated from the time of the reset. If ExpireAfterSeconds is not specified, the original expiration time is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>2027-05-13 10:20:30</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the reset Access Token. This value remains unchanged after the reset.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the Access Token has been revoked. An Access Token returned after a successful reset is always in the non-revoked state (false).</p>
             */
            public Builder isRevoked(Boolean isRevoked) {
                this.isRevoked = isRevoked;
                return this;
            }

            /**
             * <p>The visible prefix of the Access Token, which is used to identify the Access Token without exposing the full Secret. This value remains unchanged after the reset.</p>
             * 
             * <strong>example:</strong>
             * <p>dms_sk_3f9a</p>
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            /**
             * <p>The time when the Access Token was last used, in the yyyy-MM-dd HH:mm:ss format (UTC+8). This value is empty if the Access Token has never been used.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-13 09:15:00</p>
             */
            public Builder lastUsedTime(String lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>The name of the Access Token. This value remains unchanged after the reset.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-readonly-key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The new plaintext Secret generated by this reset. This value is returned only once in this response and will not be returned by any subsequent operation. Store it securely right away. The old Secret becomes invalid immediately after the reset.</p>
             * 
             * <strong>example:</strong>
             * <p>dms_sk_3f9a1c8e5b7d4062a1f6c9e2b8d05a3f</p>
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>The credential source of the Access Token. The reset operation supports only Access Tokens issued by the console. Therefore, the value is always console.</p>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The reminder information related to this reset, such as a notice that the new Secret is returned only once and must be stored immediately. This value is empty if no reminder exists.</p>
             * 
             * <strong>example:</strong>
             * <p>The new secret is shown only once. Please store it securely now.</p>
             */
            public Builder warning(String warning) {
                this.warning = warning;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
