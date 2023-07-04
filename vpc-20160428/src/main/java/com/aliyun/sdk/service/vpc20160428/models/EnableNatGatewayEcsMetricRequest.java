// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableNatGatewayEcsMetricRequest} extends {@link RequestModel}
 *
 * <p>EnableNatGatewayEcsMetricRequest</p>
 */
public class EnableNatGatewayEcsMetricRequest extends Request {
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

    private EnableNatGatewayEcsMetricRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.natGatewayId = builder.natGatewayId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableNatGatewayEcsMetricRequest create() {
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

    public static final class Builder extends Request.Builder<EnableNatGatewayEcsMetricRequest, Builder> {
        private Boolean dryRun; 
        private String natGatewayId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableNatGatewayEcsMetricRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.natGatewayId = request.natGatewayId;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to precheck only this request. Valid values:
         * <p>
         * 
         * **true**: The validity of the request is checked but the traffic monitoring feature is not enabled. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether the required parameters are specified. If the request fails the precheck, the corresponding error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * 
         * **false** (default): The validity of the request is checked. If the request passes the precheck, a 2XX HTTP status code is returned and the traffic monitoring feature is enabled.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the NAT gateway for which you want to enable the traffic monitoring feature.
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
        public EnableNatGatewayEcsMetricRequest build() {
            return new EnableNatGatewayEcsMetricRequest(this);
        } 

    } 

}
