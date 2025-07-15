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
 * {@link AddCasterLayoutRequest} extends {@link RequestModel}
 *
 * <p>AddCasterLayoutRequest</p>
 */
public class AddCasterLayoutRequest extends Request {
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

    private AddCasterLayoutRequest(Builder builder) {
        super(builder);
        this.audioLayer = builder.audioLayer;
        this.blendList = builder.blendList;
        this.casterId = builder.casterId;
        this.mixList = builder.mixList;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.videoLayer = builder.videoLayer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterLayoutRequest create() {
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

    public static final class Builder extends Request.Builder<AddCasterLayoutRequest, Builder> {
        private java.util.List<AudioLayer> audioLayer; 
        private java.util.List<String> blendList; 
        private String casterId; 
        private java.util.List<String> mixList; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<VideoLayer> videoLayer; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterLayoutRequest request) {
            super(request);
            this.audioLayer = request.audioLayer;
            this.blendList = request.blendList;
            this.casterId = request.casterId;
            this.mixList = request.mixList;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.videoLayer = request.videoLayer;
        } 

        /**
         * <p>Audio layout.</p>
         * <p>This parameter is required.</p>
         */
        public Builder audioLayer(java.util.List<AudioLayer> audioLayer) {
            this.putQueryParameter("AudioLayer", audioLayer);
            this.audioLayer = audioLayer;
            return this;
        }

        /**
         * <p>The element represents the location ID of the video resource, i.e., LocationId. Refer to <a href="https://help.aliyun.com/document_detail/60250.html">Adding Video Source</a> for LocationId, which corresponds in order with the VideoLayers elements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        public Builder blendList(java.util.List<String> blendList) {
            this.putQueryParameter("BlendList", blendList);
            this.blendList = blendList;
            return this;
        }

        /**
         * <p>The ID of the production studio.</p>
         * <p>If you create a production studio through the <a href="~~69338#doc-api-live-CreateCaster~~" title="Creates a production studio.">CreateCaster</a> interface, check the value of the CasterId parameter in the response.</p>
         * <p>If you create a production studio through the ApsaraVideo Live Console, log in to the console, then check the ID of the production studio through the following path:</p>
         * <p>Production Studios &gt; Production Studio Management</p>
         * <blockquote>
         * <p> The CasterId is reflected in the Name column on the Production Studio Management page.</p>
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
         * <p>The element represents the location ID of the audio resource, i.e., LocationId.
         * LocationId is referred to in <a href="https://help.aliyun.com/document_detail/60250.html">Adding Video Source</a>, and corresponds in order with the AudioLayers elements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
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
         * <p>Video layout.</p>
         * <p>This parameter is required.</p>
         */
        public Builder videoLayer(java.util.List<VideoLayer> videoLayer) {
            this.putQueryParameter("VideoLayer", videoLayer);
            this.videoLayer = videoLayer;
            return this;
        }

        @Override
        public AddCasterLayoutRequest build() {
            return new AddCasterLayoutRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddCasterLayoutRequest} extends {@link TeaModel}
     *
     * <p>AddCasterLayoutRequest</p>
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
             * <p>The fixed delay of audio layer N. You can use this parameter to synchronize the audio with subtitles. Unit: milliseconds. Valid values: <strong>0 to 5000</strong>. Default value: <strong>0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder fixedDelayDuration(Integer fixedDelayDuration) {
                this.fixedDelayDuration = fixedDelayDuration;
                return this;
            }

            /**
             * <p>The valid voice channels of audio layer N. Valid values:</p>
             * <ul>
             * <li><strong>leftChannel</strong>: the left channel.</li>
             * <li><strong>rightChannel</strong>: the right channel.</li>
             * <li><strong>all</strong>: both the left and right channels. This is the default value.</li>
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
             * <p>The multiples of the original volume at which audio layer N plays audio streams. Valid values: <strong>0 to 10.0</strong>.</p>
             * <ul>
             * <li>The default value <strong>1.0</strong> indicates that audio layer N plays audio streams at the original volume.</li>
             * <li>A value smaller than <strong>1.0</strong> indicates that audio layer N plays audio streams at a lower volume than the original one.</li>
             * <li>A value greater than <strong>1.0</strong> indicates that audio layer N plays audio streams at a higher volume than the original one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
     * {@link AddCasterLayoutRequest} extends {@link TeaModel}
     *
     * <p>AddCasterLayoutRequest</p>
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
             * <p>The scaling mode of video layer N. Valid values:</p>
             * <ul>
             * <li><strong>none</strong>: The image is not scaled to fill in the specified layout section. Set video layer N based on the image size of the video resource. This is the default value.</li>
             * <li><strong>fit</strong>: The image is scaled with the original aspect ratio to fill in the specified layout section. Set video layer N based on the section size. The image is centered in the layout section with the long side of the image equaling that of the section. If the aspect ratio of the image is inconsistent with that of the section, the short side of the image may be shorter than that of the section. The area outside the image displays the next video layer or the background if no next video layer exists. By default, the background color is black.</li>
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
             * <p>The fixed delay of video layer N. You can use this parameter to synchronize the video with subtitles. Unit: milliseconds. Valid values: <strong>0 to 5000</strong>. Default value: <strong>0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder fixedDelayDuration(Integer fixedDelayDuration) {
                this.fixedDelayDuration = fixedDelayDuration;
                return this;
            }

            /**
             * <p>The normalized value of the height of the image of video layer N.</p>
             * <ul>
             * <li>If the FillMode parameter of video layer N is set to none, the width of the video image is scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video image is displayed in the original size.</li>
             * <li>If the FillMode parameter of video layer N is set to fit, you must set this parameter to a value greater than <strong>0</strong>. In this case, the video image is scaled with the original aspect ratio to fill in the specified layout section based on this parameter.</li>
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
             * <p>The normalized value of the <code>[x,y]</code> coordinates of video layer N in the production studio. The default coordinates are <code>[0,0]</code>.</p>
             * <blockquote>
             * <p> The coordinates indicate the location of video layer N in the production studio. Set this parameter to the normalized value of the coordinates.</p>
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
             * <p>The reference coordinates of video layer N in the production studio. Valid values:</p>
             * <ul>
             * <li><strong>topLeft</strong>: the upper-left corner. This is the default value.</li>
             * <li><strong>topRight</strong>: the upper-right corner.</li>
             * <li><strong>bottomLeft</strong>: the lower-left corner.</li>
             * <li><strong>bottomRight</strong>: the lower-right corner.</li>
             * <li><strong>center</strong>: the center position.</li>
             * <li><strong>topCenter</strong>: the upper center position.</li>
             * <li><strong>bottomCenter</strong>: the lower center position.</li>
             * <li><strong>leftCenter</strong>: the left center position.</li>
             * <li><strong>rightCenter</strong>: the right center position.</li>
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
             * <p>The normalized value of the width of the image of video layer N.</p>
             * <ul>
             * <li>If the FillMode parameter of video layer N is set to none, the height of the video image is scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video image is displayed in the original size.</li>
             * <li>If the FillMode parameter of video layer N is set to fit, you must set this parameter to a value greater than <strong>0</strong>. In this case, the video image is scaled with the original aspect ratio to fill in the specified layout section based on this parameter.</li>
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
