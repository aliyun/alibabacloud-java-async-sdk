// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSystemTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetSystemTemplateResponseBody</p>
 */
public class GetSystemTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemTemplate")
    private SystemTemplate systemTemplate;

    private GetSystemTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemTemplate = builder.systemTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSystemTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemTemplate
     */
    public SystemTemplate getSystemTemplate() {
        return this.systemTemplate;
    }

    public static final class Builder {
        private String requestId; 
        private SystemTemplate systemTemplate; 

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
         * <p>The template information.</p>
         */
        public Builder systemTemplate(SystemTemplate systemTemplate) {
            this.systemTemplate = systemTemplate;
            return this;
        }

        public GetSystemTemplateResponseBody build() {
            return new GetSystemTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSystemTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetSystemTemplateResponseBody</p>
     */
    public static class SystemTemplate extends TeaModel {
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

        private SystemTemplate(Builder builder) {
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

        public static SystemTemplate create() {
            return builder().build();
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
            private String status; 
            private Integer subtype; 
            private String subtypeName; 
            private String templateConfig; 
            private String templateId; 
            private String templateName; 
            private Integer type; 
            private String typeName; 

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
             * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;m3u8&quot;},&quot;TransConfig&quot;:{&quot;TransMode&quot;:&quot;onepass&quot;},&quot;Video&quot;:{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Maxrate&quot;:8000,&quot;Preset&quot;:&quot;medium&quot;,&quot;PixFmt&quot;:&quot;yuv420p&quot;,&quot;Width&quot;:2048,&quot;Bitrate&quot;:3500},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;aac&quot;,&quot;Bitrate&quot;:160,&quot;Samplerate&quot;:44100,&quot;Channels&quot;:2}}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S00000001-100060</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>M3U8-2K</p>
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

            public SystemTemplate build() {
                return new SystemTemplate(this);
            } 

        } 

    }
}
