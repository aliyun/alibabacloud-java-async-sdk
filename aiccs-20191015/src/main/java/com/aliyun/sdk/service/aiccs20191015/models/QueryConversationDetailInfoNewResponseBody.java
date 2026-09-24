// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryConversationDetailInfoNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConversationDetailInfoNewResponseBody</p>
 */
public class QueryConversationDetailInfoNewResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryConversationDetailInfoNewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConversationDetailInfoNewResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryConversationDetailInfoNewResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed reason why access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryConversationDetailInfoNewResponseBody build() {
            return new QueryConversationDetailInfoNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConversationDetailInfoNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConversationDetailInfoNewResponseBody</p>
     */
    public static class OutputTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OutputTagDescription")
        private String outputTagDescription;

        @com.aliyun.core.annotation.NameInMap("OutputTagName")
        private String outputTagName;

        @com.aliyun.core.annotation.NameInMap("OutputTagValue")
        private String outputTagValue;

        private OutputTags(Builder builder) {
            this.id = builder.id;
            this.outputTagDescription = builder.outputTagDescription;
            this.outputTagName = builder.outputTagName;
            this.outputTagValue = builder.outputTagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputTags create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return outputTagDescription
         */
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        /**
         * @return outputTagName
         */
        public String getOutputTagName() {
            return this.outputTagName;
        }

        /**
         * @return outputTagValue
         */
        public String getOutputTagValue() {
            return this.outputTagValue;
        }

        public static final class Builder {
            private String id; 
            private String outputTagDescription; 
            private String outputTagName; 
            private String outputTagValue; 

            private Builder() {
            } 

            private Builder(OutputTags model) {
                this.id = model.id;
                this.outputTagDescription = model.outputTagDescription;
                this.outputTagName = model.outputTagName;
                this.outputTagValue = model.outputTagValue;
            } 

            /**
             * <p>The tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The tag description.</p>
             * 
             * <strong>example:</strong>
             * <p>Evaluate the customer\&quot;s interest in the vehicle model and purchase likelihood</p>
             */
            public Builder outputTagDescription(String outputTagDescription) {
                this.outputTagDescription = outputTagDescription;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer intent level</p>
             */
            public Builder outputTagName(String outputTagName) {
                this.outputTagName = outputTagName;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;High (very positive, high conversion probability)&quot;]</p>
             */
            public Builder outputTagValue(String outputTagValue) {
                this.outputTagValue = outputTagValue;
                return this;
            }

            public OutputTags build() {
                return new OutputTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryConversationDetailInfoNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConversationDetailInfoNewResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.id = builder.id;
            this.key = builder.key;
            this.name = builder.name;
            this.required = builder.required;
            this.source = builder.source;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String id; 
            private String key; 
            private String name; 
            private Boolean required; 
            private String source; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.id = model.id;
                this.key = model.key;
                this.name = model.name;
                this.required = model.required;
                this.source = model.source;
                this.value = model.value;
            } 

            /**
             * <p>The variable ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The variable key.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The variable name.</p>
             * 
             * <strong>example:</strong>
             * <p>user name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the variable is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The variable value.</p>
             * 
             * <strong>example:</strong>
             * <p>mike</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryConversationDetailInfoNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConversationDetailInfoNewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("BranchId")
        private Long branchId;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallResult")
        private String callResult;

        @com.aliyun.core.annotation.NameInMap("CalledPhone")
        private String calledPhone;

        @com.aliyun.core.annotation.NameInMap("CallerPhone")
        private String callerPhone;

        @com.aliyun.core.annotation.NameInMap("ConversationRecord")
        private String conversationRecord;

        @com.aliyun.core.annotation.NameInMap("ConversationTurnCount")
        private Long conversationTurnCount;

        @com.aliyun.core.annotation.NameInMap("DetailId")
        private String detailId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private Long encryptionType;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("HangupDirection")
        private String hangupDirection;

        @com.aliyun.core.annotation.NameInMap("ImportedTime")
        private Long importedTime;

        @com.aliyun.core.annotation.NameInMap("MajorIntent")
        private String majorIntent;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("OutputTags")
        private java.util.List<OutputTags> outputTags;

        @com.aliyun.core.annotation.NameInMap("PickUpTime")
        private Long pickUpTime;

        @com.aliyun.core.annotation.NameInMap("RecordingFileDownloadUrl")
        private String recordingFileDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("StartCallTime")
        private Long startCallTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusMsg")
        private String statusMsg;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
            this.branchId = builder.branchId;
            this.callId = builder.callId;
            this.callResult = builder.callResult;
            this.calledPhone = builder.calledPhone;
            this.callerPhone = builder.callerPhone;
            this.conversationRecord = builder.conversationRecord;
            this.conversationTurnCount = builder.conversationTurnCount;
            this.detailId = builder.detailId;
            this.duration = builder.duration;
            this.encryptionType = builder.encryptionType;
            this.failedReason = builder.failedReason;
            this.hangupDirection = builder.hangupDirection;
            this.importedTime = builder.importedTime;
            this.majorIntent = builder.majorIntent;
            this.options = builder.options;
            this.outId = builder.outId;
            this.outputTags = builder.outputTags;
            this.pickUpTime = builder.pickUpTime;
            this.recordingFileDownloadUrl = builder.recordingFileDownloadUrl;
            this.releaseTime = builder.releaseTime;
            this.startCallTime = builder.startCallTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.statusMsg = builder.statusMsg;
            this.taskId = builder.taskId;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return branchId
         */
        public Long getBranchId() {
            return this.branchId;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callResult
         */
        public String getCallResult() {
            return this.callResult;
        }

        /**
         * @return calledPhone
         */
        public String getCalledPhone() {
            return this.calledPhone;
        }

        /**
         * @return callerPhone
         */
        public String getCallerPhone() {
            return this.callerPhone;
        }

        /**
         * @return conversationRecord
         */
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        /**
         * @return conversationTurnCount
         */
        public Long getConversationTurnCount() {
            return this.conversationTurnCount;
        }

        /**
         * @return detailId
         */
        public String getDetailId() {
            return this.detailId;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return encryptionType
         */
        public Long getEncryptionType() {
            return this.encryptionType;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return hangupDirection
         */
        public String getHangupDirection() {
            return this.hangupDirection;
        }

        /**
         * @return importedTime
         */
        public Long getImportedTime() {
            return this.importedTime;
        }

        /**
         * @return majorIntent
         */
        public String getMajorIntent() {
            return this.majorIntent;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return outputTags
         */
        public java.util.List<OutputTags> getOutputTags() {
            return this.outputTags;
        }

        /**
         * @return pickUpTime
         */
        public Long getPickUpTime() {
            return this.pickUpTime;
        }

        /**
         * @return recordingFileDownloadUrl
         */
        public String getRecordingFileDownloadUrl() {
            return this.recordingFileDownloadUrl;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return startCallTime
         */
        public Long getStartCallTime() {
            return this.startCallTime;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusMsg
         */
        public String getStatusMsg() {
            return this.statusMsg;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String batchId; 
            private Long branchId; 
            private String callId; 
            private String callResult; 
            private String calledPhone; 
            private String callerPhone; 
            private String conversationRecord; 
            private Long conversationTurnCount; 
            private String detailId; 
            private Long duration; 
            private Long encryptionType; 
            private String failedReason; 
            private String hangupDirection; 
            private Long importedTime; 
            private String majorIntent; 
            private String options; 
            private String outId; 
            private java.util.List<OutputTags> outputTags; 
            private Long pickUpTime; 
            private String recordingFileDownloadUrl; 
            private Long releaseTime; 
            private Long startCallTime; 
            private Long status; 
            private String statusCode; 
            private String statusMsg; 
            private String taskId; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.batchId = model.batchId;
                this.branchId = model.branchId;
                this.callId = model.callId;
                this.callResult = model.callResult;
                this.calledPhone = model.calledPhone;
                this.callerPhone = model.callerPhone;
                this.conversationRecord = model.conversationRecord;
                this.conversationTurnCount = model.conversationTurnCount;
                this.detailId = model.detailId;
                this.duration = model.duration;
                this.encryptionType = model.encryptionType;
                this.failedReason = model.failedReason;
                this.hangupDirection = model.hangupDirection;
                this.importedTime = model.importedTime;
                this.majorIntent = model.majorIntent;
                this.options = model.options;
                this.outId = model.outId;
                this.outputTags = model.outputTags;
                this.pickUpTime = model.pickUpTime;
                this.recordingFileDownloadUrl = model.recordingFileDownloadUrl;
                this.releaseTime = model.releaseTime;
                this.startCallTime = model.startCallTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.statusMsg = model.statusMsg;
                this.taskId = model.taskId;
                this.variables = model.variables;
            } 

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234******</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The branch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder branchId(Long branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * <p>The unique ID of the call.</p>
             * 
             * <strong>example:</strong>
             * <p>123*<strong><strong><strong>^213</strong></strong></strong></p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The call result. Valid values:</p>
             * <ul>
             * <li>CALL_FORWARDING: Call forwarding.</li>
             * <li>INCOMING_CALL_BARRED: Incoming call barred.</li>
             * <li>CALL_REJECTED: Call rejected.</li>
             * <li>ANSWERED: Answered by the user.</li>
             * <li>USER_BUSY: Callee busy.</li>
             * <li>POWERED_OFF: Powered off.</li>
             * <li>NO_USER_RESPONSE: Out of service area.</li>
             * <li>OPERATOR_BLOCK: Blocked by the carrier.</li>
             * <li>OTHERS: Other status.</li>
             * <li>SUSPEND: Service suspended.</li>
             * <li>CANCEL: Canceled by the caller.</li>
             * <li>INVALID_NUMBER: Invalid number.</li>
             * <li>UNAVAILABLE: Temporarily unavailable.</li>
             * <li>NETWORK_BUSY: Network busy.</li>
             * <li>NO_ANSWER: No answer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ANSWERED</p>
             */
            public Builder callResult(String callResult) {
                this.callResult = callResult;
                return this;
            }

            /**
             * <p>The callee number.</p>
             * 
             * <strong>example:</strong>
             * <p>130********</p>
             */
            public Builder calledPhone(String calledPhone) {
                this.calledPhone = calledPhone;
                return this;
            }

            /**
             * <p>The caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571*******</p>
             */
            public Builder callerPhone(String callerPhone) {
                this.callerPhone = callerPhone;
                return this;
            }

            /**
             * <p>The chat record information. The structure is a JSON array, and the chat records are sorted in chronological order. The format is as follows:</p>
             * <pre><code class="language-json">[
             *     {
             *         &quot;content&quot;:&quot;Chat content&quot;,
             *         &quot;role&quot;:&quot;Role&quot;,//Valid values: user, assistant (robot)
             *     }
             * ]
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>[
             *   {
             *     &quot;content&quot;: &quot;111Hello, age 222, gender male, I am the official consultant of ** Auto. We have a new model called **; ** is now available, starting at ** RMB. It sold * units in ** minutes. Would you like to learn more?&quot;,
             *     &quot;role&quot;: &quot;assistant&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;<Customer interruption> Hey, who are you?&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;<Customer interruption> Say that again.&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   }]</p>
             */
            public Builder conversationRecord(String conversationRecord) {
                this.conversationRecord = conversationRecord;
                return this;
            }

            /**
             * <p>The number of conversation turns.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder conversationTurnCount(Long conversationTurnCount) {
                this.conversationTurnCount = conversationTurnCount;
                return this;
            }

            /**
             * <p>The task detail ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234*******</p>
             */
            public Builder detailId(String detailId) {
                this.detailId = detailId;
                return this;
            }

            /**
             * <p>The call duration. The value is 0 if the call is not connected. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EncryptionType.
             */
            public Builder encryptionType(Long encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * <p>The failure reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Actively canceled</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The hangup direction. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: User.</li>
             * <li><strong>1</strong>: Robot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hangupDirection(String hangupDirection) {
                this.hangupDirection = hangupDirection;
                return this;
            }

            /**
             * <p>The import time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder importedTime(Long importedTime) {
                this.importedTime = importedTime;
                return this;
            }

            /**
             * <p>The major intent.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder majorIntent(String majorIntent) {
                this.majorIntent = majorIntent;
                return this;
            }

            /**
             * <p>The variable information used at runtime, stored in key-value format in this field.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;date&quot;: &quot;666&quot;,
             *   &quot;phoneNumber&quot;: &quot;777&quot;,
             *   &quot;distance&quot;: &quot;555&quot;,
             *   &quot;mendian&quot;: &quot;444&quot;,
             *   &quot;sex&quot;: &quot;Male&quot;,
             *   &quot;name&quot;: &quot;111&quot;,
             *   &quot;age&quot;: &quot;222&quot;
             * }</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The external business serial number. You can use a unique ID for business association.</p>
             * 
             * <strong>example:</strong>
             * <p>123***</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The output tag information.</p>
             */
            public Builder outputTags(java.util.List<OutputTags> outputTags) {
                this.outputTags = outputTags;
                return this;
            }

            /**
             * <p>The time when the call was answered. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12349732441</p>
             */
            public Builder pickUpTime(Long pickUpTime) {
                this.pickUpTime = pickUpTime;
                return this;
            }

            /**
             * <p>The download URL of the recording file. This field is available only after a recording file is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>recording.oss.file</p>
             */
            public Builder recordingFileDownloadUrl(String recordingFileDownloadUrl) {
                this.recordingFileDownloadUrl = recordingFileDownloadUrl;
                return this;
            }

            /**
             * <p>The time when the call ended. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The time when the call started. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1286987391</p>
             */
            public Builder startCallTime(Long startCallTime) {
                this.startCallTime = startCallTime;
                return this;
            }

            /**
             * <p>The agent status.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The call status code. For more information, see <a href="https://help.aliyun.com/document_detail/112804.html">Call status codes</a> in Voice Messaging.</p>
             * 
             * <strong>example:</strong>
             * <p>200005</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The call status information returned by the carrier.</p>
             * 
             * <strong>example:</strong>
             * <p>Call ended (dual call)</p>
             */
            public Builder statusMsg(String statusMsg) {
                this.statusMsg = statusMsg;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>138************</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The call variable information.</p>
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
