// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCustomTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomTemplateResponseBody</p>
 */
public class GetCustomTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomTemplate")
    private CustomTemplate customTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCustomTemplateResponseBody(Builder builder) {
        this.customTemplate = builder.customTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return customTemplate
     */
    public CustomTemplate getCustomTemplate() {
        return this.customTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomTemplate customTemplate; 
        private String requestId; 

        /**
         * CustomTemplate.
         */
        public Builder customTemplate(CustomTemplate customTemplate) {
            this.customTemplate = customTemplate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCustomTemplateResponseBody build() {
            return new GetCustomTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomTemplateResponseBody</p>
     */
    public static class CustomTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Subtype")
        private Integer subtype;

        @com.aliyun.core.annotation.NameInMap("SubtypeName")
        private String subtypeName;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private String templateConfig;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private CustomTemplate(Builder builder) {
            this.createTime = builder.createTime;
            this.isDefault = builder.isDefault;
            this.modifiedTime = builder.modifiedTime;
            this.status = builder.status;
            this.subtype = builder.subtype;
            this.subtypeName = builder.subtypeName;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.type = builder.type;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomTemplate create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subtype
         */
        public Integer getSubtype() {
            return this.subtype;
        }

        /**
         * @return subtypeName
         */
        public String getSubtypeName() {
            return this.subtypeName;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
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

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean isDefault; 
            private String modifiedTime; 
            private String status; 
            private Integer subtype; 
            private String subtypeName; 
            private String templateConfig; 
            private String templateId; 
            private String templateName; 
            private Integer type; 
            private String typeName; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * Subtype.
             */
            public Builder subtype(Integer subtype) {
                this.subtype = subtype;
                return this;
            }

            /**
             * SubtypeName.
             */
            public Builder subtypeName(String subtypeName) {
                this.subtypeName = subtypeName;
                return this;
            }

            /**
             * TemplateConfig.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * TypeName.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public CustomTemplate build() {
                return new CustomTemplate(this);
            } 

        } 

    }
}
