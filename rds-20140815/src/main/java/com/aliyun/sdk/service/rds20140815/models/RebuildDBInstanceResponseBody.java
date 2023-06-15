// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RebuildDBInstanceResponseBody</p>
 */
public class RebuildDBInstanceResponseBody extends TeaModel {
    @NameInMap("MigrationId")
    private Integer migrationId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private Integer taskId;

    private RebuildDBInstanceResponseBody(Builder builder) {
        this.migrationId = builder.migrationId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return migrationId
     */
    public Integer getMigrationId() {
        return this.migrationId;
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
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Integer migrationId; 
        private String requestId; 
        private Integer taskId; 

        /**
         * The serial number of the task in the rebuild task queue. When the serial number becomes 0, the system starts to rebuild the secondary instance.
         */
        public Builder migrationId(Integer migrationId) {
            this.migrationId = migrationId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public RebuildDBInstanceResponseBody build() {
            return new RebuildDBInstanceResponseBody(this);
        } 

    } 

}
