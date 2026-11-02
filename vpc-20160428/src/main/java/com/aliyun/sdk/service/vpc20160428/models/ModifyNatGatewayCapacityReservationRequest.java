// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyNatGatewayCapacityReservationRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatGatewayCapacityReservationRequest</p>
 */
public class ModifyNatGatewayCapacityReservationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayCapacity")
    private NatGatewayCapacity natGatewayCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetCapacityReservation")
    private String resetCapacityReservation;

    private ModifyNatGatewayCapacityReservationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.natGatewayCapacity = builder.natGatewayCapacity;
        this.natGatewayId = builder.natGatewayId;
        this.regionId = builder.regionId;
        this.resetCapacityReservation = builder.resetCapacityReservation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatGatewayCapacityReservationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return natGatewayCapacity
     */
    public NatGatewayCapacity getNatGatewayCapacity() {
        return this.natGatewayCapacity;
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

    /**
     * @return resetCapacityReservation
     */
    public String getResetCapacityReservation() {
        return this.resetCapacityReservation;
    }

    public static final class Builder extends Request.Builder<ModifyNatGatewayCapacityReservationRequest, Builder> {
        private String clientToken; 
        private String dryRun; 
        private NatGatewayCapacity natGatewayCapacity; 
        private String natGatewayId; 
        private String regionId; 
        private String resetCapacityReservation; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatGatewayCapacityReservationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.natGatewayCapacity = request.natGatewayCapacity;
            this.natGatewayId = request.natGatewayId;
            this.regionId = request.regionId;
            this.resetCapacityReservation = request.resetCapacityReservation;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters. Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li>true: performs a dry run without upgrading the Internet NAT gateway. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
         * <li>false (default): sends a Normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the Internet NAT gateway is upgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The number of capacity units (CUs) for the NAT resource reservation.</p>
         */
        public Builder natGatewayCapacity(NatGatewayCapacity natGatewayCapacity) {
            String natGatewayCapacityShrink = shrink(natGatewayCapacity, "NatGatewayCapacity", "json");
            this.putQueryParameter("NatGatewayCapacity", natGatewayCapacityShrink);
            this.natGatewayCapacity = natGatewayCapacity;
            return this;
        }

        /**
         * <p>The instance ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-112za33e4****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The region ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to cancel the resource reservation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: cancels the resource reservation.</li>
         * <li><strong>false</strong> (default): does not cancel the resource reservation. This parameter is optional when you create or modify a resource reservation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resetCapacityReservation(String resetCapacityReservation) {
            this.putQueryParameter("ResetCapacityReservation", resetCapacityReservation);
            this.resetCapacityReservation = resetCapacityReservation;
            return this;
        }

        @Override
        public ModifyNatGatewayCapacityReservationRequest build() {
            return new ModifyNatGatewayCapacityReservationRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyNatGatewayCapacityReservationRequest} extends {@link TeaModel}
     *
     * <p>ModifyNatGatewayCapacityReservationRequest</p>
     */
    public static class NatGatewayCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnits")
        private Double capacityUnits;

        private NatGatewayCapacity(Builder builder) {
            this.capacityUnits = builder.capacityUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayCapacity create() {
            return builder().build();
        }

        /**
         * @return capacityUnits
         */
        public Double getCapacityUnits() {
            return this.capacityUnits;
        }

        public static final class Builder {
            private Double capacityUnits; 

            private Builder() {
            } 

            private Builder(NatGatewayCapacity model) {
                this.capacityUnits = model.capacityUnits;
            } 

            /**
             * <p>The number of LCUs reserved per hour.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacityUnits(Double capacityUnits) {
                this.capacityUnits = capacityUnits;
                return this;
            }

            public NatGatewayCapacity build() {
                return new NatGatewayCapacity(this);
            } 

        } 

    }
}
