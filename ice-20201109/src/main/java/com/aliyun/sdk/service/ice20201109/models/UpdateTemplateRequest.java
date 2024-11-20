// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewMedia")
    private String previewMedia;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedMediaids")
    private String relatedMediaids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.coverUrl = builder.coverUrl;
        this.name = builder.name;
        this.previewMedia = builder.previewMedia;
        this.relatedMediaids = builder.relatedMediaids;
        this.source = builder.source;
        this.status = builder.status;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return relatedMediaids
     */
    public String getRelatedMediaids() {
        return this.relatedMediaids;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
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

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String config; 
        private String coverUrl; 
        private String name; 
        private String previewMedia; 
        private String relatedMediaids; 
        private String source; 
        private String status; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest request) {
            super(request);
            this.config = request.config;
            this.coverUrl = request.coverUrl;
            this.name = request.name;
            this.previewMedia = request.previewMedia;
            this.relatedMediaids = request.relatedMediaids;
            this.source = request.source;
            this.status = request.status;
            this.templateId = request.templateId;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
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
            this.putQueryParameter("CoverUrl", coverUrl);
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * <p>The name of the online editing template.</p>
         * 
         * <strong>example:</strong>
         * <p>视频添加水印模板</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the preview video.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder previewMedia(String previewMedia) {
            this.putQueryParameter("PreviewMedia", previewMedia);
            this.previewMedia = previewMedia;
            return this;
        }

        /**
         * <p>The IDs of the materials associated with the template for use by the regular template editor.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;video&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;,&quot;<strong><strong><strong>cb7db64841b159b4f2ea</strong></strong></strong>&quot;],&quot;audio&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;],&quot;image&quot;:[&quot;<strong><strong><strong>c04f1d4a06996144cc1a</strong></strong></strong>&quot;]}</p>
         */
        public Builder relatedMediaids(String relatedMediaids) {
            this.putQueryParameter("RelatedMediaids", relatedMediaids);
            this.relatedMediaids = relatedMediaids;
            return this;
        }

        /**
         * <p>The source from which the template is modified. Default value: OpenAPI. Valid values:</p>
         * <ul>
         * <li>AliyunConsole</li>
         * <li>OpenAPI</li>
         * <li>WebSDK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The template state. Valid values:</p>
         * <ul>
         * <li>Available: The template is available.</li>
         * <li>Created: The template is created but not ready for use.</li>
         * <li>Uploading: The video is being uploaded.</li>
         * <li>Processing: The advanced template is being processed.</li>
         * <li>UploadFailed: Failed to upload the video.</li>
         * <li>ProcessFailed: Failed to process the advanced template.</li>
         * </ul>
         * <blockquote>
         * <p> After an advanced template is created, it enters the Processing state. In this case, the template is unavailable. The template can be used only when it is in the Available state. The time required for template processing varies based on the size of the template file. Generally, it ranges from 10 seconds to 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the online editing template. You can obtain the template ID in the <a href="https://ice.console.aliyun.com/production/template/list/common">Intelligent Media Services (IMS) console</a> or the response parameters of the <a href="https://help.aliyun.com/document_detail/441161.html">AddTemplate</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
