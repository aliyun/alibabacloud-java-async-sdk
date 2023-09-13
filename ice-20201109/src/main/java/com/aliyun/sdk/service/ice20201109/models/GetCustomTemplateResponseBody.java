// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomTemplateResponseBody</p>
 */
public class GetCustomTemplateResponseBody extends TeaModel {
    @NameInMap("CustomTemplate")
    private CustomTemplate customTemplate;

    @NameInMap("RequestId")
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

    public static class CustomTemplate extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Subtype")
        private Integer subtype;

        @NameInMap("SubtypeName")
        private String subtypeName;

        @NameInMap("TemplateConfig")
        private String templateConfig;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("TypeName")
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
