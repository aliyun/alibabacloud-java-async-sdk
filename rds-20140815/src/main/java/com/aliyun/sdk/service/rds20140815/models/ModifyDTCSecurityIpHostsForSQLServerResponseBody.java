// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDTCSecurityIpHostsForSQLServerResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDTCSecurityIpHostsForSQLServerResponseBody</p>
 */
public class ModifyDTCSecurityIpHostsForSQLServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DTCSetResult")
    private String DTCSetResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ModifyDTCSecurityIpHostsForSQLServerResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.DTCSetResult = builder.DTCSetResult;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDTCSecurityIpHostsForSQLServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DTCSetResult
     */
    public String getDTCSetResult() {
        return this.DTCSetResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String DTCSetResult; 
        private String requestId; 
        private String taskId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The result of the IP address whitelist configuration. Valid values:
         * <p>
         * 
         * *   **Success**
         * *   **Fail**
         */
        public Builder DTCSetResult(String DTCSetResult) {
            this.DTCSetResult = DTCSetResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ModifyDTCSecurityIpHostsForSQLServerResponseBody build() {
            return new ModifyDTCSecurityIpHostsForSQLServerResponseBody(this);
        } 

    } 

}
