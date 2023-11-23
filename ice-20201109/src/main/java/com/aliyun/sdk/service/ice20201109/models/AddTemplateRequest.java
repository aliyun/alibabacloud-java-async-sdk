// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddTemplateRequest</p>
 */
public class AddTemplateRequest extends Request {
    @Body
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("CoverUrl")
    private String coverUrl;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PreviewMedia")
    private String previewMedia;

    @Query
    @NameInMap("RelatedMediaids")
    private String relatedMediaids;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
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
         * Type.
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
