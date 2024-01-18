// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockDBInstanceWriteResponseBody} extends {@link TeaModel}
 *
 * <p>LockDBInstanceWriteResponseBody</p>
 */
public class LockDBInstanceWriteResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("LockReason")
    private String lockReason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private Long taskId;

    private LockDBInstanceWriteResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.lockReason = builder.lockReason;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockDBInstanceWriteResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
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
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private String lockReason; 
        private String requestId; 
        private Long taskId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * The reason why write operations on the instance are locked.
         */
        public Builder lockReason(String lockReason) {
            this.lockReason = lockReason;
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
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public LockDBInstanceWriteResponseBody build() {
            return new LockDBInstanceWriteResponseBody(this);
        } 

    } 

}
