// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link TaskCallListResponseBody} extends {@link TeaModel}
 *
 * <p>TaskCallListResponseBody</p>
 */
public class TaskCallListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private TaskCallListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskCallListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private String success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(TaskCallListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public TaskCallListResponseBody build() {
            return new TaskCallListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TaskCallListResponseBody} extends {@link TeaModel}
     *
     * <p>TaskCallListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddWx")
        private Long addWx;

        @com.aliyun.core.annotation.NameInMap("AddWxStatus")
        private String addWxStatus;

        @com.aliyun.core.annotation.NameInMap("AgentExtension")
        private String agentExtension;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentSpeakingDuration")
        private Long agentSpeakingDuration;

        @com.aliyun.core.annotation.NameInMap("AgentSpeakingTime")
        private String agentSpeakingTime;

        @com.aliyun.core.annotation.NameInMap("AgentTag")
        private String agentTag;

        @com.aliyun.core.annotation.NameInMap("AnswerRecall")
        private Long answerRecall;

        @com.aliyun.core.annotation.NameInMap("AnswerTime")
        private String answerTime;

        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("CallBeginTime")
        private String callBeginTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallTimes")
        private String callTimes;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Long callType;

        @com.aliyun.core.annotation.NameInMap("ChatRecord")
        private String chatRecord;

        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("HangupTime")
        private String hangupTime;

        @com.aliyun.core.annotation.NameInMap("HangupType")
        private Long hangupType;

        @com.aliyun.core.annotation.NameInMap("ImportTime")
        private String importTime;

        @com.aliyun.core.annotation.NameInMap("IndividualTag")
        private String individualTag;

        @com.aliyun.core.annotation.NameInMap("IntentDescription")
        private String intentDescription;

        @com.aliyun.core.annotation.NameInMap("IntentTag")
        private String intentTag;

        @com.aliyun.core.annotation.NameInMap("InterceptReason")
        private String interceptReason;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private String keywords;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberMD5")
        private String numberMD5;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RingTime")
        private Long ringTime;

        @com.aliyun.core.annotation.NameInMap("Sms")
        private String sms;

        @com.aliyun.core.annotation.NameInMap("SpeakingDuration")
        private Long speakingDuration;

        @com.aliyun.core.annotation.NameInMap("SpeakingTime")
        private String speakingTime;

        @com.aliyun.core.annotation.NameInMap("SpeakingTurns")
        private String speakingTurns;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Long statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TransferStatus")
        private String transferStatus;

        @com.aliyun.core.annotation.NameInMap("TransferStatusCode")
        private Long transferStatusCode;

        private List(Builder builder) {
            this.addWx = builder.addWx;
            this.addWxStatus = builder.addWxStatus;
            this.agentExtension = builder.agentExtension;
            this.agentId = builder.agentId;
            this.agentSpeakingDuration = builder.agentSpeakingDuration;
            this.agentSpeakingTime = builder.agentSpeakingTime;
            this.agentTag = builder.agentTag;
            this.answerRecall = builder.answerRecall;
            this.answerTime = builder.answerTime;
            this.batchId = builder.batchId;
            this.callBeginTime = builder.callBeginTime;
            this.callId = builder.callId;
            this.callTimes = builder.callTimes;
            this.callType = builder.callType;
            this.chatRecord = builder.chatRecord;
            this.gateway = builder.gateway;
            this.hangupTime = builder.hangupTime;
            this.hangupType = builder.hangupType;
            this.importTime = builder.importTime;
            this.individualTag = builder.individualTag;
            this.intentDescription = builder.intentDescription;
            this.intentTag = builder.intentTag;
            this.interceptReason = builder.interceptReason;
            this.keywords = builder.keywords;
            this.number = builder.number;
            this.numberMD5 = builder.numberMD5;
            this.properties = builder.properties;
            this.remark = builder.remark;
            this.ringTime = builder.ringTime;
            this.sms = builder.sms;
            this.speakingDuration = builder.speakingDuration;
            this.speakingTime = builder.speakingTime;
            this.speakingTurns = builder.speakingTurns;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.statusDescription = builder.statusDescription;
            this.tag = builder.tag;
            this.taskId = builder.taskId;
            this.templateId = builder.templateId;
            this.transferStatus = builder.transferStatus;
            this.transferStatusCode = builder.transferStatusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return addWx
         */
        public Long getAddWx() {
            return this.addWx;
        }

        /**
         * @return addWxStatus
         */
        public String getAddWxStatus() {
            return this.addWxStatus;
        }

        /**
         * @return agentExtension
         */
        public String getAgentExtension() {
            return this.agentExtension;
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentSpeakingDuration
         */
        public Long getAgentSpeakingDuration() {
            return this.agentSpeakingDuration;
        }

        /**
         * @return agentSpeakingTime
         */
        public String getAgentSpeakingTime() {
            return this.agentSpeakingTime;
        }

        /**
         * @return agentTag
         */
        public String getAgentTag() {
            return this.agentTag;
        }

        /**
         * @return answerRecall
         */
        public Long getAnswerRecall() {
            return this.answerRecall;
        }

        /**
         * @return answerTime
         */
        public String getAnswerTime() {
            return this.answerTime;
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return callBeginTime
         */
        public String getCallBeginTime() {
            return this.callBeginTime;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callTimes
         */
        public String getCallTimes() {
            return this.callTimes;
        }

        /**
         * @return callType
         */
        public Long getCallType() {
            return this.callType;
        }

        /**
         * @return chatRecord
         */
        public String getChatRecord() {
            return this.chatRecord;
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return hangupTime
         */
        public String getHangupTime() {
            return this.hangupTime;
        }

        /**
         * @return hangupType
         */
        public Long getHangupType() {
            return this.hangupType;
        }

        /**
         * @return importTime
         */
        public String getImportTime() {
            return this.importTime;
        }

        /**
         * @return individualTag
         */
        public String getIndividualTag() {
            return this.individualTag;
        }

        /**
         * @return intentDescription
         */
        public String getIntentDescription() {
            return this.intentDescription;
        }

        /**
         * @return intentTag
         */
        public String getIntentTag() {
            return this.intentTag;
        }

        /**
         * @return interceptReason
         */
        public String getInterceptReason() {
            return this.interceptReason;
        }

        /**
         * @return keywords
         */
        public String getKeywords() {
            return this.keywords;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return numberMD5
         */
        public String getNumberMD5() {
            return this.numberMD5;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ringTime
         */
        public Long getRingTime() {
            return this.ringTime;
        }

        /**
         * @return sms
         */
        public String getSms() {
            return this.sms;
        }

        /**
         * @return speakingDuration
         */
        public Long getSpeakingDuration() {
            return this.speakingDuration;
        }

        /**
         * @return speakingTime
         */
        public String getSpeakingTime() {
            return this.speakingTime;
        }

        /**
         * @return speakingTurns
         */
        public String getSpeakingTurns() {
            return this.speakingTurns;
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
        public Long getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return transferStatus
         */
        public String getTransferStatus() {
            return this.transferStatus;
        }

        /**
         * @return transferStatusCode
         */
        public Long getTransferStatusCode() {
            return this.transferStatusCode;
        }

        public static final class Builder {
            private Long addWx; 
            private String addWxStatus; 
            private String agentExtension; 
            private Long agentId; 
            private Long agentSpeakingDuration; 
            private String agentSpeakingTime; 
            private String agentTag; 
            private Long answerRecall; 
            private String answerTime; 
            private String batchId; 
            private String callBeginTime; 
            private String callId; 
            private String callTimes; 
            private Long callType; 
            private String chatRecord; 
            private String gateway; 
            private String hangupTime; 
            private Long hangupType; 
            private String importTime; 
            private String individualTag; 
            private String intentDescription; 
            private String intentTag; 
            private String interceptReason; 
            private String keywords; 
            private String number; 
            private String numberMD5; 
            private String properties; 
            private String remark; 
            private Long ringTime; 
            private String sms; 
            private Long speakingDuration; 
            private String speakingTime; 
            private String speakingTurns; 
            private String status; 
            private Long statusCode; 
            private String statusDescription; 
            private String tag; 
            private Long taskId; 
            private Long templateId; 
            private String transferStatus; 
            private Long transferStatusCode; 

            private Builder() {
            } 

            private Builder(List model) {
                this.addWx = model.addWx;
                this.addWxStatus = model.addWxStatus;
                this.agentExtension = model.agentExtension;
                this.agentId = model.agentId;
                this.agentSpeakingDuration = model.agentSpeakingDuration;
                this.agentSpeakingTime = model.agentSpeakingTime;
                this.agentTag = model.agentTag;
                this.answerRecall = model.answerRecall;
                this.answerTime = model.answerTime;
                this.batchId = model.batchId;
                this.callBeginTime = model.callBeginTime;
                this.callId = model.callId;
                this.callTimes = model.callTimes;
                this.callType = model.callType;
                this.chatRecord = model.chatRecord;
                this.gateway = model.gateway;
                this.hangupTime = model.hangupTime;
                this.hangupType = model.hangupType;
                this.importTime = model.importTime;
                this.individualTag = model.individualTag;
                this.intentDescription = model.intentDescription;
                this.intentTag = model.intentTag;
                this.interceptReason = model.interceptReason;
                this.keywords = model.keywords;
                this.number = model.number;
                this.numberMD5 = model.numberMD5;
                this.properties = model.properties;
                this.remark = model.remark;
                this.ringTime = model.ringTime;
                this.sms = model.sms;
                this.speakingDuration = model.speakingDuration;
                this.speakingTime = model.speakingTime;
                this.speakingTurns = model.speakingTurns;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.statusDescription = model.statusDescription;
                this.tag = model.tag;
                this.taskId = model.taskId;
                this.templateId = model.templateId;
                this.transferStatus = model.transferStatus;
                this.transferStatusCode = model.transferStatusCode;
            } 

            /**
             * <p>加微</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder addWx(Long addWx) {
                this.addWx = addWx;
                return this;
            }

            /**
             * <p>加微进度</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder addWxStatus(String addWxStatus) {
                this.addWxStatus = addWxStatus;
                return this;
            }

            /**
             * <p>坐席分机</p>
             * 
             * <strong>example:</strong>
             * <p>112</p>
             */
            public Builder agentExtension(String agentExtension) {
                this.agentExtension = agentExtension;
                return this;
            }

            /**
             * <p>坐席ID</p>
             * 
             * <strong>example:</strong>
             * <p>87</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>人工通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder agentSpeakingDuration(Long agentSpeakingDuration) {
                this.agentSpeakingDuration = agentSpeakingDuration;
                return this;
            }

            /**
             * <p>人工通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder agentSpeakingTime(String agentSpeakingTime) {
                this.agentSpeakingTime = agentSpeakingTime;
                return this;
            }

            /**
             * <p>坐席标签</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder agentTag(String agentTag) {
                this.agentTag = agentTag;
                return this;
            }

            /**
             * <p>是否接通重呼</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder answerRecall(Long answerRecall) {
                this.answerRecall = answerRecall;
                return this;
            }

            /**
             * <p>接通时间</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-26 18:58:25</p>
             */
            public Builder answerTime(String answerTime) {
                this.answerTime = answerTime;
                return this;
            }

            /**
             * <p>批次ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>开始通话时间</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-26 18:58:25</p>
             */
            public Builder callBeginTime(String callBeginTime) {
                this.callBeginTime = callBeginTime;
                return this;
            }

            /**
             * <p>外呼ID</p>
             * 
             * <strong>example:</strong>
             * <p>9197ed9e-ceda-42a5-b683-823b23ef208e</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>呼叫次数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callTimes(String callTimes) {
                this.callTimes = callTimes;
                return this;
            }

            /**
             * <p>外呼类型</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder callType(Long callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>对话录音</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder chatRecord(String chatRecord) {
                this.chatRecord = chatRecord;
                return this;
            }

            /**
             * <p>外呼网关</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>挂断时间</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-26 18:58:25</p>
             */
            public Builder hangupTime(String hangupTime) {
                this.hangupTime = hangupTime;
                return this;
            }

            /**
             * <p>挂机方式</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hangupType(Long hangupType) {
                this.hangupType = hangupType;
                return this;
            }

            /**
             * <p>导入时间</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-26 18:58:25</p>
             */
            public Builder importTime(String importTime) {
                this.importTime = importTime;
                return this;
            }

            /**
             * <p>个性标签</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder individualTag(String individualTag) {
                this.individualTag = individualTag;
                return this;
            }

            /**
             * <p>意向说明</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder intentDescription(String intentDescription) {
                this.intentDescription = intentDescription;
                return this;
            }

            /**
             * <p>意向标签</p>
             * 
             * <strong>example:</strong>
             * <p>“C”</p>
             */
            public Builder intentTag(String intentTag) {
                this.intentTag = intentTag;
                return this;
            }

            /**
             * <p>拦截原因</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder interceptReason(String interceptReason) {
                this.interceptReason = interceptReason;
                return this;
            }

            /**
             * <p>回复关键词</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * <p>外呼号码</p>
             * 
             * <strong>example:</strong>
             * <p>138*****123</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>外呼号码MD5</p>
             * 
             * <strong>example:</strong>
             * <p>75916b635568954583783d</p>
             */
            public Builder numberMD5(String numberMD5) {
                this.numberMD5 = numberMD5;
                return this;
            }

            /**
             * <p>参数</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>振铃时长</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder ringTime(Long ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * <p>挂机短信</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder sms(String sms) {
                this.sms = sms;
                return this;
            }

            /**
             * <p>AI通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder speakingDuration(Long speakingDuration) {
                this.speakingDuration = speakingDuration;
                return this;
            }

            /**
             * <p>AI通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder speakingTime(String speakingTime) {
                this.speakingTime = speakingTime;
                return this;
            }

            /**
             * <p>对话轮次</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder speakingTurns(String speakingTurns) {
                this.speakingTurns = speakingTurns;
                return this;
            }

            /**
             * <p>外呼状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>外呼状态编码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder statusCode(Long statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>外呼状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * <p>用户自定义标签</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>外呼任务ID</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>AI话术ID</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>转人工状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder transferStatus(String transferStatus) {
                this.transferStatus = transferStatus;
                return this;
            }

            /**
             * <p>转人工状态编码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder transferStatusCode(Long transferStatusCode) {
                this.transferStatusCode = transferStatusCode;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link TaskCallListResponseBody} extends {@link TeaModel}
     *
     * <p>TaskCallListResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        private Model(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
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

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long totalCount; 
            private Long totalPage; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalPage = model.totalPage;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
