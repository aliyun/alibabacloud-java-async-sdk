// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFieldStatisticsRequest</p>
 */
public class DescribeFieldStatisticsRequest extends Request {
    @Query
    @NameInMap("MachineTypes")
    private String machineTypes;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFieldStatisticsRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFieldStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFieldStatisticsRequest, Builder> {
        private String machineTypes; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFieldStatisticsRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
            this.regionId = request.regionId;
        } 

        /**
         * The type of the asset to query. If no asset types are specified, all types of assets are returned. Valid values:
         * <p>
         * 
         * *   **ecs**: server
         * *   **cloud_product**: Alibaba Cloud service
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * The ID of the region in which the asset resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFieldStatisticsRequest build() {
            return new DescribeFieldStatisticsRequest(this);
        } 

    } 

}
