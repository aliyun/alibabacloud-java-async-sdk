// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnlockDBInstanceWriteResponseBody} extends {@link TeaModel}
 *
 * <p>UnlockDBInstanceWriteResponseBody</p>
 */
public class UnlockDBInstanceWriteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private UnlockDBInstanceWriteResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnlockDBInstanceWriteResponseBody create() {
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private String requestId; 
        private Long taskId; 

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-2ev03avw0r0552***</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10****</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public UnlockDBInstanceWriteResponseBody build() {
            return new UnlockDBInstanceWriteResponseBody(this);
        } 

    } 

}
