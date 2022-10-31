// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRealtimeLogAuthorizedRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveRealtimeLogAuthorizedRequest</p>
 */
public class DescribeLiveRealtimeLogAuthorizedRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("LiveOpenapiReserve")
    private String liveOpenapiReserve;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeLiveRealtimeLogAuthorizedRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.liveOpenapiReserve = builder.liveOpenapiReserve;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRealtimeLogAuthorizedRequest create() {
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
     * @return liveOpenapiReserve
     */
    public String getLiveOpenapiReserve() {
        return this.liveOpenapiReserve;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeLiveRealtimeLogAuthorizedRequest, Builder> {
        private String regionId; 
        private String liveOpenapiReserve; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveRealtimeLogAuthorizedRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.liveOpenapiReserve = request.liveOpenapiReserve;
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
         * LiveOpenapiReserve.
         */
        public Builder liveOpenapiReserve(String liveOpenapiReserve) {
            this.putQueryParameter("LiveOpenapiReserve", liveOpenapiReserve);
            this.liveOpenapiReserve = liveOpenapiReserve;
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
        public DescribeLiveRealtimeLogAuthorizedRequest build() {
            return new DescribeLiveRealtimeLogAuthorizedRequest(this);
        } 

    } 

}
