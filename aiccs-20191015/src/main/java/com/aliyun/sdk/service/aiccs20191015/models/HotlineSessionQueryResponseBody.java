// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link HotlineSessionQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotlineSessionQueryResponseBody</p>
 */
public class HotlineSessionQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private HotlineSessionQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotlineSessionQueryResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(HotlineSessionQueryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of Success indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The call data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE339D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public HotlineSessionQueryResponseBody build() {
            return new HotlineSessionQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotlineSessionQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotlineSessionQueryResponseBody</p>
     */
    public static class CallDetailRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acid")
        private String acid;

        @com.aliyun.core.annotation.NameInMap("ActiveTransferId")
        private String activeTransferId;

        @com.aliyun.core.annotation.NameInMap("CallContinueTime")
        private Integer callContinueTime;

        @com.aliyun.core.annotation.NameInMap("CallResult")
        private String callResult;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Integer callType;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EvaluationLevel")
        private Integer evaluationLevel;

        @com.aliyun.core.annotation.NameInMap("EvaluationScore")
        private Integer evaluationScore;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HangUpRole")
        private String hangUpRole;

        @com.aliyun.core.annotation.NameInMap("HangUpTime")
        private String hangUpTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InQueueTime")
        private String inQueueTime;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("OutQueueTime")
        private String outQueueTime;

        @com.aliyun.core.annotation.NameInMap("PassiveTransferId")
        private String passiveTransferId;

        @com.aliyun.core.annotation.NameInMap("PassiveTransferIdType")
        private String passiveTransferIdType;

        @com.aliyun.core.annotation.NameInMap("PickUpTime")
        private String pickUpTime;

        @com.aliyun.core.annotation.NameInMap("QueueUpContinueTime")
        private Integer queueUpContinueTime;

        @com.aliyun.core.annotation.NameInMap("RingContinueTime")
        private Integer ringContinueTime;

        @com.aliyun.core.annotation.NameInMap("RingEndTime")
        private String ringEndTime;

        @com.aliyun.core.annotation.NameInMap("RingStartTime")
        private String ringStartTime;

        @com.aliyun.core.annotation.NameInMap("ServicerId")
        private String servicerId;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("TrunkCall")
        private String trunkCall;

        private CallDetailRecord(Builder builder) {
            this.acid = builder.acid;
            this.activeTransferId = builder.activeTransferId;
            this.callContinueTime = builder.callContinueTime;
            this.callResult = builder.callResult;
            this.callType = builder.callType;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.createTime = builder.createTime;
            this.evaluationLevel = builder.evaluationLevel;
            this.evaluationScore = builder.evaluationScore;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.hangUpRole = builder.hangUpRole;
            this.hangUpTime = builder.hangUpTime;
            this.id = builder.id;
            this.inQueueTime = builder.inQueueTime;
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.outQueueTime = builder.outQueueTime;
            this.passiveTransferId = builder.passiveTransferId;
            this.passiveTransferIdType = builder.passiveTransferIdType;
            this.pickUpTime = builder.pickUpTime;
            this.queueUpContinueTime = builder.queueUpContinueTime;
            this.ringContinueTime = builder.ringContinueTime;
            this.ringEndTime = builder.ringEndTime;
            this.ringStartTime = builder.ringStartTime;
            this.servicerId = builder.servicerId;
            this.servicerName = builder.servicerName;
            this.trunkCall = builder.trunkCall;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallDetailRecord create() {
            return builder().build();
        }

        /**
         * @return acid
         */
        public String getAcid() {
            return this.acid;
        }

        /**
         * @return activeTransferId
         */
        public String getActiveTransferId() {
            return this.activeTransferId;
        }

        /**
         * @return callContinueTime
         */
        public Integer getCallContinueTime() {
            return this.callContinueTime;
        }

        /**
         * @return callResult
         */
        public String getCallResult() {
            return this.callResult;
        }

        /**
         * @return callType
         */
        public Integer getCallType() {
            return this.callType;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return evaluationLevel
         */
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        /**
         * @return evaluationScore
         */
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return hangUpRole
         */
        public String getHangUpRole() {
            return this.hangUpRole;
        }

        /**
         * @return hangUpTime
         */
        public String getHangUpTime() {
            return this.hangUpTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inQueueTime
         */
        public String getInQueueTime() {
            return this.inQueueTime;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return outQueueTime
         */
        public String getOutQueueTime() {
            return this.outQueueTime;
        }

        /**
         * @return passiveTransferId
         */
        public String getPassiveTransferId() {
            return this.passiveTransferId;
        }

        /**
         * @return passiveTransferIdType
         */
        public String getPassiveTransferIdType() {
            return this.passiveTransferIdType;
        }

        /**
         * @return pickUpTime
         */
        public String getPickUpTime() {
            return this.pickUpTime;
        }

        /**
         * @return queueUpContinueTime
         */
        public Integer getQueueUpContinueTime() {
            return this.queueUpContinueTime;
        }

        /**
         * @return ringContinueTime
         */
        public Integer getRingContinueTime() {
            return this.ringContinueTime;
        }

        /**
         * @return ringEndTime
         */
        public String getRingEndTime() {
            return this.ringEndTime;
        }

        /**
         * @return ringStartTime
         */
        public String getRingStartTime() {
            return this.ringStartTime;
        }

        /**
         * @return servicerId
         */
        public String getServicerId() {
            return this.servicerId;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return trunkCall
         */
        public String getTrunkCall() {
            return this.trunkCall;
        }

        public static final class Builder {
            private String acid; 
            private String activeTransferId; 
            private Integer callContinueTime; 
            private String callResult; 
            private Integer callType; 
            private String calledNumber; 
            private String callingNumber; 
            private String createTime; 
            private Integer evaluationLevel; 
            private Integer evaluationScore; 
            private Long groupId; 
            private String groupName; 
            private String hangUpRole; 
            private String hangUpTime; 
            private String id; 
            private String inQueueTime; 
            private String memberId; 
            private String memberName; 
            private String outQueueTime; 
            private String passiveTransferId; 
            private String passiveTransferIdType; 
            private String pickUpTime; 
            private Integer queueUpContinueTime; 
            private Integer ringContinueTime; 
            private String ringEndTime; 
            private String ringStartTime; 
            private String servicerId; 
            private String servicerName; 
            private String trunkCall; 

            private Builder() {
            } 

            private Builder(CallDetailRecord model) {
                this.acid = model.acid;
                this.activeTransferId = model.activeTransferId;
                this.callContinueTime = model.callContinueTime;
                this.callResult = model.callResult;
                this.callType = model.callType;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.createTime = model.createTime;
                this.evaluationLevel = model.evaluationLevel;
                this.evaluationScore = model.evaluationScore;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.hangUpRole = model.hangUpRole;
                this.hangUpTime = model.hangUpTime;
                this.id = model.id;
                this.inQueueTime = model.inQueueTime;
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.outQueueTime = model.outQueueTime;
                this.passiveTransferId = model.passiveTransferId;
                this.passiveTransferIdType = model.passiveTransferIdType;
                this.pickUpTime = model.pickUpTime;
                this.queueUpContinueTime = model.queueUpContinueTime;
                this.ringContinueTime = model.ringContinueTime;
                this.ringEndTime = model.ringEndTime;
                this.ringStartTime = model.ringStartTime;
                this.servicerId = model.servicerId;
                this.servicerName = model.servicerName;
                this.trunkCall = model.trunkCall;
            } 

            /**
             * <p>The session ID. The acid in the websocket after an inbound call.</p>
             * 
             * <strong>example:</strong>
             * <p>7719786</p>
             */
            public Builder acid(String acid) {
                this.acid = acid;
                return this;
            }

            /**
             * <p>The agent ID.</p>
             * <blockquote>
             * <p>This value is Null in non-transfer scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder activeTransferId(String activeTransferId) {
                this.activeTransferId = activeTransferId;
                return this;
            }

            /**
             * <p>The call duration. Unit: seconds.</p>
             * <blockquote>
             * <p>No call duration is available in scenarios where the call is not connected.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>37</p>
             */
            public Builder callContinueTime(Integer callContinueTime) {
                this.callContinueTime = callContinueTime;
                return this;
            }

            /**
             * <p>The call result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal hangup.</li>
             * <li><strong>touchRouteError</strong>: queue hangup.</li>
             * <li><strong>touchInQueue</strong>: queue hangup.</li>
             * <li><strong>touchInLoss</strong>: queue hangup.</li>
             * <li><strong>userHangup</strong>: user hangup or IVR hangup.</li>
             * <li><strong>sysHangup</strong>: system hangup or IVR hangup.</li>
             * <li><strong>transferAgent</strong>: user hangup or IVR hangup.</li>
             * <li><strong>dailing</strong>: agent hangup or ringing hangup.</li>
             * <li><strong>TouchRingCallLoss</strong>: queue hangup or ringing hangup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder callResult(String callResult) {
                this.callResult = callResult;
                return this;
            }

            /**
             * <p>The call type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: outbound call</li>
             * <li><strong>2</strong>: inbound call</li>
             * <li><strong>3</strong>: transferred call</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callType(Integer callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>135615*****</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The number of the caller. For example, a mobile phone number of a user, an agent number, or a robot number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571773</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The time when the call was created. Format: YYYY-MM-DD HH:mm:ss.</p>
             * <blockquote>
             * <ul>
             * <li>For outbound call scenarios, this is the time when the outbound call was initiated.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>For inbound call scenarios, this is the time when the call entered the ACC system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02 22:32:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The satisfaction rating level. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: 2-level satisfaction</li>
             * <li><strong>3</strong>: 3-level satisfaction</li>
             * <li><strong>4</strong>: 4-level satisfaction</li>
             * <li><strong>5</strong>: 5-level satisfaction</li>
             * </ul>
             * <blockquote>
             * <p>No data is available for outbound call scenarios or scenarios where the call is not connected.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder evaluationLevel(Integer evaluationLevel) {
                this.evaluationLevel = evaluationLevel;
                return this;
            }

            /**
             * <p>The satisfaction rating score. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Very dissatisfied.</li>
             * <li><strong>2</strong>: Dissatisfied.</li>
             * <li><strong>3</strong>: Average.</li>
             * <li><strong>4</strong>: Satisfied.</li>
             * <li><strong>5</strong>: Very satisfied.</li>
             * </ul>
             * <blockquote>
             * <p>No data is available for outbound call scenarios or scenarios where the call is not connected.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder evaluationScore(Integer evaluationScore) {
                this.evaluationScore = evaluationScore;
                return this;
            }

            /**
             * <p>The skill group ID.</p>
             * <blockquote>
             * <p>When CallType is set to <strong>1</strong>, no skill group information is available for outbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The skill group name.</p>
             * <blockquote>
             * <p>When CallType is set to <strong>1</strong>, no skill group information is available for outbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>AutomationSkillGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The party that hung up. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: System hung up.</li>
             * <li><strong>2</strong>: Customer hung up.</li>
             * <li><strong>3</strong>: Agent hung up.</li>
             * <li><strong>null</strong>: Unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder hangUpRole(String hangUpRole) {
                this.hangUpRole = hangUpRole;
                return this;
            }

            /**
             * <p>The hang-up time. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02 22:33:46</p>
             */
            public Builder hangUpTime(String hangUpTime) {
                this.hangUpTime = hangUpTime;
                return this;
            }

            /**
             * <p>The globally unique ID of the call details.</p>
             * 
             * <strong>example:</strong>
             * <p>acc1c58dab4a4dd280e3813c66</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the call entered the queue for hotline assignment. Format: YYYY-MM-DD HH:mm:ss.</p>
             * <blockquote>
             * <p>No queue entry time is available for outbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02 22:32:55</p>
             */
            public Builder inQueueTime(String inQueueTime) {
                this.inQueueTime = inQueueTime;
                return this;
            }

            /**
             * <p>The member ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7856876</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The member name.</p>
             * 
             * <strong>example:</strong>
             * <p>AnonymousMember</p>
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * <p>The time when the call left the queue for hotline assignment. Format: YYYY-MM-DD HH:mm:ss.</p>
             * <blockquote>
             * <p>No queue exit time is available for outbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02 22:32:59</p>
             */
            public Builder outQueueTime(String outQueueTime) {
                this.outQueueTime = outQueueTime;
                return this;
            }

            /**
             * <p>The agent ID or transferred phone number.</p>
             * <blockquote>
             * <p>This value is Null in non-transfer scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder passiveTransferId(String passiveTransferId) {
                this.passiveTransferId = passiveTransferId;
                return this;
            }

            /**
             * <p>The type of the party to which the session was transferred. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Agent ID.</li>
             * <li><strong>2</strong>: Transferred phone number.</li>
             * </ul>
             * <blockquote>
             * <p>This value is Null in non-transfer scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passiveTransferIdType(String passiveTransferIdType) {
                this.passiveTransferIdType = passiveTransferIdType;
                return this;
            }

            /**
             * <p>The time when the call was answered. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02 22:33:09</p>
             */
            public Builder pickUpTime(String pickUpTime) {
                this.pickUpTime = pickUpTime;
                return this;
            }

            /**
             * <p>The queue waiting duration.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder queueUpContinueTime(Integer queueUpContinueTime) {
                this.queueUpContinueTime = queueUpContinueTime;
                return this;
            }

            /**
             * <p>The ringing duration. Unit: seconds.</p>
             * <blockquote>
             * <p>No ringing duration is available for outbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ringContinueTime(Integer ringContinueTime) {
                this.ringContinueTime = ringContinueTime;
                return this;
            }

            /**
             * <p>The time when ringing ended. Format: YYYY-MM-DD HH:mm:ss.</p>
             * <blockquote>
             * <p>No ringing end time is available for outbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02 22:33:09</p>
             */
            public Builder ringEndTime(String ringEndTime) {
                this.ringEndTime = ringEndTime;
                return this;
            }

            /**
             * <p>The time when ringing started. Format: YYYY-MM-DD HH:mm:ss.</p>
             * <blockquote>
             * <p>No ringing start time is available for outbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02 22:32:59</p>
             */
            public Builder ringStartTime(String ringStartTime) {
                this.ringStartTime = ringStartTime;
                return this;
            }

            /**
             * <p>The agent ID.</p>
             * <blockquote>
             * <p>No agent information is available before the call is assigned to an agent in inbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>555555</p>
             */
            public Builder servicerId(String servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * <blockquote>
             * <p>No agent information is available before the call is assigned to an agent in inbound call scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>TestAgent</p>
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * <p>The long-distance call.</p>
             * 
             * <strong>example:</strong>
             * <p>1861111****</p>
             */
            public Builder trunkCall(String trunkCall) {
                this.trunkCall = trunkCall;
                return this;
            }

            public CallDetailRecord build() {
                return new CallDetailRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotlineSessionQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotlineSessionQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallDetailRecord")
        private java.util.List<CallDetailRecord> callDetailRecord;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.callDetailRecord = builder.callDetailRecord;
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
         * @return callDetailRecord
         */
        public java.util.List<CallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
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
            private java.util.List<CallDetailRecord> callDetailRecord; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callDetailRecord = model.callDetailRecord;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The call detail records.</p>
             */
            public Builder callDetailRecord(java.util.List<CallDetailRecord> callDetailRecord) {
                this.callDetailRecord = callDetailRecord;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
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
