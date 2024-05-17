// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateRegionResourceRequest} extends {@link RequestModel}
 *
 * <p>EvaluateRegionResourceRequest</p>
 */
public class EvaluateRegionResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceConnType")
    private String DBInstanceConnType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispenseMode")
    private String dispenseMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedMaxScaleLink")
    @com.aliyun.core.annotation.Validation(required = true)
    private String needMaxScaleLink;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private EvaluateRegionResourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceConnType = builder.DBInstanceConnType;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.dispenseMode = builder.dispenseMode;
        this.needMaxScaleLink = builder.needMaxScaleLink;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subDomain = builder.subDomain;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateRegionResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceConnType
     */
    public String getDBInstanceConnType() {
        return this.DBInstanceConnType;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return dispenseMode
     */
    public String getDispenseMode() {
        return this.dispenseMode;
    }

    /**
     * @return needMaxScaleLink
     */
    public String getNeedMaxScaleLink() {
        return this.needMaxScaleLink;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<EvaluateRegionResourceRequest, Builder> {
        private String DBInstanceConnType; 
        private String DBNodeClass; 
        private String DBType; 
        private String DBVersion; 
        private String dispenseMode; 
        private String needMaxScaleLink; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subDomain; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(EvaluateRegionResourceRequest request) {
            super(request);
            this.DBInstanceConnType = request.DBInstanceConnType;
            this.DBNodeClass = request.DBNodeClass;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.dispenseMode = request.dispenseMode;
            this.needMaxScaleLink = request.needMaxScaleLink;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subDomain = request.subDomain;
            this.zoneId = request.zoneId;
        } 

        /**
         * The cluster link type. The backend randomly selects the default value. Valid values:
         * <p>
         * 
         * *   **lvs** :Linux virtual server
         * *   **proxy**: proxy server
         * *   **dns**: domain name system
         */
        public Builder DBInstanceConnType(String DBInstanceConnType) {
            this.putQueryParameter("DBInstanceConnType", DBInstanceConnType);
            this.DBInstanceConnType = DBInstanceConnType;
            return this;
        }

        /**
         * The specifications of the node. For information about node specifications, see the following topics:
         * <p>
         * 
         * *   PolarDB for MySQL: [Specifications of compute nodes](~~102542~~)
         * *   PolarDB for Oracle: [Specifications of compute nodes](~~207921~~)
         * *   PolarDB for PostgreSQL: [Specifications of compute nodes](~~209380~~)
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * The type of the database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PostgreSQL**
         * *   **Oracle**
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * The version of the database engine
         * <p>
         * 
         * *   Valid values for the MySQL database engine:
         * 
         *     *   **5.6**
         *     *   **5.7**
         *     *   **8.0**
         * 
         * *   Valid values for the PostgreSQL database engine:
         * 
         *     *   **11**
         *     *   **14**
         * 
         * *   Valid value for the Oracle database engine: **11**
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * Specifies whether to return the zones in which the single-zone deployment method is supported. Default value: 0. Valid values:
         * <p>
         * 
         * *   **0**: no value returned
         * *   **1**: returns the zones.
         */
        public Builder dispenseMode(String dispenseMode) {
            this.putQueryParameter("DispenseMode", dispenseMode);
            this.dispenseMode = dispenseMode;
            return this;
        }

        /**
         * Specifies whether Maxscale is created. Default value: true. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder needMaxScaleLink(String needMaxScaleLink) {
            this.putQueryParameter("NeedMaxScaleLink", needMaxScaleLink);
            this.needMaxScaleLink = needMaxScaleLink;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The region ID.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~98041~~) operation to query available regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The subdomain. It is the child domain of the top-level domain name or parent domain. For example, if the parent domain name is cn-beijing, its child domain can be cn-beijing-i-aliyun.
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * The zone ID.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~98041~~) operation to query available zones.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public EvaluateRegionResourceRequest build() {
            return new EvaluateRegionResourceRequest(this);
        } 

    } 

}
