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
 * {@link CreateAgentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgentVersionResponseBody</p>
 */
public class CreateAgentVersionResponseBody extends TeaModel {
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

    private CreateAgentVersionResponseBody(Builder builder) {
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

    public static CreateAgentVersionResponseBody create() {
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

        private Builder(CreateAgentVersionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. The value is SUCCESS if the request is successful, or an error code if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the saved fixed agent version. If a duplicate submission matches an existing version, the existing version is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message. The value is success if the request is successful, or an error message if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAgentVersionResponseBody build() {
            return new CreateAgentVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentVersionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("artifactStatus")
        private String artifactStatus;

        @com.aliyun.core.annotation.NameInMap("configuration")
        private java.util.Map<String, ?> configuration;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("targetSpecVersion")
        private Long targetSpecVersion;

        @com.aliyun.core.annotation.NameInMap("versionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentVersion = builder.agentVersion;
            this.artifactStatus = builder.artifactStatus;
            this.configuration = builder.configuration;
            this.createdAt = builder.createdAt;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.targetSpecVersion = builder.targetSpecVersion;
            this.versionName = builder.versionName;
            this.workspaceId = builder.workspaceId;
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
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return artifactStatus
         */
        public String getArtifactStatus() {
            return this.artifactStatus;
        }

        /**
         * @return configuration
         */
        public java.util.Map<String, ?> getConfiguration() {
            return this.configuration;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return targetSpecVersion
         */
        public Long getTargetSpecVersion() {
            return this.targetSpecVersion;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentVersion; 
            private String artifactStatus; 
            private java.util.Map<String, ?> configuration; 
            private String createdAt; 
            private String createdBy; 
            private String description; 
            private Long targetSpecVersion; 
            private String versionName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentVersion = model.agentVersion;
                this.artifactStatus = model.artifactStatus;
                this.configuration = model.configuration;
                this.createdAt = model.createdAt;
                this.createdBy = model.createdBy;
                this.description = model.description;
                this.targetSpecVersion = model.targetSpecVersion;
                this.versionName = model.versionName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The ID of the managed or custom agent to which the version belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-0123456789abcdef0123456789abcdef</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The version number generated by the system in an incrementing manner for the agent, such as v1 and v2. It is used for querying, deleting, and referencing versions in service endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>Indicates only whether the version template and artifact archiving is complete, and does not represent the deployment or running status. Valid values:</p>
             * <ul>
             * <li>READY: Complete.</li>
             * <li>INVALID: Archiving is missing or inconsistent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder artifactStatus(String artifactStatus) {
                this.artifactStatus = artifactStatus;
                return this;
            }

            /**
             * <p>For a managed agent, the structure is consistent with the data structure of GetManagedAgent. For a custom agent, the structure is consistent with the data structure of GetCustomAgent. The data masking rules are the same.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;agentId&quot;:&quot;agent-0123456789abcdef0123456789abcdef&quot;,&quot;workspaceId&quot;:&quot;ws-0123456789abcdef01234&quot;,&quot;name&quot;:&quot;customer-service&quot;,&quot;description&quot;:&quot;Customer service agent&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;latestSpecVersion&quot;:2,&quot;instruction&quot;:&quot;You are a customer service assistant.&quot;}</p>
             */
            public Builder configuration(java.util.Map<String, ?> configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The time when the version was saved, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T01:02:03Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account of the caller who saved the version. If a RAM user calls the operation, this value is the UID of the Alibaba Cloud primary account to which the RAM user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The version description provided when the version is saved. It can be up to 1,024 characters in length. If no description is provided during saving, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>Stable version for the production environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The effective release serial number of the agent when the version is saved, which is the effectiveSpecVersion at that time. This value does not change after the version is saved.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder targetSpecVersion(Long targetSpecVersion) {
                this.targetSpecVersion = targetSpecVersion;
                return this;
            }

            /**
             * <p>The display name specified by the user when the version is saved. For versions saved earlier without a recorded name, the agentVersion is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Production stable version V1.0</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * <p>The ID of the AgentCore workspace where the agent to which the version belongs resides.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-0123456789abcdef01234</p>
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
