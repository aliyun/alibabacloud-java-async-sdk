// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeDBInstanceMajorVersionPrecheckResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeDBInstanceMajorVersionPrecheckResponseBody</p>
 */
public class UpgradeDBInstanceMajorVersionPrecheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetMajorVersion")
    private String targetMajorVersion;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private UpgradeDBInstanceMajorVersionPrecheckResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.targetMajorVersion = builder.targetMajorVersion;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceMajorVersionPrecheckResponseBody create() {
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
     * @return targetMajorVersion
     */
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
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
        private String targetMajorVersion; 
        private String taskId; 

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1c808s731l****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99C1FEEE-FB44-5342-8EBA-DC1E1A1557A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The new major engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12.0</p>
         */
        public Builder targetMajorVersion(String targetMajorVersion) {
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>41698****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public UpgradeDBInstanceMajorVersionPrecheckResponseBody build() {
            return new UpgradeDBInstanceMajorVersionPrecheckResponseBody(this);
        } 

    } 

}
