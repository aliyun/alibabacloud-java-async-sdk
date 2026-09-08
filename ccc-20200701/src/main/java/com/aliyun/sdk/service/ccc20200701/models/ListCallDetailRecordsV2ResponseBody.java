// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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

        private Builder() {
        } 

        private Builder(ListCallDetailRecordsV2ResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01B12EE4-6AF2-4730-8B78-EC15F4E5C025</p>
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

            private Builder() {
            } 

            private Builder(Emotion model) {
                this.confidence = model.confidence;
                this.remark = model.remark;
                this.success = model.success;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The confidence level.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The detailed remark of the emotion analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>No emotional change from the customer</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful.</p>
             * <ul>
             * <li><strong>true</strong>: Successful.</li>
             * <li><strong>false</strong>: Failed.</li>
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
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0ff07fe35670423089dbdf12766d962f</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The emotion type.</p>
             * 
             * <strong>example:</strong>
             * <p>Neutral</p>
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

            private Builder() {
            } 

            private Builder(ProblemSolving model) {
                this.problem = model.problem;
                this.solution = model.solution;
                this.solved = model.solved;
                this.success = model.success;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The problem description.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert issue</p>
             */
            public Builder problem(String problem) {
                this.problem = problem;
                return this;
            }

            /**
             * <p>The Solutions.</p>
             * 
             * <strong>example:</strong>
             * <p>The enrichment service automatically closes the original alert</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>Indicates whether the problem is resolved.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder solved(Boolean solved) {
                this.solved = solved;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful.</p>
             * <ul>
             * <li><strong>true</strong>: Successful.</li>
             * <li><strong>false</strong>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8bf18b7a10064b29a75946a8d5b8469a</p>
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

            private Builder() {
            } 

            private Builder(Satisfaction model) {
                this.remark = model.remark;
                this.satisfactionDescription = model.satisfactionDescription;
                this.success = model.success;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The detailed remark of the satisfaction analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>The customer expressed satisfaction</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The satisfaction description.</p>
             * 
             * <strong>example:</strong>
             * <p>Satisfied</p>
             */
            public Builder satisfactionDescription(String satisfactionDescription) {
                this.satisfactionDescription = satisfactionDescription;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful.</p>
             * <ul>
             * <li><strong>true</strong>: Successful.</li>
             * <li><strong>false</strong>: Failed.</li>
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
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cb67479ce28243b28ff39948feaa0806</p>
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
        private java.util.List<String> tasks;

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
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private Boolean success; 
            private String taskId; 
            private java.util.List<String> tasks; 

            private Builder() {
            } 

            private Builder(TodoList model) {
                this.success = model.success;
                this.taskId = model.taskId;
                this.tasks = model.tasks;
            } 

            /**
             * <p>Indicates whether the call was successful.</p>
             * <ul>
             * <li><strong>true</strong>: Successful.</li>
             * <li><strong>false</strong>: Failed.</li>
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
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cb67479ce28243b28ff39948feaa0806</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The to-do items.</p>
             */
            public Builder tasks(java.util.List<String> tasks) {
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

            private Builder() {
            } 

            private Builder(AnalyticsReport model) {
                this.emotion = model.emotion;
                this.problemSolving = model.problemSolving;
                this.satisfaction = model.satisfaction;
                this.todoList = model.todoList;
            } 

            /**
             * <p>The emotion analysis.</p>
             */
            public Builder emotion(Emotion emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * <p>The problem resolution status.</p>
             */
            public Builder problemSolving(ProblemSolving problemSolving) {
                this.problemSolving = problemSolving;
                return this;
            }

            /**
             * <p>The satisfaction analysis.</p>
             */
            public Builder satisfaction(Satisfaction satisfaction) {
                this.satisfaction = satisfaction;
                return this;
            }

            /**
             * <p>The to-do list.</p>
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
    public static class SummaryIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keywords")
        private String keywords;

        private SummaryIndex(Builder builder) {
            this.keywords = builder.keywords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryIndex create() {
            return builder().build();
        }

        /**
         * @return keywords
         */
        public String getKeywords() {
            return this.keywords;
        }

        public static final class Builder {
            private String keywords; 

            private Builder() {
            } 

            private Builder(SummaryIndex model) {
                this.keywords = model.keywords;
            } 

            /**
             * <p>The keywords.</p>
             * 
             * <strong>example:</strong>
             * <p>CustomerService</p>
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            public SummaryIndex build() {
                return new SummaryIndex(this);
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
        @com.aliyun.core.annotation.NameInMap("AccessChannelId")
        private String accessChannelId;

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

        @com.aliyun.core.annotation.NameInMap("OffsiteAgentReleaseReason")
        private String offsiteAgentReleaseReason;

        @com.aliyun.core.annotation.NameInMap("OutsideNumberDestinationNumber")
        private String outsideNumberDestinationNumber;

        @com.aliyun.core.annotation.NameInMap("OutsideNumberReleaseReason")
        private String outsideNumberReleaseReason;

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

        @com.aliyun.core.annotation.NameInMap("SummaryIndex")
        private SummaryIndex summaryIndex;

        @com.aliyun.core.annotation.NameInMap("TalkTime")
        private Long talkTime;

        @com.aliyun.core.annotation.NameInMap("TransferCount")
        private Long transferCount;

        @com.aliyun.core.annotation.NameInMap("VoicebotDestinationNumber")
        private String voicebotDestinationNumber;

        @com.aliyun.core.annotation.NameInMap("VoicebotOriginatorNumber")
        private String voicebotOriginatorNumber;

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Long waitTime;

        private List(Builder builder) {
            this.accessChannelId = builder.accessChannelId;
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
            this.offsiteAgentReleaseReason = builder.offsiteAgentReleaseReason;
            this.outsideNumberDestinationNumber = builder.outsideNumberDestinationNumber;
            this.outsideNumberReleaseReason = builder.outsideNumberReleaseReason;
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
            this.summaryIndex = builder.summaryIndex;
            this.talkTime = builder.talkTime;
            this.transferCount = builder.transferCount;
            this.voicebotDestinationNumber = builder.voicebotDestinationNumber;
            this.voicebotOriginatorNumber = builder.voicebotOriginatorNumber;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return accessChannelId
         */
        public String getAccessChannelId() {
            return this.accessChannelId;
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
         * @return offsiteAgentReleaseReason
         */
        public String getOffsiteAgentReleaseReason() {
            return this.offsiteAgentReleaseReason;
        }

        /**
         * @return outsideNumberDestinationNumber
         */
        public String getOutsideNumberDestinationNumber() {
            return this.outsideNumberDestinationNumber;
        }

        /**
         * @return outsideNumberReleaseReason
         */
        public String getOutsideNumberReleaseReason() {
            return this.outsideNumberReleaseReason;
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
         * @return summaryIndex
         */
        public SummaryIndex getSummaryIndex() {
            return this.summaryIndex;
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
         * @return voicebotDestinationNumber
         */
        public String getVoicebotDestinationNumber() {
            return this.voicebotDestinationNumber;
        }

        /**
         * @return voicebotOriginatorNumber
         */
        public String getVoicebotOriginatorNumber() {
            return this.voicebotOriginatorNumber;
        }

        /**
         * @return waitTime
         */
        public Long getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private String accessChannelId; 
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
            private String offsiteAgentReleaseReason; 
            private String outsideNumberDestinationNumber; 
            private String outsideNumberReleaseReason; 
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
            private SummaryIndex summaryIndex; 
            private Long talkTime; 
            private Long transferCount; 
            private String voicebotDestinationNumber; 
            private String voicebotOriginatorNumber; 
            private Long waitTime; 

            private Builder() {
            } 

            private Builder(List model) {
                this.accessChannelId = model.accessChannelId;
                this.accessChannelName = model.accessChannelName;
                this.accessChannelType = model.accessChannelType;
                this.accessChannelUserId = model.accessChannelUserId;
                this.accessChannelUserName = model.accessChannelUserName;
                this.additionalBroker = model.additionalBroker;
                this.agentIds = model.agentIds;
                this.agentNames = model.agentNames;
                this.analyticsReport = model.analyticsReport;
                this.analyticsReportReady = model.analyticsReportReady;
                this.broker = model.broker;
                this.callDuration = model.callDuration;
                this.callIds = model.callIds;
                this.calledNumber = model.calledNumber;
                this.calleeLocation = model.calleeLocation;
                this.callerLocation = model.callerLocation;
                this.callingNumber = model.callingNumber;
                this.clientAppName = model.clientAppName;
                this.clientIpAddress = model.clientIpAddress;
                this.clientLocation = model.clientLocation;
                this.clientUserAgent = model.clientUserAgent;
                this.contactDisposition = model.contactDisposition;
                this.contactId = model.contactId;
                this.contactType = model.contactType;
                this.dialingTime = model.dialingTime;
                this.earlyMediaState = model.earlyMediaState;
                this.earlyMediaText = model.earlyMediaText;
                this.establishedTime = model.establishedTime;
                this.firstResponseTime = model.firstResponseTime;
                this.heldTime = model.heldTime;
                this.instanceId = model.instanceId;
                this.ivrTime = model.ivrTime;
                this.mediaType = model.mediaType;
                this.messagesSent = model.messagesSent;
                this.messagesSentByAgent = model.messagesSentByAgent;
                this.messagesSentByCustomer = model.messagesSentByCustomer;
                this.offSiteAgentIds = model.offSiteAgentIds;
                this.offsiteAgentDestinationNumbers = model.offsiteAgentDestinationNumbers;
                this.offsiteAgentOriginatorNumbers = model.offsiteAgentOriginatorNumbers;
                this.offsiteAgentReleaseReason = model.offsiteAgentReleaseReason;
                this.outsideNumberDestinationNumber = model.outsideNumberDestinationNumber;
                this.outsideNumberReleaseReason = model.outsideNumberReleaseReason;
                this.queueTime = model.queueTime;
                this.recordingDuration = model.recordingDuration;
                this.recordingReady = model.recordingReady;
                this.releaseInitiator = model.releaseInitiator;
                this.releaseReason = model.releaseReason;
                this.releaseTime = model.releaseTime;
                this.ringTime = model.ringTime;
                this.satisfactionDescription = model.satisfactionDescription;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionSurveyChannel = model.satisfactionSurveyChannel;
                this.satisfactionSurveyOffered = model.satisfactionSurveyOffered;
                this.skillGroupIds = model.skillGroupIds;
                this.skillGroupNames = model.skillGroupNames;
                this.startTime = model.startTime;
                this.summaryIndex = model.summaryIndex;
                this.talkTime = model.talkTime;
                this.transferCount = model.transferCount;
                this.voicebotDestinationNumber = model.voicebotDestinationNumber;
                this.voicebotOriginatorNumber = model.voicebotOriginatorNumber;
                this.waitTime = model.waitTime;
            } 

            /**
             * <p>The channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8f6bcbad-6e2d-4ca3-9b65-91cf0aafdf00</p>
             */
            public Builder accessChannelId(String accessChannelId) {
                this.accessChannelId = accessChannelId;
                return this;
            }

            /**
             * <p>The channel name. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>TestChannel</p>
             */
            public Builder accessChannelName(String accessChannelName) {
                this.accessChannelName = accessChannelName;
                return this;
            }

            /**
             * <p>The channel type. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>Web</p>
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * <p>The visitor ID. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>test-user-id</p>
             */
            public Builder accessChannelUserId(String accessChannelUserId) {
                this.accessChannelUserId = accessChannelUserId;
                return this;
            }

            /**
             * <p>The visitor name. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>TestVisitor</p>
             */
            public Builder accessChannelUserName(String accessChannelUserName) {
                this.accessChannelUserName = accessChannelUserName;
                return this;
            }

            /**
             * <p>The additional intermediate number, which may be used in dual-call scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>0533128****</p>
             */
            public Builder additionalBroker(String additionalBroker) {
                this.additionalBroker = additionalBroker;
                return this;
            }

            /**
             * <p>The list of agent IDs. Multiple values are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder agentIds(String agentIds) {
                this.agentIds = agentIds;
                return this;
            }

            /**
             * <p>The list of agent names involved in the call. Multiple agents are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudCallCenterTestAgent</p>
             */
            public Builder agentNames(String agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * <p>The post-call analytics report.</p>
             */
            public Builder analyticsReport(AnalyticsReport analyticsReport) {
                this.analyticsReport = analyticsReport;
                return this;
            }

            /**
             * <p>Indicates whether the AI post-call analytics report is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder analyticsReportReady(Boolean analyticsReportReady) {
                this.analyticsReportReady = analyticsReportReady;
                return this;
            }

            /**
             * <p>The intermediate number.</p>
             * 
             * <strong>example:</strong>
             * <p>053xxxx3127</p>
             */
            public Builder broker(String broker) {
                this.broker = broker;
                return this;
            }

            /**
             * <p>The call duration. For inbound calls, timing starts when the call enters the IVR. For outbound calls, timing starts when the call is connected. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder callDuration(String callDuration) {
                this.callDuration = callDuration;
                return this;
            }

            /**
             * <p>The list of SIP CallIds.</p>
             * 
             * <strong>example:</strong>
             * <p>dxxx1sdf,xkkwwwa</p>
             */
            public Builder callIds(String callIds) {
                this.callIds = callIds;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>1332315****</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The location of the callee.</p>
             * 
             * <strong>example:</strong>
             * <p>Shandong-Jinan</p>
             */
            public Builder calleeLocation(String calleeLocation) {
                this.calleeLocation = calleeLocation;
                return this;
            }

            /**
             * <p>The location of the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing-Beijing</p>
             */
            public Builder callerLocation(String callerLocation) {
                this.callerLocation = callerLocation;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>0533128****</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The visitor client application name. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>Unknown</p>
             */
            public Builder clientAppName(String clientAppName) {
                this.clientAppName = clientAppName;
                return this;
            }

            /**
             * <p>The visitor client IP address. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>10.100.2.1</p>
             */
            public Builder clientIpAddress(String clientIpAddress) {
                this.clientIpAddress = clientIpAddress;
                return this;
            }

            /**
             * <p>The visitor client location. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder clientLocation(String clientLocation) {
                this.clientLocation = clientLocation;
                return this;
            }

            /**
             * <p>The visitor client user agent information. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36</p>
             */
            public Builder clientUserAgent(String clientUserAgent) {
                this.clientUserAgent = clientUserAgent;
                return this;
            }

            /**
             * <p>The call end reason. For the enumeration list, refer to the ContactDispositionList query parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder contactDisposition(String contactDisposition) {
                this.contactDisposition = contactDisposition;
                return this;
            }

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-2255019651513856</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The call type. For the enumeration list, refer to the ContactTypeList query parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>OUTBOUND</p>
             */
            public Builder contactType(String contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * <p>The dialing duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dialingTime(Long dialingTime) {
                this.dialingTime = dialingTime;
                return this;
            }

            /**
             * <p>The early media state.</p>
             * 
             * <strong>example:</strong>
             * <p>NotConnected</p>
             */
            public Builder earlyMediaState(String earlyMediaState) {
                this.earlyMediaState = earlyMediaState;
                return this;
            }

            /**
             * <p>The early media text.</p>
             * 
             * <strong>example:</strong>
             * <p>Currently on a call</p>
             */
            public Builder earlyMediaText(String earlyMediaText) {
                this.earlyMediaText = earlyMediaText;
                return this;
            }

            /**
             * <p>The time when the call was established. If the call was not established, this value is empty. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1532448000000</p>
             */
            public Builder establishedTime(Long establishedTime) {
                this.establishedTime = establishedTime;
                return this;
            }

            /**
             * <p>The time taken for the agent to first respond to the customer message. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder firstResponseTime(Long firstResponseTime) {
                this.firstResponseTime = firstResponseTime;
                return this;
            }

            /**
             * <p>The hold time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder heldTime(Long heldTime) {
                this.heldTime = heldTime;
                return this;
            }

            /**
             * <p>The call center instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IVR duration, which is the time from when the call enters the IVR to when it starts entering the manual service queue (or the customer abandons the call). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder ivrTime(Long ivrTime) {
                this.ivrTime = ivrTime;
                return this;
            }

            /**
             * <p>The media type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AUDIO: Voice.</li>
             * <li>CHAT: Message.</li>
             * <li>VIDEO: Video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHAT</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The total number of messages. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder messagesSent(Long messagesSent) {
                this.messagesSent = messagesSent;
                return this;
            }

            /**
             * <p>The total number of messages sent by the agent. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder messagesSentByAgent(Long messagesSentByAgent) {
                this.messagesSentByAgent = messagesSentByAgent;
                return this;
            }

            /**
             * <p>The total number of messages sent by the customer. This parameter has a value only when MediaType is CHAT.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder messagesSentByCustomer(Long messagesSentByCustomer) {
                this.messagesSentByCustomer = messagesSentByCustomer;
                return this;
            }

            /**
             * <p>The list of off-site agent IDs involved in the call. Multiple agents are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>skg-default@ccc-test</p>
             */
            public Builder offSiteAgentIds(String offSiteAgentIds) {
                this.offSiteAgentIds = offSiteAgentIds;
                return this;
            }

            /**
             * <p>The off-site agent number that is called when the assigned agent is an off-site agent.</p>
             * 
             * <strong>example:</strong>
             * <p>80312348</p>
             */
            public Builder offsiteAgentDestinationNumbers(String offsiteAgentDestinationNumbers) {
                this.offsiteAgentDestinationNumbers = offsiteAgentDestinationNumbers;
                return this;
            }

            /**
             * <p>The number that initiates the call to the off-site agent when the assigned agent is an off-site agent.</p>
             * 
             * <strong>example:</strong>
             * <p>0101257****</p>
             */
            public Builder offsiteAgentOriginatorNumbers(String offsiteAgentOriginatorNumbers) {
                this.offsiteAgentOriginatorNumbers = offsiteAgentOriginatorNumbers;
                return this;
            }

            /**
             * <p>The hangup reason of the last assigned offsite agent.</p>
             * 
             * <strong>example:</strong>
             * <p>IVRException</p>
             */
            public Builder offsiteAgentReleaseReason(String offsiteAgentReleaseReason) {
                this.offsiteAgentReleaseReason = offsiteAgentReleaseReason;
                return this;
            }

            /**
             * <p>The called number when the call is transferred to an outside line.</p>
             * 
             * <strong>example:</strong>
             * <p>134xxxxxx</p>
             */
            public Builder outsideNumberDestinationNumber(String outsideNumberDestinationNumber) {
                this.outsideNumberDestinationNumber = outsideNumberDestinationNumber;
                return this;
            }

            /**
             * <p>The hangup reason when the call is transferred to an outside line.</p>
             * 
             * <strong>example:</strong>
             * <p>NoAnswer</p>
             */
            public Builder outsideNumberReleaseReason(String outsideNumberReleaseReason) {
                this.outsideNumberReleaseReason = outsideNumberReleaseReason;
                return this;
            }

            /**
             * <p>The queue duration, which is the time from when the call enters the manual service queue to when the agent starts ringing (or the customer abandons the call, the queue times out, or the queue overflows). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * <p>The recording duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordingDuration(Long recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * <p>Indicates whether the recording has been generated. If the call was not established, false is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder recordingReady(Boolean recordingReady) {
                this.recordingReady = recordingReady;
                return this;
            }

            /**
             * <p>The party that hung up.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>agent: The agent.</li>
             * <li>customer: The customer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * <p>The hangup reason of the call channel, indicating why the current call channel was hung up. The value is a response code defined in the SIP protocol. Refer to the SIP protocol to analyze the hangup reason.</p>
             * 
             * <strong>example:</strong>
             * <p>486:USER_BUSY</p>
             */
            public Builder releaseReason(String releaseReason) {
                this.releaseReason = releaseReason;
                return this;
            }

            /**
             * <p>The time when the call ended, in Unix timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1532707199000</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The ringing duration, which is the time from when the agent starts ringing to when the agent answers (or the customer abandons the call). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder ringTime(Long ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * <p>The satisfaction description, which corresponds to the configuration of the satisfaction module in the satisfaction IVR and is defined by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>Satisfied</p>
             */
            public Builder satisfactionDescription(String satisfactionDescription) {
                this.satisfactionDescription = satisfactionDescription;
                return this;
            }

            /**
             * <p>The satisfaction rating, which is the value of the satisfaction key digit (a single digit).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder satisfactionIndex(Integer satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>The satisfaction survey channel.</p>
             * 
             * <strong>example:</strong>
             * <p>IVR</p>
             */
            public Builder satisfactionSurveyChannel(String satisfactionSurveyChannel) {
                this.satisfactionSurveyChannel = satisfactionSurveyChannel;
                return this;
            }

            /**
             * <p>Indicates whether a satisfaction survey was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder satisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
                this.satisfactionSurveyOffered = satisfactionSurveyOffered;
                return this;
            }

            /**
             * <p>The skill group IDs of the agents who participated in the call. Multiple skill groups are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>skg-default@ccc-test</p>
             */
            public Builder skillGroupIds(String skillGroupIds) {
                this.skillGroupIds = skillGroupIds;
                return this;
            }

            /**
             * <p>The skill group names of the agents who participated in the call. Multiple skill groups are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>TestSkillGroup1,TestSkillGroup2</p>
             */
            public Builder skillGroupNames(String skillGroupNames) {
                this.skillGroupNames = skillGroupNames;
                return this;
            }

            /**
             * <p>The time when the call started. For inbound calls, this is counted from when the call enters the IVR. For outbound calls, this is counted from when dialing begins. The value is in Unix timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1631440860000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The summary index.</p>
             */
            public Builder summaryIndex(SummaryIndex summaryIndex) {
                this.summaryIndex = summaryIndex;
                return this;
            }

            /**
             * <p>The talk time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder talkTime(Long talkTime) {
                this.talkTime = talkTime;
                return this;
            }

            /**
             * <p>The number of transfers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder transferCount(Long transferCount) {
                this.transferCount = transferCount;
                return this;
            }

            /**
             * <p>The outbound called number carried when the call is transferred from an intelligent outbound call.</p>
             * 
             * <strong>example:</strong>
             * <p>134xxxxxx</p>
             */
            public Builder voicebotDestinationNumber(String voicebotDestinationNumber) {
                this.voicebotDestinationNumber = voicebotDestinationNumber;
                return this;
            }

            /**
             * <p>The outbound caller number carried when the call is transferred from an intelligent outbound call.</p>
             * 
             * <strong>example:</strong>
             * <p>021xxxxxxx</p>
             */
            public Builder voicebotOriginatorNumber(String voicebotOriginatorNumber) {
                this.voicebotOriginatorNumber = voicebotOriginatorNumber;
                return this;
            }

            /**
             * <p>The customer wait time, which equals QueueTime + RingTime. If the customer abandons the call during the waiting period, the value is 0. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of call records.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
