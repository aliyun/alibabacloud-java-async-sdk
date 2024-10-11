// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallDetailRecordsV2ResponseBody</p>
 */
public class ListCallDetailRecordsV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCallDetailRecordsV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallDetailRecordsV2ResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListCallDetailRecordsV2ResponseBody build() {
            return new ListCallDetailRecordsV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsV2ResponseBody</p>
     */
    public static class Emotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Integer confidence;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Emotion(Builder builder) {
            this.confidence = builder.confidence;
            this.remark = builder.remark;
            this.success = builder.success;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Emotion create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer confidence; 
            private String remark; 
            private Boolean success; 
            private String taskId; 
            private String type; 

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Emotion build() {
                return new Emotion(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsV2ResponseBody</p>
     */
    public static class ProblemSolving extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Problem")
        private String problem;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("Solved")
        private Boolean solved;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private ProblemSolving(Builder builder) {
            this.problem = builder.problem;
            this.solution = builder.solution;
            this.solved = builder.solved;
            this.success = builder.success;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProblemSolving create() {
            return builder().build();
        }

        /**
         * @return problem
         */
        public String getProblem() {
            return this.problem;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return solved
         */
        public Boolean getSolved() {
            return this.solved;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String problem; 
            private String solution; 
            private Boolean solved; 
            private Boolean success; 
            private String taskId; 

            /**
             * Problem.
             */
            public Builder problem(String problem) {
                this.problem = problem;
                return this;
            }

            /**
             * Solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * Solved.
             */
            public Builder solved(Boolean solved) {
                this.solved = solved;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ProblemSolving build() {
                return new ProblemSolving(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsV2ResponseBody</p>
     */
    public static class Satisfaction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SatisfactionDescription")
        private String satisfactionDescription;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Satisfaction(Builder builder) {
            this.remark = builder.remark;
            this.satisfactionDescription = builder.satisfactionDescription;
            this.success = builder.success;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Satisfaction create() {
            return builder().build();
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return satisfactionDescription
         */
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String remark; 
            private String satisfactionDescription; 
            private Boolean success; 
            private String taskId; 

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SatisfactionDescription.
             */
            public Builder satisfactionDescription(String satisfactionDescription) {
                this.satisfactionDescription = satisfactionDescription;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Satisfaction build() {
                return new Satisfaction(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsV2ResponseBody</p>
     */
    public static class TodoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List < String > tasks;

        private TodoList(Builder builder) {
            this.success = builder.success;
            this.taskId = builder.taskId;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodoList create() {
            return builder().build();
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tasks
         */
        public java.util.List < String > getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private Boolean success; 
            private String taskId; 
            private java.util.List < String > tasks; 

            /**
             * Success.
             */
            public Builder success(Boolean success) {
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
             * Tasks.
             */
            public Builder tasks(java.util.List < String > tasks) {
                this.tasks = tasks;
                return this;
            }

            public TodoList build() {
                return new TodoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsV2ResponseBody</p>
     */
    public static class AnalyticsReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Emotion")
        private Emotion emotion;

        @com.aliyun.core.annotation.NameInMap("ProblemSolving")
        private ProblemSolving problemSolving;

        @com.aliyun.core.annotation.NameInMap("Satisfaction")
        private Satisfaction satisfaction;

        @com.aliyun.core.annotation.NameInMap("TodoList")
        private TodoList todoList;

        private AnalyticsReport(Builder builder) {
            this.emotion = builder.emotion;
            this.problemSolving = builder.problemSolving;
            this.satisfaction = builder.satisfaction;
            this.todoList = builder.todoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalyticsReport create() {
            return builder().build();
        }

        /**
         * @return emotion
         */
        public Emotion getEmotion() {
            return this.emotion;
        }

        /**
         * @return problemSolving
         */
        public ProblemSolving getProblemSolving() {
            return this.problemSolving;
        }

        /**
         * @return satisfaction
         */
        public Satisfaction getSatisfaction() {
            return this.satisfaction;
        }

        /**
         * @return todoList
         */
        public TodoList getTodoList() {
            return this.todoList;
        }

        public static final class Builder {
            private Emotion emotion; 
            private ProblemSolving problemSolving; 
            private Satisfaction satisfaction; 
            private TodoList todoList; 

            /**
             * Emotion.
             */
            public Builder emotion(Emotion emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * ProblemSolving.
             */
            public Builder problemSolving(ProblemSolving problemSolving) {
                this.problemSolving = problemSolving;
                return this;
            }

            /**
             * Satisfaction.
             */
            public Builder satisfaction(Satisfaction satisfaction) {
                this.satisfaction = satisfaction;
                return this;
            }

            /**
             * TodoList.
             */
            public Builder todoList(TodoList todoList) {
                this.todoList = todoList;
                return this;
            }

            public AnalyticsReport build() {
                return new AnalyticsReport(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsV2ResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessChannelName")
        private String accessChannelName;

        @com.aliyun.core.annotation.NameInMap("AccessChannelType")
        private String accessChannelType;

        @com.aliyun.core.annotation.NameInMap("AccessChannelUserId")
        private String accessChannelUserId;

        @com.aliyun.core.annotation.NameInMap("AccessChannelUserName")
        private String accessChannelUserName;

        @com.aliyun.core.annotation.NameInMap("AdditionalBroker")
        private String additionalBroker;

        @com.aliyun.core.annotation.NameInMap("AgentIds")
        private String agentIds;

        @com.aliyun.core.annotation.NameInMap("AgentNames")
        private String agentNames;

        @com.aliyun.core.annotation.NameInMap("AnalyticsReport")
        private AnalyticsReport analyticsReport;

        @com.aliyun.core.annotation.NameInMap("AnalyticsReportReady")
        private Boolean analyticsReportReady;

        @com.aliyun.core.annotation.NameInMap("Broker")
        private String broker;

        @com.aliyun.core.annotation.NameInMap("CallDuration")
        private String callDuration;

        @com.aliyun.core.annotation.NameInMap("CallIds")
        private String callIds;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CalleeLocation")
        private String calleeLocation;

        @com.aliyun.core.annotation.NameInMap("CallerLocation")
        private String callerLocation;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ClientAppName")
        private String clientAppName;

        @com.aliyun.core.annotation.NameInMap("ClientIpAddress")
        private String clientIpAddress;

        @com.aliyun.core.annotation.NameInMap("ClientLocation")
        private String clientLocation;

        @com.aliyun.core.annotation.NameInMap("ClientUserAgent")
        private String clientUserAgent;

        @com.aliyun.core.annotation.NameInMap("ContactDisposition")
        private String contactDisposition;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactType")
        private String contactType;

        @com.aliyun.core.annotation.NameInMap("DialingTime")
        private Long dialingTime;

        @com.aliyun.core.annotation.NameInMap("EarlyMediaState")
        private String earlyMediaState;

        @com.aliyun.core.annotation.NameInMap("EarlyMediaText")
        private String earlyMediaText;

        @com.aliyun.core.annotation.NameInMap("EstablishedTime")
        private Long establishedTime;

        @com.aliyun.core.annotation.NameInMap("FirstResponseTime")
        private Long firstResponseTime;

        @com.aliyun.core.annotation.NameInMap("HeldTime")
        private Long heldTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IvrTime")
        private Long ivrTime;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("MessagesSent")
        private Long messagesSent;

        @com.aliyun.core.annotation.NameInMap("MessagesSentByAgent")
        private Long messagesSentByAgent;

        @com.aliyun.core.annotation.NameInMap("MessagesSentByCustomer")
        private Long messagesSentByCustomer;

        @com.aliyun.core.annotation.NameInMap("OffSiteAgentIds")
        private String offSiteAgentIds;

        @com.aliyun.core.annotation.NameInMap("OffsiteAgentDestinationNumbers")
        private String offsiteAgentDestinationNumbers;

        @com.aliyun.core.annotation.NameInMap("OffsiteAgentOriginatorNumbers")
        private String offsiteAgentOriginatorNumbers;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Long queueTime;

        @com.aliyun.core.annotation.NameInMap("RecordingDuration")
        private Long recordingDuration;

        @com.aliyun.core.annotation.NameInMap("RecordingReady")
        private Boolean recordingReady;

        @com.aliyun.core.annotation.NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @com.aliyun.core.annotation.NameInMap("ReleaseReason")
        private String releaseReason;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("RingTime")
        private Long ringTime;

        @com.aliyun.core.annotation.NameInMap("SatisfactionDescription")
        private String satisfactionDescription;

        @com.aliyun.core.annotation.NameInMap("SatisfactionIndex")
        private Integer satisfactionIndex;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveyChannel")
        private String satisfactionSurveyChannel;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveyOffered")
        private Boolean satisfactionSurveyOffered;

        @com.aliyun.core.annotation.NameInMap("SkillGroupIds")
        private String skillGroupIds;

        @com.aliyun.core.annotation.NameInMap("SkillGroupNames")
        private String skillGroupNames;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TalkTime")
        private Long talkTime;

        @com.aliyun.core.annotation.NameInMap("TransferCount")
        private Long transferCount;

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Long waitTime;

        private List(Builder builder) {
            this.accessChannelName = builder.accessChannelName;
            this.accessChannelType = builder.accessChannelType;
            this.accessChannelUserId = builder.accessChannelUserId;
            this.accessChannelUserName = builder.accessChannelUserName;
            this.additionalBroker = builder.additionalBroker;
            this.agentIds = builder.agentIds;
            this.agentNames = builder.agentNames;
            this.analyticsReport = builder.analyticsReport;
            this.analyticsReportReady = builder.analyticsReportReady;
            this.broker = builder.broker;
            this.callDuration = builder.callDuration;
            this.callIds = builder.callIds;
            this.calledNumber = builder.calledNumber;
            this.calleeLocation = builder.calleeLocation;
            this.callerLocation = builder.callerLocation;
            this.callingNumber = builder.callingNumber;
            this.clientAppName = builder.clientAppName;
            this.clientIpAddress = builder.clientIpAddress;
            this.clientLocation = builder.clientLocation;
            this.clientUserAgent = builder.clientUserAgent;
            this.contactDisposition = builder.contactDisposition;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.dialingTime = builder.dialingTime;
            this.earlyMediaState = builder.earlyMediaState;
            this.earlyMediaText = builder.earlyMediaText;
            this.establishedTime = builder.establishedTime;
            this.firstResponseTime = builder.firstResponseTime;
            this.heldTime = builder.heldTime;
            this.instanceId = builder.instanceId;
            this.ivrTime = builder.ivrTime;
            this.mediaType = builder.mediaType;
            this.messagesSent = builder.messagesSent;
            this.messagesSentByAgent = builder.messagesSentByAgent;
            this.messagesSentByCustomer = builder.messagesSentByCustomer;
            this.offSiteAgentIds = builder.offSiteAgentIds;
            this.offsiteAgentDestinationNumbers = builder.offsiteAgentDestinationNumbers;
            this.offsiteAgentOriginatorNumbers = builder.offsiteAgentOriginatorNumbers;
            this.queueTime = builder.queueTime;
            this.recordingDuration = builder.recordingDuration;
            this.recordingReady = builder.recordingReady;
            this.releaseInitiator = builder.releaseInitiator;
            this.releaseReason = builder.releaseReason;
            this.releaseTime = builder.releaseTime;
            this.ringTime = builder.ringTime;
            this.satisfactionDescription = builder.satisfactionDescription;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionSurveyChannel = builder.satisfactionSurveyChannel;
            this.satisfactionSurveyOffered = builder.satisfactionSurveyOffered;
            this.skillGroupIds = builder.skillGroupIds;
            this.skillGroupNames = builder.skillGroupNames;
            this.startTime = builder.startTime;
            this.talkTime = builder.talkTime;
            this.transferCount = builder.transferCount;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return accessChannelName
         */
        public String getAccessChannelName() {
            return this.accessChannelName;
        }

        /**
         * @return accessChannelType
         */
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        /**
         * @return accessChannelUserId
         */
        public String getAccessChannelUserId() {
            return this.accessChannelUserId;
        }

        /**
         * @return accessChannelUserName
         */
        public String getAccessChannelUserName() {
            return this.accessChannelUserName;
        }

        /**
         * @return additionalBroker
         */
        public String getAdditionalBroker() {
            return this.additionalBroker;
        }

        /**
         * @return agentIds
         */
        public String getAgentIds() {
            return this.agentIds;
        }

        /**
         * @return agentNames
         */
        public String getAgentNames() {
            return this.agentNames;
        }

        /**
         * @return analyticsReport
         */
        public AnalyticsReport getAnalyticsReport() {
            return this.analyticsReport;
        }

        /**
         * @return analyticsReportReady
         */
        public Boolean getAnalyticsReportReady() {
            return this.analyticsReportReady;
        }

        /**
         * @return broker
         */
        public String getBroker() {
            return this.broker;
        }

        /**
         * @return callDuration
         */
        public String getCallDuration() {
            return this.callDuration;
        }

        /**
         * @return callIds
         */
        public String getCallIds() {
            return this.callIds;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return calleeLocation
         */
        public String getCalleeLocation() {
            return this.calleeLocation;
        }

        /**
         * @return callerLocation
         */
        public String getCallerLocation() {
            return this.callerLocation;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return clientAppName
         */
        public String getClientAppName() {
            return this.clientAppName;
        }

        /**
         * @return clientIpAddress
         */
        public String getClientIpAddress() {
            return this.clientIpAddress;
        }

        /**
         * @return clientLocation
         */
        public String getClientLocation() {
            return this.clientLocation;
        }

        /**
         * @return clientUserAgent
         */
        public String getClientUserAgent() {
            return this.clientUserAgent;
        }

        /**
         * @return contactDisposition
         */
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return contactType
         */
        public String getContactType() {
            return this.contactType;
        }

        /**
         * @return dialingTime
         */
        public Long getDialingTime() {
            return this.dialingTime;
        }

        /**
         * @return earlyMediaState
         */
        public String getEarlyMediaState() {
            return this.earlyMediaState;
        }

        /**
         * @return earlyMediaText
         */
        public String getEarlyMediaText() {
            return this.earlyMediaText;
        }

        /**
         * @return establishedTime
         */
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        /**
         * @return firstResponseTime
         */
        public Long getFirstResponseTime() {
            return this.firstResponseTime;
        }

        /**
         * @return heldTime
         */
        public Long getHeldTime() {
            return this.heldTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ivrTime
         */
        public Long getIvrTime() {
            return this.ivrTime;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return messagesSent
         */
        public Long getMessagesSent() {
            return this.messagesSent;
        }

        /**
         * @return messagesSentByAgent
         */
        public Long getMessagesSentByAgent() {
            return this.messagesSentByAgent;
        }

        /**
         * @return messagesSentByCustomer
         */
        public Long getMessagesSentByCustomer() {
            return this.messagesSentByCustomer;
        }

        /**
         * @return offSiteAgentIds
         */
        public String getOffSiteAgentIds() {
            return this.offSiteAgentIds;
        }

        /**
         * @return offsiteAgentDestinationNumbers
         */
        public String getOffsiteAgentDestinationNumbers() {
            return this.offsiteAgentDestinationNumbers;
        }

        /**
         * @return offsiteAgentOriginatorNumbers
         */
        public String getOffsiteAgentOriginatorNumbers() {
            return this.offsiteAgentOriginatorNumbers;
        }

        /**
         * @return queueTime
         */
        public Long getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return recordingDuration
         */
        public Long getRecordingDuration() {
            return this.recordingDuration;
        }

        /**
         * @return recordingReady
         */
        public Boolean getRecordingReady() {
            return this.recordingReady;
        }

        /**
         * @return releaseInitiator
         */
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        /**
         * @return releaseReason
         */
        public String getReleaseReason() {
            return this.releaseReason;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return ringTime
         */
        public Long getRingTime() {
            return this.ringTime;
        }

        /**
         * @return satisfactionDescription
         */
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
        }

        /**
         * @return satisfactionIndex
         */
        public Integer getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        /**
         * @return satisfactionSurveyChannel
         */
        public String getSatisfactionSurveyChannel() {
            return this.satisfactionSurveyChannel;
        }

        /**
         * @return satisfactionSurveyOffered
         */
        public Boolean getSatisfactionSurveyOffered() {
            return this.satisfactionSurveyOffered;
        }

        /**
         * @return skillGroupIds
         */
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        /**
         * @return skillGroupNames
         */
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return talkTime
         */
        public Long getTalkTime() {
            return this.talkTime;
        }

        /**
         * @return transferCount
         */
        public Long getTransferCount() {
            return this.transferCount;
        }

        /**
         * @return waitTime
         */
        public Long getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private String accessChannelName; 
            private String accessChannelType; 
            private String accessChannelUserId; 
            private String accessChannelUserName; 
            private String additionalBroker; 
            private String agentIds; 
            private String agentNames; 
            private AnalyticsReport analyticsReport; 
            private Boolean analyticsReportReady; 
            private String broker; 
            private String callDuration; 
            private String callIds; 
            private String calledNumber; 
            private String calleeLocation; 
            private String callerLocation; 
            private String callingNumber; 
            private String clientAppName; 
            private String clientIpAddress; 
            private String clientLocation; 
            private String clientUserAgent; 
            private String contactDisposition; 
            private String contactId; 
            private String contactType; 
            private Long dialingTime; 
            private String earlyMediaState; 
            private String earlyMediaText; 
            private Long establishedTime; 
            private Long firstResponseTime; 
            private Long heldTime; 
            private String instanceId; 
            private Long ivrTime; 
            private String mediaType; 
            private Long messagesSent; 
            private Long messagesSentByAgent; 
            private Long messagesSentByCustomer; 
            private String offSiteAgentIds; 
            private String offsiteAgentDestinationNumbers; 
            private String offsiteAgentOriginatorNumbers; 
            private Long queueTime; 
            private Long recordingDuration; 
            private Boolean recordingReady; 
            private String releaseInitiator; 
            private String releaseReason; 
            private Long releaseTime; 
            private Long ringTime; 
            private String satisfactionDescription; 
            private Integer satisfactionIndex; 
            private String satisfactionSurveyChannel; 
            private Boolean satisfactionSurveyOffered; 
            private String skillGroupIds; 
            private String skillGroupNames; 
            private Long startTime; 
            private Long talkTime; 
            private Long transferCount; 
            private Long waitTime; 

            /**
             * AccessChannelName.
             */
            public Builder accessChannelName(String accessChannelName) {
                this.accessChannelName = accessChannelName;
                return this;
            }

            /**
             * AccessChannelType.
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * AccessChannelUserId.
             */
            public Builder accessChannelUserId(String accessChannelUserId) {
                this.accessChannelUserId = accessChannelUserId;
                return this;
            }

            /**
             * AccessChannelUserName.
             */
            public Builder accessChannelUserName(String accessChannelUserName) {
                this.accessChannelUserName = accessChannelUserName;
                return this;
            }

            /**
             * AdditionalBroker.
             */
            public Builder additionalBroker(String additionalBroker) {
                this.additionalBroker = additionalBroker;
                return this;
            }

            /**
             * AgentIds.
             */
            public Builder agentIds(String agentIds) {
                this.agentIds = agentIds;
                return this;
            }

            /**
             * AgentNames.
             */
            public Builder agentNames(String agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * AnalyticsReport.
             */
            public Builder analyticsReport(AnalyticsReport analyticsReport) {
                this.analyticsReport = analyticsReport;
                return this;
            }

            /**
             * AnalyticsReportReady.
             */
            public Builder analyticsReportReady(Boolean analyticsReportReady) {
                this.analyticsReportReady = analyticsReportReady;
                return this;
            }

            /**
             * Broker.
             */
            public Builder broker(String broker) {
                this.broker = broker;
                return this;
            }

            /**
             * CallDuration.
             */
            public Builder callDuration(String callDuration) {
                this.callDuration = callDuration;
                return this;
            }

            /**
             * CallIds.
             */
            public Builder callIds(String callIds) {
                this.callIds = callIds;
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
             * CalleeLocation.
             */
            public Builder calleeLocation(String calleeLocation) {
                this.calleeLocation = calleeLocation;
                return this;
            }

            /**
             * CallerLocation.
             */
            public Builder callerLocation(String callerLocation) {
                this.callerLocation = callerLocation;
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
             * ClientAppName.
             */
            public Builder clientAppName(String clientAppName) {
                this.clientAppName = clientAppName;
                return this;
            }

            /**
             * ClientIpAddress.
             */
            public Builder clientIpAddress(String clientIpAddress) {
                this.clientIpAddress = clientIpAddress;
                return this;
            }

            /**
             * ClientLocation.
             */
            public Builder clientLocation(String clientLocation) {
                this.clientLocation = clientLocation;
                return this;
            }

            /**
             * ClientUserAgent.
             */
            public Builder clientUserAgent(String clientUserAgent) {
                this.clientUserAgent = clientUserAgent;
                return this;
            }

            /**
             * ContactDisposition.
             */
            public Builder contactDisposition(String contactDisposition) {
                this.contactDisposition = contactDisposition;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactType.
             */
            public Builder contactType(String contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * DialingTime.
             */
            public Builder dialingTime(Long dialingTime) {
                this.dialingTime = dialingTime;
                return this;
            }

            /**
             * EarlyMediaState.
             */
            public Builder earlyMediaState(String earlyMediaState) {
                this.earlyMediaState = earlyMediaState;
                return this;
            }

            /**
             * EarlyMediaText.
             */
            public Builder earlyMediaText(String earlyMediaText) {
                this.earlyMediaText = earlyMediaText;
                return this;
            }

            /**
             * EstablishedTime.
             */
            public Builder establishedTime(Long establishedTime) {
                this.establishedTime = establishedTime;
                return this;
            }

            /**
             * FirstResponseTime.
             */
            public Builder firstResponseTime(Long firstResponseTime) {
                this.firstResponseTime = firstResponseTime;
                return this;
            }

            /**
             * HeldTime.
             */
            public Builder heldTime(Long heldTime) {
                this.heldTime = heldTime;
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
             * IvrTime.
             */
            public Builder ivrTime(Long ivrTime) {
                this.ivrTime = ivrTime;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * MessagesSent.
             */
            public Builder messagesSent(Long messagesSent) {
                this.messagesSent = messagesSent;
                return this;
            }

            /**
             * MessagesSentByAgent.
             */
            public Builder messagesSentByAgent(Long messagesSentByAgent) {
                this.messagesSentByAgent = messagesSentByAgent;
                return this;
            }

            /**
             * MessagesSentByCustomer.
             */
            public Builder messagesSentByCustomer(Long messagesSentByCustomer) {
                this.messagesSentByCustomer = messagesSentByCustomer;
                return this;
            }

            /**
             * OffSiteAgentIds.
             */
            public Builder offSiteAgentIds(String offSiteAgentIds) {
                this.offSiteAgentIds = offSiteAgentIds;
                return this;
            }

            /**
             * OffsiteAgentDestinationNumbers.
             */
            public Builder offsiteAgentDestinationNumbers(String offsiteAgentDestinationNumbers) {
                this.offsiteAgentDestinationNumbers = offsiteAgentDestinationNumbers;
                return this;
            }

            /**
             * OffsiteAgentOriginatorNumbers.
             */
            public Builder offsiteAgentOriginatorNumbers(String offsiteAgentOriginatorNumbers) {
                this.offsiteAgentOriginatorNumbers = offsiteAgentOriginatorNumbers;
                return this;
            }

            /**
             * QueueTime.
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * RecordingDuration.
             */
            public Builder recordingDuration(Long recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * RecordingReady.
             */
            public Builder recordingReady(Boolean recordingReady) {
                this.recordingReady = recordingReady;
                return this;
            }

            /**
             * ReleaseInitiator.
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * ReleaseReason.
             */
            public Builder releaseReason(String releaseReason) {
                this.releaseReason = releaseReason;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * RingTime.
             */
            public Builder ringTime(Long ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * SatisfactionDescription.
             */
            public Builder satisfactionDescription(String satisfactionDescription) {
                this.satisfactionDescription = satisfactionDescription;
                return this;
            }

            /**
             * SatisfactionIndex.
             */
            public Builder satisfactionIndex(Integer satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * SatisfactionSurveyChannel.
             */
            public Builder satisfactionSurveyChannel(String satisfactionSurveyChannel) {
                this.satisfactionSurveyChannel = satisfactionSurveyChannel;
                return this;
            }

            /**
             * SatisfactionSurveyOffered.
             */
            public Builder satisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
                this.satisfactionSurveyOffered = satisfactionSurveyOffered;
                return this;
            }

            /**
             * SkillGroupIds.
             */
            public Builder skillGroupIds(String skillGroupIds) {
                this.skillGroupIds = skillGroupIds;
                return this;
            }

            /**
             * SkillGroupNames.
             */
            public Builder skillGroupNames(String skillGroupNames) {
                this.skillGroupNames = skillGroupNames;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TalkTime.
             */
            public Builder talkTime(Long talkTime) {
                this.talkTime = talkTime;
                return this;
            }

            /**
             * TransferCount.
             */
            public Builder transferCount(Long transferCount) {
                this.transferCount = transferCount;
                return this;
            }

            /**
             * WaitTime.
             */
            public Builder waitTime(Long waitTime) {
                this.waitTime = waitTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallDetailRecordsV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsV2ResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
