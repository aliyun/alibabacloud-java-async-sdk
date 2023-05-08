// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallDetailRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallDetailRecordsResponseBody</p>
 */
public class ListCallDetailRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListCallDetailRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallDetailRecordsResponseBody create() {
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

        public ListCallDetailRecordsResponseBody build() {
            return new ListCallDetailRecordsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AdditionalBroker")
        private String additionalBroker;

        @NameInMap("AgentIds")
        private String agentIds;

        @NameInMap("AgentNames")
        private String agentNames;

        @NameInMap("Broker")
        private String broker;

        @NameInMap("CallDuration")
        private String callDuration;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CalleeLocation")
        private String calleeLocation;

        @NameInMap("CallerLocation")
        private String callerLocation;

        @NameInMap("CallingNumber")
        private String callingNumber;

        @NameInMap("ContactDisposition")
        private String contactDisposition;

        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("ContactType")
        private String contactType;

        @NameInMap("DialingTime")
        private Long dialingTime;

        @NameInMap("EarlyMediaState")
        private String earlyMediaState;

        @NameInMap("EstablishedTime")
        private Long establishedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IvrTime")
        private Long ivrTime;

        @NameInMap("QueueTime")
        private Long queueTime;

        @NameInMap("RecordingDuration")
        private Long recordingDuration;

        @NameInMap("RecordingReady")
        private Boolean recordingReady;

        @NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @NameInMap("ReleaseReason")
        private String releaseReason;

        @NameInMap("ReleaseTime")
        private Long releaseTime;

        @NameInMap("RingTime")
        private Long ringTime;

        @NameInMap("SatisfactionDescription")
        private String satisfactionDescription;

        @NameInMap("SatisfactionIndex")
        private Integer satisfactionIndex;

        @NameInMap("SatisfactionSurveyChannel")
        private String satisfactionSurveyChannel;

        @NameInMap("SatisfactionSurveyOffered")
        private Boolean satisfactionSurveyOffered;

        @NameInMap("SkillGroupIds")
        private String skillGroupIds;

        @NameInMap("SkillGroupNames")
        private String skillGroupNames;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("TalkTime")
        private Long talkTime;

        @NameInMap("WaitTime")
        private Long waitTime;

        private List(Builder builder) {
            this.additionalBroker = builder.additionalBroker;
            this.agentIds = builder.agentIds;
            this.agentNames = builder.agentNames;
            this.broker = builder.broker;
            this.callDuration = builder.callDuration;
            this.calledNumber = builder.calledNumber;
            this.calleeLocation = builder.calleeLocation;
            this.callerLocation = builder.callerLocation;
            this.callingNumber = builder.callingNumber;
            this.contactDisposition = builder.contactDisposition;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.dialingTime = builder.dialingTime;
            this.earlyMediaState = builder.earlyMediaState;
            this.establishedTime = builder.establishedTime;
            this.instanceId = builder.instanceId;
            this.ivrTime = builder.ivrTime;
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
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
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
         * @return establishedTime
         */
        public Long getEstablishedTime() {
            return this.establishedTime;
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
         * @return waitTime
         */
        public Long getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private String additionalBroker; 
            private String agentIds; 
            private String agentNames; 
            private String broker; 
            private String callDuration; 
            private String calledNumber; 
            private String calleeLocation; 
            private String callerLocation; 
            private String callingNumber; 
            private String contactDisposition; 
            private String contactId; 
            private String contactType; 
            private Long dialingTime; 
            private String earlyMediaState; 
            private Long establishedTime; 
            private String instanceId; 
            private Long ivrTime; 
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
            private Long waitTime; 

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
             * EstablishedTime.
             */
            public Builder establishedTime(Long establishedTime) {
                this.establishedTime = establishedTime;
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
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
