// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDatabaseBetweenInstancesRequest} extends {@link RequestModel}
 *
 * <p>ImportDatabaseBetweenInstancesRequest</p>
 */
public class ImportDatabaseBetweenInstancesRequest extends Request {
    @Query
    @NameInMap("DBInfo")
    @Validation(required = true)
    private String DBInfo;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

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

    @Query
    @NameInMap("SourceDBInstanceId")
    @Validation(required = true)
    private String sourceDBInstanceId;

    private ImportDatabaseBetweenInstancesRequest(Builder builder) {
        super(builder);
        this.DBInfo = builder.DBInfo;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceDBInstanceId = builder.sourceDBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDatabaseBetweenInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInfo
     */
    public String getDBInfo() {
        return this.DBInfo;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return sourceDBInstanceId
     */
    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
    }

    public static final class Builder extends Request.Builder<ImportDatabaseBetweenInstancesRequest, Builder> {
        private String DBInfo; 
        private String DBInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceDBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ImportDatabaseBetweenInstancesRequest request) {
            super(request);
            this.DBInfo = request.DBInfo;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceDBInstanceId = request.sourceDBInstanceId;
        } 

        /**
         * The names of the source and destination databases. The value of this parameter is a JSON string.
         * <p>
         * 
         * > If the source and destination instances run SQL Server, the value of this parameter consists of one or more key-value pairs. In each key-value pair, the key specifies the name of the source database, and the value specifies the name of the destination database. A source database can have a different name from the destination database. For example, `{"DBNames":{"srcdb":"destdb","srcdb2":"destmydb2"}}` indicates that srcdb is migrated to destdb and srcdb2 is migrated to destmydb2. The names of source databases cannot be the same, and the names of destination databases cannot be the same.
         */
        public Builder DBInfo(String DBInfo) {
            this.putQueryParameter("DBInfo", DBInfo);
            this.DBInfo = DBInfo;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * The ID of the source instance, which cannot be the same as the ID of the destination instance.
         */
        public Builder sourceDBInstanceId(String sourceDBInstanceId) {
            this.putQueryParameter("SourceDBInstanceId", sourceDBInstanceId);
            this.sourceDBInstanceId = sourceDBInstanceId;
            return this;
        }

        @Override
        public ImportDatabaseBetweenInstancesRequest build() {
            return new ImportDatabaseBetweenInstancesRequest(this);
        } 

    } 

}
