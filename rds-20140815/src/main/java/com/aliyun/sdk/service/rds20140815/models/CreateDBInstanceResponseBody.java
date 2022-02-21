// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBInstanceResponseBody</p>
 */
public class CreateDBInstanceResponseBody extends TeaModel {
    @NameInMap("ConnectionString")
    private String connectionString;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DryRun")
    private Boolean dryRun;

    @NameInMap("DryRunResult")
    private Boolean dryRunResult;

    @NameInMap("Message")
    private String message;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("Port")
    private String port;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagResult")
    private Boolean tagResult;

    @NameInMap("TaskId")
    private String taskId;

    private CreateDBInstanceResponseBody(Builder builder) {
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.dryRun = builder.dryRun;
        this.dryRunResult = builder.dryRunResult;
        this.message = builder.message;
        this.orderId = builder.orderId;
        this.port = builder.port;
        this.requestId = builder.requestId;
        this.tagResult = builder.tagResult;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dryRunResult
     */
    public Boolean getDryRunResult() {
        return this.dryRunResult;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagResult
     */
    public Boolean getTagResult() {
        return this.tagResult;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String connectionString; 
        private String DBInstanceId; 
        private Boolean dryRun; 
        private Boolean dryRunResult; 
        private String message; 
        private String orderId; 
        private String port; 
        private String requestId; 
        private Boolean tagResult; 
        private String taskId; 

        /**
         * ConnectionString.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * DryRunResult.
         */
        public Builder dryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.port = port;
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
         * TagResult.
         */
        public Builder tagResult(Boolean tagResult) {
            this.tagResult = tagResult;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateDBInstanceResponseBody build() {
            return new CreateDBInstanceResponseBody(this);
        } 

    } 

}
