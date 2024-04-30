// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudMigrationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudMigrationTaskRequest</p>
 */
public class CreateCloudMigrationTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIpAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourcePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateCloudMigrationTaskRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceAccount = builder.sourceAccount;
        this.sourceCategory = builder.sourceCategory;
        this.sourceIpAddress = builder.sourceIpAddress;
        this.sourcePassword = builder.sourcePassword;
        this.sourcePort = builder.sourcePort;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudMigrationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceAccount
     */
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * @return sourceCategory
     */
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    /**
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * @return sourcePassword
     */
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    /**
     * @return sourcePort
     */
    public Long getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateCloudMigrationTaskRequest, Builder> {
        private String DBInstanceName; 
        private Long resourceOwnerId; 
        private String sourceAccount; 
        private String sourceCategory; 
        private String sourceIpAddress; 
        private String sourcePassword; 
        private Long sourcePort; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudMigrationTaskRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceAccount = request.sourceAccount;
            this.sourceCategory = request.sourceCategory;
            this.sourceIpAddress = request.sourceIpAddress;
            this.sourcePassword = request.sourcePassword;
            this.sourcePort = request.sourcePort;
            this.taskName = request.taskName;
        } 

        /**
         * The ID of the destination instance. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The username of the account that is used to connect to the self-managed PostgreSQL instance. Enter the username of the account that you created in the [Create an account for cloud migration on a self-managed PostgreSQL instance](~~369500~~) topic.
         */
        public Builder sourceAccount(String sourceAccount) {
            this.putQueryParameter("SourceAccount", sourceAccount);
            this.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * The environment in which the self-managed PostgreSQL instance runs.
         * <p>
         * 
         * *   **idcOnVpc**: The self-managed PostgreSQL instance resides in a data center. The data center can communicate with the VPC to which the ApsaraDB RDS for PostgreSQL instance belongs.
         * *   **ecsOnVpc**: The self-managed PostgreSQL instance resides on an ECS instance.
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putQueryParameter("SourceCategory", sourceCategory);
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * The private or public IP address that is used to connect to the self-managed PostgreSQL instance.
         * <p>
         * 
         * *   If the self-managed PostgreSQL instance resides on an Elastic Compute Service (ECS) instance, enter the private IP address of the ECS instance. For more information about how to obtain the private IP address of an ECS instance, see [View IP addresses](~~273914~~).
         * *   If the self-managed PostgreSQL instance resides in a data center, enter the private IP address of the data center.
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * The password of the account that is used to connect to the self-managed PostgreSQL instance. Enter the password of the account that you created in the [Create an account for cloud migration on a self-managed PostgreSQL instance](~~369500~~) topic.
         */
        public Builder sourcePassword(String sourcePassword) {
            this.putQueryParameter("SourcePassword", sourcePassword);
            this.sourcePassword = sourcePassword;
            return this;
        }

        /**
         * The port number that is used to connect to the self-managed PostgreSQL instance. You can run the `netstat -a | grep PGSQL` command to obtain the port number.
         */
        public Builder sourcePort(Long sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * The name of the task. If you do not specify this parameter, ApsaraDB RDS automatically generates a name for the cloud migration task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateCloudMigrationTaskRequest build() {
            return new CreateCloudMigrationTaskRequest(this);
        } 

    } 

}
