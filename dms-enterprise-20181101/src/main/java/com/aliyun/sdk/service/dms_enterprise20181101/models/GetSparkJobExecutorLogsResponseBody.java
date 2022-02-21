// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkJobExecutorLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkJobExecutorLogsResponseBody</p>
 */
public class GetSparkJobExecutorLogsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("ExecutorLogs")
    private ExecutorLogs executorLogs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSparkJobExecutorLogsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.executorLogs = builder.executorLogs;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkJobExecutorLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return executorLogs
     */
    public ExecutorLogs getExecutorLogs() {
        return this.executorLogs;
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
        private String errorCode; 
        private String errorMessage; 
        private ExecutorLogs executorLogs; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * log of the spark job
         */
        public Builder executorLogs(ExecutorLogs executorLogs) {
            this.executorLogs = executorLogs;
            return this;
        }

        /**
         * Id of the request
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

        public GetSparkJobExecutorLogsResponseBody build() {
            return new GetSparkJobExecutorLogsResponseBody(this);
        } 

    } 

    public static class ExecutorLogs extends TeaModel {
        @NameInMap("executorLogs")
        private java.util.List < String > executorLogs;

        private ExecutorLogs(Builder builder) {
            this.executorLogs = builder.executorLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutorLogs create() {
            return builder().build();
        }

        /**
         * @return executorLogs
         */
        public java.util.List < String > getExecutorLogs() {
            return this.executorLogs;
        }

        public static final class Builder {
            private java.util.List < String > executorLogs; 

            /**
             * executorLogs.
             */
            public Builder executorLogs(java.util.List < String > executorLogs) {
                this.executorLogs = executorLogs;
                return this;
            }

            public ExecutorLogs build() {
                return new ExecutorLogs(this);
            } 

        } 

    }
}
