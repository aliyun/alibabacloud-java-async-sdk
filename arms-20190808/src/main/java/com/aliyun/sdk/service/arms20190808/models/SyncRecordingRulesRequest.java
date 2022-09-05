// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncRecordingRulesRequest} extends {@link RequestModel}
 *
 * <p>SyncRecordingRulesRequest</p>
 */
public class SyncRecordingRulesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TargetClusters")
    @Validation(required = true)
    private String targetClusters;

    private SyncRecordingRulesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.targetClusters = builder.targetClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncRecordingRulesRequest create() {
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

    /**
     * @return targetClusters
     */
    public String getTargetClusters() {
        return this.targetClusters;
    }

    public static final class Builder extends Request.Builder<SyncRecordingRulesRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String targetClusters; 

        private Builder() {
            super();
        } 

        private Builder(SyncRecordingRulesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.targetClusters = request.targetClusters;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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

        /**
         * TargetClusters.
         */
        public Builder targetClusters(String targetClusters) {
            this.putQueryParameter("TargetClusters", targetClusters);
            this.targetClusters = targetClusters;
            return this;
        }

        @Override
        public SyncRecordingRulesRequest build() {
            return new SyncRecordingRulesRequest(this);
        } 

    } 

}
