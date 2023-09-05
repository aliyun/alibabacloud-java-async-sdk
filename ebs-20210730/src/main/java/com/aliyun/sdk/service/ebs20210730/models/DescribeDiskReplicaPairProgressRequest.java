// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaPairProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiskReplicaPairProgressRequest</p>
 */
public class DescribeDiskReplicaPairProgressRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaPairId")
    @Validation(required = true)
    private String replicaPairId;

    private DescribeDiskReplicaPairProgressRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.replicaPairId = builder.replicaPairId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairProgressRequest create() {
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
     * @return replicaPairId
     */
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    public static final class Builder extends Request.Builder<DescribeDiskReplicaPairProgressRequest, Builder> {
        private String regionId; 
        private String replicaPairId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiskReplicaPairProgressRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.replicaPairId = request.replicaPairId;
        } 

        /**
         * The region ID of the replication pair.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~)operation to query the IDs of existing replication pairs.
         */
        public Builder replicaPairId(String replicaPairId) {
            this.putQueryParameter("ReplicaPairId", replicaPairId);
            this.replicaPairId = replicaPairId;
            return this;
        }

        @Override
        public DescribeDiskReplicaPairProgressRequest build() {
            return new DescribeDiskReplicaPairProgressRequest(this);
        } 

    } 

}
