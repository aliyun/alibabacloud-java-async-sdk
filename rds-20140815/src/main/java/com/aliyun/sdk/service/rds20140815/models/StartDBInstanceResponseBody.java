// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>StartDBInstanceResponseBody</p>
 */
public class StartDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MigrationId")
    private Integer migrationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private StartDBInstanceResponseBody(Builder builder) {
        this.migrationId = builder.migrationId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDBInstanceResponseBody create() {
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
         * <p>The migration task ID. This parameter is available only for instances that are created in dedicated clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>740</p>
         */
        public Builder migrationId(Integer migrationId) {
            this.migrationId = migrationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A417FB41-A3D9-464E-AD0A-C7FE05C72E98</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>238028563</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public StartDBInstanceResponseBody build() {
            return new StartDBInstanceResponseBody(this);
        } 

    } 

}
