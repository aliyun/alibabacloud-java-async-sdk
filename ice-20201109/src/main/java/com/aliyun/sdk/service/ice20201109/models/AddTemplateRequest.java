// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddTemplateRequest</p>
 */
public class AddTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AddTemplateRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.coverUrl = builder.coverUrl;
        this.name = builder.name;
        this.previewMedia = builder.previewMedia;
        this.relatedMediaids = builder.relatedMediaids;
        this.source = builder.source;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTemplateRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddTemplateRequest, Builder> {
        private String config; 
        private String coverUrl; 
        private String name; 
        private String previewMedia; 
        private String relatedMediaids; 
        private String source; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddTemplateRequest request) {
            super(request);
            this.config = request.config;
            this.coverUrl = request.coverUrl;
            this.name = request.name;
            this.previewMedia = request.previewMedia;
            this.relatedMediaids = request.relatedMediaids;
            this.source = request.source;
            this.status = request.status;
            this.type = request.type;
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
         * <p>The name of the custom template.</p>
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
         * <p>The ID of the template preview video.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
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
         * <p>{&quot;video&quot;:[&quot;1805a0c6ca544fb395a06ca683619655&quot;]}</p>
         */
        public Builder relatedMediaids(String relatedMediaids) {
            this.putQueryParameter("RelatedMediaids", relatedMediaids);
            this.relatedMediaids = relatedMediaids;
            return this;
        }

        /**
         * <p>The source from which the template is created. Valid values:</p>
         * <ul>
         * <li>OpenAPI</li>
         * <li>AliyunConsole</li>
         * <li>WebSDK</li>
         * </ul>
         * <!---->
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
         * <!---->
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
         * <p>The template type. Valid values:</p>
         * <ul>
         * <li>Timeline: a regular template created based on the timeline of a video editing project, in which multiple materials are arranged in sequence across multiple layers. It can be used to convert text and images into videos, create photo albums, add opening and closing parts, and apply the default watermark.</li>
         * <li>VETemplate: an advanced template created using effects of Adobe After Effects (AE). It can be used to produce complex animations and advanced media effects.</li>
         * </ul>
         * <!---->
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddTemplateRequest build() {
            return new AddTemplateRequest(this);
        } 

    } 

}
