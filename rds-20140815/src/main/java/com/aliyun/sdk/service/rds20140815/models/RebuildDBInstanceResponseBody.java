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
 * {@link RebuildDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RebuildDBInstanceResponseBody</p>
 */
public class RebuildDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MigrationId")
    private Integer migrationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RebuildDBInstanceResponseBody model) {
            this.migrationId = model.migrationId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The serial number of the task in the rebuild task queue. When the serial number becomes 0, the system starts to rebuild the secondary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>329****</p>
         */
        public Builder migrationId(Integer migrationId) {
            this.migrationId = migrationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>355DA57C-8CC4-40AB-B3F8-B684BA32EB9E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20867****</p>
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
