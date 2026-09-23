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

        private Builder() {
        } 

        private Builder(SubmitBatchTaskResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.submitResult = model.submitResult;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The submit result.</p>
         */
        public Builder submitResult(SubmitResult submitResult) {
            this.submitResult = submitResult;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
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

            private Builder() {
            } 

            private Builder(SubmitResult model) {
                this.nodeId = model.nodeId;
                this.submitId = model.submitId;
            } 

            /**
             * <p>The ID of the scheduling node.</p>
             * 
             * <strong>example:</strong>
             * <p>n_12113111</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the object pending publish.</p>
             * 
             * <strong>example:</strong>
             * <p>1010312911</p>
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
