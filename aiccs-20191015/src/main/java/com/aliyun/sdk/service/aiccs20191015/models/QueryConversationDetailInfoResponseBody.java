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
         * <p>The details of the access denial.</p>
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
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2051E18-FF3F-5C08-8D24-6F150D2AF757</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The ID of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>9ca2*****************************</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Evaluate the customer&quot;s interest in the car model and likelihood of purchase</p>
             */
            public Builder outputTagDescription(String outputTagDescription) {
                this.outputTagDescription = outputTagDescription;
                return this;
            }

            /**
             * <p>The name of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer intent level</p>
             */
            public Builder outputTagName(String outputTagName) {
                this.outputTagName = outputTagName;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;High (very positive, high probability of conversion)&quot;]</p>
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
             * <p>The ID of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The key of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the variable is required. Valid values:</p>
             * <ul>
             * <li><p>true: yes</p>
             * </li>
             * <li><p>false: no</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The source of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The value of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
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

        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private String encryptionType;

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
            this.encryptionType = builder.encryptionType;
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
         * @return encryptionType
         */
        public String getEncryptionType() {
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
            private String encryptionType; 
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
                this.encryptionType = model.encryptionType;
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
             * <p>The unique ID of the call.</p>
             * 
             * <strong>example:</strong>
             * <p>1231231231213^11231231231</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The call result. Valid values:</p>
             * <ul>
             * <li>CALL_FORWARDING: call forwarding</li>
             * <li>INCOMING_CALL_BARRED: incoming calls barred</li>
             * <li>CALL_REJECTED: call rejected</li>
             * <li>ANSWERED: answered</li>
             * <li>USER_BUSY: user busy</li>
             * <li>POWERED_OFF: powered off</li>
             * <li>NO_USER_RESPONSE: no user response</li>
             * <li>OPERATOR_BLOCK: blocked by the carrier</li>
             * <li>OTHERS: other statuses</li>
             * <li>SUSPEND: suspended</li>
             * <li>CANCEL: canceled by the caller</li>
             * <li>INVALID_NUMBER: invalid number</li>
             * <li>UNAVAILABLE: temporarily unavailable</li>
             * <li>NETWORK_BUSY: network busy</li>
             * <li>NO_ANSWER: no answer</li>
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
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>186******</p>
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
             * <p>The chat record information. The structure is a JSON array. The chat records are sorted in chronological order. Details:</p>
             * <pre><code class="language-json">[
             *     {
             *         &quot;content&quot;:&quot;Chat content&quot;,
             *         &quot;role&quot;:&quot;Role&quot;,//Valid values: user (user), assistant (chatbot)
             *     }
             * ]
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>[
             *   {
             *     &quot;content&quot;: &quot;111 Hello, age 222, male. I am the official consultant of ** Automobile. We have launched a new model **; ** is now on the market, starting at ** 10,000 yuan, with * units sold in ** minutes. Would you like to learn more?&quot;,
             *     &quot;role&quot;: &quot;assistant&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;<Customer interrupts> Hey, who are you?&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;<Customer interrupts> Say that again.&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;Hey, I didn&quot;t catch that.&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;What are you saying?&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;Hello,&quot;,
             *     &quot;role&quot;: &quot;assistant&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;I am the sales service consultant at the ** Automobile headquarters.&quot;,
             *     &quot;role&quot;: &quot;assistant&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;We recently launched a new car, **. Would you like to know if you are interested in this model?&quot;,
             *     &quot;role&quot;: &quot;assistant&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;<Customer interrupts> Hey, then who am I?&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;What are you talking about?&quot;,
             *     &quot;role&quot;: &quot;user&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;Sorry to bother you, Mr. 111.&quot;,
             *     &quot;role&quot;: &quot;assistant&quot;
             *   },
             *   {
             *     &quot;content&quot;: &quot;Have a great day! Goodbye!&quot;,
             *     &quot;role&quot;: &quot;assistant&quot;
             *   }
             * ]</p>
             */
            public Builder conversationRecord(String conversationRecord) {
                this.conversationRecord = conversationRecord;
                return this;
            }

            /**
             * <p>The duration of the call. The value is 0 if the call is not connected. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The encryption method. Valid values:</p>
             * <ul>
             * <li>0: no encryption</li>
             * <li>1: MD5</li>
             * <li>2: SHA256</li>
             * <li>3: SM3</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Sample value</p>
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * <p>The reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Canceled by the caller</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The party that hung up. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: user</li>
             * <li><strong>1</strong>: chatbot</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder hangupDirection(String hangupDirection) {
                this.hangupDirection = hangupDirection;
                return this;
            }

            /**
             * <p>The primary intent.</p>
             * 
             * <strong>example:</strong>
             * <p>D</p>
             */
            public Builder majorIntent(String majorIntent) {
                this.majorIntent = majorIntent;
                return this;
            }

            /**
             * <p>The external business transaction ID. You can use a unique ID to associate business data.</p>
             * 
             * <strong>example:</strong>
             * <p>bb3bc32d-54b8-49c4-80d3-61583417d22e</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The list of output tags.</p>
             */
            public Builder outputTags(java.util.List<OutputTags> outputTags) {
                this.outputTags = outputTags;
                return this;
            }

            /**
             * <p>The time when the call was answered. The value is a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1754617273000</p>
             */
            public Builder pickUpTime(Long pickUpTime) {
                this.pickUpTime = pickUpTime;
                return this;
            }

            /**
             * <p>The download URL of the recording file. This field is returned only after the recording file is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>https://********</p>
             */
            public Builder recordingFileDownloadUrl(String recordingFileDownloadUrl) {
                this.recordingFileDownloadUrl = recordingFileDownloadUrl;
                return this;
            }

            /**
             * <p>The time when the call ended. The value is a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The time when the call started. The value is a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>123123123123123</p>
             */
            public Builder startCallTime(Long startCallTime) {
                this.startCallTime = startCallTime;
                return this;
            }

            /**
             * <p>The call status code. For more information, see <a href="https://help.aliyun.com/document_detail/112804.html">Call status codes</a> of Voice Messaging.</p>
             * 
             * <strong>example:</strong>
             * <p>200005</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The call status message returned by the carrier.</p>
             * 
             * <strong>example:</strong>
             * <p>Call ended (two-way call)</p>
             */
            public Builder statusMsg(String statusMsg) {
                this.statusMsg = statusMsg;
                return this;
            }

            /**
             * <p>The list of call variables. These are the call variables associated with the call task that you created.</p>
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
