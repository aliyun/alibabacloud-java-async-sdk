// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncUsersRequest} extends {@link RequestModel}
 *
 * <p>SyncUsersRequest</p>
 */
public class SyncUsersRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SyncUsersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SyncUsersRequest, Builder> {
        private String clusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SyncUsersRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the list of E-HPC clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The region ID.
         * <p>
         * 
         * You can call the [ListRegions](~~188593~~) operation to query the list of regions where E-HPC is supported.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SyncUsersRequest build() {
            return new SyncUsersRequest(this);
        } 

    } 

}
