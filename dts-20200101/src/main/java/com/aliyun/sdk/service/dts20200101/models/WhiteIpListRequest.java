// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WhiteIpListRequest} extends {@link RequestModel}
 *
 * <p>WhiteIpListRequest</p>
 */
public class WhiteIpListRequest extends Request {
    @Query
    @NameInMap("DestinationRegion")
    private String destinationRegion;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private WhiteIpListRequest(Builder builder) {
        super(builder);
        this.destinationRegion = builder.destinationRegion;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.type = builder.type;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WhiteIpListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<WhiteIpListRequest, Builder> {
        private String destinationRegion; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private String type; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(WhiteIpListRequest request) {
            super(request);
            this.destinationRegion = request.destinationRegion;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.type = request.type;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * The HTTP status code.
         */
        public Builder destinationRegion(String destinationRegion) {
            this.putQueryParameter("DestinationRegion", destinationRegion);
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * The ID of the region where the destination instance resides. For more information, see [List of supported regions](~~141033~~).
         * <p>
         * 
         * > 
         * *   If the destination instance is a self-managed database with a public IP address or a third-party cloud database, you can set the parameter to **cn-hangzhou** or the ID of the closest region.
         * *   If the DTS task is a data migration or data synchronization task, you must specify this parameter.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the region where the source instance resides. For more information, see [List of supported regions](~~141033~~).
         * <p>
         * 
         * >  If the source instance is a self-managed database with a public IP address or a third-party cloud database, you can set the parameter to **cn-hangzhou** or the ID of the closest region.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * ZeroEtlJob.
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public WhiteIpListRequest build() {
            return new WhiteIpListRequest(this);
        } 

    } 

}
