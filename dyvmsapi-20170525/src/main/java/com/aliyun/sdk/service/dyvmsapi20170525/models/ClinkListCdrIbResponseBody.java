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
 * {@link ClinkListCdrIbResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListCdrIbResponseBody</p>
 */
public class ClinkListCdrIbResponseBody extends TeaModel {
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

    private ClinkListCdrIbResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListCdrIbResponseBody create() {
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

        private Builder(ClinkListCdrIbResponseBody model) {
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

        public ClinkListCdrIbResponseBody build() {
            return new ClinkListCdrIbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListCdrIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrIbResponseBody</p>
     */
    public static class CdrIb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAnswerInTime")
        private String agentAnswerInTime;

        @com.aliyun.core.annotation.NameInMap("BindType")
        private Long bindType;

        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private Long bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("BridgeTime")
        private Long bridgeTime;

        @com.aliyun.core.annotation.NameInMap("BusinessIds")
        private java.util.List<String> businessIds;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CustomerCity")
        private String customerCity;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerNumberEncrypt")
        private String customerNumberEncrypt;

        @com.aliyun.core.annotation.NameInMap("CustomerProvince")
        private String customerProvince;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Evaluation")
        private String evaluation;

        @com.aliyun.core.annotation.NameInMap("FirstCallCname")
        private String firstCallCname;

        @com.aliyun.core.annotation.NameInMap("FirstCallCno")
        private String firstCallCno;

        @com.aliyun.core.annotation.NameInMap("FirstCallNumber")
        private String firstCallNumber;

        @com.aliyun.core.annotation.NameInMap("FirstCallQname")
        private String firstCallQname;

        @com.aliyun.core.annotation.NameInMap("FirstCallQno")
        private String firstCallQno;

        @com.aliyun.core.annotation.NameInMap("FirstJoinQueueTime")
        private Long firstJoinQueueTime;

        @com.aliyun.core.annotation.NameInMap("FirstLeaveQueueTime")
        private Long firstLeaveQueueTime;

        @com.aliyun.core.annotation.NameInMap("FirstQueueDuration")
        private Long firstQueueDuration;

        @com.aliyun.core.annotation.NameInMap("Hotline")
        private String hotline;

        @com.aliyun.core.annotation.NameInMap("HotlineName")
        private String hotlineName;

        @com.aliyun.core.annotation.NameInMap("InvestigationKeys")
        private Long investigationKeys;

        @com.aliyun.core.annotation.NameInMap("IvrName")
        private String ivrName;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("MarkData")
        private String markData;

        @com.aliyun.core.annotation.NameInMap("OnHookSource")
        private String onHookSource;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("RtcUid")
        private String rtcUid;

        @com.aliyun.core.annotation.NameInMap("SayVoiceDuration")
        private Long sayVoiceDuration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusResult")
        private String statusResult;

        @com.aliyun.core.annotation.NameInMap("StatusRobot")
        private String statusRobot;

        @com.aliyun.core.annotation.NameInMap("TagNames")
        private java.util.List<String> tagNames;

        @com.aliyun.core.annotation.NameInMap("TicketIds")
        private java.util.List<String> ticketIds;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("UserField")
        private String userField;

        @com.aliyun.core.annotation.NameInMap("WebrtcCallId")
        private String webrtcCallId;

        @com.aliyun.core.annotation.NameInMap("Xnumber")
        private String xnumber;

        private CdrIb(Builder builder) {
            this.agentAnswerInTime = builder.agentAnswerInTime;
            this.bindType = builder.bindType;
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.businessIds = builder.businessIds;
            this.callId = builder.callId;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerNumberEncrypt = builder.customerNumberEncrypt;
            this.customerProvince = builder.customerProvince;
            this.endTime = builder.endTime;
            this.evaluation = builder.evaluation;
            this.firstCallCname = builder.firstCallCname;
            this.firstCallCno = builder.firstCallCno;
            this.firstCallNumber = builder.firstCallNumber;
            this.firstCallQname = builder.firstCallQname;
            this.firstCallQno = builder.firstCallQno;
            this.firstJoinQueueTime = builder.firstJoinQueueTime;
            this.firstLeaveQueueTime = builder.firstLeaveQueueTime;
            this.firstQueueDuration = builder.firstQueueDuration;
            this.hotline = builder.hotline;
            this.hotlineName = builder.hotlineName;
            this.investigationKeys = builder.investigationKeys;
            this.ivrName = builder.ivrName;
            this.mainUniqueId = builder.mainUniqueId;
            this.markData = builder.markData;
            this.onHookSource = builder.onHookSource;
            this.recordFile = builder.recordFile;
            this.rtcUid = builder.rtcUid;
            this.sayVoiceDuration = builder.sayVoiceDuration;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusResult = builder.statusResult;
            this.statusRobot = builder.statusRobot;
            this.tagNames = builder.tagNames;
            this.ticketIds = builder.ticketIds;
            this.totalDuration = builder.totalDuration;
            this.userField = builder.userField;
            this.webrtcCallId = builder.webrtcCallId;
            this.xnumber = builder.xnumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrIb create() {
            return builder().build();
        }

        /**
         * @return agentAnswerInTime
         */
        public String getAgentAnswerInTime() {
            return this.agentAnswerInTime;
        }

        /**
         * @return bindType
         */
        public Long getBindType() {
            return this.bindType;
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
        public java.util.List<String> getBusinessIds() {
            return this.businessIds;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
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
         * @return customerProvince
         */
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return evaluation
         */
        public String getEvaluation() {
            return this.evaluation;
        }

        /**
         * @return firstCallCname
         */
        public String getFirstCallCname() {
            return this.firstCallCname;
        }

        /**
         * @return firstCallCno
         */
        public String getFirstCallCno() {
            return this.firstCallCno;
        }

        /**
         * @return firstCallNumber
         */
        public String getFirstCallNumber() {
            return this.firstCallNumber;
        }

        /**
         * @return firstCallQname
         */
        public String getFirstCallQname() {
            return this.firstCallQname;
        }

        /**
         * @return firstCallQno
         */
        public String getFirstCallQno() {
            return this.firstCallQno;
        }

        /**
         * @return firstJoinQueueTime
         */
        public Long getFirstJoinQueueTime() {
            return this.firstJoinQueueTime;
        }

        /**
         * @return firstLeaveQueueTime
         */
        public Long getFirstLeaveQueueTime() {
            return this.firstLeaveQueueTime;
        }

        /**
         * @return firstQueueDuration
         */
        public Long getFirstQueueDuration() {
            return this.firstQueueDuration;
        }

        /**
         * @return hotline
         */
        public String getHotline() {
            return this.hotline;
        }

        /**
         * @return hotlineName
         */
        public String getHotlineName() {
            return this.hotlineName;
        }

        /**
         * @return investigationKeys
         */
        public Long getInvestigationKeys() {
            return this.investigationKeys;
        }

        /**
         * @return ivrName
         */
        public String getIvrName() {
            return this.ivrName;
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
         * @return onHookSource
         */
        public String getOnHookSource() {
            return this.onHookSource;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return rtcUid
         */
        public String getRtcUid() {
            return this.rtcUid;
        }

        /**
         * @return sayVoiceDuration
         */
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
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
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusResult
         */
        public String getStatusResult() {
            return this.statusResult;
        }

        /**
         * @return statusRobot
         */
        public String getStatusRobot() {
            return this.statusRobot;
        }

        /**
         * @return tagNames
         */
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        /**
         * @return ticketIds
         */
        public java.util.List<String> getTicketIds() {
            return this.ticketIds;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return userField
         */
        public String getUserField() {
            return this.userField;
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

        public static final class Builder {
            private String agentAnswerInTime; 
            private Long bindType; 
            private Long bridgeDuration; 
            private Long bridgeTime; 
            private java.util.List<String> businessIds; 
            private String callId; 
            private String customerCity; 
            private String customerNumber; 
            private String customerNumberEncrypt; 
            private String customerProvince; 
            private Long endTime; 
            private String evaluation; 
            private String firstCallCname; 
            private String firstCallCno; 
            private String firstCallNumber; 
            private String firstCallQname; 
            private String firstCallQno; 
            private Long firstJoinQueueTime; 
            private Long firstLeaveQueueTime; 
            private Long firstQueueDuration; 
            private String hotline; 
            private String hotlineName; 
            private Long investigationKeys; 
            private String ivrName; 
            private String mainUniqueId; 
            private String markData; 
            private String onHookSource; 
            private String recordFile; 
            private String rtcUid; 
            private Long sayVoiceDuration; 
            private Long startTime; 
            private String status; 
            private String statusResult; 
            private String statusRobot; 
            private java.util.List<String> tagNames; 
            private java.util.List<String> ticketIds; 
            private Long totalDuration; 
            private String userField; 
            private String webrtcCallId; 
            private String xnumber; 

            private Builder() {
            } 

            private Builder(CdrIb model) {
                this.agentAnswerInTime = model.agentAnswerInTime;
                this.bindType = model.bindType;
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.businessIds = model.businessIds;
                this.callId = model.callId;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerNumberEncrypt = model.customerNumberEncrypt;
                this.customerProvince = model.customerProvince;
                this.endTime = model.endTime;
                this.evaluation = model.evaluation;
                this.firstCallCname = model.firstCallCname;
                this.firstCallCno = model.firstCallCno;
                this.firstCallNumber = model.firstCallNumber;
                this.firstCallQname = model.firstCallQname;
                this.firstCallQno = model.firstCallQno;
                this.firstJoinQueueTime = model.firstJoinQueueTime;
                this.firstLeaveQueueTime = model.firstLeaveQueueTime;
                this.firstQueueDuration = model.firstQueueDuration;
                this.hotline = model.hotline;
                this.hotlineName = model.hotlineName;
                this.investigationKeys = model.investigationKeys;
                this.ivrName = model.ivrName;
                this.mainUniqueId = model.mainUniqueId;
                this.markData = model.markData;
                this.onHookSource = model.onHookSource;
                this.recordFile = model.recordFile;
                this.rtcUid = model.rtcUid;
                this.sayVoiceDuration = model.sayVoiceDuration;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusResult = model.statusResult;
                this.statusRobot = model.statusRobot;
                this.tagNames = model.tagNames;
                this.ticketIds = model.ticketIds;
                this.totalDuration = model.totalDuration;
                this.userField = model.userField;
                this.webrtcCallId = model.webrtcCallId;
                this.xnumber = model.xnumber;
            } 

            /**
             * <p>首次及时应答</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder agentAnswerInTime(String agentAnswerInTime) {
                this.agentAnswerInTime = agentAnswerInTime;
                return this;
            }

            /**
             * <p>接听设备</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bindType(Long bindType) {
                this.bindType = bindType;
                return this;
            }

            /**
             * <p>通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder bridgeDuration(Long bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>首次接听时间</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder bridgeTime(Long bridgeTime) {
                this.bridgeTime = bridgeTime;
                return this;
            }

            /**
             * <p>业务记录ID</p>
             */
            public Builder businessIds(java.util.List<String> businessIds) {
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
             * <p>客户号码城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
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
             * <p>客户号码省份</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>是否邀评</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder evaluation(String evaluation) {
                this.evaluation = evaluation;
                return this;
            }

            /**
             * <p>首呼座席姓名</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder firstCallCname(String firstCallCname) {
                this.firstCallCname = firstCallCname;
                return this;
            }

            /**
             * <p>首呼座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1212</p>
             */
            public Builder firstCallCno(String firstCallCno) {
                this.firstCallCno = firstCallCno;
                return this;
            }

            /**
             * <p>首呼座席电话</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder firstCallNumber(String firstCallNumber) {
                this.firstCallNumber = firstCallNumber;
                return this;
            }

            /**
             * <p>首呼队列名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder firstCallQname(String firstCallQname) {
                this.firstCallQname = firstCallQname;
                return this;
            }

            /**
             * <p>首呼队列号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder firstCallQno(String firstCallQno) {
                this.firstCallQno = firstCallQno;
                return this;
            }

            /**
             * <p>首次进入队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>1713848594</p>
             */
            public Builder firstJoinQueueTime(Long firstJoinQueueTime) {
                this.firstJoinQueueTime = firstJoinQueueTime;
                return this;
            }

            /**
             * <p>首次离开队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder firstLeaveQueueTime(Long firstLeaveQueueTime) {
                this.firstLeaveQueueTime = firstLeaveQueueTime;
                return this;
            }

            /**
             * <p>首呼队列排队时长</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder firstQueueDuration(Long firstQueueDuration) {
                this.firstQueueDuration = firstQueueDuration;
                return this;
            }

            /**
             * <p>热线号码</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder hotline(String hotline) {
                this.hotline = hotline;
                return this;
            }

            /**
             * <p>热线别名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder hotlineName(String hotlineName) {
                this.hotlineName = hotlineName;
                return this;
            }

            /**
             * <p>满意度评价</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder investigationKeys(Long investigationKeys) {
                this.investigationKeys = investigationKeys;
                return this;
            }

            /**
             * <p>IVR名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder ivrName(String ivrName) {
                this.ivrName = ivrName;
                return this;
            }

            /**
             * <p>通话ID</p>
             * 
             * <strong>example:</strong>
             * <p>medias_1-162046xxxx.12</p>
             */
            public Builder mainUniqueId(String mainUniqueId) {
                this.mainUniqueId = mainUniqueId;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder markData(String markData) {
                this.markData = markData;
                return this;
            }

            /**
             * <p>挂断方</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder onHookSource(String onHookSource) {
                this.onHookSource = onHookSource;
                return this;
            }

            /**
             * <p>录音文件</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>rtcUid</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder rtcUid(String rtcUid) {
                this.rtcUid = rtcUid;
                return this;
            }

            /**
             * <p>语音播报时长</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder sayVoiceDuration(Long sayVoiceDuration) {
                this.sayVoiceDuration = sayVoiceDuration;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1713848570</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>接听状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder statusResult(String statusResult) {
                this.statusResult = statusResult;
                return this;
            }

            /**
             * <p>机器人接听状态</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder statusRobot(String statusRobot) {
                this.statusRobot = statusRobot;
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
             * <p>工单ID</p>
             */
            public Builder ticketIds(java.util.List<String> ticketIds) {
                this.ticketIds = ticketIds;
                return this;
            }

            /**
             * <p>总时长</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>自定义字段</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder userField(String userField) {
                this.userField = userField;
                return this;
            }

            /**
             * <p>WebRTCCallID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder webrtcCallId(String webrtcCallId) {
                this.webrtcCallId = webrtcCallId;
                return this;
            }

            /**
             * <p>虚拟号码</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder xnumber(String xnumber) {
                this.xnumber = xnumber;
                return this;
            }

            public CdrIb build() {
                return new CdrIb(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListCdrIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrIbResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrIb")
        private java.util.List<CdrIb> cdrIb;

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
            this.cdrIb = builder.cdrIb;
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
         * @return cdrIb
         */
        public java.util.List<CdrIb> getCdrIb() {
            return this.cdrIb;
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
            private java.util.List<CdrIb> cdrIb; 
            private String clinkRequestId; 
            private Long pageNumber; 
            private Long pageSize; 
            private String scrollId; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrIb = model.cdrIb;
                this.clinkRequestId = model.clinkRequestId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.scrollId = model.scrollId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>[客户来电记录列表] #客户来电记录列表</p>
             */
            public Builder cdrIb(java.util.List<CdrIb> cdrIb) {
                this.cdrIb = cdrIb;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>1713848594</p>
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
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>滚动查询ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder scrollId(String scrollId) {
                this.scrollId = scrollId;
                return this;
            }

            /**
             * <p>总条数</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
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
