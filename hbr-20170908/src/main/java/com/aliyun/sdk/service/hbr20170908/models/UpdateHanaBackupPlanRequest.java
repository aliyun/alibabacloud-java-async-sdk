// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHanaBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateHanaBackupPlanRequest</p>
 */
public class UpdateHanaBackupPlanRequest extends Request {
    @Query
    @NameInMap("BackupPrefix")
    private String backupPrefix;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("PlanName")
    private String planName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Schedule")
    private String schedule;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
    private String vaultId;

    private UpdateHanaBackupPlanRequest(Builder builder) {
        super(builder);
        this.backupPrefix = builder.backupPrefix;
        this.clusterId = builder.clusterId;
        this.planId = builder.planId;
        this.planName = builder.planName;
        this.resourceGroupId = builder.resourceGroupId;
        this.schedule = builder.schedule;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHanaBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPrefix
     */
    public String getBackupPrefix() {
        return this.backupPrefix;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<UpdateHanaBackupPlanRequest, Builder> {
        private String backupPrefix; 
        private String clusterId; 
        private String planId; 
        private String planName; 
        private String resourceGroupId; 
        private String schedule; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHanaBackupPlanRequest request) {
            super(request);
            this.backupPrefix = request.backupPrefix;
            this.clusterId = request.clusterId;
            this.planId = request.planId;
            this.planName = request.planName;
            this.resourceGroupId = request.resourceGroupId;
            this.schedule = request.schedule;
            this.vaultId = request.vaultId;
        } 

        /**
         * The backup prefix.
         */
        public Builder backupPrefix(String backupPrefix) {
            this.putQueryParameter("BackupPrefix", backupPrefix);
            this.backupPrefix = backupPrefix;
            return this;
        }

        /**
         * The ID of the SAP HANA instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the backup plan.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * The name of the backup plan.
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
         * <p>
         * 
         * *   startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.
         * *   interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of 1 hour. P1D specifies an interval of one day.
         */
        public Builder schedule(String schedule) {
            this.putQueryParameter("Schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public UpdateHanaBackupPlanRequest build() {
            return new UpdateHanaBackupPlanRequest(this);
        } 

    } 

}
