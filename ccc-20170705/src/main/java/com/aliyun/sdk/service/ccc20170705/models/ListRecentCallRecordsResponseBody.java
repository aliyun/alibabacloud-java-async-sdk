// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentCallRecordsResponseBody</p>
 */
public class ListRecentCallRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallDetailRecords")
    private CallDetailRecords callDetailRecords;

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

    private ListRecentCallRecordsResponseBody(Builder builder) {
        this.callDetailRecords = builder.callDetailRecords;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentCallRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callDetailRecords
     */
    public CallDetailRecords getCallDetailRecords() {
        return this.callDetailRecords;
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

    public static final class Builder {
        private CallDetailRecords callDetailRecords; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRecentCallRecordsResponseBody model) {
            this.callDetailRecords = model.callDetailRecords;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * CallDetailRecords.
         */
        public Builder callDetailRecords(CallDetailRecords callDetailRecords) {
            this.callDetailRecords = callDetailRecords;
            return this;
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

        public ListRecentCallRecordsResponseBody build() {
            return new ListRecentCallRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallRecordsResponseBody</p>
     */
    public static class CallDetailAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("HoldTime")
        private Integer holdTime;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Integer queueTime;

        @com.aliyun.core.annotation.NameInMap("RingTime")
        private Integer ringTime;

        @com.aliyun.core.annotation.NameInMap("Satisfaction")
        private String satisfaction;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TalkTime")
        private Integer talkTime;

        @com.aliyun.core.annotation.NameInMap("WorkTime")
        private Integer workTime;

        private CallDetailAgent(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.contactId = builder.contactId;
            this.feedback = builder.feedback;
            this.holdTime = builder.holdTime;
            this.queueTime = builder.queueTime;
            this.ringTime = builder.ringTime;
            this.satisfaction = builder.satisfaction;
            this.skillGroupName = builder.skillGroupName;
            this.startTime = builder.startTime;
            this.talkTime = builder.talkTime;
            this.workTime = builder.workTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallDetailAgent create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return holdTime
         */
        public Integer getHoldTime() {
            return this.holdTime;
        }

        /**
         * @return queueTime
         */
        public Integer getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return ringTime
         */
        public Integer getRingTime() {
            return this.ringTime;
        }

        /**
         * @return satisfaction
         */
        public String getSatisfaction() {
            return this.satisfaction;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
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
        public Integer getTalkTime() {
            return this.talkTime;
        }

        /**
         * @return workTime
         */
        public Integer getWorkTime() {
            return this.workTime;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String contactId; 
            private String feedback; 
            private Integer holdTime; 
            private Integer queueTime; 
            private Integer ringTime; 
            private String satisfaction; 
            private String skillGroupName; 
            private Long startTime; 
            private Integer talkTime; 
            private Integer workTime; 

            private Builder() {
            } 

            private Builder(CallDetailAgent model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.contactId = model.contactId;
                this.feedback = model.feedback;
                this.holdTime = model.holdTime;
                this.queueTime = model.queueTime;
                this.ringTime = model.ringTime;
                this.satisfaction = model.satisfaction;
                this.skillGroupName = model.skillGroupName;
                this.startTime = model.startTime;
                this.talkTime = model.talkTime;
                this.workTime = model.workTime;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
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
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * HoldTime.
             */
            public Builder holdTime(Integer holdTime) {
                this.holdTime = holdTime;
                return this;
            }

            /**
             * QueueTime.
             */
            public Builder queueTime(Integer queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * RingTime.
             */
            public Builder ringTime(Integer ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * Satisfaction.
             */
            public Builder satisfaction(String satisfaction) {
                this.satisfaction = satisfaction;
                return this;
            }

            /**
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
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
            public Builder talkTime(Integer talkTime) {
                this.talkTime = talkTime;
                return this;
            }

            /**
             * WorkTime.
             */
            public Builder workTime(Integer workTime) {
                this.workTime = workTime;
                return this;
            }

            public CallDetailAgent build() {
                return new CallDetailAgent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallRecordsResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallDetailAgent")
        private java.util.List<CallDetailAgent> callDetailAgent;

        private Agents(Builder builder) {
            this.callDetailAgent = builder.callDetailAgent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return callDetailAgent
         */
        public java.util.List<CallDetailAgent> getCallDetailAgent() {
            return this.callDetailAgent;
        }

        public static final class Builder {
            private java.util.List<CallDetailAgent> callDetailAgent; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.callDetailAgent = model.callDetailAgent;
            } 

            /**
             * CallDetailAgent.
             */
            public Builder callDetailAgent(java.util.List<CallDetailAgent> callDetailAgent) {
                this.callDetailAgent = callDetailAgent;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallRecordsResponseBody</p>
     */
    public static class Recording extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactType")
        private String contactType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("FileDescription")
        private String fileDescription;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Recording(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.channel = builder.channel;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.duration = builder.duration;
            this.fileDescription = builder.fileDescription;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recording create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
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
         * @return channel
         */
        public String getChannel() {
            return this.channel;
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
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fileDescription
         */
        public String getFileDescription() {
            return this.fileDescription;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String calledNumber; 
            private String callingNumber; 
            private String channel; 
            private String contactId; 
            private String contactType; 
            private Integer duration; 
            private String fileDescription; 
            private String fileName; 
            private String filePath; 
            private String instanceId; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Recording model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.channel = model.channel;
                this.contactId = model.contactId;
                this.contactType = model.contactType;
                this.duration = model.duration;
                this.fileDescription = model.fileDescription;
                this.fileName = model.fileName;
                this.filePath = model.filePath;
                this.instanceId = model.instanceId;
                this.startTime = model.startTime;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
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
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
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
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileDescription.
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
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
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Recording build() {
                return new Recording(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallRecordsResponseBody</p>
     */
    public static class Recordings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Recording")
        private java.util.List<Recording> recording;

        private Recordings(Builder builder) {
            this.recording = builder.recording;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recordings create() {
            return builder().build();
        }

        /**
         * @return recording
         */
        public java.util.List<Recording> getRecording() {
            return this.recording;
        }

        public static final class Builder {
            private java.util.List<Recording> recording; 

            private Builder() {
            } 

            private Builder(Recordings model) {
                this.recording = model.recording;
            } 

            /**
             * Recording.
             */
            public Builder recording(java.util.List<Recording> recording) {
                this.recording = recording;
                return this;
            }

            public Recordings build() {
                return new Recordings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallRecordsResponseBody</p>
     */
    public static class CallDetailRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentNames")
        private String agentNames;

        @com.aliyun.core.annotation.NameInMap("Agents")
        private Agents agents;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ContactDisposition")
        private String contactDisposition;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactType")
        private String contactType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("ExtraAttr")
        private String extraAttr;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Recordings")
        private Recordings recordings;

        @com.aliyun.core.annotation.NameInMap("Satisfaction")
        private Integer satisfaction;

        @com.aliyun.core.annotation.NameInMap("SatisfactionDesc")
        private String satisfactionDesc;

        @com.aliyun.core.annotation.NameInMap("SkillGroupNames")
        private String skillGroupNames;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private CallDetailRecord(Builder builder) {
            this.agentNames = builder.agentNames;
            this.agents = builder.agents;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.contactDisposition = builder.contactDisposition;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.duration = builder.duration;
            this.extraAttr = builder.extraAttr;
            this.feedback = builder.feedback;
            this.instanceId = builder.instanceId;
            this.recordings = builder.recordings;
            this.satisfaction = builder.satisfaction;
            this.satisfactionDesc = builder.satisfactionDesc;
            this.skillGroupNames = builder.skillGroupNames;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallDetailRecord create() {
            return builder().build();
        }

        /**
         * @return agentNames
         */
        public String getAgentNames() {
            return this.agentNames;
        }

        /**
         * @return agents
         */
        public Agents getAgents() {
            return this.agents;
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
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return extraAttr
         */
        public String getExtraAttr() {
            return this.extraAttr;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return recordings
         */
        public Recordings getRecordings() {
            return this.recordings;
        }

        /**
         * @return satisfaction
         */
        public Integer getSatisfaction() {
            return this.satisfaction;
        }

        /**
         * @return satisfactionDesc
         */
        public String getSatisfactionDesc() {
            return this.satisfactionDesc;
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

        public static final class Builder {
            private String agentNames; 
            private Agents agents; 
            private String calledNumber; 
            private String callingNumber; 
            private String contactDisposition; 
            private String contactId; 
            private String contactType; 
            private Integer duration; 
            private String extraAttr; 
            private String feedback; 
            private String instanceId; 
            private Recordings recordings; 
            private Integer satisfaction; 
            private String satisfactionDesc; 
            private String skillGroupNames; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(CallDetailRecord model) {
                this.agentNames = model.agentNames;
                this.agents = model.agents;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.contactDisposition = model.contactDisposition;
                this.contactId = model.contactId;
                this.contactType = model.contactType;
                this.duration = model.duration;
                this.extraAttr = model.extraAttr;
                this.feedback = model.feedback;
                this.instanceId = model.instanceId;
                this.recordings = model.recordings;
                this.satisfaction = model.satisfaction;
                this.satisfactionDesc = model.satisfactionDesc;
                this.skillGroupNames = model.skillGroupNames;
                this.startTime = model.startTime;
            } 

            /**
             * AgentNames.
             */
            public Builder agentNames(String agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * Agents.
             */
            public Builder agents(Agents agents) {
                this.agents = agents;
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
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ExtraAttr.
             */
            public Builder extraAttr(String extraAttr) {
                this.extraAttr = extraAttr;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
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
             * Recordings.
             */
            public Builder recordings(Recordings recordings) {
                this.recordings = recordings;
                return this;
            }

            /**
             * Satisfaction.
             */
            public Builder satisfaction(Integer satisfaction) {
                this.satisfaction = satisfaction;
                return this;
            }

            /**
             * SatisfactionDesc.
             */
            public Builder satisfactionDesc(String satisfactionDesc) {
                this.satisfactionDesc = satisfactionDesc;
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

            public CallDetailRecord build() {
                return new CallDetailRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallRecordsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallDetailRecord")
        private java.util.List<CallDetailRecord> callDetailRecord;

        private List(Builder builder) {
            this.callDetailRecord = builder.callDetailRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return callDetailRecord
         */
        public java.util.List<CallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
        }

        public static final class Builder {
            private java.util.List<CallDetailRecord> callDetailRecord; 

            private Builder() {
            } 

            private Builder(List model) {
                this.callDetailRecord = model.callDetailRecord;
            } 

            /**
             * CallDetailRecord.
             */
            public Builder callDetailRecord(java.util.List<CallDetailRecord> callDetailRecord) {
                this.callDetailRecord = callDetailRecord;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallRecordsResponseBody</p>
     */
    public static class CallDetailRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private CallDetailRecords(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallDetailRecords create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
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
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(CallDetailRecords model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
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

            public CallDetailRecords build() {
                return new CallDetailRecords(this);
            } 

        } 

    }
}
