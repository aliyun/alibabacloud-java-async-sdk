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
 * {@link CalculateNatGatewayCapacityUnitsRequest} extends {@link RequestModel}
 *
 * <p>CalculateNatGatewayCapacityUnitsRequest</p>
 */
public class CalculateNatGatewayCapacityUnitsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NatGatewayPerformanceValues")
    private NatGatewayPerformanceValues natGatewayPerformanceValues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CalculateNatGatewayCapacityUnitsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.natGatewayCapacity = builder.natGatewayCapacity;
        this.natGatewayId = builder.natGatewayId;
        this.natGatewayPerformanceValues = builder.natGatewayPerformanceValues;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CalculateNatGatewayCapacityUnitsRequest create() {
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
     * @return natGatewayPerformanceValues
     */
    public NatGatewayPerformanceValues getNatGatewayPerformanceValues() {
        return this.natGatewayPerformanceValues;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CalculateNatGatewayCapacityUnitsRequest, Builder> {
        private String clientToken; 
        private String dryRun; 
        private NatGatewayCapacity natGatewayCapacity; 
        private String natGatewayId; 
        private NatGatewayPerformanceValues natGatewayPerformanceValues; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CalculateNatGatewayCapacityUnitsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.natGatewayCapacity = request.natGatewayCapacity;
            this.natGatewayId = request.natGatewayId;
            this.natGatewayPerformanceValues = request.natGatewayPerformanceValues;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li>true: performs a dry run. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned. The Internet NAT gateway is not upgraded.</li>
         * <li>false (default): sends a normal request. If the request passes the check, a 2xx HTTP status code is returned and the Internet NAT gateway is upgraded.</li>
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
         * <p>The details of the resource reservation CUs to be calculated.</p>
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
         * <p>ngw-2ze0dcn4mq31qx2jc****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The details of the resource reservation metrics to be calculated.</p>
         */
        public Builder natGatewayPerformanceValues(NatGatewayPerformanceValues natGatewayPerformanceValues) {
            String natGatewayPerformanceValuesShrink = shrink(natGatewayPerformanceValues, "NatGatewayPerformanceValues", "json");
            this.putQueryParameter("NatGatewayPerformanceValues", natGatewayPerformanceValuesShrink);
            this.natGatewayPerformanceValues = natGatewayPerformanceValues;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CalculateNatGatewayCapacityUnitsRequest build() {
            return new CalculateNatGatewayCapacityUnitsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CalculateNatGatewayCapacityUnitsRequest} extends {@link TeaModel}
     *
     * <p>CalculateNatGatewayCapacityUnitsRequest</p>
     */
    public static class NatGatewayCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnits")
        private Integer capacityUnits;

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
        public Integer getCapacityUnits() {
            return this.capacityUnits;
        }

        public static final class Builder {
            private Integer capacityUnits; 

            private Builder() {
            } 

            private Builder(NatGatewayCapacity model) {
                this.capacityUnits = model.capacityUnits;
            } 

            /**
             * <p>The number of reserved LCUs per hour.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacityUnits(Integer capacityUnits) {
                this.capacityUnits = capacityUnits;
                return this;
            }

            public NatGatewayCapacity build() {
                return new NatGatewayCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link CalculateNatGatewayCapacityUnitsRequest} extends {@link TeaModel}
     *
     * <p>CalculateNatGatewayCapacityUnitsRequest</p>
     */
    public static class NatGatewayPerformanceValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Integer cps;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Integer pps;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Integer sessionCount;

        private NatGatewayPerformanceValues(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.cps = builder.cps;
            this.pps = builder.pps;
            this.sessionCount = builder.sessionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayPerformanceValues create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return cps
         */
        public Integer getCps() {
            return this.cps;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        /**
         * @return sessionCount
         */
        public Integer getSessionCount() {
            return this.sessionCount;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Integer cps; 
            private Integer pps; 
            private Integer sessionCount; 

            private Builder() {
            } 

            private Builder(NatGatewayPerformanceValues model) {
                this.bandwidth = model.bandwidth;
                this.cps = model.cps;
                this.pps = model.pps;
                this.sessionCount = model.sessionCount;
            } 

            /**
             * <p>The bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The maximum number of new connections per second.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The number of packets. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder sessionCount(Integer sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            public NatGatewayPerformanceValues build() {
                return new NatGatewayPerformanceValues(this);
            } 

        } 

    }
}
