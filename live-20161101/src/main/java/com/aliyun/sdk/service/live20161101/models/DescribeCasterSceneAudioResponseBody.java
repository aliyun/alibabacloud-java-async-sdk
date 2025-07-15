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
 * {@link DescribeCasterSceneAudioResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterSceneAudioResponseBody</p>
 */
public class DescribeCasterSceneAudioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AudioLayers")
    private AudioLayers audioLayers;

    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("FollowEnable")
    private Integer followEnable;

    @com.aliyun.core.annotation.NameInMap("MixList")
    private MixList mixList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCasterSceneAudioResponseBody(Builder builder) {
        this.audioLayers = builder.audioLayers;
        this.casterId = builder.casterId;
        this.followEnable = builder.followEnable;
        this.mixList = builder.mixList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterSceneAudioResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioLayers
     */
    public AudioLayers getAudioLayers() {
        return this.audioLayers;
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
    public MixList getMixList() {
        return this.mixList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AudioLayers audioLayers; 
        private String casterId; 
        private Integer followEnable; 
        private MixList mixList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCasterSceneAudioResponseBody model) {
            this.audioLayers = model.audioLayers;
            this.casterId = model.casterId;
            this.followEnable = model.followEnable;
            this.mixList = model.mixList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configurations of the audio layers.</p>
         */
        public Builder audioLayers(AudioLayers audioLayers) {
            this.audioLayers = audioLayers;
            return this;
        }

        /**
         * <p>The ID of the production studio. You can specify the ID in a request to start a scene in the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>97df6b7f-3490-47d2-ac50-88338765****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The audio mode. By default, the audio follows video (AFV) mode is used. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the audio mixing mode</li>
         * <li><strong>1</strong>: the AFV mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder followEnable(Integer followEnable) {
            this.followEnable = followEnable;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98745637-3490-47d2-ac50-883387567098</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCasterSceneAudioResponseBody build() {
            return new DescribeCasterSceneAudioResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterSceneAudioResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterSceneAudioResponseBody</p>
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
             * <p>The fixed delay of the audio layer. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder fixedDelayDuration(Integer fixedDelayDuration) {
                this.fixedDelayDuration = fixedDelayDuration;
                return this;
            }

            /**
             * <p>The sound channel type of the audio layer. Valid values:</p>
             * <ul>
             * <li><strong>left</strong>: the left channel</li>
             * <li><strong>right</strong>: the right channel</li>
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
             * <p>The volume of the audio layer.</p>
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
     * {@link DescribeCasterSceneAudioResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterSceneAudioResponseBody</p>
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
     * {@link DescribeCasterSceneAudioResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterSceneAudioResponseBody</p>
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
}
