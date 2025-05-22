// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ListAITaskEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAITaskEventsResponseBody</p>
 */
public class ListAITaskEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

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
     * @return events
     */
    public java.util.List<Events> getEvents() {
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
        private java.util.List<Events> events; 
        private Integer httpStatusCode; 
        private String nextToken; 
        private String requestId; 
        private String success; 
        private String taskId; 
        private String taskStatus; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(ListAITaskEventsResponseBody model) {
            this.code = model.code;
            this.events = model.events;
            this.httpStatusCode = model.httpStatusCode;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskId = model.taskId;
            this.taskStatus = model.taskStatus;
            this.taskType = model.taskType;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Forbidden</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****w==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-asasas*****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The state of the AI task.</p>
         * <ul>
         * <li>PENDING</li>
         * <li>WAITING</li>
         * <li>RUNNING</li>
         * <li>SUCCESS</li>
         * <li>FAILURE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The type of the AI task.</p>
         * <ul>
         * <li>GenerateTemplate: The AI task is used to generate a template.</li>
         * <li>FixTemplate: The AI task is used to fix a template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GenerateTemplate</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public ListAITaskEventsResponseBody build() {
            return new ListAITaskEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAITaskEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAITaskEventsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Events model) {
                this.agentType = model.agentType;
                this.createTime = model.createTime;
                this.estimatedProcessingTime = model.estimatedProcessingTime;
                this.eventData = model.eventData;
                this.handlerProcessStatus = model.handlerProcessStatus;
                this.handlerType = model.handlerType;
            } 

            /**
             * <p>The type of the agent that is used to execute the AI task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>GenerateTemplateAgent</li>
             * <li>FixUserTemplateAgent</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GenerateTemplateAgent</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The time when the event was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-01T04:07:39</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The estimated execution time of the handler. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder estimatedProcessingTime(String estimatedProcessingTime) {
                this.estimatedProcessingTime = estimatedProcessingTime;
                return this;
            }

            /**
             * <p>The details of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Document template generator started.</p>
             */
            public Builder eventData(String eventData) {
                this.eventData = eventData;
                return this;
            }

            /**
             * <p>The execution state of the handler that process the AI task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SUCCESS</li>
             * <li>RUNNING</li>
             * <li>FAILURE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder handlerProcessStatus(String handlerProcessStatus) {
                this.handlerProcessStatus = handlerProcessStatus;
                return this;
            }

            /**
             * <p>The type of the handler that is used to execute the task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>TerraformTemplateGenerator</li>
             * <li>TemplateGenerator</li>
             * <li>ROSTemplateModifier</li>
             * <li>TerraformTemplateStaticFixer</li>
             * <li>TerraformTemplateDynamicFixer</li>
             * <li>DocumentTemplateGenerator</li>
             * <li>TerraformTemplateModifier</li>
             * <li>TemplateModifier</li>
             * <li>FixTemplateInputPreprocessor</li>
             * <li>TemplateStaticFixer</li>
             * <li>GenerateTemplateInputPreprocessor</li>
             * <li>ROSTemplateGenerator</li>
             * <li>TemplateDynamicFixer</li>
             * <li>BaseDynamicFixer</li>
             * <li>ROSTemplateStaticFixer</li>
             * <li>ROSTemplateDynamicFixer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ROSTemplateGenerator</p>
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
