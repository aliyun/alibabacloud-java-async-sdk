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
 * {@link DescribeDBClusterAvailableResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterAvailableResourcesRequest</p>
 */
public class DescribeDBClusterAvailableResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeDBClusterAvailableResourcesRequest(Builder builder) {
        super(builder);
        this.DBNodeClass = builder.DBNodeClass;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAvailableResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeDBClusterAvailableResourcesRequest, Builder> {
        private String DBNodeClass; 
        private String DBType; 
        private String DBVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterAvailableResourcesRequest request) {
            super(request);
            this.DBNodeClass = request.DBNodeClass;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The specifications of the node. For more information, see <a href="https://help.aliyun.com/document_detail/102542.html">Specifications of compute nodes</a>.</p>
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
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * </ul>
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
         * <p>The version of the database engine.
         * Valid values for MySQL:</p>
         * <ul>
         * <li><p><strong>5.6</strong></p>
         * </li>
         * <li><p><strong>5.7</strong></p>
         * </li>
         * <li><p><strong>8.0</strong></p>
         * </li>
         * </ul>
         * <p>Valid values for PostgreSQL:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * </ul>
         * <p>Valid values for Oracle:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when the <strong>DBType</strong> parameter is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: pay-as-you-go (also known as postpaid or hourly billing).</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: subscription (also known as prepaid).</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID. The default value is <strong>cn-hangzhou</strong>.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available regions.</p>
         * </blockquote>
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
         * <p>The zone ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available zones.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeDBClusterAvailableResourcesRequest build() {
            return new DescribeDBClusterAvailableResourcesRequest(this);
        } 

    } 

}
