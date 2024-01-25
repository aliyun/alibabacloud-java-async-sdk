// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHanaRetentionSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateHanaRetentionSettingRequest</p>
 */
public class UpdateHanaRetentionSettingRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Query
    @NameInMap("Disabled")
    @Validation(required = true)
    private Boolean disabled;

    @Query
    @NameInMap("RetentionDays")
    @Validation(required = true)
    private Long retentionDays;

    @Query
    @NameInMap("Schedule")
    @Validation(required = true)
    private String schedule;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private UpdateHanaRetentionSettingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.databaseName = builder.databaseName;
        this.disabled = builder.disabled;
        this.retentionDays = builder.retentionDays;
        this.schedule = builder.schedule;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHanaRetentionSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return retentionDays
     */
    public Long getRetentionDays() {
        return this.retentionDays;
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

    public static final class Builder extends Request.Builder<UpdateHanaRetentionSettingRequest, Builder> {
        private String clusterId; 
        private String databaseName; 
        private Boolean disabled; 
        private Long retentionDays; 
        private String schedule; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHanaRetentionSettingRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.databaseName = request.databaseName;
            this.disabled = request.disabled;
            this.retentionDays = request.retentionDays;
            this.schedule = request.schedule;
            this.vaultId = request.vaultId;
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
         * The name of the database.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Specifies whether to permanently retain the backup. Valid values:
         * <p>
         * 
         * *   true: The backup is permanently retained.
         * *   false: The backup is retained for the specified number of days.
         */
        public Builder disabled(Boolean disabled) {
            this.putQueryParameter("Disabled", disabled);
            this.disabled = disabled;
            return this;
        }

        /**
         * The number of days for which the backup is retained. If you set the Disabled parameter to false, the backup is retained for the number of days specified by this parameter.
         */
        public Builder retentionDays(Long retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * The policy to update the retention period. Format: `I|{startTime}|{interval}`. The retention period is updated at an interval of {interval} starting from {startTime}.
         * <p>
         * 
         * *   startTime: the time at which the system starts to update the retention period. The time must follow the UNIX time format. Unit: seconds.
         * *   interval: the interval at which the system updates the retention period. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of 1 hour and P1D specifies an interval of one day.
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
        public UpdateHanaRetentionSettingRequest build() {
            return new UpdateHanaRetentionSettingRequest(this);
        } 

    } 

}
