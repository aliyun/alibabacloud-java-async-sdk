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

        /**
         * BackupType.
         */
        public Builder backupType(String backupType) {
            this.backupType = backupType;
            return this;
        }

        /**
         * DestinationRegionId.
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * DestinationRetention.
         */
        public Builder destinationRetention(Long destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }

        /**
         * Disabled.
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * DoCopy.
         */
        public Builder doCopy(Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(Long retention) {
            this.retention = retention;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Schedule.
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
