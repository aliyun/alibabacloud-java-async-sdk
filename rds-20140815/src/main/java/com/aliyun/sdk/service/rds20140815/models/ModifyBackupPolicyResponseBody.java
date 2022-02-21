// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBackupPolicyResponseBody</p>
 */
public class ModifyBackupPolicyResponseBody extends TeaModel {
    @NameInMap("CompressType")
    private String compressType;

    @NameInMap("DBInstanceID")
    private String DBInstanceID;

    @NameInMap("EnableBackupLog")
    private String enableBackupLog;

    @NameInMap("HighSpaceUsageProtection")
    private String highSpaceUsageProtection;

    @NameInMap("LocalLogRetentionHours")
    private Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    private String localLogRetentionSpace;

    @NameInMap("LogBackupLocalRetentionNumber")
    private Integer logBackupLocalRetentionNumber;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyBackupPolicyResponseBody(Builder builder) {
        this.compressType = builder.compressType;
        this.DBInstanceID = builder.DBInstanceID;
        this.enableBackupLog = builder.enableBackupLog;
        this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
        this.localLogRetentionHours = builder.localLogRetentionHours;
        this.localLogRetentionSpace = builder.localLogRetentionSpace;
        this.logBackupLocalRetentionNumber = builder.logBackupLocalRetentionNumber;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return compressType
     */
    public String getCompressType() {
        return this.compressType;
    }

    /**
     * @return DBInstanceID
     */
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    /**
     * @return enableBackupLog
     */
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return highSpaceUsageProtection
     */
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    /**
     * @return localLogRetentionHours
     */
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    /**
     * @return localLogRetentionSpace
     */
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    /**
     * @return logBackupLocalRetentionNumber
     */
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String compressType; 
        private String DBInstanceID; 
        private String enableBackupLog; 
        private String highSpaceUsageProtection; 
        private Integer localLogRetentionHours; 
        private String localLogRetentionSpace; 
        private Integer logBackupLocalRetentionNumber; 
        private String requestId; 

        /**
         * CompressType.
         */
        public Builder compressType(String compressType) {
            this.compressType = compressType;
            return this;
        }

        /**
         * DBInstanceID.
         */
        public Builder DBInstanceID(String DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }

        /**
         * EnableBackupLog.
         */
        public Builder enableBackupLog(String enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * HighSpaceUsageProtection.
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * LocalLogRetentionHours.
         */
        public Builder localLogRetentionHours(Integer localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * LocalLogRetentionSpace.
         */
        public Builder localLogRetentionSpace(String localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }

        /**
         * LogBackupLocalRetentionNumber.
         */
        public Builder logBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
            this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyBackupPolicyResponseBody build() {
            return new ModifyBackupPolicyResponseBody(this);
        } 

    } 

}
