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
 * {@link ModifyCasterLayoutRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterLayoutRequest</p>
 */
public class ModifyCasterLayoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioLayer")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AudioLayer> audioLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlendList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> blendList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> mixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoLayer")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<VideoLayer> videoLayer;

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
    public java.util.List<AudioLayer> getAudioLayer() {
        return this.audioLayer;
    }

    /**
     * @return blendList
     */
    public java.util.List<String> getBlendList() {
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
    public java.util.List<String> getMixList() {
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
    public java.util.List<VideoLayer> getVideoLayer() {
        return this.videoLayer;
    }

    public static final class Builder extends Request.Builder<ModifyCasterLayoutRequest, Builder> {
        private java.util.List<AudioLayer> audioLayer; 
        private java.util.List<String> blendList; 
        private String casterId; 
        private String layoutId; 
        private java.util.List<String> mixList; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<VideoLayer> videoLayer; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterLayoutRequest request) {
            super(request);
            this.audioLayer = request.audioLayer;
            this.blendList = request.blendList;
            this.casterId = request.casterId;
            this.layoutId = request.layoutId;
            this.mixList = request.mixList;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.videoLayer = request.videoLayer;
        } 

        /**
         * <p>The audio layers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder audioLayer(java.util.List<AudioLayer> audioLayer) {
            this.putQueryParameter("AudioLayer", audioLayer);
            this.audioLayer = audioLayer;
            return this;
        }

        /**
         * <p>The location IDs of the video layers, which are in the same order as the video layers.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RV02</p>
         */
        public Builder blendList(java.util.List<String> blendList) {
            this.putQueryParameter("BlendList", blendList);
            this.blendList = blendList;
            return this;
        }

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the layout. If the layout was added by calling the <a href="https://help.aliyun.com/document_detail/2848025.html">AddCasterLayout</a> operation, check the value of the response parameter LayoutId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * <p>The location IDs of the audio layers, which are in the same order as the audio layers.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RV02</p>
         */
        public Builder mixList(java.util.List<String> mixList) {
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The video layers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder videoLayer(java.util.List<VideoLayer> videoLayer) {
            this.putQueryParameter("VideoLayer", videoLayer);
            this.videoLayer = videoLayer;
            return this;
        }

        @Override
        public ModifyCasterLayoutRequest build() {
            return new ModifyCasterLayoutRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCasterLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyCasterLayoutRequest</p>
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
             * <p>The fixed delay of the audio layer. This parameter is used to synchronize the audio with subtitles. Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
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
             * <p>The default value is <strong>0</strong>, which indicates that the audio layer is not scaled.</p>
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
     * {@link ModifyCasterLayoutRequest} extends {@link TeaModel}
     *
     * <p>ModifyCasterLayoutRequest</p>
     */
    public static class VideoLayer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FillMode")
        private String fillMode;

        @com.aliyun.core.annotation.NameInMap("FixedDelayDuration")
        private Integer fixedDelayDuration;

        @com.aliyun.core.annotation.NameInMap("HeightNormalized")
        private Float heightNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionNormalized")
        private java.util.List<Float> positionNormalized;

        @com.aliyun.core.annotation.NameInMap("PositionRefer")
        private String positionRefer;

        @com.aliyun.core.annotation.NameInMap("WidthNormalized")
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
         * @return widthNormalized
         */
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

        public static final class Builder {
            private String fillMode; 
            private Integer fixedDelayDuration; 
            private Float heightNormalized; 
            private java.util.List<Float> positionNormalized; 
            private String positionRefer; 
            private Float widthNormalized; 

            private Builder() {
            } 

            private Builder(VideoLayer model) {
                this.fillMode = model.fillMode;
                this.fixedDelayDuration = model.fixedDelayDuration;
                this.heightNormalized = model.heightNormalized;
                this.positionNormalized = model.positionNormalized;
                this.positionRefer = model.positionRefer;
                this.widthNormalized = model.widthNormalized;
            } 

            /**
             * <p>The scaling mode of the video layer. Valid values:</p>
             * <ul>
             * <li><strong>none</strong> (default): indicates that the video layer is not scaled. The video layer is displayed based on its original size.</li>
             * <li><strong>fit</strong>: indicates that the video layer is adapted to the fill area. In this case, the video layer is scaled proportionally, with its original aspect ratio retained. The video layer is placed in the center, with its longer sides aligned with the fill area. If the aspect ratio of the video layer is different from that of the fill area, the content of the lower layer is displayed alongside the shorter sides. If there is no lower layer, black bars are displayed instead.</li>
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
             * <p>The fixed delay of the video layer. This parameter is used to synchronize the video with subtitles. Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
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
             * <p>1</p>
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
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder positionNormalized(java.util.List<Float> positionNormalized) {
                this.positionNormalized = positionNormalized;
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
             * <li>If the FillMode parameter of the video layer is set to none, the height of the video layer is proportionally scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video layer is not scaled.</li>
             * <li>If the FillMode parameter of the video layer is set to fit, the value of this parameter is greater than <strong>0</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
