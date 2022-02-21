// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStorageStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyStorageStrategyRequest</p>
 */
public class ModifyStorageStrategyRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BackupRetentionPeriod")
    @Validation(required = true)
    private Integer backupRetentionPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DuplicationArchivePeriod")
    @Validation(required = true)
    private Integer duplicationArchivePeriod;

    @Query
    @NameInMap("DuplicationInfrequentAccessPeriod")
    @Validation(required = true)
    private Integer duplicationInfrequentAccessPeriod;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyStorageStrategyRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.clientToken = builder.clientToken;
        this.duplicationArchivePeriod = builder.duplicationArchivePeriod;
        this.duplicationInfrequentAccessPeriod = builder.duplicationInfrequentAccessPeriod;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStorageStrategyRequest create() {
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
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return duplicationArchivePeriod
     */
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    /**
     * @return duplicationInfrequentAccessPeriod
     */
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
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

    public static final class Builder extends Request.Builder<ModifyStorageStrategyRequest, Builder> {
        private String backupPlanId; 
        private Integer backupRetentionPeriod; 
        private String clientToken; 
        private Integer duplicationArchivePeriod; 
        private Integer duplicationInfrequentAccessPeriod; 
        private String ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStorageStrategyRequest response) {
            super(response);
            this.backupPlanId = response.backupPlanId;
            this.backupRetentionPeriod = response.backupRetentionPeriod;
            this.clientToken = response.clientToken;
            this.duplicationArchivePeriod = response.duplicationArchivePeriod;
            this.duplicationInfrequentAccessPeriod = response.duplicationInfrequentAccessPeriod;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
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
         * BackupRetentionPeriod.
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
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
         * DuplicationArchivePeriod.
         */
        public Builder duplicationArchivePeriod(Integer duplicationArchivePeriod) {
            this.putQueryParameter("DuplicationArchivePeriod", duplicationArchivePeriod);
            this.duplicationArchivePeriod = duplicationArchivePeriod;
            return this;
        }

        /**
         * DuplicationInfrequentAccessPeriod.
         */
        public Builder duplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
            this.putQueryParameter("DuplicationInfrequentAccessPeriod", duplicationInfrequentAccessPeriod);
            this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
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
        public ModifyStorageStrategyRequest build() {
            return new ModifyStorageStrategyRequest(this);
        } 

    } 

}
