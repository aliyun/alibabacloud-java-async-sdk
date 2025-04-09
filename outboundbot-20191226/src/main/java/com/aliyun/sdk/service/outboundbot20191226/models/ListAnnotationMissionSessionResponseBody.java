// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnnotationMissionSessionResponseBody</p>
 */
public class ListAnnotationMissionSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAnnotationMissionSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationMissionSessionResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAnnotationMissionSessionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListAnnotationMissionSessionResponseBody build() {
            return new ListAnnotationMissionSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionSessionResponseBody</p>
     */
    public static class AnnotationMissionChatCustomizationDataInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatCustomizationDataInfoId")
        private String annotationMissionChatCustomizationDataInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataDescription")
        private String customizationDataDescription;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataId")
        private String customizationDataId;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataName")
        private String customizationDataName;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataWeight")
        private Integer customizationDataWeight;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        private AnnotationMissionChatCustomizationDataInfoList(Builder builder) {
            this.annotationMissionChatCustomizationDataInfoId = builder.annotationMissionChatCustomizationDataInfoId;
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.content = builder.content;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.customizationDataDescription = builder.customizationDataDescription;
            this.customizationDataId = builder.customizationDataId;
            this.customizationDataName = builder.customizationDataName;
            this.customizationDataWeight = builder.customizationDataWeight;
            this.delete = builder.delete;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatCustomizationDataInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatCustomizationDataInfoId
         */
        public String getAnnotationMissionChatCustomizationDataInfoId() {
            return this.annotationMissionChatCustomizationDataInfoId;
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customizationDataDescription
         */
        public String getCustomizationDataDescription() {
            return this.customizationDataDescription;
        }

        /**
         * @return customizationDataId
         */
        public String getCustomizationDataId() {
            return this.customizationDataId;
        }

        /**
         * @return customizationDataName
         */
        public String getCustomizationDataName() {
            return this.customizationDataName;
        }

        /**
         * @return customizationDataWeight
         */
        public Integer getCustomizationDataWeight() {
            return this.customizationDataWeight;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String annotationMissionChatCustomizationDataInfoId; 
            private String annotationMissionChatId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private String content; 
            private Boolean create; 
            private Long createTime; 
            private String customizationDataDescription; 
            private String customizationDataId; 
            private String customizationDataName; 
            private Integer customizationDataWeight; 
            private Boolean delete; 
            private String instanceId; 
            private Long modifiedTime; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatCustomizationDataInfoList model) {
                this.annotationMissionChatCustomizationDataInfoId = model.annotationMissionChatCustomizationDataInfoId;
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.content = model.content;
                this.create = model.create;
                this.createTime = model.createTime;
                this.customizationDataDescription = model.customizationDataDescription;
                this.customizationDataId = model.customizationDataId;
                this.customizationDataName = model.customizationDataName;
                this.customizationDataWeight = model.customizationDataWeight;
                this.delete = model.delete;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>id</p>
             */
            public Builder annotationMissionChatCustomizationDataInfoId(String annotationMissionChatCustomizationDataInfoId) {
                this.annotationMissionChatCustomizationDataInfoId = annotationMissionChatCustomizationDataInfoId;
                return this;
            }

            /**
             * <p>chat id</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AnnotationMissionSessionId.
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Create.
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomizationDataDescription.
             */
            public Builder customizationDataDescription(String customizationDataDescription) {
                this.customizationDataDescription = customizationDataDescription;
                return this;
            }

            /**
             * <p>id</p>
             */
            public Builder customizationDataId(String customizationDataId) {
                this.customizationDataId = customizationDataId;
                return this;
            }

            /**
             * CustomizationDataName.
             */
            public Builder customizationDataName(String customizationDataName) {
                this.customizationDataName = customizationDataName;
                return this;
            }

            /**
             * CustomizationDataWeight.
             */
            public Builder customizationDataWeight(Integer customizationDataWeight) {
                this.customizationDataWeight = customizationDataWeight;
                return this;
            }

            /**
             * Delete.
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public AnnotationMissionChatCustomizationDataInfoList build() {
                return new AnnotationMissionChatCustomizationDataInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionSessionResponseBody</p>
     */
    public static class AnnotationMissionChatIntentUserSayInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatIntentUserSayInfoId")
        private String annotationMissionChatIntentUserSayInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("BotId")
        private String botId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("DialogId")
        private Long dialogId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        private AnnotationMissionChatIntentUserSayInfoList(Builder builder) {
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatIntentUserSayInfoId = builder.annotationMissionChatIntentUserSayInfoId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.botId = builder.botId;
            this.content = builder.content;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.delete = builder.delete;
            this.dialogId = builder.dialogId;
            this.instanceId = builder.instanceId;
            this.intentId = builder.intentId;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatIntentUserSayInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatIntentUserSayInfoId
         */
        public String getAnnotationMissionChatIntentUserSayInfoId() {
            return this.annotationMissionChatIntentUserSayInfoId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return botId
         */
        public String getBotId() {
            return this.botId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return dialogId
         */
        public Long getDialogId() {
            return this.dialogId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String annotationMissionChatId; 
            private String annotationMissionChatIntentUserSayInfoId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private String botId; 
            private String content; 
            private Boolean create; 
            private Long createTime; 
            private Boolean delete; 
            private Long dialogId; 
            private String instanceId; 
            private Long intentId; 
            private Long modifiedTime; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatIntentUserSayInfoList model) {
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatIntentUserSayInfoId = model.annotationMissionChatIntentUserSayInfoId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.botId = model.botId;
                this.content = model.content;
                this.create = model.create;
                this.createTime = model.createTime;
                this.delete = model.delete;
                this.dialogId = model.dialogId;
                this.instanceId = model.instanceId;
                this.intentId = model.intentId;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>chat id</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>id</p>
             */
            public Builder annotationMissionChatIntentUserSayInfoId(String annotationMissionChatIntentUserSayInfoId) {
                this.annotationMissionChatIntentUserSayInfoId = annotationMissionChatIntentUserSayInfoId;
                return this;
            }

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AnnotationMissionSessionId.
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * BotId.
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Create.
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Delete.
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * DialogId.
             */
            public Builder dialogId(Long dialogId) {
                this.dialogId = dialogId;
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
             * IntentId.
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public AnnotationMissionChatIntentUserSayInfoList build() {
                return new AnnotationMissionChatIntentUserSayInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionSessionResponseBody</p>
     */
    public static class AnnotationMissionChatTagInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatTagInfoId")
        private String annotationMissionChatTagInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoId")
        private String annotationMissionTagInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoName")
        private String annotationMissionTagInfoName;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        private AnnotationMissionChatTagInfoList(Builder builder) {
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatTagInfoId = builder.annotationMissionChatTagInfoId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.annotationMissionTagInfoId = builder.annotationMissionTagInfoId;
            this.annotationMissionTagInfoName = builder.annotationMissionTagInfoName;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.delete = builder.delete;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatTagInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatTagInfoId
         */
        public String getAnnotationMissionChatTagInfoId() {
            return this.annotationMissionChatTagInfoId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return annotationMissionTagInfoId
         */
        public String getAnnotationMissionTagInfoId() {
            return this.annotationMissionTagInfoId;
        }

        /**
         * @return annotationMissionTagInfoName
         */
        public String getAnnotationMissionTagInfoName() {
            return this.annotationMissionTagInfoName;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String annotationMissionChatId; 
            private String annotationMissionChatTagInfoId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private String annotationMissionTagInfoId; 
            private String annotationMissionTagInfoName; 
            private Boolean create; 
            private Long createTime; 
            private Boolean delete; 
            private String instanceId; 
            private Long modifiedTime; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatTagInfoList model) {
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatTagInfoId = model.annotationMissionChatTagInfoId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.annotationMissionTagInfoId = model.annotationMissionTagInfoId;
                this.annotationMissionTagInfoName = model.annotationMissionTagInfoName;
                this.create = model.create;
                this.createTime = model.createTime;
                this.delete = model.delete;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>chat id</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>id</p>
             */
            public Builder annotationMissionChatTagInfoId(String annotationMissionChatTagInfoId) {
                this.annotationMissionChatTagInfoId = annotationMissionChatTagInfoId;
                return this;
            }

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AnnotationMissionSessionId.
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * <p>tag id</p>
             */
            public Builder annotationMissionTagInfoId(String annotationMissionTagInfoId) {
                this.annotationMissionTagInfoId = annotationMissionTagInfoId;
                return this;
            }

            /**
             * AnnotationMissionTagInfoName.
             */
            public Builder annotationMissionTagInfoName(String annotationMissionTagInfoName) {
                this.annotationMissionTagInfoName = annotationMissionTagInfoName;
                return this;
            }

            /**
             * Create.
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Delete.
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public AnnotationMissionChatTagInfoList build() {
                return new AnnotationMissionChatTagInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionSessionResponseBody</p>
     */
    public static class AnnotationMissionChatVocabularyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatVocabularyInfoId")
        private String annotationMissionChatVocabularyInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Vocabulary")
        private String vocabulary;

        @com.aliyun.core.annotation.NameInMap("VocabularyDescription")
        private String vocabularyDescription;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
        private String vocabularyId;

        @com.aliyun.core.annotation.NameInMap("VocabularyName")
        private String vocabularyName;

        @com.aliyun.core.annotation.NameInMap("VocabularyWeight")
        private Integer vocabularyWeight;

        private AnnotationMissionChatVocabularyInfoList(Builder builder) {
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatVocabularyInfoId = builder.annotationMissionChatVocabularyInfoId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.delete = builder.delete;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.vocabulary = builder.vocabulary;
            this.vocabularyDescription = builder.vocabularyDescription;
            this.vocabularyId = builder.vocabularyId;
            this.vocabularyName = builder.vocabularyName;
            this.vocabularyWeight = builder.vocabularyWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatVocabularyInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatVocabularyInfoId
         */
        public String getAnnotationMissionChatVocabularyInfoId() {
            return this.annotationMissionChatVocabularyInfoId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return vocabulary
         */
        public String getVocabulary() {
            return this.vocabulary;
        }

        /**
         * @return vocabularyDescription
         */
        public String getVocabularyDescription() {
            return this.vocabularyDescription;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        /**
         * @return vocabularyName
         */
        public String getVocabularyName() {
            return this.vocabularyName;
        }

        /**
         * @return vocabularyWeight
         */
        public Integer getVocabularyWeight() {
            return this.vocabularyWeight;
        }

        public static final class Builder {
            private String annotationMissionChatId; 
            private String annotationMissionChatVocabularyInfoId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private Boolean create; 
            private Long createTime; 
            private Boolean delete; 
            private String instanceId; 
            private Long modifiedTime; 
            private String vocabulary; 
            private String vocabularyDescription; 
            private String vocabularyId; 
            private String vocabularyName; 
            private Integer vocabularyWeight; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatVocabularyInfoList model) {
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatVocabularyInfoId = model.annotationMissionChatVocabularyInfoId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.create = model.create;
                this.createTime = model.createTime;
                this.delete = model.delete;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.vocabulary = model.vocabulary;
                this.vocabularyDescription = model.vocabularyDescription;
                this.vocabularyId = model.vocabularyId;
                this.vocabularyName = model.vocabularyName;
                this.vocabularyWeight = model.vocabularyWeight;
            } 

            /**
             * <p>chat id</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>id</p>
             */
            public Builder annotationMissionChatVocabularyInfoId(String annotationMissionChatVocabularyInfoId) {
                this.annotationMissionChatVocabularyInfoId = annotationMissionChatVocabularyInfoId;
                return this;
            }

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AnnotationMissionSessionId.
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * Create.
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Delete.
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Vocabulary.
             */
            public Builder vocabulary(String vocabulary) {
                this.vocabulary = vocabulary;
                return this;
            }

            /**
             * VocabularyDescription.
             */
            public Builder vocabularyDescription(String vocabularyDescription) {
                this.vocabularyDescription = vocabularyDescription;
                return this;
            }

            /**
             * VocabularyId.
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            /**
             * VocabularyName.
             */
            public Builder vocabularyName(String vocabularyName) {
                this.vocabularyName = vocabularyName;
                return this;
            }

            /**
             * VocabularyWeight.
             */
            public Builder vocabularyWeight(Integer vocabularyWeight) {
                this.vocabularyWeight = vocabularyWeight;
                return this;
            }

            public AnnotationMissionChatVocabularyInfoList build() {
                return new AnnotationMissionChatVocabularyInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionSessionResponseBody</p>
     */
    public static class AnnotationMissionChatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationAsrResult")
        private String annotationAsrResult;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatCustomizationDataInfoList")
        private java.util.List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatIntentUserSayInfoList")
        private java.util.List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatTagInfoList")
        private java.util.List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatVocabularyInfoList")
        private java.util.List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationStatus")
        private Integer annotationStatus;

        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("AsrAnnotationStatus")
        private Integer asrAnnotationStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IntentAnnotationStatus")
        private Integer intentAnnotationStatus;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OccurTime")
        private Long occurTime;

        @com.aliyun.core.annotation.NameInMap("OriginalAsrResult")
        private String originalAsrResult;

        @com.aliyun.core.annotation.NameInMap("SequenceId")
        private String sequenceId;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private Integer subStatus;

        @com.aliyun.core.annotation.NameInMap("TagAnnotationStatus")
        private Integer tagAnnotationStatus;

        @com.aliyun.core.annotation.NameInMap("TranslationError")
        private Integer translationError;

        private AnnotationMissionChatList(Builder builder) {
            this.annotationAsrResult = builder.annotationAsrResult;
            this.annotationMissionChatCustomizationDataInfoList = builder.annotationMissionChatCustomizationDataInfoList;
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatIntentUserSayInfoList = builder.annotationMissionChatIntentUserSayInfoList;
            this.annotationMissionChatTagInfoList = builder.annotationMissionChatTagInfoList;
            this.annotationMissionChatVocabularyInfoList = builder.annotationMissionChatVocabularyInfoList;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.annotationStatus = builder.annotationStatus;
            this.answer = builder.answer;
            this.asrAnnotationStatus = builder.asrAnnotationStatus;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.intentAnnotationStatus = builder.intentAnnotationStatus;
            this.modifiedTime = builder.modifiedTime;
            this.occurTime = builder.occurTime;
            this.originalAsrResult = builder.originalAsrResult;
            this.sequenceId = builder.sequenceId;
            this.subStatus = builder.subStatus;
            this.tagAnnotationStatus = builder.tagAnnotationStatus;
            this.translationError = builder.translationError;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatList create() {
            return builder().build();
        }

        /**
         * @return annotationAsrResult
         */
        public String getAnnotationAsrResult() {
            return this.annotationAsrResult;
        }

        /**
         * @return annotationMissionChatCustomizationDataInfoList
         */
        public java.util.List<AnnotationMissionChatCustomizationDataInfoList> getAnnotationMissionChatCustomizationDataInfoList() {
            return this.annotationMissionChatCustomizationDataInfoList;
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatIntentUserSayInfoList
         */
        public java.util.List<AnnotationMissionChatIntentUserSayInfoList> getAnnotationMissionChatIntentUserSayInfoList() {
            return this.annotationMissionChatIntentUserSayInfoList;
        }

        /**
         * @return annotationMissionChatTagInfoList
         */
        public java.util.List<AnnotationMissionChatTagInfoList> getAnnotationMissionChatTagInfoList() {
            return this.annotationMissionChatTagInfoList;
        }

        /**
         * @return annotationMissionChatVocabularyInfoList
         */
        public java.util.List<AnnotationMissionChatVocabularyInfoList> getAnnotationMissionChatVocabularyInfoList() {
            return this.annotationMissionChatVocabularyInfoList;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return annotationStatus
         */
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return asrAnnotationStatus
         */
        public Integer getAsrAnnotationStatus() {
            return this.asrAnnotationStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intentAnnotationStatus
         */
        public Integer getIntentAnnotationStatus() {
            return this.intentAnnotationStatus;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return occurTime
         */
        public Long getOccurTime() {
            return this.occurTime;
        }

        /**
         * @return originalAsrResult
         */
        public String getOriginalAsrResult() {
            return this.originalAsrResult;
        }

        /**
         * @return sequenceId
         */
        public String getSequenceId() {
            return this.sequenceId;
        }

        /**
         * @return subStatus
         */
        public Integer getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return tagAnnotationStatus
         */
        public Integer getTagAnnotationStatus() {
            return this.tagAnnotationStatus;
        }

        /**
         * @return translationError
         */
        public Integer getTranslationError() {
            return this.translationError;
        }

        public static final class Builder {
            private String annotationAsrResult; 
            private java.util.List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList; 
            private String annotationMissionChatId; 
            private java.util.List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList; 
            private java.util.List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList; 
            private java.util.List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private Integer annotationStatus; 
            private String answer; 
            private Integer asrAnnotationStatus; 
            private Long createTime; 
            private String instanceId; 
            private Integer intentAnnotationStatus; 
            private Long modifiedTime; 
            private Long occurTime; 
            private String originalAsrResult; 
            private String sequenceId; 
            private Integer subStatus; 
            private Integer tagAnnotationStatus; 
            private Integer translationError; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatList model) {
                this.annotationAsrResult = model.annotationAsrResult;
                this.annotationMissionChatCustomizationDataInfoList = model.annotationMissionChatCustomizationDataInfoList;
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatIntentUserSayInfoList = model.annotationMissionChatIntentUserSayInfoList;
                this.annotationMissionChatTagInfoList = model.annotationMissionChatTagInfoList;
                this.annotationMissionChatVocabularyInfoList = model.annotationMissionChatVocabularyInfoList;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.annotationStatus = model.annotationStatus;
                this.answer = model.answer;
                this.asrAnnotationStatus = model.asrAnnotationStatus;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.intentAnnotationStatus = model.intentAnnotationStatus;
                this.modifiedTime = model.modifiedTime;
                this.occurTime = model.occurTime;
                this.originalAsrResult = model.originalAsrResult;
                this.sequenceId = model.sequenceId;
                this.subStatus = model.subStatus;
                this.tagAnnotationStatus = model.tagAnnotationStatus;
                this.translationError = model.translationError;
            } 

            /**
             * AnnotationAsrResult.
             */
            public Builder annotationAsrResult(String annotationAsrResult) {
                this.annotationAsrResult = annotationAsrResult;
                return this;
            }

            /**
             * AnnotationMissionChatCustomizationDataInfoList.
             */
            public Builder annotationMissionChatCustomizationDataInfoList(java.util.List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList) {
                this.annotationMissionChatCustomizationDataInfoList = annotationMissionChatCustomizationDataInfoList;
                return this;
            }

            /**
             * <p>chat id</p>
             * 
             * <strong>example:</strong>
             * <p>40669e52-c1c8-487f-9593-29749086bdc9</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * AnnotationMissionChatIntentUserSayInfoList.
             */
            public Builder annotationMissionChatIntentUserSayInfoList(java.util.List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList) {
                this.annotationMissionChatIntentUserSayInfoList = annotationMissionChatIntentUserSayInfoList;
                return this;
            }

            /**
             * AnnotationMissionChatTagInfoList.
             */
            public Builder annotationMissionChatTagInfoList(java.util.List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList) {
                this.annotationMissionChatTagInfoList = annotationMissionChatTagInfoList;
                return this;
            }

            /**
             * AnnotationMissionChatVocabularyInfoList.
             */
            public Builder annotationMissionChatVocabularyInfoList(java.util.List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList) {
                this.annotationMissionChatVocabularyInfoList = annotationMissionChatVocabularyInfoList;
                return this;
            }

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AnnotationMissionSessionId.
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * AnnotationStatus.
             */
            public Builder annotationStatus(Integer annotationStatus) {
                this.annotationStatus = annotationStatus;
                return this;
            }

            /**
             * Answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * AsrAnnotationStatus.
             */
            public Builder asrAnnotationStatus(Integer asrAnnotationStatus) {
                this.asrAnnotationStatus = asrAnnotationStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * IntentAnnotationStatus.
             */
            public Builder intentAnnotationStatus(Integer intentAnnotationStatus) {
                this.intentAnnotationStatus = intentAnnotationStatus;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OccurTime.
             */
            public Builder occurTime(Long occurTime) {
                this.occurTime = occurTime;
                return this;
            }

            /**
             * OriginalAsrResult.
             */
            public Builder originalAsrResult(String originalAsrResult) {
                this.originalAsrResult = originalAsrResult;
                return this;
            }

            /**
             * SequenceId.
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * SubStatus.
             */
            public Builder subStatus(Integer subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * TagAnnotationStatus.
             */
            public Builder tagAnnotationStatus(Integer tagAnnotationStatus) {
                this.tagAnnotationStatus = tagAnnotationStatus;
                return this;
            }

            /**
             * TranslationError.
             */
            public Builder translationError(Integer translationError) {
                this.translationError = translationError;
                return this;
            }

            public AnnotationMissionChatList build() {
                return new AnnotationMissionChatList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionSessionResponseBody</p>
     */
    public static class AnnotationMissionSessionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatList")
        private java.util.List<AnnotationMissionChatList> annotationMissionChatList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationStatus")
        private Integer annotationStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DebugConversation")
        private Boolean debugConversation;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private AnnotationMissionSessionList(Builder builder) {
            this.annotationMissionChatList = builder.annotationMissionChatList;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.annotationStatus = builder.annotationStatus;
            this.createTime = builder.createTime;
            this.debugConversation = builder.debugConversation;
            this.instanceId = builder.instanceId;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.modifiedTime = builder.modifiedTime;
            this.scriptId = builder.scriptId;
            this.sessionId = builder.sessionId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionSessionList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatList
         */
        public java.util.List<AnnotationMissionChatList> getAnnotationMissionChatList() {
            return this.annotationMissionChatList;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return annotationStatus
         */
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return debugConversation
         */
        public Boolean getDebugConversation() {
            return this.debugConversation;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<AnnotationMissionChatList> annotationMissionChatList; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private Integer annotationStatus; 
            private Long createTime; 
            private Boolean debugConversation; 
            private String instanceId; 
            private String jobGroupId; 
            private String jobId; 
            private Long modifiedTime; 
            private String scriptId; 
            private String sessionId; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(AnnotationMissionSessionList model) {
                this.annotationMissionChatList = model.annotationMissionChatList;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.annotationStatus = model.annotationStatus;
                this.createTime = model.createTime;
                this.debugConversation = model.debugConversation;
                this.instanceId = model.instanceId;
                this.jobGroupId = model.jobGroupId;
                this.jobId = model.jobId;
                this.modifiedTime = model.modifiedTime;
                this.scriptId = model.scriptId;
                this.sessionId = model.sessionId;
                this.version = model.version;
            } 

            /**
             * AnnotationMissionChatList.
             */
            public Builder annotationMissionChatList(java.util.List<AnnotationMissionChatList> annotationMissionChatList) {
                this.annotationMissionChatList = annotationMissionChatList;
                return this;
            }

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>64ba5ac9-a4e1-4333-b03c-9d4a588c9f6c</p>
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * AnnotationStatus.
             */
            public Builder annotationStatus(Integer annotationStatus) {
                this.annotationStatus = annotationStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DebugConversation.
             */
            public Builder debugConversation(Boolean debugConversation) {
                this.debugConversation = debugConversation;
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
             * JobGroupId.
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public AnnotationMissionSessionList build() {
                return new AnnotationMissionSessionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnnotationMissionSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnnotationMissionSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionList")
        private java.util.List<AnnotationMissionSessionList> annotationMissionSessionList;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionList = builder.annotationMissionSessionList;
            this.message = builder.message;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionList
         */
        public java.util.List<AnnotationMissionSessionList> getAnnotationMissionSessionList() {
            return this.annotationMissionSessionList;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String annotationMissionId; 
            private java.util.List<AnnotationMissionSessionList> annotationMissionSessionList; 
            private String message; 
            private Boolean success; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionList = model.annotationMissionSessionList;
                this.message = model.message;
                this.success = model.success;
                this.totalCount = model.totalCount;
            } 

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AnnotationMissionSessionList.
             */
            public Builder annotationMissionSessionList(java.util.List<AnnotationMissionSessionList> annotationMissionSessionList) {
                this.annotationMissionSessionList = annotationMissionSessionList;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
