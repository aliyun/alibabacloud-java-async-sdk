// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupStrategyRequest</p>
 */
public class ModifyBackupStrategyRequest extends Request {
    @Query
    @NameInMap("BackupLogIntervalSeconds")
    private Integer backupLogIntervalSeconds;

    @Query
    @NameInMap("BackupPeriod")
    @Validation(required = true)
    private String backupPeriod;

    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BackupStartTime")
    private String backupStartTime;

    @Query
    @NameInMap("BackupStrategyType")
    private String backupStrategyType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyBackupStrategyRequest(Builder builder) {
        super(builder);
        this.backupLogIntervalSeconds = builder.backupLogIntervalSeconds;
        this.backupPeriod = builder.backupPeriod;
        this.backupPlanId = builder.backupPlanId;
        this.backupStartTime = builder.backupStartTime;
        this.backupStrategyType = builder.backupStrategyType;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupLogIntervalSeconds
     */
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    /**
     * @return backupPeriod
     */
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupStartTime
     */
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    /**
     * @return backupStrategyType
     */
    public String getBackupStrategyType() {
        return this.backupStrategyType;
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

    public static final class Builder extends Request.Builder<ModifyBackupStrategyRequest, Builder> {
        private Integer backupLogIntervalSeconds; 
        private String backupPeriod; 
        private String backupPlanId; 
        private String backupStartTime; 
        private String backupStrategyType; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupStrategyRequest response) {
            super(response);
            this.backupLogIntervalSeconds = response.backupLogIntervalSeconds;
            this.backupPeriod = response.backupPeriod;
            this.backupPlanId = response.backupPlanId;
            this.backupStartTime = response.backupStartTime;
            this.backupStrategyType = response.backupStrategyType;
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * BackupLogIntervalSeconds.
         */
        public Builder backupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
            this.putQueryParameter("BackupLogIntervalSeconds", backupLogIntervalSeconds);
            this.backupLogIntervalSeconds = backupLogIntervalSeconds;
            return this;
        }

        /**
         * BackupPeriod.
         */
        public Builder backupPeriod(String backupPeriod) {
            this.putQueryParameter("BackupPeriod", backupPeriod);
            this.backupPeriod = backupPeriod;
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
         * BackupStartTime.
         */
        public Builder backupStartTime(String backupStartTime) {
            this.putQueryParameter("BackupStartTime", backupStartTime);
            this.backupStartTime = backupStartTime;
            return this;
        }

        /**
         * BackupStrategyType.
         */
        public Builder backupStrategyType(String backupStrategyType) {
            this.putQueryParameter("BackupStrategyType", backupStrategyType);
            this.backupStrategyType = backupStrategyType;
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
        public ModifyBackupStrategyRequest build() {
            return new ModifyBackupStrategyRequest(this);
        } 

    } 

}
