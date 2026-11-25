// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetModelGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelGroupResponseBody</p>
 */
public class GetModelGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetModelGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelGroupResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetModelGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetModelGroupResponseBody build() {
            return new GetModelGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelGroupResponseBody</p>
     */
    public static class ConfigurationDeployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("revision")
        private Long revision;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private ConfigurationDeployment(Builder builder) {
            this.operationId = builder.operationId;
            this.revision = builder.revision;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationDeployment create() {
            return builder().build();
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return revision
         */
        public Long getRevision() {
            return this.revision;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String operationId; 
            private Long revision; 
            private String status; 

            private Builder() {
            } 

            private Builder(ConfigurationDeployment model) {
                this.operationId = model.operationId;
                this.revision = model.revision;
                this.status = model.status;
            } 

            /**
             * <p>The operation ID of the group configuration task, which is used for tracking only. It cannot be used for GetLogicalModelDeployment or RetryLogicalModelDeployment.</p>
             * 
             * <strong>example:</strong>
             * <p>op-xxxxxxxx</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The model group version corresponding to the task, which may be earlier than the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder revision(Long revision) {
                this.revision = revision;
                return this;
            }

            /**
             * <p>The configuration deployment status. Valid values: Pending, Running, Succeeded, Failed, and PartiallyFailed.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ConfigurationDeployment build() {
                return new ConfigurationDeployment(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelGroupResponseBody</p>
     */
    public static class EntitlementState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appliedRevision")
        private Long appliedRevision;

        @com.aliyun.core.annotation.NameInMap("desiredRevision")
        private Long desiredRevision;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private EntitlementState(Builder builder) {
            this.appliedRevision = builder.appliedRevision;
            this.desiredRevision = builder.desiredRevision;
            this.errorMessage = builder.errorMessage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntitlementState create() {
            return builder().build();
        }

        /**
         * @return appliedRevision
         */
        public Long getAppliedRevision() {
            return this.appliedRevision;
        }

        /**
         * @return desiredRevision
         */
        public Long getDesiredRevision() {
            return this.desiredRevision;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long appliedRevision; 
            private Long desiredRevision; 
            private String errorMessage; 
            private String status; 

            private Builder() {
            } 

            private Builder(EntitlementState model) {
                this.appliedRevision = model.appliedRevision;
                this.desiredRevision = model.desiredRevision;
                this.errorMessage = model.errorMessage;
                this.status = model.status;
            } 

            /**
             * <p>The applied entitlement revision.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appliedRevision(Long appliedRevision) {
                this.appliedRevision = appliedRevision;
                return this;
            }

            /**
             * <p>The desired entitlement revision.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desiredRevision(Long desiredRevision) {
                this.desiredRevision = desiredRevision;
                return this;
            }

            /**
             * <p>The error message when entitlement fails. This field is not returned when no error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>Entitlement synchronization failed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The entitlement status. Valid values: Pending, Applying, Committed, and Failed. Committed indicates only that the control plane has successfully submitted and read back the status, and does not mean that all nodes have acknowledged it.</p>
             * 
             * <strong>example:</strong>
             * <p>Committed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EntitlementState build() {
                return new EntitlementState(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configurationDeployment")
        private ConfigurationDeployment configurationDeployment;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("entitlementState")
        private EntitlementState entitlementState;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("modelCardIds")
        private java.util.List<String> modelCardIds;

        @com.aliyun.core.annotation.NameInMap("modelGroupId")
        private String modelGroupId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private Data(Builder builder) {
            this.configurationDeployment = builder.configurationDeployment;
            this.description = builder.description;
            this.entitlementState = builder.entitlementState;
            this.gatewayId = builder.gatewayId;
            this.modelCardIds = builder.modelCardIds;
            this.modelGroupId = builder.modelGroupId;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configurationDeployment
         */
        public ConfigurationDeployment getConfigurationDeployment() {
            return this.configurationDeployment;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entitlementState
         */
        public EntitlementState getEntitlementState() {
            return this.entitlementState;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return modelCardIds
         */
        public java.util.List<String> getModelCardIds() {
            return this.modelCardIds;
        }

        /**
         * @return modelGroupId
         */
        public String getModelGroupId() {
            return this.modelGroupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private ConfigurationDeployment configurationDeployment; 
            private String description; 
            private EntitlementState entitlementState; 
            private String gatewayId; 
            private java.util.List<String> modelCardIds; 
            private String modelGroupId; 
            private String name; 
            private String updateTime; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configurationDeployment = model.configurationDeployment;
                this.description = model.description;
                this.entitlementState = model.entitlementState;
                this.gatewayId = model.gatewayId;
                this.modelCardIds = model.modelCardIds;
                this.modelGroupId = model.modelGroupId;
                this.name = model.name;
                this.updateTime = model.updateTime;
                this.version = model.version;
            } 

            /**
             * <p>The summary of the latest group configuration deployment, which is independent of API publishing and entitlement status. This field is not returned when no deployment task exists, and its presence does not indicate success. It represents the current version only when the revision matches the current version. List operations do not guarantee that this field is populated.</p>
             */
            public Builder configurationDeployment(ConfigurationDeployment configurationDeployment) {
                this.configurationDeployment = configurationDeployment;
                return this;
            }

            /**
             * <p>The description of the model group.</p>
             * 
             * <strong>example:</strong>
             * <p>A model group for conversational scenarios</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The entitlement status information.</p>
             */
            public Builder entitlementState(EntitlementState entitlementState) {
                this.entitlementState = entitlementState;
                return this;
            }

            /**
             * <p>The ID of the gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxxxxxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The list of model card IDs included in the model group.</p>
             */
            public Builder modelCardIds(java.util.List<String> modelCardIds) {
                this.modelCardIds = modelCardIds;
                return this;
            }

            /**
             * <p>The ID of the model group.</p>
             * 
             * <strong>example:</strong>
             * <p>mg-xxxxxxxx</p>
             */
            public Builder modelGroupId(String modelGroupId) {
                this.modelGroupId = modelGroupId;
                return this;
            }

            /**
             * <p>The name of the model group.</p>
             * 
             * <strong>example:</strong>
             * <p>chat-group</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The last update time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-15T10:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version number of the model group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
