// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>RenewBackupPlanRequest</p>
 */
public class RenewBackupPlanRequest extends Request {
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

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private String period;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UsedTime")
    @Validation(required = true)
    private Integer usedTime;

    private RenewBackupPlanRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewBackupPlanRequest create() {
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
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<RenewBackupPlanRequest, Builder> {
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 
        private String period; 
        private String regionId; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(RenewBackupPlanRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.usedTime = request.usedTime;
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
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
         * UsedTime.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public RenewBackupPlanRequest build() {
            return new RenewBackupPlanRequest(this);
        } 

    } 

}
