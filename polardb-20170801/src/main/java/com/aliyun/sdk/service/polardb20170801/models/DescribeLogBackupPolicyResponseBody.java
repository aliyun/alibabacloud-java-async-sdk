// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupPolicyResponseBody</p>
 */
public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    @NameInMap("EnableBackupLog")
    private Integer enableBackupLog;

    @NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLogBackupPolicyResponseBody(Builder builder) {
        this.enableBackupLog = builder.enableBackupLog;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableBackupLog
     */
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer enableBackupLog; 
        private Integer logBackupRetentionPeriod; 
        private String requestId; 

        /**
         * EnableBackupLog.
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * LogBackupRetentionPeriod.
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogBackupPolicyResponseBody build() {
            return new DescribeLogBackupPolicyResponseBody(this);
        } 

    } 

}
