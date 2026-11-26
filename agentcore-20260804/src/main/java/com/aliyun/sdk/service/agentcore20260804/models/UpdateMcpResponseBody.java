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
 * {@link UpdateMcpResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMcpResponseBody</p>
 */
public class UpdateMcpResponseBody extends TeaModel {
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

    private UpdateMcpResponseBody(Builder builder) {
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

    public static UpdateMcpResponseBody create() {
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

        private Builder(UpdateMcpResponseBody model) {
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
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>For the VIRTUAL type, the update status, revision number, and publish task ID are returned. For a standard MCP, the original empty data response is retained.</p>
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
         * <p>Request processed successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
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

        public UpdateMcpResponseBody build() {
            return new UpdateMcpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMcpResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMcpResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appliedRevision")
        private Long appliedRevision;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("operationTaskId")
        private String operationTaskId;

        @com.aliyun.core.annotation.NameInMap("revision")
        private Long revision;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.appliedRevision = builder.appliedRevision;
            this.mcpServerId = builder.mcpServerId;
            this.operationTaskId = builder.operationTaskId;
            this.revision = builder.revision;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appliedRevision
         */
        public Long getAppliedRevision() {
            return this.appliedRevision;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return operationTaskId
         */
        public String getOperationTaskId() {
            return this.operationTaskId;
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
            private Long appliedRevision; 
            private String mcpServerId; 
            private String operationTaskId; 
            private Long revision; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appliedRevision = model.appliedRevision;
                this.mcpServerId = model.mcpServerId;
                this.operationTaskId = model.operationTaskId;
                this.revision = model.revision;
                this.status = model.status;
            } 

            /**
             * <p>The currently applied revision number of the virtual MCP.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appliedRevision(Long appliedRevision) {
                this.appliedRevision = appliedRevision;
                return this;
            }

            /**
             * <p>The ID of the MCP service updated in this request.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-server-virtual-1</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>The ID of the most recent publish task for the virtual MCP.</p>
             * 
             * <strong>example:</strong>
             * <p>task-1234567890</p>
             */
            public Builder operationTaskId(String operationTaskId) {
                this.operationTaskId = operationTaskId;
                return this;
            }

            /**
             * <p>The target revision number of the virtual MCP.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder revision(Long revision) {
                this.revision = revision;
                return this;
            }

            /**
             * <p>The resource status after the update is accepted. The UPDATING status does not indicate that the update has taken effect.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATING</p>
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
