// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    private GetTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateResponseBody create() {
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
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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

        public GetTemplateResponseBody build() {
            return new GetTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipsParam")
        private String clipsParam;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreateSource")
        private String createSource;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedSource")
        private String modifiedSource;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PreviewMedia")
        private String previewMedia;

        @com.aliyun.core.annotation.NameInMap("PreviewMediaStatus")
        private String previewMediaStatus;

        @com.aliyun.core.annotation.NameInMap("RelatedMediaids")
        private String relatedMediaids;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Template(Builder builder) {
            this.clipsParam = builder.clipsParam;
            this.config = builder.config;
            this.coverURL = builder.coverURL;
            this.createSource = builder.createSource;
            this.creationTime = builder.creationTime;
            this.modifiedSource = builder.modifiedSource;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.previewMedia = builder.previewMedia;
            this.previewMediaStatus = builder.previewMediaStatus;
            this.relatedMediaids = builder.relatedMediaids;
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
         * @return clipsParam
         */
        public String getClipsParam() {
            return this.clipsParam;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return createSource
         */
        public String getCreateSource() {
            return this.createSource;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return modifiedSource
         */
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return previewMediaStatus
         */
        public String getPreviewMediaStatus() {
            return this.previewMediaStatus;
        }

        /**
         * @return relatedMediaids
         */
        public String getRelatedMediaids() {
            return this.relatedMediaids;
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
            private String clipsParam; 
            private String config; 
            private String coverURL; 
            private String createSource; 
            private String creationTime; 
            private String modifiedSource; 
            private String modifiedTime; 
            private String name; 
            private String previewMedia; 
            private String previewMediaStatus; 
            private String relatedMediaids; 
            private String status; 
            private String templateId; 
            private String type; 

            /**
             * <p>The clip parameters for submitting a video production job. You can replace mediaId and text with real values to submit a job. References:</p>
             * <ul>
             * <li><a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a></li>
             * <li><a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Media1&quot;:&quot;mediaId&quot;,&quot;Text1&quot;:&quot;text&quot;}</p>
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
                return this;
            }

            /**
             * <p>The template configurations.</p>
             * <ul>
             * <li>For more information about the configurations of a regular template, see <a href="https://help.aliyun.com/document_detail/456193.html">Config object of a regular template</a>.</li>
             * <li>For more information about the configurations of an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>参考Timeline模板配置详解</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The thumbnail URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The source from which the template was created. Valid values:</p>
             * <ul>
             * <li>AliyunConsole</li>
             * <li>OpenAPI</li>
             * <li>WebSDK</li>
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
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T04:11:10Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The source from which the template was modified. Valid values:</p>
             * <ul>
             * <li>AliyunConsole</li>
             * <li>OpenAPI</li>
             * <li>WebSDK</li>
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
             * <p>The time when the template was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T04:11:10Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * <p>The preview media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder previewMedia(String previewMedia) {
                this.previewMedia = previewMedia;
                return this;
            }

            /**
             * <p>The state of the preview media asset. Valid values:</p>
             * <ul>
             * <li>Init: the initial state, which indicates that the source file is not ready.</li>
             * <li>Preparing: The source file is being prepared. For example, the file is being uploaded or edited.</li>
             * <li>PrepareFail: The source file failed to be prepared. For example, the information about the source file failed to be obtained.</li>
             * <li>Normal: The source file is ready.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder previewMediaStatus(String previewMediaStatus) {
                this.previewMediaStatus = previewMediaStatus;
                return this;
            }

            /**
             * <p>The IDs of the materials associated with the template for use by the regular template editor.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;video&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;],&quot;audio&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;],&quot;image&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;]}</p>
             */
            public Builder relatedMediaids(String relatedMediaids) {
                this.relatedMediaids = relatedMediaids;
                return this;
            }

            /**
             * <p>The template state. Valid values:</p>
             * <ul>
             * <li>Available</li>
             * <li>Created</li>
             * <li>Uploading</li>
             * <li>Processing</li>
             * <li>UploadFailed</li>
             * <li>ProcessFailed</li>
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
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template type. Valid values:</p>
             * <ul>
             * <li>Timeline</li>
             * <li>VETemplate</li>
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
