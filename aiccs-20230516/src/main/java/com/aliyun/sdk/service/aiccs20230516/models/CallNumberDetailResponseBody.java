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
 * {@link CallNumberDetailResponseBody} extends {@link TeaModel}
 *
 * <p>CallNumberDetailResponseBody</p>
 */
public class CallNumberDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private CallNumberDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public static CallNumberDetailResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(CallNumberDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
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
        public Builder success(Boolean success) {
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

        public CallNumberDetailResponseBody build() {
            return new CallNumberDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CallNumberDetailResponseBody} extends {@link TeaModel}
     *
     * <p>CallNumberDetailResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("Bill")
        private Long bill;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Long callType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IntentTag")
        private String intentTag;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private String keywords;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberMd5")
        private String numberMd5;

        @com.aliyun.core.annotation.NameInMap("PersonalityTag")
        private String personalityTag;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Long statusCode;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TransferStatus")
        private Long transferStatus;

        private Model(Builder builder) {
            this.batchId = builder.batchId;
            this.bill = builder.bill;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.id = builder.id;
            this.intentTag = builder.intentTag;
            this.keywords = builder.keywords;
            this.number = builder.number;
            this.numberMd5 = builder.numberMd5;
            this.personalityTag = builder.personalityTag;
            this.statusCode = builder.statusCode;
            this.tag = builder.tag;
            this.taskId = builder.taskId;
            this.templateId = builder.templateId;
            this.transferStatus = builder.transferStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return bill
         */
        public Long getBill() {
            return this.bill;
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
        public Long getCallType() {
            return this.callType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intentTag
         */
        public String getIntentTag() {
            return this.intentTag;
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
         * @return numberMd5
         */
        public String getNumberMd5() {
            return this.numberMd5;
        }

        /**
         * @return personalityTag
         */
        public String getPersonalityTag() {
            return this.personalityTag;
        }

        /**
         * @return statusCode
         */
        public Long getStatusCode() {
            return this.statusCode;
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
        public Long getTransferStatus() {
            return this.transferStatus;
        }

        public static final class Builder {
            private String batchId; 
            private Long bill; 
            private String callId; 
            private Long callType; 
            private Long id; 
            private String intentTag; 
            private String keywords; 
            private String number; 
            private String numberMd5; 
            private String personalityTag; 
            private Long statusCode; 
            private String tag; 
            private Long taskId; 
            private Long templateId; 
            private Long transferStatus; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.batchId = model.batchId;
                this.bill = model.bill;
                this.callId = model.callId;
                this.callType = model.callType;
                this.id = model.id;
                this.intentTag = model.intentTag;
                this.keywords = model.keywords;
                this.number = model.number;
                this.numberMd5 = model.numberMd5;
                this.personalityTag = model.personalityTag;
                this.statusCode = model.statusCode;
                this.tag = model.tag;
                this.taskId = model.taskId;
                this.templateId = model.templateId;
                this.transferStatus = model.transferStatus;
            } 

            /**
             * <p>导入号码时返回的批次号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>通话时长，单位为毫秒，实际计费需向上取整转换为秒</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bill(Long bill) {
                this.bill = bill;
                return this;
            }

            /**
             * <p>每次呼叫的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>可选项 1-AI外呼，6-语音通知</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callType(Long callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>号码编号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>意向标签</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder intentTag(String intentTag) {
                this.intentTag = intentTag;
                return this;
            }

            /**
             * <p>回复关键词</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * <p>外呼号码</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>外呼号码MD5</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder numberMd5(String numberMd5) {
                this.numberMd5 = numberMd5;
                return this;
            }

            /**
             * <p>个性标签</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder personalityTag(String personalityTag) {
                this.personalityTag = personalityTag;
                return this;
            }

            /**
             * <p>外呼状态编码</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder statusCode(Long statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>用户自定义标签</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>任务ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>外呼使用的模板ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>转人工状态 0-未触发,</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder transferStatus(Long transferStatus) {
                this.transferStatus = transferStatus;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
