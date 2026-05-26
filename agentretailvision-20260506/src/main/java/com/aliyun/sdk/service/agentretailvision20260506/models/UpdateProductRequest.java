// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

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
 * {@link UpdateProductRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductRequest</p>
 */
public class UpdateProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraImages")
    private java.util.List<String> extraImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTitle")
    private String imageTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemUniqueId")
    private String itemUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainImage")
    private java.util.List<String> mainImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiViewImages")
    private java.util.List<MultiViewImages> multiViewImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformItemId")
    private String platformItemId;

    private UpdateProductRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.extraImages = builder.extraImages;
        this.imageTitle = builder.imageTitle;
        this.itemUniqueId = builder.itemUniqueId;
        this.mainImage = builder.mainImage;
        this.multiViewImages = builder.multiViewImages;
        this.platformItemId = builder.platformItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return extraImages
     */
    public java.util.List<String> getExtraImages() {
        return this.extraImages;
    }

    /**
     * @return imageTitle
     */
    public String getImageTitle() {
        return this.imageTitle;
    }

    /**
     * @return itemUniqueId
     */
    public String getItemUniqueId() {
        return this.itemUniqueId;
    }

    /**
     * @return mainImage
     */
    public java.util.List<String> getMainImage() {
        return this.mainImage;
    }

    /**
     * @return multiViewImages
     */
    public java.util.List<MultiViewImages> getMultiViewImages() {
        return this.multiViewImages;
    }

    /**
     * @return platformItemId
     */
    public String getPlatformItemId() {
        return this.platformItemId;
    }

    public static final class Builder extends Request.Builder<UpdateProductRequest, Builder> {
        private String deviceId; 
        private java.util.List<String> extraImages; 
        private String imageTitle; 
        private String itemUniqueId; 
        private java.util.List<String> mainImage; 
        private java.util.List<MultiViewImages> multiViewImages; 
        private String platformItemId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.extraImages = request.extraImages;
            this.imageTitle = request.imageTitle;
            this.itemUniqueId = request.itemUniqueId;
            this.mainImage = request.mainImage;
            this.multiViewImages = request.multiViewImages;
            this.platformItemId = request.platformItemId;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * ExtraImages.
         */
        public Builder extraImages(java.util.List<String> extraImages) {
            String extraImagesShrink = shrink(extraImages, "ExtraImages", "json");
            this.putQueryParameter("ExtraImages", extraImagesShrink);
            this.extraImages = extraImages;
            return this;
        }

        /**
         * ImageTitle.
         */
        public Builder imageTitle(String imageTitle) {
            this.putQueryParameter("ImageTitle", imageTitle);
            this.imageTitle = imageTitle;
            return this;
        }

        /**
         * ItemUniqueId.
         */
        public Builder itemUniqueId(String itemUniqueId) {
            this.putQueryParameter("ItemUniqueId", itemUniqueId);
            this.itemUniqueId = itemUniqueId;
            return this;
        }

        /**
         * MainImage.
         */
        public Builder mainImage(java.util.List<String> mainImage) {
            String mainImageShrink = shrink(mainImage, "MainImage", "json");
            this.putQueryParameter("MainImage", mainImageShrink);
            this.mainImage = mainImage;
            return this;
        }

        /**
         * MultiViewImages.
         */
        public Builder multiViewImages(java.util.List<MultiViewImages> multiViewImages) {
            String multiViewImagesShrink = shrink(multiViewImages, "MultiViewImages", "json");
            this.putQueryParameter("MultiViewImages", multiViewImagesShrink);
            this.multiViewImages = multiViewImages;
            return this;
        }

        /**
         * PlatformItemId.
         */
        public Builder platformItemId(String platformItemId) {
            this.putQueryParameter("PlatformItemId", platformItemId);
            this.platformItemId = platformItemId;
            return this;
        }

        @Override
        public UpdateProductRequest build() {
            return new UpdateProductRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProductRequest} extends {@link TeaModel}
     *
     * <p>UpdateProductRequest</p>
     */
    public static class MultiViewImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private String angle;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private MultiViewImages(Builder builder) {
            this.angle = builder.angle;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiViewImages create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public String getAngle() {
            return this.angle;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String angle; 
            private String url; 

            private Builder() {
            } 

            private Builder(MultiViewImages model) {
                this.angle = model.angle;
                this.url = model.url;
            } 

            /**
             * Angle.
             */
            public Builder angle(String angle) {
                this.angle = angle;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public MultiViewImages build() {
                return new MultiViewImages(this);
            } 

        } 

    }
}
