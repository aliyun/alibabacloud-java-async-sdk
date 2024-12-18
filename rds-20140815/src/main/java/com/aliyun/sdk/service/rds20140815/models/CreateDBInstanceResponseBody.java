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
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*****.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The instance ID. If the value of the <strong>Amount</strong> parameter is greater than <strong>1</strong>, more than one instance ID is returned. The number of instance IDs that are returned is the same as the value of the Amount parameter. The returned instance IDs are separated by commas (,).</p>
         * <p>For example, if the value of the <strong>Amount</strong> parameter is <strong>3</strong>, three instance IDs are returned. Examples: <code>rm-uf6wjk5*****1,rm-uf6wjk5*****2,rm-uf6wjk5*****3</code></p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Indicates that the system performed a dry run.</p>
         * <ul>
         * <li>The value is fixed as <strong>true</strong>.</li>
         * <li>If the system does not perform a dry run, this parameter is not returned.</li>
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
         * <p>Indicates whether the request passed the dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If the system does not perform a dry run, this parameter is not returned.</li>
         * <li>If the request failed the dry run, an error message is returned.</li>
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
         * <p>The message that indicates whether multiple instances are created.</p>
         * <blockquote>
         * <p>The parameter is returned only when the value of the <strong>Amount</strong> parameter is greater than 1.</p>
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
         * <p>1007893702*****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The internal IP address and port number that are used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the specified tag is added to the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The specified tag is added to the instance.</li>
         * <li><strong>false</strong>: The specified tag fails to be added to the instance.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not add a tag to the instance, this parameter is not returned.</p>
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
         * <p>The ID of the task that is run to create multiple instances.</p>
         * <ul>
         * <li>This parameter is returned only when the value of <strong>Amount</strong> is greater than 1.</li>
         * <li>The <strong>TaskID</strong> parameter cannot be used to query a task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>s2365879-a9d0-55af-fgae-f2*****</p>
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
