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
 * {@link ClinkListCdrIbsResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListCdrIbsResponseBody</p>
 */
public class ClinkListCdrIbsResponseBody extends TeaModel {
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

    private ClinkListCdrIbsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListCdrIbsResponseBody create() {
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

        private Builder(ClinkListCdrIbsResponseBody model) {
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

        public ClinkListCdrIbsResponseBody build() {
            return new ClinkListCdrIbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListCdrIbsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrIbsResponseBody</p>
     */
    public static class CdrIbs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private Long bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("BridgeTime")
        private Long bridgeTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientNumber")
        private String clientNumber;

        @com.aliyun.core.annotation.NameInMap("ClientOffhookTime")
        private Long clientOffhookTime;

        @com.aliyun.core.annotation.NameInMap("ClientRingingTime")
        private Long clientRingingTime;

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

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private String endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Evaluation")
        private Long evaluation;

        @com.aliyun.core.annotation.NameInMap("FirstJoinQueueTime")
        private Long firstJoinQueueTime;

        @com.aliyun.core.annotation.NameInMap("Hotline")
        private String hotline;

        @com.aliyun.core.annotation.NameInMap("HotlineName")
        private String hotlineName;

        @com.aliyun.core.annotation.NameInMap("IbRingingDuration")
        private Long ibRingingDuration;

        @com.aliyun.core.annotation.NameInMap("IbWaitDuration")
        private Long ibWaitDuration;

        @com.aliyun.core.annotation.NameInMap("IvrName")
        private String ivrName;

        @com.aliyun.core.annotation.NameInMap("JoinQueueTime")
        private Long joinQueueTime;

        @com.aliyun.core.annotation.NameInMap("LeaveQueueTime")
        private Long leaveQueueTime;

        @com.aliyun.core.annotation.NameInMap("Mark")
        private Long mark;

        @com.aliyun.core.annotation.NameInMap("MarkData")
        private String markData;

        @com.aliyun.core.annotation.NameInMap("Qname")
        private String qname;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("QueueAnswerInTime")
        private Long queueAnswerInTime;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("SayVoiceDuration")
        private Long sayVoiceDuration;

        @com.aliyun.core.annotation.NameInMap("SipCause")
        private String sipCause;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TagNames")
        private java.util.List<String> tagNames;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        private CdrIbs(Builder builder) {
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.clientName = builder.clientName;
            this.clientNumber = builder.clientNumber;
            this.clientOffhookTime = builder.clientOffhookTime;
            this.clientRingingTime = builder.clientRingingTime;
            this.cno = builder.cno;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerNumberEncrypt = builder.customerNumberEncrypt;
            this.customerProvince = builder.customerProvince;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.evaluation = builder.evaluation;
            this.firstJoinQueueTime = builder.firstJoinQueueTime;
            this.hotline = builder.hotline;
            this.hotlineName = builder.hotlineName;
            this.ibRingingDuration = builder.ibRingingDuration;
            this.ibWaitDuration = builder.ibWaitDuration;
            this.ivrName = builder.ivrName;
            this.joinQueueTime = builder.joinQueueTime;
            this.leaveQueueTime = builder.leaveQueueTime;
            this.mark = builder.mark;
            this.markData = builder.markData;
            this.qname = builder.qname;
            this.qno = builder.qno;
            this.queueAnswerInTime = builder.queueAnswerInTime;
            this.recordFile = builder.recordFile;
            this.sayVoiceDuration = builder.sayVoiceDuration;
            this.sipCause = builder.sipCause;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.tagNames = builder.tagNames;
            this.tags = builder.tags;
            this.totalDuration = builder.totalDuration;
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrIbs create() {
            return builder().build();
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
         * @return clientOffhookTime
         */
        public Long getClientOffhookTime() {
            return this.clientOffhookTime;
        }

        /**
         * @return clientRingingTime
         */
        public Long getClientRingingTime() {
            return this.clientRingingTime;
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
         * @return endReason
         */
        public String getEndReason() {
            return this.endReason;
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
        public Long getEvaluation() {
            return this.evaluation;
        }

        /**
         * @return firstJoinQueueTime
         */
        public Long getFirstJoinQueueTime() {
            return this.firstJoinQueueTime;
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
         * @return ibWaitDuration
         */
        public Long getIbWaitDuration() {
            return this.ibWaitDuration;
        }

        /**
         * @return ivrName
         */
        public String getIvrName() {
            return this.ivrName;
        }

        /**
         * @return joinQueueTime
         */
        public Long getJoinQueueTime() {
            return this.joinQueueTime;
        }

        /**
         * @return leaveQueueTime
         */
        public Long getLeaveQueueTime() {
            return this.leaveQueueTime;
        }

        /**
         * @return mark
         */
        public Long getMark() {
            return this.mark;
        }

        /**
         * @return markData
         */
        public String getMarkData() {
            return this.markData;
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
         * @return queueAnswerInTime
         */
        public Long getQueueAnswerInTime() {
            return this.queueAnswerInTime;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return sayVoiceDuration
         */
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        /**
         * @return sipCause
         */
        public String getSipCause() {
            return this.sipCause;
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
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return tagNames
         */
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private Long bridgeDuration; 
            private Long bridgeTime; 
            private String callId; 
            private String callType; 
            private String clientName; 
            private String clientNumber; 
            private Long clientOffhookTime; 
            private Long clientRingingTime; 
            private String cno; 
            private String customerCity; 
            private String customerNumber; 
            private String customerNumberEncrypt; 
            private String customerProvince; 
            private String endReason; 
            private Long endTime; 
            private Long evaluation; 
            private Long firstJoinQueueTime; 
            private String hotline; 
            private String hotlineName; 
            private Long ibRingingDuration; 
            private Long ibWaitDuration; 
            private String ivrName; 
            private Long joinQueueTime; 
            private Long leaveQueueTime; 
            private Long mark; 
            private String markData; 
            private String qname; 
            private String qno; 
            private Long queueAnswerInTime; 
            private String recordFile; 
            private Long sayVoiceDuration; 
            private String sipCause; 
            private Long startTime; 
            private String status; 
            private String statusCode; 
            private java.util.List<String> tagNames; 
            private java.util.List<String> tags; 
            private Long totalDuration; 
            private String uniqueId; 

            private Builder() {
            } 

            private Builder(CdrIbs model) {
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.callId = model.callId;
                this.callType = model.callType;
                this.clientName = model.clientName;
                this.clientNumber = model.clientNumber;
                this.clientOffhookTime = model.clientOffhookTime;
                this.clientRingingTime = model.clientRingingTime;
                this.cno = model.cno;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerNumberEncrypt = model.customerNumberEncrypt;
                this.customerProvince = model.customerProvince;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.evaluation = model.evaluation;
                this.firstJoinQueueTime = model.firstJoinQueueTime;
                this.hotline = model.hotline;
                this.hotlineName = model.hotlineName;
                this.ibRingingDuration = model.ibRingingDuration;
                this.ibWaitDuration = model.ibWaitDuration;
                this.ivrName = model.ivrName;
                this.joinQueueTime = model.joinQueueTime;
                this.leaveQueueTime = model.leaveQueueTime;
                this.mark = model.mark;
                this.markData = model.markData;
                this.qname = model.qname;
                this.qno = model.qno;
                this.queueAnswerInTime = model.queueAnswerInTime;
                this.recordFile = model.recordFile;
                this.sayVoiceDuration = model.sayVoiceDuration;
                this.sipCause = model.sipCause;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.tagNames = model.tagNames;
                this.tags = model.tags;
                this.totalDuration = model.totalDuration;
                this.uniqueId = model.uniqueId;
            } 

            /**
             * <p>接通时长</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder bridgeDuration(Long bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>接通时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder bridgeTime(Long bridgeTime) {
                this.bridgeTime = bridgeTime;
                return this;
            }

            /**
             * <p>通话记录 Id</p>
             * 
             * <strong>example:</strong>
             * <p>b1651313-0e70-487c-99fd-3ea342b35b00</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>呼入类型</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
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
             * <p>座席接起时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder clientOffhookTime(Long clientOffhookTime) {
                this.clientOffhookTime = clientOffhookTime;
                return this;
            }

            /**
             * <p>座席响铃时间</p>
             * 
             * <strong>example:</strong>
             * <p>1537329247</p>
             */
            public Builder clientRingingTime(Long clientRingingTime) {
                this.clientRingingTime = clientRingingTime;
                return this;
            }

            /**
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户来电城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder customerCity(String customerCity) {
                this.customerCity = customerCity;
                return this;
            }

            /**
             * <p>客户来电号码，带区号</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>客户来电号码加密串</p>
             * 
             * <strong>example:</strong>
             * <p>TNjljZjZlNjgxYmIwNjMxGEwMzA3MmQ0MDQzYWEyMjY</p>
             */
            public Builder customerNumberEncrypt(String customerNumberEncrypt) {
                this.customerNumberEncrypt = customerNumberEncrypt;
                return this;
            }

            /**
             * <p>客户来电省份</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>挂机方</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder endReason(String endReason) {
                this.endReason = endReason;
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
             * <p>0</p>
             */
            public Builder evaluation(Long evaluation) {
                this.evaluation = evaluation;
                return this;
            }

            /**
             * <p>首次进入队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder firstJoinQueueTime(Long firstJoinQueueTime) {
                this.firstJoinQueueTime = firstJoinQueueTime;
                return this;
            }

            /**
             * <p>来电热线号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
             * <p>座席振铃时长</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ibRingingDuration(Long ibRingingDuration) {
                this.ibRingingDuration = ibRingingDuration;
                return this;
            }

            /**
             * <p>排队时长</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder ibWaitDuration(Long ibWaitDuration) {
                this.ibWaitDuration = ibWaitDuration;
                return this;
            }

            /**
             * <p>IVR名称</p>
             * 
             * <strong>example:</strong>
             * <p>IvrName</p>
             */
            public Builder ivrName(String ivrName) {
                this.ivrName = ivrName;
                return this;
            }

            /**
             * <p>加入队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>1647255885</p>
             */
            public Builder joinQueueTime(Long joinQueueTime) {
                this.joinQueueTime = joinQueueTime;
                return this;
            }

            /**
             * <p>离开队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder leaveQueueTime(Long leaveQueueTime) {
                this.leaveQueueTime = leaveQueueTime;
                return this;
            }

            /**
             * <p>标记</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder mark(Long mark) {
                this.mark = mark;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder markData(String markData) {
                this.markData = markData;
                return this;
            }

            /**
             * <p>来电队列名称</p>
             * 
             * <strong>example:</strong>
             * <p>Qname</p>
             */
            public Builder qname(String qname) {
                this.qname = qname;
                return this;
            }

            /**
             * <p>来电队列号</p>
             * 
             * <strong>example:</strong>
             * <p>2332</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            /**
             * <p>队列及时应答</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queueAnswerInTime(Long queueAnswerInTime) {
                this.queueAnswerInTime = queueAnswerInTime;
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
             * <p>语音播报时长</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sayVoiceDuration(Long sayVoiceDuration) {
                this.sayVoiceDuration = sayVoiceDuration;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder sipCause(String sipCause) {
                this.sipCause = sipCause;
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
             * <p>接听状态映射</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>展示通话标签详情,当请求参数fields中包含tagNames时返回</p>
             */
            public Builder tagNames(java.util.List<String> tagNames) {
                this.tagNames = tagNames;
                return this;
            }

            /**
             * <p>标签</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>总时长</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>通话记录唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>AWS_DEV_MEDIA_SERVER_8-1537329247.6</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public CdrIbs build() {
                return new CdrIbs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListCdrIbsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListCdrIbsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrIbs")
        private java.util.List<CdrIbs> cdrIbs;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.cdrIbs = builder.cdrIbs;
            this.clinkRequestId = builder.clinkRequestId;
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
         * @return cdrIbs
         */
        public java.util.List<CdrIbs> getCdrIbs() {
            return this.cdrIbs;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CdrIbs> cdrIbs; 
            private String clinkRequestId; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrIbs = model.cdrIbs;
                this.clinkRequestId = model.clinkRequestId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>[呼入通话记录列表] #呼入通话记录列表</p>
             */
            public Builder cdrIbs(java.util.List<CdrIbs> cdrIbs) {
                this.cdrIbs = cdrIbs;
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
             * <p>总条数</p>
             * 
             * <strong>example:</strong>
             * <p>57</p>
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
