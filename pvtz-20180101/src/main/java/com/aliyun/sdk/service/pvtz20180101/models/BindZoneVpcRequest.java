// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindZoneVpcRequest} extends {@link RequestModel}
 *
 * <p>BindZoneVpcRequest</p>
 */
public class BindZoneVpcRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("Vpcs")
    private java.util.List < Vpcs> vpcs;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private BindZoneVpcRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
        this.vpcs = builder.vpcs;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindZoneVpcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return vpcs
     */
    public java.util.List < Vpcs> getVpcs() {
        return this.vpcs;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<BindZoneVpcRequest, Builder> {
        private String lang; 
        private String userClientIp; 
        private java.util.List < Vpcs> vpcs; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(BindZoneVpcRequest response) {
            super(response);
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
            this.vpcs = response.vpcs;
            this.zoneId = response.zoneId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * Vpcs.
         */
        public Builder vpcs(java.util.List < Vpcs> vpcs) {
            this.putQueryParameter("Vpcs", vpcs);
            this.vpcs = vpcs;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public BindZoneVpcRequest build() {
            return new BindZoneVpcRequest(this);
        } 

    } 

    public static class Vpcs extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpcId")
        private String vpcId;

        private Vpcs(Builder builder) {
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpcs create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String regionId; 
            private String vpcId; 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
