// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainStreamWaterLevelRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainStreamWaterLevelRequest</p>
 */
public class DescribeLiveDomainStreamWaterLevelRequest extends Request {
    @Query
    @NameInMap("LiveRegion")
    @Validation(required = true)
    private String liveRegion;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeLiveDomainStreamWaterLevelRequest(Builder builder) {
        super(builder);
        this.liveRegion = builder.liveRegion;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainStreamWaterLevelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveRegion
     */
    public String getLiveRegion() {
        return this.liveRegion;
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

    public static final class Builder extends Request.Builder<DescribeLiveDomainStreamWaterLevelRequest, Builder> {
        private String liveRegion; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainStreamWaterLevelRequest response) {
            super(response);
            this.liveRegion = response.liveRegion;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * LiveRegion.
         */
        public Builder liveRegion(String liveRegion) {
            this.putQueryParameter("LiveRegion", liveRegion);
            this.liveRegion = liveRegion;
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

        @Override
        public DescribeLiveDomainStreamWaterLevelRequest build() {
            return new DescribeLiveDomainStreamWaterLevelRequest(this);
        } 

    } 

}
