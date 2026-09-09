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
 * {@link DeleteExternalAgentResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteExternalAgentResponseBody</p>
 */
public class DeleteExternalAgentResponseBody extends TeaModel {
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

    private DeleteExternalAgentResponseBody(Builder builder) {
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

    public static DeleteExternalAgentResponseBody create() {
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

        private Builder(DeleteExternalAgentResponseBody model) {
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
         * <p>The summary information of the external agent after deletion.</p>
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
         * <p>The result message of the request.</p>
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
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
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

        public DeleteExternalAgentResponseBody build() {
            return new DeleteExternalAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteExternalAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("createMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("effectiveSpecVersion")
        private Long effectiveSpecVersion;

        @com.aliyun.core.annotation.NameInMap("latestSpecVersion")
        private Long latestSpecVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.createMode = builder.createMode;
            this.createdAt = builder.createdAt;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.effectiveSpecVersion = builder.effectiveSpecVersion;
            this.latestSpecVersion = builder.latestSpecVersion;
            this.name = builder.name;
            this.runtime = builder.runtime;
            this.status = builder.status;
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
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveSpecVersion
         */
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        /**
         * @return latestSpecVersion
         */
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String agentId; 
            private String createMode; 
            private String createdAt; 
            private String deployType; 
            private String description; 
            private Long effectiveSpecVersion; 
            private Long latestSpecVersion; 
            private String name; 
            private String runtime; 
            private String status; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.createMode = model.createMode;
                this.createdAt = model.createdAt;
                this.deployType = model.deployType;
                this.description = model.description;
                this.effectiveSpecVersion = model.effectiveSpecVersion;
                this.latestSpecVersion = model.latestSpecVersion;
                this.name = model.name;
                this.runtime = model.runtime;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The external agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The creation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * <p>The creation time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The deployment type.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF_HOSTED</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The description of the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>A code review agent running in the user environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The currently effective specification version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder effectiveSpecVersion(Long effectiveSpecVersion) {
                this.effectiveSpecVersion = effectiveSpecVersion;
                return this;
            }

            /**
             * <p>The latest specification version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestSpecVersion(Long latestSpecVersion) {
                this.latestSpecVersion = latestSpecVersion;
                return this;
            }

            /**
             * <p>The name of the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>my-external-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The runtime type reported by the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>qwenpaw</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The status of the external agent. Valid values:</p>
             * <ul>
             * <li>Creating: The agent is being created.</li>
             * <li>Running: The agent is running.</li>
             * <li>Failed: The agent has failed.</li>
             * <li>Updating: The agent is being updated.</li>
             * <li>Deleting: The agent is being deleted.</li>
             * <li>Deleted: The agent has been deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
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
