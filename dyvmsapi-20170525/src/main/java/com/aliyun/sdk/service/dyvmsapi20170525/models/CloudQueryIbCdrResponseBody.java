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
 * {@link CloudQueryIbCdrResponseBody} extends {@link TeaModel}
 *
 * <p>CloudQueryIbCdrResponseBody</p>
 */
public class CloudQueryIbCdrResponseBody extends TeaModel {
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

    private CloudQueryIbCdrResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryIbCdrResponseBody create() {
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

        private Builder(CloudQueryIbCdrResponseBody model) {
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

        public CloudQueryIbCdrResponseBody build() {
            return new CloudQueryIbCdrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudQueryIbCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryIbCdrResponseBody</p>
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
     * {@link CloudQueryIbCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryIbCdrResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CalleeNumber")
        private String calleeNumber;

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

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private String endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Hotline")
        private String hotline;

        @com.aliyun.core.annotation.NameInMap("IvrName")
        private String ivrName;

        @com.aliyun.core.annotation.NameInMap("LeaveQueueCode")
        private Long leaveQueueCode;

        @com.aliyun.core.annotation.NameInMap("NumberTrunk")
        private String numberTrunk;

        @com.aliyun.core.annotation.NameInMap("NumberTrunkAreaCode")
        private String numberTrunkAreaCode;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private java.util.List<RecordFile> recordFile;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private String totalDuration;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("UserField")
        private java.util.Map<String, ?> userField;

        private List(Builder builder) {
            this.agentName = builder.agentName;
            this.answerTime = builder.answerTime;
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.callType = builder.callType;
            this.calleeNumber = builder.calleeNumber;
            this.cno = builder.cno;
            this.customerAreaCode = builder.customerAreaCode;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerProvince = builder.customerProvince;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.hotline = builder.hotline;
            this.ivrName = builder.ivrName;
            this.leaveQueueCode = builder.leaveQueueCode;
            this.numberTrunk = builder.numberTrunk;
            this.numberTrunkAreaCode = builder.numberTrunkAreaCode;
            this.qno = builder.qno;
            this.recordFile = builder.recordFile;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.totalDuration = builder.totalDuration;
            this.uniqueId = builder.uniqueId;
            this.userField = builder.userField;
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
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return calleeNumber
         */
        public String getCalleeNumber() {
            return this.calleeNumber;
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
         * @return hotline
         */
        public String getHotline() {
            return this.hotline;
        }

        /**
         * @return ivrName
         */
        public String getIvrName() {
            return this.ivrName;
        }

        /**
         * @return leaveQueueCode
         */
        public Long getLeaveQueueCode() {
            return this.leaveQueueCode;
        }

        /**
         * @return numberTrunk
         */
        public String getNumberTrunk() {
            return this.numberTrunk;
        }

        /**
         * @return numberTrunkAreaCode
         */
        public String getNumberTrunkAreaCode() {
            return this.numberTrunkAreaCode;
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
        public java.util.List<RecordFile> getRecordFile() {
            return this.recordFile;
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
         * @return totalDuration
         */
        public String getTotalDuration() {
            return this.totalDuration;
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

        public static final class Builder {
            private String agentName; 
            private String answerTime; 
            private String bridgeDuration; 
            private String bridgeTime; 
            private String callType; 
            private String calleeNumber; 
            private String cno; 
            private String customerAreaCode; 
            private String customerCity; 
            private String customerNumber; 
            private String customerProvince; 
            private String endReason; 
            private String endTime; 
            private String hotline; 
            private String ivrName; 
            private Long leaveQueueCode; 
            private String numberTrunk; 
            private String numberTrunkAreaCode; 
            private String qno; 
            private java.util.List<RecordFile> recordFile; 
            private String startTime; 
            private String status; 
            private String statusCode; 
            private String totalDuration; 
            private String uniqueId; 
            private java.util.Map<String, ?> userField; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentName = model.agentName;
                this.answerTime = model.answerTime;
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.callType = model.callType;
                this.calleeNumber = model.calleeNumber;
                this.cno = model.cno;
                this.customerAreaCode = model.customerAreaCode;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerProvince = model.customerProvince;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.hotline = model.hotline;
                this.ivrName = model.ivrName;
                this.leaveQueueCode = model.leaveQueueCode;
                this.numberTrunk = model.numberTrunk;
                this.numberTrunkAreaCode = model.numberTrunkAreaCode;
                this.qno = model.qno;
                this.recordFile = model.recordFile;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.totalDuration = model.totalDuration;
                this.uniqueId = model.uniqueId;
                this.userField = model.userField;
            } 

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
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
             * <p>10</p>
             */
            public Builder bridgeDuration(String bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>座席接听时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder bridgeTime(String bridgeTime) {
                this.bridgeTime = bridgeTime;
                return this;
            }

            /**
             * <p>呼叫类型 呼入</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
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
             * <p>客户号码 国内固话或手机，区号 + 7或8位的固话号码，区号与固话号码之间无&quot;-&quot;；或11位长度的手机号码。如 01041005968或18701051984</p>
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
             * <p>热线号码</p>
             * 
             * <strong>example:</strong>
             * <p>89193631</p>
             */
            public Builder hotline(String hotline) {
                this.hotline = hotline;
                return this;
            }

            /**
             * <p>IVR名称，默认自定义</p>
             * 
             * <strong>example:</strong>
             * <p>ivrname</p>
             */
            public Builder ivrName(String ivrName) {
                this.ivrName = ivrName;
                return this;
            }

            /**
             * <p>离开队列原因 参数说明：-1:该字段没值, 1:呼转座席接听 , 2: 队列中放弃 , 3: 队列中超时溢出 , 4: 队列中无座席溢出</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder leaveQueueCode(Long leaveQueueCode) {
                this.leaveQueueCode = leaveQueueCode;
                return this;
            }

            /**
             * <p>中继号码</p>
             * 
             * <strong>example:</strong>
             * <p>89193631</p>
             */
            public Builder numberTrunk(String numberTrunk) {
                this.numberTrunk = numberTrunk;
                return this;
            }

            /**
             * <p>中继号码区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder numberTrunkAreaCode(String numberTrunkAreaCode) {
                this.numberTrunkAreaCode = numberTrunkAreaCode;
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
             * <p>通话记录录音数组，json格式</p>
             */
            public Builder recordFile(java.util.List<RecordFile> recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>电话进入系统时间，时间戳，精确到s，如1480904471</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>外呼结果， 如人工接听</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>status对应的状态码</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>总通话时长秒数，单位是s</p>
             * 
             * <strong>example:</strong>
             * <p>133</p>
             */
            public Builder totalDuration(String totalDuration) {
                this.totalDuration = totalDuration;
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudQueryIbCdrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryIbCdrResponseBody</p>
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
             * <p>来电通话记录数组</p>
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
