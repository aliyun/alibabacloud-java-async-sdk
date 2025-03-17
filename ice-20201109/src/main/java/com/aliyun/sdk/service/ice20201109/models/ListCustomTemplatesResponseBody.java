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
 * {@link ListCustomTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomTemplatesResponseBody</p>
 */
public class ListCustomTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomTemplateList")
    private java.util.List<CustomTemplateList> customTemplateList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListCustomTemplatesResponseBody(Builder builder) {
        this.customTemplateList = builder.customTemplateList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customTemplateList
     */
    public java.util.List<CustomTemplateList> getCustomTemplateList() {
        return this.customTemplateList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<CustomTemplateList> customTemplateList; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListCustomTemplatesResponseBody model) {
            this.customTemplateList = model.customTemplateList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The queried templates.</p>
         */
        public Builder customTemplateList(java.util.List<CustomTemplateList> customTemplateList) {
            this.customTemplateList = customTemplateList;
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

        /**
         * <p>The total number of templates.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListCustomTemplatesResponseBody build() {
            return new ListCustomTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomTemplatesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TranscodeTemplateHint model) {
                this.bitrateControlType = model.bitrateControlType;
            } 

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
     * {@link ListCustomTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomTemplatesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(FrontendHint model) {
                this.transcodeTemplateHint = model.transcodeTemplateHint;
            } 

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
     * {@link ListCustomTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomTemplatesResponseBody</p>
     */
    public static class CustomTemplateList extends TeaModel {
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

        private CustomTemplateList(Builder builder) {
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

        public static CustomTemplateList create() {
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

            private Builder() {
            } 

            private Builder(CustomTemplateList model) {
                this.createTime = model.createTime;
                this.frontendHint = model.frontendHint;
                this.isDefault = model.isDefault;
                this.modifiedTime = model.modifiedTime;
                this.status = model.status;
                this.subtype = model.subtype;
                this.subtypeName = model.subtypeName;
                this.templateConfig = model.templateConfig;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.type = model.type;
                this.typeName = model.typeName;
            } 

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:17:54Z</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
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
             * <p>2022-07-12T16:17:54Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The template state.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * </ul>
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
             * <p>2</p>
             */
            public Builder subtype(Integer subtype) {
                this.subtype = subtype;
                return this;
            }

            /**
             * <p>The subtype name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>AudioTranscode</p>
             */
            public Builder subtypeName(String subtypeName) {
                this.subtypeName = subtypeName;
                return this;
            }

            /**
             * <p>The template parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;mp3&quot;},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;mp3&quot;,&quot;Bitrate&quot;:&quot;64&quot;,&quot;Samplerate&quot;:&quot;22050&quot;,&quot;Channels&quot;:&quot;2&quot;}}</p>
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

            public CustomTemplateList build() {
                return new CustomTemplateList(this);
            } 

        } 

    }
}
