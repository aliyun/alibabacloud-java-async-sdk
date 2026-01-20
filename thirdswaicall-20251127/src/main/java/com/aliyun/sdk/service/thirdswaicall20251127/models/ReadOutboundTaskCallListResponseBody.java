// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.thirdswaicall20251127.models;

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
 * {@link ReadOutboundTaskCallListResponseBody} extends {@link TeaModel}
 *
 * <p>ReadOutboundTaskCallListResponseBody</p>
 */
public class ReadOutboundTaskCallListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ReadOutboundTaskCallListResponseBody(Builder builder) {
        this.code = builder.code;
        this.current = builder.current;
        this.message = builder.message;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
        this.total = builder.total;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadOutboundTaskCallListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Integer current; 
        private String message; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Integer size; 
        private Boolean success; 
        private String timestamp; 
        private Long total; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ReadOutboundTaskCallListResponseBody model) {
            this.code = model.code;
            this.current = model.current;
            this.message = model.message;
            this.records = model.records;
            this.requestId = model.requestId;
            this.size = model.size;
            this.success = model.success;
            this.timestamp = model.timestamp;
            this.total = model.total;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.current = current;
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
         * Records.
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ReadOutboundTaskCallListResponseBody build() {
            return new ReadOutboundTaskCallListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadOutboundTaskCallListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadOutboundTaskCallListResponseBody</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Integer beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private DialogueList(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.role = builder.role;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Integer getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Integer beginTime; 
            private Integer endTime; 
            private String role; 
            private String text; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
                this.role = model.role;
                this.text = model.text;
            } 

            /**
             * BeginTime.
             */
            public Builder beginTime(Integer beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadOutboundTaskCallListResponseBody} extends {@link TeaModel}
     *
     * <p>ReadOutboundTaskCallListResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallEndTime")
        private String callEndTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallStartTime")
        private String callStartTime;

        @com.aliyun.core.annotation.NameInMap("CallSummary")
        private String callSummary;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("CustomerName")
        private String customerName;

        @com.aliyun.core.annotation.NameInMap("CustomerPhone")
        private String customerPhone;

        @com.aliyun.core.annotation.NameInMap("DialogueList")
        private java.util.List<DialogueList> dialogueList;

        @com.aliyun.core.annotation.NameInMap("DisplayStatus")
        private String displayStatus;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("DurationText")
        private String durationText;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LabelTags")
        private java.util.List<String> labelTags;

        @com.aliyun.core.annotation.NameInMap("RecordDetailReady")
        private Boolean recordDetailReady;

        @com.aliyun.core.annotation.NameInMap("RecordUrl")
        private String recordUrl;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TtsVoiceCode")
        private String ttsVoiceCode;

        @com.aliyun.core.annotation.NameInMap("TtsVoiceDesc")
        private String ttsVoiceDesc;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Records(Builder builder) {
            this.callEndTime = builder.callEndTime;
            this.callId = builder.callId;
            this.callStartTime = builder.callStartTime;
            this.callSummary = builder.callSummary;
            this.channel = builder.channel;
            this.customerName = builder.customerName;
            this.customerPhone = builder.customerPhone;
            this.dialogueList = builder.dialogueList;
            this.displayStatus = builder.displayStatus;
            this.duration = builder.duration;
            this.durationText = builder.durationText;
            this.extInfo = builder.extInfo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.labelTags = builder.labelTags;
            this.recordDetailReady = builder.recordDetailReady;
            this.recordUrl = builder.recordUrl;
            this.retryCount = builder.retryCount;
            this.sceneId = builder.sceneId;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.tenantId = builder.tenantId;
            this.ttsVoiceCode = builder.ttsVoiceCode;
            this.ttsVoiceDesc = builder.ttsVoiceDesc;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return callEndTime
         */
        public String getCallEndTime() {
            return this.callEndTime;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callStartTime
         */
        public String getCallStartTime() {
            return this.callStartTime;
        }

        /**
         * @return callSummary
         */
        public String getCallSummary() {
            return this.callSummary;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return customerName
         */
        public String getCustomerName() {
            return this.customerName;
        }

        /**
         * @return customerPhone
         */
        public String getCustomerPhone() {
            return this.customerPhone;
        }

        /**
         * @return dialogueList
         */
        public java.util.List<DialogueList> getDialogueList() {
            return this.dialogueList;
        }

        /**
         * @return displayStatus
         */
        public String getDisplayStatus() {
            return this.displayStatus;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return durationText
         */
        public String getDurationText() {
            return this.durationText;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return labelTags
         */
        public java.util.List<String> getLabelTags() {
            return this.labelTags;
        }

        /**
         * @return recordDetailReady
         */
        public Boolean getRecordDetailReady() {
            return this.recordDetailReady;
        }

        /**
         * @return recordUrl
         */
        public String getRecordUrl() {
            return this.recordUrl;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return ttsVoiceCode
         */
        public String getTtsVoiceCode() {
            return this.ttsVoiceCode;
        }

        /**
         * @return ttsVoiceDesc
         */
        public String getTtsVoiceDesc() {
            return this.ttsVoiceDesc;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String callEndTime; 
            private String callId; 
            private String callStartTime; 
            private String callSummary; 
            private String channel; 
            private String customerName; 
            private String customerPhone; 
            private java.util.List<DialogueList> dialogueList; 
            private String displayStatus; 
            private Long duration; 
            private String durationText; 
            private String extInfo; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String instanceId; 
            private java.util.List<String> labelTags; 
            private Boolean recordDetailReady; 
            private String recordUrl; 
            private Integer retryCount; 
            private String sceneId; 
            private String status; 
            private String taskId; 
            private String tenantId; 
            private String ttsVoiceCode; 
            private String ttsVoiceDesc; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.callEndTime = model.callEndTime;
                this.callId = model.callId;
                this.callStartTime = model.callStartTime;
                this.callSummary = model.callSummary;
                this.channel = model.channel;
                this.customerName = model.customerName;
                this.customerPhone = model.customerPhone;
                this.dialogueList = model.dialogueList;
                this.displayStatus = model.displayStatus;
                this.duration = model.duration;
                this.durationText = model.durationText;
                this.extInfo = model.extInfo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.labelTags = model.labelTags;
                this.recordDetailReady = model.recordDetailReady;
                this.recordUrl = model.recordUrl;
                this.retryCount = model.retryCount;
                this.sceneId = model.sceneId;
                this.status = model.status;
                this.taskId = model.taskId;
                this.tenantId = model.tenantId;
                this.ttsVoiceCode = model.ttsVoiceCode;
                this.ttsVoiceDesc = model.ttsVoiceDesc;
                this.userId = model.userId;
            } 

            /**
             * CallEndTime.
             */
            public Builder callEndTime(String callEndTime) {
                this.callEndTime = callEndTime;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * CallStartTime.
             */
            public Builder callStartTime(String callStartTime) {
                this.callStartTime = callStartTime;
                return this;
            }

            /**
             * CallSummary.
             */
            public Builder callSummary(String callSummary) {
                this.callSummary = callSummary;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * CustomerName.
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
                return this;
            }

            /**
             * CustomerPhone.
             */
            public Builder customerPhone(String customerPhone) {
                this.customerPhone = customerPhone;
                return this;
            }

            /**
             * DialogueList.
             */
            public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            /**
             * DisplayStatus.
             */
            public Builder displayStatus(String displayStatus) {
                this.displayStatus = displayStatus;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * DurationText.
             */
            public Builder durationText(String durationText) {
                this.durationText = durationText;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LabelTags.
             */
            public Builder labelTags(java.util.List<String> labelTags) {
                this.labelTags = labelTags;
                return this;
            }

            /**
             * RecordDetailReady.
             */
            public Builder recordDetailReady(Boolean recordDetailReady) {
                this.recordDetailReady = recordDetailReady;
                return this;
            }

            /**
             * RecordUrl.
             */
            public Builder recordUrl(String recordUrl) {
                this.recordUrl = recordUrl;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TtsVoiceCode.
             */
            public Builder ttsVoiceCode(String ttsVoiceCode) {
                this.ttsVoiceCode = ttsVoiceCode;
                return this;
            }

            /**
             * TtsVoiceDesc.
             */
            public Builder ttsVoiceDesc(String ttsVoiceDesc) {
                this.ttsVoiceDesc = ttsVoiceDesc;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
