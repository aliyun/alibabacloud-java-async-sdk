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
 * {@link UpdateCasterSceneAudioRequest} extends {@link RequestModel}
 *
 * <p>UpdateCasterSceneAudioRequest</p>
 */
public class UpdateCasterSceneAudioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioLayer")
    private java.util.List<AudioLayer> audioLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FollowEnable")
    private Integer followEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixList")
    private java.util.List<String> mixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private UpdateCasterSceneAudioRequest(Builder builder) {
        super(builder);
        this.audioLayer = builder.audioLayer;
        this.casterId = builder.casterId;
        this.followEnable = builder.followEnable;
        this.mixList = builder.mixList;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCasterSceneAudioRequest create() {
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
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return followEnable
     */
    public Integer getFollowEnable() {
        return this.followEnable;
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdateCasterSceneAudioRequest, Builder> {
        private java.util.List<AudioLayer> audioLayer; 
        private String casterId; 
        private Integer followEnable; 
        private java.util.List<String> mixList; 
        private Long ownerId; 
        private String regionId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCasterSceneAudioRequest request) {
            super(request);
            this.audioLayer = request.audioLayer;
            this.casterId = request.casterId;
            this.followEnable = request.followEnable;
            this.mixList = request.mixList;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The audio configurations.</p>
         */
        public Builder audioLayer(java.util.List<AudioLayer> audioLayer) {
            this.putQueryParameter("AudioLayer", audioLayer);
            this.audioLayer = audioLayer;
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
         * <p>The audio mode. By default, the AFV mode is used. If you do not specify this parameter, the scene retains the last configuration. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the audio mixing mode.</li>
         * <li><strong>1</strong>: the AFV mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder followEnable(Integer followEnable) {
            this.putQueryParameter("FollowEnable", followEnable);
            this.followEnable = followEnable;
            return this;
        }

        /**
         * <p>The location IDs of the audio layers, which are in the same order as the audio layers.</p>
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
         * <p>The ID of the scene. If you call the <a href="https://help.aliyun.com/document_detail/2848039.html">DescribeCasterScenes</a> operation to query scenes of the production studio, check the value of the response parameter ComponentId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e1****</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public UpdateCasterSceneAudioRequest build() {
            return new UpdateCasterSceneAudioRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCasterSceneAudioRequest} extends {@link TeaModel}
     *
     * <p>UpdateCasterSceneAudioRequest</p>
     */
    public static class AudioLayer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("FixedDelayDuration")
        private Integer fixedDelayDuration;

        @com.aliyun.core.annotation.NameInMap("ValidChannel")
        private String validChannel;

        @com.aliyun.core.annotation.NameInMap("VolumeRate")
        private Float volumeRate;

        private AudioLayer(Builder builder) {
            this.filter = builder.filter;
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
         * @return filter
         */
        public String getFilter() {
            return this.filter;
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
            private String filter; 
            private Integer fixedDelayDuration; 
            private String validChannel; 
            private Float volumeRate; 

            private Builder() {
            } 

            private Builder(AudioLayer model) {
                this.filter = model.filter;
                this.fixedDelayDuration = model.fixedDelayDuration;
                this.validChannel = model.validChannel;
                this.volumeRate = model.volumeRate;
            } 

            /**
             * <p>Specifies whether to enable the features provided by the audio 3A algorithms. This parameter consists of the following fields:</p>
             * <ul>
             * <li><strong>enableAgc</strong>: specifies whether to enable automatic gain control (AGC). This field is optional. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies that AGC is disabled. <strong>1</strong> specifies that AGC is enabled.</li>
             * <li><strong>enableAns</strong>: specifies whether to enable active noise suppression (ANS). This field is optional. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies that ANS is disabled. <strong>1</strong> specifies that ANS is enabled.</li>
             * <li><strong>ansMode</strong>: specifies the mode for ANS. This field is optional and takes effect only if you set <strong>enableAns</strong> to <strong>1</strong>. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies the speech noise reduction mode. <strong>1</strong> specifies the music noise reduction mode.</li>
             * </ul>
             * <blockquote>
             * <p> To ensure a better noise reduction effect, we recommend that you set ansMode to 1.</p>
             * </blockquote>
             * <ul>
             * <li><strong>enableBeautify</strong>: specifies whether to enable voice change. This field is optional. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies that voice change is disabled. <strong>1</strong> specifies that voice change is enabled.</li>
             * <li><strong>voiceBeautifyMode</strong>: specifies the mode for voice change. This field is optional and takes effect only if you set <strong>enableBeautify</strong> to <strong>1</strong>. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies the magnetic male voice mode. <strong>1</strong> specifies the fresh female voice mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{   &quot;enableAgc&quot;:0,   &quot;enableAns&quot;:1 }</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The fixed delay of the audio layer. This parameter is used to synchronize the audio with subtitles.</p>
             * <p>Unit: milliseconds. Valid values: <strong>0 to 5000</strong>. Default value: <strong>0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The multiple of the original volume at which the audio layer plays audio. Valid values: <strong>0 to 10.0</strong>. Default value: <strong>1.0</strong>.</p>
             * <ul>
             * <li><strong>1.0</strong>: specifies that the audio layer plays audio at the original volume.</li>
             * <li>A value smaller than <strong>1</strong>: specifies that the audio layer plays audio at a volume that is less than the original volume.</li>
             * <li>A value greater than <strong>1</strong>: specifies that the audio layer plays audio at a volume that is more than the original volume.</li>
             * </ul>
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
}
