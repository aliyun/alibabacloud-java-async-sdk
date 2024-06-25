// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskListResponseBody} extends {@link TeaModel}
 *
 * <p>TaskListResponseBody</p>
 */
public class TaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List < Model> model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private TaskListResponseBody(Builder builder) {
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

    public static TaskListResponseBody create() {
        return builder().build();
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
    public java.util.List < Model> getModel() {
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
        private java.util.List < Model> model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

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
        public Builder model(java.util.List < Model> model) {
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

        public TaskListResponseBody build() {
            return new TaskListResponseBody(this);
        } 

    } 

    public static class IntentTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntentDescription")
        private String intentDescription;

        @com.aliyun.core.annotation.NameInMap("IntentTag")
        private String intentTag;

        private IntentTags(Builder builder) {
            this.intentDescription = builder.intentDescription;
            this.intentTag = builder.intentTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentTags create() {
            return builder().build();
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

        public static final class Builder {
            private String intentDescription; 
            private String intentTag; 

            /**
             * 意向标签描述
             */
            public Builder intentDescription(String intentDescription) {
                this.intentDescription = intentDescription;
                return this;
            }

            /**
             * 意向标签ID
             */
            public Builder intentTag(String intentTag) {
                this.intentTag = intentTag;
                return this;
            }

            public IntentTags build() {
                return new IntentTags(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCallTime")
        private String allowCallTime;

        @com.aliyun.core.annotation.NameInMap("AllowCallTimeFormat")
        private String allowCallTimeFormat;

        @com.aliyun.core.annotation.NameInMap("AllowDayOfWeek")
        private String allowDayOfWeek;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Long callType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ImportTime")
        private String importTime;

        @com.aliyun.core.annotation.NameInMap("IntentTags")
        private java.util.List < IntentTags> intentTags;

        @com.aliyun.core.annotation.NameInMap("InvalidReCall")
        private Long invalidReCall;

        @com.aliyun.core.annotation.NameInMap("LastCallTime")
        private String lastCallTime;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private Long maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("PersonalityTags")
        private java.util.List < String > personalityTags;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("RecallType")
        private Long recallType;

        @com.aliyun.core.annotation.NameInMap("SendSms")
        private Long sendSms;

        @com.aliyun.core.annotation.NameInMap("SmsName")
        private String smsName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private Model(Builder builder) {
            this.allowCallTime = builder.allowCallTime;
            this.allowCallTimeFormat = builder.allowCallTimeFormat;
            this.allowDayOfWeek = builder.allowDayOfWeek;
            this.callType = builder.callType;
            this.createTime = builder.createTime;
            this.importTime = builder.importTime;
            this.intentTags = builder.intentTags;
            this.invalidReCall = builder.invalidReCall;
            this.lastCallTime = builder.lastCallTime;
            this.maxConcurrency = builder.maxConcurrency;
            this.personalityTags = builder.personalityTags;
            this.priority = builder.priority;
            this.properties = builder.properties;
            this.recallType = builder.recallType;
            this.sendSms = builder.sendSms;
            this.smsName = builder.smsName;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return allowCallTime
         */
        public String getAllowCallTime() {
            return this.allowCallTime;
        }

        /**
         * @return allowCallTimeFormat
         */
        public String getAllowCallTimeFormat() {
            return this.allowCallTimeFormat;
        }

        /**
         * @return allowDayOfWeek
         */
        public String getAllowDayOfWeek() {
            return this.allowDayOfWeek;
        }

        /**
         * @return callType
         */
        public Long getCallType() {
            return this.callType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return importTime
         */
        public String getImportTime() {
            return this.importTime;
        }

        /**
         * @return intentTags
         */
        public java.util.List < IntentTags> getIntentTags() {
            return this.intentTags;
        }

        /**
         * @return invalidReCall
         */
        public Long getInvalidReCall() {
            return this.invalidReCall;
        }

        /**
         * @return lastCallTime
         */
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        /**
         * @return maxConcurrency
         */
        public Long getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return personalityTags
         */
        public java.util.List < String > getPersonalityTags() {
            return this.personalityTags;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return recallType
         */
        public Long getRecallType() {
            return this.recallType;
        }

        /**
         * @return sendSms
         */
        public Long getSendSms() {
            return this.sendSms;
        }

        /**
         * @return smsName
         */
        public String getSmsName() {
            return this.smsName;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String allowCallTime; 
            private String allowCallTimeFormat; 
            private String allowDayOfWeek; 
            private Long callType; 
            private String createTime; 
            private String importTime; 
            private java.util.List < IntentTags> intentTags; 
            private Long invalidReCall; 
            private String lastCallTime; 
            private Long maxConcurrency; 
            private java.util.List < String > personalityTags; 
            private Long priority; 
            private String properties; 
            private Long recallType; 
            private Long sendSms; 
            private String smsName; 
            private Long status; 
            private Long taskId; 
            private String taskName; 
            private String templateId; 
            private String templateName; 

            /**
             * 外呼时间段
             */
            public Builder allowCallTime(String allowCallTime) {
                this.allowCallTime = allowCallTime;
                return this;
            }

            /**
             * 外呼时间段格式化
             */
            public Builder allowCallTimeFormat(String allowCallTimeFormat) {
                this.allowCallTimeFormat = allowCallTimeFormat;
                return this;
            }

            /**
             * 外呼时间
             */
            public Builder allowDayOfWeek(String allowDayOfWeek) {
                this.allowDayOfWeek = allowDayOfWeek;
                return this;
            }

            /**
             * 外呼类型
             */
            public Builder callType(Long callType) {
                this.callType = callType;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 最近导入时间
             */
            public Builder importTime(String importTime) {
                this.importTime = importTime;
                return this;
            }

            /**
             * 意向标签列表
             */
            public Builder intentTags(java.util.List < IntentTags> intentTags) {
                this.intentTags = intentTags;
                return this;
            }

            /**
             * 接通重呼次数
             */
            public Builder invalidReCall(Long invalidReCall) {
                this.invalidReCall = invalidReCall;
                return this;
            }

            /**
             * 最后外呼时间
             */
            public Builder lastCallTime(String lastCallTime) {
                this.lastCallTime = lastCallTime;
                return this;
            }

            /**
             * 最大并发数
             */
            public Builder maxConcurrency(Long maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * 个性标签列表
             */
            public Builder personalityTags(java.util.List < String > personalityTags) {
                this.personalityTags = personalityTags;
                return this;
            }

            /**
             * 优先任务
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * 任务所需参数
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * 自动重呼
             */
            public Builder recallType(Long recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * 发送短信
             */
            public Builder sendSms(Long sendSms) {
                this.sendSms = sendSms;
                return this;
            }

            /**
             * 短信模板
             */
            public Builder smsName(String smsName) {
                this.smsName = smsName;
                return this;
            }

            /**
             * 任务状态
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * 任务ID
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * 任务名称
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * 话术模板Id
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * 话术模板名称
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
