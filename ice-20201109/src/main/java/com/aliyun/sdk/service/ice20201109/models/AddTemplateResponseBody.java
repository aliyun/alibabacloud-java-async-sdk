// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>AddTemplateResponseBody</p>
 */
public class AddTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    private AddTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String requestId; 
        private Template template; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        public AddTemplateResponseBody build() {
            return new AddTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>AddTemplateResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("CreateSource")
        private String createSource;

        @com.aliyun.core.annotation.NameInMap("ModifiedSource")
        private String modifiedSource;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PreviewMedia")
        private String previewMedia;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Template(Builder builder) {
            this.config = builder.config;
            this.coverUrl = builder.coverUrl;
            this.createSource = builder.createSource;
            this.modifiedSource = builder.modifiedSource;
            this.name = builder.name;
            this.previewMedia = builder.previewMedia;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return createSource
         */
        public String getCreateSource() {
            return this.createSource;
        }

        /**
         * @return modifiedSource
         */
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return previewMedia
         */
        public String getPreviewMedia() {
            return this.previewMedia;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String coverUrl; 
            private String createSource; 
            private String modifiedSource; 
            private String name; 
            private String previewMedia; 
            private String status; 
            private String templateId; 
            private String type; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * CreateSource.
             */
            public Builder createSource(String createSource) {
                this.createSource = createSource;
                return this;
            }

            /**
             * ModifiedSource.
             */
            public Builder modifiedSource(String modifiedSource) {
                this.modifiedSource = modifiedSource;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PreviewMedia.
             */
            public Builder previewMedia(String previewMedia) {
                this.previewMedia = previewMedia;
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
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
