// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyBackupStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupStrategyRequest</p>
 */
public class ModifyBackupStrategyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLogIntervalSeconds")
    private Integer backupLogIntervalSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStartTime")
    private String backupStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStrategyType")
    private String backupStrategyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private ModifyBackupStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupLogIntervalSeconds = builder.backupLogIntervalSeconds;
        this.backupPeriod = builder.backupPeriod;
        this.backupPlanId = builder.backupPlanId;
        this.backupStartTime = builder.backupStartTime;
        this.backupStrategyType = builder.backupStrategyType;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyBackupStrategyRequest, Builder> {
        private String regionId; 
        private Integer backupLogIntervalSeconds; 
        private String backupPeriod; 
        private String backupPlanId; 
        private String backupStartTime; 
        private String backupStrategyType; 
        private String clientToken; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupLogIntervalSeconds = request.backupLogIntervalSeconds;
            this.backupPeriod = request.backupPeriod;
            this.backupPlanId = request.backupPlanId;
            this.backupStartTime = request.backupStartTime;
            this.backupStrategyType = request.backupStrategyType;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
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
         * <p>The interval at which you want to perform incremental log backups. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter takes effect only when physical backups are performed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder backupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
            this.putQueryParameter("BackupLogIntervalSeconds", backupLogIntervalSeconds);
            this.backupLogIntervalSeconds = backupLogIntervalSeconds;
            return this;
        }

        /**
         * <p>The day of each week when the full backup task runs. Valid values:</p>
         * <ul>
         * <li>Monday</li>
         * <li>Tuesday</li>
         * <li>Wednesday</li>
         * <li>Thursday</li>
         * <li>Friday</li>
         * <li>Saturday</li>
         * <li>Sunday</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        public Builder backupPeriod(String backupPeriod) {
            this.putQueryParameter("BackupPeriod", backupPeriod);
            this.backupPeriod = backupPeriod;
            return this;
        }

        /**
         * <p>The ID of the backup schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi01XXXX</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The start time of the full backup task. Specify the time in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>14:22</p>
         */
        public Builder backupStartTime(String backupStartTime) {
            this.putQueryParameter("BackupStartTime", backupStartTime);
            this.backupStartTime = backupStartTime;
            return this;
        }

        /**
         * <p>The backup method that you want to use for full backups. Valid values:</p>
         * <ul>
         * <li><strong>simple</strong>: scheduled backup. If you specify this value for the BackupStrategyType parameter, you must also specify the BackupPeriod and BackupStartTime parameters.</li>
         * <li><strong>Manual</strong>: manual backup.</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>simple</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        public Builder backupStrategyType(String backupStrategyType) {
            this.putQueryParameter("BackupStrategyType", backupStrategyType);
            this.backupStrategyType = backupStrategyType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
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

        @Override
        public ModifyBackupStrategyRequest build() {
            return new ModifyBackupStrategyRequest(this);
        } 

    } 

}
