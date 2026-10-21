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
 * {@link GetAgenticAgentByInstallTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgenticAgentByInstallTokenResponseBody</p>
 */
public class GetAgenticAgentByInstallTokenResponseBody extends TeaModel {
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

    private GetAgenticAgentByInstallTokenResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgenticAgentByInstallTokenResponseBody create() {
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

        private Builder(GetAgenticAgentByInstallTokenResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The agent information associated with the install token after redemption. This parameter is empty if the token has not been redeemed, or if the associated credential or agent does not exist.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the request fails. Programs use this code to determine the failure type. This parameter is empty when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTALL_TOKEN_INVALID</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the request fails. This message helps with manual troubleshooting. This parameter is empty when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>install_token not found</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The unique identifier of the request, used for troubleshooting and log correlation.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6C-2C4DD51BD5E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. A value of true indicates that the query succeeded. A value of false indicates that the query failed. In this case, you can use ErrorCode and ErrorMessage to identify the cause.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgenticAgentByInstallTokenResponseBody build() {
            return new GetAgenticAgentByInstallTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgenticAgentByInstallTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgenticAgentByInstallTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveApiKeyPrefixes")
        private java.util.List<String> activeApiKeyPrefixes;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

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
            this.activeApiKeyPrefixes = builder.activeApiKeyPrefixes;
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.agentType = builder.agentType;
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
         * @return activeApiKeyPrefixes
         */
        public java.util.List<String> getActiveApiKeyPrefixes() {
            return this.activeApiKeyPrefixes;
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
            private java.util.List<String> activeApiKeyPrefixes; 
            private String agentId; 
            private String agentName; 
            private String agentType; 
            private String createdAt; 
            private String creationType; 
            private String description; 
            private String ownerId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeApiKeyPrefixes = model.activeApiKeyPrefixes;
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.agentType = model.agentType;
                this.createdAt = model.createdAt;
                this.creationType = model.creationType;
                this.description = model.description;
                this.ownerId = model.ownerId;
                this.status = model.status;
            } 

            /**
             * <p>The prefix list of visible access tokens that are neither revoked nor expired under the agent. This parameter is empty if no access tokens are returned or no access tokens meet the conditional criteria. The prefix is used only to identify the credential and does not contain the complete secret.</p>
             */
            public Builder activeApiKeyPrefixes(java.util.List<String> activeApiKeyPrefixes) {
                this.activeApiKeyPrefixes = activeApiKeyPrefixes;
                return this;
            }

            /**
             * <p>The unique identifier of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-7f3c9a2b</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The name of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>my-data-agent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The permission type of the agent. Valid values: HUMAN_BOUND (inherits user permissions), PERMISSION_NARROW (narrowed down from user permissions), and STANDALONE (independent permissions). The agent generated through the install token redemption process is of the HUMAN_BOUND type.</p>
             * 
             * <strong>example:</strong>
             * <p>HUMAN_BOUND</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The creation time of the agent, in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-13 10:30:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The creation method of the agent. A value of auto indicates automatic creation by the system, and a value of manual indicates manual creation by a user. The agent generated through the install token redemption process is auto.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>The description of the agent. This parameter is empty if it is not set.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent for data analytics</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the user to whom the agent belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>27400000000000001</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The status of the agent. A value of active indicates that the agent is enabled, and a value of disabled indicates that the agent is disabled.</p>
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
