// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>TemplateListResponseBody</p>
 */
public class TemplateListResponseBody extends TeaModel {
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

    private TemplateListResponseBody(Builder builder) {
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

    public static TemplateListResponseBody create() {
        return builder().build();
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
        private Long code; 
        private String message; 
        private java.util.List < Model> model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

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

        public TemplateListResponseBody build() {
            return new TemplateListResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntentTags")
        private java.util.List < java.util.Map<String, ?>> intentTags;

        @com.aliyun.core.annotation.NameInMap("PersonalityTags")
        private java.util.List < String > personalityTags;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Long templateType;

        private Model(Builder builder) {
            this.intentTags = builder.intentTags;
            this.personalityTags = builder.personalityTags;
            this.properties = builder.properties;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return intentTags
         */
        public java.util.List < java.util.Map<String, ?>> getIntentTags() {
            return this.intentTags;
        }

        /**
         * @return personalityTags
         */
        public java.util.List < String > getPersonalityTags() {
            return this.personalityTags;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public Long getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> intentTags; 
            private java.util.List < String > personalityTags; 
            private String properties; 
            private Long templateId; 
            private String templateName; 
            private Long templateType; 

            /**
             * 意向标签
             */
            public Builder intentTags(java.util.List < java.util.Map<String, ?>> intentTags) {
                this.intentTags = intentTags;
                return this;
            }

            /**
             * 个性标签
             */
            public Builder personalityTags(java.util.List < String > personalityTags) {
                this.personalityTags = personalityTags;
                return this;
            }

            /**
             * 话术所需参数
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * AI话术ID
             */
            public Builder templateId(Long templateId) {
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

            /**
             * 模板类型
             */
            public Builder templateType(Long templateType) {
                this.templateType = templateType;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
