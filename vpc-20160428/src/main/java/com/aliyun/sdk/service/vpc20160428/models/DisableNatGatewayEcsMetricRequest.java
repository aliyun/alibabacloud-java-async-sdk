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
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * 
         * **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the NAT gateway for which you want to disable ECS traffic monitoring.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The region ID of the NAT gateway. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
