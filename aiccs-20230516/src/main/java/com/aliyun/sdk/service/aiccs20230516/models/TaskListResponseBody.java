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
    private java.util.List<Model> model;

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
    public java.util.List<Model> getModel() {
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
        private java.util.List<Model> model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(TaskListResponseBody model) {
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
        public Builder model(java.util.List<Model> model) {
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

    /**
     * 
     * {@link TaskListResponseBody} extends {@link TeaModel}
     *
     * <p>TaskListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IntentTags model) {
                this.intentDescription = model.intentDescription;
                this.intentTag = model.intentTag;
            } 

            /**
             * <p>意向标签描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder intentDescription(String intentDescription) {
                this.intentDescription = intentDescription;
                return this;
            }

            /**
             * <p>意向标签ID</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
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
    /**
     * 
     * {@link TaskListResponseBody} extends {@link TeaModel}
     *
     * <p>TaskListResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("FlashSmsTemplateId")
        private Long flashSmsTemplateId;

        @com.aliyun.core.annotation.NameInMap("FlashSmsTemplateName")
        private String flashSmsTemplateName;

        @com.aliyun.core.annotation.NameInMap("FlashSmsType")
        private Long flashSmsType;

        @com.aliyun.core.annotation.NameInMap("ImportTime")
        private String importTime;

        @com.aliyun.core.annotation.NameInMap("IntentTags")
        private java.util.List<IntentTags> intentTags;

        @com.aliyun.core.annotation.NameInMap("InvalidReCall")
        private Long invalidReCall;

        @com.aliyun.core.annotation.NameInMap("LastCallTime")
        private String lastCallTime;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private Long maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("PersonalityTags")
        private java.util.List<String> personalityTags;

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
            this.flashSmsTemplateId = builder.flashSmsTemplateId;
            this.flashSmsTemplateName = builder.flashSmsTemplateName;
            this.flashSmsType = builder.flashSmsType;
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
         * @return flashSmsTemplateId
         */
        public Long getFlashSmsTemplateId() {
            return this.flashSmsTemplateId;
        }

        /**
         * @return flashSmsTemplateName
         */
        public String getFlashSmsTemplateName() {
            return this.flashSmsTemplateName;
        }

        /**
         * @return flashSmsType
         */
        public Long getFlashSmsType() {
            return this.flashSmsType;
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
        public java.util.List<IntentTags> getIntentTags() {
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
        public java.util.List<String> getPersonalityTags() {
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
            private Long flashSmsTemplateId; 
            private String flashSmsTemplateName; 
            private Long flashSmsType; 
            private String importTime; 
            private java.util.List<IntentTags> intentTags; 
            private Long invalidReCall; 
            private String lastCallTime; 
            private Long maxConcurrency; 
            private java.util.List<String> personalityTags; 
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

            private Builder() {
            } 

            private Builder(Model model) {
                this.allowCallTime = model.allowCallTime;
                this.allowCallTimeFormat = model.allowCallTimeFormat;
                this.allowDayOfWeek = model.allowDayOfWeek;
                this.callType = model.callType;
                this.createTime = model.createTime;
                this.flashSmsTemplateId = model.flashSmsTemplateId;
                this.flashSmsTemplateName = model.flashSmsTemplateName;
                this.flashSmsType = model.flashSmsType;
                this.importTime = model.importTime;
                this.intentTags = model.intentTags;
                this.invalidReCall = model.invalidReCall;
                this.lastCallTime = model.lastCallTime;
                this.maxConcurrency = model.maxConcurrency;
                this.personalityTags = model.personalityTags;
                this.priority = model.priority;
                this.properties = model.properties;
                this.recallType = model.recallType;
                this.sendSms = model.sendSms;
                this.smsName = model.smsName;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * <p>外呼时间段</p>
             * 
             * <strong>example:</strong>
             * <p>“8:00~20:30”</p>
             */
            public Builder allowCallTime(String allowCallTime) {
                this.allowCallTime = allowCallTime;
                return this;
            }

            /**
             * <p>外呼时间段格式化</p>
             * 
             * <strong>example:</strong>
             * <p>“8:00 ~ 20:00”</p>
             */
            public Builder allowCallTimeFormat(String allowCallTimeFormat) {
                this.allowCallTimeFormat = allowCallTimeFormat;
                return this;
            }

            /**
             * <p>外呼时间</p>
             * 
             * <strong>example:</strong>
             * <p>“1,2,3”</p>
             */
            public Builder allowDayOfWeek(String allowDayOfWeek) {
                this.allowDayOfWeek = allowDayOfWeek;
                return this;
            }

            /**
             * <p>外呼类型</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder callType(Long callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-05 12:11:11</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>闪信模板id</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder flashSmsTemplateId(Long flashSmsTemplateId) {
                this.flashSmsTemplateId = flashSmsTemplateId;
                return this;
            }

            /**
             * <p>闪信模板名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder flashSmsTemplateName(String flashSmsTemplateName) {
                this.flashSmsTemplateName = flashSmsTemplateName;
                return this;
            }

            /**
             * <p>发送闪信配置，可选0，1；0表示否，1表示是</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flashSmsType(Long flashSmsType) {
                this.flashSmsType = flashSmsType;
                return this;
            }

            /**
             * <p>最近导入时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-05 12:11:11</p>
             */
            public Builder importTime(String importTime) {
                this.importTime = importTime;
                return this;
            }

            /**
             * <p>意向标签列表</p>
             */
            public Builder intentTags(java.util.List<IntentTags> intentTags) {
                this.intentTags = intentTags;
                return this;
            }

            /**
             * <p>接通重呼次数</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder invalidReCall(Long invalidReCall) {
                this.invalidReCall = invalidReCall;
                return this;
            }

            /**
             * <p>最后外呼时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-05 12:11:11</p>
             */
            public Builder lastCallTime(String lastCallTime) {
                this.lastCallTime = lastCallTime;
                return this;
            }

            /**
             * <p>最大并发数</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder maxConcurrency(Long maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * <p>个性标签列表</p>
             */
            public Builder personalityTags(java.util.List<String> personalityTags) {
                this.personalityTags = personalityTags;
                return this;
            }

            /**
             * <p>优先任务</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>任务所需参数</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>自动重呼</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder recallType(Long recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * <p>发送短信</p>
             * 
             * <strong>example:</strong>
             * <p>39</p>
             */
            public Builder sendSms(Long sendSms) {
                this.sendSms = sendSms;
                return this;
            }

            /**
             * <p>短信模板</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder smsName(String smsName) {
                this.smsName = smsName;
                return this;
            }

            /**
             * <p>任务状态</p>
             * 
             * <strong>example:</strong>
             * <p>79</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>任务ID</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>任务名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>话术模板Id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>话术模板名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
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
