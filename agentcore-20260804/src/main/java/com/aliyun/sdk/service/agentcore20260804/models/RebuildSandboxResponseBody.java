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
 * {@link RebuildSandboxResponseBody} extends {@link TeaModel}
 *
 * <p>RebuildSandboxResponseBody</p>
 */
public class RebuildSandboxResponseBody extends TeaModel {
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

    private RebuildSandboxResponseBody(Builder builder) {
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

    public static RebuildSandboxResponseBody create() {
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

        private Builder(RebuildSandboxResponseBody model) {
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
         * <p>The acceptance result of the rebuild request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The result description of the API request. This does not indicate that the asynchronous rebuild task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the request ID to locate the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1BE93-46A7-1A2A-BD62-159FCDAA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. A value of true does not indicate that the sandbox rebuild is complete.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RebuildSandboxResponseBody build() {
            return new RebuildSandboxResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RebuildSandboxResponseBody} extends {@link TeaModel}
     *
     * <p>RebuildSandboxResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("incarnation")
        private Long incarnation;

        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("sandboxId")
        private String sandboxId;

        private Data(Builder builder) {
            this.incarnation = builder.incarnation;
            this.operationId = builder.operationId;
            this.sandboxId = builder.sandboxId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return incarnation
         */
        public Long getIncarnation() {
            return this.incarnation;
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

        public static final class Builder {
            private Long incarnation; 
            private String operationId; 
            private String sandboxId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.incarnation = model.incarnation;
                this.operationId = model.operationId;
                this.sandboxId = model.sandboxId;
            } 

            /**
             * <p>The target instance incarnation for this rebuild. A rebuild increases the incarnation. The returned value only indicates that the request is accepted and does not indicate that the new instance is ready.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder incarnation(Long incarnation) {
                this.incarnation = incarnation;
                return this;
            }

            /**
             * <p>The ID of the initial rebuild task. Use the operationId returned by RebuildSandbox. Always use this ID to query the overall result. You do not need to use the IDs of subsequently created tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>01a1be92-7fa4-76b2-a871-b376d6d0****</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The logical sandbox ID that corresponds to this rebuild. The logical ID remains unchanged after the rebuild.</p>
             * 
             * <strong>example:</strong>
             * <p>01a1b56a-b00f-7aa3-bacf-cc9d04b0****</p>
             */
            public Builder sandboxId(String sandboxId) {
                this.sandboxId = sandboxId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
