// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetTaskByUuidResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskByUuidResponseBody</p>
 */
public class GetTaskByUuidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    private GetTaskByUuidResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskByUuidResponseBody create() {
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
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Task task; 

        private Builder() {
        } 

        private Builder(GetTaskByUuidResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.task = model.task;
        } 

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

        /**
         * Task.
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetTaskByUuidResponseBody build() {
            return new GetTaskByUuidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskByUuidResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskByUuidResponseBody</p>
     */
    public static class Conversations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("SequenceId")
        private String sequenceId;

        @com.aliyun.core.annotation.NameInMap("Speaker")
        private String speaker;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Conversations(Builder builder) {
            this.action = builder.action;
            this.script = builder.script;
            this.sequenceId = builder.sequenceId;
            this.speaker = builder.speaker;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversations create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return sequenceId
         */
        public String getSequenceId() {
            return this.sequenceId;
        }

        /**
         * @return speaker
         */
        public String getSpeaker() {
            return this.speaker;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String script; 
            private String sequenceId; 
            private String speaker; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Conversations model) {
                this.action = model.action;
                this.script = model.script;
                this.sequenceId = model.sequenceId;
                this.speaker = model.speaker;
                this.timestamp = model.timestamp;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * SequenceId.
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * Speaker.
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Conversations build() {
                return new Conversations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskByUuidResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskByUuidResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualTime")
        private Long actualTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("Conversations")
        private java.util.List<Conversations> conversations;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private Integer endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("PlannedTime")
        private Long plannedTime;

        private Task(Builder builder) {
            this.actualTime = builder.actualTime;
            this.callId = builder.callId;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.conversations = builder.conversations;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.plannedTime = builder.plannedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return conversations
         */
        public java.util.List<Conversations> getConversations() {
            return this.conversations;
        }

        /**
         * @return endReason
         */
        public Integer getEndReason() {
            return this.endReason;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return plannedTime
         */
        public Long getPlannedTime() {
            return this.plannedTime;
        }

        public static final class Builder {
            private Long actualTime; 
            private String callId; 
            private String calledNumber; 
            private String callingNumber; 
            private java.util.List<Conversations> conversations; 
            private Integer endReason; 
            private Long endTime; 
            private String id; 
            private String instanceId; 
            private String jobGroupId; 
            private String jobId; 
            private Long plannedTime; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.actualTime = model.actualTime;
                this.callId = model.callId;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.conversations = model.conversations;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.jobGroupId = model.jobGroupId;
                this.jobId = model.jobId;
                this.plannedTime = model.plannedTime;
            } 

            /**
             * ActualTime.
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * Conversations.
             */
            public Builder conversations(java.util.List<Conversations> conversations) {
                this.conversations = conversations;
                return this;
            }

            /**
             * EndReason.
             */
            public Builder endReason(Integer endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * JobGroupId.
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
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
             * PlannedTime.
             */
            public Builder plannedTime(Long plannedTime) {
                this.plannedTime = plannedTime;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
