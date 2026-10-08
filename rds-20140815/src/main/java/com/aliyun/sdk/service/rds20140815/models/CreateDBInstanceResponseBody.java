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
 * {@link CreateDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBInstanceResponseBody</p>
 */
public class CreateDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.NameInMap("DryRunResult")
    private Boolean dryRunResult;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagResult")
    private Boolean tagResult;

    @com.aliyun.core.annotation.NameInMap("TaskId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDBInstanceResponseBody model) {
            this.connectionString = model.connectionString;
            this.DBInstanceId = model.DBInstanceId;
            this.dryRun = model.dryRun;
            this.dryRunResult = model.dryRunResult;
            this.message = model.message;
            this.orderId = model.orderId;
            this.port = model.port;
            this.requestId = model.requestId;
            this.tagResult = model.tagResult;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The instance ID. If you set the <strong>Amount</strong> parameter to a value greater than <strong>1</strong>, the number of instance IDs that corresponds to the value is returned, separated by commas.</p>
         * <p>For example, if <strong>Amount</strong> is set to <strong>3</strong>, three instance IDs are returned. Example:
         * <code>rm-uf6wjk5*****1，rm-uf6wjk5*****2，rm-uf6wjk5*****3</code></p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Indicates that a dry run is performed before the instance is created.</p>
         * <ul>
         * <li>The return value is always <strong>true</strong>.</li>
         * <li>If no dry run is performed, this parameter is not returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Indicates whether the dry run for instance creation passed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The dry run passed.</li>
         * <li><strong>false</strong>: The dry run failed.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If no dry run is performed, this parameter is not returned.</li>
         * <li>If the dry run fails, the corresponding error is returned.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }

        /**
         * <p>The message for the batch creation task.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>Amount</strong> parameter is greater than 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Batch Create DBInstance Task Is In Process.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1007893702****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The port number that corresponds to the internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether tags are successfully bound to the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Tags are successfully bound.</li>
         * <li><strong>false</strong>: Tags failed to be bound.</li>
         * </ul>
         * <blockquote>
         * <p>If no tags are bound to the instance, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder tagResult(Boolean tagResult) {
            this.tagResult = tagResult;
            return this;
        }

        /**
         * <p>The task ID of the batch creation task.</p>
         * <ul>
         * <li>This parameter is returned only when the <strong>Amount</strong> parameter is greater than 1.</li>
         * <li>Querying tasks by <strong>TaskId</strong> is not supported at this time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>s2365879-a9d0-55af-fgae-f2****</p>
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
