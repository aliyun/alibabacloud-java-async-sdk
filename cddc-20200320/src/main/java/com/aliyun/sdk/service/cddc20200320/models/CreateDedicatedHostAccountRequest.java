// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedHostAccountRequest</p>
 */
public class CreateDedicatedHostAccountRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    @Validation(required = true)
    private String accountPassword;

    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("BastionInstanceId")
    private String bastionInstanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    private String dedicatedHostId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDedicatedHostAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.accountType = builder.accountType;
        this.bastionInstanceId = builder.bastionInstanceId;
        this.clientToken = builder.clientToken;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return bastionInstanceId
     */
    public String getBastionInstanceId() {
        return this.bastionInstanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
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

    public static final class Builder extends Request.Builder<CreateDedicatedHostAccountRequest, Builder> {
        private String accountName; 
        private String accountPassword; 
        private String accountType; 
        private String bastionInstanceId; 
        private String clientToken; 
        private String dedicatedHostId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedHostAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.accountType = request.accountType;
            this.bastionInstanceId = request.bastionInstanceId;
            this.clientToken = request.clientToken;
            this.dedicatedHostId = request.dedicatedHostId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The name of the host account.
         * <p>
         * 
         * *   The name must be 2 to 16 characters in length.
         * *   The name must start with a lowercase letter and end with a lowercase letter or a digit.
         * *   The name can contain lowercase letters, digits, and underscores (\_).
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The password of the host account.
         * <p>
         * 
         * *   The password must be 6 to 32 characters in length.
         * *   The password must contain three of the following character types: upper letters, lower letters, digits, and special characters.
         * *   The password can contain the following special characters: `! @ # $ % ^ & * ( ) _ + - =`
         * 
         * >  If your host runs SQL Server, the password cannot contain the account name (case-insensitive).
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * The type of the host account. Valid values:
         * <p>
         * 
         * *   **Normal**: standard account.
         * *   **Admin**: administrator account.
         * 
         * For more information, see [Host permissions](~~176240~~).
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * The ID of the bastion host with which the host is associated. You can log on to the ApsaraDB for MyBase console and go to the **Bastion Hosts** page to view the bastion host ID.
         */
        public Builder bastionInstanceId(String bastionInstanceId) {
            this.putQueryParameter("BastionInstanceId", bastionInstanceId);
            this.bastionInstanceId = bastionInstanceId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The host ID. You can call the [DescribeDedicatedHosts](~~200944~~) operation to query the host ID.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
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
         * The region ID of the host. You can call the [DescribeDedicatedHostAttribute](~~213010~~) operation to query the region ID.
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

        @Override
        public CreateDedicatedHostAccountRequest build() {
            return new CreateDedicatedHostAccountRequest(this);
        } 

    } 

}
