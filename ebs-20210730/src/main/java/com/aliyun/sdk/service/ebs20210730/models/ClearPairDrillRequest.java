// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClearPairDrillRequest} extends {@link RequestModel}
 *
 * <p>ClearPairDrillRequest</p>
 */
public class ClearPairDrillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the drill. You can call the <a href="https://help.aliyun.com/document_detail/2584480.html">DescribePairDrills</a> operation to query the disaster recovery drills that were performed on replication pairs in a specific region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drill-xxxx</p>
         */
        public Builder drillId(String drillId) {
            this.putQueryParameter("DrillId", drillId);
            this.drillId = drillId;
            return this;
        }

        /**
         * <p>The ID of the replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a> operation to query the most recent list of replication pairs, including replication pair IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pair-xxxx</p>
         */
        public Builder pairId(String pairId) {
            this.putQueryParameter("PairId", pairId);
            this.pairId = pairId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
