// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDecodeBlindWatermarkResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDecodeBlindWatermarkResultResponseBody</p>
 */
public class GetDecodeBlindWatermarkResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private GetDecodeBlindWatermarkResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.endTime = builder.endTime;
        this.eventId = builder.eventId;
        this.message = builder.message;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDecodeBlindWatermarkResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
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
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String code; 
        private String content; 
        private String endTime; 
        private String eventId; 
        private String message; 
        private String projectName; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private String taskId; 
        private String taskType; 
        private String userData; 

        /**
         * <p>The error code of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceNotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The watermark content.</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-03T09:45:56.87Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C2-1I0EG57VR37J4rQ8oKG6C9*****</p>
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The error message of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource project is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>93126E40-0296-4129-95E3-AFAC709372E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-03T09:44:31.029Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DecodeBlindWatermark-c09b0943-ed79-4983-8dbe-7a882574****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>DecodeBlindWatermark</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The user data of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public GetDecodeBlindWatermarkResultResponseBody build() {
            return new GetDecodeBlindWatermarkResultResponseBody(this);
        } 

    } 

}
