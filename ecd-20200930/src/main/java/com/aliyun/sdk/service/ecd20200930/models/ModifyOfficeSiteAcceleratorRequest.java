// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyOfficeSiteAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteAcceleratorRequest</p>
 */
public class ModifyOfficeSiteAcceleratorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateRegion")
    private java.util.List<AccelerateRegion> accelerateRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyOfficeSiteAcceleratorRequest(Builder builder) {
        super(builder);
        this.accelerateRegion = builder.accelerateRegion;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteAcceleratorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateRegion
     */
    public java.util.List<AccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyOfficeSiteAcceleratorRequest, Builder> {
        private java.util.List<AccelerateRegion> accelerateRegion; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteAcceleratorRequest request) {
            super(request);
            this.accelerateRegion = request.accelerateRegion;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The information about the regions to accelerate.</p>
         */
        public Builder accelerateRegion(java.util.List<AccelerateRegion> accelerateRegion) {
            this.putQueryParameter("AccelerateRegion", accelerateRegion);
            this.accelerateRegion = accelerateRegion;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
        public ModifyOfficeSiteAcceleratorRequest build() {
            return new ModifyOfficeSiteAcceleratorRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyOfficeSiteAcceleratorRequest} extends {@link TeaModel}
     *
     * <p>ModifyOfficeSiteAcceleratorRequest</p>
     */
    public static class AccelerateRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateRegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accelerateRegionId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        @com.aliyun.core.annotation.Validation(required = true, minimum = 2)
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IspType")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(AccelerateRegion model) {
                this.accelerateRegionId = model.accelerateRegionId;
                this.bandwidth = model.bandwidth;
                this.ipVersion = model.ipVersion;
                this.ispType = model.ispType;
            } 

            /**
             * <p>The ID of the region to accelerate.</p>
             * <p>The number of regions that you can add is limited by the total bandwidth and the instance type of the GA instance. For more information about the number of access regions supported by each instance type, see <a href="t1855472.xdita#">Overview of GA instances</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * <p>The peak public bandwidth. Unit: Mbps.</p>
             * <blockquote>
             * <p>For the pay-by-bandwidth metering method, the value ranges from 10 to 1000.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The IP protocol version used to access GA instances. Valid values:</p>
             * <ul>
             * <li><p><strong>IPv4</strong> (default)</p>
             * </li>
             * <li><p><strong>IPv6</strong></p>
             * </li>
             * <li><p><strong>DUAL_STACK</strong>: IPv4 and IPv6</p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>Only standard pay-as-you-go GA instances support the DUAL_STACK option.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The Internet line type in the acceleration region. Valid values:</p>
             * <ul>
             * <li><p><strong>BGP</strong>: BGP (Multi-ISP) lines.</p>
             * </li>
             * <li><p><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li><p>This parameter is required for GA instances that use the pay-by-data-transfer metering method.</p>
             * </li>
             * <li><p>The supported line types vary based on the acceleration region.</p>
             * </li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
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
