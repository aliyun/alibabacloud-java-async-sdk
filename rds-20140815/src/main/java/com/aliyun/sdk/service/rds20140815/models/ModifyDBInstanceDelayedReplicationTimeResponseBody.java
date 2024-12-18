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
 * {@link ModifyDBInstanceDelayedReplicationTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceDelayedReplicationTimeResponseBody</p>
 */
public class ModifyDBInstanceDelayedReplicationTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ReadSQLReplicationTime")
    private String readSQLReplicationTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ModifyDBInstanceDelayedReplicationTimeResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.readSQLReplicationTime = builder.readSQLReplicationTime;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceDelayedReplicationTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return readSQLReplicationTime
     */
    public String getReadSQLReplicationTime() {
        return this.readSQLReplicationTime;
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
        private String readSQLReplicationTime; 
        private String requestId; 
        private String taskId; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The replication latency of the read-only instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder readSQLReplicationTime(String readSQLReplicationTime) {
            this.readSQLReplicationTime = readSQLReplicationTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EFB6083A-7699-489B-8278-C0CB4793A96E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1715482.0</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ModifyDBInstanceDelayedReplicationTimeResponseBody build() {
            return new ModifyDBInstanceDelayedReplicationTimeResponseBody(this);
        } 

    } 

}
