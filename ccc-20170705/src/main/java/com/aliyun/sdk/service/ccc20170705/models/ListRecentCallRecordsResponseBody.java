// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentCallRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentCallRecordsResponseBody</p>
 */
public class ListRecentCallRecordsResponseBody extends TeaModel {
    @NameInMap("CallDetailRecords")
    private CallDetailRecords callDetailRecords;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class CallDetailAgent extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("Feedback")
        private String feedback;

        @NameInMap("HoldTime")
        private Integer holdTime;

        @NameInMap("QueueTime")
        private Integer queueTime;

        @NameInMap("RingTime")
        private Integer ringTime;

        @NameInMap("Satisfaction")
        private String satisfaction;

        @NameInMap("SkillGroupName")
        private String skillGroupName;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("TalkTime")
        private Integer talkTime;

        @NameInMap("WorkTime")
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
    public static class Agents extends TeaModel {
        @NameInMap("CallDetailAgent")
        private java.util.List < CallDetailAgent> callDetailAgent;

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
        public java.util.List < CallDetailAgent> getCallDetailAgent() {
            return this.callDetailAgent;
        }

        public static final class Builder {
            private java.util.List < CallDetailAgent> callDetailAgent; 

            /**
             * CallDetailAgent.
             */
            public Builder callDetailAgent(java.util.List < CallDetailAgent> callDetailAgent) {
                this.callDetailAgent = callDetailAgent;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
    public static class Recording extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CallingNumber")
        private String callingNumber;

        @NameInMap("Channel")
        private String channel;

        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("ContactType")
        private String contactType;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("FileDescription")
        private String fileDescription;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("StartTime")
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
    public static class Recordings extends TeaModel {
        @NameInMap("Recording")
        private java.util.List < Recording> recording;

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
        public java.util.List < Recording> getRecording() {
            return this.recording;
        }

        public static final class Builder {
            private java.util.List < Recording> recording; 

            /**
             * Recording.
             */
            public Builder recording(java.util.List < Recording> recording) {
                this.recording = recording;
                return this;
            }

            public Recordings build() {
                return new Recordings(this);
            } 

        } 

    }
    public static class CallDetailRecord extends TeaModel {
        @NameInMap("AgentNames")
        private String agentNames;

        @NameInMap("Agents")
        private Agents agents;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CallingNumber")
        private String callingNumber;

        @NameInMap("ContactDisposition")
        private String contactDisposition;

        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("ContactType")
        private String contactType;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("ExtraAttr")
        private String extraAttr;

        @NameInMap("Feedback")
        private String feedback;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Recordings")
        private Recordings recordings;

        @NameInMap("Satisfaction")
        private Integer satisfaction;

        @NameInMap("SatisfactionDesc")
        private String satisfactionDesc;

        @NameInMap("SkillGroupNames")
        private String skillGroupNames;

        @NameInMap("StartTime")
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
    public static class List extends TeaModel {
        @NameInMap("CallDetailRecord")
        private java.util.List < CallDetailRecord> callDetailRecord;

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
        public java.util.List < CallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
        }

        public static final class Builder {
            private java.util.List < CallDetailRecord> callDetailRecord; 

            /**
             * CallDetailRecord.
             */
            public Builder callDetailRecord(java.util.List < CallDetailRecord> callDetailRecord) {
                this.callDetailRecord = callDetailRecord;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class CallDetailRecords extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
