// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStudioLayoutsResponseBody</p>
 */
public class DescribeStudioLayoutsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StudioLayouts")
    private java.util.List<StudioLayouts> studioLayouts;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<StudioLayouts> getStudioLayouts() {
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
        private java.util.List<StudioLayouts> studioLayouts; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeStudioLayoutsResponseBody model) {
            this.requestId = model.requestId;
            this.studioLayouts = model.studioLayouts;
            this.total = model.total;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b9676b3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The layout information.</p>
         */
        public Builder studioLayouts(java.util.List<StudioLayouts> studioLayouts) {
            this.studioLayouts = studioLayouts;
            return this;
        }

        /**
         * <p>The total number of layouts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeStudioLayoutsResponseBody build() {
            return new DescribeStudioLayoutsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStudioLayoutsResponseBody</p>
     */
    public static class BgImageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("LocationId")
        private String locationId;

        @com.aliyun.core.annotation.NameInMap("MaterialId")
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

            private Builder() {
            } 

            private Builder(BgImageConfig model) {
                this.id = model.id;
                this.imageUrl = model.imageUrl;
                this.locationId = model.locationId;
                this.materialId = model.materialId;
            } 

            /**
             * <p>The unique ID of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>k12kj31****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The URL of the material.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.org">http://example.org</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The position ID.</p>
             * 
             * <strong>example:</strong>
             * <p>RV01</p>
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * <p>The ID of the material in ApsaraVideo VOD.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfas9df89asd8f9****</p>
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
    /**
     * 
     * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStudioLayoutsResponseBody</p>
     */
    public static class CommonConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("VideoResourceId")
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

            private Builder() {
            } 

            private Builder(CommonConfig model) {
                this.channelId = model.channelId;
                this.videoResourceId = model.videoResourceId;
            } 

            /**
             * <p>The ID of the channel that is bound to the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>RV01</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The ID of the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfasdfasdfasdfa****</p>
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
    /**
     * 
     * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStudioLayoutsResponseBody</p>
     */
    public static class LayerOrderConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(LayerOrderConfigList model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The unique ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>k12kj31****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the resource. Valid values:</p>
             * <ul>
             * <li><strong>background</strong>: background material</li>
             * <li><strong>media</strong>: multimedia material</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>media</p>
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
    /**
     * 
     * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStudioLayoutsResponseBody</p>
     */
    public static class MediaInputConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("FillMode")
        private String fillMode;

        @com.aliyun.core.annotation.NameInMap("HeightNormalized")
        private Float heightNormalized;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageMaterialId")
        private String imageMaterialId;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("PositionNormalized")
        private java.util.List<Float> positionNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionRefer")
        private String positionRefer;

        @com.aliyun.core.annotation.NameInMap("VideoResourceId")
        private String videoResourceId;

        @com.aliyun.core.annotation.NameInMap("WidthNormalized")
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
        public java.util.List<Float> getPositionNormalized() {
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
            private java.util.List<Float> positionNormalized; 
            private String positionRefer; 
            private String videoResourceId; 
            private Float widthNormalized; 

            private Builder() {
            } 

            private Builder(MediaInputConfigList model) {
                this.channelId = model.channelId;
                this.fillMode = model.fillMode;
                this.heightNormalized = model.heightNormalized;
                this.id = model.id;
                this.imageMaterialId = model.imageMaterialId;
                this.index = model.index;
                this.positionNormalized = model.positionNormalized;
                this.positionRefer = model.positionRefer;
                this.videoResourceId = model.videoResourceId;
                this.widthNormalized = model.widthNormalized;
            } 

            /**
             * <p>The ID of the channel that is bound to the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>RV01</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The fill type. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder fillMode(String fillMode) {
                this.fillMode = fillMode;
                return this;
            }

            /**
             * <p>The normalized value of the material height. The value indicates the ratio of the material height to the height of the background. Valid values: <strong>0 to 1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * <p>The unique ID of the multimedia material.</p>
             * 
             * <strong>example:</strong>
             * <p>k12kj31****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the image in ApsaraVideo VOD.</p>
             * 
             * <strong>example:</strong>
             * <p>lkajsdfsa8fd89asd8****</p>
             */
            public Builder imageMaterialId(String imageMaterialId) {
                this.imageMaterialId = imageMaterialId;
                return this;
            }

            /**
             * <p>The sequence number of the multimedia material. This parameter is displayed on the frontend but not used in the operation logic.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The normalized value of the position of the material, in the format of [unk][x,y][unk]. Valid values of x and y: <strong>0 to 1</strong>. For example, [unk][0.1,0.2][unk] indicates that the material is horizontally offset by 10% and vertically offset by 20% towards the upper-left corner.</p>
             */
            public Builder positionNormalized(java.util.List<Float> positionNormalized) {
                this.positionNormalized = positionNormalized;
                return this;
            }

            /**
             * <p>The coordinate origin for the material. Default value: topLeft. topLeft indicates that the upper-left corner is used as the coordinate origin.</p>
             * 
             * <strong>example:</strong>
             * <p>topLeft</p>
             */
            public Builder positionRefer(String positionRefer) {
                this.positionRefer = positionRefer;
                return this;
            }

            /**
             * <p>The ID of the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfasdfasdfasdfa****</p>
             */
            public Builder videoResourceId(String videoResourceId) {
                this.videoResourceId = videoResourceId;
                return this;
            }

            /**
             * <p>The normalized value of the material width. The value indicates the ratio of the material width to the width of the background. Valid values: <strong>0 to 1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
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
    /**
     * 
     * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStudioLayoutsResponseBody</p>
     */
    public static class AudioConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ValidChannel")
        private String validChannel;

        @com.aliyun.core.annotation.NameInMap("VolumeRate")
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

            private Builder() {
            } 

            private Builder(AudioConfig model) {
                this.validChannel = model.validChannel;
                this.volumeRate = model.volumeRate;
            } 

            /**
             * <p>The corresponding channel.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder validChannel(String validChannel) {
                this.validChannel = validChannel;
                return this;
            }

            /**
             * <p>The volume.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
    /**
     * 
     * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStudioLayoutsResponseBody</p>
     */
    public static class ScreenInputConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioConfig")
        private AudioConfig audioConfig;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("HeightNormalized")
        private Float heightNormalized;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("OnlyAudio")
        private Boolean onlyAudio;

        @com.aliyun.core.annotation.NameInMap("PortraitType")
        private Integer portraitType;

        @com.aliyun.core.annotation.NameInMap("PositionX")
        private String positionX;

        @com.aliyun.core.annotation.NameInMap("PositionY")
        private String positionY;

        @com.aliyun.core.annotation.NameInMap("VideoResourceId")
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

            private Builder() {
            } 

            private Builder(ScreenInputConfigList model) {
                this.audioConfig = model.audioConfig;
                this.channelId = model.channelId;
                this.color = model.color;
                this.heightNormalized = model.heightNormalized;
                this.id = model.id;
                this.index = model.index;
                this.onlyAudio = model.onlyAudio;
                this.portraitType = model.portraitType;
                this.positionX = model.positionX;
                this.positionY = model.positionY;
                this.videoResourceId = model.videoResourceId;
            } 

            /**
             * <p>The audio configurations.</p>
             */
            public Builder audioConfig(AudioConfig audioConfig) {
                this.audioConfig = audioConfig;
                return this;
            }

            /**
             * <p>The ID of the channel that is bound to the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>RV01</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The color gamut for chroma key. Valid values:</p>
             * <ul>
             * <li><strong>blue</strong></li>
             * <li><strong>green</strong></li>
             * <li><strong>auto</strong>: automatic recognition</li>
             * <li><strong>complex</strong>: background replacement</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>green</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The normalized value of the height. The value indicates the ratio of the height of the keyed portrait to the height of the background. Valid values: <strong>0 to 1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * <p>The unique ID of the chroma key source.</p>
             * 
             * <strong>example:</strong>
             * <p>k12kj31****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The sequence number of the chroma key source. This parameter is displayed on the frontend but not used in the operation logic.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Indicates whether only audio exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder onlyAudio(Boolean onlyAudio) {
                this.onlyAudio = onlyAudio;
                return this;
            }

            /**
             * <p>The portrait type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: half body</li>
             * <li><strong>1</strong>: full body</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder portraitType(Integer portraitType) {
                this.portraitType = portraitType;
                return this;
            }

            /**
             * <p>The x-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder positionX(String positionX) {
                this.positionX = positionX;
                return this;
            }

            /**
             * <p>The y-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder positionY(String positionY) {
                this.positionY = positionY;
                return this;
            }

            /**
             * <p>The ID of the video resource.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfasdfasdfasdfa****</p>
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
    /**
     * 
     * {@link DescribeStudioLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStudioLayoutsResponseBody</p>
     */
    public static class StudioLayouts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgImageConfig")
        private BgImageConfig bgImageConfig;

        @com.aliyun.core.annotation.NameInMap("CommonConfig")
        private CommonConfig commonConfig;

        @com.aliyun.core.annotation.NameInMap("LayerOrderConfigList")
        private java.util.List<LayerOrderConfigList> layerOrderConfigList;

        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private String layoutId;

        @com.aliyun.core.annotation.NameInMap("LayoutName")
        private String layoutName;

        @com.aliyun.core.annotation.NameInMap("LayoutType")
        private String layoutType;

        @com.aliyun.core.annotation.NameInMap("MediaInputConfigList")
        private java.util.List<MediaInputConfigList> mediaInputConfigList;

        @com.aliyun.core.annotation.NameInMap("ScreenInputConfigList")
        private java.util.List<ScreenInputConfigList> screenInputConfigList;

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
        public java.util.List<LayerOrderConfigList> getLayerOrderConfigList() {
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
        public java.util.List<MediaInputConfigList> getMediaInputConfigList() {
            return this.mediaInputConfigList;
        }

        /**
         * @return screenInputConfigList
         */
        public java.util.List<ScreenInputConfigList> getScreenInputConfigList() {
            return this.screenInputConfigList;
        }

        public static final class Builder {
            private BgImageConfig bgImageConfig; 
            private CommonConfig commonConfig; 
            private java.util.List<LayerOrderConfigList> layerOrderConfigList; 
            private String layoutId; 
            private String layoutName; 
            private String layoutType; 
            private java.util.List<MediaInputConfigList> mediaInputConfigList; 
            private java.util.List<ScreenInputConfigList> screenInputConfigList; 

            private Builder() {
            } 

            private Builder(StudioLayouts model) {
                this.bgImageConfig = model.bgImageConfig;
                this.commonConfig = model.commonConfig;
                this.layerOrderConfigList = model.layerOrderConfigList;
                this.layoutId = model.layoutId;
                this.layoutName = model.layoutName;
                this.layoutType = model.layoutType;
                this.mediaInputConfigList = model.mediaInputConfigList;
                this.screenInputConfigList = model.screenInputConfigList;
            } 

            /**
             * <p>The background material configurations.</p>
             */
            public Builder bgImageConfig(BgImageConfig bgImageConfig) {
                this.bgImageConfig = bgImageConfig;
                return this;
            }

            /**
             * <p>The common layout configurations. This parameter is returned only for a common layout.</p>
             */
            public Builder commonConfig(CommonConfig commonConfig) {
                this.commonConfig = commonConfig;
                return this;
            }

            /**
             * <p>The layer sorting configurations.</p>
             */
            public Builder layerOrderConfigList(java.util.List<LayerOrderConfigList> layerOrderConfigList) {
                this.layerOrderConfigList = layerOrderConfigList;
                return this;
            }

            /**
             * <p>The ID of the layout.</p>
             * 
             * <strong>example:</strong>
             * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * <p>The name of the layout.</p>
             * 
             * <strong>example:</strong>
             * <p>测试布局</p>
             */
            public Builder layoutName(String layoutName) {
                this.layoutName = layoutName;
                return this;
            }

            /**
             * <p>The type of the layout. Valid values:</p>
             * <ul>
             * <li><strong>common</strong></li>
             * <li><strong>studio</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>studio</p>
             */
            public Builder layoutType(String layoutType) {
                this.layoutType = layoutType;
                return this;
            }

            /**
             * <p>The multimedia input configurations.</p>
             */
            public Builder mediaInputConfigList(java.util.List<MediaInputConfigList> mediaInputConfigList) {
                this.mediaInputConfigList = mediaInputConfigList;
                return this;
            }

            /**
             * <p>The input configurations for chroma key.</p>
             */
            public Builder screenInputConfigList(java.util.List<ScreenInputConfigList> screenInputConfigList) {
                this.screenInputConfigList = screenInputConfigList;
                return this;
            }

            public StudioLayouts build() {
                return new StudioLayouts(this);
            } 

        } 

    }
}
