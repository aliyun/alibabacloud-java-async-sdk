// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteMigrationJobRequest</p>
 */
public class DeleteMigrationJobRequest extends Request {
    @Query
    @NameInMap("MigrationJobId")
    @Validation(required = true)
    private String migrationJobId;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    private DeleteMigrationJobRequest(Builder builder) {
        super(builder);
        this.migrationJobId = builder.migrationJobId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMigrationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteMigrationJobRequest, Builder> {
        private String migrationJobId; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMigrationJobRequest request) {
            super(request);
            this.migrationJobId = request.migrationJobId;
            this.ownerId = request.ownerId;
        } 

        /**
         * MigrationJobId.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.putQueryParameter("MigrationJobId", migrationJobId);
            this.migrationJobId = migrationJobId;
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

        @Override
        public DeleteMigrationJobRequest build() {
            return new DeleteMigrationJobRequest(this);
        } 

    } 

}
