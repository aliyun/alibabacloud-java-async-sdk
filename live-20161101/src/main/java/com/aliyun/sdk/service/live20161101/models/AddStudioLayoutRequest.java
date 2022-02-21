// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddStudioLayoutRequest} extends {@link RequestModel}
 *
 * <p>AddStudioLayoutRequest</p>
 */
public class AddStudioLayoutRequest extends Request {
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
    @NameInMap("LayoutName")
    @Validation(required = true)
    private String layoutName;

    @Query
    @NameInMap("LayoutType")
    @Validation(required = true)
    private String layoutType;

    @Query
    @NameInMap("MediaInputConfigList")
    private String mediaInputConfigList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ScreenInputConfigList")
    private String screenInputConfigList;

    private AddStudioLayoutRequest(Builder builder) {
        super(builder);
        this.bgImageConfig = builder.bgImageConfig;
        this.casterId = builder.casterId;
        this.commonConfig = builder.commonConfig;
        this.layerOrderConfigList = builder.layerOrderConfigList;
        this.layoutName = builder.layoutName;
        this.layoutType = builder.layoutType;
        this.mediaInputConfigList = builder.mediaInputConfigList;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.screenInputConfigList = builder.screenInputConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStudioLayoutRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return layoutName
     */
    public String getLayoutName() {
        return this.layoutName;
    }

    /**
     * @return layoutType
     */
    public String getLayoutType() {
        return this.layoutType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return screenInputConfigList
     */
    public String getScreenInputConfigList() {
        return this.screenInputConfigList;
    }

    public static final class Builder extends Request.Builder<AddStudioLayoutRequest, Builder> {
        private String bgImageConfig; 
        private String casterId; 
        private String commonConfig; 
        private String layerOrderConfigList; 
        private String layoutName; 
        private String layoutType; 
        private String mediaInputConfigList; 
        private Long ownerId; 
        private String regionId; 
        private String screenInputConfigList; 

        private Builder() {
            super();
        } 

        private Builder(AddStudioLayoutRequest response) {
            super(response);
            this.bgImageConfig = response.bgImageConfig;
            this.casterId = response.casterId;
            this.commonConfig = response.commonConfig;
            this.layerOrderConfigList = response.layerOrderConfigList;
            this.layoutName = response.layoutName;
            this.layoutType = response.layoutType;
            this.mediaInputConfigList = response.mediaInputConfigList;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.screenInputConfigList = response.screenInputConfigList;
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
         * LayoutName.
         */
        public Builder layoutName(String layoutName) {
            this.putQueryParameter("LayoutName", layoutName);
            this.layoutName = layoutName;
            return this;
        }

        /**
         * LayoutType.
         */
        public Builder layoutType(String layoutType) {
            this.putQueryParameter("LayoutType", layoutType);
            this.layoutType = layoutType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public AddStudioLayoutRequest build() {
            return new AddStudioLayoutRequest(this);
        } 

    } 

}
