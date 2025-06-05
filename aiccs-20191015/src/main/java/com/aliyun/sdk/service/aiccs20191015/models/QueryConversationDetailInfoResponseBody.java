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
        @com.aliyun.core.annotation.NameInMap("ConversationRecord")
        private String conversationRecord;

        @com.aliyun.core.annotation.NameInMap("OutputTags")
        private java.util.List<OutputTags> outputTags;

        @com.aliyun.core.annotation.NameInMap("PickUpTime")
        private Long pickUpTime;

        @com.aliyun.core.annotation.NameInMap("RecordingFileDownloadUrl")
        private String recordingFileDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        private Data(Builder builder) {
            this.conversationRecord = builder.conversationRecord;
            this.outputTags = builder.outputTags;
            this.pickUpTime = builder.pickUpTime;
            this.recordingFileDownloadUrl = builder.recordingFileDownloadUrl;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return conversationRecord
         */
        public String getConversationRecord() {
            return this.conversationRecord;
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
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String conversationRecord; 
            private java.util.List<OutputTags> outputTags; 
            private Long pickUpTime; 
            private String recordingFileDownloadUrl; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.conversationRecord = model.conversationRecord;
                this.outputTags = model.outputTags;
                this.pickUpTime = model.pickUpTime;
                this.recordingFileDownloadUrl = model.recordingFileDownloadUrl;
                this.variables = model.variables;
            } 

            /**
             * ConversationRecord.
             */
            public Builder conversationRecord(String conversationRecord) {
                this.conversationRecord = conversationRecord;
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
