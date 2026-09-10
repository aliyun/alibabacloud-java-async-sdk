// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
         * <p>The link type of the cluster. The backend randomly selects a default value. Valid values:</p>
         * <ul>
         * <li><p><strong>lvs</strong>: Linux Virtual Server.</p>
         * </li>
         * <li><p><strong>proxy</strong>: proxy server.</p>
         * </li>
         * <li><p><strong>dns</strong>: Domain Name System.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lvs</p>
         */
        public Builder DBInstanceConnType(String DBInstanceConnType) {
            this.putQueryParameter("DBInstanceConnType", DBInstanceConnType);
            this.DBInstanceConnType = DBInstanceConnType;
            return this;
        }

        /**
         * <p>The node specifications. For more information, see the following documents:</p>
         * <ul>
         * <li><p>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</p>
         * </li>
         * <li><p>PolarDB for PostgreSQL (Oracle Compatible): <a href="https://help.aliyun.com/document_detail/207921.html">Compute node specifications</a>.</p>
         * </li>
         * <li><p>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Compute node specifications</a>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * <p>The database engine type. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version of the database engine.</p>
         * <ul>
         * <li><p>Valid values for MySQL:</p>
         * <ul>
         * <li><p><strong>5.6</strong></p>
         * </li>
         * <li><p><strong>5.7</strong></p>
         * </li>
         * <li><p><strong>8.0</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Valid values for PostgreSQL:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Valid values for Oracle:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>Specifies whether to return the list of zones that support single-zone deployment. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): The list is not returned.</p>
         * </li>
         * <li><p><strong>1</strong>: The list is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dispenseMode(String dispenseMode) {
            this.putQueryParameter("DispenseMode", dispenseMode);
            this.dispenseMode = dispenseMode;
            return this;
        }

        /**
         * <p>Specifies whether to create a MaxScale cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): A MaxScale cluster is created.</p>
         * </li>
         * <li><p><strong>false</strong>: A MaxScale cluster is not created.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The region ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
         * </blockquote>
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

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
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
         * <p>The subdomain. A subdomain is a level below a top-level domain. For example, if the parent domain is \<code>cn-beijing\\</code>, a valid subdomain is \<code>cn-beijing-i-aliyun\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i-aliyun</p>
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available zones.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
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
