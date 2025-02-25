// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link GetTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResponseBody</p>
 */
public class GetTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskRequestDefinition")
    private String taskRequestDefinition;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private GetTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.endTime = builder.endTime;
        this.eventId = builder.eventId;
        this.message = builder.message;
        this.progress = builder.progress;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tags = builder.tags;
        this.taskId = builder.taskId;
        this.taskRequestDefinition = builder.taskRequestDefinition;
        this.taskType = builder.taskType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
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
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskRequestDefinition
     */
    public String getTaskRequestDefinition() {
        return this.taskRequestDefinition;
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
        private String endTime; 
        private String eventId; 
        private String message; 
        private Integer progress; 
        private String projectName; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private java.util.Map<String, ?> tags; 
        private String taskId; 
        private String taskRequestDefinition; 
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
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-24T03:01:49.480109219Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F6-1Bz99Xi93EnRpNEyLudILJm****</p>
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
         * <p>The task progress. Valid values: 0 to 100. Unit: %.</p>
         * <blockquote>
         * <p> This parameter is valid only if the task is in the <code>Running</code> state.``</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C5C1E0F-D8B8-4DA0-8127-EC32C771****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-24T03:01:41.662060377Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>RUNNING: The task is running.</li>
         * <li>Succeeded: The task is successful.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The tags. This parameter is returned only if you specified Tags when you created the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;: &quot;val1&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c2b277b9-0d30-4882-ad6d-ad661382****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The initial request parameters used to create the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ProjectName&quot;:&quot;test-project&quot;,
         *     &quot;CompressedFormat&quot;:&quot;zip&quot;,
         *     &quot;TargetURI&quot;:&quot;oss://test-bucket/output/test.zip&quot;,
         *     &quot;Sources&quot;:[{&quot;URI&quot;:&quot;oss://test-bucket/input/test.jpg&quot;}]
         * }</p>
         */
        public Builder taskRequestDefinition(String taskRequestDefinition) {
            this.taskRequestDefinition = taskRequestDefinition;
            return this;
        }

        /**
         * <p>The type of the task. For more information, see <a href="https://help.aliyun.com/document_detail/2743993.html">Task types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>VideoLabelClassification</p>
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

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

}
