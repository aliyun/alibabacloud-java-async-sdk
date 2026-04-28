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
 * {@link CloudQueryObCdrResponseBody} extends {@link TeaModel}
 *
 * <p>CloudQueryObCdrResponseBody</p>
 */
public class CloudQueryObCdrResponseBody extends TeaModel {
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

    private CloudQueryObCdrResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryObCdrResponseBody create() {
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

        private Builder(CloudQueryObCdrResponseBody model) {
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

        public CloudQueryObCdrResponseBody build() {
            return new CloudQueryObCdrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudQueryObCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryObCdrResponseBody</p>
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
             * <p>record_file_name.</p>
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
     * {@link CloudQueryObCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryObCdrResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentClid")
        private String agentClid;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AgentNumber")
        private String agentNumber;

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

        @com.aliyun.core.annotation.NameInMap("CalleeRingingTime")
        private String calleeRingingTime;

        @com.aliyun.core.annotation.NameInMap("Clid")
        private String clid;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CustomerAreaCode")
        private String customerAreaCode;

        @com.aliyun.core.annotation.NameInMap("CustomerCity")
        private String customerCity;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerProvince")
        private String customerProvince;

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

        @com.aliyun.core.annotation.NameInMap("HangupReason")
        private String hangupReason;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsRealAnswer")
        private String isRealAnswer;

        @com.aliyun.core.annotation.NameInMap("LeftDisplayNumber")
        private String leftDisplayNumber;

        @com.aliyun.core.annotation.NameInMap("MainRingingTime")
        private String mainRingingTime;

        @com.aliyun.core.annotation.NameInMap("RealAnswerTime")
        private String realAnswerTime;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private java.util.List<RecordFile> recordFile;

        @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
        private String requestUniqueId;

        @com.aliyun.core.annotation.NameInMap("RtcTotalDuration")
        private String rtcTotalDuration;

        @com.aliyun.core.annotation.NameInMap("SipCause")
        private String sipCause;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private String totalDuration;

        @com.aliyun.core.annotation.NameInMap("TrunkGroupKey")
        private String trunkGroupKey;

        @com.aliyun.core.annotation.NameInMap("TsiFile")
        private String tsiFile;

        @com.aliyun.core.annotation.NameInMap("TsiFileFormat")
        private String tsiFileFormat;

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
            this.agentClid = builder.agentClid;
            this.agentName = builder.agentName;
            this.agentNumber = builder.agentNumber;
            this.answerTime = builder.answerTime;
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.calleeRingingTime = builder.calleeRingingTime;
            this.clid = builder.clid;
            this.cno = builder.cno;
            this.customerAreaCode = builder.customerAreaCode;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerProvince = builder.customerProvince;
            this.displayNumber = builder.displayNumber;
            this.downGrade = builder.downGrade;
            this.downGradeCounts = builder.downGradeCounts;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.gno = builder.gno;
            this.hangupReason = builder.hangupReason;
            this.id = builder.id;
            this.isRealAnswer = builder.isRealAnswer;
            this.leftDisplayNumber = builder.leftDisplayNumber;
            this.mainRingingTime = builder.mainRingingTime;
            this.realAnswerTime = builder.realAnswerTime;
            this.recordFile = builder.recordFile;
            this.requestUniqueId = builder.requestUniqueId;
            this.rtcTotalDuration = builder.rtcTotalDuration;
            this.sipCause = builder.sipCause;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.statusReason = builder.statusReason;
            this.taskId = builder.taskId;
            this.totalDuration = builder.totalDuration;
            this.trunkGroupKey = builder.trunkGroupKey;
            this.tsiFile = builder.tsiFile;
            this.tsiFileFormat = builder.tsiFileFormat;
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
         * @return agentClid
         */
        public String getAgentClid() {
            return this.agentClid;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return agentNumber
         */
        public String getAgentNumber() {
            return this.agentNumber;
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
         * @return customerProvince
         */
        public String getCustomerProvince() {
            return this.customerProvince;
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
         * @return hangupReason
         */
        public String getHangupReason() {
            return this.hangupReason;
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
         * @return leftDisplayNumber
         */
        public String getLeftDisplayNumber() {
            return this.leftDisplayNumber;
        }

        /**
         * @return mainRingingTime
         */
        public String getMainRingingTime() {
            return this.mainRingingTime;
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
         * @return rtcTotalDuration
         */
        public String getRtcTotalDuration() {
            return this.rtcTotalDuration;
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
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
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
         * @return tsiFileFormat
         */
        public String getTsiFileFormat() {
            return this.tsiFileFormat;
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
            private String agentClid; 
            private String agentName; 
            private String agentNumber; 
            private String answerTime; 
            private String bridgeDuration; 
            private String bridgeTime; 
            private String callId; 
            private String callType; 
            private String calleeRingingTime; 
            private String clid; 
            private String cno; 
            private String customerAreaCode; 
            private String customerCity; 
            private String customerNumber; 
            private String customerProvince; 
            private String displayNumber; 
            private String downGrade; 
            private String downGradeCounts; 
            private String endReason; 
            private String endTime; 
            private String gno; 
            private String hangupReason; 
            private String id; 
            private String isRealAnswer; 
            private String leftDisplayNumber; 
            private String mainRingingTime; 
            private String realAnswerTime; 
            private java.util.List<RecordFile> recordFile; 
            private String requestUniqueId; 
            private String rtcTotalDuration; 
            private String sipCause; 
            private String startTime; 
            private String status; 
            private String statusCode; 
            private String statusReason; 
            private String taskId; 
            private String totalDuration; 
            private String trunkGroupKey; 
            private String tsiFile; 
            private String tsiFileFormat; 
            private String uniqueId; 
            private java.util.Map<String, ?> userField; 
            private String vadIn; 
            private String vadOut; 
            private String waitDuration; 
            private String xNumber; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentClid = model.agentClid;
                this.agentName = model.agentName;
                this.agentNumber = model.agentNumber;
                this.answerTime = model.answerTime;
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.callId = model.callId;
                this.callType = model.callType;
                this.calleeRingingTime = model.calleeRingingTime;
                this.clid = model.clid;
                this.cno = model.cno;
                this.customerAreaCode = model.customerAreaCode;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerProvince = model.customerProvince;
                this.displayNumber = model.displayNumber;
                this.downGrade = model.downGrade;
                this.downGradeCounts = model.downGradeCounts;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.gno = model.gno;
                this.hangupReason = model.hangupReason;
                this.id = model.id;
                this.isRealAnswer = model.isRealAnswer;
                this.leftDisplayNumber = model.leftDisplayNumber;
                this.mainRingingTime = model.mainRingingTime;
                this.realAnswerTime = model.realAnswerTime;
                this.recordFile = model.recordFile;
                this.requestUniqueId = model.requestUniqueId;
                this.rtcTotalDuration = model.rtcTotalDuration;
                this.sipCause = model.sipCause;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.statusReason = model.statusReason;
                this.taskId = model.taskId;
                this.totalDuration = model.totalDuration;
                this.trunkGroupKey = model.trunkGroupKey;
                this.tsiFile = model.tsiFile;
                this.tsiFileFormat = model.tsiFileFormat;
                this.uniqueId = model.uniqueId;
                this.userField = model.userField;
                this.vadIn = model.vadIn;
                this.vadOut = model.vadOut;
                this.waitDuration = model.waitDuration;
                this.xNumber = model.xNumber;
            } 

            /**
             * <p>座席侧外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>02138276106</p>
             */
            public Builder agentClid(String agentClid) {
                this.agentClid = agentClid;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>name3</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>座席电话 区号 +7或8位的固话号码，区号与固话号码之间无&quot;-&quot;；或11位长度的手机号码。0104100596</p>
             * 
             * <strong>example:</strong>
             * <p>0104100596</p>
             */
            public Builder agentNumber(String agentNumber) {
                this.agentNumber = agentNumber;
                return this;
            }

            /**
             * <p>座席接听时间，时间戳，精确到s，如1480904471</p>
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
             * <p>10</p>
             */
            public Builder bridgeDuration(String bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>双方接听时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder bridgeTime(String bridgeTime) {
                this.bridgeTime = bridgeTime;
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
             * <p>呼叫类型：4、预览外呼; 6、主叫外呼</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>客户侧响铃时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder calleeRingingTime(String calleeRingingTime) {
                this.calleeRingingTime = calleeRingingTime;
                return this;
            }

            /**
             * <p>客户侧外显号码，当使用虚拟号进行AXB外呼且开关打开时，实际返回的客户侧外显号码是虚拟号</p>
             * 
             * <strong>example:</strong>
             * <p>41008502</p>
             */
            public Builder clid(String clid) {
                this.clid = clid;
                return this;
            }

            /**
             * <p>座席工号，如2000</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户号码区号</p>
             * 
             * <strong>example:</strong>
             * <p>028</p>
             */
            public Builder customerAreaCode(String customerAreaCode) {
                this.customerAreaCode = customerAreaCode;
                return this;
            }

            /**
             * <p>客户号码归属城市,北京</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder customerCity(String customerCity) {
                this.customerCity = customerCity;
                return this;
            }

            /**
             * <p>客户号码 国内固话或手机，区号 + 7或8位的固话号码，区号与固话号码之间无&quot;-&quot;；或11位长度的手机号码。如 01041005968或18701051984 或虚拟号-分机号场景格式，如 18701051984-7538</p>
             * 
             * <strong>example:</strong>
             * <p>01041005968</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>客户号码归属省份，如 北京</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>座席侧真实外显号码，当使用AXB场景进行外呼时，座席侧真实外显号码为虚拟号</p>
             * 
             * <strong>example:</strong>
             * <p>41008502</p>
             */
            public Builder displayNumber(String displayNumber) {
                this.displayNumber = displayNumber;
                return this;
            }

            /**
             * <p>是否呼叫降级, 0-否, 1-是</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downGrade(String downGrade) {
                this.downGrade = downGrade;
                return this;
            }

            /**
             * <p>降级次数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>1775024875</p>
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
             * HangupReason.
             */
            public Builder hangupReason(String hangupReason) {
                this.hangupReason = hangupReason;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>9075217226</p>
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
             * <p>客户侧真实外显号码，当使用AXB场景进行外呼时，客户侧真实外显号码为虚拟号</p>
             * 
             * <strong>example:</strong>
             * <p>13322225555</p>
             */
            public Builder leftDisplayNumber(String leftDisplayNumber) {
                this.leftDisplayNumber = leftDisplayNumber;
                return this;
            }

            /**
             * <p>分机外呼，话机响铃时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder mainRingingTime(String mainRingingTime) {
                this.mainRingingTime = mainRingingTime;
                return this;
            }

            /**
             * <p>真人接听时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
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
             * <p>请求唯一id</p>
             * 
             * <strong>example:</strong>
             * <p>uniq_1-162046xxxx.12</p>
             */
            public Builder requestUniqueId(String requestUniqueId) {
                this.requestUniqueId = requestUniqueId;
                return this;
            }

            /**
             * <p>RTC总通话时长秒数，单位是s，在呼叫类型为主叫外呼(RTC)时有效，计算规则：endTime-startTime</p>
             * 
             * <strong>example:</strong>
             * <p>133</p>
             */
            public Builder rtcTotalDuration(String rtcTotalDuration) {
                this.rtcTotalDuration = rtcTotalDuration;
                return this;
            }

            /**
             * <p>SIP响应码：200 ~ 699 详见 注：主叫外呼RTC座席侧没有SIP协商的概念，并未发起呼叫，因此该值默认为0</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder sipCause(String sipCause) {
                this.sipCause = sipCause;
                return this;
            }

            /**
             * <p>座席开始外呼时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>外呼结果：30 座席未接听; 31 座席接听,未呼叫客户; 32 座席接听,客户未接听; 33 双方接听; 50 主叫外呼接听; 51 主叫外呼,客户未接听; 52 主叫外呼,双方接听。</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
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
             * <p>通话状态原因（主叫外呼）描述：1 - 企业黑名单; 2 - 风控系统拦截; 20001 - 呼叫限制；20002 - 黑名单或非白名单；20003 - 禁拨时间段； 3 - 无效的外显号码; 4 - 错误的语音导航; 5 - 企业停机; 6 - 无权限外呼; 7 - 超出呼叫次数限制; 8 - 错误号码; 9 - 其他错误；</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>座席自动外呼任务id</p>
             * 
             * <strong>example:</strong>
             * <p>333</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>总通话时长秒数，单位是s</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalDuration(String totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>中继群组代号</p>
             * 
             * <strong>example:</strong>
             * <p>30020</p>
             */
            public Builder trunkGroupKey(String trunkGroupKey) {
                this.trunkGroupKey = trunkGroupKey;
                return this;
            }

            /**
             * <p>彩铃文件名称</p>
             * 
             * <strong>example:</strong>
             * <p>name2</p>
             */
            public Builder tsiFile(String tsiFile) {
                this.tsiFile = tsiFile;
                return this;
            }

            /**
             * <p>彩铃文件类型</p>
             * 
             * <strong>example:</strong>
             * <p>mp3</p>
             */
            public Builder tsiFileFormat(String tsiFileFormat) {
                this.tsiFileFormat = tsiFileFormat;
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
             * <p>通话质量百分比,数据是0-100之间，in方向说话占用的百分比</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder vadIn(String vadIn) {
                this.vadIn = vadIn;
                return this;
            }

            /**
             * <p>通话质量百分比,数据是0-100之间，out方向说话占用的百分比</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder vadOut(String vadOut) {
                this.vadOut = vadOut;
                return this;
            }

            /**
             * <p>客户等待时长秒数，单位是s</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder waitDuration(String waitDuration) {
                this.waitDuration = waitDuration;
                return this;
            }

            /**
             * <p>虚拟号码</p>
             * 
             * <strong>example:</strong>
             * <p>13322444</p>
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
     * {@link CloudQueryObCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryObCdrResponseBody</p>
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
             * <p>座席外呼通话记录数组</p>
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
