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
 * {@link ClinkListCdrIbAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListCdrIbAgentResponseBody</p>
 */
public class ClinkListCdrIbAgentResponseBody extends TeaModel {
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

    private ClinkListCdrIbAgentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListCdrIbAgentResponseBody create() {
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

        private Builder(ClinkListCdrIbAgentResponseBody model) {
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

        public ClinkListCdrIbAgentResponseBody build() {
            return new ClinkListCdrIbAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListCdrIbAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrIbAgentResponseBody</p>
     */
    public static class CdrIbAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAnswerInTime")
        private Long agentAnswerInTime;

        @com.aliyun.core.annotation.NameInMap("AnswerTime")
        private Long answerTime;

        @com.aliyun.core.annotation.NameInMap("BindType")
        private Long bindType;

        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private Long bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("BridgeStatus")
        private String bridgeStatus;

        @com.aliyun.core.annotation.NameInMap("BridgeStatusDetail")
        private String bridgeStatusDetail;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientNumber")
        private String clientNumber;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CustomerCity")
        private String customerCity;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerNumberEncrypt")
        private String customerNumberEncrypt;

        @com.aliyun.core.annotation.NameInMap("CustomerProvince")
        private String customerProvince;

        @com.aliyun.core.annotation.NameInMap("DetailCallType")
        private String detailCallType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Hotline")
        private String hotline;

        @com.aliyun.core.annotation.NameInMap("HotlineName")
        private String hotlineName;

        @com.aliyun.core.annotation.NameInMap("IbRingingDuration")
        private Long ibRingingDuration;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("OffhookTime")
        private Long offhookTime;

        @com.aliyun.core.annotation.NameInMap("OnHookSource")
        private String onHookSource;

        @com.aliyun.core.annotation.NameInMap("Qname")
        private String qname;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("Remember")
        private String remember;

        @com.aliyun.core.annotation.NameInMap("RingTime")
        private Long ringTime;

        @com.aliyun.core.annotation.NameInMap("SayVoiceDuration")
        private Long sayVoiceDuration;

        @com.aliyun.core.annotation.NameInMap("SipCauseDesc")
        private String sipCauseDesc;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("WebrtcCallId")
        private String webrtcCallId;

        private CdrIbAgent(Builder builder) {
            this.agentAnswerInTime = builder.agentAnswerInTime;
            this.answerTime = builder.answerTime;
            this.bindType = builder.bindType;
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeStatus = builder.bridgeStatus;
            this.bridgeStatusDetail = builder.bridgeStatusDetail;
            this.callId = builder.callId;
            this.clientName = builder.clientName;
            this.clientNumber = builder.clientNumber;
            this.cno = builder.cno;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerNumberEncrypt = builder.customerNumberEncrypt;
            this.customerProvince = builder.customerProvince;
            this.detailCallType = builder.detailCallType;
            this.endTime = builder.endTime;
            this.hotline = builder.hotline;
            this.hotlineName = builder.hotlineName;
            this.ibRingingDuration = builder.ibRingingDuration;
            this.mainUniqueId = builder.mainUniqueId;
            this.offhookTime = builder.offhookTime;
            this.onHookSource = builder.onHookSource;
            this.qname = builder.qname;
            this.qno = builder.qno;
            this.recordFile = builder.recordFile;
            this.remember = builder.remember;
            this.ringTime = builder.ringTime;
            this.sayVoiceDuration = builder.sayVoiceDuration;
            this.sipCauseDesc = builder.sipCauseDesc;
            this.startTime = builder.startTime;
            this.uniqueId = builder.uniqueId;
            this.webrtcCallId = builder.webrtcCallId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrIbAgent create() {
            return builder().build();
        }

        /**
         * @return agentAnswerInTime
         */
        public Long getAgentAnswerInTime() {
            return this.agentAnswerInTime;
        }

        /**
         * @return answerTime
         */
        public Long getAnswerTime() {
            return this.answerTime;
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
         * @return bridgeStatus
         */
        public String getBridgeStatus() {
            return this.bridgeStatus;
        }

        /**
         * @return bridgeStatusDetail
         */
        public String getBridgeStatusDetail() {
            return this.bridgeStatusDetail;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
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
         * @return detailCallType
         */
        public String getDetailCallType() {
            return this.detailCallType;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
         * @return ibRingingDuration
         */
        public Long getIbRingingDuration() {
            return this.ibRingingDuration;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        /**
         * @return offhookTime
         */
        public Long getOffhookTime() {
            return this.offhookTime;
        }

        /**
         * @return onHookSource
         */
        public String getOnHookSource() {
            return this.onHookSource;
        }

        /**
         * @return qname
         */
        public String getQname() {
            return this.qname;
        }

        /**
         * @return qno
         */
        public String getQno() {
            return this.qno;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return remember
         */
        public String getRemember() {
            return this.remember;
        }

        /**
         * @return ringTime
         */
        public Long getRingTime() {
            return this.ringTime;
        }

        /**
         * @return sayVoiceDuration
         */
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        /**
         * @return sipCauseDesc
         */
        public String getSipCauseDesc() {
            return this.sipCauseDesc;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        /**
         * @return webrtcCallId
         */
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

        public static final class Builder {
            private Long agentAnswerInTime; 
            private Long answerTime; 
            private Long bindType; 
            private Long bridgeDuration; 
            private String bridgeStatus; 
            private String bridgeStatusDetail; 
            private String callId; 
            private String clientName; 
            private String clientNumber; 
            private String cno; 
            private String customerCity; 
            private String customerNumber; 
            private String customerNumberEncrypt; 
            private String customerProvince; 
            private String detailCallType; 
            private Long endTime; 
            private String hotline; 
            private String hotlineName; 
            private Long ibRingingDuration; 
            private String mainUniqueId; 
            private Long offhookTime; 
            private String onHookSource; 
            private String qname; 
            private String qno; 
            private String recordFile; 
            private String remember; 
            private Long ringTime; 
            private Long sayVoiceDuration; 
            private String sipCauseDesc; 
            private Long startTime; 
            private String uniqueId; 
            private String webrtcCallId; 

            private Builder() {
            } 

            private Builder(CdrIbAgent model) {
                this.agentAnswerInTime = model.agentAnswerInTime;
                this.answerTime = model.answerTime;
                this.bindType = model.bindType;
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeStatus = model.bridgeStatus;
                this.bridgeStatusDetail = model.bridgeStatusDetail;
                this.callId = model.callId;
                this.clientName = model.clientName;
                this.clientNumber = model.clientNumber;
                this.cno = model.cno;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerNumberEncrypt = model.customerNumberEncrypt;
                this.customerProvince = model.customerProvince;
                this.detailCallType = model.detailCallType;
                this.endTime = model.endTime;
                this.hotline = model.hotline;
                this.hotlineName = model.hotlineName;
                this.ibRingingDuration = model.ibRingingDuration;
                this.mainUniqueId = model.mainUniqueId;
                this.offhookTime = model.offhookTime;
                this.onHookSource = model.onHookSource;
                this.qname = model.qname;
                this.qno = model.qno;
                this.recordFile = model.recordFile;
                this.remember = model.remember;
                this.ringTime = model.ringTime;
                this.sayVoiceDuration = model.sayVoiceDuration;
                this.sipCauseDesc = model.sipCauseDesc;
                this.startTime = model.startTime;
                this.uniqueId = model.uniqueId;
                this.webrtcCallId = model.webrtcCallId;
            } 

            /**
             * <p>及时应答</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentAnswerInTime(Long agentAnswerInTime) {
                this.agentAnswerInTime = agentAnswerInTime;
                return this;
            }

            /**
             * <p>接听时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder answerTime(Long answerTime) {
                this.answerTime = answerTime;
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
             * <p>30</p>
             */
            public Builder bridgeDuration(Long bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>接听状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder bridgeStatus(String bridgeStatus) {
                this.bridgeStatus = bridgeStatus;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder bridgeStatusDetail(String bridgeStatusDetail) {
                this.bridgeStatusDetail = bridgeStatusDetail;
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
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>1122</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户号码城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder customerCity(String customerCity) {
                this.customerCity = customerCity;
                return this;
            }

            /**
             * <p>客户号码，带区号</p>
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
             * <p>示例值示例值</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>呼叫类型</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder detailCallType(String detailCallType) {
                this.detailCallType = detailCallType;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>82</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>热线号码</p>
             * 
             * <strong>example:</strong>
             * <p>Hotline</p>
             */
            public Builder hotline(String hotline) {
                this.hotline = hotline;
                return this;
            }

            /**
             * <p>热线别名</p>
             * 
             * <strong>example:</strong>
             * <p>HotlineName</p>
             */
            public Builder hotlineName(String hotlineName) {
                this.hotlineName = hotlineName;
                return this;
            }

            /**
             * <p>振铃时长</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ibRingingDuration(Long ibRingingDuration) {
                this.ibRingingDuration = ibRingingDuration;
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
             * <p>座席接起时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder offhookTime(Long offhookTime) {
                this.offhookTime = offhookTime;
                return this;
            }

            /**
             * <p>挂断方</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder onHookSource(String onHookSource) {
                this.onHookSource = onHookSource;
                return this;
            }

            /**
             * <p>来电队列名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder qname(String qname) {
                this.qname = qname;
                return this;
            }

            /**
             * <p>来电队列号</p>
             * 
             * <strong>example:</strong>
             * <p>2233</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            /**
             * <p>录音文件名</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>主叫记忆。obRemember: 外呼主叫记忆，ibRemember: 来电主叫记忆</p>
             * 
             * <strong>example:</strong>
             * <p>obRemember</p>
             */
            public Builder remember(String remember) {
                this.remember = remember;
                return this;
            }

            /**
             * <p>振铃时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder ringTime(Long ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * <p>语音播报时长</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder sayVoiceDuration(Long sayVoiceDuration) {
                this.sayVoiceDuration = sayVoiceDuration;
                return this;
            }

            /**
             * <p>呼叫情况</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder sipCauseDesc(String sipCauseDesc) {
                this.sipCauseDesc = sipCauseDesc;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
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

            public CdrIbAgent build() {
                return new CdrIbAgent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListCdrIbAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrIbAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrIbAgent")
        private java.util.List<CdrIbAgent> cdrIbAgent;

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
            this.cdrIbAgent = builder.cdrIbAgent;
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
         * @return cdrIbAgent
         */
        public java.util.List<CdrIbAgent> getCdrIbAgent() {
            return this.cdrIbAgent;
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
            private java.util.List<CdrIbAgent> cdrIbAgent; 
            private String clinkRequestId; 
            private Long pageNumber; 
            private Long pageSize; 
            private String scrollId; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrIbAgent = model.cdrIbAgent;
                this.clinkRequestId = model.clinkRequestId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.scrollId = model.scrollId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>[座席接听记录列表] #座席接听记录列表</p>
             */
            public Builder cdrIbAgent(java.util.List<CdrIbAgent> cdrIbAgent) {
                this.cdrIbAgent = cdrIbAgent;
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
             * <p>20</p>
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
