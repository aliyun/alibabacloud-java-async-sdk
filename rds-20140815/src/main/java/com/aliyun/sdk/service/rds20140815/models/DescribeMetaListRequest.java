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
 * {@link DescribeMetaListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetaListRequest</p>
 */
public class DescribeMetaListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetID")
    private Long backupSetID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GetDbName")
    private String getDbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pattern")
    private String pattern;

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
    private String restoreType;

    private DescribeMetaListRequest(Builder builder) {
        super(builder);
        this.backupSetID = builder.backupSetID;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.getDbName = builder.getDbName;
        this.ownerId = builder.ownerId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.pattern = builder.pattern;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
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
     * @return backupSetID
     */
    public Long getBackupSetID() {
        return this.backupSetID;
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
     * @return getDbName
     */
    public String getGetDbName() {
        return this.getDbName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
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

    public static final class Builder extends Request.Builder<DescribeMetaListRequest, Builder> {
        private Long backupSetID; 
        private String clientToken; 
        private String DBInstanceId; 
        private String getDbName; 
        private Long ownerId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String pattern; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetaListRequest request) {
            super(request);
            this.backupSetID = request.backupSetID;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.getDbName = request.getDbName;
            this.ownerId = request.ownerId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.pattern = request.pattern;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
        } 

        /**
         * <p>The ID of the backup set from which you want to restore data. You can call the DescribeBackups operation to query the IDs of data backup files.</p>
         * <blockquote>
         * <p> This parameter is required when you set the <strong>RestoreType</strong> parameter to <strong>BackupSetID</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>14358</p>
         */
        public Builder backupSetID(Long backupSetID) {
            this.putQueryParameter("BackupSetID", backupSetID);
            this.backupSetID = backupSetID;
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
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database to query. The system implements exact match based on the value of this parameter and returns the name of the matched database and the names of all tables contained in the database.</p>
         * <blockquote>
         * <p>If you leave this parameter empty, the system returns all databases that are created on the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testdb1</p>
         */
        public Builder getDbName(String getDbName) {
            this.putQueryParameter("GetDbName", getDbName);
            this.getDbName = getDbName;
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
         * <p>The number of the page to return. Valid values: any non-zero positive integer.**** Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>This parameter only takes effect when you specify the <strong>PageSize</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>This parameter only takes effect when you specify the <strong>PageIndex</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the database to query. The system implements fuzzy match based on the value of this parameter and returns only the name of the matched database.</p>
         * <blockquote>
         * <p>For example, if you set the value to <code>test</code>, the system returns <code>testdb1</code> and <code>testdb2</code>. Then, you can specify the <strong>GetDbName</strong> parameter to query tables in the required database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder pattern(String pattern) {
            this.putQueryParameter("Pattern", pattern);
            this.pattern = pattern;
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
         * <p>The point in time to which you want to restore data. The specified point in time must be earlier than the current time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC. You can call the DescribeBackups operation to query the restorable time range.</p>
         * <blockquote>
         * <p> This parameter must be specified when the <strong>RestoreType</strong> parameter is set to <strong>RestoreTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-05-30T03:29:10Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The restoration method that you want to use. Valid values:</p>
         * <ul>
         * <li><strong>BackupSetID</strong>: Data is restored from the backup set. If you use this value, you must also specify the <strong>BackupSetID</strong> parameter.</li>
         * <li><strong>RestoreTime</strong>: Data is restored to a specific point in time. If you use this value, you must also specify the <strong>RestoreTime</strong> parameter.</li>
         * </ul>
         * <p>Default value: <strong>BackupSetID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupSetID</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        @Override
        public DescribeMetaListRequest build() {
            return new DescribeMetaListRequest(this);
        } 

    } 

}
