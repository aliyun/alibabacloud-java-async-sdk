// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupTasksRequest</p>
 */
public class DescribeBackupTasksRequest extends Request {
    @Query
    @NameInMap("BackupJobId")
    private Integer backupJobId;

    @Query
    @NameInMap("BackupJobStatus")
    private String backupJobStatus;

    @Query
    @NameInMap("BackupMode")
    private String backupMode;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Flag")
    private String flag;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeBackupTasksRequest(Builder builder) {
        super(builder);
        this.backupJobId = builder.backupJobId;
        this.backupJobStatus = builder.backupJobStatus;
        this.backupMode = builder.backupMode;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.flag = builder.flag;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupJobId
     */
    public Integer getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * @return backupJobStatus
     */
    public String getBackupJobStatus() {
        return this.backupJobStatus;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
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
     * @return flag
     */
    public String getFlag() {
        return this.flag;
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

    public static final class Builder extends Request.Builder<DescribeBackupTasksRequest, Builder> {
        private Integer backupJobId; 
        private String backupJobStatus; 
        private String backupMode; 
        private String clientToken; 
        private String DBInstanceId; 
        private String flag; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupTasksRequest request) {
            super(request);
            this.backupJobId = request.backupJobId;
            this.backupJobStatus = request.backupJobStatus;
            this.backupMode = request.backupMode;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.flag = request.flag;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the backup task.
         */
        public Builder backupJobId(Integer backupJobId) {
            this.putQueryParameter("BackupJobId", backupJobId);
            this.backupJobId = backupJobId;
            return this;
        }

        /**
         * The status of the backup task. Valid values:
         * <p>
         * 
         * *   **NoStart**
         * *   **Progressing**
         * 
         * By default, this operation returns backup tasks in both states.
         */
        public Builder backupJobStatus(String backupJobStatus) {
            this.putQueryParameter("BackupJobStatus", backupJobStatus);
            this.backupJobStatus = backupJobStatus;
            return this;
        }

        /**
         * The backup mode. Valid values:
         * <p>
         * 
         * *   **Automated**
         * *   **Manual**
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * Specifies the client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder flag(String flag) {
            this.putQueryParameter("Flag", flag);
            this.flag = flag;
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

        @Override
        public DescribeBackupTasksRequest build() {
            return new DescribeBackupTasksRequest(this);
        } 

    } 

}
