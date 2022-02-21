// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterLayoutRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterLayoutRequest</p>
 */
public class ModifyCasterLayoutRequest extends Request {
    @Query
    @NameInMap("AudioLayer")
    @Validation(required = true)
    private java.util.List < AudioLayer> audioLayer;

    @Query
    @NameInMap("BlendList")
    @Validation(required = true)
    private java.util.List < String > blendList;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("LayoutId")
    @Validation(required = true)
    private String layoutId;

    @Query
    @NameInMap("MixList")
    @Validation(required = true)
    private java.util.List < String > mixList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VideoLayer")
    @Validation(required = true)
    private java.util.List < VideoLayer> videoLayer;

    private ModifyCasterLayoutRequest(Builder builder) {
        super(builder);
        this.audioLayer = builder.audioLayer;
        this.blendList = builder.blendList;
        this.casterId = builder.casterId;
        this.layoutId = builder.layoutId;
        this.mixList = builder.mixList;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.videoLayer = builder.videoLayer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterLayoutRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioLayer
     */
    public java.util.List < AudioLayer> getAudioLayer() {
        return this.audioLayer;
    }

    /**
     * @return blendList
     */
    public java.util.List < String > getBlendList() {
        return this.blendList;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return mixList
     */
    public java.util.List < String > getMixList() {
        return this.mixList;
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
     * @return videoLayer
     */
    public java.util.List < VideoLayer> getVideoLayer() {
        return this.videoLayer;
    }

    public static final class Builder extends Request.Builder<ModifyCasterLayoutRequest, Builder> {
        private java.util.List < AudioLayer> audioLayer; 
        private java.util.List < String > blendList; 
        private String casterId; 
        private String layoutId; 
        private java.util.List < String > mixList; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List < VideoLayer> videoLayer; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterLayoutRequest response) {
            super(response);
            this.audioLayer = response.audioLayer;
            this.blendList = response.blendList;
            this.casterId = response.casterId;
            this.layoutId = response.layoutId;
            this.mixList = response.mixList;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.videoLayer = response.videoLayer;
        } 

        /**
         * AudioLayer.
         */
        public Builder audioLayer(java.util.List < AudioLayer> audioLayer) {
            this.putQueryParameter("AudioLayer", audioLayer);
            this.audioLayer = audioLayer;
            return this;
        }

        /**
         * BlendList.
         */
        public Builder blendList(java.util.List < String > blendList) {
            this.putQueryParameter("BlendList", blendList);
            this.blendList = blendList;
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
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * MixList.
         */
        public Builder mixList(java.util.List < String > mixList) {
            this.putQueryParameter("MixList", mixList);
            this.mixList = mixList;
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
         * VideoLayer.
         */
        public Builder videoLayer(java.util.List < VideoLayer> videoLayer) {
            this.putQueryParameter("VideoLayer", videoLayer);
            this.videoLayer = videoLayer;
            return this;
        }

        @Override
        public ModifyCasterLayoutRequest build() {
            return new ModifyCasterLayoutRequest(this);
        } 

    } 

    public static class AudioLayer extends TeaModel {
        @NameInMap("FixedDelayDuration")
        private Integer fixedDelayDuration;

        @NameInMap("ValidChannel")
        private String validChannel;

        @NameInMap("VolumeRate")
        private Float volumeRate;

        private AudioLayer(Builder builder) {
            this.fixedDelayDuration = builder.fixedDelayDuration;
            this.validChannel = builder.validChannel;
            this.volumeRate = builder.volumeRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioLayer create() {
            return builder().build();
        }

        /**
         * @return fixedDelayDuration
         */
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        /**
         * @return validChannel
         */
        public String getValidChannel() {
            return this.validChannel;
        }

        /**
         * @return volumeRate
         */
        public Float getVolumeRate() {
            return this.volumeRate;
        }

        public static final class Builder {
            private Integer fixedDelayDuration; 
            private String validChannel; 
            private Float volumeRate; 

            /**
             * FixedDelayDuration.
             */
            public Builder fixedDelayDuration(Integer fixedDelayDuration) {
                this.fixedDelayDuration = fixedDelayDuration;
                return this;
            }

            /**
             * ValidChannel.
             */
            public Builder validChannel(String validChannel) {
                this.validChannel = validChannel;
                return this;
            }

            /**
             * VolumeRate.
             */
            public Builder volumeRate(Float volumeRate) {
                this.volumeRate = volumeRate;
                return this;
            }

            public AudioLayer build() {
                return new AudioLayer(this);
            } 

        } 

    }
    public static class VideoLayer extends TeaModel {
        @NameInMap("FillMode")
        private String fillMode;

        @NameInMap("FixedDelayDuration")
        private Integer fixedDelayDuration;

        @NameInMap("HeightNormalized")
        private Float heightNormalized;

        @NameInMap("PositionNormalized")
        private java.util.List < Float > positionNormalized;

        @NameInMap("PositionRefer")
        private String positionRefer;

        @NameInMap("WidthNormalized")
        private Float widthNormalized;

        private VideoLayer(Builder builder) {
            this.fillMode = builder.fillMode;
            this.fixedDelayDuration = builder.fixedDelayDuration;
            this.heightNormalized = builder.heightNormalized;
            this.positionNormalized = builder.positionNormalized;
            this.positionRefer = builder.positionRefer;
            this.widthNormalized = builder.widthNormalized;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoLayer create() {
            return builder().build();
        }

        /**
         * @return fillMode
         */
        public String getFillMode() {
            return this.fillMode;
        }

        /**
         * @return fixedDelayDuration
         */
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        /**
         * @return heightNormalized
         */
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        /**
         * @return positionNormalized
         */
        public java.util.List < Float > getPositionNormalized() {
            return this.positionNormalized;
        }

        /**
         * @return positionRefer
         */
        public String getPositionRefer() {
            return this.positionRefer;
        }

        /**
         * @return widthNormalized
         */
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

        public static final class Builder {
            private String fillMode; 
            private Integer fixedDelayDuration; 
            private Float heightNormalized; 
            private java.util.List < Float > positionNormalized; 
            private String positionRefer; 
            private Float widthNormalized; 

            /**
             * FillMode.
             */
            public Builder fillMode(String fillMode) {
                this.fillMode = fillMode;
                return this;
            }

            /**
             * FixedDelayDuration.
             */
            public Builder fixedDelayDuration(Integer fixedDelayDuration) {
                this.fixedDelayDuration = fixedDelayDuration;
                return this;
            }

            /**
             * HeightNormalized.
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * PositionNormalized.
             */
            public Builder positionNormalized(java.util.List < Float > positionNormalized) {
                this.positionNormalized = positionNormalized;
                return this;
            }

            /**
             * PositionRefer.
             */
            public Builder positionRefer(String positionRefer) {
                this.positionRefer = positionRefer;
                return this;
            }

            /**
             * WidthNormalized.
             */
            public Builder widthNormalized(Float widthNormalized) {
                this.widthNormalized = widthNormalized;
                return this;
            }

            public VideoLayer build() {
                return new VideoLayer(this);
            } 

        } 

    }
}
