// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaInfoRequest</p>
 */
public class UpdateMediaInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppendTags")
    private Boolean appendTags;

    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("CateId")
    private Long cateId;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("CoverURL")
    private String coverURL;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InputURL")
    private String inputURL;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("MediaTags")
    private String mediaTags;

    @Query
    @NameInMap("ReferenceId")
    private String referenceId;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("UserData")
    private String userData;

    private UpdateMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appendTags = builder.appendTags;
        this.businessType = builder.businessType;
        this.cateId = builder.cateId;
        this.category = builder.category;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.inputURL = builder.inputURL;
        this.mediaId = builder.mediaId;
        this.mediaTags = builder.mediaTags;
        this.referenceId = builder.referenceId;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appendTags
     */
    public Boolean getAppendTags() {
        return this.appendTags;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputURL
     */
    public String getInputURL() {
        return this.inputURL;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaTags
     */
    public String getMediaTags() {
        return this.mediaTags;
    }

    /**
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UpdateMediaInfoRequest, Builder> {
        private String regionId; 
        private Boolean appendTags; 
        private String businessType; 
        private Long cateId; 
        private String category; 
        private String coverURL; 
        private String description; 
        private String inputURL; 
        private String mediaId; 
        private String mediaTags; 
        private String referenceId; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appendTags = request.appendTags;
            this.businessType = request.businessType;
            this.cateId = request.cateId;
            this.category = request.category;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.inputURL = request.inputURL;
            this.mediaId = request.mediaId;
            this.mediaTags = request.mediaTags;
            this.referenceId = request.referenceId;
            this.title = request.title;
            this.userData = request.userData;
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
         * AppendTags.
         */
        public Builder appendTags(Boolean appendTags) {
            this.putQueryParameter("AppendTags", appendTags);
            this.appendTags = appendTags;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * CateId.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * CoverURL.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InputURL.
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MediaTags.
         */
        public Builder mediaTags(String mediaTags) {
            this.putQueryParameter("MediaTags", mediaTags);
            this.mediaTags = mediaTags;
            return this;
        }

        /**
         * ReferenceId.
         */
        public Builder referenceId(String referenceId) {
            this.putQueryParameter("ReferenceId", referenceId);
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public UpdateMediaInfoRequest build() {
            return new UpdateMediaInfoRequest(this);
        } 

    } 

}
