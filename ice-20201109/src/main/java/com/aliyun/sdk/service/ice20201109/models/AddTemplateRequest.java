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
         * <ul>
         * <li>The Config parameter for standard templates is an encapsulation based on the cloud editing timeline. Custom template configurations are more flexible. If you have special requirements, familiarize yourself with the Config structure and customize the template. For more information, see <a href="https://help.aliyun.com/document_detail/456193.html">Config details for standard templates</a>.</li>
         * <li>For more Config examples, see <a href="https://help.aliyun.com/document_detail/451634.html">Common Config examples for standard templates</a>.</li>
         * <li>For the Config settings of one-click video generation templates, see <a href="https://help.aliyun.com/document_detail/2878274.html">Metric description for one-click video generation template configuration</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>See Config documentation</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The URL of the template cover.</p>
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
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TemplateName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The media asset ID of the template preview video.</p>
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
         * <p>The media assets associated with the template. This parameter is used by the standard template editor.</p>
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
         * <li>OpenAPI: Created by calling an API operation.</li>
         * <li>AliyunConsole: Created in the Alibaba Cloud Management Console.</li>
         * <li>WebSDK: Created by using WebSDK.</li>
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
         * <p>The template status. Valid values:</p>
         * <ul>
         * <li>Available: Normal.</li>
         * <li>Created: Created but unavailable.</li>
         * <li>Uploading: Uploading.</li>
         * <li>Processing: Analyzing the advanced template.</li>
         * <li>UploadFailed: Upload failed.</li>
         * <li>ProcessFailed: Advanced template analysis failed.</li>
         * </ul>
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
         * <p>The templatetype. Valid values:  </p>
         * <ul>
         * <li>Timeline: standard template. It is created based on the timeline of a video clip project, where multiple materials are spliced across multiple layers. It supports effects such as text-to-video, photo albums, intros and outros, and default watermarks.</li>
         * <li>VETemplate: advanced template. It is created based on Adobe After Effects (AE) effects to achieve advanced media effects with complex motion graphics.</li>
         * <li>BatchEditing: one-click video generation template. It supports parameters such as sticker watermarks, background music, background images, voiceover subtitle styles, title subtitle styles, and output resolution. These parameters are automatically applied when a one-click video generation node is committed.</li>
         * </ul>
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
