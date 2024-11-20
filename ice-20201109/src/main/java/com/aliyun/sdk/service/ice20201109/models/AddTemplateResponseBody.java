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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The template information.</p>
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
             * <p>The template configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>参见Timeline模板Config文档</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The URL of the template thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>The source from which the template was created.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AliyunConsole</li>
             * <li>WebSDK</li>
             * <li>OpenAPI</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI</p>
             */
            public Builder createSource(String createSource) {
                this.createSource = createSource;
                return this;
            }

            /**
             * <p>The source from which the template was modified.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AliyunConsole</li>
             * <li>WebSDK</li>
             * <li>OpenAPI</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI</p>
             */
            public Builder modifiedSource(String modifiedSource) {
                this.modifiedSource = modifiedSource;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>视频添加水印模板</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the preview video.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
             */
            public Builder previewMedia(String previewMedia) {
                this.previewMedia = previewMedia;
                return this;
            }

            /**
             * <p>The template state.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>UploadFailed: Failed to upload the video.</li>
             * <li>ProcessFailed: Failed to process the advanced template.</li>
             * <li>Available: The template is available.</li>
             * <li>Uploading: The video is being uploaded.</li>
             * <li>Created: The template is created but not ready for use.</li>
             * <li>Processing: The advanced template is being processed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Timeline: regular template.</li>
             * <li>VETemplate: advanced template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Timeline</p>
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
