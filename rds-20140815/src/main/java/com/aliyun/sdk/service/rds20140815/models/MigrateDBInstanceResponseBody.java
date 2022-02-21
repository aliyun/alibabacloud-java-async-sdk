// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateDBInstanceResponseBody</p>
 */
public class MigrateDBInstanceResponseBody extends TeaModel {
    @NameInMap("MigrationId")
    private Integer migrationId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
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
         * MigrationId.
         */
        public Builder migrationId(Integer migrationId) {
            this.migrationId = migrationId;
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
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public MigrateDBInstanceResponseBody build() {
            return new MigrateDBInstanceResponseBody(this);
        } 

    } 

}
