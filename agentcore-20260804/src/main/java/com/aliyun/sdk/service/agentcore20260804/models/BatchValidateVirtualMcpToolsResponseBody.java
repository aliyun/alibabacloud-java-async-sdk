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
 * {@link BatchValidateVirtualMcpToolsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchValidateVirtualMcpToolsResponseBody</p>
 */
public class BatchValidateVirtualMcpToolsResponseBody extends TeaModel {
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

    private BatchValidateVirtualMcpToolsResponseBody(Builder builder) {
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

    public static BatchValidateVirtualMcpToolsResponseBody create() {
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

        private Builder(BatchValidateVirtualMcpToolsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The validation result.</p>
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
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchValidateVirtualMcpToolsResponseBody build() {
            return new BatchValidateVirtualMcpToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchValidateVirtualMcpToolsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchValidateVirtualMcpToolsResponseBody</p>
     */
    public static class CurrentDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputSchema")
        private String inputSchema;

        @com.aliyun.core.annotation.NameInMap("outputSchema")
        private String outputSchema;

        @com.aliyun.core.annotation.NameInMap("toolDescription")
        private String toolDescription;

        @com.aliyun.core.annotation.NameInMap("toolName")
        private String toolName;

        private CurrentDefinition(Builder builder) {
            this.inputSchema = builder.inputSchema;
            this.outputSchema = builder.outputSchema;
            this.toolDescription = builder.toolDescription;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentDefinition create() {
            return builder().build();
        }

        /**
         * @return inputSchema
         */
        public String getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return outputSchema
         */
        public String getOutputSchema() {
            return this.outputSchema;
        }

        /**
         * @return toolDescription
         */
        public String getToolDescription() {
            return this.toolDescription;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private String inputSchema; 
            private String outputSchema; 
            private String toolDescription; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(CurrentDefinition model) {
                this.inputSchema = model.inputSchema;
                this.outputSchema = model.outputSchema;
                this.toolDescription = model.toolDescription;
                this.toolName = model.toolName;
            } 

            /**
             * <p>The JSON Schema for input parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{}}</p>
             */
            public Builder inputSchema(String inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * <p>The JSON Schema for output results.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;time&quot;:{&quot;type&quot;:&quot;string&quot;}}}</p>
             */
            public Builder outputSchema(String outputSchema) {
                this.outputSchema = outputSchema;
                return this;
            }

            /**
             * <p>The tool description.</p>
             * 
             * <strong>example:</strong>
             * <p>Get the current time</p>
             */
            public Builder toolDescription(String toolDescription) {
                this.toolDescription = toolDescription;
                return this;
            }

            /**
             * <p>The tool name.</p>
             * 
             * <strong>example:</strong>
             * <p>get-current-time</p>
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public CurrentDefinition build() {
                return new CurrentDefinition(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchValidateVirtualMcpToolsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchValidateVirtualMcpToolsResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentDefinition")
        private CurrentDefinition currentDefinition;

        @com.aliyun.core.annotation.NameInMap("currentDigest")
        private String currentDigest;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("savedDigest")
        private String savedDigest;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Tools(Builder builder) {
            this.currentDefinition = builder.currentDefinition;
            this.currentDigest = builder.currentDigest;
            this.name = builder.name;
            this.savedDigest = builder.savedDigest;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return currentDefinition
         */
        public CurrentDefinition getCurrentDefinition() {
            return this.currentDefinition;
        }

        /**
         * @return currentDigest
         */
        public String getCurrentDigest() {
            return this.currentDigest;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return savedDigest
         */
        public String getSavedDigest() {
            return this.savedDigest;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private CurrentDefinition currentDefinition; 
            private String currentDigest; 
            private String name; 
            private String savedDigest; 
            private String status; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.currentDefinition = model.currentDefinition;
                this.currentDigest = model.currentDigest;
                this.name = model.name;
                this.savedDigest = model.savedDigest;
                this.status = model.status;
            } 

            /**
             * <p>The current definition. This field is not returned if the read operation fails or the tool does not exist.</p>
             */
            public Builder currentDefinition(CurrentDefinition currentDefinition) {
                this.currentDefinition = currentDefinition;
                return this;
            }

            /**
             * <p>The current definition digest.</p>
             * 
             * <strong>example:</strong>
             * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
             */
            public Builder currentDigest(String currentDigest) {
                this.currentDigest = currentDigest;
                return this;
            }

            /**
             * <p>The source tool name.</p>
             * 
             * <strong>example:</strong>
             * <p>get-current-time</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The digest saved at the time of selection.</p>
             * 
             * <strong>example:</strong>
             * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
             */
            public Builder savedDigest(String savedDigest) {
                this.savedDigest = savedDigest;
                return this;
            }

            /**
             * <p>The tool status. Valid values: UNCHANGED, CHANGED, REMOVED, and UNKNOWN.</p>
             * 
             * <strong>example:</strong>
             * <p>UNCHANGED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchValidateVirtualMcpToolsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchValidateVirtualMcpToolsResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("affectedVirtualMcps")
        private java.util.List<String> affectedVirtualMcps;

        @com.aliyun.core.annotation.NameInMap("checkedAt")
        private String checkedAt;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("reasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private Sources(Builder builder) {
            this.affectedVirtualMcps = builder.affectedVirtualMcps;
            this.checkedAt = builder.checkedAt;
            this.mcpServerId = builder.mcpServerId;
            this.reasonCode = builder.reasonCode;
            this.status = builder.status;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return affectedVirtualMcps
         */
        public java.util.List<String> getAffectedVirtualMcps() {
            return this.affectedVirtualMcps;
        }

        /**
         * @return checkedAt
         */
        public String getCheckedAt() {
            return this.checkedAt;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private java.util.List<String> affectedVirtualMcps; 
            private String checkedAt; 
            private String mcpServerId; 
            private String reasonCode; 
            private String status; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.affectedVirtualMcps = model.affectedVirtualMcps;
                this.checkedAt = model.checkedAt;
                this.mcpServerId = model.mcpServerId;
                this.reasonCode = model.reasonCode;
                this.status = model.status;
                this.tools = model.tools;
            } 

            /**
             * <p>The virtual MCP IDs that reference this source. This field is for display purposes only.</p>
             */
            public Builder affectedVirtualMcps(java.util.List<String> affectedVirtualMcps) {
                this.affectedVirtualMcps = affectedVirtualMcps;
                return this;
            }

            /**
             * <p>The source check time in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-25T10:00:03Z</p>
             */
            public Builder checkedAt(String checkedAt) {
                this.checkedAt = checkedAt;
                return this;
            }

            /**
             * <p>The source MCP ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-server-source-1</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>The reason code for an unreadable source. Read failures are not treated as tool deletions.</p>
             * 
             * <strong>example:</strong>
             * <p>SourceUnavailable</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The source read status. Valid values: AVAILABLE and UNKNOWN.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The validation results of the selected tools.</p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchValidateVirtualMcpToolsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchValidateVirtualMcpToolsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkedRevision")
        private Long checkedRevision;

        @com.aliyun.core.annotation.NameInMap("sources")
        private java.util.List<Sources> sources;

        @com.aliyun.core.annotation.NameInMap("virtualMcpServerId")
        private String virtualMcpServerId;

        private Items(Builder builder) {
            this.checkedRevision = builder.checkedRevision;
            this.sources = builder.sources;
            this.virtualMcpServerId = builder.virtualMcpServerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return checkedRevision
         */
        public Long getCheckedRevision() {
            return this.checkedRevision;
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        /**
         * @return virtualMcpServerId
         */
        public String getVirtualMcpServerId() {
            return this.virtualMcpServerId;
        }

        public static final class Builder {
            private Long checkedRevision; 
            private java.util.List<Sources> sources; 
            private String virtualMcpServerId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.checkedRevision = model.checkedRevision;
                this.sources = model.sources;
                this.virtualMcpServerId = model.virtualMcpServerId;
            } 

            /**
             * <p>The revision number for this check.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder checkedRevision(Long checkedRevision) {
                this.checkedRevision = checkedRevision;
                return this;
            }

            /**
             * <p>The results returned by source.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The checked virtual MCP ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-server-virtual-1</p>
             */
            public Builder virtualMcpServerId(String virtualMcpServerId) {
                this.virtualMcpServerId = virtualMcpServerId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchValidateVirtualMcpToolsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchValidateVirtualMcpToolsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("failureCode")
        private String failureCode;

        @com.aliyun.core.annotation.NameInMap("failureMessage")
        private String failureMessage;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("validationId")
        private String validationId;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.failureCode = builder.failureCode;
            this.failureMessage = builder.failureMessage;
            this.finishedAt = builder.finishedAt;
            this.items = builder.items;
            this.status = builder.status;
            this.validationId = builder.validationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return failureCode
         */
        public String getFailureCode() {
            return this.failureCode;
        }

        /**
         * @return failureMessage
         */
        public String getFailureMessage() {
            return this.failureMessage;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validationId
         */
        public String getValidationId() {
            return this.validationId;
        }

        public static final class Builder {
            private String createdAt; 
            private String failureCode; 
            private String failureMessage; 
            private String finishedAt; 
            private java.util.List<Items> items; 
            private String status; 
            private String validationId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.failureCode = model.failureCode;
                this.failureMessage = model.failureMessage;
                this.finishedAt = model.finishedAt;
                this.items = model.items;
                this.status = model.status;
                this.validationId = model.validationId;
            } 

            /**
             * <p>The validation submission time in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-25T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Returned only when the status is FAILED. Workspace.NotFound indicates that the workspace no longer exists during execution. ValidationFailed indicates a task execution exception. Source MCP read failures are returned through items.sources.reasonCode, and the corresponding task status is PARTIAL_FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>ValidationFailed</p>
             */
            public Builder failureCode(String failureCode) {
                this.failureCode = failureCode;
                return this;
            }

            /**
             * <p>The secure reason description returned only when the status is FAILED. It does not contain internal exceptions, credentials, or upstream raw responses. When querying a failed task, the API operation itself still succeeds. You must read data.status and this field.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed to validate virtual MCP tools.</p>
             */
            public Builder failureMessage(String failureMessage) {
                this.failureMessage = failureMessage;
                return this;
            }

            /**
             * <p>The validation completion time in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-25T10:00:05Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The itemized validation report. Tool selections are not modified.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The validation status. Valid values: PENDING, RUNNING, COMPLETED, PARTIAL_FAILED, and FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The validation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>val-1234567890</p>
             */
            public Builder validationId(String validationId) {
                this.validationId = validationId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
