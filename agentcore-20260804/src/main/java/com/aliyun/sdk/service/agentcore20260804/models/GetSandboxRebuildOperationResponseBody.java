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
 * {@link GetSandboxRebuildOperationResponseBody} extends {@link TeaModel}
 *
 * <p>GetSandboxRebuildOperationResponseBody</p>
 */
public class GetSandboxRebuildOperationResponseBody extends TeaModel {
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

    private GetSandboxRebuildOperationResponseBody(Builder builder) {
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

    public static GetSandboxRebuildOperationResponseBody create() {
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

        private Builder(GetSandboxRebuildOperationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Task result code of the API request. A successful request returns SUCCESS. Query task result of the asynchronous task separately.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The overall result of the rebuild task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code corresponding to the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The result description of the API request. This does not indicate that the asynchronous rebuild task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1BE93-46A7-1A2A-BD62-159FCDAA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. A value of true does not indicate that the sandbox rebuild is completed.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSandboxRebuildOperationResponseBody build() {
            return new GetSandboxRebuildOperationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSandboxRebuildOperationResponseBody} extends {@link TeaModel}
     *
     * <p>GetSandboxRebuildOperationResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The task error code, which is used to distinguish between rebuild failures, subsequent instance creation failures, cancellations, or supersessions.</p>
             * 
             * <strong>example:</strong>
             * <p>SandboxRebuild.Failed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The task error description that can be publicly displayed. Keep the task ID for troubleshooting.</p>
             * 
             * <strong>example:</strong>
             * <p>The Sandbox rebuild did not complete. Contact support with the operation ID.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSandboxRebuildOperationResponseBody} extends {@link TeaModel}
     *
     * <p>GetSandboxRebuildOperationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("sandboxId")
        private String sandboxId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.error = builder.error;
            this.operationId = builder.operationId;
            this.sandboxId = builder.sandboxId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return sandboxId
         */
        public String getSandboxId() {
            return this.sandboxId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Error error; 
            private String operationId; 
            private String sandboxId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.error = model.error;
                this.operationId = model.operationId;
                this.sandboxId = model.sandboxId;
                this.status = model.status;
            } 

            /**
             * <p>The task error that can be publicly displayed. This is returned upon task failure, cancellation, or override by subsequent operations. This field can be empty in other states.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The initial rebuild task ID. Use the operationId returned by RebuildSandbox. Always use this ID to query the overall result. You do not need to switch to the ID of a subsequent creation task.</p>
             * 
             * <strong>example:</strong>
             * <p>01a1be92-7fa4-76b2-a871-b376d6d0****</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The logical sandbox ID corresponding to the rebuild. The logical ID remains unchanged after the rebuild.</p>
             * 
             * <strong>example:</strong>
             * <p>01a1b56a-b00f-7aa3-bacf-cc9d04b0****</p>
             */
            public Builder sandboxId(String sandboxId) {
                this.sandboxId = sandboxId;
                return this;
            }

            /**
             * <p>The overall rebuild status. Valid values: PENDING: waiting to be processed. RUNNING: execute. SUCCEEDED: overall success. FAILED: failed. CANCELED: canceled. SUPERSEDED: override by subsequent operations. UNKNOWN: unconfirmed. Only SUCCEEDED indicates completion. Do not treat UNKNOWN, missing status, or query exceptions as success, and do not automatically resubmit the rebuild.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
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
