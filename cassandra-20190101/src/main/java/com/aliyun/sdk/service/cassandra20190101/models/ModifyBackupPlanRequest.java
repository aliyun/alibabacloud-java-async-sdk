// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPlanRequest</p>
 */
public class ModifyBackupPlanRequest extends Request {
    @Query
    @NameInMap("Active")
    private Boolean active;

    @Query
    @NameInMap("BackupPeriod")
    private String backupPeriod;

    @Query
    @NameInMap("BackupTime")
    private String backupTime;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DataCenterId")
    @Validation(required = true)
    private String dataCenterId;

    @Query
    @NameInMap("RetentionPeriod")
    private Integer retentionPeriod;

    private ModifyBackupPlanRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.backupPeriod = builder.backupPeriod;
        this.backupTime = builder.backupTime;
        this.clusterId = builder.clusterId;
        this.dataCenterId = builder.dataCenterId;
        this.retentionPeriod = builder.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return backupPeriod
     */
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    /**
     * @return backupTime
     */
    public String getBackupTime() {
        return this.backupTime;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    /**
     * @return retentionPeriod
     */
    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPlanRequest, Builder> {
        private Boolean active; 
        private String backupPeriod; 
        private String backupTime; 
        private String clusterId; 
        private String dataCenterId; 
        private Integer retentionPeriod; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPlanRequest response) {
            super(response);
            this.active = response.active;
            this.backupPeriod = response.backupPeriod;
            this.backupTime = response.backupTime;
            this.clusterId = response.clusterId;
            this.dataCenterId = response.dataCenterId;
            this.retentionPeriod = response.retentionPeriod;
        } 

        /**
         * Active.
         */
        public Builder active(Boolean active) {
            this.putQueryParameter("Active", active);
            this.active = active;
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
         * BackupTime.
         */
        public Builder backupTime(String backupTime) {
            this.putQueryParameter("BackupTime", backupTime);
            this.backupTime = backupTime;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.putQueryParameter("DataCenterId", dataCenterId);
            this.dataCenterId = dataCenterId;
            return this;
        }

        /**
         * RetentionPeriod.
         */
        public Builder retentionPeriod(Integer retentionPeriod) {
            this.putQueryParameter("RetentionPeriod", retentionPeriod);
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        @Override
        public ModifyBackupPlanRequest build() {
            return new ModifyBackupPlanRequest(this);
        } 

    } 

}
