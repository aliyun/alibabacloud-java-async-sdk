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
 * {@link CloudQueryPredictiveCallCdrResponseBody} extends {@link TeaModel}
 *
 * <p>CloudQueryPredictiveCallCdrResponseBody</p>
 */
public class CloudQueryPredictiveCallCdrResponseBody extends TeaModel {
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

    private CloudQueryPredictiveCallCdrResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryPredictiveCallCdrResponseBody create() {
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

        private Builder(CloudQueryPredictiveCallCdrResponseBody model) {
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

        public CloudQueryPredictiveCallCdrResponseBody build() {
            return new CloudQueryPredictiveCallCdrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudQueryPredictiveCallCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryPredictiveCallCdrResponseBody</p>
     */
    public static class RecordFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("File")
        private String file;

        @com.aliyun.core.annotation.NameInMap("Monitor_type")
        private Long monitorType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RecordFile(Builder builder) {
            this.file = builder.file;
            this.monitorType = builder.monitorType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFile create() {
            return builder().build();
        }

        /**
         * @return file
         */
        public String getFile() {
            return this.file;
        }

        /**
         * @return monitorType
         */
        public Long getMonitorType() {
            return this.monitorType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String file; 
            private Long monitorType; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecordFile model) {
                this.file = model.file;
                this.monitorType = model.monitorType;
                this.type = model.type;
            } 

            /**
             * <p>录音文件名</p>
             * 
             * <strong>example:</strong>
             * <p>name3</p>
             */
            public Builder file(String file) {
                this.file = file;
                return this;
            }

            /**
             * <ol>
             * <li>混音 2. 分线录音（保留2个单声道WAV） 3.留言 5. 分线录音（保留1个双声道WAV）</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder monitorType(Long monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * <p>取值：record,voicemail 说明：record是录音， voicemail是留言</p>
             * 
             * <strong>example:</strong>
             * <p>record</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecordFile build() {
                return new RecordFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudQueryPredictiveCallCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryPredictiveCallCdrResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AnswerTime")
        private String answerTime;

        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private String bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("BridgeTime")
        private String bridgeTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CalleeClid")
        private String calleeClid;

        @com.aliyun.core.annotation.NameInMap("CalleeDisplayNumber")
        private String calleeDisplayNumber;

        @com.aliyun.core.annotation.NameInMap("CalleeNumber")
        private String calleeNumber;

        @com.aliyun.core.annotation.NameInMap("CalleeRingingTime")
        private String calleeRingingTime;

        @com.aliyun.core.annotation.NameInMap("Clid")
        private String clid;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CustomerCity")
        private String customerCity;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerProvince")
        private String customerProvince;

        @com.aliyun.core.annotation.NameInMap("DetailRingingTime")
        private String detailRingingTime;

        @com.aliyun.core.annotation.NameInMap("DisplayNumber")
        private String displayNumber;

        @com.aliyun.core.annotation.NameInMap("DownGrade")
        private String downGrade;

        @com.aliyun.core.annotation.NameInMap("DownGradeCounts")
        private String downGradeCounts;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private String endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Gno")
        private String gno;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsRealAnswer")
        private String isRealAnswer;

        @com.aliyun.core.annotation.NameInMap("IvrName")
        private String ivrName;

        @com.aliyun.core.annotation.NameInMap("NumberTrunk")
        private String numberTrunk;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("RealAnswerTime")
        private String realAnswerTime;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private java.util.List<RecordFile> recordFile;

        @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
        private String requestUniqueId;

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

        @com.aliyun.core.annotation.NameInMap("TaskFileId")
        private String taskFileId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private String totalDuration;

        @com.aliyun.core.annotation.NameInMap("TrunkGroupKey")
        private String trunkGroupKey;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("UserField")
        private java.util.Map<String, ?> userField;

        @com.aliyun.core.annotation.NameInMap("VadIn")
        private String vadIn;

        @com.aliyun.core.annotation.NameInMap("VadOut")
        private String vadOut;

        @com.aliyun.core.annotation.NameInMap("WaitDuration")
        private String waitDuration;

        @com.aliyun.core.annotation.NameInMap("XNumber")
        private String xNumber;

        private List(Builder builder) {
            this.agentName = builder.agentName;
            this.answerTime = builder.answerTime;
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.calleeClid = builder.calleeClid;
            this.calleeDisplayNumber = builder.calleeDisplayNumber;
            this.calleeNumber = builder.calleeNumber;
            this.calleeRingingTime = builder.calleeRingingTime;
            this.clid = builder.clid;
            this.cno = builder.cno;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerProvince = builder.customerProvince;
            this.detailRingingTime = builder.detailRingingTime;
            this.displayNumber = builder.displayNumber;
            this.downGrade = builder.downGrade;
            this.downGradeCounts = builder.downGradeCounts;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.gno = builder.gno;
            this.id = builder.id;
            this.isRealAnswer = builder.isRealAnswer;
            this.ivrName = builder.ivrName;
            this.numberTrunk = builder.numberTrunk;
            this.qno = builder.qno;
            this.realAnswerTime = builder.realAnswerTime;
            this.recordFile = builder.recordFile;
            this.requestUniqueId = builder.requestUniqueId;
            this.sipCause = builder.sipCause;
            this.sipCauseStr = builder.sipCauseStr;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.taskFileId = builder.taskFileId;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.totalDuration = builder.totalDuration;
            this.trunkGroupKey = builder.trunkGroupKey;
            this.uniqueId = builder.uniqueId;
            this.userField = builder.userField;
            this.vadIn = builder.vadIn;
            this.vadOut = builder.vadOut;
            this.waitDuration = builder.waitDuration;
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
         * @return bridgeDuration
         */
        public String getBridgeDuration() {
            return this.bridgeDuration;
        }

        /**
         * @return bridgeTime
         */
        public String getBridgeTime() {
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
         * @return calleeClid
         */
        public String getCalleeClid() {
            return this.calleeClid;
        }

        /**
         * @return calleeDisplayNumber
         */
        public String getCalleeDisplayNumber() {
            return this.calleeDisplayNumber;
        }

        /**
         * @return calleeNumber
         */
        public String getCalleeNumber() {
            return this.calleeNumber;
        }

        /**
         * @return calleeRingingTime
         */
        public String getCalleeRingingTime() {
            return this.calleeRingingTime;
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
         * @return customerProvince
         */
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        /**
         * @return detailRingingTime
         */
        public String getDetailRingingTime() {
            return this.detailRingingTime;
        }

        /**
         * @return displayNumber
         */
        public String getDisplayNumber() {
            return this.displayNumber;
        }

        /**
         * @return downGrade
         */
        public String getDownGrade() {
            return this.downGrade;
        }

        /**
         * @return downGradeCounts
         */
        public String getDownGradeCounts() {
            return this.downGradeCounts;
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
         * @return isRealAnswer
         */
        public String getIsRealAnswer() {
            return this.isRealAnswer;
        }

        /**
         * @return ivrName
         */
        public String getIvrName() {
            return this.ivrName;
        }

        /**
         * @return numberTrunk
         */
        public String getNumberTrunk() {
            return this.numberTrunk;
        }

        /**
         * @return qno
         */
        public String getQno() {
            return this.qno;
        }

        /**
         * @return realAnswerTime
         */
        public String getRealAnswerTime() {
            return this.realAnswerTime;
        }

        /**
         * @return recordFile
         */
        public java.util.List<RecordFile> getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return requestUniqueId
         */
        public String getRequestUniqueId() {
            return this.requestUniqueId;
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
         * @return taskFileId
         */
        public String getTaskFileId() {
            return this.taskFileId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
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
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        /**
         * @return userField
         */
        public java.util.Map<String, ?> getUserField() {
            return this.userField;
        }

        /**
         * @return vadIn
         */
        public String getVadIn() {
            return this.vadIn;
        }

        /**
         * @return vadOut
         */
        public String getVadOut() {
            return this.vadOut;
        }

        /**
         * @return waitDuration
         */
        public String getWaitDuration() {
            return this.waitDuration;
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
            private String bridgeDuration; 
            private String bridgeTime; 
            private String callId; 
            private String callType; 
            private String calleeClid; 
            private String calleeDisplayNumber; 
            private String calleeNumber; 
            private String calleeRingingTime; 
            private String clid; 
            private String cno; 
            private String customerCity; 
            private String customerNumber; 
            private String customerProvince; 
            private String detailRingingTime; 
            private String displayNumber; 
            private String downGrade; 
            private String downGradeCounts; 
            private String endReason; 
            private String endTime; 
            private String gno; 
            private String id; 
            private String isRealAnswer; 
            private String ivrName; 
            private String numberTrunk; 
            private String qno; 
            private String realAnswerTime; 
            private java.util.List<RecordFile> recordFile; 
            private String requestUniqueId; 
            private String sipCause; 
            private String sipCauseStr; 
            private String startTime; 
            private String status; 
            private String statusCode; 
            private String taskFileId; 
            private String taskId; 
            private String taskName; 
            private String totalDuration; 
            private String trunkGroupKey; 
            private String uniqueId; 
            private java.util.Map<String, ?> userField; 
            private String vadIn; 
            private String vadOut; 
            private String waitDuration; 
            private String xNumber; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentName = model.agentName;
                this.answerTime = model.answerTime;
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.callId = model.callId;
                this.callType = model.callType;
                this.calleeClid = model.calleeClid;
                this.calleeDisplayNumber = model.calleeDisplayNumber;
                this.calleeNumber = model.calleeNumber;
                this.calleeRingingTime = model.calleeRingingTime;
                this.clid = model.clid;
                this.cno = model.cno;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerProvince = model.customerProvince;
                this.detailRingingTime = model.detailRingingTime;
                this.displayNumber = model.displayNumber;
                this.downGrade = model.downGrade;
                this.downGradeCounts = model.downGradeCounts;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.gno = model.gno;
                this.id = model.id;
                this.isRealAnswer = model.isRealAnswer;
                this.ivrName = model.ivrName;
                this.numberTrunk = model.numberTrunk;
                this.qno = model.qno;
                this.realAnswerTime = model.realAnswerTime;
                this.recordFile = model.recordFile;
                this.requestUniqueId = model.requestUniqueId;
                this.sipCause = model.sipCause;
                this.sipCauseStr = model.sipCauseStr;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.taskFileId = model.taskFileId;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.totalDuration = model.totalDuration;
                this.trunkGroupKey = model.trunkGroupKey;
                this.uniqueId = model.uniqueId;
                this.userField = model.userField;
                this.vadIn = model.vadIn;
                this.vadOut = model.vadOut;
                this.waitDuration = model.waitDuration;
                this.xNumber = model.xNumber;
            } 

            /**
             * <p>座席姓名, 如&quot;张三1010&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>系统接听时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder answerTime(String answerTime) {
                this.answerTime = answerTime;
                return this;
            }

            /**
             * <p>服务处理时长秒数，单位是s</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bridgeDuration(String bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>座席接听时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1774822305</p>
             */
            public Builder bridgeTime(String bridgeTime) {
                this.bridgeTime = bridgeTime;
                return this;
            }

            /**
             * <p>通话唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>3cdf8d08-0216-42df-bba5-0fd45c93c9b3</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>呼叫类型 webcall</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>第二侧外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>15553333</p>
             */
            public Builder calleeClid(String calleeClid) {
                this.calleeClid = calleeClid;
                return this;
            }

            /**
             * <p>第二侧真实外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>02138276106</p>
             */
            public Builder calleeDisplayNumber(String calleeDisplayNumber) {
                this.calleeDisplayNumber = calleeDisplayNumber;
                return this;
            }

            /**
             * <p>座席电话 区号 +7或8位的固话号码，区号与固话号码之间无&quot;-&quot;；或11位长度的手机号码。0104100596</p>
             * 
             * <strong>example:</strong>
             * <p>0104100596</p>
             */
            public Builder calleeNumber(String calleeNumber) {
                this.calleeNumber = calleeNumber;
                return this;
            }

            /**
             * <p>客户响铃时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder calleeRingingTime(String calleeRingingTime) {
                this.calleeRingingTime = calleeRingingTime;
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
             * <p>客户号码归属城市,北京</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder customerCity(String customerCity) {
                this.customerCity = customerCity;
                return this;
            }

            /**
             * <p>客户号码 国内固话或手机，区号 + 7或8位的固话号码，区号与固话号码之间无&quot;-&quot;；或11位长度的手机号码。如 01041005968或18701051984 或虚拟号-分机号场景格式，如 18701051984-7538</p>
             * 
             * <strong>example:</strong>
             * <p>18701051984</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>客户号码归属省份，如 北京</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>话机后话机响铃时间，时间戳，精确到s；无或未转接时可能为 0；如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder detailRingingTime(String detailRingingTime) {
                this.detailRingingTime = detailRingingTime;
                return this;
            }

            /**
             * <p>客户侧真实外显号码，当使用AXB场景进行外呼时，客户侧的真实外显号码为虚拟号</p>
             * 
             * <strong>example:</strong>
             * <p>1775024</p>
             */
            public Builder displayNumber(String displayNumber) {
                this.displayNumber = displayNumber;
                return this;
            }

            /**
             * <p>是否呼叫降级, 0-否, 1-是</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder downGrade(String downGrade) {
                this.downGrade = downGrade;
                return this;
            }

            /**
             * <p>降级次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder downGradeCounts(String downGradeCounts) {
                this.downGradeCounts = downGradeCounts;
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
             * <p>外呼组号：座席所属外呼组编号，如2000</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder gno(String gno) {
                this.gno = gno;
                return this;
            }

            /**
             * <p>通话记录主键标识；</p>
             * 
             * <strong>example:</strong>
             * <p>123546546</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否真人接听：1 - 是、0 - 否、空值</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isRealAnswer(String isRealAnswer) {
                this.isRealAnswer = isRealAnswer;
                return this;
            }

            /**
             * <p>IVR名称，默认自定义</p>
             * 
             * <strong>example:</strong>
             * <p>IvrName</p>
             */
            public Builder ivrName(String ivrName) {
                this.ivrName = ivrName;
                return this;
            }

            /**
             * <p>中继号码</p>
             * 
             * <strong>example:</strong>
             * <p>15322355</p>
             */
            public Builder numberTrunk(String numberTrunk) {
                this.numberTrunk = numberTrunk;
                return this;
            }

            /**
             * <p>队列号，如1000</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            /**
             * <p>真人接听时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1774904471</p>
             */
            public Builder realAnswerTime(String realAnswerTime) {
                this.realAnswerTime = realAnswerTime;
                return this;
            }

            /**
             * <p>通话记录录音数组，json格式</p>
             */
            public Builder recordFile(java.util.List<RecordFile> recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>用户自定义通话标识字段</p>
             * 
             * <strong>example:</strong>
             * <p>543252344</p>
             */
            public Builder requestUniqueId(String requestUniqueId) {
                this.requestUniqueId = requestUniqueId;
                return this;
            }

            /**
             * <p>号码状态识别编码，详见</p>
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
             * <p>电话进入系统时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1774822300</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>外呼结果， 如客户接听</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>外呼结果状态码：40 客户未接听；41 客户接听；42 已呼叫；43 双方接听；详见接口文档请求参数中 status 说明</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>任务文件id</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder taskFileId(String taskFileId) {
                this.taskFileId = taskFileId;
                return this;
            }

            /**
             * <p>任务id</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>任务名称</p>
             * 
             * <strong>example:</strong>
             * <p>name2</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>总通话时长秒数，单位是s</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
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
             * <p>电话唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>uniq_1-162046xxxx.12</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * <p>通话记录自定义字段，json格式</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder userField(java.util.Map<String, ?> userField) {
                this.userField = userField;
                return this;
            }

            /**
             * <p>通话质量百分比，0–100，in/out 方向说话占用百分比</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder vadIn(String vadIn) {
                this.vadIn = vadIn;
                return this;
            }

            /**
             * <p>通话质量百分比，0–100，in/out 方向说话占用百分比</p>
             * 
             * <strong>example:</strong>
             * <p>77</p>
             */
            public Builder vadOut(String vadOut) {
                this.vadOut = vadOut;
                return this;
            }

            /**
             * <p>客户等待时长秒数，单位是s</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder waitDuration(String waitDuration) {
                this.waitDuration = waitDuration;
                return this;
            }

            /**
             * <p>虚拟号</p>
             * 
             * <strong>example:</strong>
             * <p>6677333</p>
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
     * {@link CloudQueryPredictiveCallCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryPredictiveCallCdrResponseBody</p>
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
             * <p>预测式外呼通话记录数组</p>
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
