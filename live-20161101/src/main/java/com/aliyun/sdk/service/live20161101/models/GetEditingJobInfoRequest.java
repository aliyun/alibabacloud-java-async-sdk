// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingJobInfoRequest} extends {@link RequestModel}
 *
 * <p>GetEditingJobInfoRequest</p>
 */
public class GetEditingJobInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ShowId")
    private String showId;

    private GetEditingJobInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.showId = builder.showId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEditingJobInfoRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    public static final class Builder extends Request.Builder<GetEditingJobInfoRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private Long ownerId; 
        private String showId; 

        private Builder() {
            super();
        } 

        private Builder(GetEditingJobInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.showId = request.showId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public GetEditingJobInfoRequest build() {
            return new GetEditingJobInfoRequest(this);
        } 

    } 

}
