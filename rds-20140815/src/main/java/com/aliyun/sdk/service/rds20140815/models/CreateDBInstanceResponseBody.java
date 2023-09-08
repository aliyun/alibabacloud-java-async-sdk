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
         * The internal endpoint of the instance.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * The instance ID. If the value of the **Amount** parameter is greater than **1**, more than one instance ID is returned. The number of instance IDs that are returned is the same as the value of the Amount parameter. The returned instance IDs are separated by commas (,).
         * <p>
         * 
         * For example, if the value of the **Amount** parameter is **3**, three instance IDs are returned. Examples: `rm-uf6wjk5*****1,rm-uf6wjk5*****2,rm-uf6wjk5*****3`
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Indicates that the system performed a dry run.
         * <p>
         * 
         * *   The value is fixed as **true**.
         * *   If the system does not perform a dry run, this parameter is not returned.
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Indicates whether the request passed the dry run. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > 
         * 
         * *   If the system does not perform a dry run, this parameter is not returned.
         * 
         * *   If the request failed the dry run, an error message is returned.
         */
        public Builder dryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }

        /**
         * The message that indicates whether multiple instances are created.
         * <p>
         * 
         * > The parameter is returned only when the value of the **Amount** parameter is greater than 1.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The order ID.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The internal IP address and port number that are used to connect to the instance.
         */
        public Builder port(String port) {
            this.port = port;
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
         * Indicates whether the specified tag is added to the instance. Valid values:
         * <p>
         * 
         * *   **true**: The specified tag is added to the instance.
         * *   **false**: The specified tag fails to be added to the instance.
         * 
         * > If you do not add a tag to the instance, this parameter is not returned.
         */
        public Builder tagResult(Boolean tagResult) {
            this.tagResult = tagResult;
            return this;
        }

        /**
         * The ID of the task that is run to create multiple instances.
         * <p>
         * 
         * *   This parameter is returned only when the value of **Amount** is greater than 1.
         * *   The **TaskID** parameter cannot be used to query a task.
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
