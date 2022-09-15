// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceDelayedReplicationTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceDelayedReplicationTimeResponseBody</p>
 */
public class ModifyDBInstanceDelayedReplicationTimeResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("ReadSQLReplicationTime")
    private String readSQLReplicationTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ReadSQLReplicationTime.
         */
        public Builder readSQLReplicationTime(String readSQLReplicationTime) {
            this.readSQLReplicationTime = readSQLReplicationTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
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
