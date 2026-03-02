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
         * AccelerateRegion.
         */
        public Builder accelerateRegion(java.util.List<AccelerateRegion> accelerateRegion) {
            this.putQueryParameter("AccelerateRegion", accelerateRegion);
            this.accelerateRegion = accelerateRegion;
            return this;
        }

        /**
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
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
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
