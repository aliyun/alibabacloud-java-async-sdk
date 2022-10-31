// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCasterSceneAudioRequest} extends {@link RequestModel}
 *
 * <p>UpdateCasterSceneAudioRequest</p>
 */
public class UpdateCasterSceneAudioRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AudioLayer")
    private java.util.List < AudioLayer> audioLayer;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("FollowEnable")
    private Integer followEnable;

    @Query
    @NameInMap("MixList")
    private java.util.List < String > mixList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private UpdateCasterSceneAudioRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.audioLayer = builder.audioLayer;
        this.casterId = builder.casterId;
        this.followEnable = builder.followEnable;
        this.mixList = builder.mixList;
        this.ownerId = builder.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return audioLayer
     */
    public java.util.List < AudioLayer> getAudioLayer() {
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdateCasterSceneAudioRequest, Builder> {
        private String regionId; 
        private java.util.List < AudioLayer> audioLayer; 
        private String casterId; 
        private Integer followEnable; 
        private java.util.List < String > mixList; 
        private Long ownerId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCasterSceneAudioRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.audioLayer = request.audioLayer;
            this.casterId = request.casterId;
            this.followEnable = request.followEnable;
            this.mixList = request.mixList;
            this.ownerId = request.ownerId;
            this.sceneId = request.sceneId;
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
         * AudioLayer.
         */
        public Builder audioLayer(java.util.List < AudioLayer> audioLayer) {
            this.putQueryParameter("AudioLayer", audioLayer);
            this.audioLayer = audioLayer;
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
         * FollowEnable.
         */
        public Builder followEnable(Integer followEnable) {
            this.putQueryParameter("FollowEnable", followEnable);
            this.followEnable = followEnable;
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
         * SceneId.
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
}
