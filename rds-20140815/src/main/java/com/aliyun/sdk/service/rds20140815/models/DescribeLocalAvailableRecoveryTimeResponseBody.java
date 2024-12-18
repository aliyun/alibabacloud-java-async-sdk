// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeLocalAvailableRecoveryTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLocalAvailableRecoveryTimeResponseBody</p>
 */
public class DescribeLocalAvailableRecoveryTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RecoveryBeginTime")
    private String recoveryBeginTime;

    @com.aliyun.core.annotation.NameInMap("RecoveryEndTime")
    private String recoveryEndTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The start of the time range to which the instance can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-16T07:59:18Z</p>
         */
        public Builder recoveryBeginTime(String recoveryBeginTime) {
            this.recoveryBeginTime = recoveryBeginTime;
            return this;
        }

        /**
         * <p>The end of the time range to which the instance can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-20T08:41:29Z</p>
         */
        public Builder recoveryEndTime(String recoveryEndTime) {
            this.recoveryEndTime = recoveryEndTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14E986AC-0F27-4FFB-8EED-9A8A3A2A0309</p>
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
