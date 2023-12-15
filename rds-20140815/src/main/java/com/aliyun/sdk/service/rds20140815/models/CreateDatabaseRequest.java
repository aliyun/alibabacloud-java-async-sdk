// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @Query
    @NameInMap("CharacterSetName")
    @Validation(required = true)
    private String characterSetName;

    @Query
    @NameInMap("DBDescription")
    private String DBDescription;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBName")
    @Validation(required = true)
    private String DBName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.characterSetName = builder.characterSetName;
        this.DBDescription = builder.DBDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return characterSetName
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * @return DBDescription
     */
    public String getDBDescription() {
        return this.DBDescription;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
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

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String characterSetName; 
        private String DBDescription; 
        private String DBInstanceId; 
        private String DBName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest request) {
            super(request);
            this.characterSetName = request.characterSetName;
            this.DBDescription = request.DBDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The character set.
         * <p>
         * 
         * *   Valid values for MySQL or MariaDB databases: **utf8, gbk, latin1, and utf8mb4**
         * 
         * *   Valid values for SQL Server databases: **Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1\_General_CP1\_CI_AS, SQL_Latin1\_General_CP1\_CS_AS, and Chinese_PRC_BIN**
         * 
         * *   Valid values for PostgreSQL databases: a value in the `Character set,<Collate>,<Ctype>` format. Example: `UTF8,C,en_US.utf8`.
         * 
         *     *   Valid values for the character set: **KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS\_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO\_8859\_5, ISO\_8859\_6, ISO\_8859\_7, ISO\_8859\_8, and SQL_ASCII**
         *     *   Valid values for the **Collate** field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is **C**.
         *     *   Valid values for the **Ctype** field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is **en_US.utf8**.
         */
        public Builder characterSetName(String characterSetName) {
            this.putQueryParameter("CharacterSetName", characterSetName);
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * The description of the database. The description must be 2 to 256 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The description must start with a letter.
         * <p>
         * 
         * > The value cannot start with `http://` or `https://`.
         */
        public Builder DBDescription(String DBDescription) {
            this.putQueryParameter("DBDescription", DBDescription);
            this.DBDescription = DBDescription;
            return this;
        }

        /**
         * The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the database.
         * <p>
         * 
         * > *   The name must be 2 to 64 characters in length.
         * > *   The name must start with a lowercase letter and end with a lowercase letter or digit.
         * > *   The name can contain lowercase letters, digits, underscores (\_), and hyphens (-).
         * > *   The name must be unique within the instance.
         * > *   For more information about invalid characters, see [Forbidden keywords table](~~26317~~).
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
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

        @Override
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
