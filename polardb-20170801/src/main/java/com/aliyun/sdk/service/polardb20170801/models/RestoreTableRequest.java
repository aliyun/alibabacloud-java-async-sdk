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
 * {@link RestoreTableRequest} extends {@link RequestModel}
 *
 * <p>RestoreTableRequest</p>
 */
public class RestoreTableRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMeta")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMeta;

    private RestoreTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupId = builder.backupId;
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.securityToken = builder.securityToken;
        this.tableMeta = builder.tableMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreTableRequest create() {
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

    /**
     * @return tableMeta
     */
    public String getTableMeta() {
        return this.tableMeta;
    }

    public static final class Builder extends Request.Builder<RestoreTableRequest, Builder> {
        private String regionId; 
        private String backupId; 
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String securityToken; 
        private String tableMeta; 

        private Builder() {
            super();
        } 

        private Builder(RestoreTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupId = request.backupId;
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.securityToken = request.securityToken;
            this.tableMeta = request.tableMeta;
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
         * <p>The backup set ID.</p>
         * <blockquote>
         * <p>This parameter is required if you want to restore databases and tables from a backup set. Call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query backup set IDs.</p>
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
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters in your account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp***************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * <p>The point in time to which you want to restore data. Specify the time in the YYYY-MM-DDThh:mmZ format. The time must be in Coordinated Universal Time (UTC).</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is required if you want to restore data to a specific point in time.</p>
         * </li>
         * <li><p>Data can be restored to any point in time within the last seven days.</p>
         * </li>
         * </ul>
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

        /**
         * <p>A JSON string that specifies the destination databases and tables to restore. All values in the JSON string must be strings.
         * For example: <code>[ { &quot;tables&quot;:[ { &quot;name&quot;:&quot;testtb&quot;, &quot;type&quot;:&quot;table&quot;, &quot;newname&quot;:&quot;testtb_restore&quot; } ], &quot;name&quot;:&quot;testdb&quot;, &quot;type&quot;:&quot;db&quot;, &quot;newname&quot;:&quot;testdb_restore&quot; } ]</code>.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/194770.html">DescribeMetaList</a> operation to query the names of the databases and tables that can be restored. Then, enter the information into the example format.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;tables&quot;:[ { &quot;name&quot;:&quot;testtb&quot;, &quot;type&quot;:&quot;table&quot;, &quot;newname&quot;:&quot;testtb_restore&quot; } ], &quot;name&quot;:&quot;testdb&quot;, &quot;type&quot;:&quot;db&quot;, &quot;newname&quot;:&quot;testdb_restore&quot; } ]</p>
         */
        public Builder tableMeta(String tableMeta) {
            this.putQueryParameter("TableMeta", tableMeta);
            this.tableMeta = tableMeta;
            return this;
        }

        @Override
        public RestoreTableRequest build() {
            return new RestoreTableRequest(this);
        } 

    } 

}
