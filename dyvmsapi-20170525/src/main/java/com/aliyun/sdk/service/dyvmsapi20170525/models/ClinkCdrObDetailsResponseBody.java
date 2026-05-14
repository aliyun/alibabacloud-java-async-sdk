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
 * {@link ClinkCdrObDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkCdrObDetailsResponseBody</p>
 */
public class ClinkCdrObDetailsResponseBody extends TeaModel {
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

    private ClinkCdrObDetailsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkCdrObDetailsResponseBody create() {
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

        private Builder(ClinkCdrObDetailsResponseBody model) {
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

        public ClinkCdrObDetailsResponseBody build() {
            return new ClinkCdrObDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkCdrObDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCdrObDetailsResponseBody</p>
     */
    public static class CdrObDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerTime")
        private Long answerTime;

        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private Long bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Long callType;

        @com.aliyun.core.annotation.NameInMap("CallTypeDesc")
        private String callTypeDesc;

        @com.aliyun.core.annotation.NameInMap("CalleeRingingTime")
        private Long calleeRingingTime;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientNumber")
        private String clientNumber;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("DetailCallType")
        private Long detailCallType;

        @com.aliyun.core.annotation.NameInMap("DetailCallTypeDesc")
        private String detailCallTypeDesc;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("ObSipCause")
        private String obSipCause;

        @com.aliyun.core.annotation.NameInMap("ObSipCauseRaw")
        private String obSipCauseRaw;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("SipCause")
        private Long sipCause;

        @com.aliyun.core.annotation.NameInMap("SipCauseDesc")
        private String sipCauseDesc;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TsiFile")
        private String tsiFile;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("WebrtcCallId")
        private String webrtcCallId;

        private CdrObDetails(Builder builder) {
            this.answerTime = builder.answerTime;
            this.bridgeDuration = builder.bridgeDuration;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.callTypeDesc = builder.callTypeDesc;
            this.calleeRingingTime = builder.calleeRingingTime;
            this.clientName = builder.clientName;
            this.clientNumber = builder.clientNumber;
            this.cno = builder.cno;
            this.detailCallType = builder.detailCallType;
            this.detailCallTypeDesc = builder.detailCallTypeDesc;
            this.endTime = builder.endTime;
            this.mainUniqueId = builder.mainUniqueId;
            this.obSipCause = builder.obSipCause;
            this.obSipCauseRaw = builder.obSipCauseRaw;
            this.recordFile = builder.recordFile;
            this.sipCause = builder.sipCause;
            this.sipCauseDesc = builder.sipCauseDesc;
            this.startTime = builder.startTime;
            this.tsiFile = builder.tsiFile;
            this.uniqueId = builder.uniqueId;
            this.webrtcCallId = builder.webrtcCallId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrObDetails create() {
            return builder().build();
        }

        /**
         * @return answerTime
         */
        public Long getAnswerTime() {
            return this.answerTime;
        }

        /**
         * @return bridgeDuration
         */
        public Long getBridgeDuration() {
            return this.bridgeDuration;
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
        public Long getCallType() {
            return this.callType;
        }

        /**
         * @return callTypeDesc
         */
        public String getCallTypeDesc() {
            return this.callTypeDesc;
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
         * @return detailCallType
         */
        public Long getDetailCallType() {
            return this.detailCallType;
        }

        /**
         * @return detailCallTypeDesc
         */
        public String getDetailCallTypeDesc() {
            return this.detailCallTypeDesc;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
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
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return sipCause
         */
        public Long getSipCause() {
            return this.sipCause;
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
         * @return tsiFile
         */
        public String getTsiFile() {
            return this.tsiFile;
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
            private Long answerTime; 
            private Long bridgeDuration; 
            private String callId; 
            private Long callType; 
            private String callTypeDesc; 
            private Long calleeRingingTime; 
            private String clientName; 
            private String clientNumber; 
            private String cno; 
            private Long detailCallType; 
            private String detailCallTypeDesc; 
            private Long endTime; 
            private String mainUniqueId; 
            private String obSipCause; 
            private String obSipCauseRaw; 
            private String recordFile; 
            private Long sipCause; 
            private String sipCauseDesc; 
            private Long startTime; 
            private String tsiFile; 
            private String uniqueId; 
            private String webrtcCallId; 

            private Builder() {
            } 

            private Builder(CdrObDetails model) {
                this.answerTime = model.answerTime;
                this.bridgeDuration = model.bridgeDuration;
                this.callId = model.callId;
                this.callType = model.callType;
                this.callTypeDesc = model.callTypeDesc;
                this.calleeRingingTime = model.calleeRingingTime;
                this.clientName = model.clientName;
                this.clientNumber = model.clientNumber;
                this.cno = model.cno;
                this.detailCallType = model.detailCallType;
                this.detailCallTypeDesc = model.detailCallTypeDesc;
                this.endTime = model.endTime;
                this.mainUniqueId = model.mainUniqueId;
                this.obSipCause = model.obSipCause;
                this.obSipCauseRaw = model.obSipCauseRaw;
                this.recordFile = model.recordFile;
                this.sipCause = model.sipCause;
                this.sipCauseDesc = model.sipCauseDesc;
                this.startTime = model.startTime;
                this.tsiFile = model.tsiFile;
                this.uniqueId = model.uniqueId;
                this.webrtcCallId = model.webrtcCallId;
            } 

            /**
             * <p>客户接听时间</p>
             * 
             * <strong>example:</strong>
             * <p>1717583928</p>
             */
            public Builder answerTime(Long answerTime) {
                this.answerTime = answerTime;
                return this;
            }

            /**
             * <p>通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder bridgeDuration(Long bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>CallID</p>
             * 
             * <strong>example:</strong>
             * <p>1d7acd5d-xxxx-xxxx-xxxx-0d3c08317140</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>通话类型，说明参考 通用字段 #通用字段</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder callType(Long callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>通话类型描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder callTypeDesc(String callTypeDesc) {
                this.callTypeDesc = callTypeDesc;
                return this;
            }

            /**
             * <p>客户响铃时间</p>
             * 
             * <strong>example:</strong>
             * <p>1717583922</p>
             */
            public Builder calleeRingingTime(Long calleeRingingTime) {
                this.calleeRingingTime = calleeRingingTime;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
             * <p>呼叫类型，说明参考 通用字段 #通用字段</p>
             * 
             * <strong>example:</strong>
             * <p>208</p>
             */
            public Builder detailCallType(Long detailCallType) {
                this.detailCallType = detailCallType;
                return this;
            }

            /**
             * <p>呼叫类型描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder detailCallTypeDesc(String detailCallTypeDesc) {
                this.detailCallTypeDesc = detailCallTypeDesc;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1717583950</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder obSipCause(String obSipCause) {
                this.obSipCause = obSipCause;
                return this;
            }

            /**
             * <p>被叫状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder obSipCauseRaw(String obSipCauseRaw) {
                this.obSipCauseRaw = obSipCauseRaw;
                return this;
            }

            /**
             * <p>录音</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>呼叫情况</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder sipCause(Long sipCause) {
                this.sipCause = sipCause;
                return this;
            }

            /**
             * <p>呼叫情况描述</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder sipCauseDesc(String sipCauseDesc) {
                this.sipCauseDesc = sipCauseDesc;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1717583916</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>客户彩铃录音</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder tsiFile(String tsiFile) {
                this.tsiFile = tsiFile;
                return this;
            }

            /**
             * <p>通话唯一ID</p>
             * 
             * <strong>example:</strong>
             * <p>uniq_1-162046xxxx.12</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * <p>WebRTCCallID</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder webrtcCallId(String webrtcCallId) {
                this.webrtcCallId = webrtcCallId;
                return this;
            }

            public CdrObDetails build() {
                return new CdrObDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkCdrObDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCdrObDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrObDetails")
        private java.util.List<CdrObDetails> cdrObDetails;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        private Data(Builder builder) {
            this.cdrObDetails = builder.cdrObDetails;
            this.clinkRequestId = builder.clinkRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdrObDetails
         */
        public java.util.List<CdrObDetails> getCdrObDetails() {
            return this.cdrObDetails;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public static final class Builder {
            private java.util.List<CdrObDetails> cdrObDetails; 
            private String clinkRequestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrObDetails = model.cdrObDetails;
                this.clinkRequestId = model.clinkRequestId;
            } 

            /**
             * <p>[外呼详情] #外呼详情</p>
             */
            public Builder cdrObDetails(java.util.List<CdrObDetails> cdrObDetails) {
                this.cdrObDetails = cdrObDetails;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
