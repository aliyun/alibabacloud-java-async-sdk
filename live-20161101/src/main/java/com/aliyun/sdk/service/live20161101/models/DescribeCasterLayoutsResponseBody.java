// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterLayoutsResponseBody</p>
 */
public class DescribeCasterLayoutsResponseBody extends TeaModel {
    @NameInMap("Layouts")
    private Layouts layouts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeCasterLayoutsResponseBody(Builder builder) {
        this.layouts = builder.layouts;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterLayoutsResponseBody create() {
        return builder().build();
    }

    /**
     * @return layouts
     */
    public Layouts getLayouts() {
        return this.layouts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Layouts layouts; 
        private String requestId; 
        private Integer total; 

        /**
         * Layouts.
         */
        public Builder layouts(Layouts layouts) {
            this.layouts = layouts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterLayoutsResponseBody build() {
            return new DescribeCasterLayoutsResponseBody(this);
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
    public static class AudioLayers extends TeaModel {
        @NameInMap("AudioLayer")
        private java.util.List < AudioLayer> audioLayer;

        private AudioLayers(Builder builder) {
            this.audioLayer = builder.audioLayer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioLayers create() {
            return builder().build();
        }

        /**
         * @return audioLayer
         */
        public java.util.List < AudioLayer> getAudioLayer() {
            return this.audioLayer;
        }

        public static final class Builder {
            private java.util.List < AudioLayer> audioLayer; 

            /**
             * AudioLayer.
             */
            public Builder audioLayer(java.util.List < AudioLayer> audioLayer) {
                this.audioLayer = audioLayer;
                return this;
            }

            public AudioLayers build() {
                return new AudioLayers(this);
            } 

        } 

    }
    public static class BlendList extends TeaModel {
        @NameInMap("LocationId")
        private java.util.List < String > locationId;

        private BlendList(Builder builder) {
            this.locationId = builder.locationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlendList create() {
            return builder().build();
        }

        /**
         * @return locationId
         */
        public java.util.List < String > getLocationId() {
            return this.locationId;
        }

        public static final class Builder {
            private java.util.List < String > locationId; 

            /**
             * LocationId.
             */
            public Builder locationId(java.util.List < String > locationId) {
                this.locationId = locationId;
                return this;
            }

            public BlendList build() {
                return new BlendList(this);
            } 

        } 

    }
    public static class MixList extends TeaModel {
        @NameInMap("LocationId")
        private java.util.List < String > locationId;

        private MixList(Builder builder) {
            this.locationId = builder.locationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MixList create() {
            return builder().build();
        }

        /**
         * @return locationId
         */
        public java.util.List < String > getLocationId() {
            return this.locationId;
        }

        public static final class Builder {
            private java.util.List < String > locationId; 

            /**
             * LocationId.
             */
            public Builder locationId(java.util.List < String > locationId) {
                this.locationId = locationId;
                return this;
            }

            public MixList build() {
                return new MixList(this);
            } 

        } 

    }
    public static class PositionNormalizeds extends TeaModel {
        @NameInMap("Position")
        private java.util.List < Float > position;

        private PositionNormalizeds(Builder builder) {
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PositionNormalizeds create() {
            return builder().build();
        }

        /**
         * @return position
         */
        public java.util.List < Float > getPosition() {
            return this.position;
        }

        public static final class Builder {
            private java.util.List < Float > position; 

            /**
             * Position.
             */
            public Builder position(java.util.List < Float > position) {
                this.position = position;
                return this;
            }

            public PositionNormalizeds build() {
                return new PositionNormalizeds(this);
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

        @NameInMap("PositionNormalizeds")
        private PositionNormalizeds positionNormalizeds;

        @NameInMap("PositionRefer")
        private String positionRefer;

        @NameInMap("WidthNormalized")
        private Float widthNormalized;

        private VideoLayer(Builder builder) {
            this.fillMode = builder.fillMode;
            this.fixedDelayDuration = builder.fixedDelayDuration;
            this.heightNormalized = builder.heightNormalized;
            this.positionNormalizeds = builder.positionNormalizeds;
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
         * @return positionNormalizeds
         */
        public PositionNormalizeds getPositionNormalizeds() {
            return this.positionNormalizeds;
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
            private PositionNormalizeds positionNormalizeds; 
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
             * PositionNormalizeds.
             */
            public Builder positionNormalizeds(PositionNormalizeds positionNormalizeds) {
                this.positionNormalizeds = positionNormalizeds;
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
    public static class VideoLayers extends TeaModel {
        @NameInMap("VideoLayer")
        private java.util.List < VideoLayer> videoLayer;

        private VideoLayers(Builder builder) {
            this.videoLayer = builder.videoLayer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoLayers create() {
            return builder().build();
        }

        /**
         * @return videoLayer
         */
        public java.util.List < VideoLayer> getVideoLayer() {
            return this.videoLayer;
        }

        public static final class Builder {
            private java.util.List < VideoLayer> videoLayer; 

            /**
             * VideoLayer.
             */
            public Builder videoLayer(java.util.List < VideoLayer> videoLayer) {
                this.videoLayer = videoLayer;
                return this;
            }

            public VideoLayers build() {
                return new VideoLayers(this);
            } 

        } 

    }
    public static class Layout extends TeaModel {
        @NameInMap("AudioLayers")
        private AudioLayers audioLayers;

        @NameInMap("BlendList")
        private BlendList blendList;

        @NameInMap("LayoutId")
        private String layoutId;

        @NameInMap("MixList")
        private MixList mixList;

        @NameInMap("VideoLayers")
        private VideoLayers videoLayers;

        private Layout(Builder builder) {
            this.audioLayers = builder.audioLayers;
            this.blendList = builder.blendList;
            this.layoutId = builder.layoutId;
            this.mixList = builder.mixList;
            this.videoLayers = builder.videoLayers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layout create() {
            return builder().build();
        }

        /**
         * @return audioLayers
         */
        public AudioLayers getAudioLayers() {
            return this.audioLayers;
        }

        /**
         * @return blendList
         */
        public BlendList getBlendList() {
            return this.blendList;
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
        public MixList getMixList() {
            return this.mixList;
        }

        /**
         * @return videoLayers
         */
        public VideoLayers getVideoLayers() {
            return this.videoLayers;
        }

        public static final class Builder {
            private AudioLayers audioLayers; 
            private BlendList blendList; 
            private String layoutId; 
            private MixList mixList; 
            private VideoLayers videoLayers; 

            /**
             * AudioLayers.
             */
            public Builder audioLayers(AudioLayers audioLayers) {
                this.audioLayers = audioLayers;
                return this;
            }

            /**
             * BlendList.
             */
            public Builder blendList(BlendList blendList) {
                this.blendList = blendList;
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
             * MixList.
             */
            public Builder mixList(MixList mixList) {
                this.mixList = mixList;
                return this;
            }

            /**
             * VideoLayers.
             */
            public Builder videoLayers(VideoLayers videoLayers) {
                this.videoLayers = videoLayers;
                return this;
            }

            public Layout build() {
                return new Layout(this);
            } 

        } 

    }
    public static class Layouts extends TeaModel {
        @NameInMap("Layout")
        private java.util.List < Layout> layout;

        private Layouts(Builder builder) {
            this.layout = builder.layout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layouts create() {
            return builder().build();
        }

        /**
         * @return layout
         */
        public java.util.List < Layout> getLayout() {
            return this.layout;
        }

        public static final class Builder {
            private java.util.List < Layout> layout; 

            /**
             * Layout.
             */
            public Builder layout(java.util.List < Layout> layout) {
                this.layout = layout;
                return this;
            }

            public Layouts build() {
                return new Layouts(this);
            } 

        } 

    }
}
