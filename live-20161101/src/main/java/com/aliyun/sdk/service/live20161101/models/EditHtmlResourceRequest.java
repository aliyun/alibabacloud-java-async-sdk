// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditHtmlResourceRequest} extends {@link RequestModel}
 *
 * <p>EditHtmlResourceRequest</p>
 */
public class EditHtmlResourceRequest extends Request {
    @Query
    @NameInMap("CasterId")
    private String casterId;

    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("HtmlResourceId")
    private String htmlResourceId;

    @Query
    @NameInMap("HtmlUrl")
    private String htmlUrl;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("htmlContent")
    private String htmlContent;

    private EditHtmlResourceRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.config = builder.config;
        this.htmlResourceId = builder.htmlResourceId;
        this.htmlUrl = builder.htmlUrl;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.htmlContent = builder.htmlContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditHtmlResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return htmlResourceId
     */
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

    /**
     * @return htmlUrl
     */
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return htmlContent
     */
    public String getHtmlContent() {
        return this.htmlContent;
    }

    public static final class Builder extends Request.Builder<EditHtmlResourceRequest, Builder> {
        private String casterId; 
        private String config; 
        private String htmlResourceId; 
        private String htmlUrl; 
        private Long ownerId; 
        private String regionId; 
        private String htmlContent; 

        private Builder() {
            super();
        } 

        private Builder(EditHtmlResourceRequest response) {
            super(response);
            this.casterId = response.casterId;
            this.config = response.config;
            this.htmlResourceId = response.htmlResourceId;
            this.htmlUrl = response.htmlUrl;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.htmlContent = response.htmlContent;
        } 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * HtmlResourceId.
         */
        public Builder htmlResourceId(String htmlResourceId) {
            this.putQueryParameter("HtmlResourceId", htmlResourceId);
            this.htmlResourceId = htmlResourceId;
            return this;
        }

        /**
         * HtmlUrl.
         */
        public Builder htmlUrl(String htmlUrl) {
            this.putQueryParameter("HtmlUrl", htmlUrl);
            this.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * htmlContent.
         */
        public Builder htmlContent(String htmlContent) {
            this.putQueryParameter("htmlContent", htmlContent);
            this.htmlContent = htmlContent;
            return this;
        }

        @Override
        public EditHtmlResourceRequest build() {
            return new EditHtmlResourceRequest(this);
        } 

    } 

}
