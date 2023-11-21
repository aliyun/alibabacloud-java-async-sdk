// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretRequest</p>
 */
public class CreateSecretRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Query
    @NameInMap("DbNames")
    private String dbNames;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecretName")
    private String secretName;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private CreateSecretRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbInstanceId = builder.dbInstanceId;
        this.dbNames = builder.dbNames;
        this.description = builder.description;
        this.engine = builder.engine;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretName = builder.secretName;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return dbNames
     */
    public String getDbNames() {
        return this.dbNames;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
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
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateSecretRequest, Builder> {
        private String clientToken; 
        private String dbInstanceId; 
        private String dbNames; 
        private String description; 
        private String engine; 
        private Long ownerId; 
        private String password; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secretName; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecretRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dbInstanceId = request.dbInstanceId;
            this.dbNames = request.dbNames;
            this.description = request.description;
            this.engine = request.engine;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretName = request.secretName;
            this.username = request.username;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the instance ID.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
            return this;
        }

        /**
         * The description of the credential.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The engine of the database.
         * <p>
         * 
         * > Only MySQL is supported.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
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
         * The password that is used to access the database.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the resource group ID.
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
         * The name of the credential.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * The username that is used to access the database.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateSecretRequest build() {
            return new CreateSecretRequest(this);
        } 

    } 

}
