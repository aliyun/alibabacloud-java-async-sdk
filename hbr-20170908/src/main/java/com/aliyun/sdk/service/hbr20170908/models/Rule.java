// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link Rule} extends {@link TeaModel}
 *
 * <p>Rule</p>
 */
public class Rule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupType")
    private String backupType;

    @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
    private String destinationRegionId;

    @com.aliyun.core.annotation.NameInMap("DestinationRetention")
    private Long destinationRetention;

    @com.aliyun.core.annotation.NameInMap("Disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.NameInMap("DoCopy")
    private Boolean doCopy;

    @com.aliyun.core.annotation.NameInMap("Retention")
    private Long retention;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("Schedule")
    private String schedule;

    private Rule(Builder builder) {
        this.backupType = builder.backupType;
        this.destinationRegionId = builder.destinationRegionId;
        this.destinationRetention = builder.destinationRetention;
        this.disabled = builder.disabled;
        this.doCopy = builder.doCopy;
        this.retention = builder.retention;
        this.ruleName = builder.ruleName;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Rule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return destinationRetention
     */
    public Long getDestinationRetention() {
        return this.destinationRetention;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return doCopy
     */
    public Boolean getDoCopy() {
        return this.doCopy;
    }

    /**
     * @return retention
     */
    public Long getRetention() {
        return this.retention;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
    }

    public static final class Builder {
        private String backupType; 
        private String destinationRegionId; 
        private Long destinationRetention; 
        private Boolean disabled; 
        private Boolean doCopy; 
        private Long retention; 
        private String ruleName; 
        private String schedule; 

        private Builder() {
        } 

        private Builder(Rule model) {
            this.backupType = model.backupType;
            this.destinationRegionId = model.destinationRegionId;
            this.destinationRetention = model.destinationRetention;
            this.disabled = model.disabled;
            this.doCopy = model.doCopy;
            this.retention = model.retention;
            this.ruleName = model.ruleName;
            this.schedule = model.schedule;
        } 

        /**
         * <p>The backup type.</p>
         * <ul>
         * <li>COMPLETE：Full backup.</li>
         * <li>INCREMENTAL：Incremental backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        public Builder backupType(String backupType) {
            this.backupType = backupType;
            return this;
        }

        /**
         * <p>The replication region id.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * <p>The retention period of remote backups. Minimum value: 1. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder destinationRetention(Long destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }

        /**
         * <p>Whether the plan is disbaled for this data source.</p>
         * <ul>
         * <li><strong>true</strong>: disabled</li>
         * <li><strong>false</strong>: Not disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>Whether do copy.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder doCopy(Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }

        /**
         * <p>This parameter indicates the retention period of the backup data. Minimum value: 1. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder retention(Long retention) {
            this.retention = retention;
            return this;
        }

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-com-backup-20241023-163113</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>BACKUP</strong>. This parameter indicates the backup schedule settings. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <ul>
         * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
         * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>I|1631685600|P1D</p>
         */
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        public Rule build() {
            return new Rule(this);
        } 

    } 

}
