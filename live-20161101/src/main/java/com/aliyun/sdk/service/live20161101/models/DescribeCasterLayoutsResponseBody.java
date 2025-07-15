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
 * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterLayoutsResponseBody</p>
 */
public class DescribeCasterLayoutsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Layouts")
    private Layouts layouts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCasterLayoutsResponseBody model) {
            this.layouts = model.layouts;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The layouts.</p>
         */
        public Builder layouts(Layouts layouts) {
            this.layouts = layouts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>The normalized value of the width of the video layer image.</p>
         * <ul>
         * <li>If the FillMode parameter of the video layer is set to none, the height of the video image is scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video image is displayed in the original size.</li>
         * <li>If the FillMode parameter of the video layer is set to fit, the value of the parameter is greater than <strong>0</strong>.</li>
         * </ul>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterLayoutsResponseBody build() {
            return new DescribeCasterLayoutsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class AudioLayer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedDelayDuration")
        private Integer fixedDelayDuration;

        @com.aliyun.core.annotation.NameInMap("ValidChannel")
        private String validChannel;

        @com.aliyun.core.annotation.NameInMap("VolumeRate")
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

            private Builder() {
            } 

            private Builder(AudioLayer model) {
                this.fixedDelayDuration = model.fixedDelayDuration;
                this.validChannel = model.validChannel;
                this.volumeRate = model.volumeRate;
            } 

            /**
             * <p>The fixed delay of the audio layer. This parameter is used to synchronize the audio with subtitles.</p>
             * <p>Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder fixedDelayDuration(Integer fixedDelayDuration) {
                this.fixedDelayDuration = fixedDelayDuration;
                return this;
            }

            /**
             * <p>The sound channels that are used for volume input in the audio layer. Valid values:</p>
             * <ul>
             * <li><strong>leftChannel</strong>: the left channel</li>
             * <li><strong>rightChannel</strong>: the right channel</li>
             * <li><strong>all</strong> (default): both the left and right channels</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder validChannel(String validChannel) {
                this.validChannel = validChannel;
                return this;
            }

            /**
             * <p>The normalized value of the height of the audio layer. The width of the audio layer is proportionally scaled based on this parameter.</p>
             * <blockquote>
             * <p> The default value is <strong>0</strong>, which indicates that the audio layer is not scaled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class AudioLayers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioLayer")
        private java.util.List<AudioLayer> audioLayer;

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
        public java.util.List<AudioLayer> getAudioLayer() {
            return this.audioLayer;
        }

        public static final class Builder {
            private java.util.List<AudioLayer> audioLayer; 

            private Builder() {
            } 

            private Builder(AudioLayers model) {
                this.audioLayer = model.audioLayer;
            } 

            /**
             * AudioLayer.
             */
            public Builder audioLayer(java.util.List<AudioLayer> audioLayer) {
                this.audioLayer = audioLayer;
                return this;
            }

            public AudioLayers build() {
                return new AudioLayers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class BlendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocationId")
        private java.util.List<String> locationId;

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
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

        public static final class Builder {
            private java.util.List<String> locationId; 

            private Builder() {
            } 

            private Builder(BlendList model) {
                this.locationId = model.locationId;
            } 

            /**
             * LocationId.
             */
            public Builder locationId(java.util.List<String> locationId) {
                this.locationId = locationId;
                return this;
            }

            public BlendList build() {
                return new BlendList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class MixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocationId")
        private java.util.List<String> locationId;

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
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

        public static final class Builder {
            private java.util.List<String> locationId; 

            private Builder() {
            } 

            private Builder(MixList model) {
                this.locationId = model.locationId;
            } 

            /**
             * LocationId.
             */
            public Builder locationId(java.util.List<String> locationId) {
                this.locationId = locationId;
                return this;
            }

            public MixList build() {
                return new MixList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class PositionNormalizeds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Position")
        private java.util.List<Float> position;

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
        public java.util.List<Float> getPosition() {
            return this.position;
        }

        public static final class Builder {
            private java.util.List<Float> position; 

            private Builder() {
            } 

            private Builder(PositionNormalizeds model) {
                this.position = model.position;
            } 

            /**
             * Position.
             */
            public Builder position(java.util.List<Float> position) {
                this.position = position;
                return this;
            }

            public PositionNormalizeds build() {
                return new PositionNormalizeds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class VideoLayer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FillMode")
        private String fillMode;

        @com.aliyun.core.annotation.NameInMap("FixedDelayDuration")
        private Integer fixedDelayDuration;

        @com.aliyun.core.annotation.NameInMap("HeightNormalized")
        private Float heightNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionNormalizeds")
        private PositionNormalizeds positionNormalizeds;

        @com.aliyun.core.annotation.NameInMap("PositionRefer")
        private String positionRefer;

        @com.aliyun.core.annotation.NameInMap("WidthNormalized")
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

            private Builder() {
            } 

            private Builder(VideoLayer model) {
                this.fillMode = model.fillMode;
                this.fixedDelayDuration = model.fixedDelayDuration;
                this.heightNormalized = model.heightNormalized;
                this.positionNormalizeds = model.positionNormalizeds;
                this.positionRefer = model.positionRefer;
                this.widthNormalized = model.widthNormalized;
            } 

            /**
             * <p>The scaling mode of the video layer. Valid values:</p>
             * <ul>
             * <li><strong>none</strong> (default): specifies that the video layer is not scaled. The video layer is displayed based on its original size.</li>
             * <li><strong>fit</strong>: specifies that the video layer is adapted to the fill area. The video layer is displayed based on the fill area. In this case, the video layer is scaled proportionally, with its original aspect ratio retained. The video layer is placed in the center, with its longer sides aligned with the fill area. If the aspect ratio of the video layer is different from that of the fill area, the content of the lower layer is displayed alongside the shorter sides. If there is no lower layer, black bars are displayed instead.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fit</p>
             */
            public Builder fillMode(String fillMode) {
                this.fillMode = fillMode;
                return this;
            }

            /**
             * <p>The fixed delay of the video layer. This parameter is used to synchronize the video with subtitles.</p>
             * <p>Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder fixedDelayDuration(Integer fixedDelayDuration) {
                this.fixedDelayDuration = fixedDelayDuration;
                return this;
            }

            /**
             * <p>The normalized value of the height of the video layer.</p>
             * <ul>
             * <li>If the FillMode parameter of the video layer is set to none, the width of the video layer is proportionally scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video layer is not scaled.</li>
             * <li>If the FillMode parameter of the video layer is set to fit, the value of this parameter is greater than <strong>0</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder heightNormalized(Float heightNormalized) {
                this.heightNormalized = heightNormalized;
                return this;
            }

            /**
             * <p>The normalized value of the position of the video layer, in the format of <code>[x,y]</code>. Default value: <code>[0,0]</code>.</p>
             * <blockquote>
             * <p> The values of x and y are normalized.</p>
             * </blockquote>
             */
            public Builder positionNormalizeds(PositionNormalizeds positionNormalizeds) {
                this.positionNormalizeds = positionNormalizeds;
                return this;
            }

            /**
             * <p>The reference coordinates of the video layer. Valid values:</p>
             * <ul>
             * <li><strong>topLeft</strong> (default): the upper-left corner</li>
             * <li><strong>topRight</strong>: the upper-right corner</li>
             * <li><strong>bottomLeft</strong>: the lower-left corner</li>
             * <li><strong>bottomRight</strong>: the lower-right corner</li>
             * <li><strong>center</strong>: the center</li>
             * <li><strong>topCenter</strong>: the upper center</li>
             * <li><strong>bottomCenter</strong>: the lower center</li>
             * <li><strong>leftCenter</strong>: the left center</li>
             * <li><strong>rightCenter</strong>: the right center</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>topLeft</p>
             */
            public Builder positionRefer(String positionRefer) {
                this.positionRefer = positionRefer;
                return this;
            }

            /**
             * <p>The normalized value of the width of the video layer.</p>
             * <ul>
             * <li>If the FillMode parameter of the video layer is set to none, the height of the video layer is scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video layer is not scaled.</li>
             * <li>If the FillMode parameter of the video layer is set to fit, the value of this parameter is greater than <strong>0</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
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
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class VideoLayers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoLayer")
        private java.util.List<VideoLayer> videoLayer;

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
        public java.util.List<VideoLayer> getVideoLayer() {
            return this.videoLayer;
        }

        public static final class Builder {
            private java.util.List<VideoLayer> videoLayer; 

            private Builder() {
            } 

            private Builder(VideoLayers model) {
                this.videoLayer = model.videoLayer;
            } 

            /**
             * VideoLayer.
             */
            public Builder videoLayer(java.util.List<VideoLayer> videoLayer) {
                this.videoLayer = videoLayer;
                return this;
            }

            public VideoLayers build() {
                return new VideoLayers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class Layout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioLayers")
        private AudioLayers audioLayers;

        @com.aliyun.core.annotation.NameInMap("BlendList")
        private BlendList blendList;

        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private String layoutId;

        @com.aliyun.core.annotation.NameInMap("MixList")
        private MixList mixList;

        @com.aliyun.core.annotation.NameInMap("VideoLayers")
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

            private Builder() {
            } 

            private Builder(Layout model) {
                this.audioLayers = model.audioLayers;
                this.blendList = model.blendList;
                this.layoutId = model.layoutId;
                this.mixList = model.mixList;
                this.videoLayers = model.videoLayers;
            } 

            /**
             * <p>The configurations of the audio layers.</p>
             */
            public Builder audioLayers(AudioLayers audioLayers) {
                this.audioLayers = audioLayers;
                return this;
            }

            /**
             * <p>The location IDs of the video layers, which are in the same order as the video layers.</p>
             */
            public Builder blendList(BlendList blendList) {
                this.blendList = blendList;
                return this;
            }

            /**
             * <p>The ID of the layout.</p>
             * 
             * <strong>example:</strong>
             * <p>72d2ec7a-4cd7-4a01-974b-7cd53947****</p>
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * <p>The location IDs of the audio layers, which are in the same order as the audio layers.</p>
             */
            public Builder mixList(MixList mixList) {
                this.mixList = mixList;
                return this;
            }

            /**
             * <p>The configurations of the video layers, which are in the default array sequence.</p>
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
    /**
     * 
     * {@link DescribeCasterLayoutsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterLayoutsResponseBody</p>
     */
    public static class Layouts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Layout")
        private java.util.List<Layout> layout;

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
        public java.util.List<Layout> getLayout() {
            return this.layout;
        }

        public static final class Builder {
            private java.util.List<Layout> layout; 

            private Builder() {
            } 

            private Builder(Layouts model) {
                this.layout = model.layout;
            } 

            /**
             * Layout.
             */
            public Builder layout(java.util.List<Layout> layout) {
                this.layout = layout;
                return this;
            }

            public Layouts build() {
                return new Layouts(this);
            } 

        } 

    }
}
