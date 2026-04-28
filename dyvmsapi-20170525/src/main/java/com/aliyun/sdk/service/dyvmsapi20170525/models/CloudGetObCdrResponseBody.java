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
 * {@link CloudGetObCdrResponseBody} extends {@link TeaModel}
 *
 * <p>CloudGetObCdrResponseBody</p>
 */
public class CloudGetObCdrResponseBody extends TeaModel {
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

    private CloudGetObCdrResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetObCdrResponseBody create() {
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

        private Builder(CloudGetObCdrResponseBody model) {
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

        public CloudGetObCdrResponseBody build() {
            return new CloudGetObCdrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudGetObCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetObCdrResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AnswerTime")
        private String answerTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CallTypeCode")
        private String callTypeCode;

        @com.aliyun.core.annotation.NameInMap("CalleeAreaCode")
        private String calleeAreaCode;

        @com.aliyun.core.annotation.NameInMap("CalleeNumber")
        private String calleeNumber;

        @com.aliyun.core.annotation.NameInMap("Clid")
        private String clid;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("DisplayNumber")
        private String displayNumber;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private String endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Gno")
        private String gno;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JoinQueueTime")
        private String joinQueueTime;

        @com.aliyun.core.annotation.NameInMap("MainCallType")
        private String mainCallType;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private java.util.List<String> recordFile;

        @com.aliyun.core.annotation.NameInMap("RingingTime")
        private String ringingTime;

        @com.aliyun.core.annotation.NameInMap("SipCause")
        private String sipCause;

        @com.aliyun.core.annotation.NameInMap("SipCauseStr")
        private String sipCauseStr;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private String totalDuration;

        @com.aliyun.core.annotation.NameInMap("TrunkGroupKey")
        private String trunkGroupKey;

        @com.aliyun.core.annotation.NameInMap("TsiFile")
        private String tsiFile;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("XNumber")
        private String xNumber;

        private List(Builder builder) {
            this.agentName = builder.agentName;
            this.answerTime = builder.answerTime;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.callTypeCode = builder.callTypeCode;
            this.calleeAreaCode = builder.calleeAreaCode;
            this.calleeNumber = builder.calleeNumber;
            this.clid = builder.clid;
            this.cno = builder.cno;
            this.displayNumber = builder.displayNumber;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.gno = builder.gno;
            this.id = builder.id;
            this.joinQueueTime = builder.joinQueueTime;
            this.mainCallType = builder.mainCallType;
            this.mainUniqueId = builder.mainUniqueId;
            this.qno = builder.qno;
            this.queueName = builder.queueName;
            this.recordFile = builder.recordFile;
            this.ringingTime = builder.ringingTime;
            this.sipCause = builder.sipCause;
            this.sipCauseStr = builder.sipCauseStr;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.taskName = builder.taskName;
            this.totalDuration = builder.totalDuration;
            this.trunkGroupKey = builder.trunkGroupKey;
            this.tsiFile = builder.tsiFile;
            this.uniqueId = builder.uniqueId;
            this.xNumber = builder.xNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return answerTime
         */
        public String getAnswerTime() {
            return this.answerTime;
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
         * @return callTypeCode
         */
        public String getCallTypeCode() {
            return this.callTypeCode;
        }

        /**
         * @return calleeAreaCode
         */
        public String getCalleeAreaCode() {
            return this.calleeAreaCode;
        }

        /**
         * @return calleeNumber
         */
        public String getCalleeNumber() {
            return this.calleeNumber;
        }

        /**
         * @return clid
         */
        public String getClid() {
            return this.clid;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return displayNumber
         */
        public String getDisplayNumber() {
            return this.displayNumber;
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
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gno
         */
        public String getGno() {
            return this.gno;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return joinQueueTime
         */
        public String getJoinQueueTime() {
            return this.joinQueueTime;
        }

        /**
         * @return mainCallType
         */
        public String getMainCallType() {
            return this.mainCallType;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        /**
         * @return qno
         */
        public String getQno() {
            return this.qno;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return recordFile
         */
        public java.util.List<String> getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return ringingTime
         */
        public String getRingingTime() {
            return this.ringingTime;
        }

        /**
         * @return sipCause
         */
        public String getSipCause() {
            return this.sipCause;
        }

        /**
         * @return sipCauseStr
         */
        public String getSipCauseStr() {
            return this.sipCauseStr;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
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
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return totalDuration
         */
        public String getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return trunkGroupKey
         */
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
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
         * @return xNumber
         */
        public String getXNumber() {
            return this.xNumber;
        }

        public static final class Builder {
            private String agentName; 
            private String answerTime; 
            private String callId; 
            private String callType; 
            private String callTypeCode; 
            private String calleeAreaCode; 
            private String calleeNumber; 
            private String clid; 
            private String cno; 
            private String displayNumber; 
            private String endReason; 
            private String endTime; 
            private String gno; 
            private String id; 
            private String joinQueueTime; 
            private String mainCallType; 
            private String mainUniqueId; 
            private String qno; 
            private String queueName; 
            private java.util.List<String> recordFile; 
            private String ringingTime; 
            private String sipCause; 
            private String sipCauseStr; 
            private String startTime; 
            private String status; 
            private String statusCode; 
            private String taskName; 
            private String totalDuration; 
            private String trunkGroupKey; 
            private String tsiFile; 
            private String uniqueId; 
            private String xNumber; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentName = model.agentName;
                this.answerTime = model.answerTime;
                this.callId = model.callId;
                this.callType = model.callType;
                this.callTypeCode = model.callTypeCode;
                this.calleeAreaCode = model.calleeAreaCode;
                this.calleeNumber = model.calleeNumber;
                this.clid = model.clid;
                this.cno = model.cno;
                this.displayNumber = model.displayNumber;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.gno = model.gno;
                this.id = model.id;
                this.joinQueueTime = model.joinQueueTime;
                this.mainCallType = model.mainCallType;
                this.mainUniqueId = model.mainUniqueId;
                this.qno = model.qno;
                this.queueName = model.queueName;
                this.recordFile = model.recordFile;
                this.ringingTime = model.ringingTime;
                this.sipCause = model.sipCause;
                this.sipCauseStr = model.sipCauseStr;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.taskName = model.taskName;
                this.totalDuration = model.totalDuration;
                this.trunkGroupKey = model.trunkGroupKey;
                this.tsiFile = model.tsiFile;
                this.uniqueId = model.uniqueId;
                this.xNumber = model.xNumber;
            } 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>客户接听时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder answerTime(String answerTime) {
                this.answerTime = answerTime;
                return this;
            }

            /**
             * <p>通话唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>uniq_1-162046xxxx.12</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>呼叫类型 转移</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>呼叫类型编码，如102</p>
             * 
             * <strong>example:</strong>
             * <p>102</p>
             */
            public Builder callTypeCode(String callTypeCode) {
                this.callTypeCode = callTypeCode;
                return this;
            }

            /**
             * <p>被叫号码区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder calleeAreaCode(String calleeAreaCode) {
                this.calleeAreaCode = calleeAreaCode;
                return this;
            }

            /**
             * <p>呼叫的号码，可能是座席也可能是普通电话</p>
             * 
             * <strong>example:</strong>
             * <p>01041003090</p>
             */
            public Builder calleeNumber(String calleeNumber) {
                this.calleeNumber = calleeNumber;
                return this;
            }

            /**
             * <p>外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>02138276106</p>
             */
            public Builder clid(String clid) {
                this.clid = clid;
                return this;
            }

            /**
             * <p>座席工号，如2000</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户侧真实外显号码，当使用AXB场景进行外呼时，客户侧真实外显号码为虚拟号</p>
             * 
             * <strong>example:</strong>
             * <p>02138276106</p>
             */
            public Builder displayNumber(String displayNumber) {
                this.displayNumber = displayNumber;
                return this;
            }

            /**
             * <p>结束原因,接听之后的挂机原因 1000:主通道挂机 1001:非主通道挂机 1002:被强拆</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder endReason(String endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * <p>电话结束时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Gno.
             */
            public Builder gno(String gno) {
                this.gno = gno;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>797880898</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>入队列时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder joinQueueTime(String joinQueueTime) {
                this.joinQueueTime = joinQueueTime;
                return this;
            }

            /**
             * <p>主通话记录来电类型 主叫外呼</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder mainCallType(String mainCallType) {
                this.mainCallType = mainCallType;
                return this;
            }

            /**
             * <p>主外呼通话记录唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>uniq_1-162046xxxx.12</p>
             */
            public Builder mainUniqueId(String mainUniqueId) {
                this.mainUniqueId = mainUniqueId;
                return this;
            }

            /**
             * <p>队列号</p>
             * 
             * <strong>example:</strong>
             * <p>131</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            /**
             * <p>进入队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * RecordFile.
             */
            public Builder recordFile(java.util.List<String> recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>响铃时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder ringingTime(String ringingTime) {
                this.ringingTime = ringingTime;
                return this;
            }

            /**
             * <p>SIP响应码：200 ~ 699</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder sipCause(String sipCause) {
                this.sipCause = sipCause;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder sipCauseStr(String sipCauseStr) {
                this.sipCauseStr = sipCauseStr;
                return this;
            }

            /**
             * <p>呼叫客户时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>外呼结果，如接听</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>总通话时长秒数，单位是s</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder totalDuration(String totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>中继群组代号</p>
             * 
             * <strong>example:</strong>
             * <p>30019</p>
             */
            public Builder trunkGroupKey(String trunkGroupKey) {
                this.trunkGroupKey = trunkGroupKey;
                return this;
            }

            /**
             * <p>号码状态识别录音文件名</p>
             * 
             * <strong>example:</strong>
             * <p>name5</p>
             */
            public Builder tsiFile(String tsiFile) {
                this.tsiFile = tsiFile;
                return this;
            }

            /**
             * <p>从通道唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>uniq_1-162046xxxx.12</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * XNumber.
             */
            public Builder xNumber(String xNumber) {
                this.xNumber = xNumber;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetObCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetObCdrResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
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

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * <p>座席外呼通话记录详情</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
