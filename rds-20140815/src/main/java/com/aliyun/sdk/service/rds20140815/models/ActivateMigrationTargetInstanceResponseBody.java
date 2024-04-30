// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateMigrationTargetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ActivateMigrationTargetInstanceResponseBody</p>
 */
public class ActivateMigrationTargetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceIpAddress")
    private String sourceIpAddress;

    @com.aliyun.core.annotation.NameInMap("SourcePort")
    private Long sourcePort;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private ActivateMigrationTargetInstanceResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.sourceIpAddress = builder.sourceIpAddress;
        this.sourcePort = builder.sourcePort;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateMigrationTargetInstanceResponseBody create() {
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
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * @return sourcePort
     */
    public Long getSourcePort() {
        return this.sourcePort;
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
        private String sourceIpAddress; 
        private Long sourcePort; 
        private Long taskId; 

        /**
         * The name of the destination instance.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
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
         * The private IP address that is used to connect to the self-managed PostgreSQL instance.
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * The port number that is used to connect to the self-managed PostgreSQL instance.
         */
        public Builder sourcePort(Long sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * The ID of the identification task.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public ActivateMigrationTargetInstanceResponseBody build() {
            return new ActivateMigrationTargetInstanceResponseBody(this);
        } 

    } 

}
