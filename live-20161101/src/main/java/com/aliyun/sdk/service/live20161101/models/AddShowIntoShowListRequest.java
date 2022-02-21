// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShowIntoShowListRequest} extends {@link RequestModel}
 *
 * <p>AddShowIntoShowListRequest</p>
 */
public class AddShowIntoShowListRequest extends Request {
    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("Duration")
    private Long duration;

    @Query
    @NameInMap("LiveInputType")
    private Integer liveInputType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepeatTimes")
    private Integer repeatTimes;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("ResourceUrl")
    private String resourceUrl;

    @Query
    @NameInMap("ShowName")
    private String showName;

    @Query
    @NameInMap("Spot")
    private Integer spot;

    private AddShowIntoShowListRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.duration = builder.duration;
        this.liveInputType = builder.liveInputType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.repeatTimes = builder.repeatTimes;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.resourceUrl = builder.resourceUrl;
        this.showName = builder.showName;
        this.spot = builder.spot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShowIntoShowListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return liveInputType
     */
    public Integer getLiveInputType() {
        return this.liveInputType;
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
     * @return repeatTimes
     */
    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceUrl
     */
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    /**
     * @return showName
     */
    public String getShowName() {
        return this.showName;
    }

    /**
     * @return spot
     */
    public Integer getSpot() {
        return this.spot;
    }

    public static final class Builder extends Request.Builder<AddShowIntoShowListRequest, Builder> {
        private String casterId; 
        private Long duration; 
        private Integer liveInputType; 
        private Long ownerId; 
        private String regionId; 
        private Integer repeatTimes; 
        private String resourceId; 
        private String resourceType; 
        private String resourceUrl; 
        private String showName; 
        private Integer spot; 

        private Builder() {
            super();
        } 

        private Builder(AddShowIntoShowListRequest response) {
            super(response);
            this.casterId = response.casterId;
            this.duration = response.duration;
            this.liveInputType = response.liveInputType;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.repeatTimes = response.repeatTimes;
            this.resourceId = response.resourceId;
            this.resourceType = response.resourceType;
            this.resourceUrl = response.resourceUrl;
            this.showName = response.showName;
            this.spot = response.spot;
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
         * Duration.
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * LiveInputType.
         */
        public Builder liveInputType(Integer liveInputType) {
            this.putQueryParameter("LiveInputType", liveInputType);
            this.liveInputType = liveInputType;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepeatTimes.
         */
        public Builder repeatTimes(Integer repeatTimes) {
            this.putQueryParameter("RepeatTimes", repeatTimes);
            this.repeatTimes = repeatTimes;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ResourceUrl.
         */
        public Builder resourceUrl(String resourceUrl) {
            this.putQueryParameter("ResourceUrl", resourceUrl);
            this.resourceUrl = resourceUrl;
            return this;
        }

        /**
         * ShowName.
         */
        public Builder showName(String showName) {
            this.putQueryParameter("ShowName", showName);
            this.showName = showName;
            return this;
        }

        /**
         * Spot.
         */
        public Builder spot(Integer spot) {
            this.putQueryParameter("Spot", spot);
            this.spot = spot;
            return this;
        }

        @Override
        public AddShowIntoShowListRequest build() {
            return new AddShowIntoShowListRequest(this);
        } 

    } 

}
