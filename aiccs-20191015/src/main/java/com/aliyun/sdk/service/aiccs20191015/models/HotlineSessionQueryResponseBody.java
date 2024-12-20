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

            /**
             * CallDetailRecord.
             */
            public Builder callDetailRecord(java.util.List<CallDetailRecord> callDetailRecord) {
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
