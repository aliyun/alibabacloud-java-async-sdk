// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    public static class TranscodeTemplateHint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BitrateControlType")
        private String bitrateControlType;

        private TranscodeTemplateHint(Builder builder) {
            this.bitrateControlType = builder.bitrateControlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTemplateHint create() {
            return builder().build();
        }

        /**
         * @return bitrateControlType
         */
        public String getBitrateControlType() {
            return this.bitrateControlType;
        }

        public static final class Builder {
            private String bitrateControlType; 

            /**
             * BitrateControlType.
             */
            public Builder bitrateControlType(String bitrateControlType) {
                this.bitrateControlType = bitrateControlType;
                return this;
            }

            public TranscodeTemplateHint build() {
                return new TranscodeTemplateHint(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomTemplateResponseBody</p>
     */
    public static class FrontendHint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateHint")
        private TranscodeTemplateHint transcodeTemplateHint;

        private FrontendHint(Builder builder) {
            this.transcodeTemplateHint = builder.transcodeTemplateHint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrontendHint create() {
            return builder().build();
        }

        /**
         * @return transcodeTemplateHint
         */
        public TranscodeTemplateHint getTranscodeTemplateHint() {
            return this.transcodeTemplateHint;
        }

        public static final class Builder {
            private TranscodeTemplateHint transcodeTemplateHint; 

            /**
             * TranscodeTemplateHint.
             */
            public Builder transcodeTemplateHint(TranscodeTemplateHint transcodeTemplateHint) {
                this.transcodeTemplateHint = transcodeTemplateHint;
                return this;
            }

            public FrontendHint build() {
                return new FrontendHint(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("FrontendHint")
        private FrontendHint frontendHint;

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
            this.frontendHint = builder.frontendHint;
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
         * @return frontendHint
         */
        public FrontendHint getFrontendHint() {
            return this.frontendHint;
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
            private FrontendHint frontendHint; 
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
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-01T10:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FrontendHint.
             */
            public Builder frontendHint(FrontendHint frontendHint) {
                this.frontendHint = frontendHint;
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
             * <p>2022-01-01T11:00:00Z</p>
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
             * <p>The subtype ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subtype(Integer subtype) {
                this.subtype = subtype;
                return this;
            }

            /**
             * <p>The subtype name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder subtypeName(String subtypeName) {
                this.subtypeName = subtypeName;
                return this;
            }

            /**
             * <p>The template parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Type&quot;:&quot;Normal&quot;,&quot;FrameType&quot;:&quot;normal&quot;,&quot;Time&quot;:0,&quot;Count&quot;:10}</p>
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
             * <p>测试转码模板</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The type name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>SnapshotTemplate</p>
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
