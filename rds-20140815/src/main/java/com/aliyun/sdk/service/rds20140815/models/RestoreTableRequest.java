// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("InstantRecovery")
    private Boolean instantRecovery;

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
    @com.aliyun.core.annotation.NameInMap("TableMeta")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMeta;

    private RestoreTableRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.instantRecovery = builder.instantRecovery;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
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
     * @return instantRecovery
     */
    public Boolean getInstantRecovery() {
        return this.instantRecovery;
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
     * @return tableMeta
     */
    public String getTableMeta() {
        return this.tableMeta;
    }

    public static final class Builder extends Request.Builder<RestoreTableRequest, Builder> {
        private String backupId; 
        private String clientToken; 
        private String DBInstanceId; 
        private Boolean instantRecovery; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String tableMeta; 

        private Builder() {
            super();
        } 

        private Builder(RestoreTableRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.instantRecovery = request.instantRecovery;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.tableMeta = request.tableMeta;
        } 

        /**
         * <p>The backup set ID. You can call the DescribeBackups operation to obtain the backup set ID.</p>
         * <blockquote>
         * <p> You must specify at least one of <strong>BackupId</strong> or <strong>RestoreTime</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9026262</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the fast restoration feature for individual databases and tables. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/103175.html">Restore individual databases and tables of an ApsaraDB RDS for MySQL instance</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder instantRecovery(Boolean instantRecovery) {
            this.putQueryParameter("InstantRecovery", instantRecovery);
            this.instantRecovery = instantRecovery;
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
         * <p>The point in time to which you want to restore data. The point in time must fall within the specified log backup retention period. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of <strong>BackupId</strong> and <strong>RestoreTime</strong>.</li>
         * <li>You must enable the log backup feature. For more information, see <a href="https://help.aliyun.com/document_detail/98818.html">Back up an ApsaraDB RDS for MySQL instance</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2011-06-11T16:00:00Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The names of the databases and tables that you want to restore for the source instance.</p>
         * <blockquote>
         * <p> ApsaraDB RDS for PostgreSQL allows you to restore only specified databases, not tables.</p>
         * </blockquote>
         * <ul>
         * <li>ApsaraDB RDS for MySQL: <code>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;&lt;The name of Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Database 1 on the destination instance&gt;&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 1 in Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 1 in Database 1 on the destination instance&gt;&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 2 in Database 1 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 2 in Database 1 on the destination instance&gt;&quot;}]},{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;&lt;The name of Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Database 2 on the destination instance&gt;&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 3 in Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 3 in Database 2 on the destination instance&gt;&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;&lt;The name of Table 4 in Database 2 on the source instance&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Table 4 in Database 2 on the destination instance&gt;&quot;}]}]</code></li>
         * <li>ApsaraDB RDS for PostgreSQL: <code>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;&lt;The name of Database 1 on the source instance 1&gt;&quot;,&quot;newname&quot;:&quot;&lt;The name of Database 1 on the destination instance&gt;&quot;}]</code></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;testdb1&quot;,&quot;newname&quot;:&quot;testdb1_new&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;testdb1table1&quot;,&quot;newname&quot;:&quot;testdb1table1_new&quot;}]}]</p>
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
