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
 * {@link CreateOfficeSiteAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>CreateOfficeSiteAcceleratorRequest</p>
 */
public class CreateOfficeSiteAcceleratorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AccelerateRegion> accelerateRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateOfficeSiteAcceleratorRequest(Builder builder) {
        super(builder);
        this.accelerateRegion = builder.accelerateRegion;
        this.name = builder.name;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOfficeSiteAcceleratorRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateOfficeSiteAcceleratorRequest, Builder> {
        private java.util.List<AccelerateRegion> accelerateRegion; 
        private String name; 
        private String officeSiteId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOfficeSiteAcceleratorRequest request) {
            super(request);
            this.accelerateRegion = request.accelerateRegion;
            this.name = request.name;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The list of acceleration region information for the access points.</p>
         * <p>This parameter is required.</p>
         */
        public Builder accelerateRegion(java.util.List<AccelerateRegion> accelerateRegion) {
            this.putQueryParameter("AccelerateRegion", accelerateRegion);
            this.accelerateRegion = accelerateRegion;
            return this;
        }

        /**
         * <p>The name of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testGA</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-259382****</p>
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
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-3mtuc28rx95lx****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateOfficeSiteAcceleratorRequest build() {
            return new CreateOfficeSiteAcceleratorRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOfficeSiteAcceleratorRequest} extends {@link TeaModel}
     *
     * <p>CreateOfficeSiteAcceleratorRequest</p>
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
             * <p>The ID of the acceleration region.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * <p>The bandwidth allocated to the acceleration region. Unit: Mbit/s.</p>
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
             * <p>The IP address protocol used to connect to the GA service.</p>
             * <blockquote>
             * <p>The <code>DUAL_STACK</code> type is supported only by standard pay-as-you-go GA instances.</p>
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
             * <p>The public network line type of the acceleration region.</p>
             * <blockquote>
             * <ul>
             * <li>Configure this parameter for GA instances that use the <strong>pay-by-data-transfer</strong> billing method.</li>
             * <li>The supported public network line types vary by acceleration region.</li>
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
