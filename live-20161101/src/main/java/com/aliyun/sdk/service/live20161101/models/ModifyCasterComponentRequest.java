// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterComponentRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterComponentRequest</p>
 */
public class ModifyCasterComponentRequest extends Request {
    @Query
    @NameInMap("CaptionLayerContent")
    private String captionLayerContent;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("ComponentId")
    @Validation(required = true)
    private String componentId;

    @Query
    @NameInMap("ComponentLayer")
    private String componentLayer;

    @Query
    @NameInMap("ComponentName")
    private String componentName;

    @Query
    @NameInMap("ComponentType")
    private String componentType;

    @Query
    @NameInMap("Effect")
    private String effect;

    @Query
    @NameInMap("ImageLayerContent")
    private String imageLayerContent;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TextLayerContent")
    private String textLayerContent;

    private ModifyCasterComponentRequest(Builder builder) {
        super(builder);
        this.captionLayerContent = builder.captionLayerContent;
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.componentLayer = builder.componentLayer;
        this.componentName = builder.componentName;
        this.componentType = builder.componentType;
        this.effect = builder.effect;
        this.imageLayerContent = builder.imageLayerContent;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.textLayerContent = builder.textLayerContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterComponentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
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
     * @return imageLayerContent
     */
    public String getImageLayerContent() {
        return this.imageLayerContent;
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
     * @return textLayerContent
     */
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

    public static final class Builder extends Request.Builder<ModifyCasterComponentRequest, Builder> {
        private String captionLayerContent; 
        private String casterId; 
        private String componentId; 
        private String componentLayer; 
        private String componentName; 
        private String componentType; 
        private String effect; 
        private String imageLayerContent; 
        private Long ownerId; 
        private String regionId; 
        private String textLayerContent; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterComponentRequest response) {
            super(response);
            this.captionLayerContent = response.captionLayerContent;
            this.casterId = response.casterId;
            this.componentId = response.componentId;
            this.componentLayer = response.componentLayer;
            this.componentName = response.componentName;
            this.componentType = response.componentType;
            this.effect = response.effect;
            this.imageLayerContent = response.imageLayerContent;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.textLayerContent = response.textLayerContent;
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
         * ComponentId.
         */
        public Builder componentId(String componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
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
         * ImageLayerContent.
         */
        public Builder imageLayerContent(String imageLayerContent) {
            this.putQueryParameter("ImageLayerContent", imageLayerContent);
            this.imageLayerContent = imageLayerContent;
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
         * TextLayerContent.
         */
        public Builder textLayerContent(String textLayerContent) {
            this.putQueryParameter("TextLayerContent", textLayerContent);
            this.textLayerContent = textLayerContent;
            return this;
        }

        @Override
        public ModifyCasterComponentRequest build() {
            return new ModifyCasterComponentRequest(this);
        } 

    } 

}
