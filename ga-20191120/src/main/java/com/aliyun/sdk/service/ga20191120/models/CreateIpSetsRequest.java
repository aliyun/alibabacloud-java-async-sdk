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

        private Builder(CreateIpSetsRequest response) {
            super(response);
            this.accelerateRegion = response.accelerateRegion;
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.regionId = response.regionId;
        } 

        /**
         * AccelerateRegion.
         */
        public Builder accelerateRegion(java.util.List < AccelerateRegion> accelerateRegion) {
            this.putQueryParameter("AccelerateRegion", accelerateRegion);
            this.accelerateRegion = accelerateRegion;
            return this;
        }

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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

        private AccelerateRegion(Builder builder) {
            this.accelerateRegionId = builder.accelerateRegionId;
            this.bandwidth = builder.bandwidth;
            this.ipVersion = builder.ipVersion;
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

        public static final class Builder {
            private String accelerateRegionId; 
            private Integer bandwidth; 
            private String ipVersion; 

            /**
             * AccelerateRegionId.
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            public AccelerateRegion build() {
                return new AccelerateRegion(this);
            } 

        } 

    }
}
