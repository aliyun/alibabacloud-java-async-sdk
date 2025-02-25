// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindZoneVpcRequest} extends {@link RequestModel}
 *
 * <p>BindZoneVpcRequest</p>
 */
public class BindZoneVpcRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vpcs")
    private java.util.List < Vpcs> vpcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private BindZoneVpcRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
        private String clientToken; 
        private String lang; 
        private String userClientIp; 
        private java.util.List < Vpcs> vpcs; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(BindZoneVpcRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
            this.vpcs = request.vpcs;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6447728c8578e66aacf062d2df4446dc</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.XX.XX</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>The VPCs.</p>
         * <blockquote>
         * <p> If Vpcs is left empty, all VPCs that are associated with the zone are disassociated from the zone.</p>
         * </blockquote>
         */
        public Builder vpcs(java.util.List < Vpcs> vpcs) {
            this.putQueryParameter("Vpcs", vpcs);
            this.vpcs = vpcs;
            return this;
        }

        /**
         * <p>The zone ID. This ID uniquely identifies the zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34d4031b63c527358b710a61346a****</p>
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

    /**
     * 
     * {@link BindZoneVpcRequest} extends {@link TeaModel}
     *
     * <p>BindZoneVpcRequest</p>
     */
    public static class Vpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        private Vpcs(Builder builder) {
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
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

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        public static final class Builder {
            private String regionId; 
            private String vpcId; 
            private String vpcType; 

            /**
             * <p>The region ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The VPC ID. If the zone is already associated with VPCs and you do not specify this parameter, the associated VPCs are disassociated from the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-f8zvrvr1payllgz38****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC type. Valid values:</p>
             * <ul>
             * <li><strong>STANDARD</strong>: standard VPC</li>
             * <li><strong>EDS</strong>: Elastic Desktop Service (EDS) workspace VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
