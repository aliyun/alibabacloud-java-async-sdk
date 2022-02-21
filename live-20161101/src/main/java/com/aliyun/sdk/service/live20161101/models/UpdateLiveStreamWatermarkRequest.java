// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveStreamWatermarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveStreamWatermarkRequest</p>
 */
public class UpdateLiveStreamWatermarkRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Height")
    private Integer height;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OffsetCorner")
    private String offsetCorner;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PictureUrl")
    private String pictureUrl;

    @Query
    @NameInMap("RefHeight")
    private Integer refHeight;

    @Query
    @NameInMap("RefWidth")
    private Integer refWidth;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Query
    @NameInMap("Transparency")
    private Integer transparency;

    @Query
    @NameInMap("XOffset")
    private Float XOffset;

    @Query
    @NameInMap("YOffset")
    private Float YOffset;

    private UpdateLiveStreamWatermarkRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.height = builder.height;
        this.name = builder.name;
        this.offsetCorner = builder.offsetCorner;
        this.ownerId = builder.ownerId;
        this.pictureUrl = builder.pictureUrl;
        this.refHeight = builder.refHeight;
        this.refWidth = builder.refWidth;
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
        this.transparency = builder.transparency;
        this.XOffset = builder.XOffset;
        this.YOffset = builder.YOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveStreamWatermarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return transparency
     */
    public Integer getTransparency() {
        return this.transparency;
    }

    /**
     * @return XOffset
     */
    public Float getXOffset() {
        return this.XOffset;
    }

    /**
     * @return YOffset
     */
    public Float getYOffset() {
        return this.YOffset;
    }

    public static final class Builder extends Request.Builder<UpdateLiveStreamWatermarkRequest, Builder> {
        private String description; 
        private Integer height; 
        private String name; 
        private String offsetCorner; 
        private Long ownerId; 
        private String pictureUrl; 
        private Integer refHeight; 
        private Integer refWidth; 
        private String regionId; 
        private String templateId; 
        private Integer transparency; 
        private Float XOffset; 
        private Float YOffset; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveStreamWatermarkRequest response) {
            super(response);
            this.description = response.description;
            this.height = response.height;
            this.name = response.name;
            this.offsetCorner = response.offsetCorner;
            this.ownerId = response.ownerId;
            this.pictureUrl = response.pictureUrl;
            this.refHeight = response.refHeight;
            this.refWidth = response.refWidth;
            this.regionId = response.regionId;
            this.templateId = response.templateId;
            this.transparency = response.transparency;
            this.XOffset = response.XOffset;
            this.YOffset = response.YOffset;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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

        /**
         * Transparency.
         */
        public Builder transparency(Integer transparency) {
            this.putQueryParameter("Transparency", transparency);
            this.transparency = transparency;
            return this;
        }

        /**
         * XOffset.
         */
        public Builder XOffset(Float XOffset) {
            this.putQueryParameter("XOffset", XOffset);
            this.XOffset = XOffset;
            return this;
        }

        /**
         * YOffset.
         */
        public Builder YOffset(Float YOffset) {
            this.putQueryParameter("YOffset", YOffset);
            this.YOffset = YOffset;
            return this;
        }

        @Override
        public UpdateLiveStreamWatermarkRequest build() {
            return new UpdateLiveStreamWatermarkRequest(this);
        } 

    } 

}
