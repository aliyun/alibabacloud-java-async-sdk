// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobStatusResponseBody</p>
 */
public class DescribeJobStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
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

        private Builder() {
        } 

        private Builder(DescribeJobStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned. Take note of the following rules:</p>
         * <ul>
         * <li><strong>ErrorCode</strong> is not returned if the request succeeds.</li>
         * <li><strong>ErrorCode</strong> is returned if the request fails. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message. Take note of the following rules:</p>
         * <ul>
         * <li>If the call is successful, <strong>success</strong> is returned.</li>
         * <li>If the call fails, an error code is returned.</li>
         * </ul>
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
         * <p>53F15A18-8079-5992-810C-0211A5AE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID that is used to query the details of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0b1639af16575057857241351e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeJobStatusResponseBody build() {
            return new DescribeJobStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Long active;

        @com.aliyun.core.annotation.NameInMap("CompletionTime")
        private Long completionTime;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Succeeded")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.active = model.active;
                this.completionTime = model.completionTime;
                this.failed = model.failed;
                this.jobId = model.jobId;
                this.message = model.message;
                this.startTime = model.startTime;
                this.state = model.state;
                this.succeeded = model.succeeded;
            } 

            /**
             * <p>The number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The time when the job was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1657522839</p>
             */
            public Builder completionTime(Long completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * <p>The number of instances that failed to run.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>event-b798157b-40a2-4388-b578-71fb897103**-**</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The returned message. Take note of the following rules:</p>
             * <ul>
             * <li>If the call is successful, <strong>success</strong> is returned.</li>
             * <li>If the call fails, an error code is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1657522800</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The job is not executed.</li>
             * <li><strong>1</strong>: The job was executed.</li>
             * <li><strong>2</strong>: The job failed to be executed.</li>
             * <li><strong>3</strong>: The job is being executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The number of instances that are successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
