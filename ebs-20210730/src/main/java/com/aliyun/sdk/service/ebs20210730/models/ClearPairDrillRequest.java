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
         * DrillId.
         */
        public Builder drillId(String drillId) {
            this.putQueryParameter("DrillId", drillId);
            this.drillId = drillId;
            return this;
        }

        /**
         * PairId.
         */
        public Builder pairId(String pairId) {
            this.putQueryParameter("PairId", pairId);
            this.pairId = pairId;
            return this;
        }

        /**
         * RegionId.
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
