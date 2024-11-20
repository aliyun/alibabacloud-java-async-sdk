// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomTemplateResponseBody</p>
 */
public class CreateCustomTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomTemplate")
    private CustomTemplate customTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomTemplateResponseBody(Builder builder) {
        this.customTemplate = builder.customTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomTemplateResponseBody create() {
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
         * <p>The template information.</p>
         */
        public Builder customTemplate(CustomTemplate customTemplate) {
            this.customTemplate = customTemplate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomTemplateResponseBody build() {
            return new CreateCustomTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomTemplateResponseBody</p>
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
        private String subtype;

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
        public String getSubtype() {
            return this.subtype;
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
            private String subtype; 
            private String templateConfig; 
            private String templateId; 
            private String templateName; 
            private Integer type; 
            private String typeName; 

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-19T02:04:31Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the template is the default template.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The time when the template was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-19T02:04:31Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The template state.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subtype name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Remux</p>
             */
            public Builder subtype(String subtype) {
                this.subtype = subtype;
                return this;
            }

            /**
             * <p>The template configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;flv&quot;},&quot;Video&quot;:{},&quot;Audio&quot;:{}}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The type name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>TranscodeTemplate</p>
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
