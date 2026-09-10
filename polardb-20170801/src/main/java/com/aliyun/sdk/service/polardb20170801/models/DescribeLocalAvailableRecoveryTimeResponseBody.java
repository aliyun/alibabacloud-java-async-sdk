// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RecoveryBeginTime")
    private String recoveryBeginTime;

    @com.aliyun.core.annotation.NameInMap("RecoveryEndTime")
    private String recoveryEndTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLocalAvailableRecoveryTimeResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
        private String DBClusterId; 
        private String recoveryBeginTime; 
        private String recoveryEndTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLocalAvailableRecoveryTimeResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.recoveryBeginTime = model.recoveryBeginTime;
            this.recoveryEndTime = model.recoveryEndTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze3ngi149b313***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The start of the time range available for recovery.</p>
         * <blockquote>
         * <p>This is calculated based on level-1 backups and does not include level-2 backups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-09-10T14:19:48Z</p>
         */
        public Builder recoveryBeginTime(String recoveryBeginTime) {
            this.recoveryBeginTime = recoveryBeginTime;
            return this;
        }

        /**
         * <p>The end of the time range available for recovery.</p>
         * <blockquote>
         * <p>This is calculated based on level-1 backups and does not include level-2 backups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-09-17T08:56:45Z</p>
         */
        public Builder recoveryEndTime(String recoveryEndTime) {
            this.recoveryEndTime = recoveryEndTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EA0E6F8-BDB2-17B2-9567-591F6B3D7***</p>
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
