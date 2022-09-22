// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkInsightsAnalysisRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkInsightsAnalysisRequest</p>
 */
public class DeleteNetworkInsightsAnalysisRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("NetworkInsightsAnalysisId")
    @Validation(required = true)
    private java.util.List < String > networkInsightsAnalysisId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteNetworkInsightsAnalysisRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.dryRun = builder.dryRun;
        this.networkInsightsAnalysisId = builder.networkInsightsAnalysisId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkInsightsAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
    public java.util.List < String > getNetworkInsightsAnalysisId() {
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

    public static final class Builder extends Request.Builder<DeleteNetworkInsightsAnalysisRequest, Builder> {
        private String sourceRegionId; 
        private Boolean dryRun; 
        private java.util.List < String > networkInsightsAnalysisId; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkInsightsAnalysisRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.dryRun = request.dryRun;
            this.networkInsightsAnalysisId = request.networkInsightsAnalysisId;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
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
        public Builder networkInsightsAnalysisId(java.util.List < String > networkInsightsAnalysisId) {
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

        @Override
        public DeleteNetworkInsightsAnalysisRequest build() {
            return new DeleteNetworkInsightsAnalysisRequest(this);
        } 

    } 

}
