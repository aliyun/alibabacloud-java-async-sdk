// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearPairDrillRequest} extends {@link RequestModel}
 *
 * <p>ClearPairDrillRequest</p>
 */
public class ClearPairDrillRequest extends Request {
    @Query
    @NameInMap("DrillId")
    @Validation(required = true)
    private String drillId;

    @Query
    @NameInMap("PairId")
    @Validation(required = true)
    private String pairId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ClearPairDrillRequest(Builder builder) {
        super(builder);
        this.drillId = builder.drillId;
        this.pairId = builder.pairId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearPairDrillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drillId
     */
    public String getDrillId() {
        return this.drillId;
    }

    /**
     * @return pairId
     */
    public String getPairId() {
        return this.pairId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ClearPairDrillRequest, Builder> {
        private String drillId; 
        private String pairId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ClearPairDrillRequest request) {
            super(request);
            this.drillId = request.drillId;
            this.pairId = request.pairId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the drill. You can call the [DescribePairDrills](~~2584480~~) operation to query the disaster recovery drills that were performed on replication pairs in a specific region.
         */
        public Builder drillId(String drillId) {
            this.putQueryParameter("DrillId", drillId);
            this.drillId = drillId;
            return this;
        }

        /**
         * The ID of the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~) operation to query the most recent list of replication pairs, including replication pair IDs.
         */
        public Builder pairId(String pairId) {
            this.putQueryParameter("PairId", pairId);
            this.pairId = pairId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which async replication is supported.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ClearPairDrillRequest build() {
            return new ClearPairDrillRequest(this);
        } 

    } 

}
