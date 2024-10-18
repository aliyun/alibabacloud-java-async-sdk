// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RestoreDdrTableRequest} extends {@link RequestModel}
 *
 * <p>RestoreDdrTableRequest</p>
 */
public class RestoreDdrTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBInstanceName")
    private String sourceDBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    private String sourceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMeta")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMeta;

    private RestoreDdrTableRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.sourceDBInstanceName = builder.sourceDBInstanceName;
        this.sourceRegion = builder.sourceRegion;
        this.tableMeta = builder.tableMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreDdrTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return sourceDBInstanceName
     */
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return tableMeta
     */
    public String getTableMeta() {
        return this.tableMeta;
    }

    public static final class Builder extends Request.Builder<RestoreDdrTableRequest, Builder> {
        private String backupId; 
        private String clientToken; 
        private String DBInstanceId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String sourceDBInstanceName; 
        private String sourceRegion; 
        private String tableMeta; 

        private Builder() {
            super();
        } 

        private Builder(RestoreDdrTableRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.sourceDBInstanceName = request.sourceDBInstanceName;
            this.sourceRegion = request.sourceRegion;
            this.tableMeta = request.tableMeta;
        } 

        /**
         * <p>The cross-region backup set ID. You can call the DescribeCrossRegionBackups operation to query the IDs of the backup sets that are available to an instance.</p>
         * <blockquote>
         * <p> If you set the <strong>RestoreType</strong> parameter to <strong>0</strong>, you must also specify the BackupId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>279563</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The source instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bpxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * <p>The region ID of the destination instance. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
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
         * <p>The point in time to which you want to restore data. The point in time that you specify must be earlier than the current time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p>If <strong>RestoreType</strong> is set to <strong>BackupTime</strong>, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-04-25T16:00:00Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The method that is used to restore data. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: restores data from a backup set. If you set this parameter to 0, you must also specify the <strong>BackupSetId</strong> parameter.</li>
         * <li><strong>1</strong>: restores data to a point in time. If you set this parameter to 1, you must also specify the <strong>RestoreTime</strong>, <strong>SourceRegion</strong>, and <strong>SourceDBInstanceName</strong> parameters.</li>
         * </ul>
         * <p>Default value: <strong>0</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The ID of the source instance whose data you want to restore to a point in time.</p>
         * <blockquote>
         * <p> If you set the <strong>RestoreType</strong> parameter to <strong>1</strong>, you must also specify the SourceDBInstanceName parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bpxxxxx</p>
         */
        public Builder sourceDBInstanceName(String sourceDBInstanceName) {
            this.putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
            this.sourceDBInstanceName = sourceDBInstanceName;
            return this;
        }

        /**
         * <p>The region ID of the source instance if you want to restore data to a point in time.</p>
         * <blockquote>
         * <p>: If you set <strong>RestoreType</strong> to <strong>1</strong>, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * <p>The names of the databases and tables that you want to restore. The value is in the following format: <code>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;&lt;The name of Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Database 1 on the destination instance&gt;&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 1 in Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 1 in Database 1 on the destination instance&gt;&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 2 in Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 2 in Database 1 on the destination instance&gt;&quot;}]},{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;&lt;The name of Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Database 2 on the destination instance&gt;&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 3 in Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 3 in Database 2 on the destination instance&gt;&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 4 in Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 4 in Database 2 on the destination instance&gt;&quot;}]}]</code></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;testdb1&quot;,&quot;newname&quot;:&quot;testdb1&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;test1&quot;,&quot;newname&quot;:&quot;test1_backup&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;test2&quot;,&quot;newname&quot;:&quot;test2_backup&quot;}]}]</p>
         */
        public Builder tableMeta(String tableMeta) {
            this.putQueryParameter("TableMeta", tableMeta);
            this.tableMeta = tableMeta;
            return this;
        }

        @Override
        public RestoreDdrTableRequest build() {
            return new RestoreDdrTableRequest(this);
        } 

    } 

}
