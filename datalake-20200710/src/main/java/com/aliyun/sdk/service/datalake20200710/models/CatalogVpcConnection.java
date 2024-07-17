// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CatalogVpcConnection} extends {@link TeaModel}
 *
 * <p>CatalogVpcConnection</p>
 */
public class CatalogVpcConnection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
    private String connectionStatus;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private Long creator;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("JdbcUri")
    private String jdbcUri;

    @com.aliyun.core.annotation.NameInMap("Modifier")
    private Long modifier;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private Long owner;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @com.aliyun.core.annotation.NameInMap("ThriftUri")
    private String thriftUri;

    @com.aliyun.core.annotation.NameInMap("VpcConnectionId")
    private String vpcConnectionId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List < Zones> zones;

    private CatalogVpcConnection(Builder builder) {
        this.catalogId = builder.catalogId;
        this.connectionName = builder.connectionName;
        this.connectionStatus = builder.connectionStatus;
        this.creator = builder.creator;
        this.errorMessage = builder.errorMessage;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.jdbcUri = builder.jdbcUri;
        this.modifier = builder.modifier;
        this.owner = builder.owner;
        this.regionId = builder.regionId;
        this.securityGroupIds = builder.securityGroupIds;
        this.thriftUri = builder.thriftUri;
        this.vpcConnectionId = builder.vpcConnectionId;
        this.vpcId = builder.vpcId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogVpcConnection create() {
        return builder().build();
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return jdbcUri
     */
    public String getJdbcUri() {
        return this.jdbcUri;
    }

    /**
     * @return modifier
     */
    public Long getModifier() {
        return this.modifier;
    }

    /**
     * @return owner
     */
    public Long getOwner() {
        return this.owner;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return thriftUri
     */
    public String getThriftUri() {
        return this.thriftUri;
    }

    /**
     * @return vpcConnectionId
     */
    public String getVpcConnectionId() {
        return this.vpcConnectionId;
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
        private String catalogId; 
        private String connectionName; 
        private String connectionStatus; 
        private Long creator; 
        private String errorMessage; 
        private String gmtCreate; 
        private String gmtModified; 
        private String jdbcUri; 
        private Long modifier; 
        private Long owner; 
        private String regionId; 
        private java.util.List < String > securityGroupIds; 
        private String thriftUri; 
        private String vpcConnectionId; 
        private String vpcId; 
        private java.util.List < Zones> zones; 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * ConnectionName.
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * ConnectionStatus.
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(Long creator) {
            this.creator = creator;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * JdbcUri.
         */
        public Builder jdbcUri(String jdbcUri) {
            this.jdbcUri = jdbcUri;
            return this;
        }

        /**
         * Modifier.
         */
        public Builder modifier(Long modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(Long owner) {
            this.owner = owner;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * ThriftUri.
         */
        public Builder thriftUri(String thriftUri) {
            this.thriftUri = thriftUri;
            return this;
        }

        /**
         * VpcConnectionId.
         */
        public Builder vpcConnectionId(String vpcConnectionId) {
            this.vpcConnectionId = vpcConnectionId;
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

        public CatalogVpcConnection build() {
            return new CatalogVpcConnection(this);
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
