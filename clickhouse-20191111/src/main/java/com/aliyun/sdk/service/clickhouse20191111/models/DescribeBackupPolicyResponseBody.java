// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @NameInMap("BackupSize")
    private String backupSize;

    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Switch")
    private String _switch;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.backupSize = builder.backupSize;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.requestId = builder.requestId;
        this._switch = builder._switch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return backupSize
     */
    public String getBackupSize() {
        return this.backupSize;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return _switch
     */
    public String get_switch() {
        return this._switch;
    }

    public static final class Builder {
        private Integer backupRetentionPeriod; 
        private String backupSize; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String requestId; 
        private String _switch; 

        /**
         * BackupRetentionPeriod.
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * BackupSize.
         */
        public Builder backupSize(String backupSize) {
            this.backupSize = backupSize;
            return this;
        }

        /**
         * PreferredBackupPeriod.
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * PreferredBackupTime.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Switch.
         */
        public Builder _switch(String _switch) {
            this._switch = _switch;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

}
