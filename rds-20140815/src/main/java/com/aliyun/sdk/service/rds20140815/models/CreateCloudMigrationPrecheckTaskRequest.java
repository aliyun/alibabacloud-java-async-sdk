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
 * {@link CreateCloudMigrationPrecheckTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudMigrationPrecheckTaskRequest</p>
 */
public class CreateCloudMigrationPrecheckTaskRequest extends Request {
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

    private CreateCloudMigrationPrecheckTaskRequest(Builder builder) {
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

    public static CreateCloudMigrationPrecheckTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCloudMigrationPrecheckTaskRequest, Builder> {
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

        private Builder(CreateCloudMigrationPrecheckTaskRequest request) {
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
         * <p>The ID of the target instance. You can invoke the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp102g323jd4****</p>
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
         * <p>The username. The database account created in the <a href="https://help.aliyun.com/document_detail/369500.html">Create a migration account</a> step.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>migratetest</p>
         */
        public Builder sourceAccount(String sourceAccount) {
            this.putQueryParameter("SourceAccount", sourceAccount);
            this.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * <p>The type of the self-managed PostgreSQL database. Valid values:</p>
         * <ul>
         * <li><strong>idcOnVpc</strong>: IDC-based self-managed PostgreSQL database (the IDC is connected to the VPC).</li>
         * <li><strong>ecsOnVpc</strong>: ECS-based self-managed PostgreSQL database on Alibaba Cloud.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsOnVpc</p>
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putQueryParameter("SourceCategory", sourceCategory);
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * <p>The internal IP address of the self-managed PostgreSQL database.</p>
         * <ul>
         * <li>For one-click migration of an ECS-based self-managed PostgreSQL database, set this parameter to the private IP address of the ECS instance. For more information about how to obtain the IP address, see <a href="https://help.aliyun.com/document_detail/273914.html">View IP addresses</a>.</li>
         * <li>For one-click migration of an IDC-based self-managed PostgreSQL database, set this parameter to the internal IP address of the IDC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.2.XX.XX</p>
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * <p>The password. The password of the database account created in the <a href="https://help.aliyun.com/document_detail/369500.html">Create a migration account</a> step.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder sourcePassword(String sourcePassword) {
            this.putQueryParameter("SourcePassword", sourcePassword);
            this.sourcePassword = sourcePassword;
            return this;
        }

        /**
         * <p>The port of the self-managed PostgreSQL database. You can run the <code>netstat -a | grep PGSQL</code> command to view the port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder sourcePort(Long sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * <p>The task name. You can specify a custom name. If you do not specify this parameter, the system automatically generates a name.</p>
         * 
         * <strong>example:</strong>
         * <p>slf7w7wj3g</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateCloudMigrationPrecheckTaskRequest build() {
            return new CreateCloudMigrationPrecheckTaskRequest(this);
        } 

    } 

}
