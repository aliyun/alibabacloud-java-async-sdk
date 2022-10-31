// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyShowListRequest} extends {@link RequestModel}
 *
 * <p>ModifyShowListRequest</p>
 */
public class ModifyShowListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("HighPriorityShowId")
    private String highPriorityShowId;

    @Query
    @NameInMap("HighPriorityShowStartTime")
    private String highPriorityShowStartTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RepeatTimes")
    private Integer repeatTimes;

    @Query
    @NameInMap("ShowId")
    private String showId;

    @Query
    @NameInMap("Spot")
    private Integer spot;

    private ModifyShowListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.highPriorityShowId = builder.highPriorityShowId;
        this.highPriorityShowStartTime = builder.highPriorityShowStartTime;
        this.ownerId = builder.ownerId;
        this.repeatTimes = builder.repeatTimes;
        this.showId = builder.showId;
        this.spot = builder.spot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyShowListRequest create() {
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
     * @return highPriorityShowId
     */
    public String getHighPriorityShowId() {
        return this.highPriorityShowId;
    }

    /**
     * @return highPriorityShowStartTime
     */
    public String getHighPriorityShowStartTime() {
        return this.highPriorityShowStartTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return repeatTimes
     */
    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    /**
     * @return spot
     */
    public Integer getSpot() {
        return this.spot;
    }

    public static final class Builder extends Request.Builder<ModifyShowListRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private String highPriorityShowId; 
        private String highPriorityShowStartTime; 
        private Long ownerId; 
        private Integer repeatTimes; 
        private String showId; 
        private Integer spot; 

        private Builder() {
            super();
        } 

        private Builder(ModifyShowListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.highPriorityShowId = request.highPriorityShowId;
            this.highPriorityShowStartTime = request.highPriorityShowStartTime;
            this.ownerId = request.ownerId;
            this.repeatTimes = request.repeatTimes;
            this.showId = request.showId;
            this.spot = request.spot;
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
         * HighPriorityShowId.
         */
        public Builder highPriorityShowId(String highPriorityShowId) {
            this.putQueryParameter("HighPriorityShowId", highPriorityShowId);
            this.highPriorityShowId = highPriorityShowId;
            return this;
        }

        /**
         * HighPriorityShowStartTime.
         */
        public Builder highPriorityShowStartTime(String highPriorityShowStartTime) {
            this.putQueryParameter("HighPriorityShowStartTime", highPriorityShowStartTime);
            this.highPriorityShowStartTime = highPriorityShowStartTime;
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
         * RepeatTimes.
         */
        public Builder repeatTimes(Integer repeatTimes) {
            this.putQueryParameter("RepeatTimes", repeatTimes);
            this.repeatTimes = repeatTimes;
            return this;
        }

        /**
         * ShowId.
         */
        public Builder showId(String showId) {
            this.putQueryParameter("ShowId", showId);
            this.showId = showId;
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
        public ModifyShowListRequest build() {
            return new ModifyShowListRequest(this);
        } 

    } 

}
