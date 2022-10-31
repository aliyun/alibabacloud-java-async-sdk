// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterProgramRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterProgramRequest</p>
 */
public class ModifyCasterProgramRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("Episode")
    @Validation(required = true)
    private java.util.List < Episode> episode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private ModifyCasterProgramRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.episode = builder.episode;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterProgramRequest create() {
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
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return episode
     */
    public java.util.List < Episode> getEpisode() {
        return this.episode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ModifyCasterProgramRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private java.util.List < Episode> episode; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterProgramRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.episode = request.episode;
            this.ownerId = request.ownerId;
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
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * Episode.
         */
        public Builder episode(java.util.List < Episode> episode) {
            this.putQueryParameter("Episode", episode);
            this.episode = episode;
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

        @Override
        public ModifyCasterProgramRequest build() {
            return new ModifyCasterProgramRequest(this);
        } 

    } 

    public static class Episode extends TeaModel {
        @NameInMap("ComponentId")
        private java.util.List < String > componentId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EpisodeId")
        private String episodeId;

        @NameInMap("EpisodeName")
        private String episodeName;

        @NameInMap("EpisodeType")
        private String episodeType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("SwitchType")
        private String switchType;

        private Episode(Builder builder) {
            this.componentId = builder.componentId;
            this.endTime = builder.endTime;
            this.episodeId = builder.episodeId;
            this.episodeName = builder.episodeName;
            this.episodeType = builder.episodeType;
            this.resourceId = builder.resourceId;
            this.startTime = builder.startTime;
            this.switchType = builder.switchType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Episode create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public java.util.List < String > getComponentId() {
            return this.componentId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return episodeId
         */
        public String getEpisodeId() {
            return this.episodeId;
        }

        /**
         * @return episodeName
         */
        public String getEpisodeName() {
            return this.episodeName;
        }

        /**
         * @return episodeType
         */
        public String getEpisodeType() {
            return this.episodeType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return switchType
         */
        public String getSwitchType() {
            return this.switchType;
        }

        public static final class Builder {
            private java.util.List < String > componentId; 
            private String endTime; 
            private String episodeId; 
            private String episodeName; 
            private String episodeType; 
            private String resourceId; 
            private String startTime; 
            private String switchType; 

            /**
             * ComponentId.
             */
            public Builder componentId(java.util.List < String > componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EpisodeId.
             */
            public Builder episodeId(String episodeId) {
                this.episodeId = episodeId;
                return this;
            }

            /**
             * EpisodeName.
             */
            public Builder episodeName(String episodeName) {
                this.episodeName = episodeName;
                return this;
            }

            /**
             * EpisodeType.
             */
            public Builder episodeType(String episodeType) {
                this.episodeType = episodeType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SwitchType.
             */
            public Builder switchType(String switchType) {
                this.switchType = switchType;
                return this;
            }

            public Episode build() {
                return new Episode(this);
            } 

        } 

    }
}
