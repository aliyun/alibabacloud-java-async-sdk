// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

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

    private CreateMigrationJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.migrationJobClass = builder.migrationJobClass;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
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

    public static final class Builder extends Request.Builder<CreateMigrationJobRequest, Builder> {
        private String clientToken; 
        private String migrationJobClass; 
        private String ownerId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrationJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.migrationJobClass = request.migrationJobClass;
            this.ownerId = request.ownerId;
            this.region = request.region;
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

        @Override
        public CreateMigrationJobRequest build() {
            return new CreateMigrationJobRequest(this);
        } 

    } 

}
