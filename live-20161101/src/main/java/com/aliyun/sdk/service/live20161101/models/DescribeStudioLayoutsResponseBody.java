// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStudioLayoutsResponseBody</p>
 */
public class DescribeStudioLayoutsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StudioLayouts")
    private java.util.List < StudioLayouts> studioLayouts;

    @NameInMap("Total")
    private Integer total;

    private DescribeStudioLayoutsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.studioLayouts = builder.studioLayouts;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStudioLayoutsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return studioLayouts
     */
    public java.util.List < StudioLayouts> getStudioLayouts() {
        return this.studioLayouts;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StudioLayouts> studioLayouts; 
        private Integer total; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StudioLayouts.
         */
        public Builder studioLayouts(java.util.List < StudioLayouts> studioLayouts) {
            this.studioLayouts = studioLayouts;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeStudioLayoutsResponseBody build() {
            return new DescribeStudioLayoutsResponseBody(this);
        } 

    } 

    public static class BgImageConfig extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("LocationId")
        private String locationId;

        @NameInMap("MaterialId")
        private String materialId;

        private BgImageConfig(Builder builder) {
            this.id = builder.id;
            this.imageUrl = builder.imageUrl;
            this.locationId = builder.locationId;
            this.materialId = builder.materialId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgImageConfig create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return locationId
         */
        public String getLocationId() {
            return this.locationId;
        }

        /**
         * @return materialId
         */
        public String getMaterialId() {
            return this.materialId;
        }

        public static final class Builder {
            private String id; 
            private String imageUrl; 
            private String locationId; 
            private String materialId; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * LocationId.
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * MaterialId.
             */
            public Builder materialId(String materialId) {
                this.materialId = materialId;
                return this;
            }

            public BgImageConfig build() {
                return new BgImageConfig(this);
            } 

        } 

    }
    public static class CommonConfig extends TeaModel {
        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("VideoResourceId")
        private String videoResourceId;

        private CommonConfig(Builder builder) {
            this.channelId = builder.channelId;
            this.videoResourceId = builder.videoResourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonConfig create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return videoResourceId
         */
        public String getVideoResourceId() {
            return this.videoResourceId;
        }

        public static final class Builder {
            private String channelId; 
            private String videoResourceId; 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * VideoResourceId.
             */
            public Builder videoResourceId(String videoResourceId) {
                this.videoResourceId = videoResourceId;
                return this;
            }

            public CommonConfig build() {
                return new CommonConfig(this);
            } 

        } 

    }
    public static class LayerOrderConfigList extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Type")
        private String type;

        private LayerOrderConfigList(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayerOrderConfigList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LayerOrderConfigList build() {
                return new LayerOrderConfigList(this);
            } 

        } 

    }
    public static class MediaInputConfigList extends TeaModel {
        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("FillMode")
        private String fillMode;

        @NameInMap("HeightNormalized")
        private Float heightNormalized;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageMaterialId")
        private String imageMaterialId;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("PositionNormalized")
        private java.util.List < Float > positionNormalized;

        @NameInMap("PositionRefer")
        private String positionRefer;

        @NameInMap("VideoResourceId")
        private String videoResourceId;

        @NameInMap("WidthNormalized")
        private Float widthNormalized;

        private MediaInputConfigList(Builder builder) {
            this.channelId = builder.channelId;
            this.fillMode = builder.fillMode;
            this.heightNormalized = builder.heightNormalized;
            this.id = builder.id;
            this.imageMaterialId = builder.imageMaterialId;
            this.index = builder.index;
            this.positionNormalized = builder.positionNormalized;
            this.positionRefer = builder.positionRefer;
            this.videoResourceId = builder.videoResourceId;
            this.widthNormalized = builder.widthNormalized;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInputConfigList create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return fillMode
         */
        public String getFillMode() {
            return this.fillMode;
        }

        /**
         * @return heightNormalized
         */
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageMaterialId
         */
        public String getImageMaterialId() {
            return this.imageMaterialId;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
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
         * @return videoResourceId
         */
        public String getVideoResourceId() {
            return this.videoResourceId;
        }

        /**
         * @return widthNormalized
         */
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

        public static final class Builder {
            private String channelId; 
            private String fillMode; 
            private Float heightNormalized; 
            private String id; 
            private String imageMaterialId; 
            private Integer index; 
            private java.util.List < Float > positionNormalized; 
            private String positionRefer; 
            private String videoResourceId; 
            private Float widthNormalized; 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * FillMode.
             */
            public Builder fillMode(String fillMode) {
                this.fillMode = fillMode;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageMaterialId.
             */
            public Builder imageMaterialId(String imageMaterialId) {
                this.imageMaterialId = imageMaterialId;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * VideoResourceId.
             */
            public Builder videoResourceId(String videoResourceId) {
                this.videoResourceId = videoResourceId;
                return this;
            }

            /**
             * WidthNormalized.
             */
            public Builder widthNormalized(Float widthNormalized) {
                this.widthNormalized = widthNormalized;
                return this;
            }

            public MediaInputConfigList build() {
                return new MediaInputConfigList(this);
            } 

        } 

    }
    public static class AudioConfig extends TeaModel {
        @NameInMap("ValidChannel")
        private String validChannel;

        @NameInMap("VolumeRate")
        private Float volumeRate;

        private AudioConfig(Builder builder) {
            this.validChannel = builder.validChannel;
            this.volumeRate = builder.volumeRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioConfig create() {
            return builder().build();
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
            private String validChannel; 
            private Float volumeRate; 

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

            public AudioConfig build() {
                return new AudioConfig(this);
            } 

        } 

    }
    public static class ScreenInputConfigList extends TeaModel {
        @NameInMap("AudioConfig")
        private AudioConfig audioConfig;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("Color")
        private String color;

        @NameInMap("HeightNormalized")
        private Float heightNormalized;

        @NameInMap("Id")
        private String id;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("OnlyAudio")
        private Boolean onlyAudio;

        @NameInMap("PortraitType")
        private Integer portraitType;

        @NameInMap("PositionX")
        private String positionX;

        @NameInMap("PositionY")
        private String positionY;

        @NameInMap("VideoResourceId")
        private String videoResourceId;

        private ScreenInputConfigList(Builder builder) {
            this.audioConfig = builder.audioConfig;
            this.channelId = builder.channelId;
            this.color = builder.color;
            this.heightNormalized = builder.heightNormalized;
            this.id = builder.id;
            this.index = builder.index;
            this.onlyAudio = builder.onlyAudio;
            this.portraitType = builder.portraitType;
            this.positionX = builder.positionX;
            this.positionY = builder.positionY;
            this.videoResourceId = builder.videoResourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScreenInputConfigList create() {
            return builder().build();
        }

        /**
         * @return audioConfig
         */
        public AudioConfig getAudioConfig() {
            return this.audioConfig;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return heightNormalized
         */
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return onlyAudio
         */
        public Boolean getOnlyAudio() {
            return this.onlyAudio;
        }

        /**
         * @return portraitType
         */
        public Integer getPortraitType() {
            return this.portraitType;
        }

        /**
         * @return positionX
         */
        public String getPositionX() {
            return this.positionX;
        }

        /**
         * @return positionY
         */
        public String getPositionY() {
            return this.positionY;
        }

        /**
         * @return videoResourceId
         */
        public String getVideoResourceId() {
            return this.videoResourceId;
        }

        public static final class Builder {
            private AudioConfig audioConfig; 
            private String channelId; 
            private String color; 
            private Float heightNormalized; 
            private String id; 
            private Integer index; 
            private Boolean onlyAudio; 
            private Integer portraitType; 
            private String positionX; 
            private String positionY; 
            private String videoResourceId; 

            /**
             * AudioConfig.
             */
            public Builder audioConfig(AudioConfig audioConfig) {
                this.audioConfig = audioConfig;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * OnlyAudio.
             */
            public Builder onlyAudio(Boolean onlyAudio) {
                this.onlyAudio = onlyAudio;
                return this;
            }

            /**
             * PortraitType.
             */
            public Builder portraitType(Integer portraitType) {
                this.portraitType = portraitType;
                return this;
            }

            /**
             * PositionX.
             */
            public Builder positionX(String positionX) {
                this.positionX = positionX;
                return this;
            }

            /**
             * PositionY.
             */
            public Builder positionY(String positionY) {
                this.positionY = positionY;
                return this;
            }

            /**
             * VideoResourceId.
             */
            public Builder videoResourceId(String videoResourceId) {
                this.videoResourceId = videoResourceId;
                return this;
            }

            public ScreenInputConfigList build() {
                return new ScreenInputConfigList(this);
            } 

        } 

    }
    public static class StudioLayouts extends TeaModel {
        @NameInMap("BgImageConfig")
        private BgImageConfig bgImageConfig;

        @NameInMap("CommonConfig")
        private CommonConfig commonConfig;

        @NameInMap("LayerOrderConfigList")
        private java.util.List < LayerOrderConfigList> layerOrderConfigList;

        @NameInMap("LayoutId")
        private String layoutId;

        @NameInMap("LayoutName")
        private String layoutName;

        @NameInMap("LayoutType")
        private String layoutType;

        @NameInMap("MediaInputConfigList")
        private java.util.List < MediaInputConfigList> mediaInputConfigList;

        @NameInMap("ScreenInputConfigList")
        private java.util.List < ScreenInputConfigList> screenInputConfigList;

        private StudioLayouts(Builder builder) {
            this.bgImageConfig = builder.bgImageConfig;
            this.commonConfig = builder.commonConfig;
            this.layerOrderConfigList = builder.layerOrderConfigList;
            this.layoutId = builder.layoutId;
            this.layoutName = builder.layoutName;
            this.layoutType = builder.layoutType;
            this.mediaInputConfigList = builder.mediaInputConfigList;
            this.screenInputConfigList = builder.screenInputConfigList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StudioLayouts create() {
            return builder().build();
        }

        /**
         * @return bgImageConfig
         */
        public BgImageConfig getBgImageConfig() {
            return this.bgImageConfig;
        }

        /**
         * @return commonConfig
         */
        public CommonConfig getCommonConfig() {
            return this.commonConfig;
        }

        /**
         * @return layerOrderConfigList
         */
        public java.util.List < LayerOrderConfigList> getLayerOrderConfigList() {
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
         * @return layoutType
         */
        public String getLayoutType() {
            return this.layoutType;
        }

        /**
         * @return mediaInputConfigList
         */
        public java.util.List < MediaInputConfigList> getMediaInputConfigList() {
            return this.mediaInputConfigList;
        }

        /**
         * @return screenInputConfigList
         */
        public java.util.List < ScreenInputConfigList> getScreenInputConfigList() {
            return this.screenInputConfigList;
        }

        public static final class Builder {
            private BgImageConfig bgImageConfig; 
            private CommonConfig commonConfig; 
            private java.util.List < LayerOrderConfigList> layerOrderConfigList; 
            private String layoutId; 
            private String layoutName; 
            private String layoutType; 
            private java.util.List < MediaInputConfigList> mediaInputConfigList; 
            private java.util.List < ScreenInputConfigList> screenInputConfigList; 

            /**
             * BgImageConfig.
             */
            public Builder bgImageConfig(BgImageConfig bgImageConfig) {
                this.bgImageConfig = bgImageConfig;
                return this;
            }

            /**
             * CommonConfig.
             */
            public Builder commonConfig(CommonConfig commonConfig) {
                this.commonConfig = commonConfig;
                return this;
            }

            /**
             * LayerOrderConfigList.
             */
            public Builder layerOrderConfigList(java.util.List < LayerOrderConfigList> layerOrderConfigList) {
                this.layerOrderConfigList = layerOrderConfigList;
                return this;
            }

            /**
             * LayoutId.
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * LayoutName.
             */
            public Builder layoutName(String layoutName) {
                this.layoutName = layoutName;
                return this;
            }

            /**
             * LayoutType.
             */
            public Builder layoutType(String layoutType) {
                this.layoutType = layoutType;
                return this;
            }

            /**
             * MediaInputConfigList.
             */
            public Builder mediaInputConfigList(java.util.List < MediaInputConfigList> mediaInputConfigList) {
                this.mediaInputConfigList = mediaInputConfigList;
                return this;
            }

            /**
             * ScreenInputConfigList.
             */
            public Builder screenInputConfigList(java.util.List < ScreenInputConfigList> screenInputConfigList) {
                this.screenInputConfigList = screenInputConfigList;
                return this;
            }

            public StudioLayouts build() {
                return new StudioLayouts(this);
            } 

        } 

    }
}
