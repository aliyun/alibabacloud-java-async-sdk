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
 * {@link UpgradeDBInstanceKernelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeDBInstanceKernelVersionResponseBody</p>
 */
public class UpgradeDBInstanceKernelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private UpgradeDBInstanceKernelVersionResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.targetMinorVersion = builder.targetMinorVersion;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceKernelVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetMinorVersion
     */
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private String requestId; 
        private String targetMinorVersion; 
        private String taskId; 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bpxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DA2ECBA0-4745-4491-9166-799FF8984AC9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The new minor engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xcluster80_20210305</p>
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>226917****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public UpgradeDBInstanceKernelVersionResponseBody build() {
            return new UpgradeDBInstanceKernelVersionResponseBody(this);
        } 

    } 

}
