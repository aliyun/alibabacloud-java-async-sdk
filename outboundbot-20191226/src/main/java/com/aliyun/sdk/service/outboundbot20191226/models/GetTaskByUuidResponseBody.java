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
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The task information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
             * <p>The instruction. Valid values:</p>
             * <ul>
             * <li>BeginDialogue: starts the conversation.</li>
             * <li>Dialogue: indicates a conversation.</li>
             * <li>AbortDialogue: aborts the conversation.</li>
             * <li>SilenceTimeout: indicates a silence timeout.</li>
             * <li>CollectedNumber: indicates a collected number.</li>
             * <li>EndDialogue: ends the conversation.</li>
             * <li>Broadcast: indicates an opening remark.</li>
             * <li>HangUp: hangs up the call.</li>
             * <li>Authorize: grants authorization.</li>
             * <li>TransferToAgent: transfers the call to an agent.</li>
             * <li>TransferToIVR: transfers the call to an IVR.</li>
             * <li>RedirectToPage: redirects to a page.</li>
             * <li>CollectNumber: collects a number.</li>
             * <li>WaitOnAsyncTask: waits for an asynchronous task.</li>
             * <li>Error: indicates an error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Broadcast</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The conversation text.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello, I am **customer service</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fd279983-93b9-b13b-9a34-64e5df473225</p>
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * <p>The speaker of the conversation. Valid values: Robot and Contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Robot</p>
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            /**
             * <p>The time when the summary was created. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579068424883</p>
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
        private String endReason;

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
        public String getEndReason() {
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
            private String endReason; 
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
             * <p>The actual execution time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640090211434</p>
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>13777777777</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>057190294</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The list of conversation information.</p>
             */
            public Builder conversations(java.util.List<Conversations> conversations) {
                this.conversations = conversations;
                return this;
            }

            /**
             * <p>The end reason. Valid values:</p>
             * <ul>
             * <li>FINISHED: normal completion.</li>
             * <li>CHATBOT_HANGUP_AFTER_NOANSWER: the robot hangs up after unrecognized input.</li>
             * <li>CHATBOT_HANGUP_AFTER_SILENCE: the robot hangs up after a silence timeout.</li>
             * <li>CLIENT_HANGUP_AFTER_NOANSWER: the user hangs up after unrecognized input.</li>
             * <li>CLIENT_HANGUP: the user hangs up without a reason.</li>
             * <li>TRANSFER_BY_INTENT: the call is transferred to a human agent due to intent matching.</li>
             * <li>TRANSFER_AFTER_NOANSWER: the call is transferred to a human agent after unrecognized input.</li>
             * <li>INO_INTERACTION: no interaction from the user.</li>
             * <li>ERROR: the system is interrupted due to an exception.</li>
             * <li>SPECIAL_INTERCEPT_VOICE_ASSISTANT: intercepted due to special circumstances - voice assistant.</li>
             * <li>SPECIAL_INTERCEPT_EXTENSION_NUMBER_TRANSFER: intercepted due to special circumstances - extension number transfer.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: The data type of this parameter is String. The returned value is an enumerated value such as FINISHED.</notice></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder endReason(String endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * <p>The end time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640090211434</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The job group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The planned execution time of the task. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640090211434</p>
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
