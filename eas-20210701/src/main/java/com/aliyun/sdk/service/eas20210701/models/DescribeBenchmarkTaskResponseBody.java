// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBenchmarkTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBenchmarkTaskResponseBody</p>
 */
public class DescribeBenchmarkTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAgent")
    private Long availableAgent;

    @com.aliyun.core.annotation.NameInMap("CallerUid")
    private String callerUid;

    @com.aliyun.core.annotation.NameInMap("DesiredAgent")
    private Long desiredAgent;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ParentUid")
    private String parentUid;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private DescribeBenchmarkTaskResponseBody(Builder builder) {
        this.availableAgent = builder.availableAgent;
        this.callerUid = builder.callerUid;
        this.desiredAgent = builder.desiredAgent;
        this.endpoint = builder.endpoint;
        this.message = builder.message;
        this.parentUid = builder.parentUid;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBenchmarkTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableAgent
     */
    public Long getAvailableAgent() {
        return this.availableAgent;
    }

    /**
     * @return callerUid
     */
    public String getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return desiredAgent
     */
    public Long getDesiredAgent() {
        return this.desiredAgent;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private Long availableAgent; 
        private String callerUid; 
        private Long desiredAgent; 
        private String endpoint; 
        private String message; 
        private String parentUid; 
        private String reason; 
        private String requestId; 
        private String serviceName; 
        private String status; 
        private String taskId; 
        private String taskName; 
        private String token; 

        /**
         * The number of instances that you can test.
         */
        public Builder availableAgent(Long availableAgent) {
            this.availableAgent = availableAgent;
            return this;
        }

        /**
         * The ID of the operation caller.
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * The number of instances that you want to test.
         */
        public Builder desiredAgent(Long desiredAgent) {
            this.desiredAgent = desiredAgent;
            return this;
        }

        /**
         * The endpoint of the service gateway.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is used to call the operation.
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * The event or reason that causes the current state of the stress testing task.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * The name of the service that you want to test.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The state of the stress testing task.
         * <p>
         * 
         * Valid values:
         * 
         * *   Creating
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Starting
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   DeleteFailed
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Running
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Stopping
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Error
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Updating
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Deleting
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CreateFailed
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The ID of the stress testing task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the stress testing task.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * The token for authentication when a stress testing task is created.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public DescribeBenchmarkTaskResponseBody build() {
            return new DescribeBenchmarkTaskResponseBody(this);
        } 

    } 

}
