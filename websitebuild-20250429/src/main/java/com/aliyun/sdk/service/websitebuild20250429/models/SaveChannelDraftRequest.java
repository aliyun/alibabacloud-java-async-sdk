// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link SaveChannelDraftRequest} extends {@link RequestModel}
 *
 * <p>SaveChannelDraftRequest</p>
 */
public class SaveChannelDraftRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdaptedContent")
    private String adaptedContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdaptedTitle")
    private String adaptedTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverImages")
    private java.util.List<CoverImages> coverImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String draftId;

    private SaveChannelDraftRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adaptedContent = builder.adaptedContent;
        this.adaptedTitle = builder.adaptedTitle;
        this.coverImages = builder.coverImages;
        this.draftId = builder.draftId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveChannelDraftRequest create() {
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
     * @return adaptedContent
     */
    public String getAdaptedContent() {
        return this.adaptedContent;
    }

    /**
     * @return adaptedTitle
     */
    public String getAdaptedTitle() {
        return this.adaptedTitle;
    }

    /**
     * @return coverImages
     */
    public java.util.List<CoverImages> getCoverImages() {
        return this.coverImages;
    }

    /**
     * @return draftId
     */
    public String getDraftId() {
        return this.draftId;
    }

    public static final class Builder extends Request.Builder<SaveChannelDraftRequest, Builder> {
        private String regionId; 
        private String adaptedContent; 
        private String adaptedTitle; 
        private java.util.List<CoverImages> coverImages; 
        private String draftId; 

        private Builder() {
            super();
        } 

        private Builder(SaveChannelDraftRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adaptedContent = request.adaptedContent;
            this.adaptedTitle = request.adaptedTitle;
            this.coverImages = request.coverImages;
            this.draftId = request.draftId;
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
         * AdaptedContent.
         */
        public Builder adaptedContent(String adaptedContent) {
            this.putQueryParameter("AdaptedContent", adaptedContent);
            this.adaptedContent = adaptedContent;
            return this;
        }

        /**
         * AdaptedTitle.
         */
        public Builder adaptedTitle(String adaptedTitle) {
            this.putQueryParameter("AdaptedTitle", adaptedTitle);
            this.adaptedTitle = adaptedTitle;
            return this;
        }

        /**
         * CoverImages.
         */
        public Builder coverImages(java.util.List<CoverImages> coverImages) {
            String coverImagesShrink = shrink(coverImages, "CoverImages", "json");
            this.putQueryParameter("CoverImages", coverImagesShrink);
            this.coverImages = coverImages;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25a3c26a-291e-46e2-d039-dde037ff64a2<code>curl NUINwwKl.popscan.xaliyun.com</code></p>
         */
        public Builder draftId(String draftId) {
            this.putQueryParameter("DraftId", draftId);
            this.draftId = draftId;
            return this;
        }

        @Override
        public SaveChannelDraftRequest build() {
            return new SaveChannelDraftRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveChannelDraftRequest} extends {@link TeaModel}
     *
     * <p>SaveChannelDraftRequest</p>
     */
    public static class CoverImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("MaterialFileId")
        private String materialFileId;

        @com.aliyun.core.annotation.NameInMap("SortOrder")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer sortOrder;

        private CoverImages(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.materialFileId = builder.materialFileId;
            this.sortOrder = builder.sortOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverImages create() {
            return builder().build();
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return materialFileId
         */
        public String getMaterialFileId() {
            return this.materialFileId;
        }

        /**
         * @return sortOrder
         */
        public Integer getSortOrder() {
            return this.sortOrder;
        }

        public static final class Builder {
            private String imageUrl; 
            private String materialFileId; 
            private Integer sortOrder; 

            private Builder() {
            } 

            private Builder(CoverImages model) {
                this.imageUrl = model.imageUrl;
                this.materialFileId = model.materialFileId;
                this.sortOrder = model.sortOrder;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * MaterialFileId.
             */
            public Builder materialFileId(String materialFileId) {
                this.materialFileId = materialFileId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Ascending</p>
             */
            public Builder sortOrder(Integer sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            public CoverImages build() {
                return new CoverImages(this);
            } 

        } 

    }
}
