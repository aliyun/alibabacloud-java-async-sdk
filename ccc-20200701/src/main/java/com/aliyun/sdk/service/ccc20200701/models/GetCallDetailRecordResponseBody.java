// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetCallDetailRecordResponseBody</p>
 */
public class GetCallDetailRecordResponseBody extends TeaModel {
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

    private GetCallDetailRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallDetailRecordResponseBody create() {
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

        public GetCallDetailRecordResponseBody build() {
            return new GetCallDetailRecordResponseBody(this);
        } 

    } 

    public static class EventSequence extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Event")
        private String event;

        @NameInMap("EventTime")
        private Long eventTime;

        private EventSequence(Builder builder) {
            this.duration = builder.duration;
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventSequence create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private Long duration; 
            private String event; 
            private Long eventTime; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public EventSequence build() {
                return new EventSequence(this);
            } 

        } 

    }
    public static class AgentEvents extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("EventSequence")
        private java.util.List < EventSequence> eventSequence;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        private AgentEvents(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.eventSequence = builder.eventSequence;
            this.skillGroupId = builder.skillGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentEvents create() {
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
         * @return eventSequence
         */
        public java.util.List < EventSequence> getEventSequence() {
            return this.eventSequence;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private java.util.List < EventSequence> eventSequence; 
            private String skillGroupId; 

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
             * EventSequence.
             */
            public Builder eventSequence(java.util.List < EventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            public AgentEvents build() {
                return new AgentEvents(this);
            } 

        } 

    }
    public static class CustomerEventsEventSequence extends TeaModel {
        @NameInMap("Event")
        private String event;

        @NameInMap("EventTime")
        private Long eventTime;

        private CustomerEventsEventSequence(Builder builder) {
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerEventsEventSequence create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private String event; 
            private Long eventTime; 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public CustomerEventsEventSequence build() {
                return new CustomerEventsEventSequence(this);
            } 

        } 

    }
    public static class CustomerEvents extends TeaModel {
        @NameInMap("CustomerId")
        private String customerId;

        @NameInMap("EventSequence")
        private java.util.List < CustomerEventsEventSequence> eventSequence;

        private CustomerEvents(Builder builder) {
            this.customerId = builder.customerId;
            this.eventSequence = builder.eventSequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerEvents create() {
            return builder().build();
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return eventSequence
         */
        public java.util.List < CustomerEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        public static final class Builder {
            private String customerId; 
            private java.util.List < CustomerEventsEventSequence> eventSequence; 

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * EventSequence.
             */
            public Builder eventSequence(java.util.List < CustomerEventsEventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            public CustomerEvents build() {
                return new CustomerEvents(this);
            } 

        } 

    }
    public static class IvrEventsEventSequence extends TeaModel {
        @NameInMap("Event")
        private String event;

        @NameInMap("EventTime")
        private Long eventTime;

        private IvrEventsEventSequence(Builder builder) {
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrEventsEventSequence create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private String event; 
            private Long eventTime; 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public IvrEventsEventSequence build() {
                return new IvrEventsEventSequence(this);
            } 

        } 

    }
    public static class IvrEvents extends TeaModel {
        @NameInMap("EventSequence")
        private java.util.List < IvrEventsEventSequence> eventSequence;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowType")
        private String flowType;

        private IvrEvents(Builder builder) {
            this.eventSequence = builder.eventSequence;
            this.flowId = builder.flowId;
            this.flowType = builder.flowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrEvents create() {
            return builder().build();
        }

        /**
         * @return eventSequence
         */
        public java.util.List < IvrEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        public static final class Builder {
            private java.util.List < IvrEventsEventSequence> eventSequence; 
            private String flowId; 
            private String flowType; 

            /**
             * EventSequence.
             */
            public Builder eventSequence(java.util.List < IvrEventsEventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowType.
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            public IvrEvents build() {
                return new IvrEvents(this);
            } 

        } 

    }
    public static class QueueEventsEventSequence extends TeaModel {
        @NameInMap("Event")
        private String event;

        @NameInMap("EventTime")
        private Long eventTime;

        private QueueEventsEventSequence(Builder builder) {
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueEventsEventSequence create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private String event; 
            private Long eventTime; 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public QueueEventsEventSequence build() {
                return new QueueEventsEventSequence(this);
            } 

        } 

    }
    public static class QueueEvents extends TeaModel {
        @NameInMap("EventSequence")
        private java.util.List < QueueEventsEventSequence> eventSequence;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("QueueId")
        private String queueId;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("QueueType")
        private Integer queueType;

        private QueueEvents(Builder builder) {
            this.eventSequence = builder.eventSequence;
            this.flowId = builder.flowId;
            this.queueId = builder.queueId;
            this.queueName = builder.queueName;
            this.queueType = builder.queueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueEvents create() {
            return builder().build();
        }

        /**
         * @return eventSequence
         */
        public java.util.List < QueueEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return queueId
         */
        public String getQueueId() {
            return this.queueId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return queueType
         */
        public Integer getQueueType() {
            return this.queueType;
        }

        public static final class Builder {
            private java.util.List < QueueEventsEventSequence> eventSequence; 
            private String flowId; 
            private String queueId; 
            private String queueName; 
            private Integer queueType; 

            /**
             * EventSequence.
             */
            public Builder eventSequence(java.util.List < QueueEventsEventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * QueueType.
             */
            public Builder queueType(Integer queueType) {
                this.queueType = queueType;
                return this;
            }

            public QueueEvents build() {
                return new QueueEvents(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AgentEvents")
        private java.util.List < AgentEvents> agentEvents;

        @NameInMap("AgentIds")
        private String agentIds;

        @NameInMap("AgentNames")
        private String agentNames;

        @NameInMap("CallDuration")
        private Long callDuration;

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

        @NameInMap("CustomerEvents")
        private java.util.List < CustomerEvents> customerEvents;

        @NameInMap("EarlyMediaState")
        private String earlyMediaState;

        @NameInMap("EstablishedTime")
        private Long establishedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IvrEvents")
        private java.util.List < IvrEvents> ivrEvents;

        @NameInMap("QueueEvents")
        private java.util.List < QueueEvents> queueEvents;

        @NameInMap("RecordingReady")
        private Boolean recordingReady;

        @NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @NameInMap("ReleaseReason")
        private String releaseReason;

        @NameInMap("ReleaseTime")
        private Long releaseTime;

        @NameInMap("Satisfaction")
        private Integer satisfaction;

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

        private Data(Builder builder) {
            this.agentEvents = builder.agentEvents;
            this.agentIds = builder.agentIds;
            this.agentNames = builder.agentNames;
            this.callDuration = builder.callDuration;
            this.calledNumber = builder.calledNumber;
            this.calleeLocation = builder.calleeLocation;
            this.callerLocation = builder.callerLocation;
            this.callingNumber = builder.callingNumber;
            this.contactDisposition = builder.contactDisposition;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.customerEvents = builder.customerEvents;
            this.earlyMediaState = builder.earlyMediaState;
            this.establishedTime = builder.establishedTime;
            this.instanceId = builder.instanceId;
            this.ivrEvents = builder.ivrEvents;
            this.queueEvents = builder.queueEvents;
            this.recordingReady = builder.recordingReady;
            this.releaseInitiator = builder.releaseInitiator;
            this.releaseReason = builder.releaseReason;
            this.releaseTime = builder.releaseTime;
            this.satisfaction = builder.satisfaction;
            this.satisfactionSurveyChannel = builder.satisfactionSurveyChannel;
            this.satisfactionSurveyOffered = builder.satisfactionSurveyOffered;
            this.skillGroupIds = builder.skillGroupIds;
            this.skillGroupNames = builder.skillGroupNames;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentEvents
         */
        public java.util.List < AgentEvents> getAgentEvents() {
            return this.agentEvents;
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
         * @return callDuration
         */
        public Long getCallDuration() {
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
         * @return customerEvents
         */
        public java.util.List < CustomerEvents> getCustomerEvents() {
            return this.customerEvents;
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
         * @return ivrEvents
         */
        public java.util.List < IvrEvents> getIvrEvents() {
            return this.ivrEvents;
        }

        /**
         * @return queueEvents
         */
        public java.util.List < QueueEvents> getQueueEvents() {
            return this.queueEvents;
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
         * @return satisfaction
         */
        public Integer getSatisfaction() {
            return this.satisfaction;
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

        public static final class Builder {
            private java.util.List < AgentEvents> agentEvents; 
            private String agentIds; 
            private String agentNames; 
            private Long callDuration; 
            private String calledNumber; 
            private String calleeLocation; 
            private String callerLocation; 
            private String callingNumber; 
            private String contactDisposition; 
            private String contactId; 
            private String contactType; 
            private java.util.List < CustomerEvents> customerEvents; 
            private String earlyMediaState; 
            private Long establishedTime; 
            private String instanceId; 
            private java.util.List < IvrEvents> ivrEvents; 
            private java.util.List < QueueEvents> queueEvents; 
            private Boolean recordingReady; 
            private String releaseInitiator; 
            private String releaseReason; 
            private Long releaseTime; 
            private Integer satisfaction; 
            private String satisfactionSurveyChannel; 
            private Boolean satisfactionSurveyOffered; 
            private String skillGroupIds; 
            private String skillGroupNames; 
            private Long startTime; 

            /**
             * AgentEvents.
             */
            public Builder agentEvents(java.util.List < AgentEvents> agentEvents) {
                this.agentEvents = agentEvents;
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
             * CallDuration.
             */
            public Builder callDuration(Long callDuration) {
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
             * CustomerEvents.
             */
            public Builder customerEvents(java.util.List < CustomerEvents> customerEvents) {
                this.customerEvents = customerEvents;
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
             * IvrEvents.
             */
            public Builder ivrEvents(java.util.List < IvrEvents> ivrEvents) {
                this.ivrEvents = ivrEvents;
                return this;
            }

            /**
             * QueueEvents.
             */
            public Builder queueEvents(java.util.List < QueueEvents> queueEvents) {
                this.queueEvents = queueEvents;
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
             * Satisfaction.
             */
            public Builder satisfaction(Integer satisfaction) {
                this.satisfaction = satisfaction;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
