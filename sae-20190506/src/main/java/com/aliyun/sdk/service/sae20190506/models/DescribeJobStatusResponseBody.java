// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobStatusResponseBody</p>
 */
public class DescribeJobStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeJobStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobStatusResponseBody create() {
        return builder().build();
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: The call was successful.
         * *   **3xx**: The call was redirected.
         * *   **4xx**: The call failed.
         * *   **5xx**: A server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned. Take note of the following rules:
         * <p>
         * 
         * *   **ErrorCode** is not returned if the request succeeds.
         * *   **ErrorCode** is returned if the request fails. For more information, see the "**Error codes**" section in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message. Take note of the following rules:
         * <p>
         * 
         * *   If the call is successful, **success** is returned.
         * *   If the call fails, an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The trace ID that is used to query the details of the request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeJobStatusResponseBody build() {
            return new DescribeJobStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Active")
        private Long active;

        @NameInMap("CompletionTime")
        private Long completionTime;

        @NameInMap("Failed")
        private Long failed;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Succeeded")
        private Long succeeded;

        private Data(Builder builder) {
            this.active = builder.active;
            this.completionTime = builder.completionTime;
            this.failed = builder.failed;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.succeeded = builder.succeeded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Long getActive() {
            return this.active;
        }

        /**
         * @return completionTime
         */
        public Long getCompletionTime() {
            return this.completionTime;
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return succeeded
         */
        public Long getSucceeded() {
            return this.succeeded;
        }

        public static final class Builder {
            private Long active; 
            private Long completionTime; 
            private Long failed; 
            private String jobId; 
            private String message; 
            private Long startTime; 
            private String state; 
            private Long succeeded; 

            /**
             * The number of running instances.
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * The time when the job was executed.
             */
            public Builder completionTime(Long completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * The number of instances that failed to run.
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The returned message. Take note of the following rules:
             * <p>
             * 
             * *   If the call is successful, **success** is returned.
             * *   If the call fails, an error code is returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   **0**: The job is not executed.
             * *   **1**: The job was executed.
             * *   **2**: The job failed to be executed.
             * *   **3**: The job is being executed.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The number of instances that are successfully run.
             */
            public Builder succeeded(Long succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
