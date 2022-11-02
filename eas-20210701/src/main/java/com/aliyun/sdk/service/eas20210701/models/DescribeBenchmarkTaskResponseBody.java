// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBenchmarkTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBenchmarkTaskResponseBody</p>
 */
public class DescribeBenchmarkTaskResponseBody extends TeaModel {
    @NameInMap("AvailableAgent")
    private Long availableAgent;

    @NameInMap("CallerUid")
    private String callerUid;

    @NameInMap("DesiredAgent")
    private Long desiredAgent;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("Message")
    private String message;

    @NameInMap("ParentUid")
    private String parentUid;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("Status")
    private String status;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskName")
    private String taskName;

    @NameInMap("Token")
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
         * AvailableAgent.
         */
        public Builder availableAgent(Long availableAgent) {
            this.availableAgent = availableAgent;
            return this;
        }

        /**
         * CallerUid.
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * DesiredAgent.
         */
        public Builder desiredAgent(Long desiredAgent) {
            this.desiredAgent = desiredAgent;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
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
         * ParentUid.
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * Token.
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
