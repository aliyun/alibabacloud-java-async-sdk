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
 * {@link GetMemoryStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryStoreResponseBody</p>
 */
public class GetMemoryStoreResponseBody extends TeaModel {
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

    private GetMemoryStoreResponseBody(Builder builder) {
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

    public static GetMemoryStoreResponseBody create() {
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

        private Builder(GetMemoryStoreResponseBody model) {
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
         * <p>The MemoryStore details.</p>
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
         * <p>01A00000-0000-0000-0000-000000000001</p>
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

        public GetMemoryStoreResponseBody build() {
            return new GetMemoryStoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryStoreResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("extractInstructions")
        private String extractInstructions;

        @com.aliyun.core.annotation.NameInMap("memoryStoreId")
        private String memoryStoreId;

        @com.aliyun.core.annotation.NameInMap("memoryStoreName")
        private String memoryStoreName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.extractInstructions = builder.extractInstructions;
            this.memoryStoreId = builder.memoryStoreId;
            this.memoryStoreName = builder.memoryStoreName;
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
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extractInstructions
         */
        public String getExtractInstructions() {
            return this.extractInstructions;
        }

        /**
         * @return memoryStoreId
         */
        public String getMemoryStoreId() {
            return this.memoryStoreId;
        }

        /**
         * @return memoryStoreName
         */
        public String getMemoryStoreName() {
            return this.memoryStoreName;
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
            private String createdAt; 
            private String description; 
            private String extractInstructions; 
            private String memoryStoreId; 
            private String memoryStoreName; 
            private String status; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.extractInstructions = model.extractInstructions;
                this.memoryStoreId = model.memoryStoreId;
                this.memoryStoreName = model.memoryStoreName;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The MemoryStore description.</p>
             * 
             * <strong>example:</strong>
             * <p>Used to store long-term user preferences</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The custom extraction instructions.</p>
             * 
             * <strong>example:</strong>
             * <p>Extract only long-term preferences explicitly expressed by the user</p>
             */
            public Builder extractInstructions(String extractInstructions) {
                this.extractInstructions = extractInstructions;
                return this;
            }

            /**
             * <p>The MemoryStore ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ms-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryStoreId(String memoryStoreId) {
                this.memoryStoreId = memoryStoreId;
                return this;
            }

            /**
             * <p>The MemoryStore name. It cannot be modified after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>customer-memory</p>
             */
            public Builder memoryStoreName(String memoryStoreName) {
                this.memoryStoreName = memoryStoreName;
                return this;
            }

            /**
             * <p>The lifecycle state of the MemoryStore.</p>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last updated time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The AgentCore workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-2f5f9c5a8d0e4c3b</p>
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
