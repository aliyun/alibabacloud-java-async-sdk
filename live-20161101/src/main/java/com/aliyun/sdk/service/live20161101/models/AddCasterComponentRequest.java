// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterComponentRequest} extends {@link RequestModel}
 *
 * <p>AddCasterComponentRequest</p>
 */
public class AddCasterComponentRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CaptionLayerContent")
    private String captionLayerContent;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("ComponentLayer")
    @Validation(required = true)
    private String componentLayer;

    @Query
    @NameInMap("ComponentName")
    private String componentName;

    @Query
    @NameInMap("ComponentType")
    @Validation(required = true)
    private String componentType;

    @Query
    @NameInMap("Effect")
    private String effect;

    @Query
    @NameInMap("HtmlLayerContent")
    private String htmlLayerContent;

    @Query
    @NameInMap("ImageLayerContent")
    private String imageLayerContent;

    @Query
    @NameInMap("LayerOrder")
    private String layerOrder;

    @Query
    @NameInMap("LocationId")
    @Validation(required = true)
    private String locationId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TextLayerContent")
    private String textLayerContent;

    private AddCasterComponentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.captionLayerContent = builder.captionLayerContent;
        this.casterId = builder.casterId;
        this.componentLayer = builder.componentLayer;
        this.componentName = builder.componentName;
        this.componentType = builder.componentType;
        this.effect = builder.effect;
        this.htmlLayerContent = builder.htmlLayerContent;
        this.imageLayerContent = builder.imageLayerContent;
        this.layerOrder = builder.layerOrder;
        this.locationId = builder.locationId;
        this.ownerId = builder.ownerId;
        this.textLayerContent = builder.textLayerContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterComponentRequest create() {
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
     * @return captionLayerContent
     */
    public String getCaptionLayerContent() {
        return this.captionLayerContent;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return componentLayer
     */
    public String getComponentLayer() {
        return this.componentLayer;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return componentType
     */
    public String getComponentType() {
        return this.componentType;
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return htmlLayerContent
     */
    public String getHtmlLayerContent() {
        return this.htmlLayerContent;
    }

    /**
     * @return imageLayerContent
     */
    public String getImageLayerContent() {
        return this.imageLayerContent;
    }

    /**
     * @return layerOrder
     */
    public String getLayerOrder() {
        return this.layerOrder;
    }

    /**
     * @return locationId
     */
    public String getLocationId() {
        return this.locationId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return textLayerContent
     */
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

    public static final class Builder extends Request.Builder<AddCasterComponentRequest, Builder> {
        private String regionId; 
        private String captionLayerContent; 
        private String casterId; 
        private String componentLayer; 
        private String componentName; 
        private String componentType; 
        private String effect; 
        private String htmlLayerContent; 
        private String imageLayerContent; 
        private String layerOrder; 
        private String locationId; 
        private Long ownerId; 
        private String textLayerContent; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterComponentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.captionLayerContent = request.captionLayerContent;
            this.casterId = request.casterId;
            this.componentLayer = request.componentLayer;
            this.componentName = request.componentName;
            this.componentType = request.componentType;
            this.effect = request.effect;
            this.htmlLayerContent = request.htmlLayerContent;
            this.imageLayerContent = request.imageLayerContent;
            this.layerOrder = request.layerOrder;
            this.locationId = request.locationId;
            this.ownerId = request.ownerId;
            this.textLayerContent = request.textLayerContent;
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
         * CaptionLayerContent.
         */
        public Builder captionLayerContent(String captionLayerContent) {
            this.putQueryParameter("CaptionLayerContent", captionLayerContent);
            this.captionLayerContent = captionLayerContent;
            return this;
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
         * ComponentLayer.
         */
        public Builder componentLayer(String componentLayer) {
            this.putQueryParameter("ComponentLayer", componentLayer);
            this.componentLayer = componentLayer;
            return this;
        }

        /**
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * ComponentType.
         */
        public Builder componentType(String componentType) {
            this.putQueryParameter("ComponentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * Effect.
         */
        public Builder effect(String effect) {
            this.putQueryParameter("Effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * HtmlLayerContent.
         */
        public Builder htmlLayerContent(String htmlLayerContent) {
            this.putQueryParameter("HtmlLayerContent", htmlLayerContent);
            this.htmlLayerContent = htmlLayerContent;
            return this;
        }

        /**
         * ImageLayerContent.
         */
        public Builder imageLayerContent(String imageLayerContent) {
            this.putQueryParameter("ImageLayerContent", imageLayerContent);
            this.imageLayerContent = imageLayerContent;
            return this;
        }

        /**
         * LayerOrder.
         */
        public Builder layerOrder(String layerOrder) {
            this.putQueryParameter("LayerOrder", layerOrder);
            this.layerOrder = layerOrder;
            return this;
        }

        /**
         * LocationId.
         */
        public Builder locationId(String locationId) {
            this.putQueryParameter("LocationId", locationId);
            this.locationId = locationId;
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
         * TextLayerContent.
         */
        public Builder textLayerContent(String textLayerContent) {
            this.putQueryParameter("TextLayerContent", textLayerContent);
            this.textLayerContent = textLayerContent;
            return this;
        }

        @Override
        public AddCasterComponentRequest build() {
            return new AddCasterComponentRequest(this);
        } 

    } 

}
