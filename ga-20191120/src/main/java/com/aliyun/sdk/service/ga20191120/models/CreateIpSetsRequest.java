// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpSetsRequest} extends {@link RequestModel}
 *
 * <p>CreateIpSetsRequest</p>
 */
public class CreateIpSetsRequest extends Request {
    @Query
    @NameInMap("AccelerateRegion")
    @Validation(required = true)
    private java.util.List < AccelerateRegion> accelerateRegion;

    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateIpSetsRequest(Builder builder) {
        super(builder);
        this.accelerateRegion = builder.accelerateRegion;
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpSetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateRegion
     */
    public java.util.List < AccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateIpSetsRequest, Builder> {
        private java.util.List < AccelerateRegion> accelerateRegion; 
        private String acceleratorId; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpSetsRequest request) {
            super(request);
            this.accelerateRegion = request.accelerateRegion;
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * The information about the acceleration regions.
         */
        public Builder accelerateRegion(java.util.List < AccelerateRegion> accelerateRegion) {
            this.putQueryParameter("AccelerateRegion", accelerateRegion);
            this.accelerateRegion = accelerateRegion;
            return this;
        }

        /**
         * The GA instance ID.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateIpSetsRequest build() {
            return new CreateIpSetsRequest(this);
        } 

    } 

    public static class AccelerateRegion extends TeaModel {
        @NameInMap("AccelerateRegionId")
        @Validation(required = true)
        private String accelerateRegionId;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("IspType")
        private String ispType;

        private AccelerateRegion(Builder builder) {
            this.accelerateRegionId = builder.accelerateRegionId;
            this.bandwidth = builder.bandwidth;
            this.ipVersion = builder.ipVersion;
            this.ispType = builder.ispType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccelerateRegion create() {
            return builder().build();
        }

        /**
         * @return accelerateRegionId
         */
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return ispType
         */
        public String getIspType() {
            return this.ispType;
        }

        public static final class Builder {
            private String accelerateRegionId; 
            private Integer bandwidth; 
            private String ipVersion; 
            private String ispType; 

            /**
             * The ID of the acceleration region.
             * <p>
             * 
             * The number of regions that you can add varies based on the specification of the GA instance. For more information, see [Overview](~~153127~~).
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * The bandwidth that you want to allocate to the acceleration region. Unit: **Mbit/s**.
             * <p>
             * 
             * >*  This parameter is required.
             * >*   You must allocate at least 2 Mbit/s of bandwidth to each acceleration region.
             * >*   The total bandwidth of all acceleration regions cannot exceed the bandwidth limit of your basic bandwidth plan.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The IP version used to connect to the GA instance. Valid values:
             * <p>
             * 
             * *   **IPv4** (default)
             * *   **IPv6**
             * *   **DUAL_STACK**: IPv4 and IPv6
             * 
             * > Only pay-as-you-go standard GA instances support DUAL_STACK.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The line type of the elastic IP address (EIP) in the acceleration region. Valid values:
             * <p>
             * 
             * *   **BGP**: BGP (Multi-ISP) lines.
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines
             * 
             * > *   This parameter is required only if the bandwidth metering method of the GA instance is **pay-by-data transfer**.
             * >*   Different acceleration regions support different line types of EIPs.
             */
            public Builder ispType(String ispType) {
                this.ispType = ispType;
                return this;
            }

            public AccelerateRegion build() {
                return new AccelerateRegion(this);
            } 

        } 

    }
}
