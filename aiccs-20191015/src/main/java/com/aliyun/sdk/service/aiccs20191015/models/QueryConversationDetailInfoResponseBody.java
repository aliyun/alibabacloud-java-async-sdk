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
 * {@link QueryConversationDetailInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConversationDetailInfoResponseBody</p>
 */
public class QueryConversationDetailInfoResponseBody extends TeaModel {
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

    private QueryConversationDetailInfoResponseBody(Builder builder) {
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

    public static QueryConversationDetailInfoResponseBody create() {
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

        private Builder(QueryConversationDetailInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryConversationDetailInfoResponseBody build() {
            return new QueryConversationDetailInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConversationDetailInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConversationDetailInfoResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * OutputTagDescription.
             */
            public Builder outputTagDescription(String outputTagDescription) {
                this.outputTagDescription = outputTagDescription;
                return this;
            }

            /**
             * OutputTagName.
             */
            public Builder outputTagName(String outputTagName) {
                this.outputTagName = outputTagName;
                return this;
            }

            /**
             * OutputTagValue.
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
     * {@link QueryConversationDetailInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConversationDetailInfoResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.id = builder.id;
            this.key = builder.key;
            this.name = builder.name;
            this.required = builder.required;
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
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.id = model.id;
                this.key = model.key;
                this.name = model.name;
                this.required = model.required;
                this.value = model.value;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * Value.
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
     * {@link QueryConversationDetailInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConversationDetailInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("HangupDirection")
        private String hangupDirection;

        @com.aliyun.core.annotation.NameInMap("MajorIntent")
        private String majorIntent;

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

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusMsg")
        private String statusMsg;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        private Data(Builder builder) {
            this.callId = builder.callId;
            this.callResult = builder.callResult;
            this.calledPhone = builder.calledPhone;
            this.callerPhone = builder.callerPhone;
            this.conversationRecord = builder.conversationRecord;
            this.duration = builder.duration;
            this.failedReason = builder.failedReason;
            this.hangupDirection = builder.hangupDirection;
            this.majorIntent = builder.majorIntent;
            this.outId = builder.outId;
            this.outputTags = builder.outputTags;
            this.pickUpTime = builder.pickUpTime;
            this.recordingFileDownloadUrl = builder.recordingFileDownloadUrl;
            this.releaseTime = builder.releaseTime;
            this.startCallTime = builder.startCallTime;
            this.statusCode = builder.statusCode;
            this.statusMsg = builder.statusMsg;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
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
         * @return majorIntent
         */
        public String getMajorIntent() {
            return this.majorIntent;
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
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String callId; 
            private String callResult; 
            private String calledPhone; 
            private String callerPhone; 
            private String conversationRecord; 
            private Long duration; 
            private String failedReason; 
            private String hangupDirection; 
            private String majorIntent; 
            private String outId; 
            private java.util.List<OutputTags> outputTags; 
            private Long pickUpTime; 
            private String recordingFileDownloadUrl; 
            private Long releaseTime; 
            private Long startCallTime; 
            private String statusCode; 
            private String statusMsg; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callId = model.callId;
                this.callResult = model.callResult;
                this.calledPhone = model.calledPhone;
                this.callerPhone = model.callerPhone;
                this.conversationRecord = model.conversationRecord;
                this.duration = model.duration;
                this.failedReason = model.failedReason;
                this.hangupDirection = model.hangupDirection;
                this.majorIntent = model.majorIntent;
                this.outId = model.outId;
                this.outputTags = model.outputTags;
                this.pickUpTime = model.pickUpTime;
                this.recordingFileDownloadUrl = model.recordingFileDownloadUrl;
                this.releaseTime = model.releaseTime;
                this.startCallTime = model.startCallTime;
                this.statusCode = model.statusCode;
                this.statusMsg = model.statusMsg;
                this.variables = model.variables;
            } 

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * CallResult.
             */
            public Builder callResult(String callResult) {
                this.callResult = callResult;
                return this;
            }

            /**
             * CalledPhone.
             */
            public Builder calledPhone(String calledPhone) {
                this.calledPhone = calledPhone;
                return this;
            }

            /**
             * CallerPhone.
             */
            public Builder callerPhone(String callerPhone) {
                this.callerPhone = callerPhone;
                return this;
            }

            /**
             * ConversationRecord.
             */
            public Builder conversationRecord(String conversationRecord) {
                this.conversationRecord = conversationRecord;
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
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * HangupDirection.
             */
            public Builder hangupDirection(String hangupDirection) {
                this.hangupDirection = hangupDirection;
                return this;
            }

            /**
             * MajorIntent.
             */
            public Builder majorIntent(String majorIntent) {
                this.majorIntent = majorIntent;
                return this;
            }

            /**
             * OutId.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * OutputTags.
             */
            public Builder outputTags(java.util.List<OutputTags> outputTags) {
                this.outputTags = outputTags;
                return this;
            }

            /**
             * PickUpTime.
             */
            public Builder pickUpTime(Long pickUpTime) {
                this.pickUpTime = pickUpTime;
                return this;
            }

            /**
             * RecordingFileDownloadUrl.
             */
            public Builder recordingFileDownloadUrl(String recordingFileDownloadUrl) {
                this.recordingFileDownloadUrl = recordingFileDownloadUrl;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * StartCallTime.
             */
            public Builder startCallTime(Long startCallTime) {
                this.startCallTime = startCallTime;
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
             * StatusMsg.
             */
            public Builder statusMsg(String statusMsg) {
                this.statusMsg = statusMsg;
                return this;
            }

            /**
             * Variables.
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
