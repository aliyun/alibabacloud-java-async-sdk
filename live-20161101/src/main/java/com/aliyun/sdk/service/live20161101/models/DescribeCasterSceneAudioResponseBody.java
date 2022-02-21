// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterSceneAudioResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterSceneAudioResponseBody</p>
 */
public class DescribeCasterSceneAudioResponseBody extends TeaModel {
    @NameInMap("AudioLayers")
    private AudioLayers audioLayers;

    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("FollowEnable")
    private Integer followEnable;

    @NameInMap("MixList")
    private MixList mixList;

    @NameInMap("RequestId")
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

        /**
         * AudioLayers.
         */
        public Builder audioLayers(AudioLayers audioLayers) {
            this.audioLayers = audioLayers;
            return this;
        }

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * FollowEnable.
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCasterSceneAudioResponseBody build() {
            return new DescribeCasterSceneAudioResponseBody(this);
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
}
