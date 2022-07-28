// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>StopBackupPlanRequest</p>
 */
public class StopBackupPlanRequest extends Request {
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

    @Query
    @NameInMap("StopMethod")
    @Validation(required = true)
    private String stopMethod;

    private StopBackupPlanRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.stopMethod = builder.stopMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return stopMethod
     */
    public String getStopMethod() {
        return this.stopMethod;
    }

    public static final class Builder extends Request.Builder<StopBackupPlanRequest, Builder> {
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private String stopMethod; 

        private Builder() {
            super();
        } 

        private Builder(StopBackupPlanRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.stopMethod = request.stopMethod;
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

        /**
         * StopMethod.
         */
        public Builder stopMethod(String stopMethod) {
            this.putQueryParameter("StopMethod", stopMethod);
            this.stopMethod = stopMethod;
            return this;
        }

        @Override
        public StopBackupPlanRequest build() {
            return new StopBackupPlanRequest(this);
        } 

    } 

}
