// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReadonlyInstanceDelayReplicationTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyReadonlyInstanceDelayReplicationTimeResponseBody</p>
 */
public class ModifyReadonlyInstanceDelayReplicationTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ReadSQLReplicationTime")
    private String readSQLReplicationTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ModifyReadonlyInstanceDelayReplicationTimeResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.readSQLReplicationTime = builder.readSQLReplicationTime;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReadonlyInstanceDelayReplicationTimeResponseBody create() {
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
         * The ID of the read-only instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The latency at which to replicate data from the primary instance to the read-only instance. Unit: seconds.
         */
        public Builder readSQLReplicationTime(String readSQLReplicationTime) {
            this.readSQLReplicationTime = readSQLReplicationTime;
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

        public ModifyReadonlyInstanceDelayReplicationTimeResponseBody build() {
            return new ModifyReadonlyInstanceDelayReplicationTimeResponseBody(this);
        } 

    } 

}
