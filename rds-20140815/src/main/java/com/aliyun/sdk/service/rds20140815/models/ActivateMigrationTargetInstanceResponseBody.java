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
         * <p>The name of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp102g323jd4****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>76364A52-E0AB-5CC8-9818-CF1DC482C092</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The private IP address that is used to connect to the self-managed PostgreSQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * <p>The port number that is used to connect to the self-managed PostgreSQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder sourcePort(Long sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * <p>The ID of the identification task.</p>
         * 
         * <strong>example:</strong>
         * <p>440913675</p>
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
