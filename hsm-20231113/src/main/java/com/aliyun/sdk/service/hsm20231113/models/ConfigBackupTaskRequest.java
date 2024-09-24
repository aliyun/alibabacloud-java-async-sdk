// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigBackupTaskRequest} extends {@link RequestModel}
 *
 * <p>ConfigBackupTaskRequest</p>
 */
public class ConfigBackupTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupHourInDay")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 23)
    private Long backupHourInDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPeriod")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 30, minimum = 1)
    private Long backupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Manual2PeriodicList")
    private java.util.List < String > manual2PeriodicList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Periodic2ManualList")
    private java.util.List < String > periodic2ManualList;

    private ConfigBackupTaskRequest(Builder builder) {
        super(builder);
        this.backupHourInDay = builder.backupHourInDay;
        this.backupId = builder.backupId;
        this.backupPeriod = builder.backupPeriod;
        this.manual2PeriodicList = builder.manual2PeriodicList;
        this.periodic2ManualList = builder.periodic2ManualList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigBackupTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupHourInDay
     */
    public Long getBackupHourInDay() {
        return this.backupHourInDay;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupPeriod
     */
    public Long getBackupPeriod() {
        return this.backupPeriod;
    }

    /**
     * @return manual2PeriodicList
     */
    public java.util.List < String > getManual2PeriodicList() {
        return this.manual2PeriodicList;
    }

    /**
     * @return periodic2ManualList
     */
    public java.util.List < String > getPeriodic2ManualList() {
        return this.periodic2ManualList;
    }

    public static final class Builder extends Request.Builder<ConfigBackupTaskRequest, Builder> {
        private Long backupHourInDay; 
        private String backupId; 
        private Long backupPeriod; 
        private java.util.List < String > manual2PeriodicList; 
        private java.util.List < String > periodic2ManualList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigBackupTaskRequest request) {
            super(request);
            this.backupHourInDay = request.backupHourInDay;
            this.backupId = request.backupId;
            this.backupPeriod = request.backupPeriod;
            this.manual2PeriodicList = request.manual2PeriodicList;
            this.periodic2ManualList = request.periodic2ManualList;
        } 

        /**
         * BackupHourInDay.
         */
        public Builder backupHourInDay(Long backupHourInDay) {
            this.putQueryParameter("BackupHourInDay", backupHourInDay);
            this.backupHourInDay = backupHourInDay;
            return this;
        }

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * BackupPeriod.
         */
        public Builder backupPeriod(Long backupPeriod) {
            this.putQueryParameter("BackupPeriod", backupPeriod);
            this.backupPeriod = backupPeriod;
            return this;
        }

        /**
         * Manual2PeriodicList.
         */
        public Builder manual2PeriodicList(java.util.List < String > manual2PeriodicList) {
            this.putQueryParameter("Manual2PeriodicList", manual2PeriodicList);
            this.manual2PeriodicList = manual2PeriodicList;
            return this;
        }

        /**
         * Periodic2ManualList.
         */
        public Builder periodic2ManualList(java.util.List < String > periodic2ManualList) {
            this.putQueryParameter("Periodic2ManualList", periodic2ManualList);
            this.periodic2ManualList = periodic2ManualList;
            return this;
        }

        @Override
        public ConfigBackupTaskRequest build() {
            return new ConfigBackupTaskRequest(this);
        } 

    } 

}
