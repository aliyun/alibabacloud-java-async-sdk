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
 * {@link GetOperationSubmitStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationSubmitStatusResponseBody</p>
 */
public class GetOperationSubmitStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OperationSubmitJob")
    private OperationSubmitJob operationSubmitJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOperationSubmitStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.operationSubmitJob = builder.operationSubmitJob;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationSubmitStatusResponseBody create() {
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
     * @return operationSubmitJob
     */
    public OperationSubmitJob getOperationSubmitJob() {
        return this.operationSubmitJob;
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
        private Integer httpStatusCode; 
        private String message; 
        private OperationSubmitJob operationSubmitJob; 
        private String requestId; 
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
         * OperationSubmitJob.
         */
        public Builder operationSubmitJob(OperationSubmitJob operationSubmitJob) {
            this.operationSubmitJob = operationSubmitJob;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOperationSubmitStatusResponseBody build() {
            return new GetOperationSubmitStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOperationSubmitStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetOperationSubmitStatusResponseBody</p>
     */
    public static class OperationSubmitJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalBizId")
        private String externalBizId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("OperationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        private OperationSubmitJob(Builder builder) {
            this.externalBizId = builder.externalBizId;
            this.jobId = builder.jobId;
            this.operation = builder.operation;
            this.operationStatus = builder.operationStatus;
            this.operator = builder.operator;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationSubmitJob create() {
            return builder().build();
        }

        /**
         * @return externalBizId
         */
        public String getExternalBizId() {
            return this.externalBizId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String externalBizId; 
            private String jobId; 
            private String operation; 
            private String operationStatus; 
            private String operator; 
            private String progress; 

            /**
             * ExternalBizId.
             */
            public Builder externalBizId(String externalBizId) {
                this.externalBizId = externalBizId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * OperationStatus.
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public OperationSubmitJob build() {
                return new OperationSubmitJob(this);
            } 

        } 

    }
}
