// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrationJobRequest</p>
 */
public class CreateMigrationJobRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MigrationJobClass")
    @Validation(required = true)
    private String migrationJobClass;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateMigrationJobRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.migrationJobClass = builder.migrationJobClass;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return migrationJobClass
     */
    public String getMigrationJobClass() {
        return this.migrationJobClass;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateMigrationJobRequest, Builder> {
        private String accountId; 
        private String clientToken; 
        private String migrationJobClass; 
        private String ownerId; 
        private String region; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrationJobRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.clientToken = response.clientToken;
            this.migrationJobClass = response.migrationJobClass;
            this.ownerId = response.ownerId;
            this.region = response.region;
            this.regionId = response.regionId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * MigrationJobClass.
         */
        public Builder migrationJobClass(String migrationJobClass) {
            this.putQueryParameter("MigrationJobClass", migrationJobClass);
            this.migrationJobClass = migrationJobClass;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateMigrationJobRequest build() {
            return new CreateMigrationJobRequest(this);
        } 

    } 

}
