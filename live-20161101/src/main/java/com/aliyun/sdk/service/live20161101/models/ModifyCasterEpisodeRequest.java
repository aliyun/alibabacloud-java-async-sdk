// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterEpisodeRequest} extends {@link RequestModel}
 *
 * <p>ModifyCasterEpisodeRequest</p>
 */
public class ModifyCasterEpisodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("ComponentId")
    private java.util.List < String > componentId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EpisodeId")
    @Validation(required = true)
    private String episodeId;

    @Query
    @NameInMap("EpisodeName")
    private String episodeName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("SwitchType")
    private String switchType;

    private ModifyCasterEpisodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.endTime = builder.endTime;
        this.episodeId = builder.episodeId;
        this.episodeName = builder.episodeName;
        this.ownerId = builder.ownerId;
        this.resourceId = builder.resourceId;
        this.startTime = builder.startTime;
        this.switchType = builder.switchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterEpisodeRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<ModifyCasterEpisodeRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private java.util.List < String > componentId; 
        private String endTime; 
        private String episodeId; 
        private String episodeName; 
        private Long ownerId; 
        private String resourceId; 
        private String startTime; 
        private String switchType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCasterEpisodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.componentId = request.componentId;
            this.endTime = request.endTime;
            this.episodeId = request.episodeId;
            this.episodeName = request.episodeName;
            this.ownerId = request.ownerId;
            this.resourceId = request.resourceId;
            this.startTime = request.startTime;
            this.switchType = request.switchType;
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
         * ComponentId.
         */
        public Builder componentId(java.util.List < String > componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EpisodeId.
         */
        public Builder episodeId(String episodeId) {
            this.putQueryParameter("EpisodeId", episodeId);
            this.episodeId = episodeId;
            return this;
        }

        /**
         * EpisodeName.
         */
        public Builder episodeName(String episodeName) {
            this.putQueryParameter("EpisodeName", episodeName);
            this.episodeName = episodeName;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * SwitchType.
         */
        public Builder switchType(String switchType) {
            this.putQueryParameter("SwitchType", switchType);
            this.switchType = switchType;
            return this;
        }

        @Override
        public ModifyCasterEpisodeRequest build() {
            return new ModifyCasterEpisodeRequest(this);
        } 

    } 

}
