// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PlayChoosenShowRequest} extends {@link RequestModel}
 *
 * <p>PlayChoosenShowRequest</p>
 */
public class PlayChoosenShowRequest extends Request {
    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowId")
    @Validation(required = true)
    private String showId;

    private PlayChoosenShowRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.showId = builder.showId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlayChoosenShowRequest create() {
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
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    public static final class Builder extends Request.Builder<PlayChoosenShowRequest, Builder> {
        private String casterId; 
        private Long ownerId; 
        private String regionId; 
        private String showId; 

        private Builder() {
            super();
        } 

        private Builder(PlayChoosenShowRequest response) {
            super(response);
            this.casterId = response.casterId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.showId = response.showId;
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
         * ShowId.
         */
        public Builder showId(String showId) {
            this.putQueryParameter("ShowId", showId);
            this.showId = showId;
            return this;
        }

        @Override
        public PlayChoosenShowRequest build() {
            return new PlayChoosenShowRequest(this);
        } 

    } 

}
