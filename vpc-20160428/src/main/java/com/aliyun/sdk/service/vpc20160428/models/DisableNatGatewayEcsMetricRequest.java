// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableNatGatewayEcsMetricRequest} extends {@link RequestModel}
 *
 * <p>DisableNatGatewayEcsMetricRequest</p>
 */
public class DisableNatGatewayEcsMetricRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DisableNatGatewayEcsMetricRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.natGatewayId = builder.natGatewayId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableNatGatewayEcsMetricRequest create() {
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
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DisableNatGatewayEcsMetricRequest, Builder> {
        private Boolean dryRun; 
        private String natGatewayId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisableNatGatewayEcsMetricRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.natGatewayId = request.natGatewayId;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to precheck this request only. Valid values:
         * <p>
         * 
         * **true**: The validity of the request is checked but ECS traffic monitoring is not disabled. Check items include whether your AccessKey pair is valid, whether Resource Access Management (RAM) users are authorized, and whether the required parameters are set. If the request fails the precheck, the corresponding error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * 
         * **false** (default): The validity of the request is checked. If the request passes the precheck, a 2XX HTTP status code is returned and ECS traffic monitoring is disabled.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the NAT gateway for which you want to disable Elastic Compute Service (ECS) traffic monitoring.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The ID of the region where the NAT gateway is deployed. You can call the [DescribeRegions](~~36063~~) operation to query region IDs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DisableNatGatewayEcsMetricRequest build() {
            return new DisableNatGatewayEcsMetricRequest(this);
        } 

    } 

}
