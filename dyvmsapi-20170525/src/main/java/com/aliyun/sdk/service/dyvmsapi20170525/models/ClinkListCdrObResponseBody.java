// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkListCdrObResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListCdrObResponseBody</p>
 */
public class ClinkListCdrObResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkListCdrObResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListCdrObResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkListCdrObResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
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

        public ClinkListCdrObResponseBody build() {
            return new ClinkListCdrObResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListCdrObResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrObResponseBody</p>
     */
    public static class CdrOb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrRecord")
        private Long asrRecord;

        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private Long bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("BridgeTime")
        private Long bridgeTime;

        @com.aliyun.core.annotation.NameInMap("BusinessIds")
        private java.util.List<Long> businessIds;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CallTypeKey")
        private Long callTypeKey;

        @com.aliyun.core.annotation.NameInMap("CalleeRingingDuration")
        private Long calleeRingingDuration;

        @com.aliyun.core.annotation.NameInMap("CalleeRingingTime")
        private Long calleeRingingTime;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientNumber")
        private String clientNumber;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CustomerArea")
        private String customerArea;

        @com.aliyun.core.annotation.NameInMap("CustomerAreaCode")
        private String customerAreaCode;

        @com.aliyun.core.annotation.NameInMap("CustomerCity")
        private String customerCity;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerNumberEncrypt")
        private String customerNumberEncrypt;

        @com.aliyun.core.annotation.NameInMap("CustomerPostCode")
        private String customerPostCode;

        @com.aliyun.core.annotation.NameInMap("CustomerProvince")
        private String customerProvince;

        @com.aliyun.core.annotation.NameInMap("CustomerVip")
        private Long customerVip;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Evaluation")
        private String evaluation;

        @com.aliyun.core.annotation.NameInMap("ExistBusiness")
        private Long existBusiness;

        @com.aliyun.core.annotation.NameInMap("ExistCustomer")
        private Boolean existCustomer;

        @com.aliyun.core.annotation.NameInMap("ExistTicket")
        private Long existTicket;

        @com.aliyun.core.annotation.NameInMap("InvestigationKeys")
        private Long investigationKeys;

        @com.aliyun.core.annotation.NameInMap("LeftClid")
        private String leftClid;

        @com.aliyun.core.annotation.NameInMap("LeftClidArea")
        private String leftClidArea;

        @com.aliyun.core.annotation.NameInMap("LeftClidCity")
        private String leftClidCity;

        @com.aliyun.core.annotation.NameInMap("LeftClidProvince")
        private String leftClidProvince;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("MarkData")
        private String markData;

        @com.aliyun.core.annotation.NameInMap("ObSipCause")
        private String obSipCause;

        @com.aliyun.core.annotation.NameInMap("ObSipCauseRaw")
        private String obSipCauseRaw;

        @com.aliyun.core.annotation.NameInMap("ObWaitDuration")
        private Long obWaitDuration;

        @com.aliyun.core.annotation.NameInMap("OnHookSource")
        private String onHookSource;

        @com.aliyun.core.annotation.NameInMap("PreRingWaitDuration")
        private Long preRingWaitDuration;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
        private String requestUniqueId;

        @com.aliyun.core.annotation.NameInMap("RtcUid")
        private String rtcUid;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TagNames")
        private java.util.List<String> tagNames;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskInventoryId")
        private Long taskInventoryId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TicketIds")
        private java.util.List<Long> ticketIds;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("TrunkGroupKey")
        private String trunkGroupKey;

        @com.aliyun.core.annotation.NameInMap("UpTime")
        private Long upTime;

        @com.aliyun.core.annotation.NameInMap("WebrtcCallId")
        private String webrtcCallId;

        @com.aliyun.core.annotation.NameInMap("Xnumber")
        private String xnumber;

        @com.aliyun.core.annotation.NameInMap("XnumberArea")
        private String xnumberArea;

        @com.aliyun.core.annotation.NameInMap("XnumberCity")
        private String xnumberCity;

        @com.aliyun.core.annotation.NameInMap("XnumberProvince")
        private String xnumberProvince;

        private CdrOb(Builder builder) {
            this.asrRecord = builder.asrRecord;
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.businessIds = builder.businessIds;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.callTypeKey = builder.callTypeKey;
            this.calleeRingingDuration = builder.calleeRingingDuration;
            this.calleeRingingTime = builder.calleeRingingTime;
            this.clientName = builder.clientName;
            this.clientNumber = builder.clientNumber;
            this.cno = builder.cno;
            this.customerArea = builder.customerArea;
            this.customerAreaCode = builder.customerAreaCode;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerNumberEncrypt = builder.customerNumberEncrypt;
            this.customerPostCode = builder.customerPostCode;
            this.customerProvince = builder.customerProvince;
            this.customerVip = builder.customerVip;
            this.endTime = builder.endTime;
            this.enterpriseId = builder.enterpriseId;
            this.evaluation = builder.evaluation;
            this.existBusiness = builder.existBusiness;
            this.existCustomer = builder.existCustomer;
            this.existTicket = builder.existTicket;
            this.investigationKeys = builder.investigationKeys;
            this.leftClid = builder.leftClid;
            this.leftClidArea = builder.leftClidArea;
            this.leftClidCity = builder.leftClidCity;
            this.leftClidProvince = builder.leftClidProvince;
            this.mainUniqueId = builder.mainUniqueId;
            this.markData = builder.markData;
            this.obSipCause = builder.obSipCause;
            this.obSipCauseRaw = builder.obSipCauseRaw;
            this.obWaitDuration = builder.obWaitDuration;
            this.onHookSource = builder.onHookSource;
            this.preRingWaitDuration = builder.preRingWaitDuration;
            this.recordFile = builder.recordFile;
            this.requestUniqueId = builder.requestUniqueId;
            this.rtcUid = builder.rtcUid;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.tagNames = builder.tagNames;
            this.taskId = builder.taskId;
            this.taskInventoryId = builder.taskInventoryId;
            this.taskName = builder.taskName;
            this.ticketIds = builder.ticketIds;
            this.totalDuration = builder.totalDuration;
            this.trunkGroupKey = builder.trunkGroupKey;
            this.upTime = builder.upTime;
            this.webrtcCallId = builder.webrtcCallId;
            this.xnumber = builder.xnumber;
            this.xnumberArea = builder.xnumberArea;
            this.xnumberCity = builder.xnumberCity;
            this.xnumberProvince = builder.xnumberProvince;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrOb create() {
            return builder().build();
        }

        /**
         * @return asrRecord
         */
        public Long getAsrRecord() {
            return this.asrRecord;
        }

        /**
         * @return bridgeDuration
         */
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        /**
         * @return bridgeTime
         */
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        /**
         * @return businessIds
         */
        public java.util.List<Long> getBusinessIds() {
            return this.businessIds;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return callTypeKey
         */
        public Long getCallTypeKey() {
            return this.callTypeKey;
        }

        /**
         * @return calleeRingingDuration
         */
        public Long getCalleeRingingDuration() {
            return this.calleeRingingDuration;
        }

        /**
         * @return calleeRingingTime
         */
        public Long getCalleeRingingTime() {
            return this.calleeRingingTime;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return clientNumber
         */
        public String getClientNumber() {
            return this.clientNumber;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return customerArea
         */
        public String getCustomerArea() {
            return this.customerArea;
        }

        /**
         * @return customerAreaCode
         */
        public String getCustomerAreaCode() {
            return this.customerAreaCode;
        }

        /**
         * @return customerCity
         */
        public String getCustomerCity() {
            return this.customerCity;
        }

        /**
         * @return customerNumber
         */
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        /**
         * @return customerNumberEncrypt
         */
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        /**
         * @return customerPostCode
         */
        public String getCustomerPostCode() {
            return this.customerPostCode;
        }

        /**
         * @return customerProvince
         */
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        /**
         * @return customerVip
         */
        public Long getCustomerVip() {
            return this.customerVip;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return evaluation
         */
        public String getEvaluation() {
            return this.evaluation;
        }

        /**
         * @return existBusiness
         */
        public Long getExistBusiness() {
            return this.existBusiness;
        }

        /**
         * @return existCustomer
         */
        public Boolean getExistCustomer() {
            return this.existCustomer;
        }

        /**
         * @return existTicket
         */
        public Long getExistTicket() {
            return this.existTicket;
        }

        /**
         * @return investigationKeys
         */
        public Long getInvestigationKeys() {
            return this.investigationKeys;
        }

        /**
         * @return leftClid
         */
        public String getLeftClid() {
            return this.leftClid;
        }

        /**
         * @return leftClidArea
         */
        public String getLeftClidArea() {
            return this.leftClidArea;
        }

        /**
         * @return leftClidCity
         */
        public String getLeftClidCity() {
            return this.leftClidCity;
        }

        /**
         * @return leftClidProvince
         */
        public String getLeftClidProvince() {
            return this.leftClidProvince;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        /**
         * @return markData
         */
        public String getMarkData() {
            return this.markData;
        }

        /**
         * @return obSipCause
         */
        public String getObSipCause() {
            return this.obSipCause;
        }

        /**
         * @return obSipCauseRaw
         */
        public String getObSipCauseRaw() {
            return this.obSipCauseRaw;
        }

        /**
         * @return obWaitDuration
         */
        public Long getObWaitDuration() {
            return this.obWaitDuration;
        }

        /**
         * @return onHookSource
         */
        public String getOnHookSource() {
            return this.onHookSource;
        }

        /**
         * @return preRingWaitDuration
         */
        public Long getPreRingWaitDuration() {
            return this.preRingWaitDuration;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return requestUniqueId
         */
        public String getRequestUniqueId() {
            return this.requestUniqueId;
        }

        /**
         * @return rtcUid
         */
        public String getRtcUid() {
            return this.rtcUid;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return tagNames
         */
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskInventoryId
         */
        public Long getTaskInventoryId() {
            return this.taskInventoryId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return ticketIds
         */
        public java.util.List<Long> getTicketIds() {
            return this.ticketIds;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return trunkGroupKey
         */
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        /**
         * @return upTime
         */
        public Long getUpTime() {
            return this.upTime;
        }

        /**
         * @return webrtcCallId
         */
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

        /**
         * @return xnumber
         */
        public String getXnumber() {
            return this.xnumber;
        }

        /**
         * @return xnumberArea
         */
        public String getXnumberArea() {
            return this.xnumberArea;
        }

        /**
         * @return xnumberCity
         */
        public String getXnumberCity() {
            return this.xnumberCity;
        }

        /**
         * @return xnumberProvince
         */
        public String getXnumberProvince() {
            return this.xnumberProvince;
        }

        public static final class Builder {
            private Long asrRecord; 
            private Long bridgeDuration; 
            private Long bridgeTime; 
            private java.util.List<Long> businessIds; 
            private String callId; 
            private String callType; 
            private Long callTypeKey; 
            private Long calleeRingingDuration; 
            private Long calleeRingingTime; 
            private String clientName; 
            private String clientNumber; 
            private String cno; 
            private String customerArea; 
            private String customerAreaCode; 
            private String customerCity; 
            private String customerNumber; 
            private String customerNumberEncrypt; 
            private String customerPostCode; 
            private String customerProvince; 
            private Long customerVip; 
            private Long endTime; 
            private Long enterpriseId; 
            private String evaluation; 
            private Long existBusiness; 
            private Boolean existCustomer; 
            private Long existTicket; 
            private Long investigationKeys; 
            private String leftClid; 
            private String leftClidArea; 
            private String leftClidCity; 
            private String leftClidProvince; 
            private String mainUniqueId; 
            private String markData; 
            private String obSipCause; 
            private String obSipCauseRaw; 
            private Long obWaitDuration; 
            private String onHookSource; 
            private Long preRingWaitDuration; 
            private String recordFile; 
            private String requestUniqueId; 
            private String rtcUid; 
            private Long startTime; 
            private Long status; 
            private String statusDesc; 
            private java.util.List<String> tagNames; 
            private Long taskId; 
            private Long taskInventoryId; 
            private String taskName; 
            private java.util.List<Long> ticketIds; 
            private Long totalDuration; 
            private String trunkGroupKey; 
            private Long upTime; 
            private String webrtcCallId; 
            private String xnumber; 
            private String xnumberArea; 
            private String xnumberCity; 
            private String xnumberProvince; 

            private Builder() {
            } 

            private Builder(CdrOb model) {
                this.asrRecord = model.asrRecord;
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.businessIds = model.businessIds;
                this.callId = model.callId;
                this.callType = model.callType;
                this.callTypeKey = model.callTypeKey;
                this.calleeRingingDuration = model.calleeRingingDuration;
                this.calleeRingingTime = model.calleeRingingTime;
                this.clientName = model.clientName;
                this.clientNumber = model.clientNumber;
                this.cno = model.cno;
                this.customerArea = model.customerArea;
                this.customerAreaCode = model.customerAreaCode;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerNumberEncrypt = model.customerNumberEncrypt;
                this.customerPostCode = model.customerPostCode;
                this.customerProvince = model.customerProvince;
                this.customerVip = model.customerVip;
                this.endTime = model.endTime;
                this.enterpriseId = model.enterpriseId;
                this.evaluation = model.evaluation;
                this.existBusiness = model.existBusiness;
                this.existCustomer = model.existCustomer;
                this.existTicket = model.existTicket;
                this.investigationKeys = model.investigationKeys;
                this.leftClid = model.leftClid;
                this.leftClidArea = model.leftClidArea;
                this.leftClidCity = model.leftClidCity;
                this.leftClidProvince = model.leftClidProvince;
                this.mainUniqueId = model.mainUniqueId;
                this.markData = model.markData;
                this.obSipCause = model.obSipCause;
                this.obSipCauseRaw = model.obSipCauseRaw;
                this.obWaitDuration = model.obWaitDuration;
                this.onHookSource = model.onHookSource;
                this.preRingWaitDuration = model.preRingWaitDuration;
                this.recordFile = model.recordFile;
                this.requestUniqueId = model.requestUniqueId;
                this.rtcUid = model.rtcUid;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.tagNames = model.tagNames;
                this.taskId = model.taskId;
                this.taskInventoryId = model.taskInventoryId;
                this.taskName = model.taskName;
                this.ticketIds = model.ticketIds;
                this.totalDuration = model.totalDuration;
                this.trunkGroupKey = model.trunkGroupKey;
                this.upTime = model.upTime;
                this.webrtcCallId = model.webrtcCallId;
                this.xnumber = model.xnumber;
                this.xnumberArea = model.xnumberArea;
                this.xnumberCity = model.xnumberCity;
                this.xnumberProvince = model.xnumberProvince;
            } 

            /**
             * <p>转写记录标识 1：存在，0：不存在</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder asrRecord(Long asrRecord) {
                this.asrRecord = asrRecord;
                return this;
            }

            /**
             * <p>通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>76</p>
             */
            public Builder bridgeDuration(Long bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>客户接听时间</p>
             * 
             * <strong>example:</strong>
             * <p>1715326248</p>
             */
            public Builder bridgeTime(Long bridgeTime) {
                this.bridgeTime = bridgeTime;
                return this;
            }

            /**
             * <p>业务记录ID</p>
             */
            public Builder businessIds(java.util.List<Long> businessIds) {
                this.businessIds = businessIds;
                return this;
            }

            /**
             * <p>CallID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>通话类型</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>通话类型Key值</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder callTypeKey(Long callTypeKey) {
                this.callTypeKey = callTypeKey;
                return this;
            }

            /**
             * <p>客户响铃时长</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder calleeRingingDuration(Long calleeRingingDuration) {
                this.calleeRingingDuration = calleeRingingDuration;
                return this;
            }

            /**
             * <p>客户响铃时间</p>
             * 
             * <strong>example:</strong>
             * <p>1715326251</p>
             */
            public Builder calleeRingingTime(Long calleeRingingTime) {
                this.calleeRingingTime = calleeRingingTime;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>ClientName</p>
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * <p>座席电话</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clientNumber(String clientNumber) {
                this.clientNumber = clientNumber;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户地区，省份/城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder customerArea(String customerArea) {
                this.customerArea = customerArea;
                return this;
            }

            /**
             * <p>客户号码区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder customerAreaCode(String customerAreaCode) {
                this.customerAreaCode = customerAreaCode;
                return this;
            }

            /**
             * <p>客户号码城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder customerCity(String customerCity) {
                this.customerCity = customerCity;
                return this;
            }

            /**
             * <p>客户号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>客户号码加密串</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerNumberEncrypt(String customerNumberEncrypt) {
                this.customerNumberEncrypt = customerNumberEncrypt;
                return this;
            }

            /**
             * <p>追加客户邮编</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerPostCode(String customerPostCode) {
                this.customerPostCode = customerPostCode;
                return this;
            }

            /**
             * <p>客户号码省份</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>客户VIP标识</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customerVip(Long customerVip) {
                this.customerVip = customerVip;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1715326248</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>企业号</p>
             * 
             * <strong>example:</strong>
             * <p>8004970</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>是否邀评</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder evaluation(String evaluation) {
                this.evaluation = evaluation;
                return this;
            }

            /**
             * <p>是否存在业务记录</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder existBusiness(Long existBusiness) {
                this.existBusiness = existBusiness;
                return this;
            }

            /**
             * <p>是否存在客户资料</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder existCustomer(Boolean existCustomer) {
                this.existCustomer = existCustomer;
                return this;
            }

            /**
             * <p>是否存在工单</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder existTicket(Long existTicket) {
                this.existTicket = existTicket;
                return this;
            }

            /**
             * <p>满意度评价</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder investigationKeys(Long investigationKeys) {
                this.investigationKeys = investigationKeys;
                return this;
            }

            /**
             * <p>外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder leftClid(String leftClid) {
                this.leftClid = leftClid;
                return this;
            }

            /**
             * <p>外显号码归属地区，省份/城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder leftClidArea(String leftClidArea) {
                this.leftClidArea = leftClidArea;
                return this;
            }

            /**
             * <p>外显号码归属城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder leftClidCity(String leftClidCity) {
                this.leftClidCity = leftClidCity;
                return this;
            }

            /**
             * <p>外显号码归属省份</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder leftClidProvince(String leftClidProvince) {
                this.leftClidProvince = leftClidProvince;
                return this;
            }

            /**
             * <p>通话ID</p>
             * 
             * <strong>example:</strong>
             * <p>medias_1-171532xxxx.53</p>
             */
            public Builder mainUniqueId(String mainUniqueId) {
                this.mainUniqueId = mainUniqueId;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder markData(String markData) {
                this.markData = markData;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder obSipCause(String obSipCause) {
                this.obSipCause = obSipCause;
                return this;
            }

            /**
             * <p>被叫状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder obSipCauseRaw(String obSipCauseRaw) {
                this.obSipCauseRaw = obSipCauseRaw;
                return this;
            }

            /**
             * <p>外呼等待时长</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder obWaitDuration(Long obWaitDuration) {
                this.obWaitDuration = obWaitDuration;
                return this;
            }

            /**
             * <p>挂断方</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder onHookSource(String onHookSource) {
                this.onHookSource = onHookSource;
                return this;
            }

            /**
             * <p>响铃前等待时长</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder preRingWaitDuration(Long preRingWaitDuration) {
                this.preRingWaitDuration = preRingWaitDuration;
                return this;
            }

            /**
             * <p>录音文件</p>
             * 
             * <strong>example:</strong>
             * <p>RecordFile</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>通话唯一ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder requestUniqueId(String requestUniqueId) {
                this.requestUniqueId = requestUniqueId;
                return this;
            }

            /**
             * <p>RtcUid</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder rtcUid(String rtcUid) {
                this.rtcUid = rtcUid;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1715326248</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>接听状态值</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>接听状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>通话标签</p>
             */
            public Builder tagNames(java.util.List<String> tagNames) {
                this.tagNames = tagNames;
                return this;
            }

            /**
             * <p>外呼任务id</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>外呼任务详情id</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder taskInventoryId(Long taskInventoryId) {
                this.taskInventoryId = taskInventoryId;
                return this;
            }

            /**
             * <p>外呼任务名称</p>
             * 
             * <strong>example:</strong>
             * <p>TaskName</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>工单id</p>
             */
            public Builder ticketIds(java.util.List<Long> ticketIds) {
                this.ticketIds = ticketIds;
                return this;
            }

            /**
             * <p>总时长</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>中继组号</p>
             * 
             * <strong>example:</strong>
             * <p>10088</p>
             */
            public Builder trunkGroupKey(String trunkGroupKey) {
                this.trunkGroupKey = trunkGroupKey;
                return this;
            }

            /**
             * <p>座席接起时间</p>
             * 
             * <strong>example:</strong>
             * <p>1715326251</p>
             */
            public Builder upTime(Long upTime) {
                this.upTime = upTime;
                return this;
            }

            /**
             * <p>WebRTCCallID</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder webrtcCallId(String webrtcCallId) {
                this.webrtcCallId = webrtcCallId;
                return this;
            }

            /**
             * <p>虚拟号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder xnumber(String xnumber) {
                this.xnumber = xnumber;
                return this;
            }

            /**
             * <p>虚拟号码归属地区，省份/城市</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder xnumberArea(String xnumberArea) {
                this.xnumberArea = xnumberArea;
                return this;
            }

            /**
             * <p>虚拟号码归属城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder xnumberCity(String xnumberCity) {
                this.xnumberCity = xnumberCity;
                return this;
            }

            /**
             * <p>虚拟号码归属省份</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder xnumberProvince(String xnumberProvince) {
                this.xnumberProvince = xnumberProvince;
                return this;
            }

            public CdrOb build() {
                return new CdrOb(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListCdrObResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrObResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrOb")
        private java.util.List<CdrOb> cdrOb;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("ScrollId")
        private String scrollId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.cdrOb = builder.cdrOb;
            this.clinkRequestId = builder.clinkRequestId;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.scrollId = builder.scrollId;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdrOb
         */
        public java.util.List<CdrOb> getCdrOb() {
            return this.cdrOb;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return scrollId
         */
        public String getScrollId() {
            return this.scrollId;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CdrOb> cdrOb; 
            private String clinkRequestId; 
            private Long pageNumber; 
            private Long pageSize; 
            private String scrollId; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrOb = model.cdrOb;
                this.clinkRequestId = model.clinkRequestId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.scrollId = model.scrollId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>[外呼记录列表] #外呼记录列表</p>
             */
            public Builder cdrOb(java.util.List<CdrOb> cdrOb) {
                this.cdrOb = cdrOb;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * <p>当前页码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>一页展示条数</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>滚动查询ID</p>
             * 
             * <strong>example:</strong>
             * <p>ScrollId</p>
             */
            public Builder scrollId(String scrollId) {
                this.scrollId = scrollId;
                return this;
            }

            /**
             * <p>总条数</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
