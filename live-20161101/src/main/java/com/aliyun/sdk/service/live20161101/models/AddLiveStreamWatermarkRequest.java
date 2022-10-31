// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveStreamWatermarkRequest} extends {@link RequestModel}
 *
 * <p>AddLiveStreamWatermarkRequest</p>
 */
public class AddLiveStreamWatermarkRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Height")
    @Validation(required = true)
    private Integer height;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OffsetCorner")
    @Validation(required = true)
    private String offsetCorner;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PictureUrl")
    @Validation(required = true)
    private String pictureUrl;

    @Query
    @NameInMap("RefHeight")
    @Validation(required = true)
    private Integer refHeight;

    @Query
    @NameInMap("RefWidth")
    @Validation(required = true)
    private Integer refWidth;

    @Query
    @NameInMap("Transparency")
    @Validation(required = true)
    private Integer transparency;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    @Query
    @NameInMap("XOffset")
    @Validation(required = true)
    private Float xOffset;

    @Query
    @NameInMap("YOffset")
    @Validation(required = true)
    private Float yOffset;

    private AddLiveStreamWatermarkRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.height = builder.height;
        this.name = builder.name;
        this.offsetCorner = builder.offsetCorner;
        this.ownerId = builder.ownerId;
        this.pictureUrl = builder.pictureUrl;
        this.refHeight = builder.refHeight;
        this.refWidth = builder.refWidth;
        this.transparency = builder.transparency;
        this.type = builder.type;
        this.xOffset = builder.xOffset;
        this.yOffset = builder.yOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveStreamWatermarkRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return offsetCorner
     */
    public String getOffsetCorner() {
        return this.offsetCorner;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pictureUrl
     */
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    /**
     * @return refHeight
     */
    public Integer getRefHeight() {
        return this.refHeight;
    }

    /**
     * @return refWidth
     */
    public Integer getRefWidth() {
        return this.refWidth;
    }

    /**
     * @return transparency
     */
    public Integer getTransparency() {
        return this.transparency;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return xOffset
     */
    public Float getXOffset() {
        return this.xOffset;
    }

    /**
     * @return yOffset
     */
    public Float getYOffset() {
        return this.yOffset;
    }

    public static final class Builder extends Request.Builder<AddLiveStreamWatermarkRequest, Builder> {
        private String regionId; 
        private String description; 
        private Integer height; 
        private String name; 
        private String offsetCorner; 
        private Long ownerId; 
        private String pictureUrl; 
        private Integer refHeight; 
        private Integer refWidth; 
        private Integer transparency; 
        private Integer type; 
        private Float xOffset; 
        private Float yOffset; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveStreamWatermarkRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.height = request.height;
            this.name = request.name;
            this.offsetCorner = request.offsetCorner;
            this.ownerId = request.ownerId;
            this.pictureUrl = request.pictureUrl;
            this.refHeight = request.refHeight;
            this.refWidth = request.refWidth;
            this.transparency = request.transparency;
            this.type = request.type;
            this.xOffset = request.xOffset;
            this.yOffset = request.yOffset;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Integer height) {
            this.putQueryParameter("Height", height);
            this.height = height;
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
         * OffsetCorner.
         */
        public Builder offsetCorner(String offsetCorner) {
            this.putQueryParameter("OffsetCorner", offsetCorner);
            this.offsetCorner = offsetCorner;
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
         * PictureUrl.
         */
        public Builder pictureUrl(String pictureUrl) {
            this.putQueryParameter("PictureUrl", pictureUrl);
            this.pictureUrl = pictureUrl;
            return this;
        }

        /**
         * RefHeight.
         */
        public Builder refHeight(Integer refHeight) {
            this.putQueryParameter("RefHeight", refHeight);
            this.refHeight = refHeight;
            return this;
        }

        /**
         * RefWidth.
         */
        public Builder refWidth(Integer refWidth) {
            this.putQueryParameter("RefWidth", refWidth);
            this.refWidth = refWidth;
            return this;
        }

        /**
         * Transparency.
         */
        public Builder transparency(Integer transparency) {
            this.putQueryParameter("Transparency", transparency);
            this.transparency = transparency;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * XOffset.
         */
        public Builder xOffset(Float xOffset) {
            this.putQueryParameter("XOffset", xOffset);
            this.xOffset = xOffset;
            return this;
        }

        /**
         * YOffset.
         */
        public Builder yOffset(Float yOffset) {
            this.putQueryParameter("YOffset", yOffset);
            this.yOffset = yOffset;
            return this;
        }

        @Override
        public AddLiveStreamWatermarkRequest build() {
            return new AddLiveStreamWatermarkRequest(this);
        } 

    } 

}
