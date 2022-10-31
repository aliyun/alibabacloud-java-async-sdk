// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStudioLayoutRequest} extends {@link RequestModel}
 *
 * <p>ModifyStudioLayoutRequest</p>
 */
public class ModifyStudioLayoutRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BgImageConfig")
    private String bgImageConfig;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("CommonConfig")
    private String commonConfig;

    @Query
    @NameInMap("LayerOrderConfigList")
    private String layerOrderConfigList;

    @Query
    @NameInMap("LayoutId")
    @Validation(required = true)
    private String layoutId;

    @Query
    @NameInMap("LayoutName")
    private String layoutName;

    @Query
    @NameInMap("MediaInputConfigList")
    private String mediaInputConfigList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ScreenInputConfigList")
    private String screenInputConfigList;

    private ModifyStudioLayoutRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bgImageConfig = builder.bgImageConfig;
        this.casterId = builder.casterId;
        this.commonConfig = builder.commonConfig;
        this.layerOrderConfigList = builder.layerOrderConfigList;
        this.layoutId = builder.layoutId;
        this.layoutName = builder.layoutName;
        this.mediaInputConfigList = builder.mediaInputConfigList;
        this.ownerId = builder.ownerId;
        this.screenInputConfigList = builder.screenInputConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStudioLayoutRequest create() {
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
     * @return bgImageConfig
     */
    public String getBgImageConfig() {
        return this.bgImageConfig;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return commonConfig
     */
    public String getCommonConfig() {
        return this.commonConfig;
    }

    /**
     * @return layerOrderConfigList
     */
    public String getLayerOrderConfigList() {
        return this.layerOrderConfigList;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return layoutName
     */
    public String getLayoutName() {
        return this.layoutName;
    }

    /**
     * @return mediaInputConfigList
     */
    public String getMediaInputConfigList() {
        return this.mediaInputConfigList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return screenInputConfigList
     */
    public String getScreenInputConfigList() {
        return this.screenInputConfigList;
    }

    public static final class Builder extends Request.Builder<ModifyStudioLayoutRequest, Builder> {
        private String regionId; 
        private String bgImageConfig; 
        private String casterId; 
        private String commonConfig; 
        private String layerOrderConfigList; 
        private String layoutId; 
        private String layoutName; 
        private String mediaInputConfigList; 
        private Long ownerId; 
        private String screenInputConfigList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStudioLayoutRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bgImageConfig = request.bgImageConfig;
            this.casterId = request.casterId;
            this.commonConfig = request.commonConfig;
            this.layerOrderConfigList = request.layerOrderConfigList;
            this.layoutId = request.layoutId;
            this.layoutName = request.layoutName;
            this.mediaInputConfigList = request.mediaInputConfigList;
            this.ownerId = request.ownerId;
            this.screenInputConfigList = request.screenInputConfigList;
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
         * BgImageConfig.
         */
        public Builder bgImageConfig(String bgImageConfig) {
            this.putQueryParameter("BgImageConfig", bgImageConfig);
            this.bgImageConfig = bgImageConfig;
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
         * CommonConfig.
         */
        public Builder commonConfig(String commonConfig) {
            this.putQueryParameter("CommonConfig", commonConfig);
            this.commonConfig = commonConfig;
            return this;
        }

        /**
         * LayerOrderConfigList.
         */
        public Builder layerOrderConfigList(String layerOrderConfigList) {
            this.putQueryParameter("LayerOrderConfigList", layerOrderConfigList);
            this.layerOrderConfigList = layerOrderConfigList;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * LayoutName.
         */
        public Builder layoutName(String layoutName) {
            this.putQueryParameter("LayoutName", layoutName);
            this.layoutName = layoutName;
            return this;
        }

        /**
         * MediaInputConfigList.
         */
        public Builder mediaInputConfigList(String mediaInputConfigList) {
            this.putQueryParameter("MediaInputConfigList", mediaInputConfigList);
            this.mediaInputConfigList = mediaInputConfigList;
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
         * ScreenInputConfigList.
         */
        public Builder screenInputConfigList(String screenInputConfigList) {
            this.putQueryParameter("ScreenInputConfigList", screenInputConfigList);
            this.screenInputConfigList = screenInputConfigList;
            return this;
        }

        @Override
        public ModifyStudioLayoutRequest build() {
            return new ModifyStudioLayoutRequest(this);
        } 

    } 

}
