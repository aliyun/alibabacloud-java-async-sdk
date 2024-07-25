// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAITaskEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAITaskEventsResponseBody</p>
 */
public class ListAITaskEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List < Events> events;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private ListAITaskEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.events = builder.events;
        this.httpStatusCode = builder.httpStatusCode;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAITaskEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
        return this.events;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Events> events; 
        private Integer httpStatusCode; 
        private String nextToken; 
        private String requestId; 
        private String success; 
        private String taskId; 
        private String taskStatus; 
        private String taskType; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Events.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder success(String success) {
            this.success = success;
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
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public ListAITaskEventsResponseBody build() {
            return new ListAITaskEventsResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EstimatedProcessingTime")
        private String estimatedProcessingTime;

        @com.aliyun.core.annotation.NameInMap("EventData")
        private String eventData;

        @com.aliyun.core.annotation.NameInMap("HandlerProcessStatus")
        private String handlerProcessStatus;

        @com.aliyun.core.annotation.NameInMap("HandlerType")
        private String handlerType;

        private Events(Builder builder) {
            this.agentType = builder.agentType;
            this.createTime = builder.createTime;
            this.estimatedProcessingTime = builder.estimatedProcessingTime;
            this.eventData = builder.eventData;
            this.handlerProcessStatus = builder.handlerProcessStatus;
            this.handlerType = builder.handlerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return estimatedProcessingTime
         */
        public String getEstimatedProcessingTime() {
            return this.estimatedProcessingTime;
        }

        /**
         * @return eventData
         */
        public String getEventData() {
            return this.eventData;
        }

        /**
         * @return handlerProcessStatus
         */
        public String getHandlerProcessStatus() {
            return this.handlerProcessStatus;
        }

        /**
         * @return handlerType
         */
        public String getHandlerType() {
            return this.handlerType;
        }

        public static final class Builder {
            private String agentType; 
            private String createTime; 
            private String estimatedProcessingTime; 
            private String eventData; 
            private String handlerProcessStatus; 
            private String handlerType; 

            /**
             * AgentType.
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EstimatedProcessingTime.
             */
            public Builder estimatedProcessingTime(String estimatedProcessingTime) {
                this.estimatedProcessingTime = estimatedProcessingTime;
                return this;
            }

            /**
             * EventData.
             */
            public Builder eventData(String eventData) {
                this.eventData = eventData;
                return this;
            }

            /**
             * HandlerProcessStatus.
             */
            public Builder handlerProcessStatus(String handlerProcessStatus) {
                this.handlerProcessStatus = handlerProcessStatus;
                return this;
            }

            /**
             * HandlerType.
             */
            public Builder handlerType(String handlerType) {
                this.handlerType = handlerType;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
