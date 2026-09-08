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
 * {@link ListCallDetailRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallDetailRecordsResponseBody</p>
 */
public class ListCallDetailRecordsResponseBody extends TeaModel {
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

        private Builder(ListCallDetailRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCallDetailRecordsResponseBody build() {
            return new ListCallDetailRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCallDetailRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalBroker")
        private String additionalBroker;

        @com.aliyun.core.annotation.NameInMap("AgentIds")
        private String agentIds;

        @com.aliyun.core.annotation.NameInMap("AgentNames")
        private String agentNames;

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

        @com.aliyun.core.annotation.NameInMap("EstablishedTime")
        private Long establishedTime;

        @com.aliyun.core.annotation.NameInMap("HeldTime")
        private Long heldTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IvrTime")
        private Long ivrTime;

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

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Long waitTime;

        private List(Builder builder) {
            this.additionalBroker = builder.additionalBroker;
            this.agentIds = builder.agentIds;
            this.agentNames = builder.agentNames;
            this.broker = builder.broker;
            this.callDuration = builder.callDuration;
            this.callIds = builder.callIds;
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
            this.heldTime = builder.heldTime;
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
            private String callIds; 
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
            private Long heldTime; 
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

            private Builder() {
            } 

            private Builder(List model) {
                this.additionalBroker = model.additionalBroker;
                this.agentIds = model.agentIds;
                this.agentNames = model.agentNames;
                this.broker = model.broker;
                this.callDuration = model.callDuration;
                this.callIds = model.callIds;
                this.calledNumber = model.calledNumber;
                this.calleeLocation = model.calleeLocation;
                this.callerLocation = model.callerLocation;
                this.callingNumber = model.callingNumber;
                this.contactDisposition = model.contactDisposition;
                this.contactId = model.contactId;
                this.contactType = model.contactType;
                this.dialingTime = model.dialingTime;
                this.earlyMediaState = model.earlyMediaState;
                this.establishedTime = model.establishedTime;
                this.heldTime = model.heldTime;
                this.instanceId = model.instanceId;
                this.ivrTime = model.ivrTime;
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
                this.talkTime = model.talkTime;
                this.waitTime = model.waitTime;
            } 

            /**
             * <p>An additional broker number, which may be used in double-call scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>0533128****</p>
             */
            public Builder additionalBroker(String additionalBroker) {
                this.additionalBroker = additionalBroker;
                return this;
            }

            /**
             * <p>A list of agent IDs, with multiple values separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder agentIds(String agentIds) {
                this.agentIds = agentIds;
                return this;
            }

            /**
             * <p>List of agent names involved in the call, separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席小王</p>
             */
            public Builder agentNames(String agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * <p>The intermediary number.</p>
             * 
             * <strong>example:</strong>
             * <p>0533127****</p>
             */
            public Builder broker(String broker) {
                this.broker = broker;
                return this;
            }

            /**
             * <p>Call duration. For inbound calls, timing starts when the call enters IVR. For outbound calls, timing starts when the call is connected. The unit is seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder callDuration(String callDuration) {
                this.callDuration = callDuration;
                return this;
            }

            /**
             * <p>The Call-Id field in the underlying SIP protocol. If you need to obtain the call ID from the number provider side, you can retrieve it from this field.</p>
             * 
             * <strong>example:</strong>
             * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
             */
            public Builder callIds(String callIds) {
                this.callIds = callIds;
                return this;
            }

            /**
             * <p>Called number.</p>
             * 
             * <strong>example:</strong>
             * <p>1332315****</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The callee\&quot;s location.</p>
             * 
             * <strong>example:</strong>
             * <p>山东省-济南</p>
             */
            public Builder calleeLocation(String calleeLocation) {
                this.calleeLocation = calleeLocation;
                return this;
            }

            /**
             * <p>Caller location.</p>
             * 
             * <strong>example:</strong>
             * <p>北京市-北京</p>
             */
            public Builder callerLocation(String callerLocation) {
                this.callerLocation = callerLocation;
                return this;
            }

            /**
             * <p>Calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>0533128****</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>Reason for call termination.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder contactDisposition(String contactDisposition) {
                this.contactDisposition = contactDisposition;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-12515239414412****</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>Call type.</p>
             * 
             * <strong>example:</strong>
             * <p>Outbound</p>
             */
            public Builder contactType(String contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * <p>Dial-up duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dialingTime(Long dialingTime) {
                this.dialingTime = dialingTime;
                return this;
            }

            /**
             * <p>Reason for failure to connect.</p>
             * 
             * <strong>example:</strong>
             * <p>NotConnected</p>
             */
            public Builder earlyMediaState(String earlyMediaState) {
                this.earlyMediaState = earlyMediaState;
                return this;
            }

            /**
             * <p>The time when the call was established. If the call was not established, this value is empty. The format is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1532448000000</p>
             */
            public Builder establishedTime(Long establishedTime) {
                this.establishedTime = establishedTime;
                return this;
            }

            /**
             * <p>The hold duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder heldTime(Long heldTime) {
                this.heldTime = heldTime;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>IVR duration, in seconds. This is the time interval from when the IVR starts until the call enters the agent queue (or the customer hangs up).</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder ivrTime(Long ivrTime) {
                this.ivrTime = ivrTime;
                return this;
            }

            /**
             * <p>The queue duration, in seconds, measured from when the customer entered the agent queue until the agent started ringing (or the customer abandoned the call, the queue timed out, or the queue overflowed).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * <p>Recording duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordingDuration(Long recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * <p>Indicates whether the recording has been generated. Returns false if the call was not established.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder recordingReady(Boolean recordingReady) {
                this.recordingReady = recordingReady;
                return this;
            }

            /**
             * <p>The party that ended the call.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * <p>Hang-up reason for the channel, indicating why the current channel was disconnected. The value is derived from response codes defined in the SIP protocol. Customers should refer to the SIP protocol to analyze the hang-up reason.</p>
             * 
             * <strong>example:</strong>
             * <p>486:USER_BUSY</p>
             */
            public Builder releaseReason(String releaseReason) {
                this.releaseReason = releaseReason;
                return this;
            }

            /**
             * <p>The call end time, formatted as a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1532707199000</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>Ring duration, which is the time from when the agent\&quot;s phone starts ringing until the agent answers (or the customer hangs up), in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder ringTime(Long ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * <p>The satisfaction description, corresponding to the configuration of the satisfaction module in the satisfaction IVR. This is defined by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>满意</p>
             */
            public Builder satisfactionDescription(String satisfactionDescription) {
                this.satisfactionDescription = satisfactionDescription;
                return this;
            }

            /**
             * <p>Satisfaction rating, represented as a single-digit numeric value entered by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder satisfactionIndex(Integer satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>The channel used for the satisfaction survey.</p>
             * 
             * <strong>example:</strong>
             * <p>IVR</p>
             */
            public Builder satisfactionSurveyChannel(String satisfactionSurveyChannel) {
                this.satisfactionSurveyChannel = satisfactionSurveyChannel;
                return this;
            }

            /**
             * <p>Indicates whether a satisfaction survey was initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder satisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
                this.satisfactionSurveyOffered = satisfactionSurveyOffered;
                return this;
            }

            /**
             * <p>The IDs of the skill groups to which the agents participating in the call belong. Multiple skill group IDs are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder skillGroupIds(String skillGroupIds) {
                this.skillGroupIds = skillGroupIds;
                return this;
            }

            /**
             * <p>The names of the skill groups to which the agents participating in the call belong. Multiple skill group names are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>测试技能组</p>
             */
            public Builder skillGroupNames(String skillGroupNames) {
                this.skillGroupNames = skillGroupNames;
                return this;
            }

            /**
             * <p>Call start time. For inbound calls, timing starts when the call enters IVR. For outbound calls, timing starts from dial-up. The format is a Unix string in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1532448000000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder talkTime(Long talkTime) {
                this.talkTime = talkTime;
                return this;
            }

            /**
             * <p>The customer\&quot;s waiting duration, which equals QueueTime plus RingTime. If the customer abandons the call during waiting, the value is 0. The unit is seconds.</p>
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
     * {@link ListCallDetailRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsResponseBody</p>
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
             * <p>List of call records.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count. A real numeric value is returned only when PageNumber is 1; otherwise, 0 is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
