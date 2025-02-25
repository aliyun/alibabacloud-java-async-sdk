// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CatalogVpcConnectionInput} extends {@link TeaModel}
 *
 * <p>CatalogVpcConnectionInput</p>
 */
public class CatalogVpcConnectionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List < Zones> zones;

    private CatalogVpcConnectionInput(Builder builder) {
        this.connectionName = builder.connectionName;
        this.securityGroupIds = builder.securityGroupIds;
        this.vpcId = builder.vpcId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogVpcConnectionInput create() {
        return builder().build();
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zones
     */
    public java.util.List < Zones> getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String connectionName; 
        private java.util.List < String > securityGroupIds; 
        private String vpcId; 
        private java.util.List < Zones> zones; 

        /**
         * ConnectionName.
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Zones.
         */
        public Builder zones(java.util.List < Zones> zones) {
            this.zones = zones;
            return this;
        }

        public CatalogVpcConnectionInput build() {
            return new CatalogVpcConnectionInput(this);
        } 

    } 

    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.ip = builder.ip;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String ip; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}
