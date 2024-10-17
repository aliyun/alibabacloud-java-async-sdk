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
         * CoverUrl.
         */
        public Builder coverUrl(String coverUrl) {
            this.putQueryParameter("CoverUrl", coverUrl);
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PreviewMedia.
         */
        public Builder previewMedia(String previewMedia) {
            this.putQueryParameter("PreviewMedia", previewMedia);
            this.previewMedia = previewMedia;
            return this;
        }

        /**
         * RelatedMediaids.
         */
        public Builder relatedMediaids(String relatedMediaids) {
            this.putQueryParameter("RelatedMediaids", relatedMediaids);
            this.relatedMediaids = relatedMediaids;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TemplateId.
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
