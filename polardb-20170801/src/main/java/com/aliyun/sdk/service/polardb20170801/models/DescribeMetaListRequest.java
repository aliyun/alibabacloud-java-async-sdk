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
 * {@link DescribeMetaListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetaListRequest</p>
 */
public class DescribeMetaListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GetDbName")
    private String getDbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeMetaListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupId = builder.backupId;
        this.DBClusterId = builder.DBClusterId;
        this.getDbName = builder.getDbName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionCode = builder.regionCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetaListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return getDbName
     */
    public String getGetDbName() {
        return this.getDbName;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeMetaListRequest, Builder> {
        private String regionId; 
        private String backupId; 
        private String DBClusterId; 
        private String getDbName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetaListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupId = request.backupId;
            this.DBClusterId = request.DBClusterId;
            this.getDbName = request.getDbName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionCode = request.regionCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.securityToken = request.securityToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the data backup file.</p>
         * <blockquote>
         * <ul>
         * <li>When you run a query, you must specify the <code>BackId</code> or <code>RestoreTime</code> parameter.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the ID of the backup set.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters under your account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specify the specific database name (such as <code>test_db</code>) to query the names of all data tables that can be restored in the desired database.</p>
         * <blockquote>
         * <ul>
         * <li>You can specify only one database name each time.</li>
         * <li>If you do not specify this parameter, you can query the names of all databases that can be restored in the current backup set. However, you cannot query the names of data tables in each database.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        public Builder getDbName(String getDbName) {
            this.putQueryParameter("GetDbName", getDbName);
            this.getDbName = getDbName;
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
         * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * <p>Default value: <strong>30</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/2319132.html">DescribeDBClusterAttribute</a> operation to query the region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
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
         * <p>The point in time for the restoration. Specify the time in the YYYY-MM-DDThh:mmZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> When you run a query, you must specify the <code>BackId</code> or <code>RestoreTime</code> parameter. You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the point in time for the restoration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-10-04T01:40:00Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeMetaListRequest build() {
            return new DescribeMetaListRequest(this);
        } 

    } 

}
