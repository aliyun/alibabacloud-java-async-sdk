// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotlineSessionQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotlineSessionQueryResponseBody</p>
 */
public class HotlineSessionQueryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public HotlineSessionQueryResponseBody build() {
            return new HotlineSessionQueryResponseBody(this);
        } 

    } 

    public static class CallDetailRecord extends TeaModel {
        @NameInMap("Acid")
        private String acid;

        @NameInMap("ActiveTransferId")
        private String activeTransferId;

        @NameInMap("CallContinueTime")
        private Integer callContinueTime;

        @NameInMap("CallResult")
        private String callResult;

        @NameInMap("CallType")
        private Integer callType;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CallingNumber")
        private String callingNumber;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EvaluationLevel")
        private Integer evaluationLevel;

        @NameInMap("EvaluationScore")
        private Integer evaluationScore;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HangUpRole")
        private String hangUpRole;

        @NameInMap("HangUpTime")
        private String hangUpTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("InQueueTime")
        private String inQueueTime;

        @NameInMap("MemberId")
        private String memberId;

        @NameInMap("MemberName")
        private String memberName;

        @NameInMap("OutQueueTime")
        private String outQueueTime;

        @NameInMap("PassiveTransferId")
        private String passiveTransferId;

        @NameInMap("PassiveTransferIdType")
        private String passiveTransferIdType;

        @NameInMap("PickUpTime")
        private String pickUpTime;

        @NameInMap("QueueUpContinueTime")
        private Integer queueUpContinueTime;

        @NameInMap("RingContinueTime")
        private Integer ringContinueTime;

        @NameInMap("RingEndTime")
        private String ringEndTime;

        @NameInMap("RingStartTime")
        private String ringStartTime;

        @NameInMap("ServicerId")
        private String servicerId;

        @NameInMap("ServicerName")
        private String servicerName;

        @NameInMap("TrunkCall")
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

            /**
             * Acid.
             */
            public Builder acid(String acid) {
                this.acid = acid;
                return this;
            }

            /**
             * ActiveTransferId.
             */
            public Builder activeTransferId(String activeTransferId) {
                this.activeTransferId = activeTransferId;
                return this;
            }

            /**
             * CallContinueTime.
             */
            public Builder callContinueTime(Integer callContinueTime) {
                this.callContinueTime = callContinueTime;
                return this;
            }

            /**
             * CallResult.
             */
            public Builder callResult(String callResult) {
                this.callResult = callResult;
                return this;
            }

            /**
             * CallType.
             */
            public Builder callType(Integer callType) {
                this.callType = callType;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EvaluationLevel.
             */
            public Builder evaluationLevel(Integer evaluationLevel) {
                this.evaluationLevel = evaluationLevel;
                return this;
            }

            /**
             * EvaluationScore.
             */
            public Builder evaluationScore(Integer evaluationScore) {
                this.evaluationScore = evaluationScore;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HangUpRole.
             */
            public Builder hangUpRole(String hangUpRole) {
                this.hangUpRole = hangUpRole;
                return this;
            }

            /**
             * HangUpTime.
             */
            public Builder hangUpTime(String hangUpTime) {
                this.hangUpTime = hangUpTime;
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
             * InQueueTime.
             */
            public Builder inQueueTime(String inQueueTime) {
                this.inQueueTime = inQueueTime;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * OutQueueTime.
             */
            public Builder outQueueTime(String outQueueTime) {
                this.outQueueTime = outQueueTime;
                return this;
            }

            /**
             * PassiveTransferId.
             */
            public Builder passiveTransferId(String passiveTransferId) {
                this.passiveTransferId = passiveTransferId;
                return this;
            }

            /**
             * PassiveTransferIdType.
             */
            public Builder passiveTransferIdType(String passiveTransferIdType) {
                this.passiveTransferIdType = passiveTransferIdType;
                return this;
            }

            /**
             * PickUpTime.
             */
            public Builder pickUpTime(String pickUpTime) {
                this.pickUpTime = pickUpTime;
                return this;
            }

            /**
             * QueueUpContinueTime.
             */
            public Builder queueUpContinueTime(Integer queueUpContinueTime) {
                this.queueUpContinueTime = queueUpContinueTime;
                return this;
            }

            /**
             * RingContinueTime.
             */
            public Builder ringContinueTime(Integer ringContinueTime) {
                this.ringContinueTime = ringContinueTime;
                return this;
            }

            /**
             * RingEndTime.
             */
            public Builder ringEndTime(String ringEndTime) {
                this.ringEndTime = ringEndTime;
                return this;
            }

            /**
             * RingStartTime.
             */
            public Builder ringStartTime(String ringStartTime) {
                this.ringStartTime = ringStartTime;
                return this;
            }

            /**
             * ServicerId.
             */
            public Builder servicerId(String servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * ServicerName.
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * TrunkCall.
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
    public static class Data extends TeaModel {
        @NameInMap("CallDetailRecord")
        private java.util.List < CallDetailRecord> callDetailRecord;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < CallDetailRecord> getCallDetailRecord() {
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
            private java.util.List < CallDetailRecord> callDetailRecord; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * CallDetailRecord.
             */
            public Builder callDetailRecord(java.util.List < CallDetailRecord> callDetailRecord) {
                this.callDetailRecord = callDetailRecord;
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
