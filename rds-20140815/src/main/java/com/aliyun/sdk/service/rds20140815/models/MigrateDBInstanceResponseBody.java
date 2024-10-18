// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MigrateDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateDBInstanceResponseBody</p>
 */
public class MigrateDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MigrationId")
    private Integer migrationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private MigrateDBInstanceResponseBody(Builder builder) {
        this.migrationId = builder.migrationId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateDBInstanceResponseBody create() {
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
         * <p>The serial number of the task in the migration task queue. When the serial number becomes 0, the system starts the migration.</p>
         * 
         * <strong>example:</strong>
         * <p>224****</p>
         */
        public Builder migrationId(Integer migrationId) {
            this.migrationId = migrationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>498AE8CA-8C81-4A01-AF37-2B902014ED30</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10824****</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public MigrateDBInstanceResponseBody build() {
            return new MigrateDBInstanceResponseBody(this);
        } 

    } 

}
