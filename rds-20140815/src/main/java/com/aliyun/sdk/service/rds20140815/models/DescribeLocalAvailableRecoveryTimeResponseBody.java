// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLocalAvailableRecoveryTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLocalAvailableRecoveryTimeResponseBody</p>
 */
public class DescribeLocalAvailableRecoveryTimeResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("RecoveryBeginTime")
    private String recoveryBeginTime;

    @NameInMap("RecoveryEndTime")
    private String recoveryEndTime;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLocalAvailableRecoveryTimeResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.recoveryBeginTime = builder.recoveryBeginTime;
        this.recoveryEndTime = builder.recoveryEndTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLocalAvailableRecoveryTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return recoveryBeginTime
     */
    public String getRecoveryBeginTime() {
        return this.recoveryBeginTime;
    }

    /**
     * @return recoveryEndTime
     */
    public String getRecoveryEndTime() {
        return this.recoveryEndTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String recoveryBeginTime; 
        private String recoveryEndTime; 
        private String requestId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The start of the time range to which the instance can be restored.
         */
        public Builder recoveryBeginTime(String recoveryBeginTime) {
            this.recoveryBeginTime = recoveryBeginTime;
            return this;
        }

        /**
         * The end of the time range to which the instance can be restored.
         */
        public Builder recoveryEndTime(String recoveryEndTime) {
            this.recoveryEndTime = recoveryEndTime;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLocalAvailableRecoveryTimeResponseBody build() {
            return new DescribeLocalAvailableRecoveryTimeResponseBody(this);
        } 

    } 

}
