// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @Query
    @NameInMap("AccountDescription")
    private String accountDescription;

    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    @Validation(required = true)
    private String accountPassword;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private CreateAccountRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.DBInstanceId = builder.DBInstanceId;
        this.databaseName = builder.databaseName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountDescription
     */
    public String getAccountDescription() {
        return this.accountDescription;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String DBInstanceId; 
        private String databaseName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountRequest response) {
            super(response);
            this.accountDescription = response.accountDescription;
            this.accountName = response.accountName;
            this.accountPassword = response.accountPassword;
            this.DBInstanceId = response.DBInstanceId;
            this.databaseName = response.databaseName;
            this.ownerId = response.ownerId;
        } 

        /**
         * AccountDescription.
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AccountPassword.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
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

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

}
