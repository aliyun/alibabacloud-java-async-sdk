// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInsightsAnalysisResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkInsightsAnalysisResultRequest</p>
 */
public class DescribeNetworkInsightsAnalysisResultRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("NetworkInsightsAnalysisId")
    @Validation(required = true)
    private String networkInsightsAnalysisId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    private DescribeNetworkInsightsAnalysisResultRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.networkInsightsAnalysisId = builder.networkInsightsAnalysisId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInsightsAnalysisResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return networkInsightsAnalysisId
     */
    public String getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInsightsAnalysisResultRequest, Builder> {
        private Boolean dryRun; 
        private String networkInsightsAnalysisId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInsightsAnalysisResultRequest response) {
            super(response);
            this.dryRun = response.dryRun;
            this.networkInsightsAnalysisId = response.networkInsightsAnalysisId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceRegionId = response.sourceRegionId;
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * NetworkInsightsAnalysisId.
         */
        public Builder networkInsightsAnalysisId(String networkInsightsAnalysisId) {
            this.putQueryParameter("NetworkInsightsAnalysisId", networkInsightsAnalysisId);
            this.networkInsightsAnalysisId = networkInsightsAnalysisId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public DescribeNetworkInsightsAnalysisResultRequest build() {
            return new DescribeNetworkInsightsAnalysisResultRequest(this);
        } 

    } 

}
