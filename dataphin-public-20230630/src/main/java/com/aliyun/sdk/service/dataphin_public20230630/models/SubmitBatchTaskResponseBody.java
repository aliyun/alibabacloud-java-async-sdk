// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link SubmitBatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitBatchTaskResponseBody</p>
 */
public class SubmitBatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubmitResult")
    private SubmitResult submitResult;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SubmitBatchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.submitResult = builder.submitResult;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitBatchTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return submitResult
     */
    public SubmitResult getSubmitResult() {
        return this.submitResult;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private SubmitResult submitResult; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubmitResult.
         */
        public Builder submitResult(SubmitResult submitResult) {
            this.submitResult = submitResult;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SubmitBatchTaskResponseBody build() {
            return new SubmitBatchTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitBatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitBatchTaskResponseBody</p>
     */
    public static class SubmitResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("SubmitId")
        private Long submitId;

        private SubmitResult(Builder builder) {
            this.nodeId = builder.nodeId;
            this.submitId = builder.submitId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitResult create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return submitId
         */
        public Long getSubmitId() {
            return this.submitId;
        }

        public static final class Builder {
            private String nodeId; 
            private Long submitId; 

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * SubmitId.
             */
            public Builder submitId(Long submitId) {
                this.submitId = submitId;
                return this;
            }

            public SubmitResult build() {
                return new SubmitResult(this);
            } 

        } 

    }
}
