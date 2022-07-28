// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupObjectsRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupObjectsRequest</p>
 */
public class ModifyBackupObjectsRequest extends Request {
    @Query
    @NameInMap("BackupObjects")
    @Validation(required = true)
    private String backupObjects;

    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyBackupObjectsRequest(Builder builder) {
        super(builder);
        this.backupObjects = builder.backupObjects;
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupObjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupObjects
     */
    public String getBackupObjects() {
        return this.backupObjects;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyBackupObjectsRequest, Builder> {
        private String backupObjects; 
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupObjectsRequest request) {
            super(request);
            this.backupObjects = request.backupObjects;
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * BackupObjects.
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyBackupObjectsRequest build() {
            return new ModifyBackupObjectsRequest(this);
        } 

    } 

}
